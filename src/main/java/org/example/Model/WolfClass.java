package org.example.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WolfClass extends AnimalAbstractClass {

    @Schema(description = "Цвет", example = "серый")
    private String color;

    @Override
    public void setSay(String say) {
        super.setSay(say == null ? "Я Волк - просто тебя съем!!!" : say);
    }

}
