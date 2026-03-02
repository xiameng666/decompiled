import android.os.PersistableBundle;

public final class ryj implements roo, scz {
    public static final ryi a;
    public final roo b;
    public final PersistableBundle d;

    static {
        ryj.a = new ryi();
    }

    public ryj(roo roo0, PersistableBundle persistableBundle0) {
        this.b = roo0;
        this.d = persistableBundle0;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = rom.g(this.b);
        persistableBundle0.putPersistableBundle("INPUT", this.d);
        return persistableBundle0;
    }

    @Override  // rof
    public final String fa() {
        return ((ron)this.b).a;
    }

    @Override  // roo
    public final String fb() {
        return ((ron)this.b).b;
    }

    @Override  // rof
    public final roe fi() {
        return new roe(this.b);
    }

    @Override  // rof
    public final String l() {
        return roc.a(this.b);
    }

    @Override  // roo
    public final String m() {
        return rol.a(this.b);
    }

    @Override  // roo
    public final ron o() {
        return (ron)this.b;
    }
}

