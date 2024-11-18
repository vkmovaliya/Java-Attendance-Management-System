import java.util.*;

import java.io.*;
import java.math.RoundingMode;
import java.sql.*;
import java.text.DecimalFormat;

class Attendance {
    static Connection con;
    Scanner sc = new Scanner(System.in);

    char[][] attendance = new char[6][10];
    float[] per = new float[10];

    boolean start = false;
    int default_PW = 1234;

}

class Attendence_Management_System {
    public static void main(String[] args) throws Exception
	{

        String driver="com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        String dburl="jdbc:mysql://localhost:3306/hardik";
        String dbuser="root";
        String dbpass="";
        Connection con=DriverManager.getConnection(dburl, dbuser, dbpass);
        if(con!=null)
        {
            System.out.println("Connection success");
        }
        else
        {
            System.out.println("Connection failed");
        }

    
        Attendance a = new Attendance();
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t\t\t\t --------------------------------------------------------------------\n");
        System.out.print("\t\t\t\t|                                                                    |\n");
        System.out.print("\t\t\t\t|                                                                    |\n");
        System.out.print("\t\t\t\t|                 Welcome To Attendance Management System            |\n");
        System.out.print("\t\t\t\t|                                                                    |\n");
        System.out.print("\t\t\t\t|                                                                    |\n");
        System.out.print("\t\t\t\t --------------------------------------------------------------------\n");

        for (int i = 1; i <= 2; i++) 
		{
            System.out.print("Enter Password To Login: ");
            int user_pw = sc.nextInt();

            if (a.default_PW == user_pw)
				{
                System.out.println();
                System.out.println("xxxxxxxxxxxxxxxxxx Successful Login xxxxxxxxxxxxxxxxxxxxxx");
                a.start = true;
                break;
            } else 
			{
                System.out.println("Invalid Password");
                System.out.print("----------------------------------------------------------------------------------\n");
                a.start = false;
            }
        }
        if (a.start == false)
			{
            System.out.println("Your Attendance Management System is Locked");
            System.out.print("Reset Password");

            boolean flag = false;

            while (flag == false) 
			{
                System.out.println("Enter New Password: ");
                int pw = sc.nextInt();

                if (pw >= 1000 && pw <= 9999) 
				{
                    a.default_PW = pw;
                    flag = true;
                    break;

                } else 
				{
                    System.out.println("Invalid combination, enter valid password");
                    flag = false;
                }
            }
        }

        int choice = 0;

        while (choice != 7) 
		{
            System.out.print("----------------------------------------------------------------------------------\n");
            System.out.println(">> Select an option:");
            System.out.println("--> 1. View Student Data");
            System.out.println("--> 2. Mark attendance");
            System.out.println("--> 3. View attendance");
            System.out.println("--> 4. update attendence");
            System.out.println("--> 5. view Personal attendance");
            System.out.println("--> 6. calculate Attendence Percentage");
            System.out.println("--> 7. Exit");

            System.out.print("----------------------------------------------------------------------------------\n");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                       String sql="{call getstudentdata()}";
                       CallableStatement cst=con.prepareCall(sql);

                       ResultSet rs=cst.executeQuery();
                       System.out.println("------------------------");
                       while(rs.next())
                       {
               
                           System.out.println("Roll no : "+rs.getInt(1));
                           System.out.println("Name : "+rs.getString(2));
                           System.out.println("Division : "+rs.getString(3));
                           System.out.println("Branch : "+rs.getString(4));
                           System.out.println("------------------------");
               
                       }
                    break;

                case 2:
                    
                    System.out.println("----Which day you want to mark attendence----");
                    System.out.println("Enter 1 : for Monday");                    
                    System.out.println("Enter 2 : for Tuesday");
                    System.out.println("Enter 3 : for Wednesday");
                    System.out.println("Enter 4 : for Thursday");
                    System.out.println("Enter 5 : for Friday");
                    System.out.println("Enter 6 : for Saturday");

                    int day=sc.nextInt();

                    switch (day) {
                        case 1:
                        { 
                        String sql1="Update view_attendencedata set Monday=? where rollno=?";
                        PreparedStatement pst=con.prepareStatement(sql1);
                            System.out.println("Enter How many student are present in class :");
                            int n=sc.nextInt();
                            
                            
                            for(int i=1;i<=n;i++)
                            {
                                System.out.println("Enter Rollno which student are present :");
                                int roll=sc.nextInt();
                                String mark="P";
                            
                            pst.setString(1,mark);
                            pst.setInt(2, roll);
                            
                            int r=pst.executeUpdate();

                            if(r>0)
                            {
                            System.out.println("Inserted Successfully.");
                            }
                           }
                        }
                        break;
                    
                        case 2:
                        {
                            String sql1="Update view_attendencedata set Tuesday=? where rollno=?";
                            PreparedStatement pst=con.prepareStatement(sql1);
                            System.out.println("Enter How many student are present in class :");
                            int n=sc.nextInt();
                            
                            
                            for(int i=1;i<=n;i++)
                            {
                                System.out.println("Enter Rollno which student are present :");
                                int roll=sc.nextInt();
                                String mark="P";
                            
                            pst.setString(1,mark);
                            pst.setInt(2, roll);
                            
                            int r=pst.executeUpdate();

                            if(r>0)
                            {
                            System.out.println("Inserted Successfully.");
                            }
                           }
                        }

                        break;

                        case 3:
                        {
                            String sql1="Update view_attendencedata set Wednesday=? where rollno=?";
                            PreparedStatement pst=con.prepareStatement(sql1);
                            System.out.println("Enter How many student are present in class :");
                            int n=sc.nextInt();
                            
                            
                            for(int i=1;i<=n;i++)
                            {
                                System.out.println("Enter Rollno which student are present :");
                                int roll=sc.nextInt();
                                String mark="P";
                            
                            pst.setString(1,mark);
                            pst.setInt(2, roll);
                            
                            int r=pst.executeUpdate();

                            if(r>0)
                            {
                            System.out.println("Inserted Successfully.");
                            }
                           }
                        }

                        break;

                        case 4:
                        {
                            String sql1="Update view_attendencedata set Thursday=? where rollno=?";
                            PreparedStatement pst=con.prepareStatement(sql1);
                            System.out.println("Enter How many student are present in class :");
                            int n=sc.nextInt();
                            
                            
                            for(int i=1;i<=n;i++)
                            {
                                System.out.println("Enter Rollno which student are present :");
                                int roll=sc.nextInt();
                                String mark="P";
                            
                            pst.setString(1,mark);
                            pst.setInt(2, roll);
                            
                            int r=pst.executeUpdate();

                            if(r>0)
                            {
                            System.out.println("Inserted Successfully.");
                            }
                           }
                        }

                        break;

                        case 5:
                        {
                            String sql1="Update view_attendencedata set Friday=? where rollno=?";
                            PreparedStatement pst=con.prepareStatement(sql1);
                            System.out.println("Enter How many student are present in class :");
                            int n=sc.nextInt();
                            
                            
                            for(int i=1;i<=n;i++)
                            {
                                System.out.println("Enter Rollno which student are present :");
                                int roll=sc.nextInt();
                                String mark="P";
                            
                            pst.setString(1,mark);
                            pst.setInt(2, roll);
                            
                            int r=pst.executeUpdate();

                            if(r>0)
                            {
                            System.out.println("Inserted Successfully.");
                            }
                           }
                        }

                        break;

                        case 6:
                        {
                            String sql1="Update view_attendencedata set Saturday=? where rollno=?";
                            PreparedStatement pst=con.prepareStatement(sql1);
                            System.out.println("Enter How many student are present in class :");
                            int n=sc.nextInt();
                            
                            
                            for(int i=1;i<=n;i++)
                            {
                                System.out.println("Enter Rollno which student are present :");
                                int roll=sc.nextInt();
                                String mark="P";
                            
                            pst.setString(1,mark);
                            pst.setInt(2, roll);
                            
                            int r=pst.executeUpdate();

                            if(r>0)
                            {
                            System.out.println("Inserted Successfully.");
                            }
                           }
                        }

                        break;

                        default:
                            System.out.println("--Entre valid number--");
                        break;
                    }           
                        
                    break;

                case 3:
                    String sql1="{call view_attendence}";
                    CallableStatement cst1=con.prepareCall(sql1);

                    ResultSet rs1=cst1.executeQuery();
                    System.out.print("---------------------------------------------------------------------------------------------\n");
                    while(rs1.next())
                    {
                        System.out.println("Roll no:"+rs1.getInt(1));
                        System.out.print("Monday:"+rs1.getString(2)+"\t");
                        System.out.print("Tuesday:"+rs1.getString(3)+"\t");
                        System.out.print("Wednesday:"+rs1.getString(4)+"\t");
                        System.out.print("Thursday:"+rs1.getString(5)+"\t");
                        System.out.print("Friday:"+rs1.getString(6)+"\t");
                        System.out.println("Saturday:"+rs1.getString(7));
                        System.out.print("---------------------------------------------------------------------------------------------\n");
                    }

                    break;

                case 4:

                    System.out.println("Enter which day's attendence you want to change:");
                    String day1=sc.next();

                    String a1="absent";
                    String a2="present";
                    String absent="-";
                    String present="P";

                    System.out.println("--what's update? absent or present--");
                    String ans=sc.next();

                    if(ans.equals(a1))
                    {
                        System.out.println("Enter how many roll no you want to update:");
                        int rp=sc.nextInt();

                        for(int i=1;i<=rp;i++)
                        {
                            System.out.println("Enter roll no "+i+ ":");
                            int r=sc.nextInt();
                            String sql2="update view_attendencedata set "+day1+"='"+absent+"' where Rollno="+r+"";
                            Statement st=con.createStatement();
                            st.executeUpdate(sql2);
                        }
                    }
                    else if(ans.equals(a2))
                    {
                        System.out.println("Enter how many roll no you want to update:");
                        int rp=sc.nextInt();

                        for(int i=1;i<=rp;i++)
                        {
                            System.out.println("Enter roll no "+i+ ":");
                            int r=sc.nextInt();
                            String sql2="update view_attendencedata set "+day1+"='"+present+"' where Rollno="+r+"";
                            Statement st=con.createStatement();
                            st.executeUpdate(sql2);
                        }
                    }
                    else
                    {
                        System.out.println("NOTE --> Enter absent or present only");
                        return;
                    }

                break;

                case 5:

                    System.out.println("Enter Roll no you want view:");
                    int n=sc.nextInt();

                    String sql3="select * from view_attendencedata where Rollno=?";
                    PreparedStatement pst=con.prepareStatement(sql3);

                    pst.setInt(1,n);

                    ResultSet rs2=pst.executeQuery();
                    while(rs2.next())
                    {
                        System.out.print("---------------------------------------------------------------------------------------------\n");
                        System.out.println("Roll no:"+rs2.getInt(1));
                        System.out.print("Monday:"+rs2.getString(2)+"\t");
                        System.out.print("Tuesday:"+rs2.getString(3)+"\t");
                        System.out.print("Wednesday:"+rs2.getString(4)+"\t");
                        System.out.print("Thursday:"+rs2.getString(5)+"\t");
                        System.out.print("Friday:"+rs2.getString(6)+"\t");
                        System.out.println("Saturday:"+rs2.getString(7));
                        System.out.print("---------------------------------------------------------------------------------------------\n"); 
                    }

                break;

                case 6:

                double per;
                int Count;
                    for(int i=1;i<=10;i++)
                    {
                    Count=0;
                    per=0;
                    String sql4="{call calc_per(?)}";
                    CallableStatement cst2=con.prepareCall(sql4);
                    cst2.setInt(1,i);
                    ResultSet rs3= cst2.executeQuery();
                    while(rs3.next()){
                    String M=rs3.getString(1);
                    if(M.equalsIgnoreCase("P")){
                        Count++;
                    }
                    String T=rs3.getString(2);
                    if(T.equalsIgnoreCase("P")){
                        Count++;
                    }
                    String W=rs3.getString(3);
                    if(W.equalsIgnoreCase("P")){
                        Count++;
                    }
                    String TH=rs3.getString(4);
                    if(TH.equalsIgnoreCase("P")){
                        Count++;
                    }
                    String F=rs3.getString(5);
                    if(F.equalsIgnoreCase("P")){
                        Count++;
                    }
                    String S=rs3.getString(6);
                    if(S.equalsIgnoreCase("P")){
                        Count++;
                    }
                    }
                    System.out.println("Total attend days :-"+Count);
                    per=(Count*100)/7;

                    String Per=String.format("%.2f", per);
                    String sql5="update view_attendencedata set Persentage="+Per+" where Rollno="+i+"";
                    Statement st1=con.createStatement();
                    st1.executeUpdate(sql5);

                    }

                break;

                case 7:
                    System.out.println("Exiting program...");
                break;

                default:
                    System.out.println("Invalid option selected");
                break;
            }
        }
        con.close();
        sc.close();
    }
}