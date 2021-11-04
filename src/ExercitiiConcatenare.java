public class ExercitiiConcatenare {
    public static void main(String[] args) {
        int numar = 10;
        String text = "Test";
        double numarDouble = 11.1;
        float numarFloat = 11.1f;
        boolean adevar = true;
        char c = '*';

        System.out.println("Variabila mea string are valoarea" + text);
        System.out.println("numarul meu este" + numar);
        System.out.println(numarDouble + "este numarul meu double");
        System.out.println(numarFloat + "este numarul meu floar");
        System.out.println("am declarat un caracter" + c);


// cand nu se doresc mai multe plusuri
        System.out.printf("am declarat o variabila string cu valoare %s",text);
        //pune souf-urile pe acelasi rand si atunci va trebui sa punem sout-uri goale
        System.out.println();
        System.out.printf("am declarat o variabila de tip int cu valoarea %d", numar);
        System.out.println();
        System.out.printf("am declarat o variabila double cu valoarea %f si un string cu valoarea %s", numarDouble, text);
        System.out.println();
        System.out.printf("am declarat un boolean %b", adevar);
        System.out.println();
        System.out.printf("caracterul meu este %c", c);

    }

}
