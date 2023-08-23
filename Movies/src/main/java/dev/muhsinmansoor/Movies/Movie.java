package dev.muhsinmansoor.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data // lombok dependency
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id // makes it unique for each movie.
    private ObjectId id;

    private String imdbId;
    private String title;
    private String releaseDate;
    private String TrailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops; // user for frontend dev.

    @DocumentReference // Manual reference relationship
    private List<String> reviewIds; // one to many relationship. documentReference is another way of doing it.



}
