import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class chn implements gui {
    public cht a;
    public long b;
    public long c;
    public boolean d;
    public final cmc e;
    private final gra f;

    public chn(cmc cmc0, Object object0, cht cht0, int v) {
        if((v & 4) != 0) {
            cht0 = null;
        }
        this(cmc0, object0, cht0, 0x8000000000000000L, 0x8000000000000000L, false);
    }

    public chn(cmc cmc0, Object object0, cht cht0, long v, long v1, boolean z) {
        this.e = cmc0;
        this.f = new ParcelableSnapshotMutableState(object0, gul.a);
        this.a = cht0 == null ? cho.a(cmc0, object0) : chu.a(cht0);
        this.b = v;
        this.c = v1;
        this.d = z;
    }

    @Override  // gui
    public final Object a() {
        return this.f.a();
    }

    public final Object b() {
        return this.e.b.a(this.a);
    }

    public final void c(Object object0) {
        this.f.b(object0);
    }

    @Override
    public final String toString() {
        return "AnimationState(value=" + this.a() + ", velocity=" + this.b() + ", isRunning=" + this.d + ", lastFrameTimeNanos=" + this.b + ", finishedTimeNanos=" + this.c + ')';
    }
}

