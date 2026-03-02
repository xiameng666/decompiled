public abstract class gpzc extends ILikelihood implements gpwy {
    final double b;
    final double c;
    final boolean d;
    final double e;
    public gpxm_Observation f;
    private EquirectangularProjection g;
    private final fwec h;

    protected gpzc(flpRttFlags hurm0) {
        double f = hurm0.m();
        double f1 = hurm0.k();
        this.h = new fwec(f, hurm0.j(), f1, ((int)hurm0.v()), hurm0.o(), ((int)hurm0.u()));
        boolean z = hurm0.C();
        this.d = z;
        this.e = z ? hurm0.i() : 0.0;
        this.b = hurm0.a();
        this.c = hurm0.n();
    }

    @Override  // ILikelihood
    public final double a(ParticleState gpxn0) {
        double f3;
        gftb.check(this.a);
        fwed fwed0 = ((RttObservation)this.a).a;
        if(fwed0 == null) {
            return 1.0;
        }
        fwec fwec0 = this.h;
        int v1 = 0;
        for(int v = 0; v < fwed0.d(); ++v) {
            if(fwec0.a(fwed0, v)) {
                ++v1;
            }
        }
        if(v1 >= fwec0.b) {
            double f = 1.0;
            int v2 = 0;
            int v3 = 0;
            while(v3 < fwed0.d()) {
                if(this.f != null || fwec0.a(fwed0, v3)) {
                    gpxm_Observation gpxm0 = this.f;
                    if(gpxm0 == null) {
                    label_34:
                        double f4 = fwed0.s(v3);
                        EquirectangularProjection gpuc0 = this.g;
                        ggzv ggzv0 = fwed0.w(v3);
                        double f5 = gpxn0.getStateAt(0);
                        double f6 = gpxn0.getStateAt(1);
                        double f7 = Math.hypot(f5 - gpuc0.lngE7ToMetersX(ggzv0.g().c()), f6 - gpuc0.latE7ToMetersY(ggzv0.e().c()));
                        double f8 = Math.max(fwed0.q(v3), 0.1);
                        if(fwed0.b(v3) < -70) {
                            f8 *= 4.0;
                        }
                        if(fwed0.b(v3) < -80) {
                            f8 += f8;
                        }
                        f *= this.d(f4, f7, f8, ((double)fwed0.v(v3)));
                        ++v2;
                    }
                    else {
                        double f1 = gpxm0.b(0);
                        Double double0 = f1;
                        double f2 = this.f.b(1);
                        Double.valueOf(f2).getClass();
                        Double double1 = f2;
                        if(fwec0.a(fwed0, v3)) {
                            Double double2 = fwed0.y(v3);
                            if(double2 == null) {
                                f3 = 0.0;
                            }
                            else {
                                double0.getClass();
                                f3 = Math.abs(((double)double2) - f1);
                            }
                            double1.getClass();
                            if((f3 <= fwec0.a - f2)) {
                                goto label_34;
                            }
                        }
                    }
                }
                ++v3;
            }
            if(v2 != 0) {
                f = Math.pow(f, 1.0f / ((float)v2));
            }
            return this.d ? Math.max(f, this.e) : f;
        }
        return 1.0;
    }

    @Override  // ILikelihood
    public final void b() {
        this.f = null;
    }

    @Override  // ILikelihood
    public final void c_isExpectedLikelihood() {
        gftb.check(this.a);
        int v = this.a.data_;
        gpxm_Observation gpxm0 = this.a;
        gftb.check(gpxm0);
        gftb.m(v == 15, "Expected %s, but got %s.", "gpwn", gpxm0.getClass().getSimpleName());
    }

    public abstract double d(double arg1, double arg2, double arg3, double arg4);

    final double e(double f, double f1) {
        return Math.hypot(this.c * f, this.b * f1);
    }

    @Override  // gpwy
    public final void z(EquirectangularProjection gpuc0, EquirectangularProjection gpuc1) {
        this.g = gpuc1;
    }
}

