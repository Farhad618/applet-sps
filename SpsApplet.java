// Sps-applet.java

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SpsApplet extends Applet implements ActionListener {
    Sps sps = new Sps();
	Button stone = new Button("STONE");
	Button paper = new Button("PAPER");
	Button scissor = new Button("SCISSOR");

	String userChoice="";
	String computerChoice="";


	public void init() {
		add(stone);
		add(paper);
		add(scissor);
		stone.setBounds(50,100,80,30);
		paper.setBounds(135,100,80,30);
		scissor.setBounds(220,100,80,30);
		
		setLayout(new BorderLayout());

		stone.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
	}

	public void paint(Graphics g) {
		g.drawString("User: " + sps.user + "     Computer: " + sps.computer, 50, 10);
		g.drawString("User: " + sps.userPoint + "     Computer: " + sps.computerPoint, 50, 30);
	}

	public void actionPerformed(ActionEvent e) {
		String st = e.getActionCommand();
		sps.userSet(st);
        sps.computerSet();
        sps.setPoint();

        repaint();
	}
}

/*
	<applet code="SpsApplet" width=400 height=400></applet>
*/