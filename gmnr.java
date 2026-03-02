import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class gmnr {
    static {
        try {
            gmnr.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    public static void a() {
        gnat gnat0 = gnat.a;
        gnat0.c(gmoe.a);
        gnat0.b(gmoe.b);
        gndp.a();
        int v = gmom.e;
        if(!gmue.a(v)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        gnaw gnaw0 = gnaw.a;
        gnaw0.h(gmsd.a);
        gnaw0.g(gmsd.b);
        gnaw0.f(gmsd.c);
        gnaw0.e(gmsd.d);
        gnat0.b(gmom.a);
        gnas gnas0 = gnas.a;
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES128_CTR_HMAC_SHA256", gmrk.e);
        gmon gmon0 = new gmon();
        gmon0.b(16);
        gmon0.c(0x20);
        gmon0.e(16);
        gmon0.d(16);
        gmon0.a = gmoo.c;
        gmon0.b = gmop.c;
        hashMap0.put("AES128_CTR_HMAC_SHA256_RAW", gmon0.a());
        hashMap0.put("AES256_CTR_HMAC_SHA256", gmrk.f);
        gmon gmon1 = new gmon();
        gmon1.b(0x20);
        gmon1.c(0x20);
        gmon1.e(0x20);
        gmon1.d(16);
        gmon1.a = gmoo.c;
        gmon1.b = gmop.c;
        hashMap0.put("AES256_CTR_HMAC_SHA256_RAW", gmon1.a());
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap0));
        gnap gnap0 = gnap.a;
        gnap0.b(gmom.c, gmoq.class);
        gnan gnan0 = gnan.a;
        gnan0.b(gmom.d, gmoq.class);
        gnaa gnaa0 = gnaa.a;
        gnaa0.d(gmom.b, v, true);
        int v1 = gmpj.e;
        if(!gmue.a(v1)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        gnaw0.h(gmsp.a);
        gnaw0.g(gmsp.b);
        gnaw0.f(gmsp.c);
        gnaw0.e(gmsp.d);
        gnat0.b(gmpj.a);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("AES128_GCM", gmrk.a);
        gmpk gmpk0 = new gmpk();
        gmpk0.b();
        gmpk0.c(16);
        gmpk0.d();
        gmpk0.a = gmpl.c;
        hashMap1.put("AES128_GCM_RAW", gmpk0.a());
        hashMap1.put("AES256_GCM", gmrk.b);
        gmpk gmpk1 = new gmpk();
        gmpk1.b();
        gmpk1.c(0x20);
        gmpk1.d();
        gmpk1.a = gmpl.c;
        hashMap1.put("AES256_GCM_RAW", gmpk1.a());
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap1));
        gnap0.b(gmpj.c, gmpm.class);
        gnan0.b(gmpj.d, gmpm.class);
        gnaa0.d(gmpj.b, v1, true);
        if(gmuf.a()) {
            return;
        }
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        gnaw0.h(gmsi.a);
        gnaw0.g(gmsi.b);
        gnaw0.f(gmsi.c);
        gnaw0.e(gmsi.d);
        gnat0.b(gmox.a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("AES128_EAX", gmrk.c);
        gmoy gmoy0 = new gmoy();
        gmoy0.b(16);
        gmoy0.c(16);
        gmoy0.d();
        gmoy0.a = gmoz.c;
        hashMap2.put("AES128_EAX_RAW", gmoy0.a());
        hashMap2.put("AES256_EAX", gmrk.d);
        gmoy gmoy1 = new gmoy();
        gmoy1.b(16);
        gmoy1.c(0x20);
        gmoy1.d();
        gmoy1.a = gmoz.c;
        hashMap2.put("AES256_EAX_RAW", gmoy1.a());
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap2));
        gnan0.b(gmox.c, gmpa.class);
        gnaa0.c(gmox.b, true);
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        gnaw0.h(gmsv.a);
        gnaw0.g(gmsv.b);
        gnaw0.f(gmsv.c);
        gnaw0.e(gmsv.d);
        HashMap hashMap3 = new HashMap();
        gmpt gmpt0 = new gmpt();
        gmpt0.b(16);
        gmpt0.a = gmpu.a;
        hashMap3.put("AES128_GCM_SIV", gmpt0.a());
        gmpt gmpt1 = new gmpt();
        gmpt1.b(16);
        gmpt1.a = gmpu.c;
        hashMap3.put("AES128_GCM_SIV_RAW", gmpt1.a());
        gmpt gmpt2 = new gmpt();
        gmpt2.b(0x20);
        gmpt2.a = gmpu.a;
        hashMap3.put("AES256_GCM_SIV", gmpt2.a());
        gmpt gmpt3 = new gmpt();
        gmpt3.b(0x20);
        gmpt3.a = gmpu.c;
        hashMap3.put("AES256_GCM_SIV_RAW", gmpt3.a());
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap3));
        gnap0.b(gmps.c, gmpv.class);
        gnan0.b(gmps.b, gmpv.class);
        gnat0.b(gmps.a);
        gnaa0.c(gmps.d, true);
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        gnaw0.h(gmtc.a);
        gnaw0.g(gmtc.b);
        gnaw0.f(gmtc.c);
        gnaw0.e(gmtc.d);
        gnat0.b(gmqa.a);
        gnan0.b(gmqa.b, gmqc.class);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("CHACHA20_POLY1305", new gmqc(gmqb.a));
        hashMap4.put("CHACHA20_POLY1305_RAW", new gmqc(gmqb.c));
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap4));
        gnaa0.c(gmqa.c, true);
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        gnaw0.h(gmqr.a);
        gnaw0.g(gmqr.b);
        gnaw0.f(gmqr.c);
        gnaw0.e(gmqr.d);
        gnat0.b(gmqf.a);
        gnan0.b(gmqf.c, gmqm.class);
        gnaa0.c(gmqf.b, true);
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        gnaw0.h(gmra.a);
        gnaw0.g(gmra.b);
        gnaw0.f(gmra.c);
        gnaw0.e(gmra.d);
        gnan0.b(gmqj.b, gmqv.class);
        gnat0.b(gmqj.c);
        gnaa0.c(gmqj.a, true);
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        gnaw0.h(gmtz.a);
        gnaw0.g(gmtz.b);
        gnaw0.f(gmtz.c);
        gnaw0.e(gmtz.d);
        gnat0.b(gmrw.a);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("XCHACHA20_POLY1305", new gmry(gmrx.a));
        hashMap5.put("XCHACHA20_POLY1305_RAW", new gmry(gmrx.c));
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap5));
        gnan0.b(gmrw.d, gmry.class);
        gnap0.b(gmrw.c, gmry.class);
        gnaa0.c(gmrw.b, true);
        gnaw0.h(gmtt.a);
        gnaw0.g(gmtt.b);
        gnaw0.f(gmtt.c);
        gnaw0.e(gmtt.d);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("XAES_256_GCM_192_BIT_NONCE", gmrk.g);
        hashMap6.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", gmrk.h);
        hashMap6.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", gmrk.i);
        hashMap6.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", gmrk.j);
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap6));
        gnat0.b(gmro.b);
        gnan0.b(gmro.a, gmrq.class);
    }
}

