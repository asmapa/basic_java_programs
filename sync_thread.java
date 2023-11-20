
 class callme {
    synchronized void display(String msg) {
        System.out.println("[" + msg);

        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println("problem !!!");
        }

        System.out.println("]");
    }
}

 class caller implements Runnable {
    callme target;
    String msg;
    Thread t;

    public caller(callme t, String msg) {
        target = t;
        this.msg = msg;
        // Use this.t to refer to the instance variable t
        this.t = new Thread(this);
        this.t.start();
    }

    public void run() {
        target.display(msg);
    }
}

public class sync_thread {
    public static void main(String[] args) {
        callme tr = new callme();
        caller t1 = new caller(tr, "message1");
        caller t2 = new caller(tr, "message2");
        caller t3 = new caller(tr, "message3");
    }
}
