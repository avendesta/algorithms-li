package lab11_undirected;



public class PathExists extends BreadthFirstSearch {
	boolean pathFound = false;
	int componentCount = 0;
	Vertex v;
	public PathExists(Graph graph) {
		super(graph);
	}
	@Override
	protected void additionalProcessing() {
		componentCount++;
	}
	@Override
	protected void processVertex(Vertex v) {
		if(this.v.equals(v) && componentCount==0)
			pathFound = true;
	}

	//TO-DO
	public boolean pathExists(Vertex u, Vertex v) {
		pathFound = false;
		this.v = v;
		start(u);
		return pathFound;
	}
	
}
