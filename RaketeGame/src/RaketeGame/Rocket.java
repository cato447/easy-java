package RaketeGame;

import basis.*;

public class Rocket extends Landscape{
	// Object
	private Stift stift;
	// Variables
	private double xPos, yPos;
	private double xPosBody, yPosBody, xPosWingLeft, yPosWingLeft, xPosWingRight, yPosWingRight, xPosWingMiddle,
			yPosWingMiddle, xPosLeftEngine, yPosLeftEngine, xPosRightEngine, yPosRightEngine, xPosRightInnerFlame,
			yPosRightInnerFlame, xPosLeftInnerFlame, yPosLeftInnerFlame, xPosOuterFlame, yPosOuterFlame;
	private double stretch;

	// Arrays:
	// BodyArrays
	private double[] BodyX, BodyY;
	// WingArrays
	private double[] LeftWingX, LeftWingY;
	private double[] MiddleWingX, MiddleWingY;
	private double[] RightWingX, RightWingY;
	// EngineArrays
	private double[] LeftEngineX, LeftEngineY;
	private double[] RightEngineX, RightEngineY;
	// InnerFlame
	private double[] LeftInnerFlameX, LeftInnerFlameY;
	private double[] RightInnerFlameX, RightInnerFlameY;
	// OuterFlame
	private double[] OuterFlameX, OuterFlameY;

	// constructors
	public Rocket() {
		stift = new Stift();
		xPos = 450;
		yPos = 450;
		xPosBody = xPosWingLeft = xPosWingMiddle = xPosWingRight = xPosLeftEngine = xPosRightEngine = xPosLeftInnerFlame = xPosRightInnerFlame = xPosOuterFlame = xPos;

		yPosBody = yPosWingLeft = yPosWingMiddle = yPosWingRight = yPosLeftEngine = yPosRightEngine = yPosLeftInnerFlame = yPosRightInnerFlame = yPosOuterFlame = yPos;

		stretch = 1;
	}

	public Rocket(double pxPos, double pyPos, double pstretch) {
		stift = new Stift();
		xPos = xPosBody = xPosWingLeft = xPosWingMiddle = xPosWingRight = xPosLeftEngine = xPosRightEngine = xPosLeftInnerFlame = xPosRightInnerFlame = xPosOuterFlame = pxPos;
		yPos = yPosBody = yPosWingLeft = yPosWingMiddle = yPosWingRight = yPosLeftEngine = yPosRightEngine = yPosLeftInnerFlame = yPosRightInnerFlame = yPosOuterFlame = pyPos;
		stretch = pstretch;
	}

	// Methods:

	// draws the body of the rocket
	public void Body() {
		stift.setzeFuellMuster(Muster.GEFUELLT);
		BodyX = new double[] { xPosBody, xPosBody + 15 * stretch, xPosBody + 15 * stretch, xPosBody + 5 * stretch,
				xPosBody + 5 * stretch, xPosBody - 5 * stretch, xPosBody - 5 * stretch, xPosBody - 15 * stretch,
				xPosBody - 15 * stretch };
		BodyY = new double[] { yPosBody - 60 * stretch, yPosBody - 30 * stretch, yPosBody + 40 * stretch,
				yPosBody + 40 * stretch, yPosBody + 30 * stretch, yPosBody + 30 * stretch, yPosBody + 40 * stretch,
				yPosBody + 40 * stretch, yPosBody - 30 * stretch };
		stift.setzeFarbe(Farbe.rgb(225, 231, 242));
		stift.polygon(BodyX, BodyY);
		stift.setzeFarbe(Farbe.rgb(91, 192, 239));
		stift.kreis(xPosBody, yPosBody - 20 * stretch, 10 * stretch);
		stift.setzeFuellMuster(Muster.DURCHSICHTIG);
	}

	// draws the wings of the rocket
	public void Wings() {
		stift.setzeFuellMuster(Muster.GEFUELLT);
		// LeftWing
		LeftWingX = new double[] { xPosWingLeft - 15 * stretch, xPosWingLeft - 25 * stretch,
				xPosWingLeft - 40 * stretch, xPosWingLeft - 15 * stretch };
		LeftWingY = new double[] { yPosWingLeft + 10 * stretch, yPosWingLeft + 15 * stretch,
				yPosWingLeft + 60 * stretch, yPosWingLeft + 60 * stretch };
		stift.setzeFarbe(Farbe.rgb(239, 26, 26));
		stift.polygon(LeftWingX, LeftWingY);
		// RightWing
		RightWingX = new double[] { xPosWingRight + 15 * stretch, xPosWingRight + 40 * stretch,
				xPosWingRight + 25 * stretch, xPosWingRight + 15 * stretch };
		RightWingY = new double[] { yPosWingRight + 60 * stretch, yPosWingRight + 60 * stretch,
				yPosWingRight + 15 * stretch, yPosWingRight + 10 * stretch };
		stift.setzeFarbe(Farbe.rgb(239, 26, 26));
		stift.polygon(RightWingX, RightWingY);
		// MiddleWing
		MiddleWingX = new double[] { xPosWingMiddle + 5 * stretch, xPosWingMiddle - 5 * stretch,
				xPosWingMiddle - 5 * stretch, xPosWingMiddle + 5 * stretch };
		MiddleWingY = new double[] { yPosWingMiddle + 30 * stretch, yPosWingMiddle + 30 * stretch,
				yPosWingMiddle + 60 * stretch, yPosWingMiddle + 60 * stretch };
		stift.setzeFarbe(Farbe.rgb(239, 26, 26));
		stift.polygon(MiddleWingX, MiddleWingY);
		stift.setzeFuellMuster(Muster.DURCHSICHTIG);
	}

	// draws the engine of the rocket
	public void Engine() {
		// LeftEngine
		stift.setzeFuellMuster(Muster.GEFUELLT);
		LeftEngineX = new double[] { xPosLeftEngine - 15 * stretch, xPosLeftEngine - 5 * stretch,
				xPosLeftEngine - 5 * stretch };
		LeftEngineY = new double[] { yPosLeftEngine + 50 * stretch, yPosLeftEngine + 50 * stretch,
				yPosLeftEngine + 40 * stretch };
		stift.setzeFarbe(Farbe.rgb(41, 42, 43));
		stift.polygon(LeftEngineX, LeftEngineY);
		// RightEngine
		RightEngineX = new double[] { xPosRightEngine + 5 * stretch, xPosRightEngine + 15 * stretch,
				xPosRightEngine + 5 * stretch };
		RightEngineY = new double[] { yPosRightEngine + 50 * stretch, yPosRightEngine + 50 * stretch,
				yPosRightEngine + 40 * stretch };
		stift.setzeFarbe(Farbe.rgb(41, 42, 43));
		stift.polygon(RightEngineX, RightEngineY);
		stift.setzeFuellMuster(Muster.DURCHSICHTIG);
	}

	// draws the flame, which comes out of the engines
	public void Flame() {
		stift.setzeFuellMuster(Muster.GEFUELLT);

		// InnerFlame
		LeftInnerFlameX = new double[] { LeftEngineX[0], LeftEngineX[1], LeftEngineX[1], xPosLeftInnerFlame + 5, xPos };
		LeftInnerFlameY = new double[] { LeftEngineY[0], LeftEngineY[1], yPosLeftInnerFlame + 60 * stretch,
				yPosLeftEngine + 60 * stretch, yPos + 70 * stretch };
		stift.setzeFarbe(Farbe.rgb(255, 248, 48));
		stift.polygon(LeftInnerFlameX, LeftInnerFlameY);
		RightInnerFlameX = new double[] { xPosRightInnerFlame + 5 * stretch, xPosRightInnerFlame + 15 * stretch,
				xPosRightInnerFlame, xPosRightInnerFlame, xPosRightInnerFlame + 5 * stretch };
		RightInnerFlameY = new double[] { RightEngineY[0], RightEngineY[1], yPosRightInnerFlame + 70 * stretch,
				yPosRightInnerFlame + 60 * stretch, yPos + 60 * stretch };
		stift.setzeFarbe(Farbe.rgb(255, 248, 48));
		stift.polygon(RightInnerFlameX, RightInnerFlameY);

		// OuterFlame
		OuterFlameX = new double[] { LeftEngineX[0], xPosOuterFlame, RightEngineX[1], xPosOuterFlame };
		OuterFlameY = new double[] { LeftEngineY[0], yPosOuterFlame + 70 * stretch, RightEngineY[1],
				yPosOuterFlame + 90 * stretch };
		stift.setzeFarbe(Farbe.rgb(255, 113, 48));
		stift.polygon(OuterFlameX, OuterFlameY);
		stift.setzeFuellMuster(Muster.DURCHSICHTIG);
	}
	
	public void zeichne() {
		drawBackground();
		this.Body();
		this.Wings();
		this.Engine();
		Hilfe.warte(5);
		
	}
	
	public void zeichneFlamme() {
		drawBackground();
		this.Body();
		this.Wings();
		this.Engine();
		this.Flame();
		Hilfe.warte(5);
		
	}

	public void bewege() {
			this.zeichneFlamme();
			this.deleteFlame();
			this.setyPos(this.getyPos()-7.5);
	}
	// deletes the rocket
	public void delete() {
		stift.radiere();
		drawBackground();
		this.Body();
		this.Wings();
		this.Engine();
		stift.normal();
	}

	// deletes flame of the rocket
	public void deleteFlame() {
		stift.radiere();
		drawBackground();
		this.Body();
		this.Wings();
		this.Engine();
		this.Flame();
		stift.normal();
	}

	// Getters|Setters
	public double getxPos() {
		return xPos;
	}

	public void setxPos(double xPos) {
		this.xPos = this.xPosBody = this.xPosWingLeft = this.xPosWingMiddle = this.xPosWingRight = this.xPosLeftEngine = this.xPosRightEngine = this.xPosLeftInnerFlame = this.xPosRightInnerFlame = this.xPosOuterFlame = xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public void setyPos(double yPos) {
		this.yPos = this.yPosBody = this.yPosWingLeft = this.yPosWingMiddle = this.yPosWingRight = this.yPosLeftEngine = this.yPosRightEngine = this.yPosLeftInnerFlame = this.yPosRightInnerFlame = this.yPosOuterFlame = yPos;
	}

	public double getStretch() {
		return stretch;
	}

	public void setStretch(double stretch) {
		this.stretch = stretch;
	}

	public double[] getBodyX() {
		return BodyX;
	}

	public void setBodyX(double[] bodyX) {
		BodyX = bodyX;
	}

	public double[] getBodyY() {
		return BodyY;
	}

	public void setBodyY(double[] bodyY) {
		BodyY = bodyY;
	}

	public double getxPosBody() {
		return xPosBody;
	}

	public void setxPosBody(double xPosBody) {
		this.xPosBody = xPosBody;
	}

	public double getyPosBody() {
		return yPosBody;
	}

	public void setyPosBody(double yPosBody) {
		this.yPosBody = yPosBody;
	}

	public double getxPosWingLeft() {
		return xPosWingLeft;
	}

	public void setxPosWingLeft(double xPosWingLeft) {
		this.xPosWingLeft = xPosWingLeft;
	}

	public double getyPosWingLeft() {
		return yPosWingLeft;
	}

	public void setyPosWingLeft(double yPosWingLeft) {
		this.yPosWingLeft = yPosWingLeft;
	}

	public double getxPosWingRight() {
		return xPosWingRight;
	}

	public void setxPosWingRight(double xPosWingRight) {
		this.xPosWingRight = xPosWingRight;
	}

	public double getyPosWingRight() {
		return yPosWingRight;
	}

	public void setyPosWingRight(double yPosWingRight) {
		this.yPosWingRight = yPosWingRight;
	}

	public double getxPosWingMiddle() {
		return xPosWingMiddle;
	}

	public void setxPosWingMiddle(double xPosWingMiddle) {
		this.xPosWingMiddle = xPosWingMiddle;
	}

	public double getyPosWingMiddle() {
		return yPosWingMiddle;
	}

	public void setyPosWingMiddle(double yPosWingMiddle) {
		this.yPosWingMiddle = yPosWingMiddle;
	}

	public double getxPosLeftEngine() {
		return xPosLeftEngine;
	}

	public void setxPosLeftEngine(double xPosLeftEngine) {
		this.xPosLeftEngine = xPosLeftEngine;
	}

	public double getyPosLeftEngine() {
		return yPosLeftEngine;
	}

	public void setyPosLeftEngine(double yPosLeftEngine) {
		this.yPosLeftEngine = yPosLeftEngine;
	}

	public double getxPosRightEngine() {
		return xPosRightEngine;
	}

	public void setxPosRightEngine(double xPosRightEngine) {
		this.xPosRightEngine = xPosRightEngine;
	}

	public double getyPosRightEngine() {
		return yPosRightEngine;
	}

	public void setyPosRightEngine(double yPosRightEngine) {
		this.yPosRightEngine = yPosRightEngine;
	}

	public double getxPosRightInnerFlame() {
		return xPosRightInnerFlame;
	}

	public void setxPosRightInnerFlame(double xPosRightInnerFlame) {
		this.xPosRightInnerFlame = xPosRightInnerFlame;
	}

	public double getyPosRightInnerFlame() {
		return yPosRightInnerFlame;
	}

	public void setyPosRightInnerFlame(double yPosRightInnerFlame) {
		this.yPosRightInnerFlame = yPosRightInnerFlame;
	}

	public double getxPosLeftInnerFlame() {
		return xPosLeftInnerFlame;
	}

	public void setxPosLeftInnerFlame(double xPosLeftInnerFlame) {
		this.xPosLeftInnerFlame = xPosLeftInnerFlame;
	}

	public double getyPosLeftInnerFlame() {
		return yPosLeftInnerFlame;
	}

	public void setyPosLeftInnerFlame(double yPosLeftInnerFlame) {
		this.yPosLeftInnerFlame = yPosLeftInnerFlame;
	}

	public double getxPosOuterFlame() {
		return xPosOuterFlame;
	}

	public void setxPosOuterFlame(double xPosOuterFlame) {
		this.xPosOuterFlame = xPosOuterFlame;
	}

	public double getyPosOuterFlame() {
		return yPosOuterFlame;
	}

	public void setyPosOuterFlame(double yPosOuterFlame) {
		this.yPosOuterFlame = yPosOuterFlame;
	}

}
