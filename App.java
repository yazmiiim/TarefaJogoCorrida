/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleproject1;

public class App {
    
  public static void main(String args[]){
	Veiculo fusca = new Veiculo(new MotorDeFusca());
        Veiculo ferrari = new Veiculo (new MotorDeFerrari());
        Veiculo lamborgini = new Veiculo (new MotorDeLamborgini());
	
      System.out.println(fusca.acelerar());
      System.out.println(ferrari.acelerar());
      System.out.println(lamborgini.acelerar());
    }

}

