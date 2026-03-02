package com.google.android.gms.ads.identifier.settings;

import ByteString;
import ProtoLiteMessage;
import android.content.Context;
import android.content.SharedPreferences;
import gmiz;
import gmjf;
import hfsl;
import hfsm;
import hftc;
import hfur;
import hfvu;
import hfwc;
import hfwr;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class o {
    private static o a;
    private final u b;
    private final Context c;

    static {
    }

    private o(Context context0) {
        this.c = context0;
        this.b = u.a(context0);
    }

    public static o a(Context context0) {
        synchronized(o.class) {
            if(o.a == null) {
                o.a = new o(context0);
            }
        }
        return o.a;
    }

    public final gmjf b() {
        gmjf gmjf0;
        synchronized(this) {
            String s = this.e().getString("event_attestation_integrity_token", null);
            if(s != null) {
                try {
                    byte[] arr_b = s.getBytes(StandardCharsets.ISO_8859_1);
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gmjf.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    gmjf0 = (gmjf)hftv0;
                    ByteString hfsf0 = gmjf0.c;
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
                    d.c(this.c, "deviceIntegrityTokenDecodeError", hfur0);
                    return null;
                }
                try {
                    byte[] arr_b1 = this.b.e();
                }
                catch(IOException | GeneralSecurityException exception0) {
                    d.c(this.c, "publicKeyError", exception0);
                    return null;
                }
                if(gmiz0 != null && arr_b1 != null && Arrays.equals(gmiz0.b.toByteArray(), arr_b1)) {
                    return gmjf0;
                }
                d.b(this.c, "getDeviceIntegrityTokenError", "public key mismatch");
                this.c();
                return null;
            }
        }
        return null;
    }

    public final void c() {
        synchronized(this) {
            this.e().edit().clear().commit();
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
                byte[] arr_b1 = this.b.e();
            }
            catch(IOException | GeneralSecurityException exception0) {
                d.c(this.c, "publicKeyError", exception0);
                return false;
            }
            if(gmiz0 != null && arr_b1 != null && Arrays.equals(gmiz0.b.toByteArray(), arr_b1)) {
                if(!this.e().edit().putString("event_attestation_integrity_token", new String(arr_b, StandardCharsets.ISO_8859_1)).commit()) {
                    d.b(this.c, "deviceIntegrityTokenError", "Shared Pref write failed.");
                }
                return true;
            }
            d.b(this.c, "deviceIntegrityTokenError", "public key mismatch");
        }
        return false;
    }

    private final SharedPreferences e() {
        return this.c.getSharedPreferences("device_integrity_token", 0);
    }
}

