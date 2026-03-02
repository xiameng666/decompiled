import java.util.Locale;
import javax.crypto.SecretKey;

public final class atnl {
    public static final gged_interceptors a(atgx atgx0, SecretKey secretKey0) {
        int v = atgx0.a;
        switch(v) {
            case 0: 
            case 1: {
                return gged_interceptors.l(new atnr(secretKey0));
            }
            case 2: {
                ggdy ggdy0 = new ggdy();
                if(atgx0.b.i() && atgx0.b.d() == aram.c) {
                    ggdy0.i(atno.a);
                }
                ggdy0.i(new atnr(secretKey0));
                return ggdy0.h();
            }
            default: {
                throw new IllegalArgumentException(String.format(Locale.US, "invalid code level: %d", v));
            }
        }
    }
}

