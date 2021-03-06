package lab11_undirected;

import java.util.HashMap;


public class ShortestPath extends BreadthFirstSearch {
	private HashMap<Vertex, Integer> levelsMap = new HashMap<Vertex, Integer>();
	private HashMap<Vertex, Vertex> parentMap = new HashMap<Vertex, Vertex>();

	/** Assumes g is connected */
	public ShortestPath(Graph g) {
		super(g);
	}

	@Override
	protected void processEdge(Edge e) {
		if(parentMap.containsKey(e.v) && !parentMap.containsKey(e.u)) {
			levelsMap.put(e.u, levelsMap.get(e.v)+1);
			parentMap.put(e.u, e.u);
		}

	}
	public int getLevel(Vertex v) {
		return levelsMap.get(v);
	}
	//TO-DO
	public int computeShortestPathLength(Vertex s, Vertex v) {
		parentMap.put(s, s);
		levelsMap.put(s, 0);
		start(s);
		return levelsMap.get(v);
	}
}
