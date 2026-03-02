import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class cft {
    public final Object a;
    public final gra b;
    public final gra c;

    public cft(Object object0, cfn cfn0) {
        this.a = object0;
        this.b = new ParcelableSnapshotMutableState(cfn0, gul.a);
        this.c = new ParcelableSnapshotMutableState(null, gul.a);
    }

    public final cfk a() {
        cfk cfk0 = (cfk)this.c.a();
        if(cfk0 != null) {
            return cfk0;
        }
        throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
    }

    public final void b() {
        cfn cfn0 = (cfn)this.b.a();
    }
}

