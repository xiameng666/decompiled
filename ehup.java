public final class ehup {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final double f;
    public final double g;
    public final float h;
    public final Double i;
    public final Float j;

    public ehup() {
        throw null;
    }

    public ehup(long v, long v1, long v2, long v3, String s, double f, double f1, float f2, Double double0, Float float0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = s;
        this.f = f;
        this.g = f1;
        this.h = f2;
        this.i = double0;
        this.j = float0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof ehup) && this.a == ((ehup)object0).a && this.b == ((ehup)object0).b && this.c == ((ehup)object0).c && this.d == ((ehup)object0).d) {
            String s = this.e;
            if(s != null) {
                if(s.equals(((ehup)object0).e)) {
                label_8:
                    if(Double.doubleToLongBits(this.f) == Double.doubleToLongBits(((ehup)object0).f) && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(((ehup)object0).g) && Float.floatToIntBits(this.h) == Float.floatToIntBits(((ehup)object0).h)) {
                        Double double0 = this.i;
                        if(double0 == null) {
                            if(((ehup)object0).i == null) {
                                return this.j == null ? ((ehup)object0).j == null : this.j.equals(((ehup)object0).j);
                            }
                        }
                        else if(double0.equals(((ehup)object0).i)) {
                            return this.j == null ? ((ehup)object0).j == null : this.j.equals(((ehup)object0).j);
                        }
                    }
                }
            }
            else if(((ehup)object0).e == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((((this.e == null ? 0 : this.e.hashCode()) ^ ((((((int)(this.a >>> 0x20 ^ this.a)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c))) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003) * 1000003 ^ ((int)(Double.doubleToLongBits(this.f) ^ Double.doubleToLongBits(this.f) >>> 0x20))) * 1000003 ^ ((int)(Double.doubleToLongBits(this.g) >>> 0x20 ^ Double.doubleToLongBits(this.g)))) * 1000003 ^ Float.floatToIntBits(this.h);
        int v1 = this.i == null ? 0 : this.i.hashCode();
        return this.j == null ? (v * 1000003 ^ v1) * 1000003 : (v * 1000003 ^ v1) * 1000003 ^ this.j.hashCode();
    }

    @Override
    public final String toString() {
        return "LocationWrapper{locationTimeMillis=" + this.a + ", locationProcessedTimeMillis=" + this.b + ", systemBootTimeMillis=" + this.c + ", locationTimeElapsedSinceBootMillis=" + this.d + ", provider=" + this.e + ", latitudeDegrees=" + this.f + ", longitudeDegrees=" + this.g + ", horizontalAccuracyMeters=" + this.h + ", altitudeWsg84Meters=" + this.i + ", verticalAccuracyMeters=" + this.j + "}";
    }
}

