package controlFlowStatement.loop;

public class LabelBreak {
    public static void main(String[] args) {
        label:
        for (int i = 1; i <=5; i++) {
            System.out.println("Case i =" +i);
            for(int j=1;j<=2;j++){
                if(j==2){
                    break label;
                }
                System.out.println("Case j =" +j);
            }
        }
    }
}
