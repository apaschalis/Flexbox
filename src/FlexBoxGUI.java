/* Andrew Paschalis M00402050 Coursework CMT2313 
 */
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FlexBoxGUI extends JFrame implements ActionListener { 
	JPanel panel; // creating new GUI elements
	JButton submit, exit, newOrder;
	JTextField height, width, length, quantity;
	JLabel cardG, colour, h, w, l, quant, sealableT, cornerR, bottomR;
	JComboBox cardGrade, colours;
	JRadioButton bottomReinforcement, bottomReinforcement1,
			cornerReinforcement, cornerReinforcement1, sealableTop,
			sealableTop1;
	JTextArea result;
	ButtonGroup br, cr, st;
	ArrayList<Order> list = new ArrayList<Order>();
	FlexBox flex = new FlexBox();
	private String[] colourPrint = { "0 No Colour", "1 Colour", "2 Colours" };
	private String[] gradeCard = { "", "1", "2", "3", "4", "5" };
	// private String [] quant={"","1","2","3","4","5","6","7","8","9","10"};
	private String reinforceY = "Yes";
	private String reinforceN = "No";
	private DecimalFormat df = new DecimalFormat("#.##");

	public FlexBoxGUI(String title) {
		// super(title);

		panel = new JPanel();//creating new instances of GUI elements 
		// c=new JButton();

		submit = new JButton("Place Order");
		submit.addActionListener(this);
		// cancel = new JButton("Cancel");
		// cancel.addActionListener(this);
		// b.add(c);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));

		// c.addActionListener(this);
		height = new JTextField(4);
		h = new JLabel("Enter Height Here:");

		height.addActionListener(this);

		width = new JTextField(4);
		w = new JLabel("Enter Width Here:");
		width.addActionListener(this);

		length = new JTextField(4);
		l = new JLabel("Enter Length Here:");
		length.addActionListener(this);

		cardG = new JLabel("Grade Of Card");

		cardGrade = new JComboBox(gradeCard);
		cardGrade.addActionListener(this);

		colour = new JLabel("Colour");

		colours = new JComboBox(colourPrint);
		colours.addActionListener(this);

		br = new ButtonGroup();

		bottomR = new JLabel("Bottom Reinforcements:");
		bottomReinforcement = new JRadioButton(reinforceY);
		bottomReinforcement.addActionListener(this);

		bottomReinforcement1 = new JRadioButton(reinforceN);
		bottomReinforcement1.addActionListener(this);

		br.add(bottomReinforcement);
		br.add(bottomReinforcement1);

		cr = new ButtonGroup();
		cornerR = new JLabel("Corner Reinforcements: ");
		cornerReinforcement = new JRadioButton(reinforceY);
		cornerReinforcement.addActionListener(this);

		cornerReinforcement1 = new JRadioButton(reinforceN);
		cornerReinforcement1.addActionListener(this);

		cr.add(cornerReinforcement);
		cr.add(cornerReinforcement1);

		st = new ButtonGroup();
		sealableT = new JLabel("Sealable Top: ");
		sealableTop = new JRadioButton(reinforceY);
		sealableTop.addActionListener(this);

		sealableTop1 = new JRadioButton(reinforceN);
		sealableTop1.addActionListener(this);

		st.add(sealableTop);
		st.add(sealableTop1);
		// sealableTop.setSelected(true);

		try {

			BufferedImage myPic = ImageIO.read(new File("cardboard_box.png"));
			JLabel pic = new JLabel(new ImageIcon(myPic));
			panel.add(pic);
		} catch (IOException a) {
			System.out.println("File not found");
		}

		newOrder = new JButton("Create a new Order");
		newOrder.addActionListener(this);

		quant = new JLabel("Quantity: ");
		quantity = new JTextField(4);
		quantity.addActionListener(this);

		exit = new JButton("Exit");
		exit.addActionListener(this);
		
	
		
		result = new JTextArea(5,10);
//		result.addActionListener(this);
		// price=new JTextField("Price");
		// price.addActionListener(this);
		add(panel);
		panel.add(h); // add values to panel.
		panel.add(height);
		panel.add(w);
		panel.add(width);
		panel.add(l);
		panel.add(length);
		panel.add(quant);
		panel.add(quantity);
		panel.add(cardG);
		panel.add(cardGrade);
		panel.add(colour);
		panel.add(colours);
		panel.add(bottomR);
		panel.add(bottomReinforcement);
		panel.add(bottomReinforcement1);
		panel.add(cornerR);
		panel.add(cornerReinforcement);
		panel.add(cornerReinforcement1);
		panel.add(sealableT);
		panel.add(sealableTop);
		panel.add(sealableTop1);
		panel.add(result);
		// panel.add(price);
	//	panel.add(calculatePrice);
		panel.add(submit);
		panel.add(newOrder);
		//panel.add(clearOrders);
		panel.add(exit);
		

	}
	
	

	// @Override
	public void actionPerformed(ActionEvent e) { //make GUI elements do something.
		// System.out.println(e.getActionCommand());
		double he = 0.0, wi = 0.0, le = 0.0;
		int c = 0, q = 0, col = 0;
		boolean b = false, cor = false, se = false;
		
		if (e.getSource() == submit)
		{
		
	
			try {

				he = Double.parseDouble(height.getText());
				wi = Double.parseDouble(width.getText());
				le = Double.parseDouble(length.getText());
				c = cardGrade.getSelectedIndex();
				q = Integer.parseInt(quantity.getText());
				// String co = colours.getSelectedIndex().toString;
				// //split(" ")[0];
				col = colours.getSelectedIndex();

				flex.setHeight(he);
				flex.setWidth(wi);
				flex.setLength(le);

				flex.setGradeOfCard(c);
				flex.setQuantity(q);
				flex.setColour(col);
				
				
				
				// JOptionPane.showMessageDialog(null,"The  price is: "+flex.additionalCosts()());

				if (bottomReinforcement.isSelected()) {
					flex.setReinforcedBottom(true);
				}

				else if (bottomReinforcement1.isSelected()) {
					flex.setReinforcedBottom(false);
				}

				if (cornerReinforcement.isSelected()) {
					flex.setReinforcedCorners(true);
				}

				if (cornerReinforcement1.isSelected()) {
					flex.setReinforcedCorners(false);
				}

				if (sealableTop.isSelected()) {
					flex.setSealableTop(true);
				}

				if (sealableTop1.isSelected()) {
					flex.setSealableTop(false);
				}	
					
				if (flex.chooseBoxType().equals("Box does not exist"))
		{
		  JOptionPane.showMessageDialog(null,"Sorry, we do not sell this type of boxes");	
		}

            else {
           
				JOptionPane.showMessageDialog(null,
						"The Card Price is: �" + df.format(flex.cardPrice()));
				JOptionPane.showMessageDialog(null,
						"The Additional  price is: �" +df.format(flex.additionalCosts()));
				// System.out.println(list.toString());
				//System.out.println("The box type is: " + flex.chooseBoxType());
			  result.setText(flex.toString()+"\n"+flex.chooseBoxType());
				list.add(new Order(flex.meterArea(), flex.getGradeOfCard(),
						flex.getQuantity(), flex.getColour(), 
							flex.getReinforcedBottom(), 
								flex.getReinforcedCorners(), flex.getSealableTop(),
						 flex.additionalCosts()));

					//	System.out.println(flex.meterArea()); 
				}
			} catch (NumberFormatException n) {
				JOptionPane.showMessageDialog(null,
						"Error please complete all fields or review entered information");
			}
		}
		

		if (e.getSource() == exit) 
		{
		 System.exit(0);
		}

		if (e.getSource() == newOrder) 
		{
			list.clear();
		 flex.initalise();	
		 height.setText(" ");
		 width.setText (" ");
		 length.setText(" ");
		 quantity.setText(" ");
		 cardGrade.setSelectedIndex(0);
		 colours.setSelectedIndex(0);
		 bottomReinforcement.setSelected(false);
		 bottomReinforcement1.setSelected(true);
		 cornerReinforcement.setSelected(false);
		 cornerReinforcement1.setSelected(true);
		 sealableTop.setSelected(false);
		 sealableTop1.setSelected(true);

		}
		

	}
	// }

}
