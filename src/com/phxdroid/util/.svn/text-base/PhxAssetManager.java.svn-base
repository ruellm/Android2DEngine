package com.phxdroid.util;

import java.io.IOException;
import java.io.InputStream;

import android.content.res.Resources;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

public class PhxAssetManager {
	private static PhxAssetManager m_instance = null;
	private Resources m_resource = null;
	private AssetManager m_assets = null;
	
	private PhxAssetManager() {
		//..	
	}
	
	public static PhxAssetManager GetInstance(){
		if(m_instance == null) {
			m_instance = new PhxAssetManager();
		}
		return m_instance;
	}
	
	public Bitmap GetBitmap(String path) {
		Config config = null;
        config = Config.ARGB_8888;

        Options options = new Options();
        options.inPreferredConfig = config;
        options.inScaled = false;

        InputStream in = null;
        Bitmap bitmap = null;
        
        try {
            in = m_assets.open(path);
            bitmap = BitmapFactory.decodeStream(in, null, options);
            if (bitmap == null)
                throw new RuntimeException("Couldn't load bitmap from asset '"
                        + path + "'");
        } catch (IOException e) {
            throw new RuntimeException("Couldn't load bitmap from asset '"
                    + path + "'");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
        return bitmap;
	}
	
	
	
	public Bitmap GetBitmap(int id) {
	
		Config config = null;
        config = Config.ARGB_8888;

        Options options = new Options();
        options.inPreferredConfig = config;
        //options.inScaled = false;

        InputStream in = null;
        Bitmap bitmap = null;
        
        try {
            in = m_resource.openRawResource(id);
            bitmap = BitmapFactory.decodeStream(in, null, options);
            if (bitmap == null)
                throw new RuntimeException("Couldn't load bitmap from resource '"
                        + id + "'");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
        return bitmap;
	}
	
	public void SetAssetHandle(AssetManager asset) {
		m_assets = asset;
	}
	
	public void SetResourceHandle(Resources res) {
		m_resource = res;
	}
	
	public Resources GetResourceHandler() {
		return m_resource;
	}
	
}
