package practica1;
import java.util.Scanner;
/**
 * Una clase para introducir tus notas y hacer el calculo de tu media y ver si has aprobado
 * @version 1.1 06/04/2022
 * @author Carlos Valles Ribes, documentado por Margaux Argüelles Alonso
 */
	
public class notas {
		/**declaramos las variables que nos hacen falta*/
		double uf1, uf2, uf3;
		double acu1, acu2, acu3, def;
		/**utilizamos scanner para poder introducir datos*/
		Scanner entrada = new Scanner(System.in);

		/**vamos a crear un metodo para ingresar*/
		
		public void IngresaNotas() {
			/**cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas*/
			System.out.println("ingrese las notas del estudiante");
			/**Pedimos la primera nota que pasara a ser el valor de la variable uf1 declarada anteriormente*/
			System.out.print("ingrese nota 1: ");
			uf1= entrada.nextDouble();
			/**Pedimos la segunda nota que pasara a ser el valor de la variable uf2 declarada anteriormente*/
			System.out.print("ingrese nota 2: ");
			uf2= entrada.nextDouble();
			/**Pedimos la tercera nota que pasara a ser el valor de la variable uf3 declarada anteriormente*/
			System.out.print("ingrese nota 3: ");
			uf3= entrada.nextDouble();
		}

		/**Creamos un metodo para comprobar que las notas hayan sido introducidas correctamente*/
	
		public void comprobacion(){
			/** Si las notas son superiores a 10 un mensaje de error aparecera*/
			if (uf1>10) {
				System.out.println(" nota1 mal introducida");
			}else {
				System.out.println(" nota1 correcta");
			}
			if (uf2>10) {
				System.out.println(" nota2 mal introducida");
			}else {
				System.out.println(" nota2 correcta");
			}
			if (uf3>10) {
				System.out.println(" nota3 mal introducida");
			}else {
				System.out.println(" nota3 correcta");
			}
		}

		/**Creamos un metodo para calcular la nota*/
		
		public void Calculonotas() {
			acu1= uf1*0.35;
			acu2 = uf2 * 0.35;
			acu3 = uf3 * 0.30;
			
			def = acu1 + acu2+ acu3;
			
			/**hasta aqui la tenemos calculada pero no la mostramos*/
		}
		
		/**Creamos un metodo para mostrar los resultados finales*/
		
		public void Mostrar() {
			/**print ln lo que hace es que al terminar el print baja la linea 
			 * Primero se muestran las notas introducidas
			 * Después las notas acumuladas
			 * Por último se muestra la nota definitiva
			 */
			
			System.out.println(" notas introducidas son:");
			System.out.println(" nota1 = " + uf1);
			System.out.println(" nota2 = " + uf2);
			System.out.println(" nota3 = " + uf3);
			
			System.out.println(" acumuado 1 = "+ acu1);
			System.out.println(" acumuado 2 = "+ acu2);
			System.out.println(" acumuado 3 = "+ acu3);
			
			System.out.println(" nota definitiva es = "+ def);
			}
		
		/**Creamos una funcion para que nos indique si se está aprovado o suspendido*/
		
		public void aprobado() {
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
					System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		public static void main(String[] args) {
			/**creamos mecanimos para llamar a cualquier metodo fuero de la clase*/
			notas fc= new notas();
			fc.IngresaNotas();
			
			fc.comprobacion();
			
			fc.Calculonotas();

			fc.Mostrar();
			
			fc.aprobado();
		}
}