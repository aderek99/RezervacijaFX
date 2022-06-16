package ba.sum.fpmoz.rezervacijafx.rezervacijafx.model;

public class vozac extends Table{
    @Entity(type = "INTEGER", size = 32, primary = true)
    int id;

    @Entity(type="VARCHAR", size=50, isnull = false)
    String name;

    @Entity(type="VARCHAR", size=50, isnull = false)
    String lastname;

    /*
        @TODO add unique constraint
    */

    @Entity(type = "CHAR", size=13, isnull = false)
    String JMBG;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }
}
