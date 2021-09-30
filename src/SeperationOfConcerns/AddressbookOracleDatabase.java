package SeperationOfConcerns;

public class AddressbookOracleDatabase extends AdressbookDatabase{
    
    @Override
    public void save(String arg) {
        System.out.println("use oracle driver:");
        System.out.println("INSERT ADDRESSBOOK VALUES ("+arg+")");
    }
}
