class SD{

    int num=1;
    int limit=10;
    boolean isEven=false;


}

class even extends Thread{
    SD sd;
    public even(SD sd)
    {
        this.sd=sd;
    }
    public void run()
    {
        while(sd.num < sd.limit)
        {
            synchronized(sd){

                if(sd.num % 2 ==0)
                {
                    sd.isEven=true;
                }
                while(!sd.isEven)
                {
                    try{
                            sd.wait();

                    }catch(Exception e){

                    }
                }
                System.out.println(sd.num);
                sd.num ++;
                sd.isEven=false;
            }
        }
    }
}

class odd extends Thread{
    SD sd;
    public odd(SD sd)
    {
        this.sd=sd;
    }
    public void run()
    {
        while(sd.num < sd.limit)
        {
            synchronized(sd){

                if(sd.num % 2 ==1)
                {
                    sd.isEven=false;
                }
                while(sd.isEven)
                {
                    try{
                            sd.wait();

                    }catch(Exception e){

                    }
                }
                System.out.println(sd.num);
                sd.num ++;
                //sd.isEven=false;
            }
        }
    }
}

class sync_thread_2{

    public static void main(String[] args)
    {

    SD sd=new SD();
    even e=new even(sd);
    odd o=new odd(sd);

    e.start();
    o.start();

    try{
        o.join();
        e.join();
    }catch(Exception ex){}
    }

}