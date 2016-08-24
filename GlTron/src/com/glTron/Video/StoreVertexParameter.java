package com.glTron.Video;

public class StoreVertexParameter {
	public int offset;
	public Segment s;
	public float t;
	public float fFloor;
	public float fTop;
	public float fSegLength;
	public float fTotalLength;

	public StoreVertexParameter(int offset, Segment s, float t, float fFloor,
			float fTop, float fSegLength, float fTotalLength) {
		this.offset = offset;
		this.s = s;
		this.t = t;
		this.fFloor = fFloor;
		this.fTop = fTop;
		this.fSegLength = fSegLength;
		this.fTotalLength = fTotalLength;
	}
}