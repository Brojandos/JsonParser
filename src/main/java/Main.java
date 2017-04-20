import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author: Brojandos;
 * @date: 20.04.2017.
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Twitter> twitters = handleMultipleDataResponse(FileWorker.read("twitter_data.txt"), Twitter[].class);

        Collections.sort(twitters, new Comparator<Twitter>() {
            public int compare(Twitter o1, Twitter o2) {
                Integer followers1 = o1.getUser().getFollowersCount();
                Integer followers2 = o2.getUser().getFollowersCount();
                return followers2.compareTo(followers1);
            }
        });

        System.out.println("rating by followers count:");
        int i = 1;
        for (Twitter twitter : twitters) {
            System.out.println(i + ". " + twitter.getUser().getName() + " : " + twitter.getUser().getFollowersCount());
            i++;
        }
    }

    public static <T>List<T> handleMultipleDataResponse(String json, Class<T[]> clazz) {
        return Arrays.asList(new Gson().fromJson(json, clazz));
    }
}
