/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Mreaderbook;
import java.sql.*;

public class Creaderbook {
    ResultSet rs;
    ResultSet rs2;
    public void submittedDetails(String isbn,String category,String bookname,String author,String publisher,String marketprice)
    {
        Mreaderbook mrb = new Mreaderbook();
        mrb.submitDataDetails(isbn,category,bookname,author,publisher,marketprice); 
    }
   
    public void updatedDetails(String isbn,String category,String bookname,String author,String publisher,String marketprice)
    {
        Mreaderbook mrb = new Mreaderbook();
        mrb.updatedDataDetails(isbn,category,bookname,author,publisher,marketprice); 
   
    }
    
     public void deleteDetails(String isbn)
    {
        Mreaderbook mrb = new Mreaderbook();
        mrb.deletedDataDetails(isbn); 
   
    }
     
     public ResultSet viewBookDetails()
    {
        Mreaderbook mrb = new Mreaderbook();
        rs = mrb.viewBookDataDetails(); 
        return rs;
    } 
     
      public void readersubmitteDetails(String readerid,String readername,int readerage,String readergender,String readeraddress,int readerphonenumber)
    {
        Mreaderbook mrb = new Mreaderbook();
        mrb.readersubmitDataDetails(readerid,readername,readerage,readergender,readeraddress,readerphonenumber); 
    } 
      
     public ResultSet viewReaderDetails()
    {
        Mreaderbook mrb = new Mreaderbook();
        rs2 = mrb.viewReaderDataDetails(); 
        return rs2;
    } 
     
      public void readerUpdatedDetails(String readerid,String readername,int readerage,String readergender,String readeraddress,int readerphonenumber)
    {
        Mreaderbook mrb = new Mreaderbook();
        mrb.readerUpdatedDataDetails(readerid,readername,readerage,readergender,readeraddress,readerphonenumber); 
              
    }    
     
       public void bookDeleteDetails(String readerdeleteid)
    {
        Mreaderbook mrb = new Mreaderbook();
        mrb.bookDeletedDataDetails(readerdeleteid); 
   
    }
}
