public class Main {
    public static void main(String[] args) {

        IndexBody service = new IndexBody();
        double indexB = service.calculate (100, 1.87 );

        System.out.println(indexB);
    }
}