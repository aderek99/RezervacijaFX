package ba.sum.fpmoz.rezervacijafx.rezervacijafx.model;

public class putnik extends Table{
    @Entity(type = "INTEGER", size = 32, primary = true)
    int id;

    @Entity(type="VARCHAR", size=50, isnull = false)
    String firstname;

    @Entity(type = "VARCHAR", size=50, isnull = false)
    String lastname;

    /*
        @TODO add unique constraint
    */

    @Entity(type = "CHAR", size=13, isnull = false)
    String JMBG;

    @Entity(type="VARCHAR", size = 150, isnull = false)
    String email;

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
