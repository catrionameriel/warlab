import Players.Doctor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoctorTest {

    Doctor doctor;

    @Before
    public void before(){
        doctor = new Doctor();
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(20, doctor.getHealthPoints());
    }

    @Test
    public void canChangeHealth(){
        doctor.setHealthPoints(15);
        assertEquals(15, doctor.getHealthPoints());
    }

    @Test
    public void canAddBandageToHealthKit(){
        doctor.addToMedicalKit("Bandage");
        assertEquals(1, doctor.getNumInMedicalKit());
    }

    @Test
    public void canUseItem(){
        doctor.addToMedicalKit("Bandage");
        doctor.addToMedicalKit("Splint");
        doctor.useItem("Splint");
        assertEquals(1, doctor.getNumInMedicalKit());
    }

    @Test
    public void canAttack(){
        assertEquals(5, doctor.attack());
    }





}
