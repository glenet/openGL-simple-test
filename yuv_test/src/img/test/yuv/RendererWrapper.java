package img.test.yuv;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

class RendererWarpper implements GLSurfaceView.Renderer
{
	public void onSurfaceCreated(GL10 unused, EGLConfig config)
	{
		JNIOnSurfaceCreated();
	}

	public void onSurfaceChanged(GL10 unused, int w, int h)
	{
		JNIOnSurfaceChanged(w, h);
	}

	public void onDrawFrame(GL10 unused)
	{
		JNIOnDrawFrame();
	}

	private static native void JNIOnSurfaceCreated();
	private static native void JNIOnSurfaceChanged(int w, int h);
	private static native void JNIOnDrawFrame();
}
