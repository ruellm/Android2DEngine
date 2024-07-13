package com.phxdroid.scene;

import com.phxdroid.core.*;
import java.util.*;

public class PhxSprite extends PhxImage {
	private int m_frameCount = 1;
	private int m_currentFrame = 0;
	private int m_frameWidth = 0;
	private boolean m_bLoop = true;
	private boolean m_bCalled = false;
	
	private PhxAnimator m_animator = null;
	private List<PhxAnimationListener> m_observer = 
			new ArrayList<PhxAnimationListener>();
	
	public void Reset() {
		if (m_currentFrame == m_frameCount - 1) {
              m_currentFrame = 0;
              m_bCalled = false;
      }
	}
	
	public void Set(int frameCount, int fps, boolean loop) {
		m_frameCount = frameCount;
		m_bLoop = loop;
		m_animator = new PhxAnimator();
		m_animator.Set(fps);
	}
	
	public void Update(float elapsed){
		 if (m_animator.Update(elapsed)) {
             ++m_currentFrame;
             if (m_bLoop) {
                     m_currentFrame %= m_frameCount;
             } else if (m_currentFrame >= m_frameCount) {
                     m_currentFrame = m_frameCount - 1;
                     
                     int size = m_observer.size();
                     if(size > 0 && m_bCalled == false) {
                    	 for(int i=0; i < size; i++) {
                    		 m_observer.get(i).OnAnimationComplete();
                    	 }
                    	 
                    	 m_bCalled = true;
                     }
            }
		 }
	}
	
	public void Draw(PhxGraphics gfx)
	{
		//get the current animation frame
        int sourceX = m_frameWidth * m_currentFrame;
        int XOff = m_X;
        int YOff = m_Y;
 
        // Draw the current frame
        gfx.DrawImage(m_image, sourceX, 0, m_frameWidth, this.GetHeight(),
        		XOff, YOff, m_frameWidth, this.GetHeight());
        
	}
	
	public void SetFrameWidth(int width) {
		m_frameWidth = width;
	}
	
	public void AddListener(PhxAnimationListener listener) {
		m_observer.add(listener);		
	}
}
