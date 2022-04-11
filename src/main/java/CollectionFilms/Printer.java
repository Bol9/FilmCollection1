package CollectionFilms;


import java.util.List;

public class Printer {

    public void printer(List<CollectionsFilm> collectionsFilmList) {
        if (collectionsFilmList.isEmpty()) { // izdegen attakgy fil je rejisor je acter jok bolso
            System.out.println("\n-------->No Result sorryyy(( <-----------\n\n");
        } else {

            System.out.println(
                    "    --------------------------------------Found Films---------------------------------------------\n" +
                            "  Name Of Film                | Year produce | Name of Rejiser              | Name Of Akters \n" +
                            "------------------------------+--------------+------------------------------+-------------------------"
            );
            for (CollectionsFilm film : collectionsFilmList) {
                System.out.println(
                        film.getName() + " ".repeat(30 - film.getName().length()) + "| " + film.getYear_produce() + " ".repeat(9) +
                                "| " + film.getName_rejiser() + " ".repeat(29 - film.getName_rejiser().length()) +
                                "| " + film.getName_akters()
                );

            }
            System.out.println("\n\n");


        }
    }
}
