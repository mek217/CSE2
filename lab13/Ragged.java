////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//12/4/14
//Lab 13
//Program Ragged

public class Ragged{
    public static void main(String[] arg){
        int[][] ragged = new int[5][];
        int i=0, j=0;
        for(i=0;i<5;i++){
            ragged[i]=new int[3*i+5];
            for(j=0;j<ragged[i].length;j++){
                ragged[i][j]=(int)(Math.random()*39);
                System.out.print(ragged[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        int[][] sortRag = ragged;
        
        System.out.println("sortRag before sorting");
        for(int x=0;x<sortRag.length;x++){
            for(int y=0;y<sortRag[x].length;y++){
                System.out.print(sortRag[x][y]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        for(int k=0;k<sortRag.length;k++){                                      //Form row
            for(int l=0;l<sortRag[k].length;l++){                               //Form elems per row
                for(int m=l+1, smallest=0;m<sortRag[k].length;m++){
                    if(sortRag[k][m]>sortRag[k][smallest]){
                        smallest=m;
                    }
                    if(m==sortRag[k].length-1){
                        int temp=sortRag[k][m];
                        sortRag[k][m]=sortRag[k][smallest];
                        sortRag[k][smallest]=temp;
                    }
                }
                //System.out.print(sortRag[k][l]+" ");
            }
            //System.out.println();
        }
        
        
        System.out.println("sortRag after sorting");
        for(int x=0;x<sortRag.length;x++){
            for(int y=0;y<sortRag[x].length;y++){
                System.out.print(sortRag[x][y]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
    }
}