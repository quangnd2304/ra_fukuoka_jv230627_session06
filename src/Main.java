public class Main {
    public static void main(String[] args) {
        int b = 20;
        //1. Khởi tạo chuỗi
        //- Cách 1: literal
        String str1 = "Rikkei Academy";
        //- Cách 2: Constructor của lớp String("value")
        String str2 = new String("Học viện Rikkei");
        //Thay đổi giá trị của str1
        str1 = "Rikkei";
        String str3 = "Rikkei Academy";

        int number = 15;
        hello(15);
        System.out.println("Giá trị number sau khi gọi hello: "+number);
        int[] arrInt = {3,5,7};
        printArray(arrInt);
        System.out.println("Giá trị phần tử chỉ số 0 sau khi gọi printArray: "+arrInt[0]);
    }

    public static void hello(int number){
        int a = 10;
        number++;
    }

    public static void printArray(int[] arrInt){
        arrInt[0]++;
    }
}