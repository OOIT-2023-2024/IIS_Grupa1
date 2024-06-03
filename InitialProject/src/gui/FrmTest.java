package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroupBoje = new ButtonGroup();
	private DefaultListModel<String> dlm = new DefaultListModel<String>();
	private JLabel lblCrvenaBoja;
	private JLabel lblPlava;
	private JLabel lblZuta;
	private JTextField txtUnosBoje;
	private DlgTest dialog = new DlgTest();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmTest() {
		setTitle("FrmTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlCenter.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		JToggleButton tglbtnCrvena = new JToggleButton("Crvena");
		tglbtnCrvena.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dlm.addElement(lblCrvenaBoja.getText());
				lblCrvenaBoja.setForeground(Color.RED);
				lblPlava.setForeground(Color.BLACK);
				lblZuta.setForeground(Color.BLACK);
			}
		});
		buttonGroupBoje.add(tglbtnCrvena);
		GridBagConstraints gbc_tglbtnCrvena = new GridBagConstraints();
		gbc_tglbtnCrvena.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnCrvena.gridx = 0;
		gbc_tglbtnCrvena.gridy = 0;
		pnlCenter.add(tglbtnCrvena, gbc_tglbtnCrvena);
		
		lblCrvenaBoja = new JLabel("Crvena boja");
		GridBagConstraints gbc_lblCrvenaBoja = new GridBagConstraints();
		gbc_lblCrvenaBoja.anchor = GridBagConstraints.EAST;
		gbc_lblCrvenaBoja.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvenaBoja.gridx = 1;
		gbc_lblCrvenaBoja.gridy = 0;
		pnlCenter.add(lblCrvenaBoja, gbc_lblCrvenaBoja);
		
		JToggleButton tglbtnPlava = new JToggleButton("Plava");
		tglbtnPlava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dlm.addElement(lblPlava.getText());
				lblPlava.setForeground(Color.RED);
				lblCrvenaBoja.setForeground(Color.BLACK);
				lblZuta.setForeground(Color.BLACK);
			}
		});
		
		txtUnosBoje = new JTextField();
		txtUnosBoje.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					dlm.addElement(txtUnosBoje.getText());
					txtUnosBoje.setText("");
				}
			}
		});
		GridBagConstraints gbc_txtUnosBoje = new GridBagConstraints();
		gbc_txtUnosBoje.insets = new Insets(0, 0, 5, 0);
		gbc_txtUnosBoje.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUnosBoje.gridx = 2;
		gbc_txtUnosBoje.gridy = 0;
		pnlCenter.add(txtUnosBoje, gbc_txtUnosBoje);
		txtUnosBoje.setColumns(10);
		buttonGroupBoje.add(tglbtnPlava);
		GridBagConstraints gbc_tglbtnPlava = new GridBagConstraints();
		gbc_tglbtnPlava.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPlava.gridx = 0;
		gbc_tglbtnPlava.gridy = 1;
		pnlCenter.add(tglbtnPlava, gbc_tglbtnPlava);
		
		lblPlava = new JLabel("Plava boja");
		GridBagConstraints gbc_lblPlava = new GridBagConstraints();
		gbc_lblPlava.anchor = GridBagConstraints.WEST;
		gbc_lblPlava.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlava.gridx = 1;
		gbc_lblPlava.gridy = 1;
		pnlCenter.add(lblPlava, gbc_lblPlava);
		
		JToggleButton tglbtnZuta = new JToggleButton("Zuta");
		tglbtnZuta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dlm.addElement(lblZuta.getText());
				lblZuta.setForeground(Color.RED);
				lblCrvenaBoja.setForeground(Color.BLACK);
				lblPlava.setForeground(Color.BLACK);
			}
		});
		buttonGroupBoje.add(tglbtnZuta);
		GridBagConstraints gbc_tglbtnZuta = new GridBagConstraints();
		gbc_tglbtnZuta.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnZuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnZuta.gridx = 0;
		gbc_tglbtnZuta.gridy = 2;
		pnlCenter.add(tglbtnZuta, gbc_tglbtnZuta);
		
		lblZuta = new JLabel("Zuta boja");
		GridBagConstraints gbc_lblZuta = new GridBagConstraints();
		gbc_lblZuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblZuta.anchor = GridBagConstraints.WEST;
		gbc_lblZuta.gridx = 1;
		gbc_lblZuta.gridy = 2;
		pnlCenter.add(lblZuta, gbc_lblZuta);
		
		JComboBox<String> cmbDodatneBoje = new JComboBox<String>();
		cmbDodatneBoje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(cmbDodatneBoje.getSelectedItem().toString());
			}
		});
		cmbDodatneBoje.setModel(new DefaultComboBoxModel(new String[] {"narandzasta", "ljubicasta", "zelena"}));
		GridBagConstraints gbc_cmbDodatneBoje = new GridBagConstraints();
		gbc_cmbDodatneBoje.insets = new Insets(0, 0, 0, 5);
		gbc_cmbDodatneBoje.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbDodatneBoje.gridx = 0;
		gbc_cmbDodatneBoje.gridy = 3;
		pnlCenter.add(cmbDodatneBoje, gbc_cmbDodatneBoje);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 3;
		pnlCenter.add(scrollPane, gbc_scrollPane);
		
		JList<String> listBoje = new JList<String>();
		scrollPane.setViewportView(listBoje);
		listBoje.setModel(dlm);
		
		JPanel pnlNorth = new JPanel();
		pnlNorth.setBackground(new Color(0, 255, 0));
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("Zadatak 1");
		lblNaslov.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnlNorth.add(lblNaslov);
		
		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
		JButton btnKlik = new JButton("Klikni me");
		btnKlik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Antistres dugme :)",
						"Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		pnlSouth.add(btnKlik);
		
		JButton btnNovaBoja = new JButton("Dodaj  boju");
		btnNovaBoja.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dialog.setVisible(true);
				if(dialog.isOk == true) {
					dlm.addElement(dialog.txtRed.getText() + " " + dialog.txtGreen.getText() 
					+ " " + dialog.txtBlue.getText());
					pnlSouth.setBackground(new Color(
							Integer.parseInt(dialog.txtRed.getText()),
							Integer.parseInt(dialog.txtGreen.getText()),
							Integer.parseInt(dialog.txtBlue.getText())
							));
				}
			}
		});
		pnlSouth.add(btnNovaBoja);
	}

}
