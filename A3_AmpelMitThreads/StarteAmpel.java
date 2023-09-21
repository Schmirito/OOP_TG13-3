package A3_AmpelMitThreads;

public class StarteAmpel{

    public StarteAmpel(){
        
        Ampel a1 = new Ampel("1", 0, 5000);
        Ampel a2 = new Ampel("2", 0, 1000);

        a1.start();
        a2.start();
    }

}
