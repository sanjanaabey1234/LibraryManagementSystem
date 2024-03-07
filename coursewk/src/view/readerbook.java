/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.Creaderbook;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.InputMismatchException;
import javax.swing.table.DefaultTableModel;


public class readerbook extends javax.swing.JFrame {

   String gender;
    
    public readerbook() {
        initComponents();
   
        
        gendergroup();
    }
    
    public void gendergroup()
    {
        //Button Group ekata male amd female radio btn add karala mehema daaanawa
        gendergroup.add(radiomale);
        gendergroup.add(radiofemale);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gendergroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bookdetails = new javax.swing.JButton();
        readerdetails = new javax.swing.JButton();
        dashboard2 = new javax.swing.JButton();
        details = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtisbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcategory = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtbookname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtauthor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpublisher = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmarketprice = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        viewbtn = new javax.swing.JButton();
        deleteid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtreaderid = new javax.swing.JTextField();
        txtreadername = new javax.swing.JTextField();
        txtreaderage = new javax.swing.JTextField();
        txtreaderaddress = new javax.swing.JTextField();
        txtreaderphonenumber = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        readeraddbtn = new javax.swing.JButton();
        readerupdatebtn = new javax.swing.JButton();
        readerdeletebtn = new javax.swing.JButton();
        txtreaderdeleteid = new javax.swing.JTextField();
        readerviewbtn = new javax.swing.JButton();
        radiomale = new javax.swing.JRadioButton();
        radiofemale = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1277, 735));

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        bookdetails.setBackground(new java.awt.Color(102, 0, 0));
        bookdetails.setText("Book Details");
        bookdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookdetailsActionPerformed(evt);
            }
        });

        readerdetails.setBackground(new java.awt.Color(102, 0, 0));
        readerdetails.setText("Reader Details");
        readerdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readerdetailsActionPerformed(evt);
            }
        });

        dashboard2.setBackground(new java.awt.Color(102, 0, 0));
        dashboard2.setText("Dashboard");
        dashboard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Book ISBN");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 10, 100, 20);
        jPanel3.add(txtisbn);
        txtisbn.setBounds(150, 10, 120, 26);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Category");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 50, 90, 16);
        jPanel3.add(txtcategory);
        txtcategory.setBounds(150, 50, 120, 26);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Book Name");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 90, 90, 16);
        jPanel3.add(txtbookname);
        txtbookname.setBounds(150, 90, 120, 26);

        jLabel4.setText("Author");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 130, 80, 16);
        jPanel3.add(txtauthor);
        txtauthor.setBounds(150, 130, 120, 26);

        jLabel5.setText("Publisher");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 170, 80, 16);
        jPanel3.add(txtpublisher);
        txtpublisher.setBounds(150, 170, 120, 26);

        jLabel6.setText("Book Market Price");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 210, 120, 30);
        jPanel3.add(txtmarketprice);
        txtmarketprice.setBounds(150, 210, 120, 26);

        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel3.add(addbtn);
        addbtn.setBounds(140, 250, 100, 50);

        deletebtn.setText("Enter Delete Id");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel3.add(deletebtn);
        deletebtn.setBounds(10, 370, 110, 50);

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(updatebtn);
        updatebtn.setBounds(80, 310, 110, 50);

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ISBN", "Category", "Book Name", "Author", "Publisher", "Book Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(330, 70, 800, 430);
        jPanel3.add(jLabel8);
        jLabel8.setBounds(130, 250, 0, 0);

        viewbtn.setText("view");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        jPanel3.add(viewbtn);
        viewbtn.setBounds(20, 250, 100, 50);
        jPanel3.add(deleteid);
        deleteid.setBounds(150, 380, 120, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Book Details");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(680, 16, 120, 50);

        details.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setLayout(null);

        jLabel7.setText("Reader Id");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(6, 21, 90, 16);

        jLabel9.setText("Reader Name");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(6, 66, 100, 16);

        jLabel10.setText("Reader Age");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(6, 110, 120, 16);

        jLabel11.setText("Reader Gender");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(6, 151, 130, 20);

        jLabel12.setText("Reader Address");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(6, 188, 120, 16);

        jLabel13.setText("Reader Phone Number");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(6, 232, 140, 30);

        txtreaderid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreaderidActionPerformed(evt);
            }
        });
        jPanel4.add(txtreaderid);
        txtreaderid.setBounds(154, 16, 120, 26);

        txtreadername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreadernameActionPerformed(evt);
            }
        });
        jPanel4.add(txtreadername);
        txtreadername.setBounds(154, 61, 120, 26);
        jPanel4.add(txtreaderage);
        txtreaderage.setBounds(154, 105, 120, 26);

        txtreaderaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreaderaddressActionPerformed(evt);
            }
        });
        jPanel4.add(txtreaderaddress);
        txtreaderaddress.setBounds(153, 188, 124, 26);

        txtreaderphonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreaderphonenumberActionPerformed(evt);
            }
        });
        jPanel4.add(txtreaderphonenumber);
        txtreaderphonenumber.setBounds(153, 232, 124, 26);

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reader id", "Reader name", "Reader age", "Reader gender", "Reader address", "Reader phonenumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(340, 60, 790, 377);

        readeraddbtn.setText("Add");
        readeraddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readeraddbtnActionPerformed(evt);
            }
        });
        jPanel4.add(readeraddbtn);
        readeraddbtn.setBounds(164, 280, 110, 47);

        readerupdatebtn.setText("Update");
        readerupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readerupdatebtnActionPerformed(evt);
            }
        });
        jPanel4.add(readerupdatebtn);
        readerupdatebtn.setBounds(100, 340, 100, 50);

        readerdeletebtn.setText("Delete");
        readerdeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readerdeletebtnActionPerformed(evt);
            }
        });
        jPanel4.add(readerdeletebtn);
        readerdeletebtn.setBounds(20, 410, 116, 46);
        jPanel4.add(txtreaderdeleteid);
        txtreaderdeleteid.setBounds(160, 420, 125, 26);

        readerviewbtn.setText("View");
        readerviewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readerviewbtnActionPerformed(evt);
            }
        });
        jPanel4.add(readerviewbtn);
        readerviewbtn.setBounds(30, 280, 100, 47);

        gendergroup.add(radiomale);
        radiomale.setText("Male");
        radiomale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiomaleActionPerformed(evt);
            }
        });
        jPanel4.add(radiomale);
        radiomale.setBounds(170, 150, 51, 21);

        gendergroup.add(radiofemale);
        radiofemale.setText("Female");
        radiofemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiofemaleActionPerformed(evt);
            }
        });
        jPanel4.add(radiofemale);
        radiofemale.setBounds(240, 150, 63, 21);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Reader Details");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(680, 10, 120, 30);

        details.addTab("tab2", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(readerdetails))
                    .addComponent(bookdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(details, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(bookdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(readerdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(dashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
            .addComponent(details, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookdetailsActionPerformed
      details.setSelectedIndex(0);
      
    }//GEN-LAST:event_bookdetailsActionPerformed

    private void readerdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readerdetailsActionPerformed
       details.setSelectedIndex(1);
    }//GEN-LAST:event_readerdetailsActionPerformed

    private void dashboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard2ActionPerformed
       Home db2 = new Home();
       this.hide();
       db2.setVisible(true);
       
    }//GEN-LAST:event_dashboard2ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        
        try{
            
        String isbn=txtisbn.getText();
        String category=txtcategory.getText();
        String bookname=txtbookname.getText();
        String author=txtauthor.getText();
        String publisher=txtpublisher.getText();
        String marketprice=txtmarketprice.getText();
      
                
        Creaderbook Crb=new Creaderbook();
        Crb.submittedDetails(isbn,category,bookname,author,publisher,marketprice);
        
        ResultSet rs = Crb.viewBookDetails();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        //repeat nowiimata
        model.setRowCount(0);
            
            while(rs.next())
            {
               model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
         
            }
        
        }
          
        
        catch(NumberFormatException ex2)
        {
            JOptionPane.showMessageDialog(null,"Enter Valid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(InputMismatchException ex3)
        {
            JOptionPane.showMessageDialog(null,"Enter Invalid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
       
        catch(NullPointerException ex4)
        {
            JOptionPane.showMessageDialog(null, "Do not view null Data ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
    
        try{ 
        Creaderbook Crb=new Creaderbook();
        ResultSet rs = Crb.viewBookDetails();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        //repeat nowiimata
        model.setRowCount(0);
            
            while(rs.next())
            {
               model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
         
            }
        }
        
   
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
       
            
        
       
    }//GEN-LAST:event_viewbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        try{
       
        String isbn=txtisbn.getText();
        
        Creaderbook Crb=new Creaderbook();
        Crb.deleteDetails(isbn);
        
         //data show
        ResultSet rs = Crb.viewBookDetails();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        //repeat nowiimata
        model.setRowCount(0);
            
            while(rs.next())
            {
               model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
         
            }

        }
       catch(NumberFormatException ex2)
        {
            JOptionPane.showMessageDialog(null,"Enter Valid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(InputMismatchException ex3)
        {
            JOptionPane.showMessageDialog(null,"Enter Invalid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
       
        catch(NullPointerException ex4)
        {
            JOptionPane.showMessageDialog(null, "Do not view null Data ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
    //table ekee data  enwa textbox walata
      
        DefaultTableModel md2 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
         txtisbn.setText(md2.getValueAt(selectIndex, 0).toString());
         txtcategory.setText(md2.getValueAt(selectIndex,1).toString());
         txtbookname.setText(md2.getValueAt(selectIndex,2).toString());
         txtauthor.setText(md2.getValueAt(selectIndex,3).toString());
         txtpublisher.setText(md2.getValueAt(selectIndex,4).toString());
         txtmarketprice.setText(md2.getValueAt(selectIndex,5).toString());

         //delete karana id eka ganna wa table eken 
         deleteid.setText(md2.getValueAt(selectIndex, 0).toString());
                 
                 
                
    }//GEN-LAST:event_jTable1MouseClicked

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
      try{
          
        String isbn=txtisbn.getText();
        String category=txtcategory.getText();
        String bookname=txtbookname.getText();
        String author=txtauthor.getText();
        String publisher=txtpublisher.getText();
        String marketprice=txtmarketprice.getText();
      
        Creaderbook Crb=new Creaderbook();
        Crb.updatedDetails(isbn,category,bookname,author,publisher,marketprice);
                
        ResultSet rs = Crb.viewBookDetails();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            //repeat nowiimata
        model.setRowCount(0);
            
            while(rs.next())
            {
               model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
         
            }
            
        }
       catch(NumberFormatException ex2)
        {
            JOptionPane.showMessageDialog(null,"Enter Valid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(InputMismatchException ex3)
        {
            JOptionPane.showMessageDialog(null,"Enter Invalid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
       
        catch(NullPointerException ex4)
        {
            JOptionPane.showMessageDialog(null, "Do not view null Data ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
       
       
    }//GEN-LAST:event_updatebtnActionPerformed

    private void txtreadernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreadernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreadernameActionPerformed

    private void txtreaderaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreaderaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreaderaddressActionPerformed

    private void txtreaderphonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreaderphonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreaderphonenumberActionPerformed

    private void radiofemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiofemaleActionPerformed
        gender = radiofemale.getText();      
    }//GEN-LAST:event_radiofemaleActionPerformed

    private void readeraddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readeraddbtnActionPerformed
       try{
            
        String readerid=txtreaderid.getText();
        String readername=txtreadername.getText();
        int readerage=Integer.parseInt(txtreaderage.getText());
        String readergender=gender;
        String readeraddress=txtreaderaddress.getText();
        int readerphonenumber=Integer.parseInt(txtreaderphonenumber.getText());
      
                
        Creaderbook Crb=new Creaderbook();
        Crb.readersubmitteDetails(readerid,readername,readerage,readergender,readeraddress,readerphonenumber);
        
        ResultSet rs2 = Crb.viewReaderDetails();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        //repeat nowiimata
        model.setRowCount(0);
            
            while(rs2.next())
            {
               model.addRow(new String[]{rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6)});
         
            }
        
        }
          
        
        catch(NumberFormatException ex2)
        {
            JOptionPane.showMessageDialog(null,"Enter Valid Data ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(InputMismatchException ex3)
        {
            JOptionPane.showMessageDialog(null,"Enter Invalid Data ","Error",JOptionPane.ERROR_MESSAGE);
        }
       
        catch(NullPointerException ex4)
        {
            JOptionPane.showMessageDialog(null, "Do not view null Data ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
    }//GEN-LAST:event_readeraddbtnActionPerformed

    private void radiomaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiomaleActionPerformed
      
        gender = radiomale.getText();
    }//GEN-LAST:event_radiomaleActionPerformed

    private void readerupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readerupdatebtnActionPerformed
         try{
        String readerid=txtreaderid.getText();
        String readername=txtreadername.getText();
        int readerage=Integer.parseInt(txtreaderage.getText());
        String readergender=gender;
        String readeraddress=txtreaderaddress.getText();
        int readerphonenumber=Integer.parseInt(txtreaderphonenumber.getText());
      
        Creaderbook Crb=new Creaderbook();
        Crb.readerUpdatedDetails(readerid,readername,readerage,readergender,readeraddress,readerphonenumber);
                
        ResultSet rs2 = Crb.viewReaderDetails();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        //repeat nowiimata
        model.setRowCount(0);
            
            while(rs2.next())
            {
               model.addRow(new String[]{rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6)});
         
            }
        
        }
          
        
        catch(NumberFormatException ex2)
        {
            JOptionPane.showMessageDialog(null,"Enter Valid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(InputMismatchException ex3)
        {
            JOptionPane.showMessageDialog(null,"Enter Invalid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
       
        catch(NullPointerException ex4)
        {
            JOptionPane.showMessageDialog(null, "Do not view null Data ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
    }//GEN-LAST:event_readerupdatebtnActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel md3 = (DefaultTableModel)jTable2.getModel();
        int selectIndex = jTable2.getSelectedRow();
        
         txtreaderid.setText(md3.getValueAt(selectIndex, 0).toString());
         txtreadername.setText(md3.getValueAt(selectIndex,1).toString());
         txtreaderage.setText(md3.getValueAt(selectIndex,2).toString());
         txtreaderaddress.setText(md3.getValueAt(selectIndex,4).toString());
         txtreaderphonenumber.setText(md3.getValueAt(selectIndex,5).toString());

         //delete karana id eka ganna wa table eken 
         txtreaderdeleteid.setText(md3.getValueAt(selectIndex, 0).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void readerdeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readerdeletebtnActionPerformed
        try{
       
        String readerdeleteid=txtreaderdeleteid.getText();
        
        Creaderbook Crb=new Creaderbook();
        Crb.bookDeleteDetails(readerdeleteid);
        
         //data show
        ResultSet rs2 = Crb.viewReaderDetails();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        //repeat nowiimata
        model.setRowCount(0);
            
            while(rs2.next())
            {
               model.addRow(new String[]{rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6)});
         
            }

        }
       catch(NumberFormatException ex2)
        {
            JOptionPane.showMessageDialog(null,"Enter Valid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(InputMismatchException ex3)
        {
            JOptionPane.showMessageDialog(null,"Enter Invalid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
       
        catch(NullPointerException ex4)
        {
            JOptionPane.showMessageDialog(null, "Do not view null Data ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
    }//GEN-LAST:event_readerdeletebtnActionPerformed

    private void readerviewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readerviewbtnActionPerformed
       try{ 
        Creaderbook Crb=new Creaderbook();
        ResultSet rs2 = Crb.viewReaderDetails();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        //repeat nowiimata
        model.setRowCount(0);
            
            while(rs2.next())
            {
               model.addRow(new String[]{rs2.getString(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6)});
         
            }
        
        }
          
        
        catch(NumberFormatException ex2)
        {
            JOptionPane.showMessageDialog(null,"Enter Valid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(InputMismatchException ex3)
        {
            JOptionPane.showMessageDialog(null,"Enter Invalid Data","Error",JOptionPane.ERROR_MESSAGE);
        }
       
        catch(NullPointerException ex4)
        {
            JOptionPane.showMessageDialog(null, "Do not view null Data ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()); 
        }
       
    }//GEN-LAST:event_readerviewbtnActionPerformed

    private void txtreaderidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreaderidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreaderidActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(readerbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(readerbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(readerbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(readerbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new readerbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton bookdetails;
    private javax.swing.JButton dashboard2;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField deleteid;
    private javax.swing.JTabbedPane details;
    private javax.swing.ButtonGroup gendergroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton radiofemale;
    private javax.swing.JRadioButton radiomale;
    private javax.swing.JButton readeraddbtn;
    private javax.swing.JButton readerdeletebtn;
    private javax.swing.JButton readerdetails;
    private javax.swing.JButton readerupdatebtn;
    private javax.swing.JButton readerviewbtn;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtmarketprice;
    private javax.swing.JTextField txtpublisher;
    private javax.swing.JTextField txtreaderaddress;
    private javax.swing.JTextField txtreaderage;
    private javax.swing.JTextField txtreaderdeleteid;
    private javax.swing.JTextField txtreaderid;
    private javax.swing.JTextField txtreadername;
    private javax.swing.JTextField txtreaderphonenumber;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
