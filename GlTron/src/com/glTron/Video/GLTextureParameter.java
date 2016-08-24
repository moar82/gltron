package com.glTron.Video;

import javax.microedition.khronos.opengles.GL10;

import android.content.Context;

public class GLTextureParameter {
	public GL10 gl;
	public Context context;
	public int resource;
	public int wrap_s;
	public int wrap_t;

	public GLTextureParameter(GL10 gl, Context context, int resource,
			int wrap_s, int wrap_t) {
		this.gl = gl;
		this.context = context;
		this.resource = resource;
		this.wrap_s = wrap_s;
		this.wrap_t = wrap_t;
	}
	
}