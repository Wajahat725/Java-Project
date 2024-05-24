import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

interface User
{
    abstract void login();
}
class UserAccount implements User 
{
    @Override
    public void login() 
    {
    	
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        String number;
        String password;
        String email;
        String userInput;
        /*
        boolean isLoggedIn = false;

        while (!isLoggedIn)
        {
            System.out.println("---------------------");
            System.out.println("##### WELCOME #####");
            System.out.println("---------------------");
            
            System.out.println("Enter your name:");
            name = scanner.nextLine();
            
            System.out.println("Enter age:");
            age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your number:");
            number = scanner.nextLine();

            System.out.println("Enter your email:");
            email = scanner.nextLine();

            System.out.println("Enter your new password:");
            password = scanner.nextLine();

            System.out.println("User name: " + name);
            System.out.println("User phone number: " + number);
            System.out.println("User email: " + email);
            System.out.println("User password: " + "*******");

            System.out.print("Enter your password to verify: ");
            userInput = scanner.nextLine();

            if (userInput.equals(password))
            {
                System.out.println("Password verified. Access granted!");
                isLoggedIn = true;
            }
            else 
            {
                System.out.println("Incorrect password. Access denied! Please try again.");
            }
        } */
    }
}

class Hospital 
{
    String name;
    String address;
    

    public Hospital(String name, String address)
    {
        this.name = name;
        this.address = address;
       
    }

    public void detail() 
    {
        this.name = " ";
        this.address = " ";
    }
}
class Staff 
{
    private String receptionists;
    private String name1; 
    private String contactNumber1;
    private String administrators;
    private String name2;    
    private String contactNumber2;  

    
    public Staff(String receptionists, String administrators, String name1, String name2, String contactNumber1, String contactNumber2) 
    {
        this.receptionists = receptionists;
        System.out.println();
        this.administrators = administrators;
        this.name1 = name1;
        this.name2 = name2;
        this.contactNumber1 = contactNumber1;
        this.contactNumber2 = contactNumber2;
    }

    public String getReceptionists()
    {
        return receptionists;
    }

    public void setReceptionists(String receptionists) 
    {
        this.receptionists = receptionists;
    }

    public String getAdministrators()
    {
        return administrators;
    }

    public void setAdministrators(String administrators) 
    {
        this.administrators = administrators;
    }

    public String getName1()
    {
        return name1;
    }

    public void setName1(String name1) 
    {
        this.name1 = name1;
    }

    public String getName2() 
    {
        return name2;
    }

    public void setName2(String name2) 
    {
        this.name2 = name2;
    }

    public String getContactNumber1() 
    {
        return contactNumber1;
    }

    public void setContactNumber1(String contactNumber1) 
    {
        this.contactNumber1 = contactNumber1;
    }

    public String getContactNumber2() 
    {
        return contactNumber2;
    }

    public void setContactNumber2(String contactNumber2) 
    {
        this.contactNumber2 = contactNumber2;
    }
}
abstract class Schedule 
{
    public abstract void availability();
}

class Appointment extends Schedule
{
    @Override
    public void availability() 
    {
    	System.out.println();
        System.out.println("### Hospital Shedule ###");
        System.out.println();
        System.out.println("Doctor availability for Monday: 9 AM to 12 PM && 7 PM to 11 PM ");
        System.out.println();
        System.out.println("Doctor availability for Tuesday: 9 AM to 12 PM && 7 PM to 11 PM ");
        System.out.println();
        System.out.println("Doctor availability for Wednesday: 9 AM to 11 PM && 7 PM to 12 PM ");
        System.out.println();
        System.out.println("Doctor availability for Thursday: 10 AM to 12 PM && 7 PM to 11 PM ");
        System.out.println();
        System.out.println("Doctor availability for Friday: 9 AM to 12 PM && 8 PM to 11 PM ");
        System.out.println();
        System.out.println("Doctor availability for Saturday: OFF (Emergency open half day)");
        System.out.println();
        System.out.println("Doctor availability for Sunday: OFF (Emergency open half day)");
        System.out.println();
    }
}

class PatientDetails 
{
    Scanner scanner = new Scanner(System.in);
    
    public void patientDetails() 
    {
        System.out.println("Enter patient name:");
        String patientName = scanner.nextLine();
        System.out.println("Enter patient age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter patient gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter patient father name:");
        String fatherName = scanner.nextLine();
        System.out.println("Enter patient contact number:");
        String contact = scanner.nextLine();
        System.out.println();
        System.out.println(" Patient details:");
        System.out.println();
        System.out.println("||______||_____||____||_____||______||______||");
        System.out.println();
                    System.out.println("Patient name: " + patientName);
                    System.out.println();
                    System.out.println("Patient age: " + age);
                    System.out.println();
                    System.out.println("Patient gender: " + gender);
                    System.out.println();
                    System.out.println("Patient father name: " + fatherName);
                    System.out.println();
                    System.out.println("Patient contact number: " + contact);
                    System.out.println();
        System.out.println("||_____||_____||_____||______||_____||_______||");
        System.out.println();
    }

    public void patientBloodGroup()
    {
    	System.out.println();
        System.out.println("Enter the patient blood group:");
        String blood = scanner.nextLine();
        System.out.println();
        System.out.println("Patient blood group: " + blood);
        System.out.println();
    }

    public void admitPatient() 
    {
    	System.out.println();
        System.out.println("Enter any room number from 1 to 100:");
        int roomNumber = scanner.nextInt();
        if (roomNumber >= 1 && roomNumber <= 100)
        {
            System.out.println("Patient room number: " + roomNumber);
            System.out.println();
        }
        else 
        {
            System.out.println("Invalid input! Please enter a room number between 1 and 100.");
        }
    }

    public void dischargePatient()
    {
        scanner.nextLine();
        System.out.println("Enter the date of discharge:");
        String date2 = scanner.nextLine();
        System.out.println();
        System.out.println("Enter the room number:");
        String roomType = scanner.nextLine();
        System.out.println();
        System.out.println("Discharged date: " + date2);
        System.out.println();
        System.out.println("Room type: " + roomType);
    }
      public void displayPatientDetails()
      {
        
        System.out.println("\n### Patient Details ###");
        System.out.println();
        System.out.println("Name: " + patientName);
        System.out.println();
        System.out.println("Age: " + patientAge);
        System.out.println();
        System.out.println("Gender: " + patientGender);
        System.out.println();
        System.out.println("Father's Name: " + patientFatherName);
        System.out.println();
        System.out.println("Contact Number: " + patientContact);
        System.out.println();
        System.out.println("Blood Group: " + patientBloodGroup);
        System.out.println();
        System.out.println("Room Number: " + patientRoomNumber);
        System.out.println();
        System.out.println("Discharged Date: " + patientDischargedDate);
        System.out.println();
        System.out.println("Room Type: " + patientRoomType);
    }
}

class Doctor
{
    Scanner scanner = new Scanner(System.in);

    public void showSpecializations()
    {
    	System.out.println();
        System.out.println("#### Doctor name:         Specialization:           fee:    ####");
        System.out.println();
        System.out.println("1.   Dr. Syed Qasim       Dengue fever              15000");
        System.out.println();
        System.out.println("2.   Dr. Arshad Mahmood   Diabetes                  15000");
        System.out.println();
        System.out.println("3.   Dr. Amjad Salamat    Hepatitis                 13500");
        System.out.println();
        System.out.println("4.   Dr. Muhammad Ali     Tuberculosis              12000");
        System.out.println();
        System.out.println("5.   Dr. Nadeem Zia       Malaria                   14500");
        System.out.println();
        System.out.println("6.   Dr. Abdul Ali Wajid  Cancer                    18000");
        System.out.println();
        System.out.println("7.   Dr. Ayesha Masood    Cardiovascular disease    16500");
        System.out.println();
        System.out.println("8.   Dr. Ghazala Sadia    Stroke                    9000");
        System.out.println();
        System.out.println("9.   Dr. Umber Jalil      Pneumonia                 13000");
        System.out.println();
        System.out.println("10.  Dr. Mudassir Faiz    Cholera                   10,000");
        System.out.println();
        System.out.println("11.  Dr. Yasir Abbas      Measles                   7500");
        System.out.println();
        System.out.println("12.  Dr. Muhammad Bilal   Mental Health             14000");
        System.out.println();
        System.out.println("13.  Dr. Yasser Masood    Child Health              12000");
        System.out.println();
    }

    public void bookDoctor() 
    {
        System.out.println("Enter the number of the doctor you want to book:");
        System.out.println();
        int n = scanner.nextInt();
        scanner.nextLine();
        switch (n)
        {
            case 1:
                System.out.println("You have booked Dr. Syed Qasim specializing in Dengue fever");
                System.out.println();
                break;
            case 2:
                System.out.println("You have booked Dr. Arshad Mahmood specializing in Diabetes");
                System.out.println();
                break;
            case 3:
                System.out.println("You have booked Dr. Amjad Salamat specializing in Hepatitis");
                System.out.println();
                break;
            case 4:
                System.out.println("You have booked Dr. Muhammad Ali specializing in Tuberculosis");
                System.out.println();
                break;
            case 5:
                System.out.println("You have booked Dr. Nadeem Zia specializing in Malaria");
                System.out.println();
                break;
            case 6:
                System.out.println("You have booked Dr. Abdul Ali Wajid specializing in Cancer");
                System.out.println();
                break;
            case 7:
                System.out.println("You have booked Dr. Ayesha Masood specializing in Cardiovascular disease");
                System.out.println();
                break;
            case 8:
                System.out.println("You have booked Dr. Ghazala Sadia specializing in Stroke");
                System.out.println();
                break;
            case 9:
                System.out.println("You have booked Dr. Umber Jalil specializing in Pneumonia");
                System.out.println();
                break;
            case 10:
                System.out.println("You have booked Dr. Mudassir Faiz specializing in Cholera");
                System.out.println();
                break;
            case 11:
                System.out.println("You have booked Dr. Yasir Abbas specializing in Measles");
                System.out.println();
                break;
            case 12:
                System.out.println("You have booked Dr. Muhammad Bilal specializing in Mental Health");
                System.out.println();
                break;
            case 13:
                System.out.println("You have booked Dr. Yasser Masood specializing in Child Health");
                System.out.println();
                break;

            default:
                System.out.println("Invalid! Please enter a correct number");
                System.out.println();
        }
    }
}

abstract class TotalBill 
{
    protected double totalAmount;

    public TotalBill(double totalAmount)
    {
        this.totalAmount = totalAmount;
    }

    public abstract void generateBill();
}

class PatientBill extends TotalBill 
{
    private double medicalProceduresCost;
    private double consultationsCost;
    private double testsCost;
    private double medicationsCost;
    private double roomCharges;
    private double doctorFee;

    public PatientBill(double medicalProceduresCost, double consultationsCost, double testsCost, double medicationsCost, double roomCharges,double doctorFee) 
    {
        super(0);
        this.medicalProceduresCost = medicalProceduresCost;
        this.consultationsCost = consultationsCost;
        this.testsCost = testsCost;
        this.medicationsCost = medicationsCost;
        this.roomCharges = roomCharges;
        this.doctorFee = doctorFee;
    }

    @Override
    public void generateBill() 
    {
        totalAmount = medicalProceduresCost + consultationsCost + testsCost + medicationsCost + roomCharges;
        System.out.println("Total Bill:");
        System.out.println();
        System.out.println("Medical Procedures Cost: $" + medicalProceduresCost);
        System.out.println();
        System.out.println("Consultations Cost: $" + consultationsCost);
        System.out.println();
        System.out.println("Tests Cost: $" + testsCost);
        System.out.println();
        System.out.println("Medications Cost: $" + medicationsCost);
        System.out.println();
        System.out.println("Room Charges: $" + roomCharges);
        System.out.println();
        System.out.println("Doctor's Fee: $" + doctorFee);
        System.out.println();
//        System.out.println("Total Amount Due: $" + totalAmount);
//        System.out.println();
    }
}

class Patient 
{
    private String name;
    private double income;

    public String getName() 
    {
        
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getIncome() 
    {
        return income;
    }

    public void setIncome(double income) 
    {
        this.income = income;
    }
}

class Bill
{
    private Patient patient;
    private double totalAmount;

   
    private String discountedPatientName;

    public Patient getPatient() 
    {
        return patient;
    }

    public void setPatient(Patient patient) 
    {
        this.patient = patient;
    }

    public double getTotalAmount() 
    {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) 
    {
        this.totalAmount = totalAmount;
    }

    
    public double calculateBill()
    {
        double finalAmount;
        if (totalAmount >= 30000) 
        {
            finalAmount = totalAmount - 1500;
       
           
        } 
        else 
        {
            finalAmount = totalAmount;
        }
        return finalAmount;
    }

//    public void generateBill() 
//    {
//        double finalAmount = calculateBill();
//        System.out.println("Patient: " + patient.getName());
//        System.out.println();
//        System.out.println("Total income: $" + totalAmount);
//        System.out.println();
//        if (finalAmount != totalAmount)
//        {
//            System.out.println("Discount for the patient: " + discountedPatientName);
//        }
//        System.out.println("Discount for patient: $" + finalAmount);
//    }
}



public class JavaApplication11 
{

	public static void main(String[] args) throws IOException 
	{
		    // Make a GUI
		
		    JFrame frame = new JFrame();

	        JPanel panel = new JPanel();
	        panel.setBackground(Color.WHITE); 

	        frame.setSize(500, 600);
	        frame.setTitle("Hospital Management System");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(panel); 

	        panel.setLayout(null);
	        
	        JLabel labelt = new JLabel(" Well Come ");
	        labelt.setBounds(180, 10, 400, 50);
	        labelt.setForeground(Color.BLACK);
	        labelt.setFont(new Font("Arial", Font.BOLD, 25));
	        panel.add(labelt);

	        JLabel label = new JLabel("Enter user name");
	        label.setBounds(20, 77, 400, 50);
	        label.setForeground(Color.BLACK);
	        label.setFont(new Font("Arial", Font.BOLD, 16));
	        panel.add(label); 

	        JTextField textUser = new JTextField(50);
	        textUser.setBounds(200,80,250,40);
	        panel.add(textUser);
	        
	        JLabel label6 = new JLabel("Enter Email");
	        label6.setBounds(20, 150, 400, 50);
	        label6.setForeground(Color.BLACK);
	        label6.setFont(new Font("Arial", Font.BOLD, 16));
	        panel.add(label6); 

	        JTextField textUser3 = new JTextField(50);
	        textUser3.setBounds(200,155,250,40);
	        panel.add(textUser3);
	        
	        JLabel label4 = new JLabel("Enter phone number");
	        label4.setBounds(20, 225, 400, 50);
	        label4.setForeground(Color.BLACK);
	        label4.setFont(new Font("Arial", Font.BOLD, 16));
	        panel.add(label4); 

	        JTextField textUser1 = new JTextField(50);
	        textUser1.setBounds(200,230,250,40);
	        panel.add(textUser1);
	        
	        JLabel label2 = new JLabel("New password");
	        label2.setBounds(20, 307, 400, 50);
	        label2.setForeground(Color.BLACK);
	        label2.setFont(new Font("Arial", Font.BOLD, 16));
	        panel.add(label2);
	        
	        JPasswordField textPassword = new JPasswordField(50);
	        textPassword.setBounds(200,310,250,40);
	        panel.add(textPassword);
	        
	        JLabel label3 = new JLabel("confirm password");
	        label3.setBounds(20, 380, 400, 50);
	        label3.setForeground(Color.BLACK);
	        label3.setFont(new Font("Arial", Font.BOLD, 16));
	        panel.add(label3);
	        
	        JPasswordField confirmPassword = new JPasswordField(50);
	        confirmPassword.setBounds(200,385,250,40);
	        panel.add(confirmPassword);
	        
	        JButton button = new JButton("Login");
	        button.setBounds(190, 450, 100, 40);
	        button.setBackground(Color.BLUE); 
	        button.setForeground(Color.WHITE);
	        button.setFont(new Font("Arial", Font.BOLD, 16));
	        panel.add(button);
	        
	        JLabel label66 = new JLabel("Congratulation your account has created successfully!");
	        label66.setBounds(35, 500, 400, 50);
	        label66.setForeground(Color.BLACK);
	        label66.setFont(new Font("Arial", Font.BOLD, 16));
	        panel.add(label66);
	        
	        frame.setVisible(true);
		
		    Scanner ref = new Scanner(System.in);
	        
	        UserAccount user = new UserAccount();
	        user.login();
	        
	        System.out.println();
	        Hospital hospital = new Hospital(" Quaid_e_Azam International Hospital Islamabad", " Main Peshawar Road H-13 Islamabad");
	        System.out.println("Hospital name: " + hospital.name);
	        System.out.println();
	        System.out.println("Hospital location: " + hospital.address);
	        hospital.detail();
	        
	        Staff staff = new Staff("3", "2", "Nabeel Gill", "Dr. Shaukat Ali Bangash", "00518449100", "03118449972");
	        
	        String receptionist = staff.getReceptionists();	        System.out.println();
	        String administrator = staff.getAdministrators();
	        System.out.println();
	        String name1 = staff.getName1();
	        System.out.println();
	        String name2 = staff.getName2();
	        System.out.println();
	        String contact1 = staff.getContactNumber1();
	        System.out.println();
	        String contact2 = staff.getContactNumber2();
	        
	        System.out.println("Number of Receptionists: " +receptionist );
	        System.out.println();
	        System.out.println("Number of Administrators: " +administrator);
	        System.out.println();
	        System.out.println("Name of Receptionist: " + name1);
	        System.out.println();
	        System.out.println("Name of Administrator: " + name2);
	        System.out.println();
	        System.out.println("Contact Number of Receptionist: " +contact1);
	        System.out.println();
	        System.out.println("Contact Number of Administrator: " + contact2);
	        
	        Appointment appointment  = new Appointment();
	        appointment.availability();
	        
	        PatientDetails patient = new PatientDetails();
	        patient.patientDetails();
	        patient.patientBloodGroup();
	        patient.admitPatient();

	        double medicalProceduresCost = 2000.0;
	        double consultationsCost = 400.0;
	        double testsCost = 1500.0;
	        double medicationsCost = 3200.0;
	        double roomCharges = 750.0;
	       
	        Doctor doctor = new Doctor();
	        doctor.showSpecializations();
	        doctor.bookDoctor();
	        double doctorFee = 0.0; 
	        System.out.println("Select that number which you have selected in the doctor booking");
	        System.out.println();
	        int n = ref.nextInt();
	        switch (n)
	        { 
	        case 1:
	              doctorFee = 15000.0;
	              break;
	        case 2:
	              doctorFee = 15000.0;
	              break;
	        case 3:
	              doctorFee = 13500.0;
	              break;
	        case 4:
	              doctorFee = 12000.0;
	              break;
	         case 5:
	              doctorFee = 14500.0;
	              break;
	        case 6:
	              doctorFee = 18000.0;
	              break;
	         case 7:
	              doctorFee = 16500.0;
	              break;
	        case 8:
	              doctorFee = 9000.0;
	              break;
	        case 9:
	              doctorFee = 13000.0;
	              break;
	        case 10:
	              doctorFee = 10000.0;
	              break;
	         case 11:
	              doctorFee = 7500.0;
	              break;
	        case 12:
	              doctorFee = 14000.0;
	              break;
	        case 13:
	              doctorFee = 12000.0;
	              break;
	    
	}
	        PatientBill patientBill = new PatientBill(medicalProceduresCost, consultationsCost, testsCost, medicationsCost, roomCharges, doctorFee);
	        patientBill.generateBill();
	        
	        double TotalFee = 0.0;
	        TotalFee = medicalProceduresCost+consultationsCost+testsCost+medicationsCost+roomCharges+doctorFee;
	        
	        Patient patient1 = new Patient();
	        patient1.setName(" ");
	        patient1.setIncome(25000);

	        Bill bill1 = new Bill();
	        bill1.setPatient(patient1);
	        bill1.setTotalAmount(15000);
	        
	        System.out.println("Total bill of the Hospital: "+ TotalFee);
	        System.out.println();

//	        System.out.println("### Patient's Bill discount: ###");
//	        System.out.println();
	        
//	        bill1.generateBill();
	        System.out.println("### Thank you for using this application ###");
	        System.out.println();
	        
	        patient.displayPatientDetails();
	        patient.dischargePatient();
	        
            // File Created
	        
	        File filecreation = new File("C:\\Users\\RiphahIUI\\Desktop\\H-M-System.txt");
	        
			if(filecreation.createNewFile())
			{  
				System.out.println();
				System.out.println("File created successfully");
			}
			else
			{   
				System.out.println();
				System.out.println("Invalid! File already exist");
			}
  
   }
}

