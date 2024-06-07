public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        //declarando variaveis
        int eggsPerChicken = 5;
        int chickenCount = 3;
        
        //calculando o total de ovos usando apenas as variaveis
        int totalEggs = (eggsPerChicken*chickenCount++)+ (eggsPerChicken*chickenCount)+ (eggsPerChicken*(chickenCount/2));
        
        //exibindo a qtde de ovos
        System.out.println(totalEggs);
        
        //novo cenario - não necessita fazer nova declaração, apenas colocar os novos valores
        eggsPerChicken = 4;
        chickenCount = 8;
        
        //calcular usando a mesma formula, com os novos valores das variaveis
        totalEggs = (eggsPerChicken*chickenCount++)+ (eggsPerChicken*chickenCount)+ (eggsPerChicken*(chickenCount/2));
        
        System.out.println(totalEggs);
    }   
}
