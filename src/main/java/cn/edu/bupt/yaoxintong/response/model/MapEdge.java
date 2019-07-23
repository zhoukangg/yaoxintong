package cn.edu.bupt.yaoxintong.response.model;

public class MapEdge {
	// "source": "云天河",
	// "target": "韩菱纱",
	// "relation": "挚友"

	private int source;
	private int target;
	private String relation;

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

}
