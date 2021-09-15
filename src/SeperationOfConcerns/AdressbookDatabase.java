package SeperationOfConcerns;

public class AdressbookDatabase extends Database{
    @Override
    public void load() {
        super.load();
        System.out.println("select + from addressbook");
    }

    @Override
    public void save(String arg) {
        super.save(arg);
        System.out.println("insert addressbook values ("+arg+")");
    }
}
