class Loan{
    int rate;
    Loan(){
        System.out.println("Hii, I'm default Constructor of Loan");
    }
    Loan(int rate){
        this.rate = rate;
    }
    void printRate(){
        System.out.println(this.rate);
    }
}

class CarLoan extends Loan{
    int rate;

    CarLoan(){
        System.out.println("Hii, I'm default Constructor of CarLoan");
        System.out.println(super.rate);//using super to access instance variable of parent class.
    }
    CarLoan(int rate){
        super(7);// to invoke the constructor of parent class (must be 1st line of child constructor.)
        this .rate = rate;
    }
    void printRate(){
        System.out.println(this.rate);
        super.printRate();// using super to invoke method of the parent class.
        System.out.println(super.rate);
    }
}
public class SuperStudy{
    public static void main(String[] args) {
       // CarLoan c2 = new CarLoan();
       CarLoan c1 = new CarLoan(8);
        c1.printRate();
        
    }
}