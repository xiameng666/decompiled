public final class PositionBuilder {
    public gptt_LocationType provider;
    public gpts_PositionProvider flpSensorFusion;
    public int latE7;
    public int lngE7;
    public int accuracyMm;
    public float speedMps;
    public float speedAccuracyMps;
    public float bearingDegrees;
    public float bearingAccuracyDegrees;
    public double altitudeMeters;
    public double verticalAccuracyMeters;
    public float weatherAltitudeMeters;
    public float weatherAltitudeAccuracyMeters;
    public String levelId;
    public int levelNumberE3;
    public String floorLabel;
    public float indoorProbability;
    public float outlierProbability;
    public int mask;

    public PositionBuilder() {
        this.provider = gptt_LocationType.UNKNOWN;
        this.flpSensorFusion = gpts_PositionProvider.UNKNOWN;
        this.latE7 = 0;
        this.lngE7 = 0;
        this.accuracyMm = -1;
        this.speedMps = 0.0f;
        this.speedAccuracyMps = -1.0f;
        this.bearingDegrees = -1.0f;
        this.bearingAccuracyDegrees = -1.0f;
        this.altitudeMeters = 0.0;
        this.verticalAccuracyMeters = 0.0;
        this.weatherAltitudeMeters = 0.0f;
        this.weatherAltitudeAccuracyMeters = 0.0f;
        this.levelId = null;
        this.levelNumberE3 = 0x80000000;
        this.floorLabel = null;
        this.indoorProbability = -1.0f;
        this.outlierProbability = 0.0f;
        this.mask = 0;
    }

    public final void a() {
        this.bearingDegrees = -1.0f;
        this.mask &= -9;
    }

    public final void b() {
        this.bearingAccuracyDegrees = -1.0f;
        this.mask &= 0xFFFFFF7F;
    }

    public final void c(double f) {
        this.altitudeMeters = f;
        this.mask |= 2;
    }

    public final void d(float f) {
        this.bearingAccuracyDegrees = f;
        this.mask |= 0x80;
    }

    public final void e(float f) {
        this.bearingDegrees = f;
        this.mask |= 8;
    }

    public final void f(String s) {
        this.floorLabel = s;
        this.mask |= 0x100;
    }

    public final void g(float f) {
        this.indoorProbability = f;
        this.mask |= 0x200;
    }

    public final void h(double f, double f1, int v) {
        this.i(GeoMath.l(f), GeoMath.l(f1), v);
    }

    public final void i(int v, int v1, int v2) {
        this.latE7 = v;
        this.lngE7 = v1;
        this.accuracyMm = v2;
        this.mask |= 1;
    }

    public final void j(float f) {
        this.speedAccuracyMps = f;
        this.mask |= 0x40;
    }

    public final void k(float f) {
        this.speedMps = f;
        this.mask |= 4;
    }

    public final void l(double f) {
        this.verticalAccuracyMeters = f;
        this.mask |= 16;
    }

    public final void m(float f) {
        this.weatherAltitudeAccuracyMeters = f;
        this.mask |= 0x4000;
    }

    public final void n(float f) {
        this.weatherAltitudeMeters = f;
        this.mask |= 0x2000;
    }
}

