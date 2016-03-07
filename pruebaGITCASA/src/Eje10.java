
public class Eje10 {


	public static void imprimir(int matriz[][])
	{ 
		int i, j;
		for (i=0; i<matriz.length; i++)
		{
			for (j=0; j<matriz[i].length; j++)
			{
				System.out.print("["+matriz[i][j]+"]"+" ");

			}
			System .out.println(" ");
		} 

	}


	public static void main(String[] args) {

		int[][] matriz1 = {{1,2,2},{2,3,1}};
		int[][] matriz2 = {{3,1},{2,1},{1,2}};

		int fila_matriz1 = matriz1.length;
		int columna_matriz1 = matriz1[0].length;

		int fila_matriz2 = matriz2.length;
		int columna_matriz2 = matriz2[0].length;


		System.out.println("Mostrar la primera matriz: ");
		imprimir(matriz1);
		System.out.println("Mostrar la segunda matriz: ");
		imprimir(matriz2);

		int[][] multiplicacion = new int[fila_matriz1][columna_matriz2];

		if (columna_matriz1 == fila_matriz2)
		{
			System.out.println("Resultado: ");
			
			for (int x=0; x < multiplicacion.length; x++) {
				for (int y=0; y < multiplicacion[x].length; y++) {
					for (int z=0; z<columna_matriz1; z++) {
						multiplicacion [x][y] += matriz1[x][z]*matriz2[z][y]; 
					}
					System.out.print("["+multiplicacion[x][y]+"]"+" ");
				}
			}
			System.out.println();

		}

		else{
			System.out.println("Las matrizes no son iguales, no se pueden multiplicar");
		}


	}

}
