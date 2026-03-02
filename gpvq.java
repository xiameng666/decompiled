import j..time.Duration;
import j..util.Optional;

public final class gpvq {
    public final huqn_elevationGraphOptimizerFlags a;
    public final fvzk b;
    public Optional c;
    public long d;
    public Optional e;
    public coad f;
    private final gpvd g;

    public gpvq(huqn_elevationGraphOptimizerFlags huqn0, gpvd gpvd0, fvzk fvzk0) {
        this.c = Optional.empty();
        this.d = -1L;
        this.e = Optional.empty();
        this.f = null;
        this.g = gpvd0;
        this.a = huqn0;
        this.b = fvzk0;
    }

    static double a(double f, icvk icvk0, double f1) {
        return gpye.a(f - ((double)icvk0.b), f1, 293.149994);
    }

    public final long b() {
        return Duration.ofNanos(fgvx.a()).plusMillis(this.d).toMillis();
    }

    public final gfsz c(long v) {
        gpvq gpvq0;
        long v1 = this.a.T();
        double f = this.a.i();
        if(this.c.isPresent() && this.e.isPresent()) {
            gpvq0 = this;
            if(gpvq0.d(((icvq)this.c.get()), v1, f)) {
                Double double0 = gpvq0.g.c(v);
                icvk icvk0 = gpvq0.b.b();
                if(double0 != null && icvk0 != null) {
                    double f1 = gpvq.a(double0.doubleValue(), icvk0, gpvq0.f(((icvq)gpvq0.c.get())));
                    double f2 = gpvq0.e();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)coad.a).v_newBuilder();
                    float f3 = fvzl.d(icvk0);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    coad coad0 = (coad)hftp0.b_message;
                    coad0.b |= 16;
                    coad0.g = f3;
                    int v2 = (int)Duration.ofMillis(gpvq0.b() - ((icvq)gpvq0.c.get()).c).toSeconds();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((coad)hftv0).b |= 0x1000;
                    ((coad)hftv0).o = v2;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    coad coad1 = (coad)hftp0.b_message;
                    coad1.b |= 0x10000;
                    coad1.s = (float)f2;
                    gpvq0.f = (coad)hftp0.N_build();
                    double f4 = gpvq0.f(((icvq)gpvq0.c.get()));
                    double f5 = gpvq0.e();
                    return new gfsz(f1, ((double)(gpvq.a(((double)double0) - ((double)icvk0.c), icvk0, f4 + f5) - f1)));
                }
                return null;
            }
        }
        else {
            gpvq0 = this;
        }
        gpvq0.f = null;
        return null;
    }

    public final boolean d(icvq icvq0, long v, double f) {
        return this.g(icvq0) < f && this.b() - icvq0.c < v;
    }

    private final double e() {
        long v = this.b() - ((icvq)this.c.get()).c;
        double f = ((ggzv)this.e.get()).d(new ggym(((icvq)this.c.get()).b).H()).c;
        return Math.sqrt(Math.pow(this.g(((icvq)this.c.get())), 2.0) + Math.pow(((double)v) / 60000.0 * this.a.x(), 2.0) + Math.pow(f * 6371.01 * this.a.w(), 2.0));
    }

    private final double f(icvq icvq0) {
        return this.a.ae() ? ((double)(icvq0.d == null ? icvr.a : icvq0.d).d) : ((double)(icvq0.d == null ? icvr.a : icvq0.d).b);
    }

    private final double g(icvq icvq0) {
        return this.a.ae() ? ((double)(icvq0.d == null ? icvr.a : icvq0.d).e) : ((double)(icvq0.d == null ? icvr.a : icvq0.d).c);
    }
}

