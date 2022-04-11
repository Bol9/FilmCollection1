package CollectionFilms;

import java.util.*;
import java.util.stream.Stream;

public class Search {
    // filmdin aty menen izdoo
    public List<CollectionsFilm> searchWithFilmName(List<CollectionsFilm> collectionFilm, String filmName){
        List<CollectionsFilm> foundFilms = new ArrayList<>();
        for (CollectionsFilm film: collectionFilm) {
            if(film.getName().toLowerCase().contains(filmName.toLowerCase())){
                foundFilms.add(film);
            }

        }
        return foundFilms;

    }
    // akterdun aty menen film izdoo
    public List<CollectionsFilm> searchWithAkter(List<CollectionsFilm> collectionFilm, String akterName){
        List<CollectionsFilm> foundFilms = new ArrayList<>();
        for (CollectionsFilm film: collectionFilm) {
            if(film.getName_akters().toLowerCase().contains(akterName.toLowerCase())){
                foundFilms.add(film);  // Akterloru bir bolgon filmdin attary.
            }

        }
        return foundFilms;
    }
    //rejsor menen serch
    public List<CollectionsFilm> searchWithRejisor(List<CollectionsFilm> collectionFilm, String rejisorName){
        List<CollectionsFilm> foundFilms = new ArrayList<>();
        for (CollectionsFilm film: collectionFilm) {
            if(film.getName_rejiser().toLowerCase().contains(rejisorName.toLowerCase())){
                foundFilms.add(film);
            }

        }
        return foundFilms;
    }
    public List<CollectionsFilm> sortAlfabit(List<CollectionsFilm> collectionFilm){
        List<CollectionsFilm> sortedList = new ArrayList<>();
        List<String> namesOffilm = new ArrayList<>();
        for (CollectionsFilm films: collectionFilm) {
            namesOffilm.add(films.getName());
        }
        Collections.sort(namesOffilm);


        for (String name: namesOffilm) {
            for (CollectionsFilm film: collectionFilm ) {
                if(film.getName().equals(name)){
                    sortedList.add(film);
                }

            }

        }


        return sortedList;

    }
    public List<CollectionsFilm> sortByYear(List<CollectionsFilm> collectionsFilmList){
        List<CollectionsFilm> sortedList = new ArrayList<>();
        List<Long> namesOffilm = new ArrayList<>();
        for (CollectionsFilm films: collectionsFilmList) {
            namesOffilm.add(films.getYear_produce());
        }
        Collections.sort(namesOffilm, Collections.reverseOrder());


        for (Long year: namesOffilm) {
            for (CollectionsFilm film: collectionsFilmList ) {
                if(film.getYear_produce()==year){
                    sortedList.add(film);
                }

            }

        }
        return sortedList;


    }
    public List<CollectionsFilm> sortWithRejisor(List<CollectionsFilm> collectionFilm){
        List<CollectionsFilm> sortedList = new ArrayList<>();
        List<String> namesOffilm = new ArrayList<>();
        for (CollectionsFilm films: collectionFilm) {
            namesOffilm.add(films.getName_rejiser());
        }
        Collections.sort(namesOffilm);


        for (String name: namesOffilm) {
            for (CollectionsFilm film: collectionFilm ) {
                if(film.getName_rejiser().equals(name)){
                    sortedList.add(film);
                }

            }

        }


        return sortedList;

    }
}
