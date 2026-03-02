import android.accounts.Account;
import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

public final class actb {
    private final Context a;
    private final acta b;

    public actb(Context context0) {
        acta acta0 = new acta();
        super();
        this.a = context0;
        this.b = acta0;
    }

    static String a(String[] arr_s) {
        URL uRL0;
        Uri.Builder uri$Builder0 = new Uri.Builder();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            try {
                uRL0 = new URL(s);
            }
            catch(MalformedURLException unused_ex) {
                throw new IllegalArgumentException("Invalid URL: " + s);
            }
            uri$Builder0.appendQueryParameter("url", uRL0.getProtocol() + "://" + uRL0.getHost());
        }
        return "weblogin:" + uri$Builder0.build().getQuery();
    }

    public final Set b(Account account0, String[] arr_s) {
        aktg aktg0;
        batl.s(account0);
        int v = 1;
        batl.c(arr_s != null && arr_s.length > 0, "Must have at least one URL.");
        String s = actb.a(arr_s);
        String s1 = acso.f(this.a, account0, s);
        try {
            byte[] arr_b = Base64.decode(s1, 9);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aktg.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            aktg0 = (aktg)hftv0;
        }
        catch(hfur hfur0) {
            throw new acse("Couldn\'t read data from server.", hfur0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.w("WebLoginHelper", "Incorrect base64 encoding: " + (s1 == null ? "null" : s1.substring(0, Math.min(6, s1.length()))));
            throw new acse("Couldn\'t read data from server.", illegalArgumentException0);
        }
        if(aktg0 != null && (aktg0.b & 1) != 0) {
            aktm aktm0 = aktg0.c == null ? aktm.a : aktg0.c;
            switch((aktl.a(aktm0.b) == 0 ? 1 : aktl.a(aktm0.b)) - 1) {
                case 1: {
                    return this.c(aktm0.c);
                }
                case 2: {
                    throw new IOException("Request failed, but server said RETRY.");
                }
                case 5: {
                    this.c(aktm0.c);
                    for(Object object0: aktm0.d) {
                        aktj aktj0 = (aktj)object0;
                        int v2 = aktj0.b;
                        int v3 = akti.a(v2) == 0 ? 1 : akti.a(v2);
                        switch(v3 - 1) {
                            case 1: {
                                continue;
                            }
                            case 2: {
                                throw new acsz(aktj0.c);
                            }
                        }
                        if(v3 - 1 == 3) {
                            continue;
                        }
                        Log.w("WebLoginHelper", a.as(((byte)(akti.a(v2) == 0 ? 1 : akti.a(v2))), ((byte)-1), ((byte)"Unrecognized failed account status: ")));
                        continue;
                    }
                    throw new acse("Authorization failed, but no recoverable accounts.");
                }
                default: {
                    Log.w("WebLoginHelper", "Unexpected response: " + aktm0);
                    int v1 = aktl.a(aktm0.b);
                    if(v1 != 0) {
                        v = v1;
                    }
                    throw new acse(a.as(((byte)v), ((byte)-1), ((byte)"Unknown response status: ")));
                }
            }
        }
        throw new acse("Invalid response.");
    }

    private final Set c(List list0) {
        String s7;
        Set set0 = bbnh.g(list0.size());
        for(Object object0: list0) {
            aktf aktf0 = (aktf)object0;
            String s = aktf0.f.isEmpty() ? aktf0.e : aktf0.f;
            String s1 = null;
            if(!TextUtils.isEmpty(s) && !aktf0.c.isEmpty() && !aktf0.d.isEmpty()) {
                String s2 = acru.a(s, ((aktf0.b & 0x20) == 0 ? null : Boolean.valueOf(aktf0.h)));
                String s3 = aktf0.c;
                String s4 = aktf0.d;
                String s5 = aktf0.e;
                String s6 = aktf0.g;
                Boolean boolean0 = (aktf0.b & 0x40) == 0 ? null : Boolean.valueOf(aktf0.i);
                Boolean boolean1 = (aktf0.b & 0x20) == 0 ? null : Boolean.valueOf(aktf0.h);
                Long long0 = (aktf0.b & 0x80) == 0 ? null : ((long)aktf0.j);
                int v = aktf0.b;
                boolean z = true;
                if((v & 0x100) == 0) {
                    s7 = null;
                }
                else {
                    switch(akte.a(aktf0.k)) {
                        case 0: 
                        case 1: {
                            s7 = "UNKNOWN_PRIORITY";
                            break;
                        }
                        case 2: {
                            s7 = "LOW";
                            break;
                        }
                        case 3: {
                            s7 = "MEDIUM";
                            break;
                        }
                        default: {
                            s7 = "HIGH";
                        }
                    }
                }
                if((v & 0x200) != 0) {
                    s1 = aktf0.l;
                }
                if((v & 0x400) == 0 || aktf0.m.isEmpty()) {
                    z = false;
                }
                this.b.a.setCookie(s2, acru.c(s3, s4, s5, s6, boolean0, boolean1, long0, s7, s1, Boolean.valueOf(z)));
                set0.add(s2);
            }
            else {
                Log.w("WebLoginHelper", "Invalid cookie.");
            }
        }
        return set0;
    }
}

