import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class cjh extends cma {
    private final gra a;
    private final gra b;

    public cjh(Object object0) {
        this.a = new ParcelableSnapshotMutableState(object0, gul.a);
        this.b = new ParcelableSnapshotMutableState(object0, gul.a);
    }

    @Override  // cma
    public final Object a() {
        return this.a.a();
    }

    @Override  // cma
    public final Object b() {
        return this.b.a();
    }

    @Override  // cma
    public final void c(Object object0) {
        this.a.b(object0);
    }

    public final void d(Object object0) {
        this.b.b(object0);
    }

    @Override  // cma
    public final void e(clj clj0) {
    }

    @Override  // cma
    public final void f() {
    }
}

