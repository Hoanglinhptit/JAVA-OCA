public class Main {
    public static void main(String[] args) {
        Access_Example obj = new Access_Example();
        System.out.println("Bien protectedKey" + obj.protectedKey);
        // bien protect co the truy cap bang
        System.out.println("--- thong qua method---");
        obj.access();
    }
}
