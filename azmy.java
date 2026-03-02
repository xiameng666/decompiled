import j..util.Objects;
import j..util.Optional;

public final class azmy implements azkj {
    private final azks a;
    private final int b;
    private final genu c;
    private final azki d;
    private final long e;
    private final azmc f;

    public azmy(azks azks0, int v, genu genu0, azki azki0, long v1, azmc azmc0) {
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
        int v1 = 0;
        while(true) {
            int v2 = ((ggna)gged0).c;
            if(v1 >= v2) {
                break;
            }
            azjt azjt0 = (azjt)gged0.get(v1);
            ++v1;
            if(azjt0.e.equals(this.d)) {
                Optional optional0 = this.f.b(azjt0.f);
                if(azjt0.d == v) {
                    Objects.requireNonNull(azjt0);
                    return optional0.map(new azmw(azjt0));
                }
                azjs azjs0 = new azjs(azjt0);
                azjs0.e(v);
                Objects.requireNonNull(azjs0);
                optional0.ifPresent(new azmx(azjs0));
                return Optional.of(azjs0.a());
            }
        }
        if(this.e != 0L && ((long)v2) >= this.e) {
            return Optional.empty();
        }
        azjs azjs1 = azjt.b();
        azjs1.a = this.a;
        azjs1.c(this.b);
        azjs1.e(v);
        azjs1.b = this.d;
        azjs1.b(this.f.a());
        return Optional.of(azjs1.a());
    }
}

