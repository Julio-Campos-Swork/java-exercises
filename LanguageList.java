/*
 * 
 * FULL EXCERSICE https://exercism.org/tracks/java/exercises/karls-languages/
 */
import java.util.ArrayList;
import java.util.List;
public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
       return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
    public static void main(String[] args) {
        LanguageList list = new LanguageList();
        list.addLanguage("Java");
        list.addLanguage("Python");
        list.addLanguage("Kotlin");
        System.out.println(list.isEmpty());
        System.out.println(list.containsLanguage("Java"));
        System.out.println(list.isExciting());
        System.out.println(list.firstLanguage());
        System.out.println(list.count());
        list.removeLanguage("Python");
        System.out.println(list.count());
    
    }
}
