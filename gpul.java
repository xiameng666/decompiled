import j..util.Objects;

public final class gpul {
    static final double a;
    static final double b;
    public boolean c;
    public final flp18Flags_phenotype d;
    public double e;
    public double f;
    private static final double g;
    private gpuk h;
    private EquirectangularProjection i;
    private long j;

    static {
        gpul.a = Math.toRadians(45.0);
        gpul.g = Math.toRadians(0.01);
        gpul.b = Math.sqrt(Math.log1p(-0.68) * -2.0);
    }

    public gpul(flp18Flags_phenotype huqw0) {
        this.j = 0L;
        this.c = false;
        this.d = huqw0;
        this.e = huqw0.V();
        this.f = huqw0.W();
    }

    public final gptu_Position a(gptu_Position gptu0, long v) {
        if(this.c && this.d.aO()) {
            return gptu0;
        }
        if(this.h == null) {
            return this.d(gptu0, v);
        }
        double f = ((double)(v - this.j)) / 1000000000.0;
        if(f <= 15.0 && f >= -2.0) {
            double f1 = Math.max(0.0, f);
            if((GeoMath.j(gptu0.c(), gptu0.e(), GeoMath.e(((EquirectangularProjection)Objects.requireNonNull(this.i)).metersYToLatE7(this.h.a.a(1, 0))), GeoMath.e(((EquirectangularProjection)Objects.requireNonNull(this.i)).metersXToLngE7(((gpuk)Objects.requireNonNull(this.h)).a.a(0, 0)))) > this.d.S())) {
                return this.d(gptu0, v);
            }
            cjdt cjdt0 = cjdt.b(4);
            cjdt0.e(0, 2, f1);
            cjdt0.e(1, 3, f1);
            double f2 = this.e * this.e * f1;
            double f3 = this.f * this.f * f1;
            cjdt cjdt1 = cjdt.b(4);
            cjdt1.e(0, 0, f2);
            cjdt1.e(1, 1, f2);
            cjdt1.e(2, 2, f3);
            cjdt1.e(3, 3, f3);
            ((gpuk)Objects.requireNonNull(this.h)).c(cjdt0, cjdt1);
            int v1 = !gptu0.i() || !gptu0.n() ? 0 : 1;
            int v2 = 1 == v1 ? 4 : 2;
            cjdt cjdt2 = new cjdt(v2, 1);
            cjdt cjdt3 = new cjdt(v2, v2);
            cjdt cjdt4 = new cjdt(v2, 4);
            cjdt2.e(0, 0, ((EquirectangularProjection)Objects.requireNonNull(this.i)).lngE7ToMetersX(gptu0.lngE7));
            cjdt2.e(1, 0, ((EquirectangularProjection)Objects.requireNonNull(this.i)).latE7ToMetersY(gptu0.latE7));
            double f4 = gpul.b;
            double f5 = Math.pow(Math.max(5.0, ((double)gptu0.accuracyMm) * 0.001) / f4, 2.0);
            cjdt3.e(0, 0, f5);
            cjdt3.e(1, 1, f5);
            cjdt4.e(0, 0, 1.0);
            cjdt4.e(1, 1, 1.0);
            if(v1 != 0) {
                gpul.c(gptu0, cjdt2, cjdt3);
                cjdt4.e(2, 2, 1.0);
                cjdt4.e(3, 3, 1.0);
            }
            try {
                ((gpuk)Objects.requireNonNull(this.h)).b(cjdt2, cjdt4, cjdt3);
            }
            catch(ArithmeticException unused_ex) {
                return this.d(gptu0, v);
            }
            this.j = v;
            cjdt cjdt5 = ((gpuk)Objects.requireNonNull(this.h)).a;
            cjdt cjdt6 = ((gpuk)Objects.requireNonNull(this.h)).b;
            double f6 = cjdt5.a(0, 0);
            double f7 = cjdt5.a(1, 0);
            if((((EquirectangularProjection)Objects.requireNonNull(this.i)).a(f6, f7) > 0.1)) {
                this.i = EquirectangularProjection.f(((EquirectangularProjection)Objects.requireNonNull(this.i)), f6, f7);
                cjdt5.e(0, 0, 0.0);
                cjdt5.e(1, 0, 0.0);
                ((gpuk)Objects.requireNonNull(this.h)).a(cjdt5, this.h.b);
            }
            double f8 = f4 * Math.sqrt((cjdt6.a(0, 0) + cjdt6.a(1, 1)) / 2.0);
            double f9 = Math.hypot(cjdt5.a(2, 0), cjdt5.a(3, 0));
            double f10 = Math.atan2(cjdt5.a(3, 0), cjdt5.a(2, 0));
            PositionBuilder gptr0 = gpul.e(gptu0).g();
            gptr0.i(((EquirectangularProjection)Objects.requireNonNull(this.i)).metersYToLatE7(cjdt5.a(1, 0)), ((EquirectangularProjection)Objects.requireNonNull(this.i)).metersXToLngE7(cjdt5.a(0, 0)), ((int)TimeUtils.c(f8)));
            gptr0.k(((float)f9));
            gptr0.e(((float)Math.toDegrees(AngleUtils.d(f10))));
            return new gptu_Position(gptr0);
        }
        return this.d(gptu0, v);
    }

    public final void b() {
        this.h = null;
        this.j = 0L;
        this.i = null;
        this.e = this.d.V();
        this.f = this.d.W();
    }

    static void c(gptu_Position gptu0, cjdt cjdt0, cjdt cjdt1) {
        if(gptu0.i() && gptu0.n()) {
            double f = AngleUtils.c(Math.toRadians(gptu0.bearingDegrees));
            double f1 = (double)gptu0.speedMps;
            cjdt0.e(2, 0, Math.cos(f) * f1);
            cjdt0.e(3, 0, Math.sin(f) * f1);
            double f2 = gptu0.j() ? Math.toRadians(gptu0.bearingAccuracyDegrees) : gpul.a;
            double f3 = gptu0.o() ? ((double)gptu0.speedAccuracyMps) : 1.5;
            double f4 = gpul.g;
            if(f2 < f4) {
                f2 = f4;
            }
            if((f3 < 0.001)) {
                f3 = 0.001;
            }
            double f5 = Math.max(f1, 0.001);
            cjdt1.e(2, 2, Math.pow(Math.cos(f) * f3, 2.0) + Math.pow(Math.sin(f) * f5 * f2, 2.0));
            cjdt1.e(3, 3, Math.pow(Math.sin(f) * f3, 2.0) + Math.pow(f5 * Math.cos(f) * f2, 2.0));
            return;
        }
        cjdt0.e(2, 0, 0.0);
        cjdt0.e(3, 0, 0.0);
        cjdt1.e(2, 2, 1000.0);
        cjdt1.e(3, 3, 1000.0);
    }

    private final gptu_Position d(gptu_Position gptu0, long v) {
        this.i = new EquirectangularProjection(gptu0.latE7, gptu0.lngE7);
        cjdt cjdt0 = new cjdt(4, 1);
        cjdt0.e(0, 0, ((EquirectangularProjection)Objects.requireNonNull(this.i)).lngE7ToMetersX(gptu0.lngE7));
        cjdt0.e(1, 0, ((EquirectangularProjection)Objects.requireNonNull(this.i)).latE7ToMetersY(gptu0.latE7));
        cjdt cjdt1 = cjdt.b(4);
        double f = TimeUtils.a(gptu0.accuracyMm);
        double f1 = f * f;
        cjdt1.e(0, 0, f1);
        cjdt1.e(1, 1, f1);
        if(gptu0.i() && gptu0.n()) {
            gpul.c(gptu0, cjdt0, cjdt1);
        }
        else {
            cjdt0.e(2, 0, 0.0);
            cjdt0.e(3, 0, 0.0);
            cjdt1.e(2, 2, 25.0);
            cjdt1.e(3, 3, 25.0);
        }
        gpuk gpuk0 = new gpuk(cjdt0, cjdt1);
        this.h = gpuk0;
        gpuk0.c.a = true;
        this.j = v;
        return gpul.e(gptu0);
    }

    private static gptu_Position e(gptu_Position gptu0) {
        PositionBuilder gptr0 = gptu0.g();
        gptr0.d(((float)(gptu0.j() ? ((double)gptu0.bearingAccuracyDegrees) : Math.toDegrees(gpul.a))));
        gptr0.j(((float)(gptu0.o() ? ((double)gptu0.speedAccuracyMps) : 1.5)));
        return new gptu_Position(gptr0);
    }
}

