package homework.gui;

import javax.swing.*;
import javax.swing.table.*;
import java.lang.*;
import java.awt.*;


public class Customer extends JFrame {
    private JLabel actCustomerName;
    private JButton cSaveBtn;
    private JComboBox<String> cbSelectMovie;
    private JComboBox<String> cbSelectName;
    private JTable customerMoviesTable;
    private JLabel customerName;
    private JPanel customerOptionsPanel;
    private JPanel customerPanel;
    private JLabel giveBackLabel;
    private JRadioButton giveBackbtn;
    private JScrollPane movieTableScrollPane;
    private JLabel ownedMoviesLabel;
    private JLabel selectCustomer;
    // End of variables declaration  
    
    public Customer() {
        initCustomerComponents();
        setCustomerProperties();
    }

	private void initCustomerComponents() {
		customerPanel = new JPanel();
        customerOptionsPanel = new JPanel();
        customerName = new JLabel();
        ownedMoviesLabel = new JLabel();
        giveBackLabel = new JLabel();
        cbSelectMovie = new JComboBox();
        cSaveBtn = new JButton();
        actCustomerName = new JLabel();
        movieTableScrollPane = new JScrollPane();
        customerMoviesTable = new JTable();
        giveBackbtn = new JRadioButton();
        selectCustomer = new JLabel();
        cbSelectName = new JComboBox();

        customerOptionsPanel.setBackground(new Color(255, 204, 153));
        customerOptionsPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new Font("Times New Roman", 1, 14)))); // NOI18N

        customerName.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        customerName.setText("Name:");

        ownedMoviesLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        ownedMoviesLabel.setText("Owned Movies:");

        giveBackLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        giveBackLabel.setText("Give back the movie...:");

        cbSelectMovie.setModel(new DefaultComboBoxModel(new String[] { "movie 1", "movie 2", "movie 3", "movie 4" }));

        cSaveBtn.setBackground(new Color(255, 204, 153));
        cSaveBtn.setText("Save");

        actCustomerName.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        actCustomerName.setText("<customers name>");

        customerMoviesTable.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title", "Director", "Main character", "Production Year", "Expire Date", "Pirated"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class
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
        customerMoviesTable.setAutoscrolls(false);
        movieTableScrollPane.setViewportView(customerMoviesTable);

        giveBackbtn.setBackground(new Color(255, 204, 153));
        giveBackbtn.setText("Give Back");

        selectCustomer.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        selectCustomer.setText("Select a customer:");

        cbSelectName.setModel(new DefaultComboBoxModel(new String[] { "name 1", "name 2", "name 3", "name 4" }));

        GroupLayout customerOptionsPanelLayout = new GroupLayout(customerOptionsPanel);
        customerOptionsPanel.setLayout(customerOptionsPanelLayout);
        customerOptionsPanelLayout.setHorizontalGroup(
            customerOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customerOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ownedMoviesLabel)
                    .addComponent(movieTableScrollPane, GroupLayout.PREFERRED_SIZE, 568, GroupLayout.PREFERRED_SIZE)
                    .addGroup(customerOptionsPanelLayout.createSequentialGroup()
                        .addComponent(customerName)
                        .addGap(18, 18, 18)
                        .addComponent(actCustomerName))
                    .addGroup(customerOptionsPanelLayout.createSequentialGroup()
                        .addComponent(cSaveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(giveBackbtn))
                    .addGroup(customerOptionsPanelLayout.createSequentialGroup()
                        .addGroup(customerOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(selectCustomer)
                            .addComponent(cbSelectName, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(customerOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(cbSelectMovie, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                            .addComponent(giveBackLabel))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        customerOptionsPanelLayout.setVerticalGroup(
            customerOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customerOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(selectCustomer)
                    .addComponent(giveBackLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSelectName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSelectMovie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(customerOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(customerName)
                    .addComponent(actCustomerName))
                .addGap(27, 27, 27)
                .addComponent(ownedMoviesLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(movieTableScrollPane, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(customerOptionsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cSaveBtn)
                    .addComponent(giveBackbtn))
                .addContainerGap())
        );

        GroupLayout customerPanelLayout = new GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addComponent(customerOptionsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addComponent(customerOptionsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(customerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(customerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
	}
	
	private void setCustomerProperties(){
		this.setName("Customer Detials");
		this.setSize(620,610);
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
