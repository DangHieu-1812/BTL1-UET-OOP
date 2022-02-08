import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<Word> dictionary = new ArrayList<Word>();
        DictionaryManagement management = new DictionaryManagement();
        DictionaryCommandLine commandline = new DictionaryCommandLine();
        commandline.dictionaryAdvanced();

    }
}
