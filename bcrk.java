import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.UserManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;

public final class bcrk {
    public final gged_interceptors a;
    private static final baun b;
    private static WeakReference c;
    private final bcrd d;
    private final bcqx e;
    private final boolean f;

    static {
        bcrk.b = bcrh.a("phone_util");
        bcrk.c = new WeakReference(null);
    }

    private bcrk(Context context0, bcrd bcrd0) {
        boolean z = hrff.a.b().o();
        this.f = z;
        this.e = bcqx.a(context0);
        this.d = bcrd0;
        ArrayList arrayList0 = new ArrayList();
        if(z) {
            arrayList0.add(bcrm.t(bcrd0));
        }
        else {
            SubscriptionManager subscriptionManager0 = SubscriptionManager.from(context0);
            try {
                List list0 = subscriptionManager0.getActiveSubscriptionInfoList();
                if(list0 != null && !list0.isEmpty()) {
                    HashSet hashSet0 = new HashSet();
                    HashSet hashSet1 = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    for(Object object0: list0) {
                        SubscriptionInfo subscriptionInfo0 = (SubscriptionInfo)object0;
                        if(subscriptionInfo0 != null) {
                            if(!hashSet0.add(Integer.valueOf(subscriptionInfo0.getSimSlotIndex()))) {
                                bcqx.a(context0).s(bcrd0, gmfz.bv);
                            }
                            if(!hashSet1.add(Integer.valueOf(subscriptionInfo0.getSubscriptionId()))) {
                                bcqx.a(context0).s(bcrd0, gmfz.bu);
                            }
                            arrayList0.add(bcrm.s(bcrd0, subscriptionInfo0));
                            if(!hashSet2.add(((bcrm)gggq.p(arrayList0)).k())) {
                                bcqx.a(context0).s(bcrd0, gmfz.bw);
                            }
                        }
                    }
                }
            }
            catch(SecurityException securityException0) {
                bcrk.b.g("No READ_PHONE_STATE permission", securityException0, new Object[0]);
                this.e.e(bcrd0, gmfz.K, securityException0);
            }
        }
        this.a = gged_interceptors.i(arrayList0);
    }

    public final int a(List list0, bcrd bcrd0, Context context0) {
        if(list0.isEmpty()) {
            throw new bcqi("Invalid IMSI.");
        }
        try {
            if(!this.f) {
                ggqk ggqk0 = this.a.E();
                while(ggqk0.hasNext()) {
                    Object object0 = ggqk0.next();
                    bcrm bcrm0 = (bcrm)object0;
                    if(list0.contains(bcrm0.k())) {
                        return bcrm0.d.getSubscriptionId();
                    }
                }
            }
            if(list0.contains(((TelephonyManager)context0.getSystemService("phone")).getSubscriberId())) {
                return -1;
            }
            throw new bcqi("No telephony manager is found for the given imsi.");
        }
        catch(SecurityException securityException0) {
            bcrk.b.g("No READ_PHONE_STATE permission", securityException0, new Object[0]);
            this.e.e(bcrd0, gmfz.K, securityException0);
            throw new bcqi("No telephony manager is found for the given imsi.");
        }
        return -1;
    }

    public static bcrk b(Context context0, bcrd bcrd0) {
        bcrk bcrk0;
        synchronized(bcrk.class) {
            bcrk0 = (bcrk)bcrk.c.get();
            if(bcrk0 == null) {
                bcrk0 = new bcrk(context0, bcrd0);
                bcrk.c = new WeakReference(bcrk0);
            }
            if(hrff.a.b().p() && bcrd0 != bcrk0.d) {
                bcrk bcrk1 = new bcrk(context0, bcrd0);
                bcrk.c = new WeakReference(bcrk1);
                return bcrk1;
            }
        }
        return bcrk0;
    }

    public final List c(bcrd bcrd0, Context context0) {
        List list0 = new ArrayList();
        bcri bcri0 = bcri.a(context0);
        if(!this.f) {
            gged_interceptors gged0 = this.a;
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                bcrm bcrm0 = (bcrm)gged0.get(v1);
                String s = bcrm0.k();
                String s1 = bcrm0.o();
                gged_interceptors gged1 = bcrm0.g();
                if(TextUtils.isEmpty(s)) {
                    this.e.d(bcrd0, gmfz.E, gmfx.Q);
                }
                else {
                    String s2 = bcrm0.d.getNumber();
                    String s3 = hrff.a.b().a() ? bcrm0.d.getIccId() : null;
                    String s4 = TextUtils.isEmpty(s1) ? null : s1.toUpperCase(Locale.ENGLISH);
                    if(s4 == null) {
                        s4 = bcri.c();
                    }
                    String s5 = bcri0.d(bcrd0, s2, s4);
                    list0.add(bcrj.a(s.toLowerCase(Locale.US), s5, s3, gged1));
                }
            }
            return list0;
        }
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        String s6 = telephonyManager0.getSubscriberId();
        if(!TextUtils.isEmpty(s6)) {
            String s7 = bcri0.d(bcrd0, telephonyManager0.getLine1Number(), bcri0.e());
            list0.add(bcrj.a(s6.toLowerCase(Locale.US), s7, null, ggna.a));
            return list0;
        }
        this.e.d(bcrd0, gmfz.E, gmfx.Q);
        return list0;
    }

    public final Map d(bcrd bcrd0, Context context0) {
        int v6;
        int v4;
        Map map0 = bcrd0.d;
        if(map0 != null) {
            return map0;
        }
        Map map1 = new HashMap();
        gged_interceptors gged0 = this.a;
        int v = gged0.size();
        for(int v1 = 0; true; ++v1) {
            Pair pair0 = null;
            int v2 = 5;
            if(v1 >= v) {
                break;
            }
            bcrm bcrm0 = (bcrm)gged0.get(v1);
            String s = bcrm0.k();
            if(TextUtils.isEmpty(s)) {
                bcqx.a(AppContextProvider.a()).d(bcrm0.b, gmfz.aw, gmfx.Q);
            }
            else {
                hogf hogf0 = (hogf)((ProtoLiteMessage)hogi.a).v_newBuilder();
                int v3 = bcrm0.b();
                Integer.valueOf(v3).getClass();
                switch(v3) {
                    case 1: {
                        v4 = 3;
                        break;
                    }
                    case 2: {
                        v4 = 4;
                        break;
                    }
                    case 3: {
                        v4 = 5;
                        break;
                    }
                    default: {
                        v4 = 2;
                    }
                }
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                ((hogi)hogf0.b_message).d = v4 - 2;
                String s1 = bcrm0.i();
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                ((hogi)hogf0.b_message).e = s1;
                hoge hoge0 = hoge.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hoge0).v_newBuilder();
                String s2 = bcrm0.o();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hoge)hftp0.b_message).b = s2;
                String s3 = bcrm0.p();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hoge)hftp0.b_message).c = s3;
                String s4 = bcrm0.q();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hoge)hftp0.b_message).d = s4;
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                hogi hogi0 = (hogi)hogf0.b_message;
                hoge hoge1 = (hoge)hftp0.N_build();
                hoge1.getClass();
                hogi0.f = hoge1;
                hogi0.b |= 1;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hoge0).v_newBuilder();
                String s5 = bcrm0.l();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hoge)hftp1.b_message).b = s5;
                String s6 = bcrm0.m();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hoge)hftp1.b_message).c = s6;
                String s7 = bcrm0.n();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hoge)hftp1.b_message).d = s7;
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                hogi hogi1 = (hogi)hogf0.b_message;
                hoge hoge2 = (hoge)hftp1.N_build();
                hoge2.getClass();
                hogi1.g = hoge2;
                hogi1.b |= 2;
                boolean z = bcrm0.r();
                Boolean.valueOf(z).getClass();
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                ((hogi)hogf0.b_message).h = (z ? 4 : 3) - 2;
                int v5 = bcrm0.e();
                Integer.valueOf(v5).getClass();
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                ((hogi)hogf0.b_message).c = (v5 == 5 ? 4 : 3) - 2;
                boolean z1 = bcrm0.c.isSmsCapable();
                Context context1 = AppContextProvider.a();
                if(jwe.a(context1, "android.permission.READ_SMS") == 0 && jwe.a(context1, "android.permission.SEND_SMS") == 0) {
                    Object object0 = context1.getSystemService("user");
                    gftb.check(object0);
                    if(((UserManager)object0).getUserRestrictions().getBoolean("no_sms")) {
                        v2 = 6;
                    }
                    else {
                        v2 = z1 ? 4 : 3;
                    }
                }
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                ((hogi)hogf0.b_message).j = v2 - 2;
                Object object1 = AppContextProvider.a().getSystemService("connectivity");
                gftb.check(object1);
                NetworkInfo networkInfo0 = ((ConnectivityManager)object1).getActiveNetworkInfo();
                if(networkInfo0 == null) {
                    v6 = 2;
                }
                else {
                    v6 = networkInfo0.isRoaming() ? 4 : 3;
                }
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                ((hogi)hogf0.b_message).i = v6 - 2;
                int v7 = bcrm0.f();
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                ((hogi)hogf0.b_message).m = v7;
                int v8 = bcrm0.a();
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                ((hogi)hogf0.b_message).n = v8;
                int v9 = bcrm0.u() ? 4 : 3;
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                ((hogi)hogf0.b_message).k = v9 - 2;
                int v10 = jwe.a(AppContextProvider.a(), "android.permission.SEND_SMS_NO_CONFIRMATION") == 0 ? 4 : 3;
                if(!hogf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hogf0).ensureMutable();
                }
                ((hogi)hogf0.b_message).l = v10 - 2;
                hrff hrff0 = hrff.a;
                if(hrff0.b().g()) {
                    String s8 = bcrm0.j();
                    if(!hogf0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hogf0).ensureMutable();
                    }
                    ((hogi)hogf0.b_message).p = s8;
                }
                if(hrff0.b().i()) {
                    hogh hogh0 = bcrm0.h();
                    if(!hogf0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hogf0).ensureMutable();
                    }
                    hogi hogi2 = (hogi)hogf0.b_message;
                    hogi2.q = hogh0.a();
                }
                if(hrff0.b().k()) {
                    boolean z2 = bcrm0.d == null ? false : bcrm0.d.isEmbedded();
                    if(!hogf0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hogf0).ensureMutable();
                    }
                    ((hogi)hogf0.b_message).o = z2;
                }
                if(hrff0.b().j()) {
                    long v11 = (long)bcrm0.c();
                    if(!hogf0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hogf0).ensureMutable();
                    }
                    ((hogi)hogf0.b_message).w = v11;
                }
                if(bcrm0.u() && hrfm.e() && !hrfm.a.c().i()) {
                    if(!hogf0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hogf0).ensureMutable();
                    }
                    ((hogi)hogf0.b_message).r = 1;
                }
                pair0 = new Pair(s, ((hogi)((ProtoLiteBuilder)hogf0).N_build()));
            }
            if(pair0 != null) {
                map1.put(((String)pair0.first), ((hogi)pair0.second));
            }
        }
        String s9 = ((bcbs)bbzr.b().a(context0)).c.getString("inactive_sims", null);
        ggeo ggeo0 = TextUtils.isEmpty(s9) ? ggnf.a : ggeo.k(ggkm.n(gfud.e(',').a(':').a(s9), new bcbr()));
        HashMap hashMap0 = new HashMap();
        for(Object object2: map1.entrySet()) {
            String s10 = (String)((Map.Entry)object2).getKey();
            hogi hogi3 = (hogi)((Map.Entry)object2).getValue();
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hogi3).jf(5, null);
            hftp2.X(((ProtoLiteMessage)hogi3));
            hogf hogf1 = (hogf)hftp2;
            if(hogf1 != null) {
                hoge hoge3 = ((hogi)hogf1.b_message).g;
                if(hoge3 == null) {
                    hoge3 = hoge.a;
                }
                if(hoge3.c.isEmpty()) {
                    hoge hoge4 = ((hogi)hogf1.b_message).g;
                    if(hoge4 == null) {
                        hoge4 = hoge.a;
                    }
                    if(hoge4.b.isEmpty()) {
                        long v12 = System.currentTimeMillis();
                        long v13 = ggeo0.containsKey(s10) ? ((long)(((Long)ggeo0.get(s10)))) : v12 + 1L;
                        hashMap0.put(s10, Long.valueOf(v13));
                        hoge hoge5 = ((hogi)hogf1.b_message).g;
                        if(hoge5 == null) {
                            hoge5 = hoge.a;
                        }
                        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)hoge5).jf(5, null);
                        hftp3.X(((ProtoLiteMessage)hoge5));
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((hoge)hftp3.b_message).e = (int)(v12 - v13);
                        if(!hogf1.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)hogf1).ensureMutable();
                        }
                        hogi hogi4 = (hogi)hogf1.b_message;
                        hoge hoge6 = (hoge)hftp3.N_build();
                        hoge6.getClass();
                        hogi4.g = hoge6;
                        hogi4.b |= 2;
                    }
                }
            }
            ((Map.Entry)object2).setValue(((hogi)((ProtoLiteBuilder)hogf1).N_build()));
        }
        bcbq bcbq0 = bbzr.b().a(context0);
        StringBuilder stringBuilder0 = new StringBuilder();
        Iterator iterator1 = hashMap0.entrySet().iterator();
        while(iterator1.hasNext()) {
            Object object3 = iterator1.next();
            stringBuilder0.append(((String)((Map.Entry)object3).getKey()));
            stringBuilder0.append(":");
            stringBuilder0.append(((Map.Entry)object3).getValue());
            if(iterator1.hasNext()) {
                stringBuilder0.append(",");
            }
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = ((bcbs)bcbq0).c.edit();
        sharedPreferences$Editor0.putString("inactive_sims", stringBuilder0.toString());
        sharedPreferences$Editor0.apply();
        bcrd0.d = map1;
        return map1;
    }

    public static final String e(String s) {
        byte[] arr_b;
        try {
            arr_b = new byte[0];
            arr_b = MessageDigest.getInstance("SHA-256").digest(s.getBytes());
        }
        catch(NoSuchAlgorithmException unused_ex) {
        }
        return arr_b.length == 0 ? "" : Base64.encodeToString(arr_b, 2);
    }

    public final Map f() {
        Map map0 = new HashMap();
        if(!this.f) {
            gged_interceptors gged0 = this.a;
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                bcrm bcrm0 = (bcrm)gged0.get(v1);
                map0.put(bcrm0.k(), Integer.valueOf(bcrm0.d.getSubscriptionId()));
            }
            return map0;
        }
        return null;
    }
}

