import alist.*;
import TimeExecution.Time;
public class Main {
    public static void main(String[] args) {
        Graph graph=new Graph();
        double startTime = System.currentTimeMillis();

        
        Node s=new Node('s');
        graph.addNode(s);
        graph.addNode(new Node('a'));
        graph.addNode(new Node('c'));
        graph.addNode(new Node('d'));
        graph.addNode(new Node('f'));
        graph.addNode(new Node('g'));
        graph.addNode(new Node('h'));
        
        
        graph.addEdge(0, 1);
        graph.addEdge(0,4);
        
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
     
       
        
        graph.addEdge(2, 3);
        graph.addEdge(2, 5);

        
        graph.addEdge(3, 5);
        
    
        
        graph.addEdge(4, 1);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
       
       


        BFS.traversal(graph, s);
        
        double elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("The time of exceution is "+elapsedTime/1000+"sec");







    }
}