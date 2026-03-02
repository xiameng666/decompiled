public final class gpvm {
    final long a;
    final double b;
    final double c;
    final double d;
    final int e;
    final int f;
    final int g;

    public gpvm(long v, gptu_Position gptu0) {
        this.a = v;
        this.b = (double)gptu0.accuracyMm;
        this.c = gptu0.altitudeMeters;
        this.d = gptu0.verticalAccuracyMeters;
        this.e = gptu0.t() ^ 1;
        this.f = gptu0.latE7;
        this.g = gptu0.lngE7;
    }
}

