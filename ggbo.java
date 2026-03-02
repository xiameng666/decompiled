import j..util.Objects;
import java.util.AbstractMap.SimpleImmutableEntry;

final class ggbo extends gfxn {
    final ggbp a;
    private int b;
    private final int c;

    public ggbo(ggbp ggbp0) {
        Objects.requireNonNull(ggbp0);
        this.a = ggbp0;
        super();
        this.b = -1;
        this.c = ((ggnf)ggbp0.a()).d;
    }

    @Override  // gfxn
    protected final Object a() {
        ++this.b;
        int v;
        while((v = this.b) < this.c) {
            ggbp ggbp0 = this.a;
            Object object0 = ggbp0.b(v);
            if(object0 != null) {
                int v1 = this.b;
                return new AbstractMap.SimpleImmutableEntry(ggbp0.a().w().v().get(v1), object0);
            }
            ++this.b;
        }
        this.c();
        return null;
    }
}

