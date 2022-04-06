package netology.web.data;

import lombok.Data;

import static netology.web.data.DataGenerator.*;

@Data

public class RegistrationInfo {
    public RegistrationInfo() {
        generateName();
        generatePhone();
        generateCity();

    }
}
