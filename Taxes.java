import java.util.Scanner;
public class Taxes {

    private int status;
    private double income;
    private int amount;
    //Status
    public int single = 1;
    public int married = 2;
    //Income (Single)
    private int single_limit_1 = 8000;
    private int single_limit_2 = 32000;
    //Income (Married)
    private int married_limit_1 = 16000;
    private int married_limit_2 = 64000;
    //Single Tax (Percentage)
    private double single_tax_1 = .10;          //limit_1
    private double single_tax_2 = 800 + .15;    //limit_2
    private double single_tax_3 = 4400 + .25;   //limit_3
    //Married Tax (Percentage)
    private double married_tax_1 = .10;
    private double married_tax_2 = 1600 + .15;
    private double married_tax_3 = 8800 + .25;
    /**
     * Full Arg-Constructor
     * @param status
     * @param income
     */
    public Taxes(int status, int income) {
        this.status = status;
        this.income = income;
    }
    /**
     * No-Arg Constructor
     */
    public Taxes() {
        income = 0;
        status = 0;
    }
    /**
     * Find the income of Taxes Object
     * @return income
     */
    public double getIncome() {
        return income;
    }
    /**
     * Find the status of Taxes Object
     * @return status
     */
    public int getStatus() {
        return status;
    }
    
    public void needInfo() {
        Scanner anIncome = new Scanner(System.in);
        System.out.print("Enter Your Income:\t");
        income = anIncome.nextInt();
        Scanner aStatus = new Scanner(System.in);
        System.out.print("Enter Your Status (1 = Single , 2 = Married):\t");
        single = aStatus.nextInt();
        if(status == single) {
            if (income < single_limit_1) {
                amount = (int) single_tax_1;
            }
            else if (income > single_limit_1 && income < single_limit_2) {
                amount = (int) single_tax_2;
            } 
            else if (income > single_limit_2){
                amount = (int) single_tax_3;
            }
        } 
        else {
            if (income < married_limit_1) {
                amount = (int) married_tax_1;
            }
            else if (income > married_limit_1 && income < married_limit_2) {
                amount = (int) married_tax_2;
            } 
            else if (income > married_limit_2){
                amount = (int) married_tax_3;
            }
        }
        System.out.printf("The amount of taxes you will pay is: %5d\n", amount );
    }


    public void calculate() {

        if(status == single) {
            if (income < single_limit_1) {
                amount = (int) single_tax_1;
            }
            else if (income > single_limit_1 && income < single_limit_2) {
                amount = (int) single_tax_2;
            } 
            else if (income > single_limit_2){
                amount = (int) single_tax_3;
            }
        } 
        else {
            if (income < married_limit_1) {
                amount = (int) married_tax_1;
            }
            else if (income > married_limit_1 && income < married_limit_2) {
                amount = (int) married_tax_2;
            } 
            else if (income > married_limit_2){
                amount = (int) married_tax_3;
            }
        }
        System.out.printf("The amount of taxes you will pay is: %5d\n", amount);
    }

}
