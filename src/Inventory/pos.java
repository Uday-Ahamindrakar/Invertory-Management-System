
package Inventory;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;


public class pos extends javax.swing.JFrame {

    
   
    
    String lname;
    public pos() {
    	getContentPane().setBackground(new Color(175, 238, 238));
        
        initComponents();
        
        
       //load();

    }
     public pos(String name) {
        
        initComponents();
       //load();
       this.lname = name;
       txtname.setText(lname);

    }
    
    
    
    
    
  Connection con1;
  PreparedStatement insert;
  ResultSet rs1;
 DefaultTableModel model = new DefaultTableModel();
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBackground(new Color(240, 255, 255));
        jLabel6 = new javax.swing.JLabel();
        procode = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtproduct = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        txtpay = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtbal = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Management System - Billing");

        jPanel1.setBackground(new Color(255, 215, 0));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Brand");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Billing");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Exit");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cashier");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(29)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel15)
        				.addComponent(jLabel3)
        				.addComponent(jLabel2)
        				.addComponent(jLabel4)
        				.addComponent(jLabel13)
        				.addComponent(jLabel16))
        			.addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(61)
        			.addComponent(jLabel2)
        			.addGap(52)
        			.addComponent(jLabel4)
        			.addGap(54)
        			.addComponent(jLabel3)
        			.addGap(66)
        			.addComponent(jLabel15)
        			.addGap(59)
        			.addComponent(jLabel16)
        			.addGap(73)
        			.addComponent(jLabel13)
        			.addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jLabel6.setText("Product Code");

        procode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procodeActionPerformed(evt);
            }
        });
        procode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                procodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                procodeKeyTyped(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product code", "Product Name", "Price", "Qty", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel8.setText("Product Name");

        jLabel9.setText("Price");

        jLabel10.setText("Qty");

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Sub Total");

        jLabel11.setText("Pay");

        jLabel12.setText("Balance");

        txtbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalActionPerformed(evt);
            }
        });

        jButton4.setText("Pay Invoice");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Add Products");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(procode, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel12)
                        .addGap(30, 30, 30)
                        .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(procode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))))
        );

        txtname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(0, 51, 255));

        jLabel14.setFont(new Font("Tahoma", Font.BOLD, 36)); // NOI18N
        jLabel14.setText("Billing ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(742)
        					.addComponent(txtname)
        					.addContainerGap())
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
        						.addGap(335)))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(txtname, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
        			.addGap(9)
        			.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addGap(58)
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(16, Short.MAX_VALUE))
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    
    
    
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
   

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        model.removeRow(jTable1.getSelectedRow());
        int sum = 0;
        for(int i = 0; i < jTable1.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(jTable1.getValueAt(i, 4).toString());
        }   
        txtsub.setText(Integer.toString(sum));  

    }//GEN-LAST:event_jButton2ActionPerformed

    private void procodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_procodeKeyTyped
        // TODO add your handling code here:       
    }//GEN-LAST:event_procodeKeyTyped

    public void pos()
    {
        String procod =procode.getText();     
            try {
                Class.forName("com.mysql.jdbc.Driver");       
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/javapos","root","");
                insert = con1.prepareStatement("SELECT * FROM product where barcode = ? ");
                insert.setString(1,procod);
                ResultSet Rs = insert.executeQuery();               
                while(Rs.next())
                   { 
                    int qty;
                    qty = Rs.getInt("qty");  
                    int price =  Integer.parseInt(txtprice.getText());
                    int qty1 =  Integer.parseInt(txtqty.getText());      
                    int tot = price * qty1;                   
                   if(qty1 >= qty)
                    {
                       JOptionPane.showMessageDialog(null,"Available Product" + " = " + qty);
                       JOptionPane.showMessageDialog(null, "Qty is not Enough");
                    }      
                    else
                   {  
                     model = (DefaultTableModel) jTable1.getModel();      
                     DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                     centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                     jTable1.setDefaultRenderer(String.class, centerRenderer);
                      model.addRow(new Object[]
                   {         
                      procode.getText(),
                      txtproduct.getText(),
                      txtprice.getText(),
                      txtqty.getText(),
                      tot,
                  });       
                    int sum = 0;
                    for(int i = 0; i < jTable1.getRowCount(); i++)
                    {
                        sum = sum + Integer.parseInt(jTable1.getValueAt(i, 4).toString());
                    }   
                    txtsub.setText(Integer.toString(sum)); 
                    txtsub.setText(Integer.toString(sum)); 
                 procode.setText("");
                txtproduct.setText("");
                txtprice.setText("");
                txtqty.setText("");                  
            }
    }
     } catch (ClassNotFoundException ex) {
                Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void pos1()
    {
        
      
            if(txtproduct.getText().isEmpty() && txtprice.getText().isEmpty() && txtqty.getText().isEmpty())           
        {       
             JOptionPane.showMessageDialog(this, "Fill all Fields");         
        }              
        else
        {           
      
                
                int price =  Integer.parseInt(txtprice.getText());
                int qty1 =  Integer.parseInt(txtqty.getText());
                 int tot = price * qty1;  
                 model = (DefaultTableModel) jTable1.getModel();      
                 DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                 centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                 jTable1.setDefaultRenderer(String.class, centerRenderer);
                  model.addRow(new Object[]
                {         
                  procode.getText(),
                  txtproduct.getText(),
                  txtprice.getText(),
                  txtqty.getText(),
                  tot,
                });                     
                int sum = 0;
                for(int i = 0; i < jTable1.getRowCount(); i++)
                {
                    sum = sum + Integer.parseInt(jTable1.getValueAt(i, 4).toString());
                }   
                txtsub.setText(Integer.toString(sum)); 
                 procode.setText("");
                txtproduct.setText("");
                txtprice.setText("");
                txtqty.setText("");             
        
        
      }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void procodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_procodeKeyPressed
        // TODO add your handling code here:
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
      
            try {
                
               // System.out.println("hi");
                String procod =procode.getText();
                
                con1 = DBconnection.DBconnect();
              
                insert = con1.prepareStatement("select * from product where barcode = ? ");
                insert.setString(1,procod);
                rs1 = insert.executeQuery();
                
              
                
                if(rs1.next()==false)
                {
                    
                    
                    JOptionPane.showMessageDialog(null, "Barcode not Found");
                }
                else
                {
                    String productname = rs1.getString("productname");
                    String price = rs1.getString("retailprice");
                    
                    txtproduct.setText(productname.trim());
                    txtprice.setText(price);
                }
                
                
                
                
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(brand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_procodeKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            pos();

           
    }//GEN-LAST:event_jButton3ActionPerformed

    


     public void makeConnection() 
 {
     
    try{ 
     
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
     LocalDateTime now = LocalDateTime.now();  
     String date = dtf.format(now);
     
     String subtot =  txtsub.getText();
     String name =  txtname.getText();
     String pay =  txtpay.getText();
     String bal =  txtbal.getText();
    
    
     String product_id = "";
     String price = "";
     String qty1 = "";
     int total = 0;
     int lastinsertid=0;
     con1 = DBconnection.DBconnect(); 
     
    
    String query1 = "insert into sales (date,subtotal,cashier,pay,balance)values(?,?,?,?,?)";
    insert = con1.prepareStatement(query1,Statement.RETURN_GENERATED_KEYS);
  
   insert.setString(1, date);    
   insert.setString (2, subtot);
    insert.setString (3, name);
   insert.setString(4, pay);   
   insert.setString (5, bal); 
   insert.executeUpdate(); 
   ResultSet generatedKeyResult = insert.getGeneratedKeys();

       if (generatedKeyResult.next()) 
       {
          lastinsertid = generatedKeyResult.getInt(1);
      }    
    //System.out.println("Inserted record's ID: " + lastinsertid);   
  
  
  int rows=jTable1.getRowCount();
  String queryco1 = "Insert into sales_product(sales_id,product_id,sell_price,qty,total)values(?,?,?,?,?)";    
  PreparedStatement preparedStmt1 = con1.prepareStatement(queryco1);

  for (int i = 0; i < jTable1.getRowCount(); i++)      
  {        
    product_id = (String)jTable1.getValueAt(i, 0);
    price = (String)jTable1.getValueAt(i, 2);  
    qty1 = (String)jTable1.getValueAt(i, 3); 
    total = (Integer)jTable1.getValueAt(i, 4); 

    preparedStmt1.setInt(1, lastinsertid);
    preparedStmt1.setString(2, product_id);
    preparedStmt1.setString(3, price);
    preparedStmt1.setString(4, qty1);
    preparedStmt1.setInt(5, total);
    preparedStmt1.executeUpdate();      
      
  }
  
     String sqlupdate= "update product set qty= qty-? where barcode=? ";
     preparedStmt1=con1.prepareStatement(sqlupdate);
      
   for (int i = 0; i < jTable1.getRowCount(); i++)      
  {        
    product_id = (String)jTable1.getValueAt(i, 0);
    qty1 = (String)jTable1.getValueAt(i, 3); 
     
    preparedStmt1.setString(1, qty1);
    preparedStmt1.setString(2, product_id);    
    preparedStmt1.execute();
  
  }
   
  preparedStmt1.addBatch();
  JOptionPane.showMessageDialog(null, "Successfully Save");    
      
}
catch(SQLException | HeadlessException e){
  JOptionPane.showMessageDialog(this,e.getMessage());

}
     
 }

    private void txtbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        int pay = Integer.parseInt(txtpay.getText());
        int total = Integer.parseInt(txtsub.getText());
        
        int bal = pay - total;
        
        txtbal.setText(String.valueOf(bal));
//        
//         print();
       makeConnection();
         
         model.setRowCount(0);
         txtsub.setText("");
         txtpay.setText("");
        txtbal.setText("");
        procode.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void procodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procodeActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        category b = new category();
        b.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        brand b = new brand();
        b.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        product p = new product();
        p.setVisible(true);
        this.hide();;
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
           pos p = new pos();
           p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        
         cashier p = new cashier();
          p.setVisible(true);
          this.hide();
        
        
    }//GEN-LAST:event_jLabel13MouseClicked

    
 public void print()
 {
     
         String sub = txtsub.getText();
         String pay1 = txtpay.getText();
         String bal1 = txtbal.getText();
        
        try {
            new print1(sub,pay1,bal1,jTable1.getModel()).setVisible(true);
            
            
            
            
        } catch (PrinterException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
 }
    
    
    
    
    


    
    
    
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
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField procode;
    private javax.swing.JTextField txtbal;
    private javax.swing.JLabel txtname;
    private javax.swing.JTextField txtpay;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtproduct;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables

    private void publish(DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
