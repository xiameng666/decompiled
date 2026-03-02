import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public final class ParticleFilterCore extends BaseParticleFilter {
    private final flp18Flags_phenotype A;
    public final Object lock_;
    public final DriftMotionModel b;
    public final HeadingMotionModel c;
    public final PositionMotionModel d;
    public final SpeedMotionModel e;
    public final PdrLikelihood f;
    public final FilterStateManager stateManager_;
    public final ObserverRegistry observers_;
    private static final double n;
    private final PositionInitMotionModel o;
    private final AttitudeInitMotionModel p;
    private final SpeedInitMotionModel q;
    private final StepMotionModel r;
    private final BarometerMotionModel s;
    private final MagnetometerMotionModel t;
    private final PositionLikelihood u;
    private final PositionLikelihood v;
    private final SpeedLikelihood speedCalc;
    private final HeadingLikelihood x;
    private final BlueSkyLikelihood y;
    private final gfsx z;

    static {
        ParticleFilterCore.n = Math.toRadians(5.0);
    }

    public ParticleFilterCore(PrincipalSensorFusionConfiguration gpwi0, ProjectionManager gpwz0, ObserverRegistry gpyo0) {
        gfsx gfsx0;
        PositionLikelihood gpyx0 = new PositionLikelihood(gpwi0.flp18Flags_.O(), gpwi0.flp18Flags_.p());
        PositionLikelihood gpyx1 = new PositionLikelihood(gpwi0.flp18Flags_.R(), gpwi0.flp18Flags_.p());
        super(new RandomGenerator(gpwi0.seed_), ((int)gpwi0.flp18Flags_.az()), gpwi0.flp18Flags_.ae(), gpwi0.flp18Flags_.aK(), gpyo0);
        this.lock_ = new Object();
        this.o = new PositionInitMotionModel(this.i);
        this.p = new AttitudeInitMotionModel(this.i);
        this.observers_ = gpyo0;
        this.A = gpwi0.flp18Flags_;
        this.u = gpyx0;
        this.v = gpyx1;
        this.stateManager_ = new FilterStateManager(gpwi0.flp18Flags_, gpyo0);
        this.r = new StepMotionModel(this.i, gpwi0.flp18Flags_.ah(), gpwi0.flp18Flags_.ai());
        this.c = new HeadingMotionModel(this.i, gpwi0.flp18Flags_.am());
        this.s = new BarometerMotionModel();
        this.t = new MagnetometerMotionModel(this.i, ParticleFilterCore.n);
        this.d = new PositionMotionModel(this.i, gpwi0.flp18Flags_.an());
        this.e = new SpeedMotionModel(this.i, gpwi0.flp18Flags_.al(), gpwi0.flp18Flags_.ak());
        this.b = new DriftMotionModel(gpwi0.flp18Flags_.Z());
        this.q = new SpeedInitMotionModel(this.i);
        this.speedCalc = new SpeedLikelihood(gpwi0.flp18Flags_.h());
        this.x = new HeadingLikelihood(gpwi0.flp18Flags_.g());
        this.y = new BlueSkyLikelihood(gpwi0.flp18Flags_.P(), gpwi0.flp18Flags_.Q(), gpwi0.flp18Flags_.w(), gpwi0.flp18Flags_.y(), gpwi0.flp18Flags_.x(), gpwi0.flp18Flags_.aL());
        this.f = new PdrLikelihood(gpwi0.flp18Flags_);
        if(gpwi0.flpRttFlags_.E()) {  // FlpRtt__enable_rtt_in_particle_filter
            try {
                int v = 1;
                switch(gpwi0.flpRttFlags_.y()) {  // FlpRtt__wifi_rtt_likelihood_model
                    case "ASYMMETRIC_LAPLACE": {
                        v = 3;
                        break;
                    }
                    case "GAUSSIAN": {
                        break;
                    }
                    case "GAUSSIAN_MIXTURE": {
                        v = 4;
                        break;
                    }
                    case "SPREADING_GAUSSIAN": {
                        v = 2;
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException();
                    }
                }
            }
            catch(IllegalArgumentException unused_ex) {
            }
            switch(v - 1) {
                case 2: {
                    gfsx0 = gfsx.m(new gpyz(gpwi0.flpRttFlags_));
                    break;
                }
                case 3: {
                    gfsx0 = gfsx.m(new gpza(gpwi0.flpRttFlags_));
                    break;
                }
                default: {
                    gfsx0 = gfsx.m(new gpzb(gpwi0.flpRttFlags_));
                }
            }
            this.z = gfsx0;
            gpwz0.a(((gpwy)gfsx0.d()));
        }
        else {
            this.z = gfqx.a;
        }
        gpwz0.a(this.f);
    }

    // This method was un-flattened
    @Override  // BaseParticleFilter
    public final void processObservation(gpxm_Observation gpxm0) {
        ArrayDeque arrayDeque2;
        ObserverRegistry gpyo1;
        gpxm_Observation gpxm3;
        int v3;
        double f;
        ParticleFilterCore gpwu0 = this;
        ObserverRegistry gpyo0 = gpwu0.observers_;
        gpyo0.b(gpxm0);
        ArrayDeque arrayDeque0 = gpwu0.m;
        arrayDeque0.add(gpxm0);
        while(!arrayDeque0.isEmpty()) {
            ArrayList arrayList0 = gpwu0.k;
            arrayList0.clear();
            ArrayList arrayList1 = gpwu0.l;
            arrayList1.clear();
            synchronized(gpwu0.lock_) {
                ArrayDeque arrayDeque1 = gpwu0.m;
                if(arrayDeque1.isEmpty()) {
                    f = NaN;
                }
                else {
                    gpxm_Observation gpxm1 = (gpxm_Observation)arrayDeque1.remove();
                    f = gpxm1.timestamp_;
                    int v1 = gpxm1.data_;
                    if(v1 == 4) {
                        gpwu0.stateManager_.lastStepObservation_ = gpxm1;
                        gpwu0.stateManager_.d(gpxm1);
                    }
                    else {
                        switch(v1) {
                            case 5: {
                                gpwu0.stateManager_.d(gpxm1);
                                gpwu0.stateManager_.a(false);
                                gpwu0.stateManager_.o(null);
                                break;
                            }
                            case 6: {
                                gpwu0.stateManager_.o(gpxm1);
                                break;
                            }
                            case 13: {
                                gpwu0.stateManager_.d(gpxm1);
                                gpwu0.stateManager_.m(gpxm1);
                                break;
                            }
                            case 14: {
                                gpwu0.stateManager_.d(gpxm1);
                                gpwu0.stateManager_.n(gpxm1);
                                break;
                            }
                            case 15: {
                                gpwu0.stateManager_.g = (RttObservation)gpxm1;
                                gpwu0.stateManager_.d(((RttObservation)gpxm1));
                                break;
                            }
                            case 16: {
                                gpwu0.stateManager_.p = gpxm1;
                                gpwu0.stateManager_.d(gpxm1);
                                break;
                            }
                            default: {
                                gpwu0.stateManager_.d(gpxm1);
                            }
                        }
                    }
                    FilterStateManager gpww0 = gpwu0.stateManager_;
                    if(gpww0.h()) {
                        ArrayList arrayList2 = gpwu0.k;
                        gpwu0.c.d = gpxm1;
                        arrayList2.add(gpwu0.c);
                        gpwu0.e.d = gpxm1;
                        arrayList2.add(gpwu0.e);
                        if(gpww0.isSpeedInitialized_) {
                            gpwu0.d.d = gpxm1;
                            arrayList2.add(gpwu0.d);
                            gpwu0.b.d = gpxm1;
                            arrayList2.add(gpwu0.b);
                        }
                        switch(v1) {
                            case 4: {
                                if(!gpww0.isSpeedInitialized_) {
                                    gpwu0.r.d = gpxm1;
                                    arrayList2.add(gpwu0.r);
                                }
                                break;
                            }
                            case 6: {
                                gpwu0.s.d = gpxm1;
                                arrayList2.add(gpwu0.s);
                                break;
                            }
                            default: {
                                if(v1 == 7) {
                                    gpwu0.t.d = gpxm1;
                                    arrayList2.add(gpwu0.t);
                                }
                                else {
                                    switch(v1) {
                                        case 10: {
                                            gpwu0.f.a = gpxm1;
                                            gpwu0.l.add(gpwu0.f);
                                            break;
                                        }
                                        case 11: {
                                            if(gpww0.isSpeedInitialized_) {  // speed
                                                gpwu0.speedCalc.a = gpxm1;
                                                gpwu0.l.add(gpwu0.speedCalc);
                                            }
                                            else {
                                                gpwu0.q.d = gpxm1;
                                                arrayList2.add(gpwu0.q);
                                                gpww0.c(true);
                                            }
                                            break;
                                        }
                                        case 12: {
                                            if(gpww0.isPositionInitialized_) {  // heading
                                                gpwu0.x.a = gpxm1;
                                                gpwu0.l.add(gpwu0.x);
                                            }
                                            break;
                                        }
                                        case 13: {
                                            if(gpxm1.e(3)) {
                                                gpwv gpwv0 = !(gpxm1.b(2) <= gpwu0.A.aa()) || !gpxm1.e(3) || !(gpxm1.b(3) >= gpwu0.A.ab()) ? gpwv.a : gpwv.b;
                                                gpwx gpwx0 = gpww0.k;
                                                int v2 = gpwx0.b.containsKey(gpwv0) ? ((int)(((Integer)gpwx0.b.get(gpwv0)))) : 1;
                                                if(gpwv0.equals(gpwx0.c)) {
                                                    v3 = gpwx0.a + 1;
                                                    gpwx0.a = v3;
                                                }
                                                else {
                                                    gpwx0.c = gpwv0;
                                                    gpwx0.a = 1;
                                                    v3 = 1;
                                                }
                                                if(v3 >= v2 || gpwx0.d == null) {
                                                    gpwx0.d = gpwv0;
                                                }
                                                boolean z = gpwx0.d == gpwv.b;
                                                gpww0.e = z;
                                                for(Object object1: gpww0.b.a) {
                                                    ((IFilterObserver)object1).Q(z);
                                                }
                                            }
                                            ArrayList arrayList3 = gpwu0.l;
                                            gpwu0.u.a = gpxm1;
                                            arrayList3.add(gpwu0.u);
                                            gpwu0.u.c = gpww0.isWiFiValid_() ? 1.0 : gpwu0.A.M();
                                            if(!gpwu0.A.aN()) {
                                                gpwu0.y.a = gpxm1;
                                                arrayList3.add(gpwu0.y);
                                            }
                                            else if(gpww0.isSpeedInitialized_) {
                                                gpwu0.y.a = gpxm1;
                                                arrayList3.add(gpwu0.y);
                                            }
                                            break;
                                        }
                                        case 14: {
                                            gpwu0.v.a = gpxm1;
                                            gpwu0.l.add(gpwu0.v);
                                            gpwu0.v.c = gpww0.isGNSSValid_() ? 1.0 : gpwu0.A.N();
                                            break;
                                        }
                                        case 15: {
                                            gfsx gfsx0 = gpwu0.z;
                                            if(gfsx0.i()) {
                                                ArrayList arrayList4 = gpwu0.l;
                                                Object object2 = gfsx0.d();
                                                ((ILikelihood)object2).a = gpxm1;
                                                arrayList4.add(object2);
                                                Object object3 = gfsx0.d();
                                                flp18Flags_phenotype huqw0 = gpww0.a;
                                                double f1 = gpww0.currentTimestamp_;
                                                gpxm_Observation gpxm2 = gpww0.p;
                                                if(gpxm2 != null) {
                                                    double f2 = f1 - huqw0.C();
                                                    if((gpxm2.timestamp_ > f2)) {
                                                        gpxm3 = gpww0.p;
                                                        goto label_126;
                                                    }
                                                }
                                                gpxm3 = null;
                                            label_126:
                                                ((gpzc)object3).f = gpxm3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        boolean z1 = (gpww0.isGNSSValid_() || gpww0.isWiFiValid_()) && gpww0.currentTimestamp_ > gpww0.i + gpww0.a.A();
                        if((gpww0.isGNSSValid_() && gpww0.isWiFiValid_() || z1) && gpww0.l != null) {
                            if(!gpww0.isAttitudeInitialized_) {
                                gpwl gpwl0 = new gpwl(f, gpww0.k(), gpww0.l());
                                gpwu0.o.d = gpwl0;
                                gpwu0.k.add(gpwu0.o);
                                gpyo0.b(gpwl0);
                                WeightUtils.c(gpwu0.j.population_.a);
                                gpww0.b(true);
                                gpww0.a(false);
                            }
                            if(!gpww0.isPositionInitialized_) {
                                gpwu0.k.add(gpwu0.p);
                                gpww0.a(true);
                            }
                        }
                    }
                }
            }
            ParticleFilterEngine gpxv0 = gpwu0.j;
            gpxv0.e_modelList = arrayList0;
            gpxv0.f_LikelihoodList = arrayList1;
            gpxv0.a = f;
            ArrayList modelList = gpxv0.e_modelList;
            int v4 = modelList.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                ((IMotionModel)modelList.get(v5)).a_isExpectedModel();
            }
            ArrayList likelihoodList = gpxv0.f_LikelihoodList;
            int v6 = likelihoodList.size();
            for(int v7 = 0; v7 < v6; ++v7) {
                ((ILikelihood)likelihoodList.get(v7)).c_isExpectedLikelihood();
            }
            ParticlePopulation gpxp0 = gpxv0.population_;
            int v8 = gpxv0.numParticles_;
            Particle[] arr_gpxo = gpxp0.particles_;
            int v9 = arr_gpxo.length;
            if(v8 != v9) {
                throw new IllegalStateException(a.z(v8, v9, " Particle population size ", " smcf expecting "));
            }
            for(int v10 = 0; v10 < v8; ++v10) {
                Particle gpxo0 = arr_gpxo[v10];
                ArrayList arrayList7 = gpxv0.e_modelList;
                int v11 = arrayList7.size();
                for(int v12 = 0; v12 < v11; ++v12) {
                    ((IMotionModel)arrayList7.get(v12)).b(gpxo0.state_);
                }
                ArrayList arrayList8 = gpxv0.f_LikelihoodList;
                int v13 = arrayList8.size();
                double f3 = 1.0;
                for(int v14 = 0; v14 < v13; ++v14) {
                    f3 *= ((ILikelihood)arrayList8.get(v14)).a(gpxo0.state_);
                    if((f3 < 0.0) || Double.isNaN(f3)) {
                        f3 = 0.0;
                    }
                }
                double[] arr_f = gpxp0.a;
                if(v10 < arr_f.length && v10 >= 0 && (f3 >= 0.0)) {
                    arr_f[v10] *= f3;
                }
            }
            double f4 = 0.0;
            Set set0 = gpxv0.j.a;
            for(Object object4: set0) {
                ((IFilterObserver)object4).ar();
            }
            for(Object object5: set0) {
                ((IFilterObserver)object5).as();
            }
            Resampler gpxr0 = gpxv0.resampler_;
            double f5 = gpxv0.c;
            Particle[] arr_gpxo1 = gpxp0.particles_;
            double[] arr_f1 = gpxp0.a;
            int v15 = arr_f1.length;
            if(v15 != 0) {
                int[] arr_v = gpxr0.c;
                if(v15 == arr_v.length && f5 >= 0.0) {
                    double f6 = 0.0;
                    double f7 = 0.0;
                    for(int v16 = 0; v16 < v15; ++v16) {
                        double f8 = arr_f1[v16];
                        f7 += f8;
                        f6 += f8 * f8;
                    }
                    if(f6 >= 1.000000E-100) {
                        f4 = f7 * f7 / f6;
                    }
                    double f9 = (double)arr_f1.length;
                    if(f4 >= f5 * f9 && WeightUtils.a(arr_f1) > 1.000000E-99 * f9) {
                        WeightUtils.b(arr_f1);
                    }
                    else {
                        WeightUtils.b(arr_f1);
                        double f10 = gpxr0.a.nextDouble() / f9;
                        double f11 = arr_f1[0];
                        int[] arr_v1 = gpxr0.d;
                        Arrays.fill(arr_v1, 0);
                        gpyo1 = gpyo0;
                        arrayDeque2 = arrayDeque0;
                        int v18 = 0;
                        for(int v17 = 0; (((double)v17) < f9); ++v17) {
                            while((((double)v17) / f9 + f10 > f11)) {
                                ++v18;
                                f11 += arr_f1[v18];
                            }
                            arr_v[v17] = v18;
                            ++arr_v1[v18];
                        }
                        WeightUtils.c(arr_f1);
                        boolean z2 = true;
                        for(int v19 = 0; true; ++v19) {
                            int[] arr_v2 = gpxr0.c;
                            if(v19 >= arr_v2.length) {
                                break;
                            }
                            if(gpxr0.e) {
                                int v20 = arr_v2[v19];
                                if(gpxr0.d[v20] == 1) {
                                    Particle gpxo1 = gpxr0.b[v19];
                                    Particle gpxo2 = arr_gpxo1[v20];
                                    ParticleState gpxn0 = gpxo2.state_;
                                    if(gpxn0 != null) {
                                        if(gpxo1.state_ == null) {
                                            gpxo1.state_ = gpxn0.c();
                                        }
                                        ParticleState gpxn1 = gpxo1.state_;
                                        ParticleState gpxn2 = gpxo2.state_;
                                        gpxn1.timestamp_ = gpxn2.timestamp_;
                                        double[] arr_f2 = gpxn1.stateVector_;
                                        gpxn1.stateVector_ = gpxn2.stateVector_;
                                        gpxn2.stateVector_ = arr_f2;
                                        gpxn2.e();
                                    }
                                }
                                else {
                                    gpxr0.b[v19].a(arr_gpxo1[v20]);
                                }
                            }
                            else {
                                gpxr0.b[v19].a(arr_gpxo1[arr_v2[v19]]);
                            }
                        }
                        gpxp0.particles_ = gpxr0.b;
                        gpxr0.b = arr_gpxo1;
                        goto label_289;
                    }
                }
            }
            gpyo1 = gpyo0;
            arrayDeque2 = arrayDeque0;
        label_289:
            if(z2) {
                ArrayList arrayList9 = gpxv0.h;
                int v21 = arrayList9.size();
                for(int v22 = 0; v22 < v21; ++v22) {
                    ((IPostResampleHandler)arrayList9.get(v22)).a();
                }
            }
            ArrayList arrayList10 = gpxv0.e_modelList;
            int v23 = arrayList10.size();
            for(int v24 = 0; v24 < v23; ++v24) {
                ((IMotionModel)arrayList10.get(v24)).c();
            }
            ArrayList arrayList11 = gpxv0.f_LikelihoodList;
            int v25 = arrayList11.size();
            for(int v26 = 0; v26 < v25; ++v26) {
                ((ILikelihood)arrayList11.get(v26)).b();
            }
            ArrayList arrayList12 = gpxv0.g;
            int v27 = arrayList12.size();
            for(int v28 = 0; v28 < v27; ++v28) {
                ((IEstimator)arrayList12.get(v28)).y(gpxv0.a, gpxp0);
            }
            if(z2) {
                for(Object object6: set0) {
                    ((IFilterObserver)object6).aw();
                }
            }
            ArrayList arrayList13 = gpxv0.e_modelList;
            int v29 = arrayList13.size();
            for(int v30 = 0; v30 < v29; ++v30) {
                ((IMotionModel)arrayList13.get(v30)).e();
            }
            ArrayList arrayList14 = gpxv0.f_LikelihoodList;
            int v31 = arrayList14.size();
            for(int v32 = 0; v32 < v31; ++v32) {
                ((ILikelihood)arrayList14.get(v32)).a = null;
            }
            gpwu0 = this;
            gpyo0 = gpyo1;
            arrayDeque0 = arrayDeque2;
            continue;
        }
    }

    public final boolean b() {
        return this.stateManager_.h();
    }
}

