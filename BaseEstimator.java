import j..util.Objects;
import java.util.Arrays;

public abstract class BaseEstimator implements gpwy, IEstimator {
    private final ObserverRegistry a;
    static final int[] c;
    public static final int[] d;
    public final flp18Flags_phenotype e;
    public final HeadingHistogram f;
    protected final ParticleFilterCore g;
    public final ProjectionManager h;
    protected final double[] i;
    protected final int[] j;
    protected double k;

    static {
        BaseEstimator.c = new int[]{0, 1, 2, 3};
        BaseEstimator.d = new int[]{0, 1};
    }

    protected BaseEstimator(PrincipalSensorFusionConfiguration gpwi0, ProjectionManager gpwz0, ParticleFilterCore gpwu0, ObserverRegistry gpyo0) {
        this.f = new HeadingHistogram();
        this.j = new int[2];
        this.k = -Infinity;
        this.a = gpyo0;
        this.i = new double[4];
        this.e = gpwi0.flp18Flags_;
        this.h = gpwz0;
        this.g = gpwu0;
        gpwz0.a(this);
        gpwz0.a(gpwu0.f);
        gpwu0.j.a(this);
    }

    protected abstract void u();

    protected abstract void x(double arg1, ParticlePopulation arg2);

    @Override  // IEstimator
    public final void y(double f, ParticlePopulation gpxp0) {
        ParticleFilterCore gpwu0 = this.g;
        if(!gpwu0.b()) {
            this.u();
            return;
        }
        if((f > this.k)) {
            double[] arr_f = this.i;
            int[] arr_v = BaseEstimator.c;
            Particle[] arr_gpxo = gpxp0.particles_;
            if(arr_gpxo.length != 0) {
                gftb.b(arr_gpxo[0].state_.b() == 4, "State dimensions differ during MMSE calculation.");
                double f1 = 0.0;
                Arrays.fill(arr_f, 0.0);
                for(int v = 0; v < gpxp0.particles_.length; ++v) {
                    f1 += gpxp0.b(v);
                    ParticleState gpxn0 = gpxp0.particles_[v].state_;
                    for(int v1 = 0; v1 < 4; ++v1) {
                        int v2 = arr_v[v1];
                        arr_f[v2] += gpxn0.getStateAt(v2) * gpxp0.b(v);
                    }
                }
                for(int v3 = 0; v3 < 4; ++v3) {
                    int v4 = arr_v[v3];
                    arr_f[v4] /= f1;
                }
            }
            FilterStateManager gpww0 = gpwu0.stateManager_;
            double f2 = gpww0.currentTimestamp_;
            gpxm_Observation gpxm0 = gpww0.l;
            if(gpxm0 == null) {
            label_68:
                if(!gpww0.f) {
                    if(gpww0.a.aM()) {
                        gpww0.b.c(f2, 4);
                    }
                    else {
                        gpww0.j(f2, 4);
                    }
                    gpww0.f = true;
                }
                gpww0.r();
            }
            else {
                flp18Flags_phenotype huqw0 = gpww0.a;
                double f3 = huqw0.D();
                if(!(f2 - gpxm0.timestamp_ <= f3)) {
                    goto label_68;
                }
                else if(!gpww0.isWiFiValid_() && !gpww0.isGNSSValid_() && !gpww0.isStepValid_()) {
                    RttObservation gpwn0 = gpww0.g;
                    if(gpwn0 == null) {
                        gpww0.j(gpww0.currentTimestamp_, 5);
                    }
                    else {
                        double f4 = gpww0.currentTimestamp_ - huqw0.K();
                        if(gpwn0.timestamp_ <= f4) {
                            gpww0.j(gpww0.currentTimestamp_, 5);
                        }
                        else {
                            goto label_46;
                        }
                    }
                }
                else {
                label_46:
                    double f5 = NaN;
                    double f6 = gpww0.isGNSSValid_() ? DistanceUtils.b(arr_f, ((gpxm_Observation)Objects.requireNonNull(gpww0.k()))) : NaN;
                    if(gpww0.isWiFiValid_()) {
                        f5 = DistanceUtils.b(arr_f, ((gpxm_Observation)Objects.requireNonNull(gpww0.l())));
                    }
                    if(gpww0.isGNSSValid_() && !gpww0.isWiFiValid_() && gpww0.p(f6, ((gpxm_Observation)Objects.requireNonNull(gpww0.k())))) {
                        gpww0.i(gpww0.currentTimestamp_, 1);
                    }
                    else if(!gpww0.isGNSSValid_() && gpww0.isWiFiValid_() && gpww0.p(f5, ((gpxm_Observation)Objects.requireNonNull(gpww0.l())))) {
                        gpww0.i(gpww0.currentTimestamp_, 2);
                    }
                    else if(gpww0.isGNSSValid_() && gpww0.isWiFiValid_()) {
                        gpxm_Observation gpxm1 = (gpxm_Observation)Objects.requireNonNull(gpww0.k());
                        gpxm_Observation gpxm2 = (gpxm_Observation)Objects.requireNonNull(gpww0.l());
                        double f7 = gpxm1.b(0);
                        double f8 = gpxm1.b(1);
                        if(!(Math.hypot(f7 - gpxm2.b(0), f8 - gpxm2.b(1)) > huqw0.H())) {
                            if(gpww0.q(arr_f, gpww0.k()) && gpww0.q(arr_f, gpww0.l())) {
                                gpww0.i(gpww0.currentTimestamp_, 4);
                            }
                        }
                        else if(gpww0.q(arr_f, gpww0.k())) {
                            gpww0.i(gpww0.currentTimestamp_, 3);
                        }
                    }
                }
            }
            if(!gpwu0.b()) {
                this.u();
                return;
            }
            ProjectionManager gpwz0 = this.h;
            double f9 = arr_f[0];
            double f10 = arr_f[1];
            int[] arr_v1 = this.j;
            if(gpwz0.c()) {
                int v5 = gpwz0.b.metersYToLatE7(f10);
                int v6 = gpwz0.b.metersXToLngE7(f9);
                if((gpwz0.b.a(f9, f10) > 0.1)) {
                    gpwz0.b(v5, v6);
                }
                arr_v1[0] = v5;
                arr_v1[1] = v6;
                this.x(f, gpxp0);
                this.k = f;
            }
        }
    }

    @Override  // gpwy
    public final void z(EquirectangularProjection gpuc0, EquirectangularProjection gpuc1) {
        for(Object object0: this.a.a) {
            ((IFilterObserver)object0).au(gpuc1);
        }
        ParticleFilterCore gpwu0 = this.g;
        if(gpuc0 != null) {
            FilterStateManager gpww0 = gpwu0.stateManager_;
            gpww0.m(ProjectionManager.e(gpww0.lastGpsObservation_, gpuc0, gpuc1));
            gpww0.n(ProjectionManager.e(gpww0.lastWifiObservation_, gpuc0, gpuc1));
            Particle[] arr_gpxo = gpwu0.j.population_.particles_;
            for(int v = 0; v < arr_gpxo.length; ++v) {
                ParticleState gpxn0 = arr_gpxo[v].state_;
                gpxn0.f(0, gpuc1.lngE7ToMetersX(gpuc0.metersXToLngE7(gpxn0.getStateAt(0))));
                gpxn0.f(1, gpuc1.latE7ToMetersY(gpuc0.metersYToLatE7(gpxn0.getStateAt(1))));
            }
            if(!Double.isNaN(gpww0.currentTimestamp_)) {
                double f = gpww0.currentTimestamp_;
                for(Object object1: gpwu0.observers_.a) {
                    ((IFilterObserver)object1).M(f, gpuc1);
                }
            }
        }
    }
}

