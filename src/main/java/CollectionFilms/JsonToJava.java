package CollectionFilms;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JsonToJava {
    private static final String  TAG_COLLECTIONS ="collections";
    private static final String  TAG_NAME ="name";
    private static final String  TAG_YEAR_PRODUCE ="year_produce";
    private static final String  TAG_NAME_REJISER ="name_rejiser";
    private static final String  TAG_NAME_ACTERS ="name_akters";



    JSONParser jsonParser = new JSONParser();



    public List<CollectionsFilm> jsonToJava(){
        try(FileReader fileReader = new FileReader("src/collectionsFilm.json")){
            JSONObject jsonObject =  (JSONObject) jsonParser.parse(fileReader);
            JSONArray collectionsFilm = (JSONArray) jsonObject.get(TAG_COLLECTIONS);
            List<CollectionsFilm> collectionsFilmList = new ArrayList<>();

            for (Object films: collectionsFilm) {
                JSONObject film = (JSONObject) films;
                String nameFilm = (String) film.get(TAG_NAME);
                long year_produse = (long) film.get(TAG_YEAR_PRODUCE);
                String name_rejisers = (String) film.get(TAG_NAME_REJISER);
                String name_akters = (String) film.get(TAG_NAME_ACTERS);
                collectionsFilmList.add(new CollectionsFilm(nameFilm,year_produse,name_rejisers,name_akters));


            }
            return collectionsFilmList;




        } catch (IOException e) {
            System.out.println("File IOERRor "+ e.getMessage());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;


    }



}
