import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import j..util.Objects;

public final class eprv implements gmbg {
    final long a;
    final ConsentChimeraActivity b;

    public eprv(ConsentChimeraActivity consentChimeraActivity0, long v) {
        this.a = v;
        Objects.requireNonNull(consentChimeraActivity0);
        this.b = consentChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ConsentChimeraActivity.p(new epru(this, throwable0));
        this.b.m(this.a, this.b.r, false);
        this.b.a(4, "");
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ConsentChimeraActivity consentChimeraActivity0 = this.b;
        consentChimeraActivity0.m(this.a, consentChimeraActivity0.r, true);
        int v = consentChimeraActivity0.r;
        if(((gfsx)object0).i()) {
            consentChimeraActivity0.r = (int)(((Integer)((gfsx)object0).d()));
            ConsentChimeraActivity.p(new eprs(this, v));
            consentChimeraActivity0.o();
            return;
        }
        ConsentChimeraActivity.p(new eprt(v));
    }
}

