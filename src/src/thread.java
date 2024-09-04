class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        int i=34;
        while (true) {
            System.out.println(" Thank you " + this.getName());
        }
    }
}

public class thread {
    public static void main(String args[]){
        Mythr1 t1=new Mythr1("Kundan");
        Mythr1 t2=new Mythr1("Rathore");
        Mythr1 t3=new Mythr1("Anchlika");
        Mythr1 t4=new Mythr1("Bhaudoria");
        Mythr1 t5=new Mythr1("Gwalior is the best city");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
