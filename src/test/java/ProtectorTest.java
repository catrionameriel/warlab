import Players.Regal.DogProtector;
import Players.Regal.HorseProtector;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProtectorTest {
    HorseProtector horse;
    DogProtector dog;

    @Before
    public void before() {
        horse = new HorseProtector();
        dog = new DogProtector();
    }

    @Test
    public void canGetHorseResistance(){
        assertEquals(20, horse.getResistance());
    }

    @Test
    public void canGetDogResistance(){
        assertEquals(15, dog.getResistance());
    }

    @Test
    public void canSetDogResistance(){
        dog.setResistance(10);
        assertEquals(10, dog.getResistance());
    }

    @Test
    public void canSetHorseResistance(){
        horse.setResistance(15);
        assertEquals(15, horse.getResistance());
    }
}
