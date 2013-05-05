package game;



import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.WindowManager;



public class MainActivity extends Activity
{

	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		GLSurfaceView view = new GLSurfaceView(this);

		System.out.println("Drawing view");
		StringBuffer k = new StringBuffer("dupa");
		k.delete(0, 0);
		k.insert(0, "z");
		System.out.println(k);

	}

	
}
