import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        // 1: Kiểu dữ liệu
        // - Nguyên thủy (Primitive)
        //   -Ex: char, int, long, float, double, boolean,..
        // - Đối tượng (Object)
        //   -Ex: String, Integer, Long, Float, Double, Boolean

        // 2: Khai báo biến
//        char world = 'a'; // char: Kí tự.
//        int number1 = -1; // int: Số nguyên
//        float number2 = 1.2f; // float: Kiểu thập phân, thêm chữ f để xác định.
//        boolean isOnline = true; // boolean: Chỉ có 2 giá trị True/False

        // Tên, tuổi, sở thích, chiều cao.

//        String name = "Hào Kiệt";
//        int age = 27;
//        String hobby = "Nghe nhac";
//        Float height = 1.7f;
//
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(hobby);
//        System.out.println(height);

        // 3: Toán tử

//        int a = 10;
//        int b = 5;
//        int result = b % a;
//        // Chia lấy quần nguyên / , chia lấy cả phần thập phân % , lấy tất cả => ép kiểu
//
//        System.out.println(result);

//        int a = 10;
//        a = a + 1; // tăng a lên 1 giá trị
//       a += 1;
//        a++;
//        ++a;
//
//        int b = a++;
//        // a++ (gán giá trị , sau đó tăng 1 đơn vị)
//        // ++a (tăng 1 đơn vị , sau đó gán giá trị
//
//        System.out.println(b);

//        int a = 5;
//        int b = 5;
//        int result = a++ - --b + b-- + a-- - a++ + b++ - b--;
//
//        // 5 - --b + b-- + a-- - a++ + b++ - b-- / a = 6 ,b = 5
//        // 5 - 4 + b-- + a-- - a++ + b++ - b-- / a = 6 ,b = 4
//        // 5 - 4 + 4 + a-- - a++ + b++ - b-- / a = 6 ,b = 3
//        // 5 - 4 + 4 + 6 - a++ + b++ - b-- / a = 5 ,b = 3
//        // 5 - 4 + 4 + 6 - 5 + b++ - b-- / a = 6 ,b = 3
//        // 5 - 4 + 4 + 6 - 5 + 3 - b-- / a = 6 ,b = 4
//        // 5 - 4 + 4 + 6 - 5 + 3 - 4 / a = 6 ,b = 3
//        // result = 5
//
//        //rule
//        // a = 6, b = 3, result = 5;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(result);

        // 4: Câu điều kiện if
        // (note: ngoặc () dùng để nhận vào biểu thức vd: xử lý -> kết quả, kể cả true / false, kiểu boolean
        // ngoặc {} dùng để định nghĩa cho một phạm vi -> 1 câu lệnh chạy trong phạm vị nào. {} gọi là scope: phạm vi


//        if () {
//
//        } else if () {
//
//        } else {
//
//        }

        // Bài tập tính năm nhuần.

//        int year = 392;
//        // Tính xem năm trên phải là năm nhuần hay không
//        // Xuất ra thông báo.
//
//        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0)
//        {
//            System.out.println("Là năm nhuần");
//        } else {
//            System.out.println("Không là năm nhuần");
//        }
        // dấu && là và, dấu || là hoặc

        // Bài tập tính chỉ số BMI

        //. Tính chỉ số bmi và đưa ra kết luận cơ thể
        // Công thức tính bmi = cân nặng(kg) / ( chiều cao(m) * chiều cao(m) )

        // (Toán tử so sánh)

//        int a = 5;
//        int b = 10;
//
//        if (a < b || a == b); // Cách 1
//        if (a <= b); // Cách 2
//
//        if (a != b); // Trường hợp a không bằng b (phủ định , dấu ! nằm trước dấu = : !=)

//        float cannang = 50;
//        float chieucao = 1.7f;
//        float bmi = cannang / (chieucao * chieucao);
//
//        String KetQua = "";
//        if (bmi < 18.5) {
//            KetQua = "Gầy";
//        } else if (bmi <= 24.9) {
//            KetQua = "Bình thường";
//        } else if (bmi <= 29.9) {
//            KetQua = "Hơi Béo";
//        } else if (bmi <= 34.9) {
//            KetQua = "Béo phì cấp độ 1";
//        } else if (bmi <= 39.9) {
//            KetQua = "Béo phì cấp độ 2";
//        } else if (bmi > 40) {
//            KetQua = "Béo phì cấp độ 3";
//        }
//        System.out.println("Chỉ số bmi của bạn: " + bmi);
//        System.out.println(KetQua);

        // Bài tập If else Học sinh

        // Một trong 3 môn toán lý hóa trên 8 và không có môn nào dưới 6.5 => Giỏi
        // Một trong 3 môn toán lý hóa trên 6.5 và không có môn nào dưới 5 => Khá
        // Một trong 3 môn toán lý hóa trên 5 và không có môn nào dưới 3.5 => Trung bình
        // Một trong 3 môn toán lý hóa trên 3.5 và không có môn nào dưới 6.5 => Kém

//        float toan = 9;
//        float ly = 3.5f;
//        float hoa = 7f;
//
//        String KetQua = "";
//
//        if (toan >= 8 || ly >= 8 || hoa >= 8 && (toan+ly+hoa >= 6.5)) {
//            KetQua = "Giỏi";
//        } else if (toan >= 6.5 || ly >= 6.5 || hoa >= 6.5 && (toan+ly+hoa >= 5)) {
//            KetQua = "Khá";
//        } else if (toan >= 5 || ly >= 5 || hoa >= 5 && (toan+ly+hoa >= 3.5)) {
//            KetQua = "Trung bình";
//        } else if (toan < 3.5 || ly < 3.5 || hoa < 3.5) {
//            KetQua = "Kém";
//        }
//        System.out.println("Bạn xếp loại: " +KetQua);
//        System.out.println(KetQua);

        // 5: Câu điều kiện " Switch Case"
        // Cũng là biểu thức, nhưng khác với kiểu boolean, dùng để kiểm tra các miền giá trị cụ thể
        // Break dùng cho trường hợp thoát khỏi switch case, vòng lặp.
//        int month = 5;
//
//        switch (month){
//            case 5:
//                System.out.println("Quý 1");
//                break;
//            case 2:
//                System.out.println("Quý 2");
//                break;
//        default:
//            System.out.println("Không rơi vào trường hợp trên");

        // 6: Vòng lặp for, > Duyệt dữ liệu để xử lý
        // tìm kiếm, kiểm tra, sắp xếp.
        // i: viết tắt chữ index
        // Có 3 biểu thức trong for là int biểu thức 1,2,3.

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        // Bài tập for
        // Cho vòng lặp chạy từ 1 -> 100
        // Chỉ in ra số chẵn

        // Cách 1:
//        for (int i = 0; i <= 100; i += 2) {   // Có thể dùng i = 2 | Biểu thức i += 2 là chia hết cho 2
//            System.out.println(i);
//        }
        // Cách 2:

//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {   // i chia hết cho 2.
//                System.out.println(i);
//            }
//        }

        // Bài tập 2:
        // Vòng lặp 100 --> 1
        // In ra số chia hết cho 3.

//        for (int i = 100; i >= 1; i--) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

        // Bài tập 3: Harder lol =))
        // Cho số ngẫu nhiên
        // Kiểm tra số đó có phải là số nguyên tố hay không

//        int number = 7;
//
//        if (number < 2) {
//            System.out.println("Không phải là số nguyên tố");
//        } else {
//            for (int i = 2; i < number; i++) {
//                if (number % i == 0) {
//                    System.out.println("Không phải là số nguyên tố");
//                    return; // Dùng cho việc dừng lại.
//                }
//            }
//            System.out.println("Số " + number + " là số nguyên tố");
//        }

        // 7: Vòng lặp while: Cũng dùng để duyệt.
        // ex:
//        0 ~ 1
//        int numberRandom = Math.random()

        // dowhile

//        long numberRandom = Math.round((Math.random() * 100) + 1);
//
//        while (numberRandom >= 1) {
//            System.out.println(numberRandom);
//            numberRandom--;
//        }


        // 8: Hướng đối tượng (Object)
//        5 nguyên tắc về hướng đối tượng: Solic
//                1: Singgle resonsibility principle
//                (tránh cồng kềnh, không nên dồn hết vào 1 nơi.)

//                2: Open/Close principle
//                (khi nâng cấp, kế thùa và tạo lớp logic mới), mở rộng một class nhưng không sửa đổi bên trong class đó.

//                3: Liskov
//                (nâng cấp nhưng không được vi phạm tính chất ban đầu của class), ví dụ: manager, staff,...

//                4: Interface Segregation Principle
//                (tạo một component chung để sử dụng khi các module lặp đi lặp lại nhiều lần.

//                5: Denpendence Inversion Principle
//                (nên có một trung gian để xử lý, không nên phụ thuộc trực tiếp

         // Object : Đại diện cho một đối tượng cụ thể
         // Class : Đại diện cho một lớp đối tượng tập thể
        // viewmodel => design pattern

        // Ex:

        // Kiểu dữ liệu Animal (Object) - new: từ khóa khai báo vùng nhớ, Animal() : phương thức khởi tạo
        Animal meo = new Animal("Milu", "0.1m" , "2kg");
        Animal meo1 = new Animal( "Aka", "0.12m", "3kg");

        meo1.showInfo();

//        // Giống về kiểu dữ liệu (Animal), khác nhau về vùng nhớ
//        System.out.println(meo.name);
//        System.out.println(meo1);

        //null : không có vùng nhớ, ko tạo ra nơi chứa dữ liệu.
        // Kiểu nguyên thủy không có giá trị null, không được phép = null , chỉ có kiểu đối tượng (Object) mới được phép = null
        // null là không có vòng nhớ, còn rỗng là có vùng nhớ nhưng không có giá trị.

        //uml : đồ thị - biểu đồ để phân tích.

//        int a = 5;
//        int b = 10;
        // Tham trị -> truyền phần giá trị (kiểu nguyên thủy)
        // Tham chiếu -> truyền vùng nhớ (Kiểu Object - đối tượng)


        //Access Modifier (phạm vi đóng gói): Dùng cho việc chỉ định, phạm vi truy cập các biến, lớp, phương thức.

        // Tính đóng gói
        // Thể hiện việc 1 đô tượng khi có nhiều người sử dụng, không nên cho biết quá nhiều về thuộc tính, nên cung cấp chức năng.

        // Tính kế thừa
        // Dùng cho việc nâng cấp, ver 1.1 -> ver 1.2, nâng cấp -> sự thay đổi khác nhau. Dựa trên 1 sườn -> nâng cấp thành bản mới. Không nên nâng cấp trên 1 nơi cũ.

        // Tính đa hình
        // Khi dùng một phương thức, nhưng cách sử dụng khác nhau.

        // Tính trừu tượng

        // Từ khóa:
        // Public (phạm vi lớn nhất)
        // Private (phạm vi nhỏ nhất)

        // extends : từ khóa kế thừa. Class kế thừa với class
        // alt + enter: sửa lỗi.

    }
}