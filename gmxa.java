import java.security.GeneralSecurityException;

public final class gmxa implements gnbg {
    @Override  // gnbg
    public final Object a(gmmp gmmp0) {
        gmmn gmmn0 = (gmmn)gnaa.a.a(((gnai)gmmp0).a.a, gmmn.class).c(((gnai)gmmp0).a.c);
        gnim gnim0 = ((gnai)gmmp0).a.d;
        switch(gnim0.ordinal()) {
            case 1: {
                return new gmyq(gmmn0, gnax.b(((gnai)gmmp0).b().intValue()).c());
            }
            case 3: {
                return new gmyq(gmmn0, gnax.a.c());
            }
            case 2: 
            case 4: {
                return new gmyq(gmmn0, gnax.a(((gnai)gmmp0).b().intValue()).c());
            }
            default: {
                throw new GeneralSecurityException("unknown output prefix type " + gnim0);
            }
        }
    }
}

