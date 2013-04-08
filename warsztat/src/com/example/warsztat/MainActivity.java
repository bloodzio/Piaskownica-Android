package com.example.warsztat;

//import android.os.Bundle;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.WindowManager;

//import android.view.Menu;

public class MainActivity extends Activity
{

	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		GLSurfaceView view = new GLSurfaceView(this);

		// Redering Cube 2D
		// view.setRenderer(new SquareRenderer(true));
		// Redering Cube 3D
		view.setRenderer(new Cube3DRenderer(true));
		setContentView(view);
		System.out.println("Drawing view");
		StringBuffer k = new StringBuffer("dupa");
		k.delete(0, 0);
		k.insert(0, "z");
		System.out.println(k);

	}

	/*
	 * @Override protected void onCreate(Bundle savedInstanceState) {
	 * super.onCreate(savedInstanceState);
	 * setContentView(R.layout.activity_main); }
	 * 
	 * 
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 * menu; this adds items to the action bar if it is present. //
	 * getMenuInflater().inflate(R.menu.main, menu); return true; }
	 */
}
