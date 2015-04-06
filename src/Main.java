import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //code for testing only - no need to edit
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Bob", Long.parseLong("86432119321"), "bobthebuilder@gmail.com"));
        people.add(new Person("Jane", Long.parseLong("8123434543"), "jane32@yahoo.com"));
        people.add(new Person("Megan", Long.parseLong("821034653424"), "meggytheeggy@aol.com"));
        people.add(new Person("Wally", Long.parseLong("83213213245"), "wallace_blake@gmail.com"));
        people.add(new Person("Paul", Long.parseLong("835632432664"), "pman007@gmail.com"));
        people.add(new Person("Sabrina", Long.parseLong("832540264365"), "sailorsabrina@arcnet.com"));
        people.add(new Person("Timothy", Long.parseLong("82135246432"), "timmy@airmail.com"));
        people.add(new Person("Leroy", Long.parseLong("843254254545"), "leo@yahoo.com"));
        people.add(new Person("James", Long.parseLong("86215732321"), "jazzyj@gmail.com"));
        people.add(new Person("Wendy", Long.parseLong("812343200213"), "wendi@hotmail.com"));
        people.add(new Person("Anne", Long.parseLong("832140203412"), "cheerleader21@gmail.com"));
        people.add(new Person("Michelle", Long.parseLong("82130101234"), "michellethebelle@yahoo.co.uk"));
        people.add(new Person("Barry", Long.parseLong("82343221343"), "comicsanshater@yahoo.com"));

        people.get(0).setFollowers(new Person[]{people.get(1), people.get(3)});
        people.get(1).setFollowers(new Person[]{people.get(0), people.get(8), people.get(12), people.get(12)});
        people.get(2).setFollowers(new Person[]{});
        people.get(3).setFollowers(new Person[]{people.get(2), people.get(4), people.get(9)});
        people.get(4).setFollowers(new Person[]{people.get(1), people.get(2), people.get(4), people.get(7), people.get(8), people.get(11)});
        people.get(5).setFollowers(new Person[]{people.get(6), people.get(7), people.get(12)});
        people.get(6).setFollowers(new Person[]{people.get(1), people.get(5)});
        people.get(7).setFollowers(new Person[]{people.get(4), people.get(5), people.get(9), people.get(11)});
        people.get(8).setFollowers(new Person[]{people.get(4), people.get(7), people.get(12)});
        people.get(9).setFollowers(new Person[]{people.get(3)});
        people.get(10).setFollowers(new Person[]{people.get(4), people.get(9)});
        people.get(11).setFollowers(new Person[]{people.get(1), people.get(4), people.get(5), people.get(8)});
        people.get(12).setFollowers(new Person[]{people.get(0), people.get(3), people.get(9)});

        people.get(0).setEncrytionKey("xj2SkP");
        people.get(2).setEncrytionKey("jo02D8umS");
        people.get(4).setEncrytionKey("xj2SkP");
        people.get(5).setEncrytionKey("xj2SkP");
        people.get(7).setEncrytionKey("jo02D8umS");
        people.get(8).setEncrytionKey("jo02D8umS");
        people.get(12).setEncrytionKey("xj2SkP");

        ArrayList<Message> messages = new ArrayList<Message>();
        messages.add(new Tweet(people.get(2), "Just ate dinner. Life is Gooood!"));
        messages.add(new Email(new Person[]{people.get(7)}, people.get(12), "Noise Complaint", "Dear Sir\n\nLast Friday night there was awful modern music coming from your abode. My wife and I couldn't get any sleep.\n\nIn the future we would request that you keep the sound down to a respectable level.\n\nYour Sincerely\n\nBarry"));
        messages.add(new SMS(new Person[]{people.get(4), people.get(5)}, people.get(7), "Are you going to the rehearsal after school?"));
        messages.add(new Tweet(people.get(4), "I just heard that Mohammed Lee died! RIP You crazy lunatic! I'll always remember that time we went curling in Edmonton."));
        messages.add(new SecureEmail(new Person[]{people.get(4), people.get(5), people.get(12)}, people.get(0), "Case Details (private)", "Gentlemen,\n\nOur accountant has been arrested, I would advise you all to flee the country.\n\nWe enjoyed the good life, but now it has caught up with us.\n\nNever mention the words \"Milton Keynes Project\" ever again.\n\nGood Luck!\n\nJames McCloud"));
        messages.add(new SMS(new Person[]{people.get(4)}, people.get(10), "Do you need me to pick up some eggs on the way home? :)"));
        messages.add(new Tweet(people.get(3), "Holy Cow! Rock on! just got an A* on my Global Studies test."));
        messages.add(new Tweet(people.get(11), "Dear Twiterverse, I have a big anouncement to make. I have fallen head over heals in love with someone. The person's name is Rudolf. I met him on a ski trip."));
        messages.add(new Email(new Person[]{people.get(1), people.get(4)}, people.get(9), "Allergy Medication Woes", "Dear Doctor\n\n,I have been having terrible toruble with my allergy medications. Everytime a take one of the pills my head swells up.\n\nAll of my friends have started calling me Blimp Face\n\nAre there some alternate medications?\n\nYours respectfully,\n\nWendy Goodyear"));
        messages.add(new SecureEmail(new Person[]{people.get(2), people.get(8)}, people.get(7), "Online Banking Details for Inheritance", "Dear Mr. Mugambua\n\nThanks for letting me know about the death of my long lost wealthy Nigerian uncle. I had no idea that I had any uncles, especially in Africa. Please transfer the inheritance funds to the following account:\n\nAccount Name: Leroy Stone\nAccount Number: 62032-2322\nBank of the Commonwealth\nBank Username: lstone\nBank Password: yorel\n\nThanks,\n\nLeo"));
        messages.add(new Tweet(people.get(11), "Just broke up with BF. Free again!"));
        messages.add(new SMS(new Person[]{people.get(0), people.get(1), people.get(3), people.get(7), people.get(9), people.get(11)}, people.get(12), "Snow Day! All offices and schools will be closed tomorrow due to the recents snow storm."));

        System.out.println("Tests for part (a):");
        System.out.println("Does " + people.get(0) + " follow " + people.get(1) + "? " + people.get(0).follows(people.get(1)));
        System.out.println("Does " + people.get(8) + " follow " + people.get(2) + "? " + people.get(8).follows(people.get(2)));
        System.out.println("Does " + people.get(2) + " follow " + people.get(8) + "? " + people.get(2).follows(people.get(8)));
        System.out.println("Does " + people.get(3) + " follow " + people.get(12) + "? " + people.get(3).follows(people.get(12)));

        System.out.println("\nTests for parts (b) & (c):");
        System.out.println(messages.get(3));
        System.out.println(messages.get(5));
        System.out.println(messages.get(1));

        for (Message m : messages) {
            m.send();
        }

        System.out.println(messages.get(4));
        System.out.println(messages.get(10));

        System.out.println("\nTest for part (d):");
        printMessage(messages.get(7).getContent());

        System.out.println("\nTests for part (f):\n");
        printMessage(people.get(4).readNextMessage());
        printMessage(people.get(4).readNextMessage());

        System.out.println("\nTest for part (g):");
        printInbox(people.get(4));

        System.out.println("\nTests for part (h):");
        printMessage(people.get(12).readNextMessage());
    }

    private static void printMessage(String m) {
        System.out.println("BEGIN MESSAGE-----------------------------------------------------------------");
        System.out.println(m);
        System.out.println("END OF MESSAGE----------------------------------------------------------------\n");
    }

    private static void printInbox(Person p) {
        System.out.println("Inbox for " + p.getName() + " (" + p.getEmail() + " / 0" + p.getHandPhoneNumber() + "):");

        String[] inbox = p.getInbox();

        if (inbox != null) {
            for (String m : inbox) {
                System.out.println("     => " + m);
            }
        }

        System.out.println();
    }
}
