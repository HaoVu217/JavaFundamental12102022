public class Animal {
    // Chữ cái đầu tiên luôn luôn viết in hoa với kiểu đối tượng, dùng kiểu Pascalcase
    // Nguyên thủy : cách viết camelCase

    // 1: Tính chất (thuộc tính) - Prosperties -> Props
    // (Thông tin lưu trữ dùng để xử lý thông tin cho đối tượng)
    private String name;
    private String height;
    private String weight;

    //      2: Phương thức khởi tạo.
    public Animal(String name, String height, String weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        // Tìm hiểu về từ khóa "this" , "constructor" là gì
        // từ khóa "this": Dùng để trỏ tới thuộc tính của Animal

    }

    // getter
    public String getName () {  // phạm vi hoạt động, giá trị, tên phương thức
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //alt + insert / chuột phải

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void  showInfo() {
        String textName = "name: " + name;
        String textHeight = "height: " + height;
        String textWeight = "weight: " + weight;
        System.out.println("Animal\n" + textName + "\n" + textHeight + "\n" + textWeight); // \n : xuống dòng.
    }


}
