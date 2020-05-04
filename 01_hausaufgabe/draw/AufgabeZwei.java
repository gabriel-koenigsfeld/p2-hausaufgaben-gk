package draw;

import java.awt.Color;

import view.GameFrameWork;
import view.ITickable;
import view.Oval;

public class AufgabeZwei implements ITickable{

	private Oval oval1 = new Oval(185, 185, 100, 100, new Color(0,0,0));
	private Oval oval2 = new Oval(190, 190, 90, 90, new Color(255,255,255));
	
	private Oval oval3 = new Oval(200, 215, 70, 70, new Color(0,0,0));
	private Oval oval4 = new Oval(205, 220, 60, 60, new Color(255,255,255));
	
	private Oval oval5 = new Oval(215, 245, 40, 40, new Color(0,0,0));
	private Oval oval6 = new Oval(220, 250, 30, 30, new Color(255,255,255));
	
	public static void main(String[] args) {
		
		AufgabeZwei draw = new AufgabeZwei();
		draw.init();
		
	}

	public void init() {
		
		GameFrameWork gameFrameWork = new GameFrameWork();
		
		gameFrameWork.setSize(500, 500);
		gameFrameWork.setBackgroundColor(new Color(255, 255, 255));

		
		gameFrameWork.addOval(oval1);
		gameFrameWork.addOval(oval2);
		
		gameFrameWork.addOval(oval3);
		gameFrameWork.addOval(oval4);
		
		gameFrameWork.addOval(oval5);
		gameFrameWork.addOval(oval6);
		
		
	}
	
	@Override
	public void tick(long ellapseTime) {
		// TODO Auto-generated method stub
		
	}

}
