import java.util.Objects;
import java.util.Scanner;

public class Restaurante implements EnumsFuncionarios{
    static Scanner scanner = new Scanner(System.in);
    static SleepMetod sleep = new SleepMetod();
    public static void main(String args[]){
        Funcionario funcionario = cadastrarFuncionario();

        funcionario.mostrarFuncionario();
    }

    public static Funcionario cadastrarFuncionario() {
        System.out.println("CADASTRAMENTO DE FUNCIONÁRIOS: \n");

        sleep.Sleeping(1000);

        System.out.println("Iniciando cadastro...\n");

        sleep.Sleeping(1000);

        String x;
        do {
            System.out.println("Deseja cadastrar um garçom ou um cozinheiro?");
            x = scanner.nextLine();
            //x = x.toUpperCase();

            System.out.println(x);

            if ((x != "GARCOM") && (x != "GARÇOM") && (x != "cozinheiro")) {
                System.out.println("Entrada inválida!\n");
            }
        } while(x != "GARCOM" && x != "GARÇOM" && x != "cozinheiro");

        System.out.printf("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.printf("\nDigite o CPF do funcionário: ");
        String cpf = scanner.nextLine();
        System.out.printf("\nDigite o RG do funcionário: ");
        String rg = scanner.nextLine();
        System.out.printf("\nDigite o endereço do funcionário (Rua ..., número): ");
        String end = scanner.next();
        System.out.println("\nDigite o estado civil do funcionário: ");
        String ec = scanner.next();
        ec.toUpperCase();
        System.out.println("\nDigite o número da carteira de trabalho do funcionário: ");
        int nroC = scanner.nextInt();

        if(x == "GARCOM" || x == "GARÇOM"){
            System.out.println("\nDigite o salário base do garçom: ");
            double sal = scanner.nextDouble();
            System.out.println("\nSelecione o dia de folga do garçom: ");
            System.out.println("\n1. Domingo" +
                    "2. Segunda-Feira" +
                    "3. Terça-feira" +
                    "4. Quarta-feira" +
                    "5. Quinta-feira" +
                    "6. Sexta-feira" +
                    "7. Sábado\n");

            int folga = scanner.nextInt();

            Funcionario garcom = new Garcom(nome, end, converterEstadoCivil(ec), nroC, cpf, rg, sal, converterFolga(folga));
            return garcom;
        }

        Funcionario cozinheiro = new Cozinheiro(nome, end, converterEstadoCivil(ec), nroC, cpf, rg);
        return cozinheiro;
    }

    public static EnumsFuncionarios.EstadoCivil converterEstadoCivil(String ec){
        if(Objects.equals(ec, "SOLTEIRO") || Objects.equals(ec, "SOLTEIRA")){
            return EstadoCivil.SOLTEIRA;
        }
        if(Objects.equals(ec, "CASADO") || Objects.equals(ec, "CASADA")){
            return EstadoCivil.CASADA;
        }
        if(Objects.equals(ec, "DIVORCIADO") || Objects.equals(ec, "DIVORCIADA")){
            return EstadoCivil.DIVORCIADA;
        }
        if(Objects.equals(ec, "SEPARADO") || Objects.equals(ec, "SEPARADA")){
            return EstadoCivil.SEPARADA;
        }
        if(Objects.equals(ec, "VIUVO") || Objects.equals(ec, "VIUVA") || Objects.equals(ec, "VIÚVO") || Objects.equals(ec, "VIÚVA")){
            return EstadoCivil.VIUVA;
        }
        else {
            return null;
        }
    }

    public static EnumsFuncionarios.DiaSemana converterFolga(int folga){
        return switch (folga){
            case 1 -> DiaSemana.DOMINGO;
            case 2 -> DiaSemana.SEGUNDA;
            case 3 -> DiaSemana.TERCA;
            case 4 -> DiaSemana.QUARTA;
            case 5 -> DiaSemana.QUINTA;
            case 6 -> DiaSemana.SEXTA;
            case 7 -> DiaSemana.SABADO;
            default -> null;
        };
    }

    /*public static Itens cadastrarItens(){

    }

    public static Pedido cadastrarPedido(){

    }

    public static void fecharMes(){

    }*/
}
