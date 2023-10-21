package org.example.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.example.enums.AnimalType;

@Getter
@Setter
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type",
        visible = true,
        include = JsonTypeInfo.As.EXISTING_PROPERTY
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = FoxClass.class, name = "FOX"),
        @JsonSubTypes.Type(value = WolfClass.class, name = "WOLF"),
        @JsonSubTypes.Type(value = BearClass.class, name = "BEAR")
})
public abstract class AnimalAbstractClass {

    @Schema(description = "Имя", example = "Лариска")
    private String name;

    @Schema(description = "Тип", example = "FOX")
    private AnimalType type;

    @Schema(description = "Говорит", hidden = true, example = "Ничего")
    private String say;

}