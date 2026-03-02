import j..util.Objects;

public class eioh implements eiog {
    final boolean a;
    final boolean b;
    public final eior c;

    public eioh(eior eior0, boolean z, boolean z1) {
        Objects.requireNonNull(eior0);
        this.c = eior0;
        super();
        this.a = z;
        this.b = z1;
    }

    @Override  // eiof
    public final long a() {
        return (long)this.c.c.getVersion();
    }

    @Override  // eiof
    public final eiod b(String s) {
        return this.g(s);
    }

    @Override  // eiog
    public final void close() {
        try {
            this.c.c.endTransaction();
        }
        catch(IllegalStateException illegalStateException0) {
            if(!this.a) {
                throw illegalStateException0;
            }
            if(this.b) {
                String s = illegalStateException0.getMessage();
                if(s == null || !s.contains("re-open") || !s.contains("already-closed")) {
                    throw illegalStateException0;
                }
            }
        }
    }

    @Override  // eiog
    public final eion d(String s, String s1) {
        new eiol(this.c, s1, null, eior.b).d();
        return new eion(this.c, s, true);
    }

    @Override  // eiog
    public void e() {
        this.c.c.setTransactionSuccessful();
    }

    @Override  // eiog
    public final boolean f() {
        return this.a() >= 1001L;
    }

    public final eiod g(String s) {
        return new eiod(this.c, s, null, eior.b);
    }
}

