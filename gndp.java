import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class gndp {
    static {
        try {
            gndp.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    public static void a() {
        gnat gnat0 = gnat.a;
        gnat0.c(gndv.a);
        gnat0.b(gndv.b);
        gnat0.c(gndd.a);
        int v = gndk.f;
        if(!gmue.a(v)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        gnaw gnaw0 = gnaw.a;
        gnaw0.h(gnep.c);
        gnaw0.g(gnep.d);
        gnaw0.f(gnep.e);
        gnaw0.e(gnep.f);
        gnat0.b(gndk.a);
        gnat0.b(gndk.b);
        gnas gnas0 = gnas.a;
        HashMap hashMap0 = new HashMap();
        hashMap0.put("HMAC_SHA256_128BITTAG", gneb.a);
        gndl gndl0 = new gndl();
        gndl0.b(0x20);
        gndl0.c(16);
        gndl0.b = gndn.d;
        gndl0.a = gndm.c;
        hashMap0.put("HMAC_SHA256_128BITTAG_RAW", gndl0.a());
        gndl gndl1 = new gndl();
        gndl1.b(0x20);
        gndl1.c(0x20);
        gndl1.b = gndn.a;
        gndl1.a = gndm.c;
        hashMap0.put("HMAC_SHA256_256BITTAG", gndl1.a());
        gndl gndl2 = new gndl();
        gndl2.b(0x20);
        gndl2.c(0x20);
        gndl2.b = gndn.d;
        gndl2.a = gndm.c;
        hashMap0.put("HMAC_SHA256_256BITTAG_RAW", gndl2.a());
        gndl gndl3 = new gndl();
        gndl3.b(0x40);
        gndl3.c(16);
        gndl3.b = gndn.a;
        gndl3.a = gndm.e;
        hashMap0.put("HMAC_SHA512_128BITTAG", gndl3.a());
        gndl gndl4 = new gndl();
        gndl4.b(0x40);
        gndl4.c(16);
        gndl4.b = gndn.d;
        gndl4.a = gndm.e;
        hashMap0.put("HMAC_SHA512_128BITTAG_RAW", gndl4.a());
        gndl gndl5 = new gndl();
        gndl5.b(0x40);
        gndl5.c(0x20);
        gndl5.b = gndn.a;
        gndl5.a = gndm.e;
        hashMap0.put("HMAC_SHA512_256BITTAG", gndl5.a());
        gndl gndl6 = new gndl();
        gndl6.b(0x40);
        gndl6.c(0x20);
        gndl6.b = gndn.d;
        gndl6.a = gndm.e;
        hashMap0.put("HMAC_SHA512_256BITTAG_RAW", gndl6.a());
        hashMap0.put("HMAC_SHA512_512BITTAG", gneb.b);
        gndl gndl7 = new gndl();
        gndl7.b(0x40);
        gndl7.c(0x40);
        gndl7.b = gndn.d;
        gndl7.a = gndm.e;
        hashMap0.put("HMAC_SHA512_512BITTAG_RAW", gndl7.a());
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap0));
        gnan gnan0 = gnan.a;
        gnan0.b(gndk.e, gndo.class);
        gnap.a.b(gndk.d, gndo.class);
        gnaa gnaa0 = gnaa.a;
        gnaa0.d(gndk.c, v, true);
        if(gmuf.a()) {
            return;
        }
        if(!gmue.a(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        gnaw0.h(gneg.a);
        gnaw0.g(gneg.b);
        gnaw0.f(gneg.c);
        gnaw0.e(gneg.d);
        gnan0.b(gncx.a, gnda.class);
        gnat0.b(gncx.b);
        gnat0.b(gncx.c);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("AES_CMAC", gneb.c);
        hashMap1.put("AES256_CMAC", gneb.c);
        gncy gncy0 = new gncy();
        gncy0.b(0x20);
        gncy0.c(16);
        gncy0.a = gncz.d;
        hashMap1.put("AES256_CMAC_RAW", gncy0.a());
        gnas0.c(DesugarCollections.unmodifiableMap(hashMap1));
        gnaa0.c(gncx.d, true);
    }
}

