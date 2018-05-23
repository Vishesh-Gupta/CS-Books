// find the macimum of the array values
double max = a[0];
for (int i = 1; i < a.length; i++)
    if (a[i] > max) max = a[i];

// compute the average of the array values
int N = a.length;
double sum = 0.0;
for (int i = 0; i < N; i++)
    sum += a[i];
double average = sum / N; 

// copy to another array
int N = a.length;
double[] b = new double[N];
for (int i = 0; i < N; i++)
    b[i] = a[i]; 

// reverse the elements within an array
int N = a.length;
for (int i = 0; i < N/2; i++)
{
    double temp = a[i];
    a[i] = a[N-1-i];
    a[N-i-1] = temp;
}

// matrix-matrix multiplication (square matrices) 
// a[][]*b[][] = c[][]
int N = a.length;
double[][] c = new double[N][N];
for (int i = 0; i < N; i++)
 for (int j = 0; j < N; j++)
 { // Compute dot product of row i and column j.
 for (int k = 0; k < N; k++)
 c[i][j] += a[i][k]*b[k][j];
 }