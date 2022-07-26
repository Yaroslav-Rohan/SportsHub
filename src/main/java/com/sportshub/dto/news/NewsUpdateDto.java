package com.sportshub.dto.news;
import lombok.Data;

import java.sql.Blob;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Set;

@Data
public class NewsUpdateDto {
    private String title;
    private Long views;
    private String description;
    private String text;
    private Instant publicationDate;
    private String image;
    private String alternativeText;
    private String caption;
    private Boolean isPublished;
    private Integer mainPageOrder;
    private Long leagueId;
    private Set<Long> kindsOfSportIds;
    private Set<Long> teamIds;
}

