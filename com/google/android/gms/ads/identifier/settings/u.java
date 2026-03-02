package com.google.android.gms.ads.identifier.settings;

import ByteString;
import ProtoLiteMessage;
import android.content.Context;
import android.content.SharedPreferences;
import elfz;
import gmiz;
import gmjf;
import gmnk;
import gmyy;
import gnmf;
import hfsl;
import hfsm;
import hftc;
import hfur;
import hfvu;
import hfwc;
import hfwr;
import hotc;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import jeb.synthetic.FIN;

public final class u {
    gmnk a;
    private static u b;
    private final Context c;
    private gmyy d;
    private byte[] e;

    static {
    }

    private u(Context context0) {
        this.d = null;
        this.a = null;
        this.e = null;
        this.c = context0;
    }

    public static u a(Context context0) {
        synchronized(u.class) {
            if(u.b == null) {
                u.b = new u(context0);
            }
        }
        return u.b;
    }

    public final gmjf b() {
        synchronized(this) {
            String s = this.g().getString("event_attestation_integrity_token", null);
            if(s != null) {
                try {
                    byte[] arr_b = s.getBytes(StandardCharsets.ISO_8859_1);
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gmjf.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    return (gmjf)hftv0;
                }
                catch(hfur hfur0) {
                    d.c(this.c, "deviceIntegrityTokenError", hfur0);
                    return null;
                }
            }
        }
        return null;
    }

    public final void c() {
        synchronized(this) {
            this.g().edit().clear().commit();
            this.d = null;
            this.a = null;
            this.e = null;
        }
    }

    public final boolean d(byte[] arr_b) {
        synchronized(this) {
            if(arr_b == null) {
                d.b(this.c, "deviceIntegrityTokenError", "null token");
                return false;
            }
            if(arr_b.length == 0) {
                d.b(this.c, "deviceIntegrityTokenError", "zero-length token");
                return false;
            }
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gmjf.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ByteString hfsf0 = ((gmjf)hftv0).c;
                hftc hftc1 = hftc.a();
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv1 = ((ProtoLiteMessage)gmiz.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv1);
                    hfwc0.l(hftv1, hfsm.p(hfsl0), hftc1);
                    hfwc0.g(hftv1);
                }
                catch(hfur hfur1) {
                    if(hfur1.b) {
                        hfur1 = new hfur(hfur1);
                    }
                    hfur1.a = hftv1;
                    throw hfur1;
                }
                catch(hfwr hfwr0) {
                    hfur hfur2 = hfwr0.a();
                    hfur2.a = hftv1;
                    throw hfur2;
                }
                catch(IOException iOException0) {
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur3 = new hfur(iOException0);
                    hfur3.a = hftv1;
                    throw hfur3;
                }
                catch(RuntimeException runtimeException0) {
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                }
                try {
                    hfsl0.z(0);
                }
                catch(hfur hfur4) {
                    hfur4.a = hftv1;
                    throw hfur4;
                }
                ProtoLiteMessage.P_makeImmutable(hftv1);
                gmiz gmiz0 = (gmiz)hftv1;
            }
            catch(hfur hfur0) {
                d.c(this.c, "deviceIntegriyTokenDecodeError", hfur0);
                return false;
            }
            try {
                byte[] arr_b1 = this.e();
            }
            catch(IOException | GeneralSecurityException exception0) {
                d.c(this.c, "publicKeyError", exception0);
                return false;
            }
            if(gmiz0 != null && arr_b1 != null && Arrays.equals(gmiz0.b.toByteArray(), arr_b1)) {
                if(!this.g().edit().putString("event_attestation_integrity_token", new String(arr_b, StandardCharsets.ISO_8859_1)).commit()) {
                    d.b(this.c, "deviceIntegrityTokenError", "Shared Pref write failed.");
                }
                return true;
            }
            d.b(this.c, "deviceIntegrityTokenError", "public key mismatch");
        }
        return false;
    }

    public final byte[] e() {
        synchronized(this) {
            byte[] arr_b = this.e;
            if(arr_b != null) {
                return arr_b;
            }
            byte[] arr_b1 = elfz.c(this.h());
            this.e = arr_b1;
            if(arr_b1 == null) {
                d.b(this.c, "publicKeyError", "Not found.");
                this.e = new byte[0];
            }
        }
        return this.e;
    }

    public final byte[] f(byte[] arr_b) {
        byte[] arr_b1;
        synchronized(this) {
            if(this.a == null) {
                this.a = (gmnk)this.h().a().o(gnmf.a(), gmnk.class);
            }
            arr_b1 = this.a.a(arr_b);
        }
        return arr_b1;
    }

    private final SharedPreferences g() {
        return this.c.getSharedPreferences("event_attestation_settings", 0);
    }

    private final gmyy h() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        gmyy gmyy0 = this.d;
        if(gmyy0 != null) {
            FIN.finallyCodeBegin$NT(v);
            return gmyy0;
        }
        try {
            this.a = null;
            this.e = null;
            gmyy gmyy1 = elfz.a(this.c, "event_attestation_settings", hotc.a.b().b());
            this.d = gmyy1;
            d.d(this.c, "disableKeyStore", Boolean.toString(gmyy1 != null));
            gmyy gmyy2 = this.d;
            if(gmyy2 == null) {
                throw new GeneralSecurityException("Ad ID keyset manager is null.");
            }
            FIN.finallyExec$NT(v);
            return gmyy2;
        }
        catch(IOException | GeneralSecurityException exception0) {
            d.c(this.c, "getOrCreateKeyManagerError", exception0);
            throw exception0;
        }
        catch(RuntimeException runtimeException0) {
            if(hotc.c()) {
                d.c(this.c, "getOrCreateKeyManagerError", runtimeException0);
                throw new GeneralSecurityException(runtimeException0);
            }
            throw runtimeException0;
        }
    }
}

