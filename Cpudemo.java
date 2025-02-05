class Cpu
{
    int price;
    public Cpu(int price){
        this.price=price;
    }
    public void display(){
        System.out.println("price:"+price);
    }
    class Processor{
        int no_cores;
        String manufacturer;
        public Processor(int no_cores, String manufacturer){
            this.no_cores=no_cores;
            this.manufacturer=manufacturer;
        }
        public void displayinfo(){
            System.out.println("number of cores:"+no_cores+", Manufacturer:"+manufacturer);

        }
    }
    static class RAM{
        String memory;
        String manu;
        public RAM(String memory,String manu){
            this.memory=memory;
            this.manu=manu;
    
        }
        public void disp(){
            System.out.println("memory:"+memory+",manufacturer:"+manu);
        }

    }

}
public class Cpudemo{
    public static void main(String[] arg){
        Cpu c=new Cpu(25000);
        Cpu.Processor p=c.new Processor(5,"intel");
        Cpu.RAM r=new Cpu.RAM("32GB","SAMSUNG");
        c.display();
        p.displayinfo();
        r.disp();
    }
}