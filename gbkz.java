import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class gbkz {
    public final SharedPreferences a;

    public gbkz(Context context0) {
        this.a = context0.getSharedPreferences("com.google.android.wallet.bender3.framework.storage.InitializationTemplateStorage", 0);
    }

    public final zs a(WidgetConfig widgetConfig0, hckh hckh0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)zr.a).v_newBuilder();
        String s = widgetConfig0.a.name;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((zr)hftv0).b |= 2;
        ((zr)hftv0).d = s;
        int v = widgetConfig0.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        zr zr0 = (zr)hftp0.b_message;
        zr0.b |= 1;
        zr0.c = v;
        return this.b(gbkz.d(hckh0, ((zr)hftp0.N_build())));
    }

    public final zs b(String s) {
        this.e();
        return this.c(s);
    }

    final zs c(String s) {
        String s1 = this.a.getString(s, null);
        try {
            Parser hfvs0 = (Parser)((ProtoLiteMessage)zs.a).jf(7, null);
            return (zs)(s1 == null || hfvs0 == null ? null : gawi.f(Base64.decode(s1, 0), hfvs0));
        }
        catch(hfur hfur0) {
            Log.e("InitTemplateStorage", String.format("InitializationTemplateStorageEntry parsing failed with: %s", hfur0.getMessage()));
            return null;
        }
    }

    public static String d(hckh hckh0, zr zr0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)zt.a).v_newBuilder();
        hcjt hcjt0 = (hcjt)((ProtoLiteMessage)hckh.a).v_newBuilder();
        hcjt0.a(hckh0.l);
        int v = hckh0.m;
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh1 = (hckh)hcjt0.b_message;
        hckh1.b |= 0x200;
        hckh1.m = v;
        int v1 = hckh0.n;
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh2 = (hckh)hcjt0.b_message;
        hckh2.b |= 0x400;
        hckh2.n = v1;
        hcji hcji0 = hckh0.c == 10 ? ((hcji)hckh0.d) : hcji.b;
        hciy hciy0 = (hciy)((ProtoLiteMessage)hcji.b).v_newBuilder();
        hciy0.l(new hfuh(hcji0.P, hcji.a));
        gaxl.a();
        if(hzlp.a.b().f()) {
            long v2 = hcji0.F;
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            ((hcji)hciy0.b_message).c |= 0x8000000;
            ((hcji)hciy0.b_message).F = v2;
            String s = hcji0.C;
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji1 = (hcji)hciy0.b_message;
            s.getClass();
            hcji1.c |= 0x1000000;
            hcji1.C = s;
        }
        else {
            String s1 = hcji0.z;
            if(!hciy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hciy0).ensureMutable();
            }
            hcji hcji2 = (hcji)hciy0.b_message;
            s1.getClass();
            hcji2.c |= 0x200000;
            hcji2.z = s1;
        }
        hcji hcji3 = (hcji)((ProtoLiteBuilder)hciy0).N_build();
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh3 = (hckh)hcjt0.b_message;
        hcji3.getClass();
        hckh3.d = hcji3;
        hckh3.c = 10;
        long v3 = hckh0.h;
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh4 = (hckh)hcjt0.b_message;
        hckh4.b |= 8;
        hckh4.h = v3;
        String s2 = hckh0.f;
        if(!hcjt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hcjt0).ensureMutable();
        }
        hckh hckh5 = (hckh)hcjt0.b_message;
        s2.getClass();
        hckh5.b |= 2;
        hckh5.f = s2;
        hckh hckh6 = (hckh)((ProtoLiteBuilder)hcjt0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hckh6.getClass();
        ((zt)hftv0).c = hckh6;
        ((zt)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        zt zt0 = (zt)hftp0.b_message;
        zr0.getClass();
        zt0.d = zr0;
        zt0.b |= 2;
        return Base64.encodeToString(((MessageLite)(((zt)hftp0.N_build()))).toBytesArray(), 0);
    }

    public final void e() {
        Set set0 = this.a.getAll().keySet();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
        long v = System.currentTimeMillis();
        for(Object object0: set0) {
            String s = (String)object0;
            zs zs0 = this.c(s);
            if(zs0 != null) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)zs0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)zs0));
                List list0 = DesugarCollections.unmodifiableList(((zs)hftp0.b_message).b);
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: list0) {
                    zq zq0 = (zq)object1;
                    if(hfyn.b((zq0.e == null ? hfwn.a : zq0.e)) > v && hfyn.b((zq0.f == null ? hfwn.a : zq0.f)) <= v) {
                        arrayList0.add(zq0);
                    }
                }
                if(arrayList0.isEmpty()) {
                    sharedPreferences$Editor0.remove(s);
                }
                else {
                    if(arrayList0.size() == list0.size()) {
                        continue;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((zs)hftp0.b_message).b = hfvv.a;
                    hftp0.Z(arrayList0);
                    sharedPreferences$Editor0.putString(s, gawi.l(((MessageLite)hftp0.N_build())));
                }
            }
        }
        sharedPreferences$Editor0.apply();
    }
}

