package com.sportshub.entity.socialNetworks.socialFollow;

import javax.persistence.*;

@Entity
@Table(name="\"socialFollow\"")
public class socialFollow {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
            generator="share_seq_seq")
    @SequenceGenerator(name="share_seq",
            sequenceName="SEQ_SOCIAL_SHARE", allocationSize=1)
    long id;
    String url;
    String pictogram;

    public socialFollow() {
    }

    public socialFollow(String url, String pictogram) {
        this.url = url;
        this.pictogram = pictogram;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPictogram() {
        return pictogram;
    }

    public void setPictogram(String pictogram) {
        this.pictogram = pictogram;
    }

    public long getId() {
        return id;
    }
}
