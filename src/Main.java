public class Main {
    public static void main ( String arg[]) {

        Animal animal = new Animal ( "Леопард", 20.00, 7 );

        System.out.println ("Назва тварини = " + animal.getName () + ", Швидкість тварини = " +
                          animal.getSpeed () + ", Вік тварини = " + animal.getAge () );

        animal.setName ( "Бик" );
        animal.setSpeed ( 2.00 );
        animal.setAge ( 14 );

        System.out.println ("Назва тварини = " + animal.getName () + ", Швидкість тварини = " +
                          animal.getSpeed () + ", Вік тварини = " + animal.getAge () );

    }
}
