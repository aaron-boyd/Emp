
public class Employee {
	private String myfirst, mylast, myaddress, mycity, mystate;
	private int myage, myid, mydep;
	private double myhours, mywage,mygross, mycitytaxes, mystatetaxes, myfederaltaxes, mynetpay, mydeduct, mySS;
	
	public Employee(){
		myfirst = "";
		mylast = "";
		myaddress = "";
		mycity = "";
		mystate = "";
		myage = 0;
		myid = 0;
		myhours = 0.0;
		mywage = 0.0;
		mygross = 0.0;
		mydep = 0;
	}
	
	public Employee(String first, String last, String address, String city, String state, int age, int id, double hours, double wage, int dep){
		myfirst = first;
		mylast = last;
		myaddress = address;
		mycity = city;
		mystate = state;
		myage = age;
		myid = id;
		myhours = hours;
		mywage = wage;
		mygross = 0.0;
		mydep = dep;
		
	}
	
	public Employee setFirst(String first){
		myfirst = first;
		return this;
	}
	public Employee setLast(String last){
		mylast = last;
		return this;
	}
	public Employee setAddress(String address){
		myaddress = address;
		return this;
	}
	public Employee setCity(String city){
		mycity = city;
		return this;
	}
	public Employee setState(String state){
		mystate = state;
		return this;
	}
	public Employee setAge(int age){
		myage = age;
		return this;
	}
	public Employee setId(int id){
		myid = id;
		return this;
	}
	public Employee setHours(double hours){
		myhours = hours;
		return this;
	}
	public Employee setWage(double wage){
		mywage = wage;
		return this;
	}
	public Employee setDep(int dep){
		mydep = dep;
		return this;
	}
	public Employee setGross(double gross){
		mygross = gross;
		return this;
	}
	public Employee setCityTaxes(double citytax){
		mycitytaxes = citytax;
		return this;
	}
	public Employee setStateTaxes(double statetax){
		mystatetaxes = statetax;
		return this;
	}
	public Employee setFederalTaxes(double fedtax){
		myfederaltaxes = fedtax;
		return this;
	}
	public Employee setNetPay(double net){
		mynetpay = net;
		return this;
	}
	public Employee setDeducts(double deduct){
		mydeduct = deduct;
		return this;
	}
	public Employee setSS(double ss){
		mySS = ss;
		return this;
	}
	
	public String getFirst(){
		return myfirst;
	}
	public String getLast(){
		return mylast;
	}
	public String getAddress(){
		return myaddress;
	}
	public String getCity(){
		return mycity;
	}
	public String getState(){
		return mystate;
	}
	public int getAge(){
		return myage;
	}
	public int getId(){
		return myid;
	}
	public double getHours(){
		return myhours;
	}
	public double getWage(){
		return mywage;
	}
	public int getDep(){
		return mydep;
	}
	public double getGross(){
		return mygross;
	}
	public double getCityTaxes(){
		return mycitytaxes;
	}
	public double getStateTaxes(){
		return mystatetaxes;
	}
	public double getFederalTaxes(){
		return myfederaltaxes;
	}
	public double getNetPay(){
		return mynetpay;
	}
	public double getDeduct(){
		return mydeduct;
	}
	public double getSS(){
		return mySS;
	}
	
	public String toString(){
		return myfirst + " " + mylast + "\n" + myaddress + "\n" + mycity + ", " + mystate + "\nAge: " + myage + "\nHours: " + "$" + myhours +"\nWage: $"+mywage +  "\nID: " + myid  + "\nDependents: " + mydep + "\n" ;
	}
}
