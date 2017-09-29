import java.text.DecimalFormat;

public class PayRoll  {
	
	private Employee myarrEmps[];
	
	public PayRoll(){
		myarrEmps = new Employee[11];
	
		myarrEmps[0] = new Employee("Aaron", "Boyd", "6793 Spring Arbor Drive", "Mason", "Ohio", 17, 601874, 35.67, 12.12, 3);
		myarrEmps[1] = new Employee("Stephen", "Davis", "1234 Maple Street", "Savannah", "Georgia", 18, 123456, 25.67, 9.00, 1);
		myarrEmps[2] = new Employee("Abbey", "Wilson", "4531 Conifer Drive", "St. Paul", "Minnesota", 18, 704311, 15.32, 10.12, 2);
		myarrEmps[3] = new Employee("Greg", "Kummer", "6543 Oak Street", "Juno", "Alaska", 40, 523765, 40.65, 12.30, 2);
		
		for(int i = 4; i<11; i++){
			myarrEmps[i] = new Employee();
			
		}
		
	}
	
	public PayRoll(Employee arrEmps[]){
		myarrEmps = arrEmps;
	}
	
	public Employee getEmployee(int num){
		return myarrEmps[num];
	}
	
	public double calcGross(int num){
		myarrEmps[num].setGross(myarrEmps[num].getHours() * myarrEmps[num].getWage() * 52);
		return(myarrEmps[num].getGross());
	}
	
	public void calcTaxes(int num){
		if(myarrEmps[num].getGross() > 18000){
			myarrEmps[num].setCityTaxes(myarrEmps[num].getGross() * 0.03);
			myarrEmps[num].setStateTaxes(myarrEmps[num].getGross() * 0.06);
			myarrEmps[num].setFederalTaxes(myarrEmps[num].getGross() * 0.12);
			myarrEmps[num].setSS(myarrEmps[num].getGross() * 0.04);
		}else if(myarrEmps[num].getGross() > 12000){
			myarrEmps[num].setCityTaxes(myarrEmps[num].getGross() * 0.02);
			myarrEmps[num].setStateTaxes(myarrEmps[num].getGross() * 0.04);
			myarrEmps[num].setFederalTaxes(myarrEmps[num].getGross() * 0.10);
			myarrEmps[num].setSS(myarrEmps[num].getGross() * 0.035);
		}else if(myarrEmps[num].getGross() > 6000){
			myarrEmps[num].setCityTaxes(myarrEmps[num].getGross() * 0.01);
			myarrEmps[num].setStateTaxes(myarrEmps[num].getGross() * 0.02);
			myarrEmps[num].setFederalTaxes(myarrEmps[num].getGross() * 0.08);
			myarrEmps[num].setSS(myarrEmps[num].getGross() * 0.03);
		}
		if(myarrEmps[num].getDep() >= 3){
			myarrEmps[num].setDeducts(myarrEmps[num].getGross() * .01);
		}else if(myarrEmps[num].getDep() == 2){
			myarrEmps[num].setDeducts(myarrEmps[num].getGross() * .005);
		}else{
			myarrEmps[num].setDeducts(0);
		}
	}
	
	
	public void calcNetPay(int num){
		myarrEmps[num].setNetPay(myarrEmps[num].getGross() - (myarrEmps[num].getCityTaxes() + myarrEmps[num].getStateTaxes() + myarrEmps[num].getFederalTaxes() + myarrEmps[num].getSS()) + myarrEmps[num].getDeduct());
	}
	
	public String PayStubString(int num){
		DecimalFormat round = new DecimalFormat("####0.00");
		return("------------------------------------------------------------\nPay Stub\n\n" + "Gross pay: $" + round.format(myarrEmps[num].getGross()) + "\nCity Taxes: $" + round.format(myarrEmps[num].getCityTaxes()) + "\nState Taxes: $" + round.format(myarrEmps[num].getStateTaxes()) + "\nFederal Taxes: $" + round.format(myarrEmps[num].getFederalTaxes()) + "\nSocial Security: $" + round.format(myarrEmps[num].getSS()) +"\nDeductions: ($"+ round.format(myarrEmps[num].getDeduct())+ ")" +  "\nNet Pay: $" + round.format(myarrEmps[num].getNetPay()) + "\n------------------------------------------------------------\n" + "Pay to the order of: " + EmployeeTester.Roll.myarrEmps[num].getFirst() + " " + EmployeeTester.Roll.myarrEmps[num].getLast() + "      $" + round.format(EmployeeTester.Roll.myarrEmps[num].getNetPay()/52) + "\n\n                                           Mason City Schools");
	}
}
	
