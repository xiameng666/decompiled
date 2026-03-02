import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class cao implements gqa {
    final SnapshotStateList a;
    final Object b;
    final cbm c;

    public cao(SnapshotStateList snapshotStateList0, Object object0, cbm cbm0) {
        this.a = snapshotStateList0;
        this.b = object0;
        this.c = cbm0;
        super();
    }

    @Override  // gqa
    public final void a() {
        this.a.remove(this.b);
        this.c.f.h(this.b);
    }
}

