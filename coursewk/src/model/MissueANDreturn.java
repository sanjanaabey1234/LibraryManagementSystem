/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MissueANDreturn {
     ResultSet rs4;
     ResultSet rs5;
  
      public void Maddissue(int issueid,String issuememberid,String issuemembername,String issuememberbookisbn,String issuememberbookname,String issuedate,String issuereturndate)
    {
         try{
        Statement st3 = databaseconnection.getMyConnection().createStatement();
        int rowcount = st3.executeUpdate("insert into issuedetails(issueid,readerid,readername,book_isbn,bookname,issuedate,issuereturndate) values ('"+issueid+"','"+issuememberid+"','"+issuemembername+"','"+issuememberbookisbn+"','"+issuememberbookname+"','"+issuedate+"','"+issuereturndate+"')");
        

        if(rowcount>0)
        {
           JOptionPane.showMessageDialog(null,"successfully data inserted ","information",JOptionPane.INFORMATION_MESSAGE);
       
        }
    }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );


            
        }
    }
      
     public ResultSet IssueViewDataDetails()
    {
         try{
        Statement st4 = databaseconnection.getMyConnection().createStatement();
        rs4 = st4.executeQuery("select * from issuedetails");
      
    }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );

            
        }
         return rs4;
    }  
      
     public void Mupdateissue(int issueid,String issuememberid,String issuemembername,String issuememberbookisbn,String issuememberbookname,String issuedate,String issuereturndate)
    {
         try{
        Statement st1 = databaseconnection.getMyConnection().createStatement();
        st1.executeUpdate("update issuedetails set readerid='"+issuememberid+"',readername='"+issuemembername+"',book_isbn='"+issuememberbookisbn+"',bookname='"+issuememberbookname+"',issuedate='"+issuedate+"',issuereturndate='"+issuereturndate+"' where issueid='"+issueid+"'");
        
 
                
        JOptionPane.showMessageDialog(null,"successfully updated","information",JOptionPane.INFORMATION_MESSAGE);
       
    }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );


            
        }
         
         
    }  
     
     public void issuedeletedDataDetails(int deleteissueid)
    {
         try{
        Statement st5 = databaseconnection.getMyConnection().createStatement();
        st5.executeUpdate("delete from issuedetails where issueid='"+deleteissueid+"'");
        
 
            
                
        JOptionPane.showMessageDialog(null,"successfully deleted","information",JOptionPane.INFORMATION_MESSAGE);
       
    }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );
  
        }
    } 
     
      public void Maddreturn(int returnid,int issueid2,String todaydate,int dayselap,String fine,String status)
    {
         try{
        Statement st7 = databaseconnection.getMyConnection().createStatement();
        int rowcount = st7.executeUpdate("insert into returndetails(issueid,returnid,todaydate,dayselap,fine,status) values ('"+returnid+"','"+issueid2+"','"+todaydate+"','"+dayselap+"','"+fine+"','"+status+"')");
        

        if(rowcount>0)
        {
           JOptionPane.showMessageDialog(null,"successfully data inserted ","information",JOptionPane.INFORMATION_MESSAGE);
       
        }
    }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );


            
        }
    }
      
      public ResultSet returnViewDataDetails()
    {
         try{
        Statement st8 = databaseconnection.getMyConnection().createStatement();
        rs5 = st8.executeQuery("select * from returndetails");
      
    }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );

            
        }
         return rs5;
    } 
      
       public void returndeletedDataDetails(int returndeleteid)
    {
         try{
        Statement st9 = databaseconnection.getMyConnection().createStatement();
        st9.executeUpdate("delete from returndetails where returnid='"+returndeleteid+"'");
        
 
            
                
        JOptionPane.showMessageDialog(null,"successfully deleted","information",JOptionPane.INFORMATION_MESSAGE);
       
    }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );
  
        }
    } 
     
}
