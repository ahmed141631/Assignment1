import java.util.LinkedList;

import alist.*;
public class BFS {

    public static void traversal(Graph graph,Node src){
        for(LinkedList<Node> list: graph.list()){
            for(Node node: list){
                node.distance=-1;
                node.pi=null;
            }}
        src.distance=0;
        LinkedList<Node>pq=new LinkedList<Node>();
        pq.add(src);

        while (!pq.isEmpty()) {
            Node u=pq.poll();
            System.out.println(u.data+" and the distance from s is "+u.distance);
            for(LinkedList<Node> list: graph.list()){
                if(list.get(0)==u){
                for(Node node: list){
                    if(node.distance==-1){
                    
                    node.distance=u.distance+1;
                    pq.add(node);
                    node.pi=u;
                   
                    }
                    
                }

            }}
        }    
    }
}