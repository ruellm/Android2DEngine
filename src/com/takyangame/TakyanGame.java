package com.takyangame;
import com.phxdroid.core.*;
import com.takyangame.states.*;

public class TakyanGame extends PhxGameActivity{
	
	@Override
	protected void InitializeGame(){
		this.AddState(new GameState() );
		
		// set default state
		this.SetState(TakyanConstants.GAME_STATE_ID);
	}
}
