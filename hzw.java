import androidx.compose.runtime.ParcelableSnapshotMutableState;

final class hzw {
    public Object a;
    public ibtw b;
    public boolean c;
    public boolean d;
    public gra e;
    public boolean f;
    public gpj g;
    public grr h;
    public final bxt i;

    public hzw(Object object0, ibtw ibtw0) {
        this.a = object0;
        this.b = ibtw0;
        this.g = null;
        this.e = new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a);
        this.i = new bxt(null);
    }

    public final void a(int v) {
        bxt bxt0 = this.i;
        bxt0.g(v);
        if(bxt0.b >= 50) {
            bxt0.f(0, 10);
        }
    }

    public final boolean b() {
        return ((Boolean)this.e.a()).booleanValue();
    }
}

