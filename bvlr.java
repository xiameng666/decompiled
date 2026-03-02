import java.util.ArrayList;
import java.util.List;

final class bvlr {
    public final List a;
    final bvls b;
    private int c;

    public bvlr(bvls bvls0) {
        this.b = bvls0;
        super();
        this.a = new ArrayList();
    }

    public final void a(buyi buyi0, int v, List list0) {
        ibuq.f(buyi0, "id");
        ibuq.f(list0, "items");
        ibns ibns0 = new ibns(new bvlo(buyi0, this.b.g.b(v), this.c), list0);
        this.a.add(ibns0);
        ++this.c;
    }
}

