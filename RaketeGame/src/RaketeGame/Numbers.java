package RaketeGame;

import basis.*;

public class Numbers {

	// Objects
	private ZahlenFeld zFeldLine1;
	private ZahlenFeld zFeldLine2;
	private ZahlenFeld zFeldLine3;
	private ZahlenFeld zFeldLine4;
	private ZahlenFeld zFeldLine5;
	private ZahlenFeld zFeldLine6;
	private ZahlenFeld zFeldLine7;
	private ZahlenFeld zFeldLine8;
	private TextFeld tFeldScore;

	// Variables
	private int Points;
	private int xLines, yLines, breiteLines, höheLines;
	private int xScore, yScore, breiteScore, höheScore;
	private int times = 0;

	// Constructor
	public Numbers(int fensterBreite, int y) {
		xLines = fensterBreite;
		yLines = y;
		breiteLines = 30;
		höheLines = 20;

		xScore = yScore = 10;
		breiteScore = 100;
		höheScore = 20;

		tFeldScore = new TextFeld(xScore, yScore, breiteScore, höheScore);
		tFeldScore.setzeText("Punkte: " + 0);
		tFeldScore.entferneRand();
		tFeldScore.setzeSchriftGroesse(15);
		tFeldScore.setzeSchriftFarbe(Farbe.WEISS);
		tFeldScore.setzeEditierbar(false);
		tFeldScore.setzeHintergrundFarbe(Farbe.rgb(130, 160, 200));

		zFeldLine1 = new ZahlenFeld(xLines - breiteLines, yLines + 160 - höheLines - höheLines / 2, breiteLines,
				höheLines);
		zFeldLine1.setzeZahl(25);
		zFeldLine1.entferneRand();
		zFeldLine1.setzeEditierbar(false);
		zFeldLine1.setzeHintergrundFarbe(Farbe.rgb(130, 160, 200));

		zFeldLine2 = new ZahlenFeld(xLines - breiteLines, yLines + 120 - höheLines - höheLines / 2, breiteLines,
				höheLines);
		zFeldLine2.setzeZahl(50);
		zFeldLine2.entferneRand();
		zFeldLine2.setzeEditierbar(false);
		zFeldLine2.setzeHintergrundFarbe(Farbe.rgb(130, 160, 200));

		zFeldLine3 = new ZahlenFeld(xLines - breiteLines, yLines + 80 - höheLines - höheLines / 2, breiteLines,
				höheLines);
		zFeldLine3.setzeZahl(75);
		zFeldLine3.entferneRand();
		zFeldLine3.setzeEditierbar(false);
		zFeldLine3.setzeHintergrundFarbe(Farbe.rgb(130, 160, 200));

		zFeldLine4 = new ZahlenFeld(xLines - breiteLines, yLines + 40 - höheLines, breiteLines, höheLines);
		zFeldLine4.setzeZahl(100);
		zFeldLine4.entferneRand();
		zFeldLine4.setzeEditierbar(false);
		zFeldLine4.setzeHintergrundFarbe(Farbe.rgb(130, 160, 200));

		zFeldLine5 = new ZahlenFeld(xLines - breiteLines, yLines - 40 + höheLines, breiteLines, höheLines);
		zFeldLine5.setzeZahl(100);
		zFeldLine5.entferneRand();
		zFeldLine5.setzeEditierbar(false);
		zFeldLine5.setzeHintergrundFarbe(Farbe.rgb(130, 160, 200));

		zFeldLine6 = new ZahlenFeld(xLines - breiteLines, yLines - 80 + höheLines + höheLines / 2, breiteLines,
				höheLines);
		zFeldLine6.setzeZahl(75);
		zFeldLine6.entferneRand();
		zFeldLine6.setzeEditierbar(false);
		zFeldLine6.setzeHintergrundFarbe(Farbe.rgb(130, 160, 200));

		zFeldLine7 = new ZahlenFeld(xLines - breiteLines, yLines - 120 + höheLines + höheLines / 2, breiteLines,
				höheLines);
		zFeldLine7.setzeZahl(50);
		zFeldLine7.entferneRand();
		zFeldLine7.setzeEditierbar(false);
		zFeldLine7.setzeHintergrundFarbe(Farbe.rgb(130, 160, 200));

		zFeldLine8 = new ZahlenFeld(xLines - breiteLines, yLines - 160 + höheLines + höheLines / 2, breiteLines,
				höheLines);
		zFeldLine8.setzeZahl(25);
		zFeldLine8.entferneRand();
		zFeldLine8.setzeEditierbar(false);
		zFeldLine8.setzeHintergrundFarbe(Farbe.rgb(130, 160, 200));
	}

	public int checkPos(int POS) {
		if (POS == yLines + 160) {
			POS = 25;
		}
		if (POS == yLines + 120) {
			POS = 50;
		}
		if (POS == yLines + 80) {
			POS = 75;
		}
		if (POS == yLines + 40) {
			POS = 100;
		}
		if (POS == yLines - 20) {
			POS = 100;
		}
		if (POS == yLines - 60) {
			POS = 75;
		}
		if (POS == yLines - 100) {
			POS = 50;
		}
		if (POS == yLines - 140) {
			POS = 25;
		}

		if (POS < yLines + 160 && POS > yLines + 120) {
			POS = 25;
		} else if (POS < yLines + 120 && POS > yLines + 80) {
			POS = 50;
		} else if (POS < yLines + 80 && POS > yLines + 40) {
			POS = 75;
		} else if (POS < yLines + 40 && POS > yLines - 20) {
			POS = 100;
		} else if (POS < yLines - 20 && POS > yLines - 60) {
			POS = 75;
		} else if (POS < yLines - 60 && POS > yLines - 100) {
			POS = 50;
		} else if (POS < yLines - 100 && POS > yLines - 160) {
			POS = 25;
		} else {
			POS = 0;
		}
		return POS;
	}

	public void points(int POINTS) {
		Points = Points + POINTS;
		tFeldScore.setzeText("Punkte: " + Points);
		times++;
	}

	public int getPoints() {
		return Points;
	}

	public int getTimes() {
		return times;
	}

}
