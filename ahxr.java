import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

public final class ahxr {
    public final baun a;
    public final aiah b;
    public final Map c;
    public final ahyx d;
    public final aiaa e;
    public final aiaf f;
    private final ahxo g;
    private final aiab h;
    private final ahxq i;

    public ahxr(aiab aiab0, aiaa aiaa0, aiaf aiaf0, ahxo ahxo0) {
        this.a = new baun("ConsentPromptRequestHandler");
        this.b = new ahzp();
        this.c = new HashMap();
        this.d = new ahxp(this);
        ahxq ahxq0 = new ahxq(this);
        this.i = ahxq0;
        this.h = aiab0;
        this.e = aiaa0;
        this.f = aiaf0;
        this.g = ahxo0;
        ahxo0.a = new WeakReference(ahxq0);
    }

    public static long a() {
        return hppw.b() * 1000L;
    }

    public static long b() {
        return hppw.a.c().a() * 1000L;
    }

    public final ahxv c(String s) {
        Map map0 = this.c;
        ahxv ahxv0 = (ahxv)map0.get(s);
        if(ahxv0 == null) {
            ahxv0 = new ahxv();
            map0.put(s, ahxv0);
        }
        return ahxv0;
    }

    public static String d(String s) {
        return gfta.c(s) ? "" : s;
    }

    public final void e(long v) {
        Map map0 = this.c;
        gged_interceptors gged0 = gged_interceptors.i(map0.keySet());
        int v1 = gged0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            String s = (String)gged0.get(v2);
            ahxv ahxv0 = (ahxv)map0.get(s);
            if(ahxv0 != null) {
                long v3 = v - ahxr.b();
                HashMap hashMap0 = ahxv0.e;
                ggqj ggqj0 = ggfp.G(hashMap0.keySet()).om();
                while(ggqj0.hasNext()) {
                    Object object0 = ggqj0.next();
                    String s1 = (String)object0;
                    ahxu ahxu0 = (ahxu)hashMap0.get(s1);
                    if(ahxu0 == null || ahxu0.a <= v3) {
                        hashMap0.remove(s1);
                    }
                }
                baun baun0 = this.a;
                baun0.d("clearTimeoutNotifiedPackages at %d", new Object[]{v});
                long v4 = v - ahxr.h();
                ggdy ggdy0 = new ggdy();
                gfza gfza0 = ahxv0.d;
                ggqj ggqj1 = ggfp.G(gfza0.z()).om();
                while(ggqj1.hasNext()) {
                    Object object1 = ggqj1.next();
                    Long long0 = (Long)object1;
                    if(((long)long0) <= v4) {
                        for(Object object2: gfza0.h(long0)) {
                            ggdy0.i(((ahxt)object2).a);
                        }
                    }
                }
                gged_interceptors gged1 = ggdy0.h();
                if(!gged1.isEmpty()) {
                    aiaa aiaa0 = this.e;
                    aiaa0.c(gged1);
                    int v5 = ((ggna)gged1).c;
                    for(int v6 = 0; v6 < v5; ++v6) {
                        String s2 = (String)gged1.get(v6);
                        baun0.d("Notified request timeout: %s", new Object[]{s2});
                        SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
                        aiao.d(8, smsRetrieverEvent0);
                        if(s2 != null) {
                            aiao.a(s2, smsRetrieverEvent0);
                        }
                        aiaa0.a(new aicq(smsRetrieverEvent0, true));
                    }
                }
                baun0.d("clearTimeoutAwaitingRequests at %d", new Object[]{v});
                long v7 = v - ahxr.a();
                ggdy ggdy1 = new ggdy();
                Iterator iterator1 = ahxv0.c.w().iterator();
                while(iterator1.hasNext()) {
                    Object object3 = iterator1.next();
                    Map.Entry map$Entry0 = (Map.Entry)object3;
                    if(((long)(((Long)map$Entry0.getValue()))) <= v7) {
                        ggdy1.i(((String)map$Entry0.getKey()));
                        iterator1.remove();
                    }
                }
                gged_interceptors gged2 = ggdy1.h();
                if(!gged2.isEmpty()) {
                    aiaa aiaa1 = this.e;
                    aiaa1.c(gged2);
                    int v8 = ((ggna)gged2).c;
                    for(int v9 = 0; v9 < v8; ++v9) {
                        String s3 = (String)gged2.get(v9);
                        baun0.d("Request timeout: %s", new Object[]{s3});
                        SmsRetrieverEvent smsRetrieverEvent1 = new SmsRetrieverEvent();
                        aiao.d(6, smsRetrieverEvent1);
                        if(s3 != null) {
                            aiao.a(s3, smsRetrieverEvent1);
                        }
                        aiaa1.a(new aicq(smsRetrieverEvent1, true));
                    }
                }
                if(ahxv0.c()) {
                    map0.remove(s);
                }
            }
        }
    }

    public final boolean f() {
        for(Object object0: this.c.values()) {
            if(!((ahxv)object0).c()) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(RequestResult requestResult0, String s, long v, int v1) {
        int v2;
        gged_interceptors gged0 = ggna.a;
        String s1 = ahxr.d(s);
        if("".equals(s1)) {
            v2 = 0;
        }
        else {
            Map map0 = this.c;
            if(map0.containsKey(s1)) {
                ahxv ahxv0 = (ahxv)map0.get(s1);
                ahxv0.b(v, requestResult0);
                gged0 = ahxv0.a(v, gged0);
                this.i(gged0, s1, v);
                v2 = gged0.size();
            }
            else {
                v2 = 0;
            }
        }
        ahxv ahxv1 = (ahxv)this.c.get("");
        this.a.d(a.X(ahxv1, s, "generalQueue = ", " real senderAddress = "), new Object[0]);
        if(ahxv1 != null && this.h.a(s)) {
            ahxv1.b(v, requestResult0);
            gged_interceptors gged1 = ahxv1.a(v, gged0);
            this.i(gged1, "", v);
            v2 += gged1.size();
        }
        if(v2 > 0) {
            aiaa aiaa0 = this.e;
            SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
            aiao.d(5, smsRetrieverEvent0);
            smsRetrieverEvent0.n |= 0x40;
            smsRetrieverEvent0.g = v2;
            if(v1 != 0) {
                aiao.f(v1, smsRetrieverEvent0);
            }
            aiaa0.a(new aicq(smsRetrieverEvent0, true));
            long v3 = ahxr.h();
            this.f.a(this.d, v3);
            return true;
        }
        return false;
    }

    private static long h() {
        return hppw.a.c().c() * 1000L;
    }

    private final void i(gged_interceptors gged0, String s, long v) {
        if(!gged0.isEmpty()) {
            VerificationToken verificationToken0 = new VerificationToken();
            verificationToken0.b = s;
            verificationToken0.a = v;
            aiak aiak0 = this.g.b.h;
            Context context0 = aiak0.b();
            if(context0 != null) {
                bbmq.G(context0, "com.google.android.gms.auth.api.phone.ui.UserConsentPromptActivity", true);
            }
            for(Object object0: gged0) {
                String s1 = (String)object0;
                if(s1 != null) {
                    Intent intent0 = new Intent("com.google.android.gms.auth.api.phone.ACTION_USER_CONSENT").setPackage("com.google.android.gms");
                    bauc.l(verificationToken0, intent0, "com.google.android.gms.auth.api.phone.extra.verification_token");
                    aiak0.c(ahxf.a(s1, Status.b).putExtra("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT", intent0));
                }
            }
            int v1 = gged0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                String s2 = (String)gged0.get(v2);
                aiaa aiaa0 = this.e;
                SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
                aiao.d(7, smsRetrieverEvent0);
                if(s2 != null) {
                    aiao.a(s2, smsRetrieverEvent0);
                }
                aiaa0.a(new aicq(smsRetrieverEvent0, true));
            }
        }
    }
}

