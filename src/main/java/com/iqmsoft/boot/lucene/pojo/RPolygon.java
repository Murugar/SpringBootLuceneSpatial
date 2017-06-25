package com.iqmsoft.boot.lucene.pojo;

import java.util.ArrayList;
import java.util.List;

public class RPolygon {
	List<RPoint> polygon = new ArrayList<>();

	public List<RPoint> getPolygon() {
		return polygon;
	}

	public void setPolygon(ArrayList<RPoint> polygon) {
		this.polygon = polygon;
	}

}
