// Java Program to demonstrate adjacency list 
// representation of graphs
import java.util.LinkedList;

public class Graph {
	
	//number of vertices of a graph
	int V;
	LinkedList<Integer> adjsListArray[];
	
	public Graph(int V){
		this.V = V;
		adjsListArray = new LinkedList[V];
		
		//Assign a LinkedList to each vertices
		for(int i=0; i<V; i++){
			adjsListArray[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int src, int dest){
		
		//
		adjsListArray[src].addFirst(dest);
		//since it is undirected graph, So
		adjsListArray[dest].addFirst(src);
		
	}
	
	public void printGraph(){
		for(int v=0; v<this.V; v++){
			System.out.println("Vertices index of adjacency list: " + v);
			System.out.print("head");
			
			for(Integer des: adjsListArray[v]){
				System.out.print(" => " + des);
			}
			
			System.out.println("\n");
			
		}
	}
	
	// Driver program to test above functions
    public static void main(String args[])
    {
        // create the graph given in above figure
        int V = 5;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
      
        // print the adjacency list representation of 
        // the above graph
        graph.printGraph();
    }
	
}