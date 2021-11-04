public class ExercitiiPractice {
    public static void main(String[] args) {
        // 1.Sa se declare 2 variabile: num1, num2. Initializati-le si printati-le.
        int num1 = 100;
        int num2 = 30;
        System.out.printf("primul numar este %d, iar al doilea numar este %d", num1, num2);

        // 2. Declarati 4 variabile: suma, diferenta, produsul si impartirea in care sa stocati operatiile primului
        // numar raportat la al doilea. Printati rezultatele.
        int suma = num1 + num2;
        int dif = num1 - num2;
        int produs = num1 * num2;
        int cat = num1 / num2;

        System.out.println("Suma este " + suma);
        System.out.println("Diferenta este " + dif);
        System.out.println("Produsul este " + produs);
        System.out.println("Impartirea este " + cat);


        // 3. Declarati 4 variabile in care sa stocati suma, diferenta, produsul si impartirea in care sa stocati
        //operatiile celui de al doilea numar raportat in primul. Printati rezultatele.
        int suma2 = num2 + num1;
        int dif2 = num2 - num1;
        int produs2 = num2 * num1;
        int cat2 = num2 / num1;

        System.out.printf("Suma este %d, diferenta este %d, produsul este %d, catul este %d ", suma2, dif2, produs2, cat2);

        // 4. Declarati o variabila num3. Adunati noua variabila tuturor rezultatelor anerioare, si afisati pentru fiecare
        //mesajul " Dupa ce am aduagar num3 sumei/diferentei/...., am obtinut rezultatul"

        int num3 = 50;
        suma += num3;
        dif += num3;
        produs = produs + num3;
        cat += num3;
        System.out.println();
        System.out.printf("dupa ce am adaugat %d sumei mele, rezultatul a devenit %d \n", num3, suma);
        System.out.printf("dupa ce am scazut %d diferentei mele, rezultatul a devenit %d \n", num3, suma);
        System.out.printf("dupa ce am inmultit %d produsului meu, rezultatul a devenit %d \n", num3, suma);
        System.out.printf("dupa ce am impartit %d catului mele, rezultatul a devenit %d \n", num3, suma);

        // \n-new line


        // 5. Declarati o variabila de tip int la alegere si printati la consola tabla inmultirii a acelui numar:
        //----------------------------
        //valoareNumar x 1 =rezultat1
        //valoareNumar x 2 =rezultat2
        //...
        //valoareNumar x 9 =rezultat9
        //----------------------------

        int numar = 7;
        System.out.println(numar + " x 1 = " + (numar * 1));
        System.out.println(numar + " x 2 = " + (numar * 2));
        System.out.println(numar + " x 3 = " + (numar * 3));
        System.out.println(numar + " x 4 = " + (numar * 4));
        System.out.println(numar + " x 5 = " + (numar * 5));
        System.out.println(numar + " x 6 = " + (numar * 6));
        System.out.println(numar + " x 7= " + (numar * 7));

// 6. Stocati intr-o variabila restul impartirii numarului 100 la 27 si printati
// un text de forma "Restul impartirii lui 100 la 27 este egal cu X"
        int n1 = 100;
        int n2 = 27;
        int rest = n1 % n2;
        System.out.printf("Restul impartirii lui %d la %d este egal cu %d \n", n1, n2, rest);


        // 7. Declarati si initializati doua variabile de tip int.
        //Declarati urmatoarele variabile de tip boolean: primulMaiMare, alDoilesMaiMare, numereEgale.
        //Intializarea valorilor de tip boolean pe baza celor doua numere.

        int numar1 = 88;
        int numar2 = 67;
        boolean primulMaiMare = numar1 > numar2;
        boolean alDoileaMaiMare = numar1 < numar2;
        boolean numereEgale = num1 == numar2;

        System.out.println("Primul este mai mare " + primulMaiMare);
        System.out.println("Al doilea este mai mare " + alDoileaMaiMare);
        System.out.println("Sunt egale " + numereEgale);

        // 8. Declarati o variabila de tip int si intializati-o. Printati in consola urmatorul text:
        //"Vom incrementa numarul numarulMeu cu 1 in trei moduri diferite"
        //Incrementati numarul vostru cu 1 in trebi moduri diferite
        //Printati un text de forma "Dupa ce am adunat 1 in 3 moduri diferite, numarul nostru este egal cu valoareaRezultata"

        int numarulMeu = 10;
        System.out.println("Vom incrementa numarul numarulMeu cu 1 in trei moduri diferite");
        numarulMeu = numarulMeu + 1;
        numarulMeu++;
        numarulMeu += 1;

        System.out.println("Dupa ce am adunat 1 in 3 moduri diferite, numarul nostru este egal cu valoareaRezultata" + numarulMeu);

        // 9. Declarati si intializati 2 variabile de tip int: initializati prima variabila cu o valoare pozitiva,
        // a doua cu o valoare negativa.
        // Declarati 3 variabile de tip boolean: sumaMaiMareDecatZero, diferentaMaiMicaSauEgalaDecatZero, produsulMaiMareDecat100
        //si initalizati-le folosindu-va de cele doua numere.

        int nr1 = 15;
        int nr2 = -100;
        boolean sumaMaiMareDecatZero = (nr1 + nr2) > 0;
        boolean diferentaMaiMicaSauEgalaDecatZero = (nr1 - nr2) <= 0;
        boolean produsulMaiMareDecat100 = (nr1 * nr2) > 100;

        System.out.println("sumaMaiMareDecatZero" + sumaMaiMareDecatZero);
        System.out.println("diferentaMaiMicaSauEgalaDecatZeri" + diferentaMaiMicaSauEgalaDecatZero);
        System.out.println("produsulMaiMareDecat100" + produsulMaiMareDecat100);

// 10. Declarati patru variabile de tip double si intializati-le. Afisati la consola doua texte sub forma:
        //Media aritmetica a numerelor n1, n2 si n3 este egala cu rezultatul.
        //Media aritmetica a numerelor n1, n2 si n4 este egala cu rezultatul.
        //Media aritmetica a numerelor n2, n3 si n4 este egala cu rezultatul.


        double x1 = 2.15;
        double x2 = 55.6;
        double x3 = 904.34;
        double x4 = 90.56;

        double sum123 = x1 + x2 + x3;
        double sum124 = x1 + x2 + x4;
        double sum234 = x2 + x3 + x4;

        System.out.println("Media aritmetica a numerelor x1, x2 si x3 este egala cu " + (sum123/3));
        System.out.println("Media aritmetica a numerelor x1, x2 si x3 este egala cu " + (sum124/3));
        System.out.println("Media aritmetica a numerelor x1, x2 si x3 este egala cu " + (sum234/3));

    }
}
