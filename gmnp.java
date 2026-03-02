import java.io.IOException;
import java.security.GeneralSecurityException;

public final class gmnp {
    public static gmni a(byte[] arr_b) {
        gnic gnic0;
        try {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gnic.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            gnic0 = (gnic)hftv0;
        }
        catch(IOException iOException0) {
            throw new GeneralSecurityException("Failed to parse proto", iOException0);
        }
        gnaw gnaw0 = gnaw.a;
        gnbo gnbo0 = gnbo.a(gnic0);
        gnbw gnbw0 = (gnbw)gnaw0.b.get();
        gnbu gnbu0 = new gnbu(gnbo0.getClass(), gnbo0.a);
        return !gnbw0.d.containsKey(gnbu0) ? new gnaj(gnbo0) : gnaw0.b(gnbo0);
    }

    public static byte[] b(gmni gmni0) {
        return (gmni0 instanceof gnaj) ? ((gnaj)gmni0).a.b.toBytesArray() : ((gnbo)gnaw.a.d(gmni0, gnbo.class)).b.toBytesArray();
    }
}

