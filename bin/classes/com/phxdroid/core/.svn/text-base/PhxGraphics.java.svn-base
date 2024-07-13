package com.phxdroid.core;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.SurfaceHolder;
import com.phxdroid.scene.*;
import com.phxdroid.util.PhxAssetManager;

public class PhxGraphics {

	private Bitmap m_backBuffer = null;
	private Canvas m_canvas = null;
	private SurfaceHolder m_holder = null;
	private DisplayMetrics m_displayMetrics = null;
	
	public PhxGraphics(int width, int height) {

		// create back buffer
		m_backBuffer = Bitmap.createBitmap(width,
	    		height, Config.ARGB_8888);
		
		// create temporary canvas for double buffering
		m_canvas = new Canvas(m_backBuffer);	

	}
	
	 public void Clear(int color) {
		 m_canvas.drawRGB((color & 0xff0000) >> 16, (color & 0xff00) >> 8,
	                (color & 0xff));
	 }
	 
	 public void Flip( ) {
		Rect dstRect = new Rect();
		
		Canvas canvas = m_holder.lockCanvas();
        canvas.getClipBounds(dstRect);
        canvas.drawBitmap(m_backBuffer, null, dstRect, null); 
        m_holder.unlockCanvasAndPost(canvas);
       
	 }
	
	 public void DrawImage(Bitmap bmp, int srcX, int srcY,
	            int srcWidth, int srcHeight, int dstX, int dstY,
	            int dstWidth, int dstHeight) 
	 {
		 
		 Rect srcRect = new Rect();
		 Rect dstRect = new Rect();
		    	 
		 srcRect.left = srcX;
	     srcRect.top = srcY;
	     srcRect.right = srcX + srcWidth;
	     srcRect.bottom = srcY + srcHeight;

	        
	     dstRect.left = dstX;
	     dstRect.top = dstY;
	     dstRect.right = dstX + dstWidth;
	     dstRect.bottom = dstY + dstHeight;

	     m_canvas.drawBitmap(bmp, srcRect, dstRect, null);
	 }
	 
	 public void DrawImage(PhxImage image, int srcX, int srcY,
	            int srcWidth, int srcHeight, int dstX, int dstY,
	            int dstWidth, int dstHeight) 
	 {
		 
		 DrawImage(image.GetImage(), srcX, srcY, srcWidth, srcHeight, 
				 dstX, dstY, dstWidth, dstHeight);
	 }
	 
	 public void DrawImage(Bitmap bmp, int x, int y) 
	 {
		 Rect srcRect = new Rect();
		 Rect dstRect = new Rect();
		 
		 int width = (int)(bmp.getWidth());
		 int height = (int)(bmp.getHeight());
		 
		 srcRect.left = 0;
	     srcRect.top = 0;
	     srcRect.right = x + width;
	     srcRect.bottom = y + height;
	        
	     dstRect.left = x;
	     dstRect.top = y;
	     dstRect.right = x + width;
	     dstRect.bottom = y + height;
	     
	     m_canvas.drawBitmap(bmp, srcRect, dstRect, null);
	 }
	 
	/*
	 *  Getters and setters
	 * **/
	
	 public void SetSurfaceHolder(SurfaceHolder holder) {
		 m_holder = holder;
	 }
	
	 public Bitmap GetBackBuffer() {
		 return m_backBuffer;
	 }
	 	 
	 public void SetDisplayMetrics(DisplayMetrics dm) {
		 m_displayMetrics = dm;
	 }
}
