import java.util.Map;

public final class hlzu implements hlyb {
    private final hlzp a;

    public hlzu() {
        this.a = new hlzp();
    }

    @Override  // hlyb
    public final hlym a(String s, hlxv hlxv0, int v, int v1, Map map0) {
        if(hlxv0 == hlxv.o) {
            return this.a.a("0" + s, hlxv.h, 0, 0, map0);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got " + hlxv0.toString());
    }
}

