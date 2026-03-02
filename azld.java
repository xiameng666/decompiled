import j..time.Duration;
import j..time.Instant;
import java.security.SecureRandom;

public final class azld {
    public static final bboh a;
    public final gemk b;
    public final azke c;
    public final fgvt d;
    public final azog e;
    public final azlw f;
    public final azjb g;
    public final azlr h;
    public final azod i;
    public final azom j;
    public final SecureRandom k;

    static {
        azld.a = bboh.b("CobaltLoggerImpl", bbcu.fZ);
    }

    public azld(gemk gemk0, azke azke0, fgvt fgvt0, azog azog0, azlw azlw0, azjb azjb0, azlr azlr0, azod azod0, azom azom0, SecureRandom secureRandom0) {
        this.b = gemk0;
        this.c = azke0;
        this.d = fgvt0;
        this.e = azog0;
        this.f = azlw0;
        this.g = azjb0;
        this.h = azlr0;
        this.i = azod0;
        this.j = azom0;
        this.k = secureRandom0;
    }

    public static final ggeo a(geml geml0, genf genf0) {
        ggek ggek0 = new ggek();
        azkp azkp0 = new azkp(geml0.b, genf0.b);
        for(Object object0: genf0.c) {
            gena gena0 = (gena)object0;
            for(Object object1: gena0.h) {
                ggek0.i(new azks(azkp0, gena0.b, ((genm)object1).e), Integer.valueOf(0));
            }
        }
        return ggek0.b();
    }

    public static final ggeo b(geml geml0, genf genf0, Instant instant0, Instant instant1) {
        return Duration.between(instant1, instant0).compareTo(hfyg.c(hrcb.a.c().c())) <= 0 ? azld.a(geml0, genf0) : ggnf.a;
    }
}

