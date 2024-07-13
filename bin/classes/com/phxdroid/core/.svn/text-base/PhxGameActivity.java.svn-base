package com.phxdroid.core;

import java.util.ArrayList;
import java.util.List;

import com.phxdroid.util.PhxAssetManager;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;

import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;

public class PhxGameActivity extends Activity {
	private PhxView m_gameView = null;
	private PhxGraphics m_gfx = null;
	
	private List<PhxState> m_stateLists = new ArrayList<PhxState>();
	private int m_currentStateID = -1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// configure window settings
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		boolean isPortrait = getResources().getConfiguration().orientation == 
				Configuration.ORIENTATION_PORTRAIT;
		   	
	    // create graphics object
		int frameBufferWidth = isPortrait ? 480: 800;
	    int frameBufferHeight = isPortrait ? 800: 480;
	    
	    int cw = getWindowManager().getDefaultDisplay().getWidth();
	    int ch = getWindowManager().getDefaultDisplay().getHeight();
	    
	    float scaleX = (float) frameBufferWidth  / cw;
        float scaleY = (float) frameBufferHeight / ch;
        
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        		
	    m_gfx = new PhxGraphics(frameBufferWidth, frameBufferHeight );
	    m_gfx.SetDisplayMetrics(dm);
	    
	    // create our engine view
	    m_gameView = new PhxView(this);
	    
	    // set our custom view
	    setContentView(m_gameView);
	    
	    // set asset manager handles
	    // getAssets and getResource are part of Context class
	    PhxAssetManager.GetInstance().SetAssetHandle(getAssets());
	    PhxAssetManager.GetInstance().SetResourceHandle(getResources());
	    
	    // initialize games locally
	    InitializeGame();
	}

	protected void InitializeGame(){
		//.. template pattern
	}
	
	@Override
    public void onResume() {
        super.onResume();
        m_gameView.Resume();
    }

    @Override
    public void onPause() {
        super.onPause();
      
    }

    public void SetState(int id) {
    	for(int i = 0; i< m_stateLists.size(); i++) {
    		if( m_stateLists.get(i).GetID() == id ) {
    			
    			if( m_currentStateID != -1) {
    				m_stateLists.get(m_currentStateID).UnLoad();
    			}
    			m_currentStateID = id;
    			m_stateLists.get(m_currentStateID).Load();
    		}
    	}
    }
    
    public void AddState(PhxState state){
    	m_stateLists.add(state);	
    }

    /*
     * Getters and Setters
     * **/
    public PhxState GetCurrentState() {
    	if( m_currentStateID > m_stateLists.size() || 
    			m_currentStateID < 0) return null;
    	
    	return m_stateLists.get(m_currentStateID);
    }
    
    public PhxGraphics GetGraphics(){
    	return m_gfx;
    }
}
