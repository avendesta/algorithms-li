package lab11_undirected;

public class IsConnected extends BreadthFirstSearch {
	int numberOfComponents = 0;
	public IsConnected(Graph graph) {
		super(graph);
	}
	@Override
	protected void additionalProcessing() {
		numberOfComponents++;
	}

	//TO-DO
	public boolean isConnected() {
		start();
		return numberOfComponents == 1;
	}
}
