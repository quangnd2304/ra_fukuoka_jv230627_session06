package ra.string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //1. Khởi tạo chuỗi StringBuilder
        StringBuilder sb = new StringBuilder("Rikkei Academy");
        System.out.println("Nối chuỗi: "+sb.append(" - Học viện CNTT"));
        System.out.println("Chèn thêm chuỗi: "+sb.insert(0,"RA - "));
        System.out.println("Xóa chuỗi: "+sb.delete(2,11));
        System.out.println("Đảo ngược chuôi: "+sb.reverse());
        System.out.println("Chuyển từ StringBuilder sang String: "+sb.toString());
    }
}
