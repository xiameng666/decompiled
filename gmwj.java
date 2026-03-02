import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class gmwj {
    static {
        try {
            gmwj.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    public static void a() {
        gnat gnat0 = gnat.a;
        gnat0.c(gmwz.a);
        gnat0.b(gmwz.b);
        gnat0.c(gmxd.a);
        gnat0.b(gmxd.b);
        gmnr.a();
        gmuq.a();
        if(gmuf.a()) {
            return;
        }
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
        }
        gnaw gnaw0 = gnaw.a;
        gnaw0.h(gmxy.a);
        gnaw0.g(gmxy.b);
        gnaw0.f(gmxy.c);
        gnaw0.e(gmxy.d);
        gnaw0.f(gmxy.e);
        gnaw0.e(gmxy.f);
        gnas gnas0 = gnas.a;
        HashMap hashMap0 = new HashMap();
        gmvm gmvm0 = new gmvm();
        gmvm0.a = gmvn.a;
        gmvm0.b = gmvo.c;
        gmvm0.c = gmvp.b;
        gmvm0.d = gmvq.a;
        gmpk gmpk0 = new gmpk();
        gmpk0.b();
        gmpk0.c(16);
        gmpk0.d();
        gmpk0.a = gmpl.c;
        gmvm0.b(gmpk0.a());
        hashMap0.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", gmvm0.a());
        gmvm gmvm1 = new gmvm();
        gmvm1.a = gmvn.a;
        gmvm1.b = gmvo.c;
        gmvm1.c = gmvp.b;
        gmvm1.d = gmvq.c;
        gmpk gmpk1 = new gmpk();
        gmpk1.b();
        gmpk1.c(16);
        gmpk1.d();
        gmpk1.a = gmpl.c;
        gmvm1.b(gmpk1.a());
        hashMap0.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", gmvm1.a());
        gmvm gmvm2 = new gmvm();
        gmvm2.a = gmvn.a;
        gmvm2.b = gmvo.c;
        gmvm2.c = gmvp.a;
        gmvm2.d = gmvq.a;
        gmpk gmpk2 = new gmpk();
        gmpk2.b();
        gmpk2.c(16);
        gmpk2.d();
        gmpk2.a = gmpl.c;
        gmvm2.b(gmpk2.a());
        hashMap0.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", gmvm2.a());
        gmvm gmvm3 = new gmvm();
        gmvm3.a = gmvn.a;
        gmvm3.b = gmvo.c;
        gmvm3.c = gmvp.a;
        gmvm3.d = gmvq.c;
        gmpk gmpk3 = new gmpk();
        gmpk3.b();
        gmpk3.c(16);
        gmpk3.d();
        gmpk3.a = gmpl.c;
        gmvm3.b(gmpk3.a());
        hashMap0.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", gmvm3.a());
        gmvm gmvm4 = new gmvm();
        gmvm4.a = gmvn.a;
        gmvm4.b = gmvo.c;
        gmvm4.c = gmvp.a;
        gmvm4.d = gmvq.c;
        gmpk gmpk4 = new gmpk();
        gmpk4.b();
        gmpk4.c(16);
        gmpk4.d();
        gmpk4.a = gmpl.c;
        gmvm4.b(gmpk4.a());
        hashMap0.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", gmvm4.a());
        gmvm gmvm5 = new gmvm();
        gmvm5.a = gmvn.a;
        gmvm5.b = gmvo.c;
        gmvm5.c = gmvp.b;
        gmvm5.d = gmvq.a;
        gmon gmon0 = new gmon();
        gmon0.b(16);
        gmon0.c(0x20);
        gmon0.e(16);
        gmon0.d(16);
        gmon0.a = gmoo.c;
        gmon0.b = gmop.c;
        gmvm5.b(gmon0.a());
        hashMap0.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", gmvm5.a());
        gmvm gmvm6 = new gmvm();
        gmvm6.a = gmvn.a;
        gmvm6.b = gmvo.c;
        gmvm6.c = gmvp.b;
        gmvm6.d = gmvq.c;
        gmon gmon1 = new gmon();
        gmon1.b(16);
        gmon1.c(0x20);
        gmon1.e(16);
        gmon1.d(16);
        gmon1.a = gmoo.c;
        gmon1.b = gmop.c;
        gmvm6.b(gmon1.a());
        hashMap0.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", gmvm6.a());
        gmvm gmvm7 = new gmvm();
        gmvm7.a = gmvn.a;
        gmvm7.b = gmvo.c;
        gmvm7.c = gmvp.a;
        gmvm7.d = gmvq.a;
        gmon gmon2 = new gmon();
        gmon2.b(16);
        gmon2.c(0x20);
        gmon2.e(16);
        gmon2.d(16);
        gmon2.a = gmoo.c;
        gmon2.b = gmop.c;
        gmvm7.b(gmon2.a());
        hashMap0.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", gmvm7.a());
        gmvm gmvm8 = new gmvm();
        gmvm8.a = gmvn.a;
        gmvm8.b = gmvo.c;
        gmvm8.c = gmvp.a;
        gmvm8.d = gmvq.c;
        gmon gmon3 = new gmon();
        gmon3.b(16);
        gmon3.c(0x20);
        gmon3.e(16);
        gmon3.d(16);
        gmon3.a = gmoo.c;
        gmon3.b = gmop.c;
        gmvm8.b(gmon3.a());
        hashMap0.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", gmvm8.a());
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap0));
        gnat0.b(gmvk.a);
        gnat0.b(gmvk.b);
        gnan gnan0 = gnan.a;
        gnan0.b(gmvk.d, gmvr.class);
        gnaa gnaa0 = gnaa.a;
        gnaa0.c(gmvk.e, true);
        gnaa0.c(gmvk.c, false);
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
        }
        gnaw0.h(gmwh.a);
        gnaw0.g(gmwh.b);
        gnaw0.f(gmwh.c);
        gnaw0.e(gmwh.d);
        gnaw0.f(gmwh.e);
        gnaw0.e(gmwh.f);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", new gmvz(gmvx.f, gmvw.a, gmvu.a, gmvy.a));
        hashMap1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", new gmvz(gmvx.f, gmvw.a, gmvu.a, gmvy.c));
        hashMap1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", new gmvz(gmvx.f, gmvw.a, gmvu.b, gmvy.a));
        hashMap1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", new gmvz(gmvx.f, gmvw.a, gmvu.b, gmvy.c));
        hashMap1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", new gmvz(gmvx.f, gmvw.a, gmvu.c, gmvy.a));
        hashMap1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", new gmvz(gmvx.f, gmvw.a, gmvu.c, gmvy.c));
        hashMap1.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", new gmvz(gmvx.a, gmvw.a, gmvu.a, gmvy.a));
        hashMap1.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", new gmvz(gmvx.a, gmvw.a, gmvu.a, gmvy.c));
        hashMap1.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", new gmvz(gmvx.a, gmvw.a, gmvu.b, gmvy.a));
        hashMap1.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", new gmvz(gmvx.a, gmvw.a, gmvu.b, gmvy.c));
        hashMap1.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", new gmvz(gmvx.b, gmvw.b, gmvu.a, gmvy.a));
        hashMap1.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", new gmvz(gmvx.b, gmvw.b, gmvu.a, gmvy.c));
        hashMap1.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", new gmvz(gmvx.b, gmvw.b, gmvu.b, gmvy.a));
        hashMap1.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", new gmvz(gmvx.b, gmvw.b, gmvu.b, gmvy.c));
        hashMap1.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", new gmvz(gmvx.c, gmvw.c, gmvu.a, gmvy.a));
        hashMap1.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", new gmvz(gmvx.c, gmvw.c, gmvu.a, gmvy.c));
        hashMap1.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", new gmvz(gmvx.c, gmvw.c, gmvu.b, gmvy.a));
        hashMap1.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", new gmvz(gmvx.c, gmvw.c, gmvu.b, gmvy.c));
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap1));
        gnat0.b(gmyn.a);
        gnat0.b(gmyn.b);
        gnan0.b(gmyn.d, gmvz.class);
        gnaa0.c(gmyn.e, true);
        gnaa0.c(gmyn.c, false);
    }
}

