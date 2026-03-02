import j..util.Objects;
import java.util.List;

public final class bul implements bpa {
    public final bun a;
    public final List b;

    public bul(bun bun0, List list0) {
        this.a = bun0;
        this.b = list0;
    }

    @Override  // bpa
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        int v = (int)(((Integer)Objects.requireNonNull(((Integer)((bjo)this.b.get(0)).e.m(bjo.b, Integer.valueOf(100))))));
        int v1 = (int)(((Integer)Objects.requireNonNull(((Integer)((bjo)this.b.get(0)).e.m(bjo.a, Integer.valueOf(0))))));
        btd btd0 = this.a.a.a.b;
        return btd0 != null ? bpt.d(jqy.a(new bro(((bsb)btd0.a), v, v1))) : new bpu(new Exception("Failed to take picture: pipeline is not ready."));
    }
}

