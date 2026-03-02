import j..util.Objects;
import j..util.Optional;

public final class azmt implements azkj {
    private final azks a;
    private final int b;
    private final genu c;
    private final azki d;
    private final long e;
    private final azmc f;

    public azmt(azks azks0, int v, genu genu0, azki azki0, long v1, azmc azmc0) {
        this.a = azks0;
        this.b = v;
        this.c = genu0;
        this.d = azki0;
        this.e = v1;
        this.f = azmc0;
    }

    @Override  // azkj
    public final Optional a(gged_interceptors gged0) {
        long v = azku.a(this.c);
        int v2 = 0;
        for(int v1 = 0; v1 < ((ggna)gged0).c; ++v1) {
            azjt azjt0 = (azjt)gged0.get(v1);
            if(azjt0.d == v) {
                if(azjt0.e.equals(this.d)) {
                    Optional optional0 = this.f.b(azjt0.f);
                    Objects.requireNonNull(azjt0);
                    return optional0.map(new azms(azjt0));
                }
                ++v2;
            }
        }
        if(this.e != 0L && ((long)v2) >= this.e) {
            return Optional.empty();
        }
        azjs azjs0 = azjt.b();
        azjs0.a = this.a;
        azjs0.c(this.b);
        azjs0.e(v);
        azjs0.b = this.d;
        azjs0.b(this.f.a());
        return Optional.of(azjs0.a());
    }
}

