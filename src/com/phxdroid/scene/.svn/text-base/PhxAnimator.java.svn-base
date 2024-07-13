package com.phxdroid.scene;

public class PhxAnimator {
    private long m_timeBetweenFrames = 0;
    private long m_timeSinceLastFrame = 0;
    
    public void Set(int fps) {
    	 m_timeBetweenFrames = 1 / fps;
    	 m_timeSinceLastFrame = m_timeBetweenFrames;	
    }
    
    public boolean Update(float elapsed) {
    	m_timeSinceLastFrame -= elapsed;
        if (m_timeSinceLastFrame <= 0) {
            m_timeSinceLastFrame = m_timeBetweenFrames;
            return true;
        }
    	return false;    	
    }
}
