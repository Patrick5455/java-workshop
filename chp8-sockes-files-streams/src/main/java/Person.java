import lombok.Builder;

import java.util.HashMap;
import java.util.Map;

@Builder
public class Person {

    private String name;
    private String familyName;
    private String userName;
    private Integer age;
    private String bgColor;


   public static Map<String, String> personMap (Person person){
        Map<String, String> personMap = new HashMap<>();

        personMap.put("name", person.name);
        personMap.put("familyName", person.familyName);
        personMap.put("userName", person.familyName);
        personMap.put("age", person.age.toString());
        personMap.put("bgColor", person.bgColor);


        return personMap;
    }
}
