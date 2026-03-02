package j$.time.format;

import j..time.LocalDate;
import j..time.chrono.ChronoLocalDate;
import j..time.chrono.Chronology.-CC;
import j..time.chrono.Chronology;
import j..time.chrono.q;
import j..time.temporal.TemporalField;
import j..util.Objects;
import java.util.ArrayList;

public final class p extends j {
    public final ChronoLocalDate g;
    public static final LocalDate h;

    static {
        p.h = LocalDate.of(2000, 1, 1);
    }

    public p(TemporalField temporalField0, int v, int v1, ChronoLocalDate chronoLocalDate0, int v2) {
        super(temporalField0, v, v1, d0.NOT_NEGATIVE, v2);
        this.g = chronoLocalDate0;
    }

    @Override  // j$.time.format.j
    public final long a(x x0, long v) {
        long v1 = Math.abs(v);
        int v2 = this.g == null ? 0 : Chronology.-CC.a(x0.a).y(this.g).get(this.a);
        long[] arr_v = j.f;
        if(Long.compare(v, v2) >= 0) {
            long v3 = arr_v[this.b];
            return v >= ((long)v2) + v3 ? v1 % arr_v[this.c] : v1 % v3;
        }
        return v1 % arr_v[this.c];
    }

    @Override  // j$.time.format.j
    public final boolean b(v v0) {
        return v0.c ? super.b(v0) : false;
    }

    @Override  // j$.time.format.j
    public final int c(v v0, long v1, int v2, int v3) {
        int v8;
        int v7;
        long v6;
        v v5;
        p p0;
        int v4;
        ChronoLocalDate chronoLocalDate0 = this.g;
        if(chronoLocalDate0 == null) {
            p0 = this;
            v5 = v0;
            v6 = v1;
            v7 = v2;
            v8 = v3;
            v4 = 0;
        }
        else {
            Chronology chronology0 = v0.c().c;
            if(chronology0 == null) {
                chronology0 = v0.a.e;
                if(chronology0 == null) {
                    chronology0 = q.d;
                }
            }
            v4 = chronology0.y(chronoLocalDate0).get(this.a);
            p0 = this;
            v5 = v0;
            v6 = v1;
            v7 = v2;
            v8 = v3;
            o o0 = new o(p0, v5, v6, v7, v8);
            if(v5.e == null) {
                v5.e = new ArrayList();
            }
            v5.e.add(o0);
        }
        int v9 = p0.b;
        if(v8 - v7 == v9 && v6 >= 0L) {
            long v10 = j.f[v9];
            long v11 = ((long)v4) - ((long)v4) % v10;
            long v12 = v4 <= 0 ? v11 - v6 : v11 + v6;
            return v12 >= ((long)v4) ? v5.f(p0.a, v12, v7, v8) : v5.f(p0.a, v10 + v12, v7, v8);
        }
        return v5.f(p0.a, v6, v7, v8);
    }

    @Override  // j$.time.format.j
    public final j d() {
        return this.e == -1 ? this : new p(this.a, this.b, this.c, this.g, -1);
    }

    @Override  // j$.time.format.j
    public final j e(int v) {
        return new p(this.a, this.b, this.c, this.g, this.e + v);
    }

    @Override  // j$.time.format.j
    public final String toString() {
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + Objects.requireNonNullElse(this.g, Integer.valueOf(0)) + ")";
    }
}

