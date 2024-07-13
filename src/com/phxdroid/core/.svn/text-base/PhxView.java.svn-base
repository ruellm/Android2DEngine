package com.phxdroid.core;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class PhxView extends SurfaceView implements Runnable{
	private SurfaceHolder m_holder = null;
	private PhxGameActivity m_game = null;
	private boolean m_isAlive = true;
	private Thread m_gameLoop = null;
	
	public PhxView(Context context) {
		super(context);
		m_holder = getHolder();
		m_game = (PhxGameActivity) context;
		m_game.GetGraphics().SetSurfaceHolder(m_holder);
	}

	public void Resume() {
		m_isAlive = true;	
		m_gameLoop = new Thread(this);
		m_gameLoop.start();
	}
	
	@Override
	public void run() {

		long lastTime = System.nanoTime();
		while(m_isAlive) {
			 if(!m_holder.getSurface().isValid())
	                continue;   	
			 
			 long currentTime = System.nanoTime();
			 float elapsed = (currentTime - lastTime) / 10000000.000f;
	         lastTime = currentTime;
	         
	         //
	         // Pass to current state
	         //
	         PhxState current = m_game.GetCurrentState();
	         current.Update(elapsed);
	         
	         m_game.GetGraphics().Clear(0);
	         current.Draw( m_game.GetGraphics() );
	         m_game.GetGraphics().Flip( );

		}		
	}
	
	/************************88
	 * Event Handling
	 * @return 
	 * */
	@Override
    public boolean onTouchEvent(MotionEvent event) {
		PhxState state = m_game.GetCurrentState();
		if( state != null ) return state.OnTouchEvent(event);
		
		return true;
	}
	
	
	/*
	 * Getters and Setters 
	 * */
	public void SetGame( PhxGameActivity game ){
		m_game = game;
	}
}
