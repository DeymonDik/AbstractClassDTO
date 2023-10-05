package org.example.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoxClass extends AnimalAbstractClass {

    @Schema(description = "Лиса ли это", example = "true")
    private boolean isFox;

    @Override
    public void setSay(String say) {
        super.setSay(say == null ? "Я Лиса - рыжая краса!!!" : say);
    }

}
