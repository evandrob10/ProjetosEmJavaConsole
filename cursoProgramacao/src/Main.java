import java.util.Locale;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		double [] triangulos = new double[2];
		for(int i = 0;i< triangulos.length;i++ ) {
			triangulos[i] = calculoArea(coletarDados(i+1)); 
		}
		exibirResultado(maiorArea(triangulos),triangulos);
	}
	public static double [] coletarDados (int triangulo) {
		Scanner sc = new Scanner(System.in);
		double [] dadosTriangulo = new double[3];
		System.out.printf("Digite os dados do %d triangulo:\n",triangulo);
		for(int i = 0;i<dadosTriangulo.length;i++) {
			System.out.printf("%s Lado - Digite o valor: ",i);
			dadosTriangulo[i] = sc.nextDouble();
		}
		sc.close();
		return dadosTriangulo;
	}
	public static double calculoArea (double [] valores) {
		double p = calculoP(valores); 
		double areaTriangulo = Math.sqrt(p*(p - valores[0])*(p - valores[1])*(p - valores[2]));
		return areaTriangulo;
	}
	public static double calculoP(double [] valores) {
		double somaValores = 0;
		for(double valor : valores) somaValores += valor;
		return somaValores / 2;
	}
	public static String maiorArea(double [] areas) {
		return areas[0] > areas[1] ? "X":"Y";
	}
	public static void exibirResultado(String maiorArea,double [] areas) {
		System.out.printf("Triangle X area: %.2f\n",areas[0]);
		System.out.printf("Triangle Y area: %.2f\n",areas[1]);
		System.out.printf("Larger area: %s",maiorArea);
	}
}