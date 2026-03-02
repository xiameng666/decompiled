import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class hud {
    public final gra a;

    public hud(int v) {
        this.a = new ParcelableSnapshotMutableState(new huc(v), gul.a);
    }

    public final void a(int v) {
        huc huc0 = new huc(v);
        this.a.b(huc0);
    }
}

