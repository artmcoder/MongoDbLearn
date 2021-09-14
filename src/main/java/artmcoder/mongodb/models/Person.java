package artmcoder.mongodb.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collation = "people")
public class Person {
    @Id
    private String id;
    private String name;
    private String surname;
    private int age;
}
