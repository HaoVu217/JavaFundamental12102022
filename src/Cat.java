public class Cat extends Animal{
    private String color;

    public Cat(String name, String height, String weight, String color) {
        super(name, height, weight);
        this.color = color;
    }

    @Override //override: phương thưc ghi đè.
    public void showInfo() { // Thể hiện tính đa hình.
        super.showInfo();
    }
}
// extends : từ khóa kế thừa. Class kế thừa với class
// alt + enter: sửa lỗi.
// super chính là Animal, là phương thức khởi tạo của Animal.