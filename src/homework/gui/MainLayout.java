package homework.gui;

import java.awt.GraphicsEnvironment;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.table.*;


	public class MainLayout extends JFrame implements ActionListener {
	    LoanMovie lMFrame;
	    NewCustomer newCustomerFrame;
	    Customer customerFrame;
	    private JPanel mainWindowPanel;
	    private JPanel detailsPanel;
	    private JPanel loanPanel;
	    private JPanel moviesTablePanel;
	    private JPanel newMoviePanel;
	    private JPanel popUpPanel;
	    private JPanel searchPanel;
	    
	    private JMenuBar menubar;
	    private JMenu fileMenu;
	    private JMenu additionalFeatures;
	    private JMenuItem loanMenuItem;
	    private JMenuItem addNewCustomer;
	    private JMenuItem customerDetailsItem;
	    private JMenuItem exitItem;
	    
	    private JPopupMenu loanMoviePopUp;
	    
	    private JLabel addNewMovie;
	    private JLabel advancedSearchLabel;
	    private JLabel directorLabel;
	    private JLabel directorLabel1;
	    private JLabel displayTitleLabel;
	    private JLabel displayTypeLabel;
	    private JLabel displayYearLabel;
	    private JLabel isPirated;
	    private JLabel isPirated1;
	    private JLabel isPiratedAnswer;
	    private JLabel mainCharacter;
	    private JLabel mainCharacterName;
	    private JLabel directorName;
	    private JLabel loanLabel;
	    private JLabel loanToLabel;
	    private JLabel mainCharacterLabel;
	    private JLabel ownedBy;
	    private JLabel titleLabel;
	    private JLabel titleLabel1;
	    private JLabel typeLabel;
	    private JLabel typeLabel1;
	    private JLabel yearOfProdLAbel;
	    private JLabel yearOfProdLAbel1;
	    private JLabel rentedLoanedToLabel;
	    
	    private JButton panikButton;
            private JButton addNewMovieButton;
	    private JButton saveBtn;
	    private JButton searchBtn;
	    private JRadioButton rbNo;
	    private JRadioButton rbYes;
	    private JButton deleteBtn;
	    
	    private JTextField mainCharacterTextField;
	    private JTextField newTitleTextField;
	    private JTextField newTypeTextField;
	    private JTextField newDirectorTextField;
	    private JTextField yearTextField;
	    private JTextField simpleSearch;
	    
	    private JSeparator newMovieSeparator;
	    private JSeparator searchFormsSeparator;
	    private JSeparator tableSaveSeparator;
	    
	    private JScrollPane movieTableScrollPane;
	    private JTable moviesTable;
	    private JComboBox<String> cmbCustomer;   
	    
	    private GroupLayout mainLayout;
	    // End of variables declaration                   

	    public MainLayout() {
	        initMainLayout();
	        setMainWindowProperties();
	        setCenter(this);
	    }

	    private void initMainLayout() {
	        LoanMovie frame;
	        mainWindowPanel = new JPanel();
	        mainLayout = new GroupLayout(mainWindowPanel);
	        
	        popUpPanel = new JPanel();
	        loanPanel = new JPanel();
	        detailsPanel = new JPanel();
	        searchPanel = new JPanel();
	        newMoviePanel = new JPanel();
	        moviesTablePanel = new JPanel();
	        
	        menubar = new JMenuBar();
	        fileMenu = new JMenu();
	        exitItem = new JMenuItem();
	        additionalFeatures = new JMenu();
	        loanMenuItem = new JMenuItem();
	        addNewCustomer = new JMenuItem();
	        customerDetailsItem = new JMenuItem();
	        
	        loanMoviePopUp = new JPopupMenu();
	        
	        loanLabel = new JLabel();
	        loanToLabel = new JLabel();
	        displayYearLabel = new JLabel();
	        yearOfProdLAbel = new JLabel();
	        rentedLoanedToLabel = new JLabel();
	        typeLabel = new JLabel();
	        advancedSearchLabel = new JLabel();
	        isPirated = new JLabel();
	        displayTitleLabel = new JLabel();
	        isPiratedAnswer = new JLabel();
	        titleLabel = new JLabel();
	        displayTypeLabel = new JLabel();
	        ownedBy = new JLabel();
	        mainCharacter = new JLabel();
	        mainCharacterName = new JLabel();
	        directorLabel1 = new JLabel();
	        directorName = new JLabel();
	        addNewMovie = new JLabel();
	        mainCharacterLabel = new JLabel();
	        typeLabel1 = new JLabel();
	        directorLabel = new JLabel();
	        titleLabel1 = new JLabel();
	        isPirated1 = new JLabel();
	        yearOfProdLAbel1 = new JLabel();
	        
	        newTitleTextField = new JTextField();
	        newTypeTextField = new JTextField();
	        simpleSearch = new JTextField();
	        mainCharacterTextField = new JTextField();
	        newDirectorTextField = new JTextField();
	        yearTextField = new JTextField();
	        
	        searchBtn = new JButton();
	        rbYes = new JRadioButton();
	        rbNo = new JRadioButton();
	        panikButton = new JButton();
                addNewMovieButton = new JButton();
	        saveBtn = new JButton();
	        deleteBtn = new JButton();
	        
	        searchFormsSeparator = new JSeparator();
	        newMovieSeparator = new JSeparator();
	        tableSaveSeparator = new JSeparator();
	        
	        cmbCustomer = new JComboBox();
	        movieTableScrollPane = new JScrollPane();
	        moviesTable = new JTable();
	        
	        
	        

	        loanMoviePopUp.addPopupMenuListener(new PopupMenuListener() {
	            @Override
	            public void popupMenuCanceled(PopupMenuEvent evt) {
	            }

	            @Override
	            public void popupMenuWillBecomeInvisible(PopupMenuEvent evt) {
	            }

	            @Override
	            public void popupMenuWillBecomeVisible(PopupMenuEvent evt) {
	                loanMoviePopUpPopupMenuWillBecomeVisible(evt);
	            }
	        });

	        loanPanel.setBackground(Color.orange);
	        loanPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 0), null));

	        loanLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        loanLabel.setText("Loan your movie to:");

	        loanToLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        loanToLabel.setText("Customer / Frineds name:");

	        cmbCustomer.setModel(new DefaultComboBoxModel(new String[]{"name 1", "name 2", "name 3", "name 4", "name 5"}));
	        cmbCustomer.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                cmbCustomerActionPerformed(evt);
	            }
	        });
	        
	        mainWindowPanel.setLayout(mainLayout);
	        
	        GroupLayout loanPanelLayout = new GroupLayout(loanPanel);
	        loanPanel.setLayout(loanPanelLayout);
	        loanPanelLayout.setHorizontalGroup(
	                loanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(loanPanelLayout.createSequentialGroup()
	                        .addGroup(loanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                .addGroup(loanPanelLayout.createSequentialGroup()
	                                        .addGap(131, 131, 131)
	                                        .addComponent(loanLabel))
	                                .addGroup(loanPanelLayout.createSequentialGroup()
	                                        .addContainerGap()
	                                        .addGroup(loanPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
	                                                .addComponent(cmbCustomer, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                                .addComponent(loanToLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
	                        .addContainerGap(144, Short.MAX_VALUE))
	        );
	        loanPanelLayout.setVerticalGroup(
	                loanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(loanPanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(loanLabel)
	                        .addGap(18, 18, 18)
	                        .addComponent(loanToLabel)
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(cmbCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addContainerGap(57, Short.MAX_VALUE))
	        );

	        GroupLayout popUpPanelLayout = new GroupLayout(popUpPanel);
	        popUpPanel.setLayout(popUpPanelLayout);
	        popUpPanelLayout.setHorizontalGroup(
	                popUpPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addComponent(loanPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        popUpPanelLayout.setVerticalGroup(
	                popUpPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addComponent(loanPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        );

	        

	        searchPanel.setBackground(new Color(153, 255, 153));

	        simpleSearch.setText("Search...");

	        searchBtn.setActionCommand("Go");
	        searchBtn.setFont(new Font("Dialog", 1, 14)); // NOI18N
	        searchBtn.setLabel("Go");

	        GroupLayout searchPanelLayout = new GroupLayout(searchPanel);
	        searchPanel.setLayout(searchPanelLayout);
	        searchPanelLayout.setHorizontalGroup(
	                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(searchPanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(simpleSearch, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
	                        .addComponent(searchBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addContainerGap())
	        );
	        searchPanelLayout.setVerticalGroup(
	                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(searchPanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                .addComponent(searchBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                                .addComponent(simpleSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        detailsPanel.setBackground(new Color(153, 255, 153));

	        displayYearLabel.setText("<year>");

	        yearOfProdLAbel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        yearOfProdLAbel.setText("Year of Production:");

	        rentedLoanedToLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        rentedLoanedToLabel.setText("Rented by / Loaned to:");

	        typeLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        typeLabel.setText("Type:");

	        advancedSearchLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        advancedSearchLabel.setText("Movie details");

	        isPirated.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        isPirated.setText("Pirated:");

	        displayTitleLabel.setText("<movie title>");

	        isPiratedAnswer.setText("< yes / no >");

	        titleLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        titleLabel.setText("Title:");

	        displayTypeLabel.setText("<movie type>");

	        ownedBy.setText("<name of customer / friend>");

	        mainCharacter.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        mainCharacter.setText("Main Character:");

	        mainCharacterName.setText("<character name>");

	        directorLabel1.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        directorLabel1.setText("Director");

	        directorName.setText("<name of director>");

	        GroupLayout detailsPanelLayout = new GroupLayout(detailsPanel);
	        detailsPanel.setLayout(detailsPanelLayout);
	        detailsPanelLayout.setHorizontalGroup(
	                detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(detailsPanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                .addGroup(detailsPanelLayout.createSequentialGroup()
	                                        .addGap(148, 148, 148)
	                                        .addComponent(advancedSearchLabel)
	                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                .addGroup(detailsPanelLayout.createSequentialGroup()
	                                        .addGroup(detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                                .addComponent(yearOfProdLAbel)
	                                                .addComponent(isPirated)
	                                                .addComponent(rentedLoanedToLabel)
	                                                .addComponent(typeLabel)
	                                                .addComponent(mainCharacter)
	                                                .addComponent(titleLabel)
	                                                .addComponent(directorLabel1))
	                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addGroup(detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                                .addComponent(ownedBy, GroupLayout.Alignment.TRAILING)
	                                                .addComponent(isPiratedAnswer, GroupLayout.Alignment.TRAILING)
	                                                .addComponent(displayYearLabel, GroupLayout.Alignment.TRAILING)
	                                                .addComponent(displayTypeLabel, GroupLayout.Alignment.TRAILING)
	                                                .addComponent(mainCharacterName, GroupLayout.Alignment.TRAILING)
	                                                .addComponent(directorName, GroupLayout.Alignment.TRAILING)
	                                                .addComponent(displayTitleLabel, GroupLayout.Alignment.TRAILING))
	                                        .addContainerGap())))
	        );
	        detailsPanelLayout.setVerticalGroup(
	                detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(detailsPanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(advancedSearchLabel)
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGroup(detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                .addComponent(titleLabel)
	                                .addComponent(displayTitleLabel))
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                .addComponent(directorLabel1)
	                                .addComponent(directorName))
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                .addComponent(mainCharacter)
	                                .addComponent(mainCharacterName))
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                .addComponent(displayTypeLabel)
	                                .addComponent(typeLabel))
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                .addComponent(displayYearLabel, GroupLayout.Alignment.TRAILING)
	                                .addComponent(yearOfProdLAbel))
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                .addComponent(isPirated)
	                                .addComponent(isPiratedAnswer))
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(detailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                .addComponent(rentedLoanedToLabel)
	                                .addComponent(ownedBy))
	                        .addGap(37, 37, 37))
	        );

	        newMoviePanel.setBackground(new Color(153, 255, 153));

	        addNewMovie.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        addNewMovie.setText("Add New Movie");

	        rbNo.setBackground(new Color(153, 255, 153));
	        rbNo.setText("No");
	        rbNo.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent evt) {
	                rbNoActionPerformed(evt);
	            }
	        });

	        newTitleTextField.setToolTipText("New Title");

	        titleLabel1.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        titleLabel1.setText("Title:");

	        rbYes.setBackground(new Color(153, 255, 153));
	        rbYes.setText("Yes");

	        isPirated1.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        isPirated1.setText("Pirated:");

	        mainCharacterLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        mainCharacterLabel.setText("Main Character:");

	        typeLabel1.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        typeLabel1.setText("Type:");

	        directorLabel.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        directorLabel.setText("Director");

	        yearOfProdLAbel1.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
	        yearOfProdLAbel1.setText("Year of Production:");

	        GroupLayout newMoviePanelLayout = new GroupLayout(newMoviePanel);
	        newMoviePanel.setLayout(newMoviePanelLayout);
	        newMoviePanelLayout.setHorizontalGroup(
	                newMoviePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(newMoviePanelLayout.createSequentialGroup()
	                        .addGroup(newMoviePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                .addGroup(newMoviePanelLayout.createSequentialGroup()
	                                        .addContainerGap()
	                                        .addGroup(newMoviePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                                .addComponent(newTitleTextField, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
	                                                .addComponent(titleLabel1)
	                                                .addComponent(typeLabel1)
	                                                .addComponent(newTypeTextField, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
	                                                .addGroup(newMoviePanelLayout.createSequentialGroup()
	                                                        .addComponent(rbYes)
	                                                        .addGap(18, 18, 18)
	                                                        .addComponent(rbNo))
	                                                .addComponent(isPirated1))
	                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                        .addGroup(newMoviePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                                .addComponent(yearOfProdLAbel1, GroupLayout.Alignment.TRAILING)
	                                                .addComponent(newDirectorTextField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
	                                                .addComponent(directorLabel, GroupLayout.Alignment.TRAILING)
	                                                .addComponent(mainCharacterTextField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
	                                                .addComponent(mainCharacterLabel, GroupLayout.Alignment.TRAILING)
	                                                .addComponent(yearTextField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
	                                .addGroup(newMoviePanelLayout.createSequentialGroup()
	                                        .addGap(151, 151, 151)
	                                        .addComponent(addNewMovie)))
	                        .addContainerGap())
	        );
	        newMoviePanelLayout.setVerticalGroup(
	                newMoviePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(newMoviePanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(addNewMovie)
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addGroup(newMoviePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                .addComponent(titleLabel1)
	                                .addComponent(mainCharacterLabel))
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(newMoviePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                .addComponent(newTitleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                                .addComponent(mainCharacterTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	                        .addGroup(newMoviePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                .addGroup(newMoviePanelLayout.createSequentialGroup()
	                                        .addGroup(newMoviePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                                .addComponent(typeLabel1)
	                                                .addComponent(directorLabel))
	                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(newTypeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                                        .addGap(18, 18, 18)
	                                        .addComponent(isPirated1)
	                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                                        .addGroup(newMoviePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                                .addComponent(rbYes)
	                                                .addComponent(rbNo)))
	                                .addGroup(newMoviePanelLayout.createSequentialGroup()
	                                        .addGap(21, 21, 21)
	                                        .addComponent(newDirectorTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                                        .addGap(18, 18, 18)
	                                        .addComponent(yearOfProdLAbel1)
	                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(yearTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	                        .addContainerGap(26, Short.MAX_VALUE))
	        );

	        addNewMovie.getAccessibleContext().setAccessibleName("addNewMovie");

	        panikButton.setBackground(new Color(0, 204, 153));
	        panikButton.setForeground(new Color(0, 204, 102));
	        panikButton.setBorderPainted(true);
                
                addNewMovieButton.setBackground(new Color(0, 204, 153));
                addNewMovieButton.setBorderPainted(true);
                addNewMovieButton.setText("Add!");

	        GroupLayout mainWindowPanelLayout = new GroupLayout(mainWindowPanel);
	        mainWindowPanel.setLayout(mainWindowPanelLayout);
	        mainWindowPanelLayout.setHorizontalGroup(
	                mainWindowPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(mainWindowPanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(mainWindowPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                .addComponent(searchFormsSeparator, GroupLayout.Alignment.TRAILING)
	                                .addComponent(newMovieSeparator)
	                                .addComponent(newMoviePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(searchPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(detailsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addGroup(GroupLayout.Alignment.TRAILING, mainWindowPanelLayout.createSequentialGroup()
	                                        .addGap(0, 0, Short.MAX_VALUE)
	                                        .addComponent(panikButton, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(addNewMovieButton, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
	                        .addContainerGap())
	        );
	        mainWindowPanelLayout.setVerticalGroup(
	                mainWindowPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(mainWindowPanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(searchFormsSeparator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
	                        .addGap(19, 19, 19)
	                        .addComponent(detailsPanel, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(newMovieSeparator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(newMoviePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(panikButton, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
	                        //.addGap(9, 9, 9)
                                .addComponent(addNewMovieButton, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	                        //.addGap(2, 2, 2)
                        )
	        );

	        moviesTablePanel.setBackground(new Color(0, 204, 153));
	        moviesTablePanel.setBorder(BorderFactory.createCompoundBorder(null, BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
	                "Movies", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Times New Roman", 1, 14)))); // NOI18N

	        moviesTable.setModel(new DefaultTableModel(
	                new Object[][]{
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null},
	                    {null, null, null, null, null, null, null}
	                },
	                new String[]{
	                    "Title", "Director", "Main character", "Production Year", "Expire Date", "Pirated", "Rented / Loaned"
	                }
	        ) {
	            Class[] types = new Class[]{
	                String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class, Boolean.class
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types[columnIndex];
	            }
	        });
	        moviesTable.setAutoscrolls(false);
	        movieTableScrollPane.setViewportView(moviesTable);

	        saveBtn.setBackground(new Color(0, 204, 153));
	        saveBtn.setText("Save");
	        saveBtn.setActionCommand("save");

	        deleteBtn.setBackground(new Color(0, 204, 153));
	        deleteBtn.setText("Delete");

	        GroupLayout moviesTablePanelLayout = new GroupLayout(moviesTablePanel);
	        moviesTablePanel.setLayout(moviesTablePanelLayout);
	        moviesTablePanelLayout.setHorizontalGroup(
	                moviesTablePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(moviesTablePanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(moviesTablePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                                .addGroup(moviesTablePanelLayout.createSequentialGroup()
	                                        .addGap(0, 0, Short.MAX_VALUE)
	                                        .addComponent(deleteBtn, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
	                                        .addGap(18, 18, 18)
	                                        .addComponent(saveBtn, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
	                                .addComponent(movieTableScrollPane, GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
	                                .addComponent(tableSaveSeparator))
	                        .addContainerGap())
	        );
	        moviesTablePanelLayout.setVerticalGroup(
	                moviesTablePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(moviesTablePanelLayout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(movieTableScrollPane, GroupLayout.PREFERRED_SIZE, 526, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(tableSaveSeparator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
	                        .addGroup(moviesTablePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                                .addComponent(deleteBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
	                                .addComponent(saveBtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
	                        .addContainerGap())
	        );

	        menubar.setBackground(new Color(51, 255, 102));

	        fileMenu.setText("File");

	        exitItem.setText("Exit");
	        exitItem.setToolTipText("Exit ");
	        exitItem.setName("exitItem"); // NOI18N
	        exitItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent evt) {
	                exitItemActionPerformed(evt);
	            }
	        });
	        fileMenu.add(exitItem);
	        

	        menubar.add(fileMenu);

	        additionalFeatures.setText("Additional features");

	        loanMenuItem.setText("Loan Movie");
	        additionalFeatures.add(loanMenuItem);
	        loanMenuItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                LoanMovie lMFrame = new LoanMovie();
	                lMFrame.setVisible(true);
	            }
	        });

	        addNewCustomer.setText("Add new customer");
	        additionalFeatures.add(addNewCustomer);
	        
	        addNewCustomer.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                NewCustomer newCustomerFrame = new NewCustomer();
	                newCustomerFrame.setVisible(true);
	            }
	        });

	        customerDetailsItem.setText("Customer Details");
	        additionalFeatures.add(customerDetailsItem);
	        customerDetailsItem.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					Customer customerFrame = new Customer();
					customerFrame.setVisible(true);
					}
	        });

	        menubar.add(additionalFeatures);

	        setJMenuBar(menubar);

	        GroupLayout layout = new GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(mainWindowPanel, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(moviesTablePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addContainerGap())
	        );
	        layout.setVerticalGroup(
	                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	                                .addComponent(mainWindowPanel, GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
	                                .addComponent(moviesTablePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addContainerGap(13, Short.MAX_VALUE))
	        );

	        pack();
	    }

	    private void setMainWindowProperties(){
	    	setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setBackground(new Color(0, 204, 204));
	        setPreferredSize(new Dimension(1200, 720));

	        mainWindowPanel.setBackground(new Color(0, 204, 153));
	        mainWindowPanel.setBorder(BorderFactory.createCompoundBorder(null, BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
	                "Search / Details / New Movie", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Times New Roman", 1, 14)))); // NOI18N
	        mainWindowPanel.setAutoscrolls(true);
	        mainWindowPanel.setName("Movies Archive"); // NOI18N
	        mainWindowPanel.setPreferredSize(new Dimension(445, 720));
	        this.setResizable(false);
	        setCenter(this);
		} 
	    private void rbNoActionPerformed(ActionEvent evt) {
	        // TODO add your handling code here:
	    }

	    private void exitItemActionPerformed(ActionEvent evt) {
	        System.exit(0);
	    }

	    private void cmbCustomerActionPerformed(ActionEvent evt) {
	        // TODO add your handling code here:
	    }

	    private void loanMoviePopUpPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
	        // TODO add your handling code here:
	    }

	    private void setCenter(JFrame ablak) {  //ablak k�z�pen ind�t�sa
	        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
	        int x = (int) center.getX() - (ablak.getWidth() / 2);
	        int y = (int) center.getY() - (ablak.getHeight() / 2);
	        Point ablakCenter = new Point(x, y);
	        ablak.setLocation(ablakCenter);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }
}
