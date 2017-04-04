package Objects;

/**
 * Created by user on 01.04.2017.
 */
public class User {

    private long userId;
    private String userName;
    private String userLastName;

    public User(long userId, String userName, String userLastName) {
        this.userId = userId;
        this.userName = userName;
        this.userLastName = userLastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        return userLastName != null ? userLastName.equals(user.userLastName) : user.userLastName == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userLastName != null ? userLastName.hashCode() : 0);
        return result;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
}
