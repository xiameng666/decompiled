import android.location.GnssStatus;

public final class jyf {
    private final GnssStatus a;

    public jyf() {
        throw null;
    }

    public jyf(Object object0) {
        kay.i(object0);
        this.a = (GnssStatus)object0;
    }

    public final float a(int v) {
        return this.a.getAzimuthDegrees(v);
    }

    public final float b(int v) {
        return this.a.getBasebandCn0DbHz(v);
    }

    public final float c(int v) {
        return this.a.getCarrierFrequencyHz(v);
    }

    public final float d(int v) {
        return this.a.getCn0DbHz(v);
    }

    public final float e(int v) {
        return this.a.getElevationDegrees(v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jyf) ? this.a.equals(((jyf)object0).a) : false;
    }

    public final int f(int v) {
        return this.a.getConstellationType(v);
    }

    public final int g() {
        return this.a.getSatelliteCount();
    }

    public final int h(int v) {
        return this.a.getSvid(v);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i(int v) {
        return this.a.hasAlmanacData(v);
    }

    public final boolean j(int v) {
        return this.a.hasBasebandCn0DbHz(v);
    }

    public final boolean k(int v) {
        return this.a.hasCarrierFrequencyHz(v);
    }

    public final boolean l(int v) {
        return this.a.hasEphemerisData(v);
    }

    public final boolean m(int v) {
        return this.a.usedInFix(v);
    }
}

