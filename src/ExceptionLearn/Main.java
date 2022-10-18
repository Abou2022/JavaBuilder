package ExceptionLearn;

public class Main {
    public static void main(String[] args) {
        OddCalculator calc = new OddCalculator();

        try {
//            int sum = calc.sumOddNumbers(1, 3);
            int sum = calc.sumDifferentOddNumbers(3,3);
            System.out.println(sum);
        } catch (EvenNumberException e){
            e.printStackTrace();
        }catch (DuplicateInputException e){
            e.printStackTrace();
        }
    }
}
