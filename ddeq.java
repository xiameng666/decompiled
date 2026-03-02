import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class ddeq implements ibth {
    public final String a;

    public ddeq(String s) {
        this.a = s;
    }

    @Override  // ibth
    public final Object a() {
        int v = this.a.length();
        long v1 = jbl.a(v, v);
        return new ParcelableSnapshotMutableState(new jhk(this.a, v1, 4), gul.a);
    }
}

