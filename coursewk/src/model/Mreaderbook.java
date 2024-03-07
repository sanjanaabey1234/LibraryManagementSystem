/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;


public class Mreaderbook {
    ResultSet rs;
    ResultSet rs2;
    public void submitDataDetails(String isbn,String category,String bookname,String author,String publisher,String marketprice )
    {
         try{
        Statement st = databaseconnection.getMyConnection().createStatement();
        int rowcount = st.executeUpdate("insert into bookdetails(book_isbn,category,bookname,author,publisher,bookmp) values ('"+isbn+"','"+category+"','"+bookname+"','"+author+"','"+publisher+"','"+marketprice+"')");
        

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
    
  public void updatedDataDetails(String isbn,String category,String bookname,String author,String publisher,String marketprice )
    {
         try{
        Statement st1 = databaseconnection.getMyConnection().createStatement();
        st1.executeUpdate("update bookdetails set category='"+category+"',bookname='"+bookname+"',author='"+author+"',publisher='"+publisher+"',bookmp='"+marketprice+"' where book_isbn='"+isbn+"'");
        
 
                
        JOptionPane.showMessageDialog(null,"successfully updated","information",JOptionPane.INFORMATION_MESSAGE);
       
    }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );


            
        }
         
         
    }  
   
   public void deletedDataDetails(String isbn)
    {
         try{
        Statement st1 = databaseconnection.getMyConnection().createStatement();
        st1.executeUpdate("delete from bookdetails where book_isbn='"+isbn+"'");
        
 
            
                
        JOptionPane.showMessageDialog(null,"successfully deleted","information",JOptionPane.INFORMATION_MESSAGE);
       
    }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );
  
        }
    }  
  
   public ResultSet viewBookDataDetails()
    {
         try{
        Statement st1 = databaseconnection.getMyConnection().createStatement();
        rs = st1.executeQuery("select * from bookdetails");
      
    }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"invalid sql query","Error",JOptionPane.ERROR_MESSAGE );

            
        }
         return rs;
    }  
   
     public void readersubmitDataDetails(String readerid,String readername,int readerage,String readergender,String readeraddress,int readerphonenumber)
    {
         try{
        Statement st2 = databaseconnection.getMyConnection().createStatement();
        int rowcount = st2.executeUpdate("insert into readerdetails(readerid,readername,readerage,readergender,readeraddress,readerphonenumber) values ('"+readerid+"','"+readername+"','"+readerage+"','"+readergender+"','"+readeraddress+"','"+readerphonenumber+"')");
        

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
   
      public ResultSet viewReaderDataDetails()
    {
         try{
        Statement st2 = databaseconnection.getMyConnection().createStatement();
        rs2 = st2.executeQuery("select * from readerdetails");
      
    }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );

            
        }
         return rs2;
    }  
     
     public void readerUpdatedDataDetails(String readerid,String readername,int readerage,String readergender,String readeraddress,int readerphonenumber)
    {
         try{
        Statement st2 = databaseconnection.getMyConnection().createStatement();
        st2.executeUpdate("update readerdetails set readername='"+readername+"',readerage='"+readerage+"',readergender='"+readergender+"',readeraddress='"+readeraddress+"',readerphonenumber='"+readerphonenumber+"' where readerid='"+readerid+"'");
        
 
                
        JOptionPane.showMessageDialog(null,"successfully updated","information",JOptionPane.INFORMATION_MESSAGE);
       
    }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );
   
        }
          
    }
     
      public void bookDeletedDataDetails(String readerdeleteid)
    {
         try{
        Statement st1 = databaseconnection.getMyConnection().createStatement();
        st1.executeUpdate("delete from readerdetails where readerid='"+readerdeleteid+"'");
        
 
            
                
        JOptionPane.showMessageDialog(null,"successfully deleted","information",JOptionPane.INFORMATION_MESSAGE);
       
    }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"invalid data","Error",JOptionPane.ERROR_MESSAGE );
  
        }
    }  
     
}
            

