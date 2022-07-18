public class Main {
    public static void main(String[] args) {
        checkNameSurname("Ivan", "Ivanov");
        checkNameSurname("Nick", "Smith");
        checkNameSurname("Kirill", "Tishkin");
        checkNameSurname("Ivan", "Lisichkin");
        checkNameSurname("Danya", "Sidorov");
    }
    public static void checkNameSurname(String name1, String surname1) {
        if(name1.equals("Ivan") || surname1.equals("Ivanov")) {
            if (name1.equals("Ivan") || surname1.equals("Ivanov")) {
                System.out.println("Combo!");
            } else {
                System.out.println("Sorry, go out!");
            }
        }else{
            System.out.println("Hello, " + name1 + " " + surname1);
            }
        }
    }