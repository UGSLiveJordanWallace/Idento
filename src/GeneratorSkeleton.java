import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

import java.text.NumberFormat;
import java.util.Random;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Color;

public class GeneratorSkeleton extends JFrame implements ActionListener{
	public static String names[] = 
		{"Johnny Tess", "Christopher Robin", "Michael Beasley",
		"Barlincle Jones", "Steven Brown", "Farkle Thompson", 
		"Shawn White", "George Reaves", "Austin Reeves", 
		"Karl Darron", "Fulton John", "Jarred Mark", 
		"Anthony Willis", "Dorrel Stevens", "Matt Colbo", 
		"Austin Powell", "Richie Edwards", "Collin Brown", 
		"Asher Reeves", "Coligula Holt", "Lance Johnson", 
		"Marty Gelbert", "Austin Power", "Justin Garcia",
		"George Mason","Megan Johnson", "Holly West", "Sharon Cunningham",
		"Aretha Muldro", "Theresa Scott", "Alena Mark", 
		"Yudle Francket", "Shelly PriceHall", "Sharon Michael",
		"Frida Pinkett", "Sherril George", "Michelle Houston",
		"Karen Torley", "Trina May", "Sharon Gilgeous", 
		"Whitney Aldridge", "Tory Edwards", "Piper West",
		"Trinity Holmes", "Megan Theeeeeeeeeeeee Stalfion", "Car in a bee"};
	
	public static JLabel lblNewLabel = new JLabel(names[(int) (Math.random() * names.length)]);
	
	public static String ss;
	
	public static String emails[] = 
		{"mcmg@gmail.com", "TheGuy@hotmail.com", "deadinside@gmail.com", "24/7@gmail.com", "lol@gmail.com","bddb@hotmail.com",
		"forever5656@hotmail.com", "mimadkaka@hustletussle.com", "dsakhria.loutfif@mixalo.com", "2scinjcisark@hggpxzvxg.ml",
		"zmohamed.mando939@gmail.com", "wevelinak@gmail.com", "nrobeooeborr@civoo.com", "aredenthor.mercay@mymailcr.com", 
		"dsnehalchokshi274@gmail.com", "ecezar@gmail.com", "dfuschias.collecl@gmail.com", "zerick.esparza.54@gmail.com",
		"6go.right.way709t@gmail.com", "7otonielp@gmail.com", "olawtifoon@hotmail.com", "tfouf536@gmail.com", "9didonamalg@gmail.com", 
		"qjamal.saleem41c@hotmail.com", "9aboiraqkingo@gmail.com", "xprojekpa@hotmail.com", "ecristobenamar@hotmail.com", "8adeshra@hotmail.com", 
		"gmohsin.stonu@hotmail.com", "cnzhhwryg@hotmail.com", "rsnouci_nt@hotmail.com", "4t.grauwmans@hotmail.com", "gotcheese@hotmail.com", 
		"balejandr@gmail.com", "7yas.3kp@gmail.com", "olb.lb.18009@gmail.com", "smttddiusmokingsmou@hotmail.com", "xgfdg4444ff@utplexpotrabajos.com"		
		};

	public static int data;
	
	public static String person;
	
	NumberFormat nf = NumberFormat.getInstance();
	
	private JPanel contentPane;
	private JPanel contentPanel;
	private JLabel L1;
	private JLabel lblIdentoIsA = new JLabel("");
	JTextPane textPane;
	JSlider slider;
	JTextField txtHello;
	String emails1;
	
	String box_3_value;
	String box_2_value ;
	String box_1_value;
	
	String wholeThing;
	
	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneratorSkeleton frame = new GeneratorSkeleton();
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
	public GeneratorSkeleton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon logo = new ImageIcon(this.getClass().getClassLoader().getResource("guiIcon.jpg"));
		setIconImage(logo.getImage());
		setBounds(100, 100, 534, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(new JLabel(new ImageIcon(this.getClass().getClassLoader().getResource("Suit.jpg"))));
		L1 = new JLabel();
		getContentPane().add(L1);
		setSize(525, 550);
		
		
		JButton btnNewButton = new JButton("Generate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				
				frame.setBounds(100, 100, 663, 620);
				contentPanel = new JPanel();
				contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame.setContentPane(contentPanel);
				contentPanel.setLayout(null);
				
				lblNewLabel = new JLabel(names[(int) (Math.random() * names.length)]);
				lblNewLabel.setFont(new Font("Sitka Display", Font.PLAIN, 26));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(102, 11, 190, 60);
				contentPanel.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("");
				ImageIcon img = new ImageIcon(this.getClass().getResource("ProfilePic.jpg"));
				lblNewLabel_1.setIcon(img);
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setBounds(10, 73, 375, 388);
				contentPanel.add(lblNewLabel_1);
				
				JLabel lblNewLabel_2 = new JLabel("Age:");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
				lblNewLabel_2.setBounds(419, 72, 84, 47);
				contentPanel.add(lblNewLabel_2);
				
				textPane = new JTextPane();
				textPane.setEditable(false);
				textPane.setFont(new Font("Times New Roman", Font.PLAIN, 33));
				textPane.setBounds(513, 72, 60, 39);
				contentPanel.add(textPane);
				
				JLabel lblNewLabel_3 = new JLabel("Set An Age");
				lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 18));
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setBounds(466, 150, 107, 39);
				contentPanel.add(lblNewLabel_3);
				
				slider = new JSlider(JSlider.HORIZONTAL,0,100,0);
				slider.setBounds(419, 130, 200, 26);
				slider.setValue(33);
				slider.addChangeListener(new ChangeListener() {
					
					public void stateChanged(ChangeEvent ce) {
						data = slider.getValue();
						textPane.setText("" + data);	
						lblNewLabel_3.setText("");
					}
				});
				contentPanel.add(slider);
				
				txtHello = new JTextField();
				txtHello.setFont(new Font("Sitka Subheading", Font.PLAIN, 14));
				txtHello.setText("xxx@xmail.com");
				txtHello.setHorizontalAlignment(SwingConstants.CENTER);
				txtHello.setBounds(395, 226, 242, 33);
				txtHello.setColumns(10);
				contentPanel.add(txtHello);
				
				
				JRadioButton rdbtnNewRadioButton = new JRadioButton("Email");
				rdbtnNewRadioButton.setBounds(419, 196, 109, 23);
				rdbtnNewRadioButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(rdbtnNewRadioButton.isSelected()) {
							txtHello.setText(emails[(int)(Math.random() * emails.length)]);
							emails1 = txtHello.getText();
						}
						else {
							txtHello.setText("");
						}
					}
				});
				contentPanel.add(rdbtnNewRadioButton);
				
				JTextField txtHi = new JTextField();
				txtHi.setText("Month");
				txtHi.setToolTipText("Month");
				txtHi.setFont(new Font("Sitka Text", Font.PLAIN, 13));
				txtHi.setHorizontalAlignment(SwingConstants.CENTER);
				txtHi.setBounds(551, 324, 86, 20);
				contentPanel.add(txtHi);
				txtHi.setColumns(10);
				
				JTextField txtDay = new JTextField();
				txtDay.setText("Day");
				txtDay.setHorizontalAlignment(SwingConstants.CENTER);
				txtDay.setToolTipText("Day");
				txtDay.setBounds(551, 383, 86, 20);
				contentPanel.add(txtDay);
				txtDay.setColumns(10);
				
				JTextField txtYear = new JTextField();
				txtYear.setText("Year");
				txtYear.setHorizontalAlignment(SwingConstants.CENTER);
				txtYear.setToolTipText("Year");
				txtYear.setBounds(551, 441, 86, 20);
				contentPanel.add(txtYear);
				txtYear.setColumns(10);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
				comboBox.setToolTipText("Month");
				comboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						box_2_value = comboBox.getSelectedItem().toString();
						txtHi.setText(box_2_value);
					}
				});
				comboBox.setBounds(419, 315, 122, 39);
				contentPanel.add(comboBox);
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Day","1", "2", "3", "4", "5", "6", "7", "8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}));
				comboBox_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						box_1_value = comboBox_1.getSelectedItem().toString();
						txtDay.setText(box_1_value);
					}
				});
				comboBox_1.setToolTipText("Day");
				comboBox_1.setBounds(419, 374, 122, 39);
				contentPanel.add(comboBox_1);
				
				JComboBox comboBox_2 = new JComboBox();
				comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Year", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940"}));
				comboBox_2.setToolTipText("Year");
				comboBox_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						box_3_value = comboBox_2.getSelectedItem().toString();
						txtYear.setText(box_3_value);
					}
				});
				comboBox_2.setBounds(419, 434, 122, 37);
				contentPanel.add(comboBox_2);
				
				JLabel lblNewLabel_4 = new JLabel("Date");
				lblNewLabel_4.setFont(new Font("Sitka Text", Font.PLAIN, 32));
				lblNewLabel_4.setBounds(419, 263, 200, 41);
				contentPanel.add(lblNewLabel_4);
				
				JLabel lblNewLabel_1112 = new JLabel("");
				ImageIcon img112 = new ImageIcon(this.getClass().getResource("ProfilePic.jpg"));
				lblNewLabel_1112.setIcon(img112);
				lblNewLabel_1112.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1112.setBounds(10, 73, 375, 388);
				contentPanel.add(lblNewLabel_1112);
				
				JLabel lblNewLabel_111 = new JLabel("");
				ImageIcon img11 = new ImageIcon(this.getClass().getResource("Save.png"));
				Image imgImage = img11.getImage();
				Image modifiedimg = imgImage.getScaledInstance(115, 110, java.awt.Image.SCALE_SMOOTH);
				img11 = new ImageIcon(modifiedimg);
				lblNewLabel_111.setIcon(img11);
				lblNewLabel_111.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_111.setBounds(530, 475, 107, 94);
				contentPanel.add(lblNewLabel_111);
				
				JButton btnNewButton = new JButton("SAVE");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnNewButton.setText("SAVED");
						person = lblNewLabel.getText();
						
//						System.out.println(person);
//						System.out.println(data);
//						System.out.println(emails1);
//						System.out.println(box_2_value);
//						System.out.println(box_1_value);
//						System.out.println(box_3_value);
						
						wholeThing = person + "\n" + String.valueOf(data) + "\n" + emails1 + "\n" + box_2_value + "\n" + String.valueOf(box_1_value) + "\n" + String.valueOf(box_3_value);
						
						System.out.println(wholeThing);
						
						int val = 1;
						
						PrintWriter writer = null;
						try {
							writer = new PrintWriter("Names.txt");
							writer.println(val);
							
							for(int i=0; i < val; i++) {
								writer.println(wholeThing);
							}
						}catch(Exception e1) {
							
						}finally {
							writer.close();
						}
					}
				});
				btnNewButton.setBounds(466, 496, 75, 23);
				contentPanel.add(btnNewButton);
				
				JLabel lblNewLabel_1111 = new JLabel("");
				ImageIcon img111 = new ImageIcon(this.getClass().getClassLoader().getResource("Paint Stroke 1.png"));
				Image imgImage1 = img111.getImage();
				Image modifiedimg1 = imgImage1.getScaledInstance(320, 110, java.awt.Image.SCALE_SMOOTH);
				img111 = new ImageIcon(modifiedimg1);
				lblNewLabel_1111.setIcon(img111);
				lblNewLabel_1111.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1111.setBounds(10, 320, 375, 388);
				contentPanel.add(lblNewLabel_1111);
				
				JLabel lblNewLabel_11 = new JLabel();
				ImageIcon img_1 = new ImageIcon(this.getClass().getClassLoader().getResource("Background.jpg"));
				Image imgImage_1 = img_1.getImage();
				Image modifiedimg_1 = imgImage_1.getScaledInstance(1500, 1500, java.awt.Image.SCALE_SMOOTH);
				img_1 = new ImageIcon(modifiedimg_1);
				lblNewLabel_11.setIcon(img_1);
				lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_11.setBounds(10, 0, 600, 600);
				contentPanel.add(lblNewLabel_11);
				
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(189, 318, 143, 48);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Idento");
		lblNewLabel_4.setBackground(Color.GRAY);
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.BOLD, 76));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(126, 20, 267, 134);
		getContentPane().add(lblNewLabel_4);
		
		JButton button_5 = new JButton("EXIT");
		button_5.setBounds(212, 385, 100, 35);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				setVisible(false);
			}
		});
		getContentPane().add(button_5);
		
		JButton rec = new JButton("Recent Profiles");
		rec.setBounds(193, 435, 140, 35);
		rec.addActionListener(new ActionListener() {
			private JFileChooser openFileChooser ;

			public void actionPerformed(ActionEvent e3) {
				BufferedReader br = null;
				
				JFrame frame = new JFrame("Profiles");
				frame.setSize(500, 250);
				
				JPanel panel = new JPanel();
				panel.setLayout(getLayout());
				
				frame.add(panel);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(1, 1, 500, 1000);
				
				JTextField txt = new JTextField();
				txt.setHorizontalAlignment(SwingConstants.CENTER);
				txt.setFont(new Font("Sylfaen", Font.BOLD, 76));
				txt.setBounds(100, 100, 50, 13);
				//##################################################################
				
				scrollPane.setViewportView(txt);
				panel.add(scrollPane);
				
				//##################################################################
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				
				try {
					br = new BufferedReader(new FileReader("Names.txt"));
					int val = Integer.parseInt(br.readLine());
					for(int i = 0; i < val; i++) {
						ss = br.readLine();
					}
					txt.setText(ss);
				}catch(Exception eion) {
					System.out.println("Error: " + eion);
				}
			}
		});
		getContentPane().add(rec);
		
		lblIdentoIsA.setBackground(Color.WHITE);
		lblIdentoIsA.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdentoIsA.setForeground(Color.WHITE);
		getContentPane().add(lblIdentoIsA);
		
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(box_1_value);
	}
}
