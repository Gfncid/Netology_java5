public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int miles1 = service.calculate(10000);
        System.out.println(miles1);

        int miles2 = service.calculate(500);
        System.out.println(miles2);

        int miles3 = service.calculate(1000);
        System.out.println(miles3);

        int miles4 = service.calculate(25000);
        System.out.println(miles4);
    }
}