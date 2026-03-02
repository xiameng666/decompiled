import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class cit implements gui {
    public Object a;
    public Object b;
    public chl c;
    public ckv d;
    public boolean e;
    public boolean f;
    public long g;
    final ciy h;
    public final cmc i;
    private final gra j;

    public cit(ciy ciy0, Object object0, Object object1, cmc cmc0, chl chl0) {
        this.h = ciy0;
        super();
        this.a = object0;
        this.b = object1;
        this.i = cmc0;
        this.j = new ParcelableSnapshotMutableState(object0, gul.a);
        this.c = chl0;
        this.d = new ckv(this.c, cmc0, this.a, this.b);
    }

    @Override  // gui
    public final Object a() {
        return this.j.a();
    }

    public final void b(Object object0) {
        this.j.b(object0);
    }
}

