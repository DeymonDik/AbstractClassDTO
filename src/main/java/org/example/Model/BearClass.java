package org.example.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BearClass extends AnimalAbstractClass {

    @Schema(description = "Настигнет тебя через столько секунд", example = "10")
    private int second;

    @Override
    public void setSay(String say) {
        super.setSay(say == null ? "Я Мишка - золотая шишка!!!" : say);
    }
}
