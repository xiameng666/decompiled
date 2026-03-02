import java.security.GeneralSecurityException;

public final class gnds implements gnbg {
    @Override  // gnbg
    public final Object a(gmmp gmmp0) {
        gmnh gmnh0 = (gmnh)gnaa.a.a(((gnai)gmmp0).a.a, gmnh.class).c(((gnai)gmmp0).a.c);
        gnim gnim0 = ((gnai)gmmp0).a.d;
        switch(gnim0.ordinal()) {
            case 1: {
                return new gneq(gmnh0, gnim0, gnax.b(((gnai)gmmp0).b().intValue()).c());
            }
            case 3: {
                return new gneq(gmnh0, gnim0, gnax.a.c());
            }
            case 2: 
            case 4: {
                return new gneq(gmnh0, gnim0, gnax.a(((gnai)gmmp0).b().intValue()).c());
            }
            default: {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
    }
}

