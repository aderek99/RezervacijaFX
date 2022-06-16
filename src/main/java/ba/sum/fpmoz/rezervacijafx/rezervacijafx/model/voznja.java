package ba.sum.fpmoz.rezervacijafx.rezervacijafx.model;

public class voznja extends Table{
    @Entity(type = "INTEGER", size = 32, primary = true)
    int id;

    @Entity(type = "DATETIME", size=6, isnull = false)
    String departure_date;

    @Entity(type="INTEGER", size=50, isnull = false)
    int max_number;

    @ForeignKey(table = "kolodvor", attribute = "id")
    @Entity(type = "INTEGER", size = 32)
    int kolodvor_id;

    @ForeignKey(table = "vozac", attribute = "id")
    @Entity(type = "INTEGER", size = 32)
    int vozac_id;

    @ForeignKey(table = "autobus", attribute = "id")
    @Entity(type = "INTEGER", size = 32)
    int autobus_id;

    public int getId() {
        return id;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public int getMax_number() {
        return max_number;
    }

    public void setMax_number(int max_number) {
        this.max_number = max_number;
    }

    public int getKolodvor_id() {
        return kolodvor_id;
    }

    public void setKolodvor_id(int kolodvor_id) {
        this.kolodvor_id = kolodvor_id;
    }

    public int getVozac_id() {
        return vozac_id;
    }

    public void setVozac_id(int vozac_id) {
        this.vozac_id = vozac_id;
    }


    public int getAutobus_id() {
        return autobus_id;
    }

    public void setAutobus_id(int autobus_id) {
        this.autobus_id = autobus_id;
    }
}
