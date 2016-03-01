package question1;

import java.util.Scanner;

public class Tuition {

	private static double init_tuition;
	private static double tuition_increase;
	private static double APR;
	private static double payment_term;
	private static double monthly_payment_term;
	private static double total_tuition;
	private static double monthly_pay;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the yearly tuition rate.");
		init_tuition = scan.nextFloat();
		
		System.out.println("Enter the yearly percentage increase for the tuition, in decimal form.");
		tuition_increase = scan.nextFloat();

		System.out.println("Enter the fixed APR rate for the student loan, in decimal form.");
		APR = scan.nextFloat();

		System.out.println("Enter the amount of years the loan must be paid off in.");
		payment_term = scan.nextInt();
	}
		public double totaltuition(){
			double year2_tuition = (tuition_increase*init_tuition)+init_tuition;
			double year3_tuition = (tuition_increase*year2_tuition)+year2_tuition;
			double total_tuition = (tuition_increase*year3_tuition)+year3_tuition;
			return total_tuition;
		}
		public double calculate_payment(){
			monthly_payment_term = payment_term*12;
			double monthly_interest = APR/12;
			total_tuition=totaltuition();
			double monthly_payment = total_tuition *
				((monthly_interest*Math.pow(1+monthly_interest, monthly_payment_term))
				/(Math.pow(1+monthly_interest, monthly_payment_term)-1));
			return monthly_payment;
		}
		public void give_info(){
			monthly_pay=calculate_payment();
			System.out.println("Your overall tuition will be $"+total_tuition);
			System.out.println("Your monthly payment will be $"+monthly_pay);
			
		}
	}

