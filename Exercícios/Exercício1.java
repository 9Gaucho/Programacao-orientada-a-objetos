public class AreaRetangulo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a largura do retângulo: ");
    double largura = scanner.nextDouble();

    System.out.print("Informe a altura do retângulo: ");
    double altura = scanner.nextDouble();

    double area = largura * altura;

    System.out.println("A área do retângulo é: " + area);
  }
}
