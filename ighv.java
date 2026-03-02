import java.util.Arrays;

final class ighv {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public ighv(char c, int v, int v1, int v2, boolean z, int v3) {
        if(c != 0x73 && c != 0x75 && c != 0x77) {
            throw new IllegalArgumentException("Unknown mode: " + c);
        }
        this.a = c;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = z;
        this.f = v3;
    }

    public final long a(igcm igcm0, long v) {
        try {
            return this.d(igcm0, v);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(this.b != 2 || this.c != 29) {
                throw illegalArgumentException0;
            }
            while(!((igdv)igcm0).A.z(v)) {
                v = ((igdv)igcm0).A.g(v, 1);
            }
            return this.d(igcm0, v);
        }
    }

    public final long b(igcm igcm0, long v) {
        try {
            return this.d(igcm0, v);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(this.b != 2 || this.c != 29) {
                throw illegalArgumentException0;
            }
            while(!((igdv)igcm0).A.z(v)) {
                v = ((igdv)igcm0).A.g(v, -1);
            }
            return this.d(igcm0, v);
        }
    }

    public final long c(igcm igcm0, long v) {
        int v1 = ((igdv)igcm0).t.a(v);
        int v2 = this.d - v1;
        if(v2 != 0) {
            if(this.e) {
                return v2 >= 0 ? ((igdv)igcm0).t.g(v, v2) : ((igdv)igcm0).t.g(v, v2 + 7);
            }
            if(v2 > 0) {
                v2 += -7;
            }
            return ((igdv)igcm0).t.g(v, v2);
        }
        return v;
    }

    private final long d(igcm igcm0, long v) {
        int v1 = this.c;
        if(v1 >= 0) {
            return ((igdv)igcm0).u.l(v, v1);
        }
        long v2 = ((igdv)igcm0).u.l(v, 1);
        long v3 = ((igdv)igcm0).z.g(v2, 1);
        return ((igdv)igcm0).u.g(v3, v1);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ighv) && this.a == ((ighv)object0).a && this.b == ((ighv)object0).b && this.c == ((ighv)object0).c && this.d == ((ighv)object0).d && this.e == ((ighv)object0).e && this.f == ((ighv)object0).f;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Character.valueOf(this.a), ((int)this.b), ((int)this.c), ((int)this.d), Boolean.valueOf(this.e), ((int)this.f)});
    }

    @Override
    public final String toString() {
        return "[OfYear]\nMode: " + this.a + "\nMonthOfYear: " + this.b + "\nDayOfMonth: " + this.c + "\nDayOfWeek: " + this.d + "\nAdvanceDayOfWeek: " + this.e + "\nMillisOfDay: " + this.f + "\n";
    }
}

