import java.security.GeneralSecurityException;

public final class gmww implements gnbg {
    @Override  // gnbg
    public final Object a(gmmp gmmp0) {
        gmmm gmmm0 = (gmmm)gnaa.a.a(((gnai)gmmp0).a.a, gmmm.class).c(((gnai)gmmp0).a.c);
        gnim gnim0 = ((gnai)gmmp0).a.d;
        switch(gnim0.ordinal()) {
            case 1: {
                return new gmyp(gmmm0, gnax.b(((gnai)gmmp0).b().intValue()).c());
            }
            case 3: {
                return new gmyp(gmmm0, gnax.a.c());
            }
            case 2: 
            case 4: {
                return new gmyp(gmmm0, gnax.a(((gnai)gmmp0).b().intValue()).c());
            }
            default: {
                throw new GeneralSecurityException("unknown output prefix type " + gnim0);
            }
        }
    }
}

