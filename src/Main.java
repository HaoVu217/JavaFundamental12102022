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
//        }

    }
}