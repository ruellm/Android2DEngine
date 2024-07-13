package com.takyangame.states;

import android.view.MotionEvent;

import com.phxdroid.core.PhxGraphics;
import com.phxdroid.core.PhxState;
import com.takyangame.TakyanConstants;
import android.util.*;
import com.phxdroid.scene.*;
import com.takyangame.*;
import com.takyangame.game.*;

public class GameState extends PhxState {
	
	private PhxImage[] m_bgImg = null;
	private Harry m_harry = null;
	
	public GameState() {
		// Set this state ID
		this.m_stateID = TakyanConstants.GAME_STATE_ID;	
	}
	
	@Override
	public void Load() {
		// load Background Image
		m_bgImg = new PhxImage[3];
		m_bgImg[0] = new PhxImage(R.drawable.l800_480_trial_layer3);
		m_bgImg[1]= new PhxImage(R.drawable.l800_480_trial_layer2);
		m_bgImg[2] = new PhxImage(R.drawable.l800_480_trial_layer1);
		
		m_harry = new Harry();
		m_harry.InitAnimation();
		m_harry.SetCoord(0, 480-166);
	}

	@Override
	public void Update(float elapsed) {
		m_harry.Update(elapsed);
	}

	@Override
	public void Draw(PhxGraphics gfx) {
		// draw the background images
		for(int i=0; i < m_bgImg.length; i++) {
			m_bgImg[i].Draw(gfx);
		}
		
		m_harry.Draw(gfx);
	}

	@Override
	public boolean OnTouchEvent(MotionEvent event)
	{
		m_harry.SetCurrentAnim(Harry.ANIM_KICK_R);
		return true;
	}
	
	@Override
	public void UnLoad() {
		//.. blank for now
	}
}
