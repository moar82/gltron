package com.glTron.Video;

import com.glTron.Game.Camera;

public class DrawTrailLinesParameter {
	public Segment[] segs;
	public int trail_offset;
	public float trail_height;
	public Camera cam;

	public DrawTrailLinesParameter(Segment[] segs, int trail_offset,
			float trail_height, Camera cam) {
		this.segs = segs;
		this.trail_offset = trail_offset;
		this.trail_height = trail_height;
		this.cam = cam;
	}
}