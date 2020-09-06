package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Donald");
        User user2 = new User("Keanu");
        User user3 = new User("Mike");

        user1.sendMessage(user2,"Hello");
        user1.sendMessage(user2,"How are u?");

        user2.sendMessage(user1,"Hi");
        user2.sendMessage(user1,"I'm fine");
        user2.sendMessage(user1,"U?");

        user3.sendMessage(user1, "Hey you");
        user3.sendMessage(user1, "Where is my money?");
        user3.sendMessage(user1, "bitch");
        user3.sendMessage(user1, "i'l find you");

        user1.sendMessage(user3, "hey dude");
        user1.sendMessage(user3, "just relax");
        user1.sendMessage(user3, "i'll return all in next week");

        MessageDatabase.showDialog(user1,user3);
    }
}
