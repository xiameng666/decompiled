import java.security.GeneralSecurityException;

public final class gmuu implements gnbg {
    @Override  // gnbg
    public final Object a(gmmp gmmp0) {
        gmml gmml0 = (gmml)gnaa.a.a(((gnai)gmmp0).a.a, gmml.class).c(((gnai)gmmp0).a.c);
        gnim gnim0 = ((gnai)gmmp0).a.d;
        switch(gnim0.ordinal()) {
            case 1: {
                return new gmvf(gmml0, gnim0, gnax.b(((gnai)gmmp0).b().intValue()).c());
            }
            case 3: {
                return new gmvf(gmml0, gnim0, gnax.a.c());
            }
            case 2: 
            case 4: {
                return new gmvf(gmml0, gnim0, gnax.a(((gnai)gmmp0).b().intValue()).c());
            }
            default: {
                throw new GeneralSecurityException(dlbc.f(gnim0, "unknown output prefix type "));
            }
        }
    }
}

