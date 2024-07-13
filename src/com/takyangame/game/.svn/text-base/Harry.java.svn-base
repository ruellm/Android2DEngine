package com.takyangame.game;

import com.takyangame.*;
import java.util.*;
import com.phxdroid.scene.*;
import com.phxdroid.core.*;

public class Harry implements PhxAnimationListener{
	
	public static int ANIM_IDLE_R = 0;
	public static int ANIM_KICK_R = 1;	
	
	private int m_dir = Direction.RIGHT;
	private List<PhxSprite> m_animList = new ArrayList<PhxSprite>();
	private int m_currentIdx = 0;
	private int m_X = 0;
	private int m_Y = 0;
	
	public Harry() {
		//...
	}
	
	public void InitAnimation()
	{
		PhxSprite idle = new PhxSprite();
		idle.Load(R.drawable.l800_480_trial_stance);
		idle.Set(15, 8, true);
		idle.SetFrameWidth(182);
		m_animList.add(idle);
		
		PhxSprite kick = new PhxSprite();
		kick.Load(R.drawable.l800_480_trial_kick);
		kick.Set(13, 30, false);
		kick.SetFrameWidth(182);
		kick.AddListener(this);
		m_animList.add(kick);
	}
	
	public void SetDirection(int dir) {
		m_dir = dir;
	}
	
	public void Update(float elapsed) {
		m_animList.get(m_currentIdx).SetCoord(m_X, m_Y);
		m_animList.get(m_currentIdx).Update(elapsed);
	}
	
	public void Draw(PhxGraphics gfx) {
		m_animList.get(m_currentIdx).Draw(gfx);
	}
	
	@Override
	public void OnAnimationComplete()
	{
		if( m_currentIdx == ANIM_KICK_R ) {
			m_currentIdx = 0;
		}
	}
	
	public void SetCurrentAnim(int ix) {
		
		m_currentIdx = ix;
		m_animList.get(m_currentIdx).Reset();
	}
	
	public void SetX(int x){
		m_X = x;
	}
	
	public void SetY(int y){
		m_Y = y;
	}
	
	public void SetCoord(int x, int y){
		m_X = x;
		m_Y = y;
	}
}
