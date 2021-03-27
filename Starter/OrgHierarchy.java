import java.io.*; 
import java.util.*; 

// Tree node
class Node {
	public Node left,right,parent,boss;
	public int id,level,depth;
	public Vector<Node> employee;
	public Node(int id){
		this.id=id;
		employee = new Vector<Node>(n);
	}
}


public class OrgHierarchy implements OrgHierarchyInterface{

//root node
Node root;
int n;
public OrgHierarchy(){
	n=0;
}
public boolean isEmpty(){
	return this.size()==0;
} 

public int size(){
	return n;
}
public Node find(Node root,int id){
	if(root==null)return null;
	else if(root.id==id)return root;
	else if(id>root.id)return find(root.right,id);
	return find(root.left,id);
}
public Node insert(Node root,Node id){
	if(id.id<root.id){
		if(root.left==null){root.left=id;}
		else{root.left=insert(root.left,id);}
	}
	if(root.right==null){root.right=id;}
	root.right=insert(root.right,id);
}
public int level(int id) throws IllegalIDException, EmptyTreeException{
	return find(root,id).level;
} 

public void hireOwner(int id) throws NotEmptyException{
	root=new Node();
	root.id=id;
}

public void hireEmployee(int id, int bossid) throws IllegalIDException, EmptyTreeException{

} 

public void fireEmployee(int id) throws IllegalIDException,EmptyTreeException{
	//your implementation
 	throw new java.lang.UnsupportedOperationException("Not implemented yet.");
}
public void fireEmployee(int id, int manageid) throws IllegalIDException,EmptyTreeException{
	//your implementation
	 throw new java.lang.UnsupportedOperationException("Not implemented yet.");
} 

public int boss(int id) throws IllegalIDException,EmptyTreeException{
	return find(root,id).boss;
}

public int lowestCommonBoss(int id1, int id2) throws IllegalIDException,EmptyTreeException{
	//your implementation
	 throw new java.lang.UnsupportedOperationException("Not implemented yet.");
}

public String toString(int id) throws IllegalIDException, EmptyTreeException{
	//your implementation
	 throw new java.lang.UnsupportedOperationException("Not implemented yet.");
}

}
