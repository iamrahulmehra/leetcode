class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        
        
        for(int i = 0 ; i<image.length;i++){
            int m = image[i].length;
            for(int j = 0 ; j<m ;j++){
                int temp = image[i][j];
                image[i][j]=image[i][m-1];
                image[i][m-1]=temp;
                m--;
            }
            
        }
        for(int i = 0 ; i< image.length;i++){
            for(int j = 0 ; j< image.length ;j++){
               image[i][j] = image[i][j] ^ 1; 
            }
        }
        
        
        
        return image;
        
        
        
    }
}