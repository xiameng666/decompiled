public abstract class gpyy extends ILikelihood {
    final double b;
    ProbabilityDistribution c;
    double d;

    protected gpyy(double f) {
        this.d = 1.0;
        this.b = 1.0 / f;
    }
}

