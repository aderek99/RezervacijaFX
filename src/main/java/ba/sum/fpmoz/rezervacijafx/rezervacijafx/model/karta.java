package ba.sum.fpmoz.rezervacijafx.rezervacijafx.model;

public class karta extends Table{
    @Entity(type = "INTEGER", size = 32, primary = true)
    int id;

    @Entity(type="VARCHAR", size=50, isnull = false)
    String seat;

    @Entity(type="INTEGER", size=50, isnull = false)
    int price;

    @ForeignKey(table = "putnik", attribute = "id")
    @Entity(type = "INTEGER", size = 32)
    int putnik_id;

    @ForeignKey(table = "voznja", attribute = "id")
    @Entity(type = "INTEGER", size = 32)
    int voznja_id;

    public int getId() {
        return id;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPutnik_id() {
        return putnik_id;
    }

    public void setPutnik_id(int putnik_id) {
        this.putnik_id = putnik_id;
    }

    public int getVoznja_id() {
        return voznja_id;
    }

    public void setVoznja_id(int voznja_id) {
        this.voznja_id = voznja_id;
    }
}
