package com.phxdroid.core;

import android.view.MotionEvent;

public abstract class PhxState {
	protected int m_stateID = -1;
	
	public abstract void Load();
	public abstract void Update(float elapsed);
	public abstract void Draw(PhxGraphics gfx);
	public abstract boolean OnTouchEvent(MotionEvent event);
	public abstract void UnLoad();
	
	public int GetID(){
		return m_stateID;
	}
}
