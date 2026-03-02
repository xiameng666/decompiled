import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class clb {
    final clj a;
    private final gra b;
    private final cmc c;

    public clb(clj clj0, cmc cmc0) {
        this.a = clj0;
        super();
        this.c = cmc0;
        this.b = new ParcelableSnapshotMutableState(null, gul.a);
    }

    public final cla a() {
        return (cla)this.b.a();
    }

    public final gui b(ibts ibts0, ibts ibts1) {
        gui gui0 = this.a();
        if(gui0 == null) {
            Object object0 = ibts1.a(this.a.f());
            Object object1 = ibts1.a(this.a.f());
            cht cht0 = cho.a(this.c, object1);
            cla cla0 = new cla(this, new clf(this.a, object0, cht0, this.c), ibts0, ibts1);
            this.b.b(cla0);
            this.a.A(cla0.a);
            gui0 = cla0;
        }
        gui0.c = ibts1;
        gui0.b = ibts0;
        ((cla)gui0).b(this.a.e());
        return gui0;
    }
}

