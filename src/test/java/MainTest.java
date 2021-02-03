import hr.algenra.*;
import jdk.internal.org.objectweb.asm.tree.JumpInsnNode;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void shouldAutoPlatiKartuReturnDouble()
    {
        Auto auto = new Auto();
        Assert.assertEquals(50.0, auto.platiKartu(), 1);
    }

    @Test
    public void shouldAutobusPlatiKartuReturnDouble()
    {
        Autobus auto = new Autobus();
        Assert.assertEquals(70.0, auto.platiKartu(), 1);
    }

    @Test
    public void shouldGeneratorReturnObject()
    {
        Assert.assertNotNull(Generator.getInstance());
    }
    @Test
    public void shouldJuniorZaposelnikReturnValue() {
        JuniorZaposlenik junior = new JuniorZaposlenik();
        Auto auto = new Auto();
        Assert.assertEquals(50,junior.prikupiNovce(((ICijenaKarte)auto)),1);

    }
    @Test
    public void shouldKamioosPlatiKartuReturnDouble()
    {
        Kamion auto = new Kamion();
        Assert.assertEquals(90.0, auto.platiKartu(), 1);
    }

    @Test
    public void shouldZaposlenikSallaryReturnValue()
    {
        JuniorZaposlenik zaposlenik = new JuniorZaposlenik();
        zaposlenik.setSallary(10);
        Assert.assertEquals(10, zaposlenik.getSallary(), 1);
    }


}
