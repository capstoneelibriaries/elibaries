package capstone.elibraries.models;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id @GeneratedValue
    private long id;

    @Column(nullable = false, length = 128)
    private String username;

    @Column(nullable = false, length = 128)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 20)
    private String phone;

    @Column
    public double rating;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seller")
    private List<Ad> ads;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Address> addresses;

    public User(){
        // default
    }

    public long getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public String getPassword(){
        return password;
    }

    public double getRating(){
        return rating;
    }

    public List<Ad> getAds(){
        return ads;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setRating(Double rating){
        this.rating = rating;
    }

    public void addAd(Ad ad){
        this.ads.add(ad);
    }

    public String toString(){
        return "{\n" +
                "\tusername:" + username + ",\n" +
                "\temail:" + email + ",\n" +
                "\tphone:" + phone + ",\n" +
                "\tpassword:" + password + ",\n" +
                "\trating:" + rating + ",\n" +
                "\tads:" + ads.toString() + ",\n" +
                "}";
    }
}