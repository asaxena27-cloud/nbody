public class Planet {
    double myXPos;
    double myYPos;
    double myXVel;
    double myYVel;
    double myMass;
    String myFileName;

    public Planet(double xp, double yp, double xv, double yv, double mass, String filename)
    {
        this.myXPos=xp;
        this.myYPos=yp;
        this.myXVel=xv;
        this.myYVel=yv;
        this.myMass=mass;
        this.myFileName=filename;

    }
    public Planet(Planet p)
    {
        this(p.myXPos,p.myYPos,p.myXVel,p.myYVel, p.myMass, p.myFileName);



    }
    public double calcDistance(Planet otherPlanet)
        {
            double dx= this.myXPos-otherPlanet.myXPos;
            double dy= this.myYPos- otherPlanet.myYPos;
            return Math.sqrt(Math.pow(dx,2)+ Math.pow(dy,2));

        }
        public double calcForceExtertedBy(Planet otherPlanet)
        {
            double G= 6.67* Math.pow(10,-11);
            return G* this.myMass * otherPlanet.myMass/Math.pow(calcDistance(otherPlanet),2);
        }
        public double calcForceExertedByX(Planet otherPlanet)
        {
            return this.calcForceExtertedBy(otherPlanet)*(this.myXPos- otherPlanet.myXPos)/calcDistance(otherPlanet);
        }
        public double calcF







    }
