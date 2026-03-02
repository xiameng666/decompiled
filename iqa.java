import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

final class iqa implements hff {
    private final gtj a;

    public iqa() {
        this.a = new ParcelableSnapshotMutableFloatState(1.0f);
    }

    @Override  // hff
    public final float a() {
        return this.a.e();
    }

    public final void b(float f) {
        this.a.h(f);
    }

    @Override  // ibrt
    public final Object fold(Object object0, ibtw ibtw0) {
        return ibrq.a(this, object0, ibtw0);
    }

    @Override  // ibrr
    public final ibrr get(ibrs ibrs0) {
        return ibrq.b(this, ibrs0);
    }

    @Override  // ibrr
    public final ibrs getKey() {
        return hff.b;
    }

    @Override  // ibrt
    public final ibrt minusKey(ibrs ibrs0) {
        return ibrq.c(this, ibrs0);
    }

    @Override  // ibrt
    public final ibrt plus(ibrt ibrt0) {
        return ibrq.d(this, ibrt0);
    }
}

