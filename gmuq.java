import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class gmuq {
    static {
        try {
            gmuq.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    public static void a() {
        gnat gnat0 = gnat.a;
        gnat0.c(gmux.a);
        gnat0.b(gmux.b);
        if(gmuf.a()) {
            return;
        }
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        gnaw.a.h(gmve.a);
        gnaw.a.g(gmve.b);
        gnaw.a.f(gmve.c);
        gnaw.a.e(gmve.d);
        gnat0.b(gmum.a);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES256_SIV", gmuz.a);
        gmun gmun0 = new gmun();
        gmun0.b(0x40);
        gmun0.a = gmuo.c;
        hashMap0.put("AES256_SIV_RAW", gmun0.a());
        Map map0 = DesugarCollections.unmodifiableMap(hashMap0);
        gnas.a.c(map0);
        gnap.a.b(gmum.c, gmup.class);
        gnan.a.b(gmum.d, gmup.class);
        gnaa.a.c(gmum.b, true);
    }
}

