import java.io.*;

class SD {
    String sentence;
    boolean sent_gen = false;

    public synchronized void setSentence(String s) {
        sentence = s;
        sent_gen = true;
        notify();
    }

    public synchronized String getSentence() {
        while (!sent_gen) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        sent_gen = false;
        return sentence;
    }
}

class write_file extends Thread {
    SD sd;
    String line;

    public write_file(SD sd) {
        this.sd = sd;
    }

    public void run() {
        while (true) {
            synchronized (sd) {
                while (!sd.sent_gen) {
                    try {
                        sd.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try (FileWriter f = new FileWriter("output.txt", true)) { // Append to the file
                    f.write(line + "\n");
                    System.out.println("Writing to file: " + line);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                sd.notify();
            }
        }
    }
}

class Read_file extends Thread {
    SD sd;
    String inputFile;
    String sen;

    public Read_file(SD sd, String in) {
        this.sd = sd;
        inputFile = in;
    }

    public void run() {
        while (true) {
            String sent[] = Readinput(inputFile);
            for (int i = 0; i < sent.length; i++) {
                sen = sent[i];
                synchronized (sd) {
                    while (sd.sent_gen) {
                        try {
                            sd.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    sd.setSentence(sen);
                }
            }
        }
    }

    public String[] Readinput(String input) {
        try (BufferedReader bf = new BufferedReader(new FileReader(input))) {
            return bf.lines().toArray(String[]::new);
        } catch (Exception e) {
            e.printStackTrace();
            return new String[0];
        }
    }
}

public class file_handling_thread {
    public static void main(String[] args) {
        String input = "file2.txt";
        SD sd = new SD();
        write_file w = new write_file(sd);
        Read_file r = new Read_file(sd, input);

        w.start();
        r.start();

        try {
            w.join();
            r.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
