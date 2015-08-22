package gui;

/**
 * This class is used to working with NewGui.java
 */

/**
 * @author yuantian
 *
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.DrawableParticle;
import model.ModelParallel;
import model.Particle;

public class NewCanvas extends JPanel{
	//A Canvas component represents a blank rectangular area of the
	//screen onto which the application can draw or from which the
	//application can trap input events from the user.
	ModelParallel m;
	Canvas(ModelParallel m){this.m=m;}
	@Override
	public void paint(Graphics gg){
		Graphics2D g=(Graphics2D)gg;
		g.setBackground(Color.DARK_GRAY);
		g.clearRect(0, 0, getWidth(),getHeight());
		for(DrawableParticle p: m.pDraw){p.draw(g);}
	}
	@Override
	public Dimension getPreferredSize(){
		return new Dimension((int)ModelParallel.size, (int)ModelParallel.size);
	}
}