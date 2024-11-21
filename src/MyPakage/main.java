package MyPakage;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;


public class main {
    public static void main(String[] args) throws FileNotFoundException {

        //Using file path
        String jsonFilePath = "src/MyPakage/data.json";
        Gson gson = new Gson();

        // Reading json file
        FileReader readFile = new FileReader(jsonFilePath);

        //get data from file and set into Generic
        Type bookList = new TypeToken<List<Book>>(){}.getType();

        //parse this json data into java object and store in list
        List<Book> bookListobject = gson.fromJson(readFile, bookList);

        //calling all methods
        bookProcessor processor = new bookProcessor(bookListobject);
        processor.displayAllBooks();
        processor.displayAuthor();
        processor.avgPriceBooks();
        processor.titleBooks();
        processor.specificCategoryBook();

        }
    }
