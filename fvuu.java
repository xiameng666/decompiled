public final class fvuu {
    public final double a;
    public final int b;

    public fvuu(int v, double f) {
        this.b = v;
        this.a = f;
    }

    @Override
    public final String toString() {
        switch(this.b) {
            case 1: {
                return "TravelDetectionResult [type=STATIONARY, confidence=" + this.a + "]";
            }
            case 2: {
                return "TravelDetectionResult [type=MOVING, confidence=" + this.a + "]";
            }
            default: {
                return "TravelDetectionResult [type=UNKNOWN, confidence=" + this.a + "]";
            }
        }
    }
}

