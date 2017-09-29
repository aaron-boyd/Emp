import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class GUI extends JFrame{


	public JPanel panel = new JPanel();

	public JTextArea empinfo = new JTextArea();
	public JButton left = new JButton("<");
	public JButton right = new JButton(">");
	public JTextField first = new JTextField("Sam");
	public JTextField last = new JTextField("Smith");
	public JTextField address = new JTextField("6932 Spring Arbor Drive");
	public JTextField city = new JTextField("St. Paul");
	public JTextField state = new JTextField("Minnesota");
	public JTextField age = new JTextField("23");
	public JTextField id = new JTextField("382738");
	public JTextField hours = new JTextField("35.66");
	public JTextField wage = new JTextField("12.87");
	public JTextField dep = new JTextField("2");
	public JButton add = new JButton("Add");
	public Font font = new Font("Sarif",Font.PLAIN,22);
	
	
	public GUI(){
		//Set Text boxes
		first.setFont(font);
		last.setFont(font);
		address.setFont(font);
		city.setFont(font);
		state.setFont(font);
		age.setFont(font);
		id.setFont(font);
		hours.setFont(font);
		wage.setFont(font);
		dep.setFont(font);
		add.setFont(font);
		first.setColumns(14);
		last.setColumns(14);
		address.setColumns(14);
		city.setColumns(14);
		state.setColumns(14);
		age.setColumns(14);
		id.setColumns(14);
		hours.setColumns(14);
		wage.setColumns(14);
		dep.setColumns(14);
		
	
		//Adding to JPanel
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.EAST;
		c.insets = new Insets(10,10,10,10);
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		panel.add(empinfo,c);
		c.gridwidth = 1;
		
		c.gridx = 0;
		c.gridy = 1;
		panel.add(left, c);
		
		c.gridx = 1;
		c.gridy = 1;
		panel.add(right, c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 2;
		panel.add(first, c);
		
		c.gridy = 3;
		panel.add(last, c);
		
		c.gridy = 4;
		panel.add(address, c);
		
		c.gridy = 5;
		panel.add(city, c);
		
		c.gridy = 6;
		panel.add(state, c);
		
		c.gridy = 7;
		panel.add(age, c);
		
		c.gridy = 8;
		panel.add(id, c);
		
		c.gridy = 9;
		panel.add(hours, c);
		
		c.gridy = 10;
		panel.add(wage, c);
		
		c.gridy =11;
		panel.add(dep, c);
		
		c.gridy = 12;
		panel.add(add, c);
		
		
		
		left.addActionListener(l -> {
			EmployeeTester.current -=1;
			if(EmployeeTester.current < 0){
				EmployeeTester.current = EmployeeTester.empcount;
			}
			EmployeeTester.myGUI.empinfo.setText(EmployeeTester.Roll.getEmployee(EmployeeTester.current).toString() + EmployeeTester.Roll.PayStubString(EmployeeTester.current));
		});
		
		right.addActionListener(l -> {
			EmployeeTester.current +=1;
			if(EmployeeTester.current > EmployeeTester.empcount){
				EmployeeTester.current = 0;
			}
			EmployeeTester.myGUI.empinfo.setText(EmployeeTester.Roll.getEmployee(EmployeeTester.current).toString() + EmployeeTester.Roll.PayStubString(EmployeeTester.current));
		});
		
		add.addActionListener(l -> {
			EmployeeTester.empcount +=1;
			EmployeeTester.Roll.getEmployee(EmployeeTester.empcount).setFirst(EmployeeTester.myGUI.first.getText());
			EmployeeTester.Roll.getEmployee(EmployeeTester.empcount).setLast(EmployeeTester.myGUI.last.getText());
			EmployeeTester.Roll.getEmployee(EmployeeTester.empcount).setAddress(EmployeeTester.myGUI.address.getText());
			EmployeeTester.Roll.getEmployee(EmployeeTester.empcount).setCity(EmployeeTester.myGUI.city.getText());
			EmployeeTester.Roll.getEmployee(EmployeeTester.empcount).setState(EmployeeTester.myGUI.state.getText());
			EmployeeTester.Roll.getEmployee(EmployeeTester.empcount).setAge(Integer.parseInt(EmployeeTester.myGUI.age.getText()));
			EmployeeTester.Roll.getEmployee(EmployeeTester.empcount).setId(Integer.parseInt(EmployeeTester.myGUI.id.getText()));
			EmployeeTester.Roll.getEmployee(EmployeeTester.empcount).setHours(Double.parseDouble(EmployeeTester.myGUI.hours.getText()));
			EmployeeTester.Roll.getEmployee(EmployeeTester.empcount).setWage(Double.parseDouble(EmployeeTester.myGUI.wage.getText()));
			EmployeeTester.Roll.getEmployee(EmployeeTester.empcount).setDep(Integer.parseInt(EmployeeTester.myGUI.dep.getText()));
			EmployeeTester.Roll.calcGross(EmployeeTester.empcount);
			EmployeeTester.Roll.calcTaxes(EmployeeTester.empcount);
			EmployeeTester.Roll.calcNetPay(EmployeeTester.empcount);
			first.setText("First...");
			last.setText("Last...");
			address.setText("Address...");
			city.setText("City...");	
			state.setText("State...");
			age.setText("Age...");
			id.setText("ID...");
			hours.setText("Hours...");
			wage.setText("Wage...");
			dep.setText("Dependents...");
			
		});
		
		//Adding to content pane
		Color newcolor = new Color(0,200,200);
		panel.setBackground(newcolor);
		getContentPane().add(panel, BorderLayout.CENTER);
		
		
		//JFrame properties
		setSize(370,1100);
		setTitle("PayRoll");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		empinfo.setEditable(false);
		empinfo.setFont(font);
	}
}
