//조건문을 통한 버전 업그레이드
package myProject;

class Accounting{
	public double valueOfSupply ;//전역변수
	public double vatRate ;
	public double expenseRate ;
	
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDividend1());
        System.out.println("Dividend 2 : " + getDividend2());
        System.out.println("Dividend 3 : " + getDividend3());
	}
	

		public double getDividend3() {
			if(getIncome()>11000.0) {
				
			return getIncome() * 0.2;
			}else {
				
			return getIncome() * 0;
			
			}
		}
		
		public double getDividend2() {
			if(getIncome()>11000.0) {
				
			return getIncome() * 0.3;
			}else {
				
			return getIncome() * 0;
			
			}
		}
		public double getDividend1() {
			if(getIncome()>11000.0) {
				
			return getIncome() * 0.3;
			}else {
				
			return getIncome() * 1.0;
			
			}
		}

	

	
	


	public double getIncome() {
		double income = valueOfSupply - getExpense();
		return income;
	}

	public double getExpense() {
		double expense = valueOfSupply * expenseRate;
		return expense;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	 public double getVAT() {
			return valueOfSupply * vatRate;
		}
}




public class AccountingMethodApp {
	     
	    public static void main(String[] args) {
	        // instance 
	        Accounting a1 = new Accounting();
	        a1.valueOfSupply = 10000.0;
	        a1.vatRate = 0.1;
	        a1.expenseRate = 0.3;
	        a1.print();
	         
	        Accounting a2 = new Accounting();
	        a2.valueOfSupply = 20000.0;
	        a2.vatRate = 0.05;
	        a2.expenseRate = 0.2;
	        a2.print();
	         
	        a1.print();
	    }
	}
