package RaketeGame;

import basis.*;

public class Lines {
	private Stift stift;
	private int xBoth, xTemp, yWhite, yWhiteTemp, yBlack, yBlackTemp, width, widthTemp, windowWidth, blockWidth;

	public Lines(int fenstername_punkt_breite, int py) {
		stift = new Stift();
		yWhite = yBlack = yBlackTemp = yWhiteTemp = py;
		xTemp = xBoth = 0;
		windowWidth = fenstername_punkt_breite;
		blockWidth = 10;
		widthTemp = width = 0;
		
	}

	public void black() {
		stift.setzeFuellMuster(Muster.GEFUELLT);
		stift.setzeFarbe(Farbe.SCHWARZ);
		stift.rechteck(xTemp, yBlackTemp, blockWidth, blockWidth);
		stift.setzeFuellMuster(Muster.GEFUELLT);
	}

	public void white() {
		stift.setzeFuellMuster(Muster.GEFUELLT);
		stift.setzeFarbe(Farbe.WEISS);
		stift.rechteck(xTemp, yWhiteTemp, blockWidth, blockWidth);
		stift.setzeFuellMuster(Muster.DURCHSICHTIG);
	}

	public void drawFinishLine() {
		for (int i = 0; widthTemp < windowWidth; widthTemp += blockWidth) {
			++i;
			if (i % 2 == 0) {
				yBlackTemp = yBlack + blockWidth;
				yWhiteTemp = yWhite;
			} else {
				yBlackTemp = yBlack;
				yWhiteTemp = yWhite + blockWidth;
			}
			this.black();
			this.white();
			xTemp += blockWidth;
		}
		widthTemp = width;
		xTemp = xBoth;
		yBlackTemp = yBlack;
		yWhiteTemp = yWhite;
	}
	
	public void drawPointLine(String Color, int x, int y) {
		stift.setzeFuellMuster(Muster.GEFUELLT);
		if(Color == "Blau") {
			stift.setzeFarbe(Farbe.BLAU);
		} else if(Color == "Grau") {
			stift.setzeFarbe(Farbe.GRAU);
		} else if(Color == "Orange") {
			stift.setzeFarbe(Farbe.ORANGE);
		} else {
			System.err.println("Bitte w�hlen Sie eine der Farben aus:");
			System.err.println("Blau, Gelb, Gr�n, Grau, Orange");
		}
		
		stift.setzeLinienBreite(2);
		stift.linie(0, yWhite+y, x, yWhite+y);
		
 	}
	
	public void PointLines() {
		//Inner ring
		drawPointLine("Grau", windowWidth, 40);
		drawPointLine("Grau", windowWidth, -20);
		//Middle inner ring
		drawPointLine("Grau", windowWidth, 80);
		drawPointLine("Grau", windowWidth, -60);
		//Middle outer ring
		drawPointLine("Grau", windowWidth, 120);
		drawPointLine("Grau", windowWidth, -100);
		//Outer ring
		drawPointLine("Grau", windowWidth, 160);
		drawPointLine("Grau", windowWidth, -140);
	}

	public void delete() {
		stift.radiere();
		this.drawFinishLine();
		stift.normal();
	}
}
