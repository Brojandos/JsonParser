import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author: Brojandos;
 * @date: 20.04.2017.
 */

public class Twitter extends BaseEntity {
    @Expose
    private String text;
    @Expose
    private String source;
    @Expose
    private User user;

    public Twitter() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public class User extends BaseEntity {
        @SerializedName("screen_name")
        private String screenName;
        @SerializedName("followers_count")
        private int followersCount;
        @SerializedName("friends_count")
        private int friendsCount;
        @SerializedName("listed_count")
        private int listedCount;
        @SerializedName("favourites_count")
        private int favouritesCount;
        @SerializedName("statuses_count")
        private int statusesCount;

        public User() {}

        public String getScreenName() {
            return screenName;
        }

        public void setScreenName(String screenName) {
            this.screenName = screenName;
        }

        public int getFollowersCount() {
            return followersCount;
        }

        public void setFollowersCount(int followersCount) {
            this.followersCount = followersCount;
        }

        public int getFriendsCount() {
            return friendsCount;
        }

        public void setFriendsCount(int friendsCount) {
            this.friendsCount = friendsCount;
        }

        public int getListedCount() {
            return listedCount;
        }

        public void setListedCount(int listedCount) {
            this.listedCount = listedCount;
        }

        public int getFavouritesCount() {
            return favouritesCount;
        }

        public void setFavouritesCount(int favouritesCount) {
            this.favouritesCount = favouritesCount;
        }

        public int getStatusesCount() {
            return statusesCount;
        }

        public void setStatusesCount(int statusesCount) {
            this.statusesCount = statusesCount;
        }
    }
}
