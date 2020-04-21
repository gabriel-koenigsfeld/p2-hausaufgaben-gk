package draw;

import java.awt.Color;

import view.GameFrameWork;
import view.ITickable;
import view.Oval;

public class AufgabeDrei implements ITickable{

	private Oval oval1 = new Oval(300, 250, 20, 20, new Color(0,0,0));
	private Oval oval2 = new Oval(285, 285, 20, 20, new Color(0,0,0));
	private Oval oval3 = new Oval(250, 300, 20, 20, new Color(0,0,0));
	private Oval oval4 = new Oval(215, 285, 20, 20, new Color(0,0,0));
	private Oval oval5 = new Oval(200, 250, 20, 20, new Color(0,0,0));
	
	private Oval oval6 = new Oval(210, 210, 25, 25, new Color(0,0,0));
	private Oval oval7 = new Oval(245, 190, 35, 35, new Color(0,0,0));
	private Oval oval8 = new Oval(280, 210, 35, 35, new Color(0,0,0));
	
	public static void main(String[] args) {
		
		AufgabeDrei draw = new AufgabeDrei();
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
		gameFrameWork.addOval(oval7);
		gameFrameWork.addOval(oval8);
		
	}
	
	@Override
	public void tick(long ellapseTime) {
		// TODO Auto-generated method stub
		
	}

}
