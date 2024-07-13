package com.phxdroid.scene;

import java.io.InputStream;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.phxdroid.core.*;
import com.phxdroid.util.PhxAssetManager;

public class PhxImage {
	protected Bitmap m_image = null;
	protected int m_X = 0;
	protected int m_Y = 0;
	
	public PhxImage(){
		//..
	}
	
	public PhxImage(String path) {
		m_image = PhxAssetManager.GetInstance().GetBitmap(path);
	}
	
	public void Load(int id) {
		m_image = PhxAssetManager.GetInstance().GetBitmap(id);
	}
	
	public void Load(String path) {
		m_image = PhxAssetManager.GetInstance().GetBitmap(path);
	}
	
	public PhxImage(int id) {
		m_image = PhxAssetManager.GetInstance().GetBitmap(id);

	}
	
	public void Load(Bitmap bmp, int x, int y){
		m_image = bmp;
		m_X = x;
		m_Y = y;
		
	}
	
	public void Load(String path, int x, int y)
	{
		m_image = PhxAssetManager.GetInstance().GetBitmap(path);
		m_X = x;
		m_Y = y;
	}
	
	public void Load(int id, int x, int y) {
		m_image = PhxAssetManager.GetInstance().GetBitmap(id);
		m_X = x;
		m_Y = y;
	}
	
	public void Draw(PhxGraphics gfx){
		gfx.DrawImage(m_image, m_X, m_Y);		
	}
			
	/*
	 * Getters and setters
	 * */
	public void SetCoord(int x, int y) {
		m_X = x;
		m_Y = y;
	}
	
	public int GetHeight() {
		if( m_image == null ) 
			return 0;
		
		return m_image.getHeight();
	}
	
	public int GetWidth() {
		if(m_image == null) return 0;
		return m_image.getWidth();
	}
	
	public Bitmap GetImage() {
		return m_image;
	}
}
