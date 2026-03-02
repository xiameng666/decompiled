import android.os.BaseBundle;
import j..time.Duration;
import j..util.Objects;

public abstract class rsp implements rnc, rnd, rrh {
    public void fc(Object object0) {
    }

    @Override  // rof
    public final roe fi() {
        return new roe(this);
    }

    @Override  // rof
    public final String l() {
        return roc.a(this);
    }

    @Override  // roo
    public final String m() {
        return rol.a(this);
    }

    @Override  // roo
    public final ron o() {
        return new ron(this);
    }

    @Override  // rrg
    public final String r() {
        return rrf.a(this);
    }

    @Override  // rrg
    public final int s() {
        return rrf.b();
    }

    @Override  // rrh
    public final int t(Object object0) {
        return Objects.hash(new Object[]{rop.a(this), sco.d(((BaseBundle)this.p().fm(object0)))});
    }

    public abstract Duration u();

    public abstract boolean v(rkc arg1);
}

