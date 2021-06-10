class Friend implements Runnable {

    public Friend(String name) {

        System.out.println(name + " comes to rescue Will");
        System.out.println(name + " killed 1 monster.");
        System.out.println(name + " killed 2 monster.");
        System.out.println(name + " is attacked by Demogorgon.");


    }

    @Override
    public void run() {


    }
}

class RescueWill {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Dustin");
        Friend friend2 = new Friend("Mike");
        Friend friend3 = new Friend("Lucas");
        System.out.println("Eleven saves them all");

    }
}