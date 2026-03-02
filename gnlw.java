import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class gnlw {
    static {
        try {
            gnlw.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    public static void a() {
        gnat gnat0 = gnat.a;
        gnat0.c(gnkt.a);
        gnat0.b(gnkt.b);
        gnat0.c(gnkx.a);
        gnat0.b(gnkx.b);
        int v = gnjr.f;
        if(!gmue.a(v)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        gnaw gnaw0 = gnaw.a;
        gnaw0.h(gnmq.a);
        gnaw0.g(gnmq.b);
        gnaw0.f(gnmq.c);
        gnaw0.e(gnmq.d);
        gnaw0.f(gnmq.e);
        gnaw0.e(gnmq.f);
        gnas gnas0 = gnas.a;
        HashMap hashMap0 = new HashMap();
        hashMap0.put("ECDSA_P256", gnkp.a);
        hashMap0.put("ECDSA_P256_IEEE_P1363", gnkp.d);
        hashMap0.put("ECDSA_P256_RAW", gnje.a(gnjh.a, gnjf.a, gnjg.a, gnji.d));
        hashMap0.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", gnkp.f);
        hashMap0.put("ECDSA_P384", gnkp.b);
        hashMap0.put("ECDSA_P384_IEEE_P1363", gnkp.e);
        hashMap0.put("ECDSA_P384_SHA512", gnje.a(gnjh.b, gnjf.b, gnjg.c, gnji.a));
        hashMap0.put("ECDSA_P384_SHA384", gnje.a(gnjh.b, gnjf.b, gnjg.b, gnji.a));
        hashMap0.put("ECDSA_P521", gnkp.c);
        hashMap0.put("ECDSA_P521_IEEE_P1363", gnkp.g);
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap0));
        gnat0.b(gnjr.a);
        gnat0.b(gnjr.b);
        gnan gnan0 = gnan.a;
        gnan0.b(gnjr.d, gnjj.class);
        gnaa gnaa0 = gnaa.a;
        gnaa0.d(gnjr.e, v, true);
        gnaa0.d(gnjr.c, v, false);
        int v1 = gnlj.f;
        if(!gmue.a(v1)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        gnaw0.h(gnnk.a);
        gnaw0.g(gnnk.b);
        gnaw0.f(gnnk.c);
        gnaw0.e(gnnk.d);
        gnaw0.f(gnnk.e);
        gnaw0.e(gnnk.f);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("RSA_SSA_PKCS1_3072_SHA256_F4", gnkp.i);
        gnky gnky0 = new gnky();
        gnky0.b = gnkz.a;
        gnky0.b(0xC00);
        gnky0.a = gnlb.a;
        gnky0.c = gnla.d;
        hashMap1.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", gnky0.a());
        hashMap1.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", gnkp.j);
        hashMap1.put("RSA_SSA_PKCS1_4096_SHA512_F4", gnkp.k);
        gnky gnky1 = new gnky();
        gnky1.b = gnkz.c;
        gnky1.b(0x1000);
        gnky1.a = gnlb.a;
        gnky1.c = gnla.d;
        hashMap1.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", gnky1.a());
        gnas0.c(hashMap1);
        gnat0.b(gnlj.a);
        gnat0.b(gnlj.b);
        gnan0.b(gnlj.d, gnlb.class);
        gnaa0.d(gnlj.e, v1, true);
        gnaa0.d(gnlj.c, v1, false);
        int v2 = gnlv.f;
        if(!gmue.a(v2)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        gnaw0.h(gnnt.a);
        gnaw0.g(gnnt.b);
        gnaw0.f(gnnt.c);
        gnaw0.e(gnnt.d);
        gnaw0.f(gnnt.e);
        gnaw0.e(gnnt.f);
        HashMap hashMap2 = new HashMap();
        gnlk gnlk0 = new gnlk();
        gnlk0.b = gnll.a;
        gnlk0.c = gnll.a;
        gnlk0.c(0x20);
        gnlk0.b(0xC00);
        gnlk0.a = gnln.a;
        gnlk0.d = gnlm.a;
        hashMap2.put("RSA_SSA_PSS_3072_SHA256_F4", gnlk0.a());
        gnlk gnlk1 = new gnlk();
        gnlk1.b = gnll.a;
        gnlk1.c = gnll.a;
        gnlk1.c(0x20);
        gnlk1.b(0xC00);
        gnlk1.a = gnln.a;
        gnlk1.d = gnlm.d;
        hashMap2.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", gnlk1.a());
        hashMap2.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", gnkp.l);
        gnlk gnlk2 = new gnlk();
        gnlk2.b = gnll.c;
        gnlk2.c = gnll.c;
        gnlk2.c(0x40);
        gnlk2.b(0x1000);
        gnlk2.a = gnln.a;
        gnlk2.d = gnlm.a;
        hashMap2.put("RSA_SSA_PSS_4096_SHA512_F4", gnlk2.a());
        gnlk gnlk3 = new gnlk();
        gnlk3.b = gnll.c;
        gnlk3.c = gnll.c;
        gnlk3.c(0x40);
        gnlk3.b(0x1000);
        gnlk3.a = gnln.a;
        gnlk3.d = gnlm.d;
        hashMap2.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", gnlk3.a());
        hashMap2.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", gnkp.m);
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap2));
        gnat0.b(gnlv.a);
        gnat0.b(gnlv.b);
        gnan0.b(gnlv.d, gnln.class);
        gnaa0.d(gnlv.e, v2, true);
        gnaa0.d(gnlv.c, v2, false);
        if(gmuf.a()) {
            return;
        }
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        gnaw0.h(gnmz.a);
        gnaw0.g(gnmz.b);
        gnaw0.f(gnmz.c);
        gnaw0.e(gnmz.d);
        gnaw0.f(gnmz.e);
        gnaw0.e(gnmz.f);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("ED25519", new gnjt(gnjs.a));
        hashMap3.put("ED25519_RAW", new gnjt(gnjs.d));
        hashMap3.put("ED25519WithRawOutput", new gnjt(gnjs.d));
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap3));
        gnan0.b(gnjz.e, gnjt.class);
        gnap.a.b(gnjz.d, gnjt.class);
        gnat0.b(gnjz.a);
        gnat0.b(gnjz.b);
        gnaa0.c(gnjz.f, true);
        gnaa0.c(gnjz.c, false);
    }
}

