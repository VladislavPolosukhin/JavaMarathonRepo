package day13;

import java.util.LinkedList;
import java.util.List;

public class User {

    private String username;
    private List<User> subscriptions = new LinkedList<>();

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
        System.out.println(user.getUsername() + " subscribed on you");
    }

    public boolean isSubscribed(User user){
        return subscriptions.contains(user);
    }

    public boolean isFriend (User user){
        return (subscriptions.contains(user) && user.getSubscriptions().contains(this));
    }

    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(user,this,text);
    }

    @Override
    public String toString() {
        return username;
    }
}
