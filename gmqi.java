import java.security.GeneralSecurityException;

public final class gmqi implements gnbg {
    @Override  // gnbg
    public final Object a(gmmp gmmp0) {
        gmni gmni0 = ((gmqs)gmmp0).a.c;
        gmmg gmmg0 = gmng.a(((gmqs)gmmp0).a.b).a(((gmqs)gmmp0).a.b);
        try {
            byte[] arr_b = gmnp.b(gmni0);
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gnic.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return gmtm.c(new gmqg(((gnic)hftv0), gmmg0), ((gmqs)gmmp0).b);
        }
        catch(hfur hfur0) {
            throw new GeneralSecurityException(hfur0);
        }
    }
}

