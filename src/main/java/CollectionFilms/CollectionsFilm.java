package CollectionFilms;

public class CollectionsFilm {
//    "name": "Chala sport",
//            "year_produce": 2013,
//            "name_rejiser": "Emil Esenaliev",
//            "name_akters": "Emil Esenaliev , Samat Dolotbakov"

    private String name;
    private long year_produce;
    private String name_rejiser;
    private String name_akters;

    public CollectionsFilm(String name, long year_produce, String name_rejiser, String name_akters) {
        this.name = name;
        this.year_produce = year_produce;
        this.name_rejiser = name_rejiser;
        this.name_akters = name_akters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getYear_produce() {
        return year_produce;
    }

    public void setYear_produce(long year_produce) {
        this.year_produce = year_produce;
    }

    public String getName_rejiser() {
        return name_rejiser;
    }

    public void setName_rejiser(String name_rejiser) {
        this.name_rejiser = name_rejiser;
    }

    public String getName_akters() {
        return name_akters;
    }

    public void setName_akters(String name_akters) {
        this.name_akters = name_akters;
    }

    @Override
    public String toString() {
        return "CollectionsFilm{" +
                "name='" + name + '\'' +
                ", year_produce=" + year_produce +
                ", name_rejiser='" + name_rejiser + '\'' +
                ", name_akters='" + name_akters + '\'' +
                '}';
    }
}
