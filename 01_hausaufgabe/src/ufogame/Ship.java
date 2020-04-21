package ufogame;

import view.IGameObject;

public class Ship implements IGameObject{

	private int x;
	private int y;
	private int width;
	private int height;
	
	private String sprite;
	

	
	public Ship(int x, int y, int width, int height, String sprite) {
		super();
		this.x = x;
		this.y = y;
		this.sprite = sprite;
		this.width = width;
		this.height = height;
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


	
}
