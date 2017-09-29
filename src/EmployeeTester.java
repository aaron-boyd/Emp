/*
 * Name: Aaron Boyd
 * Date: August 31, 2016
 * Title: Employee Tester
 * Summary: Using multiple classes to find pay roll
 */

public class EmployeeTester {
	
	public static int current = 0;
	public static int empcount = 3;
	public static PayRoll Roll = new PayRoll();
	public static GUI myGUI = new GUI();
	
	
	public static void main(String[] args) {
	
		for( int i = 0; i<4; i++){
			EmployeeTester.Roll.calcGross(i);
			Roll.calcTaxes(i);
			Roll.calcNetPay(i);
		}
		
		myGUI.empinfo.setText(Roll.getEmployee(0).toString() + Roll.PayStubString(0));
		
		
	}
	
	public int click(int dir){
		current += dir;
		if(current == 5){
			current = 0;
		}else if(current == -1){
			current = 4;
		}
		return(current);
	}
		
	}
	
