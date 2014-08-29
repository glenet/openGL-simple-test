package img.test.yuv;

import android.app.Activity;
import android.os.Bundle;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

		// Set window fullscreen and remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		// Create the EGL surface (set OpenGL version 2.0) and override the renderer with our custom one
		mGLSurfaceView = new GLSurfaceView(this);
		mGLSurfaceView.setEGLContextClientVersion(2);
		mGLSurfaceView.setRenderer(new RendererWrapper());
		setContentView(mGLSurfaceView);
    }

	private GLSurfaceView mGLSurfaceView;
}
