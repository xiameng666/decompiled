import java.security.GeneralSecurityException;

public final class gnck implements gnam {
    @Override  // gnam
    public final gmmp a(gmni gmni0, Integer integer0) {
        gnfm gnfm0 = ((gnce)gmni0).a;
        gmmp gmmp0 = gnan.a.a(gnfm0, null);
        if((gmmp0 instanceof gnfl)) {
            return gncd.c(((gnce)gmni0), ((gnfl)gmmp0), integer0);
        }
        throw new GeneralSecurityException("Failed to create PrfKey from parameters" + gnfm0.toString() + ", instead got " + gmmp0.getClass());
    }
}

