package cn.edu.bupt.yaoxintong.response.model;

import java.util.List;

public class MapModel {

	private List<MapNode> nodes;
	private List<MapEdge> edges;

	public List<MapNode> getNodes() {
		return nodes;
	}

	public void setNodes(List<MapNode> nodes) {
		this.nodes = nodes;
	}

	public List<MapEdge> getEdges() {
		return edges;
	}

	public void setEdges(List<MapEdge> edges) {
		this.edges = edges;
	}

}
