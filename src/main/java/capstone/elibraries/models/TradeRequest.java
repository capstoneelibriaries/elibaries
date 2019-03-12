package capstone.elibraries.models;
import javax.persistence.*;

@Entity
@Table(name = "trade_requests")
public class TradeRequest {

    @Id @GeneratedValue
    private long id;
    @Transient
    private User to;
    @Transient
    private User from;
    @OneToOne
    private Ad forSale;
    @OneToOne
    private Ad wanted;

    public TradeRequest(){
        // default
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Ad getForSale() {
        return forSale;
    }

    public void setForSale(Ad forSale) {
        this.forSale = forSale;
    }

    public Ad getWanted() {
        return wanted;
    }

    public void setWanted(Ad wanted) {
        this.wanted = wanted;
    }

}