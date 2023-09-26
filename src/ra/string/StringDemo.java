package ra.string;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Rikkei";
        String str2 = " Academy";
        System.out.println("Nối 2 chuỗi: " + str1.concat(str2));
        System.out.println("Ký tự có chỉ số 2 trong chuỗi str1: " + str1.charAt(2));
        String str3 = "       Học viện Rikkei            ";
        System.out.println("Cắt khoảng trắng 2 đầu chuôi str3: " + str3.trim());
        String str4 = "Rikkei-Academy-đào-tạo-lập-trình-viên";
        String[] arrStr = str4.split("-");
        for (String element : arrStr) {
            System.out.println(element);
        }
        System.out.println("Độ dài chuỗi str1 là: " + str1.length());
        String str5 = "Rikkei Academy";
        System.out.println("Cắt chuỗi từ vị trí 0 đến vị trí 6: " + str5.substring(0, 6));
        System.out.println("Cắt chuỗi từ vị trí 7 đến cuỗi: " + str5.substring(7));
        System.out.println("Viết thường chuỗi str1: "+str1.toLowerCase());
        System.out.println("Viết hoa chuỗi str1: "+str1.toUpperCase());
        String str6 = "Rikkei";
        String str7 = "Rikkei";
        String str8 = "Rikke";
        String str9 = "RikkeI";
        System.out.println("So sánh 2 chuỗi str6 và str7 với equals: " + str6.equals(str7));
        System.out.println("So sánh 2 chuỗi str6 và str8 với equals: " + str6.equals(str8));
        System.out.println("So sánh 2 chuỗi str6 và str9 với equals: " + str6.equals(str9));
        System.out.println("So sánh 2 chuỗi str6 và str9 với equalsIgnoreCase: " + str6.equalsIgnoreCase(str9));
        System.out.println("Kiểm tra chuỗi str6 có trong str5 không: "+str5.contains(str6));
        String str10 = "ABED";
        String str11 = "ABCD";
        System.out.println("So sánh 2 chuỗi str10 và str10 với compareTo: "+str10.compareTo(str11));
        System.out.println("Kiểm tra chuỗi str5 có bắt đầu là chuỗi str6 không: "+str5.startsWith(str6));
        String str12 = "Academy";
        System.out.println("Kiểm tra chuỗi str5 có kết thúc là chuỗi str12 không: "+str5.endsWith(str12));

    }
}
