package CollectionFilms;


import java.util.Scanner;

public class Option {
    Scanner scanner = new Scanner(System.in);
    Printer printer = new Printer();
    Search search = new Search();
    JsonToJava jsonToJava = new JsonToJava();





    public void options() throws Exception {

        while (true) {


            System.out.println(
                              "<-----------Options---------->\n" +
                            "1 Filimderdi Sort Kylyp Jyharat\n" +
                            "       1.1 Filmderdi alfabit boiunch chygaruu\n" +
                            "       1.2 Filmderdi Jyly Boiuncha Chygaruu\n" +
                            "       1.3 Filmderdi Rejisoru boiuncha chygaruu\n" +
                            "2 Filimderdin Aty menen Izdoo\n" +
                            "3 Filimderdi Rejisoru menen Izdeoo\n" +
                            "4 Filimderdi Acteru menen Izdeoo\n" +
                            "5 Exit \n\n" +
                            "Plese Chose Option!"

            );


            int optinNumber = scanner.nextInt();

            switch (optinNumber) {
                case 1:
                    // filimdin baaryn sort kylyp chygaruu
                    //sout kerek 1,2,3 degen
                    System.out.println(
                            "1 Filmderdi alfabit boiunch chygaruu\n" +
                                    "2 Filmderdi Jyly Boiuncha Chygaruu\n" +
                                    "3 Filmderdi Rejisoru boiuncha chygaruu\n" +
                                    "Chose one of this options?"
                    );
                    int optinNumber1 = scanner.nextInt();
                    switch (optinNumber1) {
                        case 1:
                            // alfabit boiuncha
                            printer.printer(search.sortAlfabit(jsonToJava.jsonToJava()));
                            break;
                        case 2:
                            // jyl boiuncha
                            printer.printer(search.sortByYear(jsonToJava.jsonToJava()));
                            break;
                        case 3:
                            //rejissor
                            printer.printer(search.sortWithRejisor(jsonToJava.jsonToJava()));
                            break;
                        default:
                            throw new Exception("Chose corect Optin Number");
                    }
                    break;
                case 2:
                    // filmdin aty menen izdeoo
                    System.out.println("Enter Film Name: ");
                    String filmName = scanner.next();
                    printer.printer(search.searchWithFilmName(jsonToJava.jsonToJava(), filmName));
                    break;

                case 3:
                    // filmdi rejisor menen izdoo
                    System.out.println("Enter Rejisor Name: ");
                    String rejisorName = scanner.next();
                    printer.printer(search.searchWithRejisor(jsonToJava.jsonToJava(), rejisorName));
                    break;

                case 4:
                    // filmdi acter menen izdoo
                    System.out.println("Enter Akter Name: ");
                    String akterName = scanner.next();
                    printer.printer(search.searchWithAkter(jsonToJava.jsonToJava(), akterName));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    throw new Exception("Chose correct option nmber");
            }
        }
    }
}
