public class mainColection {
    public static void main (String[] args){
        Colection vetores = new Colection();
        vetores.printArrays();
        vetores.printEquals();

        int location = vetores.searchForInt(5);
        if (location >= 0)
            System.out.printf ("Encontrado elemento %d no Array!", location);
        else
        System.out.printf ("Não encontrado elemento no Array!");

        location = vetores.searchForInt(8765);
        if (location >= 0)
        System.out.printf ("Encontrado elemento %d no Array!", location);
        else
        System.out.printf ("Não encontrado elemento no Array!");

    }
    
}
