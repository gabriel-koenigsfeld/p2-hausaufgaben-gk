package draw;

import java.awt.Color;

import view.GameFrameWork;
import view.ITickable;
import view.Oval;


public class AufgabeEins implements ITickable{

	private Oval oval1 = new Oval(185, 185, 100, 100, new Color(0,0,0));
	private Oval oval2 = new Oval(190, 190, 90, 90, new Color(255,255,255));
	
	private Oval oval3 = new Oval(200, 200, 70, 70, new Color(0,0,0));
	private Oval oval4 = new Oval(205, 205, 60, 60, new Color(255,255,255));
	
	private Oval oval5 = new Oval(230, 230, 10, 10, new Color(0,0,0));
		
	public static void main(String[] args) {
		
		AufgabeEins draw = new AufgabeEins();
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
		
	}
	
	@Override
	public void tick(long ellapseTime) {
		// TODO Auto-generated method stub
		
	}

}
