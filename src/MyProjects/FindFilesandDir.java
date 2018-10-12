package MyProjects;

 import java.io.File; 
 public class FindFilesandDir 
 { 
	public void RecursivePrint(File[] arr,int index,int level) 
 	{ 
 		
 		if(index == arr.length) { 
 			return; 
 		}
 		
 		for (int i = 0; i < level; i++) { 
 			System.out.print("\t"); 
 		}
 		
 		if(arr[index].isFile()) { 
 			System.out.println(arr[index].getName());
 			
 			/* other options like length,read,write

 		    int count=0;
 			long read=0;
 			if(arr[index].getName()!=null) {
 				count++;
 				if(count>0) {
 					for (int i=0;i<count;i++) {
 						read =arr[i].length();
 						System.out.println(read);
 					}
 					
 					
 				}
 			}
 			
 			*/
 				
 		}
 		
 		else if(arr[index].isDirectory()) 
 		{ 
 			System.out.println("[" + arr[index].getName() + "]"); 
 			
 			
 			RecursivePrint(arr[index].listFiles(), 0, level + 1); 
 		} 
 			
 		
 		RecursivePrint(arr,++index, level); 
 	} 
 	
 	
 	public static void main(String[] args) 
 	{ 
 		FindFilesandDir f1=new FindFilesandDir();
 		
 		String maindirpath = "//Users//kctech//Desktop//Js files for clientconfig"; 
 				
 		
 		File maindir = new File(maindirpath); 
 		
 		if(maindir.exists() && maindir.isDirectory()) 
 		{ 
 			
 			File arr[] = maindir.listFiles(); 
 			
 			
 			System.out.println("Files from main directory : " + maindir); 
 			
 			
 			f1.RecursivePrint(arr,0,0); 
 	     } 
 		else {
 			System.out.println("no such path in your workspace");
 		}
 	} 
 } 

