package lionlike.java10m.practice.day1011.programmers;

public class SumOfDigit {
    public int solution(int n){
        String str = String.valueOf(n);
        int result = 0;
        for(int i =0; i<str.length(); i++){
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return result;
    }

    public int solution1(int n){
        int result = 0;
        while (n!=0){
            result += n % 10;
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        // 123  = 1 + 2 + 3  = 6
        SumOfDigit sod = new SumOfDigit();
//        int result1 = sod.solution(1234);
        int result1 = sod.solution1(1234);

        if (result1 == 10) {
            System.out.println("테스트를 통과 했습니다.");
        } else {
            System.out.printf("테스트 실패 result:%d \n", result1);
        }



    }
}
