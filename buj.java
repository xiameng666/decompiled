import android.hardware.camera2.CaptureResult;

public final class buj implements bhv {
    private final bhv a;
    private final bms b;
    private final long c;

    public buj(bhv bhv0, bms bms0, long v) {
        this.a = bhv0;
        this.b = bms0;
        this.c = v;
    }

    @Override  // bhv
    public final long a() {
        bhv bhv0 = this.a;
        if(bhv0 != null) {
            return bhv0.a();
        }
        long v = this.c;
        if(v != -1L) {
            return v;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override  // bhv
    public final CaptureResult b() {
        return null;
    }

    @Override  // bhv
    public final bhq c() {
        return this.a == null ? bhq.a : this.a.c();
    }

    @Override  // bhv
    public final bhr d() {
        return this.a == null ? bhr.a : this.a.d();
    }

    @Override  // bhv
    public final bhs e() {
        return this.a == null ? bhs.a : this.a.e();
    }

    @Override  // bhv
    public final bms f() {
        return this.b;
    }

    @Override  // bhv
    public final void g(bnw bnw0) {
        bht.a(this, bnw0);
    }

    @Override  // bhv
    public final int h() {
        throw null;
    }

    @Override  // bhv
    public final int i() {
        return this.a == null ? 1 : this.a.i();
    }
}

