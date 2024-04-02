
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



public class summarynew extends javax.swing.JInternalFrame {


    public summarynew() {
        initComponents();
        addRowToTable();
    }
    
    private String month;
    private int   waterminus, elecminus, commonminus , commonplus, waterplus, elecplus, roomplus, summ ;
    
     public summarynew( int waterminus, int elecminus , int commonminus, int commonplus, int waterplus, int elecplus, int roomplus){
        this.waterminus = waterminus;
        this.elecminus = elecminus;
        this.commonminus = commonminus;
        this.commonplus = commonplus;
        this.waterplus = waterplus;
        this.elecplus = elecplus;
        this.roomplus = roomplus;
        this.summ = ( this.commonplus+this.waterplus+this.elecplus+this.roomplus-this.waterminus-this.elecminus-this.commonminus);
        
    }
     
      public ArrayList ListMonth(){
        ArrayList<String> monthlist = new ArrayList<>();
       monthlist.add("January");monthlist.add("February");monthlist.add("March");monthlist.add("April");monthlist.add("May");monthlist.add("June");
       monthlist.add("July");monthlist.add("August");monthlist.add("September");monthlist.add("October");monthlist.add("November");monthlist.add("December");
        return monthlist;     
    }
      
       public ArrayList ListUsers(){
        ArrayList<summaryview>list = new ArrayList<summaryview>();
        summaryview s1 = new summaryview( 4, 5, 7, 88, 88, 55, 22);
        list.add(s1);
        //list.add(s2);
        return list;     
    }
       
        public void addRowToTable(){
        DefaultTableModel model = (DefaultTableModel) tasum.getModel();
        ArrayList<summaryview> list = ListUsers();
        Object rowData[] = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).waterminus;
            rowData[1] = list.get(i).waterminus;
            rowData[2] = list.get(i).elecminus;
            rowData[3] = list.get(i).commonminus;
            rowData[4] = list.get(i).commonplus;
            rowData[5] = list.get(i).waterplus;
            rowData[6] = list.get(i).elecplus;
            rowData[7] = list.get(i).roomplus;
            rowData[8] = list.get(i).summ;
            model.addRow(rowData);
        }

           
        }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tasum = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tasum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tasum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "month", "eleccost---", "watercost---", "common---", "elec+++", "water+++", "common+++", "room+++", "summary"
            }
        ));
        tasum.setRowHeight(34);
        tasum.setRowMargin(5);
        tasum.setShowGrid(true);
        jScrollPane2.setViewportView(tasum);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tasum;
    // End of variables declaration//GEN-END:variables
}
