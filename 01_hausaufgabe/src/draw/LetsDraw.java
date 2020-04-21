package draw;

import java.awt.Color;

import ufogame.Ship;
import view.GameFrameWork;
import view.ITickable;
import view.ITickableListener;
import view.Oval;
import view.Rectangle;

public class LetsDraw implements ITickableListener{

	private Rectangle rectangle = new Rectangle(100, 200, 200, 150, new Color(0, 0, 0));
	
	public static void main(String[] args) {
		LetsDraw draw = new LetsDraw();
		draw.init();
	}
	
	public void init() {
		
		GameFrameWork gameFrameWork = new GameFrameWork();
		
		gameFrameWork.setSize(900, 700);
		gameFrameWork.setBackgroundColor(new Color(0, 180, 180));
		
		gameFrameWork.addRectangle(rectangle);
		
		Rectangle rectangle2 = new Rectangle(500, 700, 400, 50, new Color(255, 255, 255));
		gameFrameWork.addRectangle(rectangle2);
		
		Oval oval = new Oval(200, 300, 100, 100, new Color(255, 255, 0));
		gameFrameWork.addOval(oval);
		
		gameFrameWork.addTick(this);
		
		Ship ship = new Ship(600, 600, 100, 100, "D:\\Gabriel\\OneDrive - haw-hamburg.de\\Semester 3\\Programmieren B\\2018_workspace\\Vorlesung01\\src\\assets\\sprite_good.png");
		gameFrameWork.addGameObject(ship);
		
	}

	@Override
	public void tick(long ellapseTime) {
		
		rectangle.setX(rectangle.getX() + 2);
		
		if(rectangle.getX() > 1200) {
			rectangle.setX(-200);
		}
	}

}
