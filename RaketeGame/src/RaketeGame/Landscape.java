package RaketeGame;
import basis.*;
public class Landscape {
 private Stift meinStift;
	public Landscape() {
	 meinStift = new Stift();
	 }
	public void drawBackground() {
		meinStift.setzeFarbe(Farbe.rgb(120,180,110));
		meinStift.setzeFuellMuster(Muster.GEFUELLT);
		meinStift.rechteck(0, Hilfe.monitorHoehe()-300, 400, 100);
	}
 }

