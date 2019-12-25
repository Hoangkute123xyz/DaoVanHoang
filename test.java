public static int [][]rotateImage(int[][]a){
        int n = a[0].length;
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int temp =a[i][j];
                a[i][j]=a[n-j-1][i];
                a[n-j-1][i]=a[n-i-1][n-j-1];
                a[n-i-1][n-j-1]=a[j][n-i-1];
                a[j][n-i-1]=temp;
            }
        }
        return a;
    }
