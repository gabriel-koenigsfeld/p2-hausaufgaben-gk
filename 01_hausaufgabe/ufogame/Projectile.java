package ufogame;

import view.IGameObject;

public class Projectile implements IGameObject{

	private int x;
	private int y;
	private int width;
	private int height;

	private int speed;
	
	private boolean isCollided;
	
	private String sprite;
	
	public Projectile(int x, int y, int width, int height, int speed, String sprite) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.sprite = sprite;
	}

	public boolean isCollided() {
		return isCollided;
	}

	public void setCollided(boolean isCollided) {
		this.isCollided = isCollided;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getImagePath() {
		return sprite;
	}
	
	public void move()
	{
		y -= speed;
	}
	
}
