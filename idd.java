import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class idd {
    public final ibt a;
    public final ibt b;
    public long c;
    public long d;
    public long e;
    public long f;
    private final gra g;
    private final gra h;
    private final gtj i;
    private final gtn j;
    private final gtj k;

    public idd(String s) {
        this.g = new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a);
        this.h = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
        this.i = new ParcelableSnapshotMutableFloatState(0.0f);
        this.j = new ParcelableSnapshotMutableLongState(0L);
        this.k = new ParcelableSnapshotMutableFloatState(1.0f);
        this.a = new ibu(s + " source");
        this.b = new ibu(s + " target");
        this.c = -1L;
        this.d = -1L;
        this.e = -1L;
        this.f = -1L;
    }

    public final void a(float f) {
        this.k.h(f);
    }

    public final void b(boolean z) {
        this.h.b(Boolean.valueOf(z));
    }

    public final void c(long v) {
        this.j.h(v);
    }

    public final void d(float f) {
        this.i.h(f);
    }

    public final void e(boolean z) {
        this.g.b(Boolean.valueOf(z));
    }

    public final boolean f() {
        return ((Boolean)this.h.a()).booleanValue();
    }
}

