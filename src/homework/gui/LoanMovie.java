package homework.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class LoanMovie extends JFrame{
    private JComboBox<String> cmbCustomer;
    private JLabel expireDateLabel;
    private JTextField expireDateTextField;
    private JLabel loanLabel;
    private JPanel loanPanel;
    private JLabel loanToLabel;
    private JButton saveLoanPanel;
    
    public LoanMovie() {
        initLoanMovieComponents();
        setLoanMovieProperties();
    }

    private void initLoanMovieComponents() {
        loanPanel = new JPanel();
        loanLabel = new JLabel();
        loanToLabel = new JLabel();
        cmbCustomer = new JComboBox();
        expireDateLabel = new JLabel();
        expireDateTextField = new JTextField();
        saveLoanPanel = new JButton();

        loanPanel.setBackground(Color.orange);
        loanPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 0), null));

        loanLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        loanLabel.setText("Loan your movie to:");

        loanToLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        loanToLabel.setText("Customer / Frineds name:");

        cmbCustomer.setModel(new DefaultComboBoxModel(new String[] { "name 1", "name 2", "name 3", "name 4", "name 5" }));
        cmbCustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmbCustomerActionPerformed(evt);
            }
        });

        expireDateLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        expireDateLabel.setText("Expire Date");

        saveLoanPanel.setBackground(Color.orange);
        saveLoanPanel.setText("Save");

        GroupLayout loanPanelLayout = new GroupLayout(loanPanel);
        loanPanel.setLayout(loanPanelLayout);
        loanPanelLayout.setHorizontalGroup(
            loanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(loanPanelLayout.createSequentialGroup()
                .addGroup(loanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(loanPanelLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(loanLabel)
                        .addGap(0, 134, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, loanPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveLoanPanel))
                    .addGroup(loanPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loanPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbCustomer, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loanToLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(loanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(expireDateLabel, GroupLayout.Alignment.TRAILING)
                            .addComponent(expireDateTextField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        loanPanelLayout.setVerticalGroup(
            loanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(loanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loanLabel)
                .addGap(18, 18, 18)
                .addGroup(loanPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(loanToLabel)
                    .addComponent(expireDateLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loanPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(expireDateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(saveLoanPanel)
                .addContainerGap())
        );

        GroupLayout loanLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(loanLayout);
        loanLayout.setHorizontalGroup(
            loanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(loanPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loanLayout.setVerticalGroup(
            loanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(loanPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    
    private void cmbCustomerActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }
    
    private void setLoanMovieProperties(){
        this.setName("Loan Movie");
        this.setSize(600,200);
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
