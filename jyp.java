public final class jyp {
    public final int a;
    public final long b;
    final long c;
    final long d;
    final int e;
    final float f;
    public final long g;

    public jyp(long v, int v1, long v2, int v3, long v4, long v5) {
        this.b = v;
        this.a = v1;
        this.c = v4;
        this.d = v2;
        this.e = v3;
        this.f = 0.0f;
        this.g = v5;
    }

    public final long a() {
        return this.c == -1L ? this.b : this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jyp) ? this.a == ((jyp)object0).a && this.b == ((jyp)object0).b && this.c == ((jyp)object0).c && this.d == ((jyp)object0).d && this.e == ((jyp)object0).e && Float.compare(0.0f, 0.0f) == 0 && this.g == ((jyp)object0).g : false;
    }

    @Override
    public final int hashCode() {
        return (this.a * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Request[");
        long v = this.b;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append("PASSIVE");
        }
        else {
            stringBuilder0.append("@");
            kbb.a(v, stringBuilder0);
            switch(this.a) {
                case 100: {
                    stringBuilder0.append(" HIGH_ACCURACY");
                    break;
                }
                case 102: {
                    stringBuilder0.append(" BALANCED");
                    break;
                }
                case 104: {
                    stringBuilder0.append(" LOW_POWER");
                }
            }
        }
        long v1 = this.d;
        if(v1 != 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append(", duration=");
            kbb.a(v1, stringBuilder0);
        }
        int v2 = this.e;
        if(v2 != 0x7FFFFFFF) {
            stringBuilder0.append(", maxUpdates=");
            stringBuilder0.append(v2);
        }
        long v3 = this.c;
        if(v3 != -1L && v3 < v) {
            stringBuilder0.append(", minUpdateInterval=");
            kbb.a(v3, stringBuilder0);
        }
        long v4 = this.g;
        if(v4 / 2L > v) {
            stringBuilder0.append(", maxUpdateDelay=");
            kbb.a(v4, stringBuilder0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

