import com.google.android.gms.signin.activity.SignInChimeraActivity;
import j..util.Objects;

public final class epsv implements gmbg {
    final long a;
    final SignInChimeraActivity b;

    public epsv(SignInChimeraActivity signInChimeraActivity0, long v) {
        this.a = v;
        Objects.requireNonNull(signInChimeraActivity0);
        this.b = signInChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.b.g(this.a, this.b.l, false);
        this.b.a(0, null);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        SignInChimeraActivity signInChimeraActivity0 = this.b;
        signInChimeraActivity0.g(this.a, signInChimeraActivity0.l, true);
        if(((gfsx)object0).i()) {
            signInChimeraActivity0.l = (int)(((Integer)((gfsx)object0).d()));
            signInChimeraActivity0.l();
        }
    }
}

