import java.util.Scanner;

public class ARMSTRONG {
    public ARMSTRONG(int limit) {
        String str;
        char ch;
        // Nombre limite pour calculer les nombres d'Armstrong int limit

        int temp;
        // Boucle de nombres de 1 à nombre limite
        for (int number = 1; number <= limit; number++) {
            // Somme des digits composant le nombre
            int sum = 0;
            // str = on récupère en String le int number
            str = String.valueOf(number);
            // Initialisation du tableau dans lequel sera stocké les puissances de chaque digit calculées
            int[] digits = new int[str.length()];
            // On parcours la chaine String number et à chaque caractère on récupère la valeur numérique.
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                //récupération de la valeur numérique correspondant au Char i de la chaine str
                int digit = Character.getNumericValue(ch);
                temp = digit;
                // On calcul les puissances.
                for (int puissance = 1; puissance < str.length(); puissance++) {
                    digit = temp * digit;
                    //Stockage des puissances en tableau
                    digits[i] = digit;
                }
            }
            // Calcul de la somme des puissances stockées
            for (int digit : digits) {
                sum += digit;
            }
            // Si somme = nombre , alors c'est un Nombre d'Armstrong.
            if (number == sum)
                System.out.println("Armstrong number : " + number);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit : ");
        int limit = sc.nextInt();
        ARMSTRONG armstrong = new ARMSTRONG(limit);
    }
}




