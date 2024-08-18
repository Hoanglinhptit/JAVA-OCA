public class Access_Example {
    public String publicKey = "day la bien public";
    // bien public co the truy cap toan project
    private String privateKey = "day la bien private";
   // Truy cập biến và phương thức private từ bên trong lớp, de cac lop khac su dung phai truy cap theo phuong thuc public
    protected String protectedKey = " day la bien protect";
    // Truy cập từ cùng gói hoặc lớp con (có thể khác gói).
    String defaultKey = "day la bien default";
    // Truy cập từ các lớp trong cùng một gói.

    public void access() {
        // Truy cập biến và phương thức private từ bên trong lớp
        System.out.println(this.privateKey);
        System.out.println(this.protectedKey);
        System.out.println(this.defaultKey);
    }
}
