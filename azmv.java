import j..util.Objects;
import j..util.Optional;

public final class azmv implements azkj {
    private final azks a;
    private final int b;
    private final genu c;
    private final azki d;
    private final long e;
    private final azmc f;

    public azmv(azks azks0, int v, genu genu0, azki azki0, long v1, azmc azmc0) {
        this.a = azks0;
        this.b = v;
        this.c = genu0;
        this.d = azki0;
        this.e = v1;
        this.f = azmc0;
    }

    @Override  // azkj
    public final Optional a(gged_interceptors gged0) {
        int v = 0;
        while(true) {
            int v1 = ((ggna)gged0).c;
            if(v >= v1) {
                break;
            }
            azjt azjt0 = (azjt)gged0.get(v);
            ++v;
            if(azjt0.e.equals(this.d)) {
                Optional optional0 = this.f.b(azjt0.f);
                Objects.requireNonNull(azjt0);
                return optional0.map(new azmu(azjt0));
            }
        }
        if(this.e != 0L && ((long)v1) >= this.e) {
            return Optional.empty();
        }
        azjs azjs0 = azjt.b();
        azjs0.a = this.a;
        azjs0.c(this.b);
        azjs0.e(azku.a(this.c));
        azjs0.b = this.d;
        azjs0.b(this.f.a());
        return Optional.of(azjs0.a());
    }
}

