package Individual;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {

		Book mybook = new Book();
		
		mybook.title = "Wonderland";
//		mybook.author = "Jannella De Guzman";
		
        mybook.display();
        
        
        House myHouse = new House();
        
        myHouse.location = "Caloocan";
//        myHouse.color = "red";
//        myHouse.size = 200;
        
        myHouse.displaylocation();
//        myHouse.displaycolor();
//        myHouse.displaysize();
        

        Tree myTree = new Tree();  
        
        myTree.types = "Narra";
             		
        myTree.displaytree();		
        
        
        
	}

}
