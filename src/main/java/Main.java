public class Main {

    public static void main(String[] args) {
        String url = "https://api.chucknorris.io/jokes/random";
        System.out.println("JOKES ABOUT CHUCK NORRIS:\n");
        System.out.println(new Joke().getJokes(url));
    }

}
