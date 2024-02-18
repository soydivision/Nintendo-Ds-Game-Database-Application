package com.example.nintendo_ds_game_database.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class NintendoDSGame {

    @Id
    private Long id;
    private String title;
    private String developer;
    private String publisher;
    private Date firstReleased;
    private boolean JP;
    private boolean NA;
    private boolean EU;
    private boolean AU;

    // Constructors
    public NintendoDSGame() {
        // Default constructor
    }

    public NintendoDSGame(String title, String developer, String publisher, Date firstReleased,
                          boolean JP, boolean NA, boolean EU, boolean AU) {
        this.title = title;
        this.developer = developer;
        this.publisher = publisher;
        this.firstReleased = firstReleased;
        this.JP = JP;
        this.NA = NA;
        this.EU = EU;
        this.AU = AU;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getFirstReleased() {
        return firstReleased;
    }

    public void setFirstReleased(Date firstReleased) {
        this.firstReleased = firstReleased;
    }

    public boolean isJP() {
        return JP;
    }

    public void setJP(boolean JP) {
        this.JP = JP;
    }

    public boolean isNA() {
        return NA;
    }

    public void setNA(boolean NA) {
        this.NA = NA;
    }

    public boolean isEU() {
        return EU;
    }

    public void setEU(boolean EU) {
        this.EU = EU;
    }

    public boolean isAU() {
        return AU;
    }

    public void setAU(boolean AU) {
        this.AU = AU;
    }
}
