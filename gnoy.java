import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class gnoy {
    static {
        try {
            gnoy.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    public static void a() {
        gnat gnat0 = gnat.a;
        gnat0.c(gnpe.a);
        gnat0.b(gnpe.b);
        if(gmuf.a()) {
            return;
        }
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode");
        }
        gnaw gnaw0 = gnaw.a;
        gnaw0.h(gnpj.a);
        gnaw0.g(gnpj.b);
        gnaw0.f(gnpj.c);
        gnaw0.e(gnpj.d);
        gnas gnas0 = gnas.a;
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES128_CTR_HMAC_SHA256_4KB", gnox.a);
        hashMap0.put("AES128_CTR_HMAC_SHA256_1MB", gnox.b);
        hashMap0.put("AES256_CTR_HMAC_SHA256_4KB", gnox.c);
        hashMap0.put("AES256_CTR_HMAC_SHA256_1MB", gnox.d);
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap0));
        gnan gnan0 = gnan.a;
        gnan0.b(gnnz.b, gnoc.class);
        gnat0.b(gnnz.a);
        gnaa gnaa0 = gnaa.a;
        gnaa0.c(gnnz.c, true);
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode");
        }
        gnaw0.h(gnpo.a);
        gnaw0.g(gnpo.b);
        gnaw0.f(gnpo.c);
        gnaw0.e(gnpo.d);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("AES128_GCM_HKDF_4KB", gnox.e);
        hashMap1.put("AES128_GCM_HKDF_1MB", gnox.f);
        hashMap1.put("AES256_GCM_HKDF_4KB", gnox.g);
        hashMap1.put("AES256_GCM_HKDF_1MB", gnox.h);
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap1));
        gnap.a.b(gnok.d, gnon.class);
        gnan0.b(gnok.c, gnon.class);
        gnat0.b(gnok.a);
        gnaa0.c(gnok.b, true);
    }
}

