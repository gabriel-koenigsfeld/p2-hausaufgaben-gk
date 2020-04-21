package ufogame;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import view.GameFrameWork;
import view.IKeyboardListener;
import view.ITickableListener;
import view.Message;

public class Game implements ITickableListener, IKeyboardListener
{
	private ArrayList<Projectile> projectiles = new ArrayList<>();
	private ArrayList<Ufo> ufos = new ArrayList<>();
	
	private Ship ship;
	
	private int ufoAmount = 30;
	
	private int maxAmmo = 5;
	private int shipAmmo = maxAmmo;

	private int screenWidth = 900;
	private int screenHeight = 700;
	private GameFrameWork frameWork = new GameFrameWork();
	
	private int score;
	private String preScore = "Player 1 - Score: ";
	
	private Message scoreMessage = new Message(preScore + 0, 50, 50, 20, new Color(0,255,0));
	private Message goalMessage = new Message("", 450, 50, 20, new Color(0,255,0));
	private Message ammoMessage = new Message("Ammo: "+ shipAmmo, 300, 50, 20, new Color(0,255,0));
	private Message outOfAmmoMessage = new Message("", 350, 350, 20, new Color(0,255,0));
	
	public void init()
	{
		frameWork.addMessage(scoreMessage);
		frameWork.addMessage(goalMessage);
		frameWork.addMessage(ammoMessage);
		frameWork.addMessage(outOfAmmoMessage);
		
		frameWork.setSize(900, 700);
		frameWork.setBackground(new Background("src\\assets\\sprite_background.png"));
		frameWork.setBackgroundColor(new Color(0, 0, 0));
		
		ship = new Ship((screenWidth / 2) - 30, 4 * screenHeight / 5, screenWidth/20, screenWidth/20, "src\\assets\\sprite_ship.png");
		frameWork.addGameObject(ship);
		
		Ufo ufo = new Ufo(-20, screenHeight/5, screenWidth/10, screenWidth/10, 9, "src\\assets\\sprite_ufo.png");
		ufos.add(ufo);
		frameWork.addGameObject(ufo);
		
		
        for(int i = 1; i < ufoAmount; i++) {
            ufos.add(new Ufo(ufos.get(i-1).getX() - 400, ufos.get(0).getY(), ufos.get(0).getWidth(), 
                    ufos.get(0).getHeight(), ufos.get(0).getSpeed(), ufos.get(0).getImagePath()));
            frameWork.addGameObject(ufos.get(i));
        }
		
		frameWork.addTick(this);
		frameWork.addIKeyInput(this);
	}
	
	public boolean isCollided(){
		
		for(Ufo ufo: ufos) {
			for(Projectile p: projectiles) {
				if(p.getX() > ufo.getX() && p.getX() < (ufo.getX() + ufo.getWidth())
						&& p.getY() > ufo.getY() && p.getY() < (ufo.getY() + ufo.getHeight())) {

					frameWork.removeGameObject(ufo);
					ufos.remove(ufo);
					
					frameWork.removeGameObject(p);
					projectiles.remove(p);
					
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isGoalAchieved() {
		if(score >= 5) {
			return true;
		}
		return false;
	}
	
	public void shoot()
	{
		if(shipAmmo > 0) {
			Projectile projectile = new Projectile(ship.getX()+11, ship.getY()+5, ship.getWidth()/2, ship.getWidth()/2, 60, "src\\assets\\sprite_projectile2.png");
			projectiles.add(projectile);
			frameWork.addGameObject(projectile);
			shipAmmo -= 1;
			ammoMessage.setMessage("Ammo: " + shipAmmo);
		}
		else {
				outOfAmmoMessage.setMessage("PRESS R TO RELOAD");

			
		}
	}

	public void reload()
	{
		if(shipAmmo == 0) {

			shipAmmo = maxAmmo;
			outOfAmmoMessage.setMessage("");
			ammoMessage.setMessage("Ammo: " + shipAmmo);
		}

	}
	

	@Override
	public void tick(long elapsedTime) {

		for(Ufo ufo: ufos) {
			ufo.move();
		}
		
		if(ufos.get(0).getX() > screenWidth) {
			frameWork.removeGameObject(ufos.get(0));
			ufos.remove(0);
            ufos.add(new Ufo(ufos.get(ufos.size() - 1).getX() - 400, ufos.get(0).getY(), ufos.get(0).getWidth(), 
                    ufos.get(0).getHeight(), ufos.get(0).getSpeed(), ufos.get(0).getImagePath()));
		}
		
		for(Projectile p: projectiles) {
            p.move();
        }
		
		if(projectiles.size()>0 && projectiles.get(0).getY() < 0) {
			frameWork.removeGameObject(projectiles.get(0));
			projectiles.remove(0);
		}
		
		if(isCollided()) {
			score+=1;
			scoreMessage.setMessage(preScore + score);
		}
		
		if(isGoalAchieved()) {
			goalMessage.setMessage("Wow, you are so good!");
		}
		
	}
	
	//für Keyboard Listener
	@Override
	public int[] getKeys() {
		int[] keys = {KeyEvent.VK_SPACE, KeyEvent.VK_R};
		return keys;
	}

	@Override
	public void keyDown(int key) {
		if(key == KeyEvent.VK_SPACE)
		{
		shoot();
		}
		
		if(key == KeyEvent.VK_R)
		{
		reload();
		}
	}


}