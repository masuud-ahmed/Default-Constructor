public class Main {
    public static void main(String[] args)
    {
        Circle defaultc = new Circle();
        Circle customc = new Circle(7.5);


        //calculatig ad displayig
        System.out.println("default");
        System.out.println("radius"+defaultc.getRadius());
        System.out.println("radius"+defaultc.calculatethearea());
        System.out.println("area"+defaultc.calculateCircmistance());
        //c2

        System.out.println("customc");
        System.out.println("radius"+customc.getRadius());
        System.out.println("radius"+customc.calculatethearea());
        System.out.println("area"+customc.calculateCircmistance());
    }
}