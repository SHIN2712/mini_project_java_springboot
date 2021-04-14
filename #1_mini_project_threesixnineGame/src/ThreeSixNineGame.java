public class ThreeSixNineGame {

    public static void main(String[] args) {
//    	int i = 1;
        for (int i = 1; i <= 100; i++) { // TODO i가 1부터 100까지 반복되어야합니다.
            int secondNumber = 0; // TODO 1의 자리 숫자를 나타냅니다
            int firstNumber = 0;  // TODO 10의 자리 숫자를 나타냅니다.

            boolean is306090 = false; // TODO 숫자의 10의 자리수가 3, 6, 9 에 해당 되는지 확인해주세요
            boolean is369 = false;  // TODO 숫자의 1의 자리수가 3, 6, 9 에 해당 되는지 확인해주세요

            // TODO 숫자가 33, 36, 39, 63, 66, 69, 93, 96, 99에 해당되는 경우 '**'이 출력됩니다. System.out.println("**")
            // TODO 숫자에 3, 6, 9가 한번 포함되는 경우 '*'이 출력됩니다. System.out.println("*")
            // 숫자에 3, 6, 9 가 들어가지 않을 경우 숫자가 출력됩니다.
            
            secondNumber = i%10;
            firstNumber = i/10;
            
            if(secondNumber == 3 || secondNumber == 6 || secondNumber == 9) {
            	is369 = true;
            }
            if(firstNumber == 3 || firstNumber == 6 || firstNumber == 9) {
            	is306090 = true;
            }
            
            
            if(is369 && is306090) {
            	System.out.println("**");
            }
            else if(is369 || is306090) {
            	System.out.println("*");
            }
            else {            
            	System.out.println(i);
            }
//        	i ++; // 숫자를 1 증가시킴
        	
        }
    }
}
