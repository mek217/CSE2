////////////////////////////////////////////////////////////////////////////
//Matthew Koh
//12/4/14
//Lab 13
//Program Ragged

public class Ragged{
    public static void main(String[] arg){
        int[][] ragged = new int[5][];
        for(int i=0;i<ragged.length;i++){
            ragged[i]=new int[3*i+5];
            for(int j=0;j<ragged[i].length;j++){
                ragged[i][j]=(int)(Math.random()*39);
            }
        }
        
        System.out.println("Before sorting");
        for(int i=0;i<ragged.length;i++){
            for(int j=0;j<ragged[i].length;j++){
                System.out.print(ragged[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        int v=0, w=0, x=0, y=0, z=0, smallest=0;
        for(w=0;w<ragged.length;w++){                                        //Number Row
            for(x=0;x<ragged[w].length;x++){                                     //Number Element
                for(y=x;y<ragged[w].length;y++){
                    smallest=0;
                    for(z=y;z<ragged[w].length;z++){
                        //System.out.println("y after equaling x: "+y);
                        if(ragged[w][z]<ragged[w][x]){smallest=z;}
                        //System.out.println("Line: "+w+", sort #"+(x+1)+". Smallest element out of elems "+sortSize(ragged, w, y)+": "+ragged[w][smallest]);
                    }
                    if(ragged[w][y]>ragged[w][smallest]){
                        int temp=ragged[w][y];
                        ragged[w][y]=ragged[w][smallest];
                        ragged[w][smallest]=temp;
                    }
                }
            }
        }
        
        
        System.out.println("After sorting");
        for(int k=0;k<ragged.length;k++){
            int temp=ragged[k][0];
            for(int l=0;l<ragged[k].length;l++){
                ragged[k][l]=(l<ragged[k].length-1)?ragged[k][l+1]:temp;
                System.out.print(ragged[k][l]+" ");
            }
            System.out.println();
        }
        
    }
}