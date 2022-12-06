package searchengine.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Lemma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "site_id")
    private Site site;
    @NotNull
    @Column(columnDefinition = "VARCHAR(255)")
    private String lemma;
    @NotNull
    private int frequency; // — количество страниц, на которых слово встречается хотя бы один раз.
    // Максимальное значение не может превышать общее количество слов на сайте.


    public Lemma() {}

    public Lemma(Site site, String lemma, int frequency) {
        this.site = site;
        this.lemma = lemma;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getLemma() {
        return lemma;
    }

    public void setLemma(String lemma) {
        this.lemma = lemma;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}