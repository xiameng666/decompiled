import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.chimera.modules.wearable.AppContextProvider;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;

public final class fdso {
    gmnb a;
    gmml b;
    gmnb c;
    public gmno d;
    gmnb e;
    gmmg f;
    long g;
    public boolean h;
    public final frli i;

    public fdso() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("wearable");
        frce0.e("cloudsync_e2ee_keys.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)fess.a));
        frif frif0 = frie0.a();
        this.i = cjtb.a.a(frif0);
    }

    public final fess a() {
        if(this.m()) {
            hfse hfse0 = new hfse(0x80);
            gmnb gmnb0 = this.e;
            if(gmnb0 != null) {
                gmmj.b(gmnb0, new gmmi(hfse0));
                ByteString hfsf0 = hfse0.b();
                hfse0.c();
                gmnb gmnb1 = this.a;
                if(gmnb1 != null) {
                    gmmj.b(gmnb1, new gmmi(hfse0));
                    ByteString hfsf1 = hfse0.b();
                    hfse0.c();
                    gmnb gmnb2 = this.c;
                    if(gmnb2 != null) {
                        gmmj.b(gmnb2, new gmmi(hfse0));
                        ByteString hfsf2 = hfse0.b();
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fess.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        hfsf0.getClass();
                        ((fess)hftv0).b |= 1;
                        ((fess)hftv0).c = hfsf0;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        hfsf1.getClass();
                        ((fess)hftv1).b |= 2;
                        ((fess)hftv1).d = hfsf1;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        fess fess0 = (fess)hftp0.b_message;
                        hfsf2.getClass();
                        fess0.b |= 4;
                        fess0.e = hfsf2;
                        hfwn hfwn0 = hfyn.h(this.g);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        fess fess1 = (fess)hftp0.b_message;
                        hfwn0.getClass();
                        fess1.f = hfwn0;
                        fess1.b |= 8;
                        return (fess)hftp0.N_build();
                    }
                }
            }
        }
        return null;
    }

    public final InputStream b(InputStream inputStream0, String s) {
        gmno gmno0 = this.d;
        if(gmno0 != null) {
            return gmno0.a(inputStream0, this.g(s).getBytes());
        }
        throw new GeneralSecurityException("Tried doing streaming encryption without a streaming primitive");
    }

    public final OutputStream c(OutputStream outputStream0, String s) {
        gmno gmno0 = this.d;
        if(gmno0 != null) {
            return gmno0.b(outputStream0, this.g(s).getBytes());
        }
        throw new GeneralSecurityException("Tried doing streaming decryption without a streaming primitive");
    }

    public final String d(String s) {
        if(!s.startsWith("enc/")) {
            return s;
        }
        byte[] arr_b = Base64.decode(s.substring(4), 8);
        gmml gmml0 = this.b;
        if(gmml0 != null) {
            return Base64.encodeToString(gmml0.a(arr_b, new byte[0]), 11);
        }
        throw new GeneralSecurityException("Tried doing daead decryption without a daead primitive");
    }

    public final String e(String s) {
        if(s.startsWith("/")) {
            return this.f(s.substring(1));
        }
        throw new GeneralSecurityException("Cannot decrypt path without \'/\' prefix.");
    }

    public final String f(String s) {
        byte[] arr_b = Base64.decode(s, 8);
        gmml gmml0 = this.b;
        if(gmml0 != null) {
            return new String(gmml0.a(arr_b, new byte[0]));
        }
        throw new GeneralSecurityException("Tried doing daead decryption without a daead primitive");
    }

    public final String g(String s) {
        if(s.startsWith("enc/")) {
            return s;
        }
        byte[] arr_b = Base64.decode(s, 8);
        gmml gmml0 = this.b;
        if(gmml0 != null) {
            return "enc/" + Base64.encodeToString(gmml0.b(arr_b, new byte[0]), 11);
        }
        throw new GeneralSecurityException("Tried doing daead encryption without a daead primitive");
    }

    public final String h(String s) {
        return "/" + this.i(s);
    }

    public final String i(String s) {
        gmml gmml0 = this.b;
        if(gmml0 != null) {
            return Base64.encodeToString(gmml0.b(s.getBytes(), new byte[0]), 11);
        }
        throw new GeneralSecurityException("Tried doing daead encryption without a daead primitive");
    }

    public final void j() {
        Log.d("CloudNodeCrypto", "Preparing crypto primitives...");
        gmnb gmnb0 = this.a;
        if(gmnb0 == null) {
            throw new GeneralSecurityException("Couldn\'t prepare daead: null daeadHandle");
        }
        if(gmuf.a()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant DeterministicAeadConfigurationV1 in FIPS mode");
        }
        this.b = (gmml)gmnb0.o(gmus.a, gmml.class);
        gmnb gmnb1 = this.c;
        if(gmnb1 == null) {
            throw new GeneralSecurityException("Couldn\'t prepare streamingAead: null streamingAeadHandle");
        }
        this.d = (gmno)gmnb1.o(gnpb.a(), gmno.class);
        gmnb gmnb2 = this.e;
        if(gmnb2 == null) {
            throw new GeneralSecurityException("Couldn\'t prepare aead: null aeadHandle");
        }
        this.f = (gmmg)gmnb2.o(gmnz.a(), gmmg.class);
    }

    public final void k(fess fess0) {
        this.a = gmmj.a(gmmh.a(fess0.d.toByteArray()));
        this.c = gmmj.a(gmmh.a(fess0.e.toByteArray()));
        this.e = gmmj.a(gmmh.a(fess0.c.toByteArray()));
        this.j();
        this.g = hfyn.b((fess0.f == null ? hfwn.a : fess0.f));
    }

    public final void l() {
        fess fess0 = this.a();
        try {
            if(fess0 != null) {
                fdsm fdsm0 = new fdsm(fess0);
                ((glyq)this.i.b(fdsm0, gmap.a)).u();
                return;
            }
            fdsn fdsn0 = new fdsn();
            ((glyq)this.i.b(fdsn0, gmap.a)).u();
        }
        catch(ExecutionException executionException0) {
            throw new IOException(executionException0.getCause());
        }
        catch(InterruptedException interruptedException0) {
            throw new IOException("Interrupted while saving key data", interruptedException0);
        }
    }

    public final boolean m() {
        return this.b != null && this.d != null && this.f != null;
    }

    public static boolean n(String s) {
        return s != null && s.startsWith("enc/");
    }

    public final boolean o() {
        return this.m() && this.h;
    }

    public final byte[] p(byte[] arr_b, String s) {
        gmmg gmmg0 = this.f;
        if(gmmg0 != null) {
            return s == null ? gmmg0.a(arr_b, null) : gmmg0.a(arr_b, s.getBytes());
        }
        throw new GeneralSecurityException("Tried doing AEAD encryption without an AEAD primitive");
    }

    public final byte[] q(byte[] arr_b, String s) {
        gmmg gmmg0 = this.f;
        if(gmmg0 != null) {
            return s == null ? gmmg0.b(arr_b, null) : gmmg0.b(arr_b, s.getBytes());
        }
        throw new GeneralSecurityException("Tried doing AEAD encryption without an AEAD primitive");
    }
}

