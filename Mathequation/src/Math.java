public class Math {
    double leftval;
    double rightval;
    char operator;
    double result;

    private static Math create(double a,double b, char c){
        Math equation = new Math();
        equation.leftval=a;
        equation.rightval=b;
        equation.operator =c;

        return equation;
    }
     void execute(){
         switch(operator){
             case 'a':
                result=  leftval+rightval;
                break;
             case 's':
                 result=  leftval-rightval;
                 break;
             case 'm':
                 result=  leftval*rightval;
                 break;
             case 'd':
                 result=  rightval!=0? leftval/rightval: 0.0d;
                 break;
             default:
                 System.out.println("Please enter valid opcode");
         }
     }
}
