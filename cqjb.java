import j..time.Duration;
import j..time.Instant;

public final class cqjb implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if((((elhq)object0).b & 8) != 0) {
            elhp elhp0 = ((elhq)object0).e;
            if(elhp0 == null) {
                elhp0 = elhp.a;
            }
            return Duration.between(hfyg.d((elhp0.c == null ? hfwn.a : elhp0.c)), Instant.now()).compareTo(hfyg.c(hxwm.a.d().b())) < 0 ? gged_interceptors.i(elhp0.d) : ggna.a;
        }
        return ggna.a;
    }
}

