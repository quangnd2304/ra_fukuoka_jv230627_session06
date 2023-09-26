package ra.regex;

import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        //Kiểm tra chuỗi String phải là 4 ký tự, bắt đầu là P, 3 ký tự sau là số
        String regex = "P[0-9]{3}";
        String str1 = "P00a";
        String str2 = "P01";
        String str3 = "P001";
        //So khớp các chuỗi str1,str2,str3 với mẫu regex
        System.out.println("So khớp str1 với mẫu regex: "+ Pattern.matches(regex,str1));
        System.out.println("So khớp str2 với mẫu regex: "+ Pattern.matches(regex,str2));
        System.out.println("So khớp str3 với mẫu regex: "+ Pattern.matches(regex,str3));
        //Viết Regex bắt buộc 2 ký tự đầu là RA
        String regex1 = "RA";
        //Viết Regex bắt buộc gồm 4 ký tự với ký tự đầu là R, ký tự cuối A, 2 ký tự giữ là bất cứ ký tự nào
        String regex2 = "R..A";
        //Viết Regex bắt buộc 2 ký tự đầu là RA hoặc HV và có thêm 3 ký tự bất kỳ
        String regex3 = "(RA|HV)...";
        //Viết Regex bắt buộc ký tự đầu là a hoặc b hoặc c, 3 ký tự sau bất kỳ
        String regex4 = "[abc]...";
        //Viết Regex bắt buộc ký tự đầu không phải là a và b và c, 3 ký tự sau bất kỳ
        String regex5 = "[^abc]...";
        //Viết Regex bắt buộc ký tự đầu trong khoảng từ a-z và từ A-Z, 3 ký tự sau bất kỳ
        String regex6 = "[a-zA-z]...";
        //Viết Regex bắt buộc ký tự đầu nằm trong khoảng a-d hoặc m-z, 3 ký tự sau bất kỳ
        String regex7 = "[a-d[m-z]]...";
        //Viết regex bắt buộc ký tự đầu nằm trong khoảng a-q và d-z, 3 ký tự sau bất kỳ
        String regex8 = "[a-q&&[d-z]]...";
        //b:false
        //e:true
        //[0-9] tương đương với [\\d]
        //[^0-9] tương đương với [\\D]
        String regex9 = "P0*";//Sau P có thể là 0, 1 hoăc nhiều ký tự 0
        //"P":true
        //"P0":true
        //"P00000000":true
        String regex10 = "P0+";//Sau P có thể có 1 hoặc nhiều ký tự 0
        String regex11 = "P0?";//Sau P có thể có 0 hoặc 1 ký tự 0
        String regex12 = "P{3}";//Có 3 ký tự P
        String regex13 = "P{3,}";//Có ít nhất 3 ký tự P
        String regex14 = "P{3,5}";//Có từ 3 đến 5 ký tự P

    }
}
