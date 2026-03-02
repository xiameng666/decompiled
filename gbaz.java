import android.accounts.AccountManager;
import android.content.SharedPreferences.Editor;
import com.google.android.wallet.bender3.framework.client.GoogleAccountStateSnapshot;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class gbaz extends gaok {
    private final gbkz b;

    public gbaz(gamx gamx0, gbkz gbkz0) {
        super(gamx0);
        this.b = gbkz0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        byte[] arr_b = gano0.a.getByteArrayExtra("bodyBytes");
        gftb.check(arr_b);
        hduw hduw0 = (hduw)gawi.g(arr_b, ((Parser)((ProtoLiteMessage)hduw.a).jf(7, null)));
        gamx gamx0 = this.d();
        WidgetConfig widgetConfig0 = gano0.f();
        byte[] arr_b1 = gano0.a.getByteArrayExtra("bodyBytes");
        gftb.check(arr_b1);
        gaxl.a();
        GoogleAccountStateSnapshot googleAccountStateSnapshot0 = gaup.a(AccountManager.get(this.a));
        gaym gaym0 = this.f();
        ganp ganp0 = gamx0.a(new gano(gbbl.b(2, widgetConfig0, gbbn.c, arr_b1, googleAccountStateSnapshot0, gaym0)));
        switch(ganp0.b()) {
            case 0: {
                hduz hduz0 = (hduz)gawi.g(gbbl.h(ganp0, this.f()), ((Parser)((ProtoLiteMessage)hduz.a).jf(7, null)));
                byte[] arr_b2 = ganp0.a.getByteArrayExtra("requestContext");
                gftb.z(arr_b2, "RequestContext should be provided by the O2NetworkAction response.");
                hckh hckh0 = (hckh)gawi.g(arr_b2, ((Parser)((ProtoLiteMessage)hckh.a).jf(7, null)));
                gbkz gbkz0 = this.b;
                hfuo hfuo0 = hduw0.d;
                WidgetConfig widgetConfig1 = gano0.f();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)zr.a).v_newBuilder();
                int v = widgetConfig1.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                zr zr0 = (zr)hftp0.b_message;
                zr0.b |= 1;
                zr0.c = v;
                String s = widgetConfig1.a.name;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                zr zr1 = (zr)hftp0.b_message;
                s.getClass();
                zr1.b |= 2;
                zr1.d = s;
                zr zr2 = (zr)hftp0.N_build();
                gftb.z(hduz0, "Cannot cache null response");
                gbkz0.e();
                HashMap hashMap0 = new HashMap();
                for(Object object0: hfuo0) {
                    hashMap0.put(((ByteString)object0), new ArrayList());
                }
                for(Object object1: hduz0.b) {
                    List list0 = (List)hashMap0.get(((ByteString)hfuo0.get(((hduy)object1).b)));
                    gftb.check(list0);
                    list0.add(((hduy)object1));
                }
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: hashMap0.entrySet()) {
                    long v1 = System.currentTimeMillis();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)zq.a).v_newBuilder();
                    ByteString hfsf0 = (ByteString)((Map.Entry)object2).getKey();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    zq zq0 = (zq)hftp1.b_message;
                    hfsf0.getClass();
                    zq0.b |= 1;
                    zq0.c = hfsf0;
                    Iterable iterable0 = (Iterable)((Map.Entry)object2).getValue();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    zq zq1 = (zq)hftp1.b_message;
                    hfuo hfuo1 = zq1.d;
                    if(!hfuo1.c()) {
                        zq1.d = ProtoLiteMessage.E(hfuo1);
                    }
                    hfrj.E(iterable0, zq1.d);
                    hfwn hfwn0 = hfyn.h(hfyf.e((hduz0.c == null ? hfst.a : hduz0.c)) + v1);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    zq zq2 = (zq)hftp1.b_message;
                    hfwn0.getClass();
                    zq2.e = hfwn0;
                    zq2.b |= 2;
                    hfwn hfwn1 = hfyn.h(v1);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    zq zq3 = (zq)hftp1.b_message;
                    hfwn1.getClass();
                    zq3.f = hfwn1;
                    zq3.b |= 4;
                    arrayList0.add(((zq)hftp1.N_build()));
                }
                SharedPreferences.Editor sharedPreferences$Editor0 = gbkz0.a.edit();
                String s1 = gbkz.d(hckh0, zr2);
                zs zs0 = gbkz0.b(s1);
                if(zs0 == null) {
                    zs0 = zs.a;
                }
                Set set0 = hashMap0.keySet();
                for(Object object3: zs0.b) {
                    zq zq4 = (zq)object3;
                    if(!set0.contains(zq4.c)) {
                        arrayList0.add(zq4);
                    }
                }
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)zs0).jf(5, null);
                hftp2.X(((ProtoLiteMessage)zs0));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((zs)hftp2.b_message).b = hfvv.a;
                hftp2.Z(arrayList0);
                sharedPreferences$Editor0.putString(s1, gawi.l(((MessageLite)(((zs)hftp2.N_build())))));
                sharedPreferences$Editor0.apply();
                break;
            }
            case 1005: {
                break;
            }
            default: {
                return new ganp(ganp.d(ganp0.a()));
            }
        }
        return new ganp(ganp.e(0));
    }
}

