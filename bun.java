import java.util.Collections;
import java.util.List;

public final class bun extends bkg {
    public final buc a;

    public bun(bih bih0, buc buc0) {
        super(bih0);
        this.a = buc0;
    }

    @Override  // bkg
    public final gmcd f(List list0, int v, int v1) {
        kay.b(list0.size() == 1, "Only support one capture config.");
        gmcd gmcd0 = this.B(v);
        return bpt.a(Collections.singletonList(bpt.g(bpt.g(bpt.g(bpf.a(gmcd0), new buk(gmcd0), bol.a()), new bul(this, list0), bol.a()), new bum(gmcd0), bol.a())));
    }
}

