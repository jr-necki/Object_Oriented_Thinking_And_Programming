package SeperationOfConcerns;

public class AddressbookMySQLDatabase extends AdressbookDatabase{

    @Override
    public void save(String arg) {
        System.out.println("use mysql driver:");
        System.out.println("INSERT ADDRESSBOOK VALUES ("+arg+")");
    }

}