public final class fvvg {
    public final long a;
    public long b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public fvvg(long v, int v1, int v2, int v3, int v4, int v5, int v6) {
        this.a = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = v6;
    }

    @Override
    public final String toString() {
        return "WifiRttResult [bssid=" + this.a + ", status=0, ts=" + this.b + ", rssi=" + this.c + ", distanceCm=" + this.d + ", distanceSdCm=" + this.e + ", measurementtype=0, numMeasurementFrames=" + this.f + ", numSuccessFrames=" + this.g + "]";
    }
}

