package Day5;
import java.util.Scanner;

public class MyTreeSetTest {
	public static void main(String[] args) {
		
//		ChemicalElement gold = new ChemicalElement(79, "Gold", "Au", 196.97f);
//		ChemicalElement silver = new ChemicalElement(47, "Silver", "Ag", 107.87f);
//		ChemicalElement radium = new ChemicalElement(88, "Radium", "Ra", 226.03f);
//		ChemicalElement calcium = new ChemicalElement(20, "Caclium", "Ca", 40.08f);
//		ChemicalElement tin = new ChemicalElement(50, "Tin", "Sn", 118.71f);
//		ChemicalElement lead = new ChemicalElement(82, "Lead", "Pb", 207.2f);
//		ChemicalElement uranium = new ChemicalElement(92, "Uranium", "U", 238.29f);
//		
		Scanner scan = new Scanner(System.in);
		
		MyTreeSet myTreeSet = new MyTreeSet();
		
		int choice = 0;
		
		do
		{
				System.out.println("1. Insert an Element ");
				System.out.println("2. Delete an Element ");
				System.out.println("3. InOrder an Traversal ");
				System.out.println("4. PreOrder an Traversal ");
				System.out.println("5. PostOrder an Traversal ");
				System.out.println("6. Exit ");
				System.out.println("7. Enter choice : ");
				choice = scan.nextInt();
				
						switch(choice) {
						case 1: 
							myTreeSet.insert(); break;
						case 3:
							myTreeSet.inOrder(myTreeSet.root); break;
						case 4:
							myTreeSet.preOrder(myTreeSet.root); break;
						case 5:
							myTreeSet.postOrder(myTreeSet.root); break;	
						case 6:
							break;
						
						}
				
		} while(choice!=6);
	
	
	
	
	
	}
	
	
	
	
}

class MyTreeSet //Container
{
		ChemicalElement root = null, temp;
		
		//function to add
		
		void insert() {
				create();
				if(root==null) {
					root = temp;
				}
				else {
						search(root);
				}
		}
		
		void create() {
			System.out.println("Enter atomic number : ");
			Scanner scan = new Scanner (System.in);
			int tempAtomicNumber = scan.nextInt();
			
			temp = new ChemicalElement();
			temp.atomicNumber = tempAtomicNumber;
			
			temp.left = null;
			temp.right = null;
			
			
			
		}

		void search (ChemicalElement ce)
		{
			if((temp.atomicNumber > ce.atomicNumber) && (ce.right!=null))
					search(ce.right); // recursive call
			else if ((temp.atomicNumber > ce.atomicNumber) && (ce.right==null))
					ce.right=temp; //assinig the node
			
				
			if((temp.atomicNumber > ce.atomicNumber) && (ce.left!=null))
				search(ce.left); // recursive call
			else if ((temp.atomicNumber > ce.atomicNumber) && (ce.left==null))
				ce.left=temp; //assinig the node	
				
				
				
				
				
				
		}
		
		void inOrder(ChemicalElement ce) {
			if(root == null) {
				System.out.println("No elements to show in the tree");
				return;
				
			}
			if(ce.left !=null) 
				inOrder(ce.left);
			
			System.out.println("DATA :"+ce);
			
			if(ce.right !=null) 
				inOrder(ce.right);
		}
		void preOrder(ChemicalElement ce) {
			if(root == null) {
				System.out.println("No elements to show in the tree");
				return;
				
			}
			if(ce.left !=null) 
				preOrder(ce.left);
			
			System.out.println("DATA :"+ce);
			
			if(ce.right !=null) 
				preOrder(ce.right);
		}
		void postOrder(ChemicalElement ce) {
			if(root == null) {
				System.out.println("No elements to show in the tree");
				return;
				
			}
			if(ce.left !=null) 
				postOrder(ce.left);
			
			System.out.println("DATA :"+ce);
			
			if(ce.right !=null) 
				postOrder(ce.right);
		}
}
		//function to search
		/*
		 * Kite k1 = new Kite();
		 * Kite k4 = k1;
		 * 
		 */
	


	/*
			gold.left= silver;
			gold.left.left = calcium;
			gold.left.right = tin;
			
			gold.right = radium;
			gold.right.left = lead;
			gold.right.right = uranium;
	*/
				
		
		
		
		









