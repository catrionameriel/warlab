import Battlefield.Bannockburn;
import Battlefield.Culloden;
import Battlefield.StirlingBridge;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattlefieldTest {
    Culloden culloden;
    Bannockburn bannockburn;
    StirlingBridge stirlingBridge;

    @Before
    public void before(){
        culloden = new Culloden();
        bannockburn = new Bannockburn();
        stirlingBridge = new StirlingBridge();
    }

    @Test
    public void canGetName(){
        assertEquals("Culloden", culloden.getName());
    }

    @Test
    public void canGetCondition(){
        assertEquals("Boggy", culloden.getCondition());
    }

    @Test
    public void canGetTerritoryPoints(){
        assertEquals(50, culloden.getTerritoryPoints());
    }

    @Test
    public void canGetBannockburnName(){
        assertEquals("Bannockburn", bannockburn.getName());
    }

    @Test
    public void canGetBannockburnCondition(){
        assertEquals("Wet", bannockburn.getCondition());
    }

    @Test
    public void canGetBanockburnTerritoryPoints(){
        assertEquals(75, bannockburn.getTerritoryPoints());
    }

    @Test
    public void canGetStirlingBridgeName(){
        assertEquals("Stirling Bridge", stirlingBridge.getName());
    }

    @Test
    public void canGetStirlingBridgeCondition(){
        assertEquals("Deadly", stirlingBridge.getCondition());
    }

    @Test
    public void canGetStirlingBridgeTerritoryPoints(){
        assertEquals(100, stirlingBridge.getTerritoryPoints());
    }
}
