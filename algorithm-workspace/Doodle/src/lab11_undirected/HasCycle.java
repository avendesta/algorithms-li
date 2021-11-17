package lab11_undirected;


public class HasCycle extends BreadthFirstSearch {
	
	public HasCycle(Graph graph) {
		super(graph);
	}
	
	//TO-DO
	public boolean hasCycle() {
		int numberOfEdgesInGraph = graph.edges().size();
		FindSpanningTree fst = new FindSpanningTree(graph);
		fst.computeSpanningTree();
		int numberOfEdgesInForest = fst.getTreeSize();
		return numberOfEdgesInForest < numberOfEdgesInGraph;
	}
}
