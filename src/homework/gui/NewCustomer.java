package homework.gui;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class NewCustomer extends JFrame{
    
    private JLabel Name;
    private JPanel newCustomerPanel;
    private JTextField newcustomerTextField;
    private JButton saveNewCustomerBtn;
    
    public NewCustomer() {
        initComponents();
        setNewCustomerProperties();
    }

    private void initComponents() {
        
        newCustomerPanel = new JPanel();
        Name = new JLabel();
        newcustomerTextField = new JTextField();
        saveNewCustomerBtn = new JButton();

        newCustomerPanel.setBackground(new Color(255, 153, 102));
        newCustomerPanel.setBorder(BorderFactory.createCompoundBorder(null, BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Add New Customer", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Times New Roman", 1, 14)))); // NOI18N

        Name.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        Name.setText("New Customer Name:");

        saveNewCustomerBtn.setBackground(new Color(255, 153, 102));
        saveNewCustomerBtn.setText("Save");

        GroupLayout newCustomerPanelLayout = new GroupLayout(newCustomerPanel);
        newCustomerPanel.setLayout(newCustomerPanelLayout);
        newCustomerPanelLayout.setHorizontalGroup(
            newCustomerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(newCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newCustomerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(Name)
                    .addComponent(newcustomerTextField, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, newCustomerPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveNewCustomerBtn)
                .addContainerGap())
        );
        newCustomerPanelLayout.setVerticalGroup(
            newCustomerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(newCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newcustomerTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveNewCustomerBtn)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(newCustomerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(newCustomerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        
        pack();
    }
    
    private void setNewCustomerProperties(){
    	this.setName("Add New Customer");
        this.setSize(600,175);
        this.setVisible(true);
        setCenter(this);   	
    }
    
    private void setCenter(JFrame ablak) {
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int x = (int) center.getX() - (ablak.getWidth() / 2);
        int y = (int) center.getY() - (ablak.getHeight() / 2);
        Point ablakCenter = new Point(x, y);
        ablak.setLocation(ablakCenter);
    }
}
