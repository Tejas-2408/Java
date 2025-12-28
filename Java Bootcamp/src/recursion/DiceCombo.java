package recursion;

public class DiceCombo {
    public static void main(String[] args) {
        diceCombinations("",4);
    }

    static void diceCombinations(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <=6 && i <= target ; i++){
            diceCombinations(p+i,target-i);
        }
    }
}
