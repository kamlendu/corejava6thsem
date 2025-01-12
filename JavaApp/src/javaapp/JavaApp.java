/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp;

/**
 *
 * @author root
 */
public class JavaApp {
    
    //int x[] = new int[5];//{3,4,5,6,7};
    int y[][]={{2,3,4},{5,6,7}};
    int z [][][]={{
                    {1,1,1,3},{2,2,2,3},{3,3,3,3}
                    },
                    {
                        {1,1,1,2},{2,2,2,2},{3,3,3,2}
                    }
            };

       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       new JavaApp().printArray();
    
    }
    
    private void printArray()
    {
        int[] x= new int[5];
         
        for(int i=0; i<x.length;i++)
        {
            System.out.println(x[i]);
        }
        
        for(int i=0; i<y.length;i++){
                    
           for(int j=0;j< y[0].length;j++)
           {
                        System.out.println("y["+i+"]["+j+"] "+y[i][j]);
            }
                    
                    }
        
         for(int i=0; i<z.length;i++){
                    
           for(int j=0;j< z[0].length;j++){
                for(int k=0;k< z[0][0].length;k++){
           
                        System.out.println("z["+i+"]["+j+"]["+k+"]  "+z[i][j][k]);
                }   
                }
                    
                    }
    }
    
}
