import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.SkuDetails;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;
import org.json.JSONObject;

public class rbo {
    public final Object a;
    public volatile int b;
    public final String c;
    public final String d;
    public final Handler e;
    public volatile rbm f;
    public Context g;
    public rck h;
    public boolean i;
    public int j;
    public boolean k;
    public rct l;
    public final String m;
    public final Long n;
    public final rdh o;
    public gfuv p;
    public volatile snw q;
    private volatile rbx r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private volatile rby y;
    private ExecutorService z;

    public rbo() {
        throw null;
    }

    public rbo(String s, rct rct0, Context context0, rbn rbn0) {
        this.a = new Object();
        this.b = 0;
        this.e = new Handler(Looper.getMainLooper());
        this.j = 0;
        Long long0 = new Random().nextLong();
        this.n = long0;
        this.o = rdg.a;
        this.p = gfqs.a;
        this.m = s;
        this.c = "8.1.0";
        String s1 = rbo.t();
        this.d = s1;
        this.g = context0.getApplicationContext();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgyh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgyh.d(((hgyh)hftp0.b_message));
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgyh hgyh0 = (hgyh)hftp0.b_message;
            hgyh0.b |= 2;
            hgyh0.c = s1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgyh hgyh1 = (hgyh)hftp0.b_message;
        "com.google.android.gms".getClass();
        hgyh1.b |= 4;
        hgyh1.d = "com.google.android.gms";
        long v = (long)long0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgyh hgyh2 = (hgyh)hftp0.b_message;
        hgyh2.b |= 16;
        hgyh2.f = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgyh.c(((hgyh)hftp0.b_message));
        int v1 = Build.VERSION.SDK_INT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hgyh)hftv0).b |= 0x80;
        ((hgyh)hftv0).h = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgyh.b(((hgyh)hftp0.b_message));
        try {
            int v2 = this.g.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgyh hgyh3 = (hgyh)hftp0.b_message;
            hgyh3.b |= 0x100;
            hgyh3.i = v2;
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Error getting app version code.", throwable0);
        }
        this.h = new rcp(this.g, ((hgyh)hftp0.N_build()));
        rdk.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new rbm(this.g, null, this.h);
        this.l = rct0;
        this.g.getPackageName();
        this.u(this.g);
    }

    public rbo(String s, rct rct0, Context context0, rdd rdd0, rbn rbn0) {
        this.a = new Object();
        this.b = 0;
        this.e = new Handler(Looper.getMainLooper());
        this.j = 0;
        Long long0 = new Random().nextLong();
        this.n = long0;
        this.o = rdg.a;
        this.p = gfqs.a;
        this.m = s;
        this.c = "8.1.0";
        String s1 = rbo.t();
        this.d = s1;
        this.g = context0.getApplicationContext();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgyh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgyh.d(((hgyh)hftp0.b_message));
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgyh hgyh0 = (hgyh)hftp0.b_message;
            hgyh0.b |= 2;
            hgyh0.c = s1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgyh hgyh1 = (hgyh)hftp0.b_message;
        "com.google.android.gms".getClass();
        hgyh1.b |= 4;
        hgyh1.d = "com.google.android.gms";
        long v = (long)long0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgyh hgyh2 = (hgyh)hftp0.b_message;
        hgyh2.b |= 16;
        hgyh2.f = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgyh.c(((hgyh)hftp0.b_message));
        int v1 = Build.VERSION.SDK_INT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hgyh)hftv0).b |= 0x80;
        ((hgyh)hftv0).h = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgyh.b(((hgyh)hftp0.b_message));
        try {
            int v2 = this.g.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgyh hgyh3 = (hgyh)hftp0.b_message;
            hgyh3.b |= 0x100;
            hgyh3.i = v2;
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Error getting app version code.", throwable0);
        }
        this.h = new rcp(this.g, ((hgyh)hftp0.N_build()));
        if(rdd0 == null) {
            rdk.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new rbm(this.g, rdd0, this.h);
        this.l = rct0;
        this.g.getPackageName();
        this.u(this.g);
    }

    private final void A(int v, rcm rcm0, String s, long v1) {
        try {
            this.z(rcj.d(v, 2, rcm0, s, hgyf.a), v1);
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
    }

    private final void B(int v, rcm rcm0, long v1) {
        hgyh hgyh2;
        try {
            hgxx hgxx0 = rcj.b(v, 2, rcm0);
            try {
                rck rck0 = this.h;
                int v2 = this.j;
                try {
                    hgyh hgyh0 = ((rcp)rck0).b;
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyh0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)hgyh0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hgyh hgyh1 = (hgyh)hftp0.b_message;
                    hgyh1.b |= 8;
                    hgyh1.e = v2;
                    ((rcp)rck0).b = (hgyh)hftp0.N_build();
                    if(v1 == 0L) {
                        hgyh2 = ((rcp)rck0).b;
                    }
                    else {
                        hgyh hgyh3 = ((rcp)rck0).b;
                        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyh3).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)hgyh3));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hgyh hgyh4 = (hgyh)hftp1.b_message;
                        hgyh4.b |= 0x20;
                        hgyh4.g = v1;
                        hgyh2 = (hgyh)hftp1.N_build();
                    }
                    ((rcp)rck0).f(hgxx0, hgyh2);
                }
                catch(Throwable throwable2) {
                    rdk.i("BillingLogger", "Unable to log.", throwable2);
                }
            }
            catch(Throwable throwable1) {
                rdk.i("BillingClient", "Unable to log.", throwable1);
            }
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
    }

    private final void C(int v, rcm rcm0, long v1) {
        try {
            this.z(rcj.b(v, 2, rcm0), v1);
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
    }

    public static rcm b(Exception exception0) {
        return (exception0 instanceof DeadObjectException) ? rcn.g : rcn.e;
    }

    public rcm c(Activity activity0, rci rci0) {
        int v18;
        String s19;
        long v17;
        int v16;
        rcm rcm1;
        Bundle bundle1;
        Future future0;
        int v14;
        boolean z1;
        rcf rcf6;
        String s15;
        rcf rcf8;
        CharSequence charSequence2;
        rcv rcv0;
        String s3;
        CharSequence charSequence1;
        String s2;
        SkuDetails skuDetails1;
        rcm rcm0;
        String s1;
        String s;
        long v = new Random().nextLong();
        if(this.f != null && this.f.b != null) {
            if(!this.m(rco.a)) {
                this.B(2, rcn.g, v);
                this.p(rcn.g);
                return rcn.g;
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(rci0.e);
            gged_interceptors gged0 = rci0.d;
            CharSequence charSequence0 = null;
            SkuDetails skuDetails0 = (SkuDetails)gggq.o(arrayList0, null);
            rcf rcf0 = (rcf)gggq.o(gged0, null);
            if(skuDetails0 == null) {
                s1 = rcf0.a.b;
                s = rcf0.a.a;
            }
            else {
                s = skuDetails0.b();
                s1 = skuDetails0.d();
            }
            if(s1.equals("subs") && !this.i) {
                rdk.h("BillingClient", "Current client doesn\'t support subscriptions.");
                this.C(9, rcn.i, v);
                this.p(rcn.i);
                return rcn.i;
            }
            if(rci0.b == null && (rci0.c.a == null && rci0.c.b == 0 && !rci0.a && !rci0.f)) {
                gged_interceptors gged1 = rci0.d;
                if(gged1 != null) {
                    int v1 = gged1.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        rcf rcf1 = (rcf)gged1.get(v2);
                    }
                }
            }
            else if(!this.s) {
                rdk.h("BillingClient", "Current client doesn\'t support extra params for buy intent.");
                this.C(18, rcn.d, v);
                this.p(rcn.d);
                return rcn.d;
            }
            if(arrayList0.size() > 1 && !this.k) {
                rdk.h("BillingClient", "Current client doesn\'t support multi-item purchases.");
                this.C(19, rcn.j, v);
                this.p(rcn.j);
                return rcn.j;
            }
            if(!gged0.isEmpty() && !this.w) {
                rdk.h("BillingClient", "Current client doesn\'t support purchases with ProductDetails.");
                this.C(20, rcn.l, v);
                this.p(rcn.l);
                return rcn.l;
            }
            if(rci0.d.isEmpty()) {
                rcm0 = rcn.f;
                skuDetails1 = skuDetails0;
                s2 = s;
                charSequence1 = null;
                s3 = s1;
                goto label_122;
            }
            else {
                rcf rcf2 = (rcf)rci0.d.get(0);
                int v3 = 1;
                while(v3 < rci0.d.size()) {
                    String s4 = ((rcf)rci0.d.get(v3)).a.b;
                    charSequence1 = charSequence0;
                    if(!s4.equals(rcf2.a.b) && !s4.equals("play_pass_subs")) {
                        rcm0 = rcn.a(5, "All products should have same ProductType.");
                        skuDetails1 = skuDetails0;
                        s2 = s;
                        s3 = s1;
                        goto label_122;
                    }
                    ++v3;
                    charSequence0 = charSequence1;
                }
                charSequence1 = charSequence0;
                rcy rcy0 = rcf2.a;
                String s5 = rcy0.b();
                HashMap hashMap0 = new HashMap();
                HashSet hashSet0 = new HashSet();
                gged_interceptors gged2 = rci0.d;
                skuDetails1 = skuDetails0;
                int v4 = gged2.size();
                s2 = s;
                int v5 = 0;
            alab1:
                while(true) {
                    if(v5 >= v4) {
                        s3 = s1;
                        for(Object object0: hashSet0) {
                            String s7 = (String)object0;
                            if(!hashMap0.containsKey(s7)) {
                                continue;
                            }
                            rcf rcf4 = (rcf)hashMap0.get(s7);
                            rcm0 = rcn.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", s7));
                            break alab1;
                        }
                        List list0 = rcy0.f;
                        String s8 = rcf2.b;
                        if(s8 != null && list0 != null) {
                            for(Object object1: list0) {
                                rcv0 = (rcv)object1;
                                if(!s8.equals(rcv0.a)) {
                                    continue;
                                }
                                goto label_117;
                            }
                            rcv0 = charSequence1;
                        label_117:
                            if(rcv0 != null && rcv0.c != null) {
                                rcm0 = rcn.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                break;
                            }
                        }
                        rcm0 = rcn.f;
                        break;
                    }
                    rcf rcf3 = (rcf)gged2.get(v5);
                    rcy rcy1 = rcf3.a;
                    s3 = s1;
                    if(rcy1.e != null && rcf3.b == null) {
                        rcm0 = rcn.a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", rcy1.a));
                        break;
                    }
                    String s6 = rcy1.a;
                    if(hashMap0.containsKey(s6)) {
                        rcm0 = rcn.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", s6));
                        break;
                    }
                    hashMap0.put(s6, rcf3);
                    if(!rcy0.b.equals("play_pass_subs") && !rcy1.b.equals("play_pass_subs") && !s5.equals(rcy1.b())) {
                        rcm0 = rcn.a(5, "All products must have the same package name.");
                        break;
                    }
                    ++v5;
                    v4 = v4;
                    s1 = s3;
                }
            label_122:
                if(rcm0 != rcn.f) {
                    this.C(120, rcm0, v);
                    this.p(rcm0);
                    return rcm0;
                }
            }
            if(this.s) {
                boolean z = this.t;
                this.g.getPackageName();
                Bundle bundle0 = new Bundle();
                rdk.j(bundle0, this.d, this.n.longValue());
                bundle0.putLong("billingClientTransactionId", v);
                if(rci0.a() != 0) {
                    bundle0.putInt("prorationMode", rci0.a());
                }
                if(TextUtils.isEmpty(charSequence1)) {
                    charSequence2 = charSequence1;
                }
                else {
                    charSequence2 = charSequence1;
                    bundle0.putString("accountId", ((String)charSequence2));
                }
                if(!TextUtils.isEmpty(charSequence2)) {
                    bundle0.putString("obfuscatedProfileId", ((String)charSequence2));
                }
                if(rci0.f) {
                    bundle0.putBoolean("isOfferPersonalizedByDeveloper", true);
                }
                if(!TextUtils.isEmpty(charSequence2)) {
                    bundle0.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{charSequence2})));
                }
                if(!TextUtils.isEmpty(charSequence2)) {
                    bundle0.putString("oldSkuPurchaseToken", ((String)charSequence2));
                }
                if(!TextUtils.isEmpty(rci0.b())) {
                    bundle0.putString("oldSkuPurchaseId", rci0.b());
                }
                if(!TextUtils.isEmpty(charSequence2)) {
                    bundle0.putString("originalExternalTransactionId", ((String)charSequence2));
                }
                if(!TextUtils.isEmpty(rci0.b)) {
                    bundle0.putString("paymentsPurchaseParams", rci0.b);
                }
                if(z) {
                    bundle0.putBoolean("enablePendingPurchases", true);
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object2: rci0.d) {
                    rcf rcf5 = (rcf)object2;
                }
                if(!arrayList1.isEmpty()) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfjk.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hfjk hfjk0 = (hfjk)hftp0.b_message;
                    hfuo hfuo0 = hfjk0.b;
                    if(!hfuo0.c()) {
                        hfjk0.b = ProtoLiteMessage.E(hfuo0);
                    }
                    hfrj.E(arrayList1, hfjk0.b);
                    bundle0.putByteArray("subscriptionProductReplacementParamsList", ((hfjk)hftp0.N_build()).toBytesArray());
                }
                if(arrayList0.isEmpty()) {
                    ArrayList arrayList9 = new ArrayList(gged0.size() - 1);
                    ArrayList arrayList10 = new ArrayList(gged0.size() - 1);
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    ArrayList arrayList14 = new ArrayList();
                    int v13 = 0;
                    while(v13 < gged0.size()) {
                        rcf rcf7 = (rcf)gged0.get(v13);
                        rcy rcy2 = rcf7.a;
                        String s12 = rcy2.c;
                        if(!s12.isEmpty()) {
                            arrayList11.add(s12);
                        }
                        String s13 = rcf7.b;
                        arrayList12.add(s13);
                        List list1 = rcy2.f;
                        if(!TextUtils.isEmpty(s13) && list1 != null && !list1.isEmpty()) {
                            Iterator iterator4 = list1.iterator();
                            while(iterator4.hasNext()) {
                                Object object4 = iterator4.next();
                                rcf8 = rcf0;
                                String s14 = ((rcv)object4).b;
                                if(!TextUtils.isEmpty(s14) && Objects.equals(((rcv)object4).a, s13)) {
                                    s15 = s14;
                                    goto label_258;
                                }
                                iterator4 = iterator4;
                                rcf0 = rcf8;
                            }
                        }
                        rcf8 = rcf0;
                        s15 = rcy2.d;
                    label_258:
                        if(!TextUtils.isEmpty(s15)) {
                            arrayList13.add(s15);
                        }
                        if(v13 > 0) {
                            arrayList9.add(((rcf)gged0.get(v13)).a.a);
                            arrayList10.add(((rcf)gged0.get(v13)).a.b);
                        }
                        ++v13;
                        rcf0 = rcf8;
                    }
                    rcf6 = rcf0;
                    bundle0.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList12);
                    if(!arrayList14.isEmpty()) {
                        bundle0.putIntegerArrayList("autoPayBalanceThresholdList", arrayList14);
                    }
                    if(!arrayList11.isEmpty()) {
                        bundle0.putStringArrayList("skuDetailsTokens", arrayList11);
                    }
                    if(!arrayList13.isEmpty()) {
                        bundle0.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList13);
                    }
                    if(!arrayList9.isEmpty()) {
                        bundle0.putStringArrayList("additionalSkus", arrayList9);
                        bundle0.putStringArrayList("additionalSkuTypes", arrayList10);
                    }
                }
                else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    int v6 = 0;
                    int v7 = 0;
                    int v8 = 0;
                    int v9 = 0;
                    Iterator iterator3 = arrayList0.iterator();
                    while(iterator3.hasNext()) {
                        Object object3 = iterator3.next();
                        SkuDetails skuDetails2 = (SkuDetails)object3;
                        if(!skuDetails2.c().isEmpty()) {
                            arrayList2.add(skuDetails2.c());
                        }
                        JSONObject jSONObject0 = skuDetails2.a;
                        String s9 = jSONObject0.optString("offerIdToken");
                        if(s9.isEmpty()) {
                            s9 = jSONObject0.optString("offer_id_token");
                        }
                        String s10 = jSONObject0.optString("offer_id");
                        int v10 = jSONObject0.optInt("offer_type");
                        String s11 = jSONObject0.optString("serializedDocid");
                        arrayList3.add(s9);
                        int v11 = v6 | TextUtils.isEmpty(s9) ^ 1;
                        arrayList4.add(s10);
                        v7 |= TextUtils.isEmpty(s10) ^ 1;
                        arrayList5.add(Integer.valueOf(v10));
                        v8 |= (v10 == 0 ? 0 : 1);
                        v9 |= TextUtils.isEmpty(s11) ^ 1;
                        arrayList6.add(s11);
                        iterator3 = iterator3;
                        v6 = v11;
                    }
                    if(!arrayList2.isEmpty()) {
                        bundle0.putStringArrayList("skuDetailsTokens", arrayList2);
                    }
                    if(v6 != 0) {
                        bundle0.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList3);
                    }
                    if(v7 != 0) {
                        bundle0.putStringArrayList("SKU_OFFER_ID_LIST", arrayList4);
                    }
                    if(v8 != 0) {
                        bundle0.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList5);
                    }
                    if(v9 != 0) {
                        bundle0.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                    }
                    if(arrayList0.size() > 1) {
                        ArrayList arrayList7 = new ArrayList(arrayList0.size() - 1);
                        ArrayList arrayList8 = new ArrayList(arrayList0.size() - 1);
                        for(int v12 = 1; v12 < arrayList0.size(); ++v12) {
                            arrayList7.add(((SkuDetails)arrayList0.get(v12)).b());
                            arrayList8.add(((SkuDetails)arrayList0.get(v12)).d());
                        }
                        bundle0.putStringArrayList("additionalSkus", arrayList7);
                        bundle0.putStringArrayList("additionalSkuTypes", arrayList8);
                    }
                    rcf6 = rcf0;
                }
                if(bundle0.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.u) {
                    this.C(21, rcn.k, v);
                    this.p(rcn.k);
                    return rcn.k;
                }
                if(skuDetails1 != null && !TextUtils.isEmpty(skuDetails1.a())) {
                    bundle0.putString("skuPackageName", skuDetails1.a());
                    z1 = true;
                }
                else if(rcf6 == null) {
                    z1 = false;
                }
                else {
                    rcy rcy3 = rcf6.a;
                    if(TextUtils.isEmpty(rcy3.b())) {
                        z1 = false;
                    }
                    else {
                        bundle0.putString("skuPackageName", rcy3.b());
                        z1 = true;
                    }
                }
                String s16 = this.m;
                if(!TextUtils.isEmpty(s16)) {
                    bundle0.putString("accountName", s16);
                }
                Intent intent0 = activity0.getIntent();
                if(intent0 == null) {
                    rdk.h("BillingClient", "Activity\'s intent is null.");
                }
                else if(!TextUtils.isEmpty(intent0.getStringExtra("PROXY_PACKAGE"))) {
                    String s17 = intent0.getStringExtra("PROXY_PACKAGE");
                    bundle0.putString("proxyPackage", s17);
                    try {
                        bundle0.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(s17, 0).versionName);
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        bundle0.putString("proxyPackageVersion", "package not found");
                    }
                }
                if(this.w && !gged0.isEmpty()) {
                    v14 = 17;
                }
                else if(this.v && z1) {
                    v14 = 15;
                }
                else {
                    v14 = this.t ? 9 : 6;
                }
                future0 = this.e(() -> {
                    snw snw0;
                    try {
                        synchronized(this.a) {
                            snw0 = this.q;
                        }
                        if(snw0 == null) {
                            return rdk.k(rcn.g, 0x77);
                        }
                        Parcel parcel0 = snw0.jo();
                        parcel0.writeInt(v14);
                        parcel0.writeString("com.google.android.gms");
                        parcel0.writeString(s2);
                        parcel0.writeString(s3);
                        parcel0.writeString(null);
                        wbz.f(parcel0, bundle0);
                        Parcel parcel1 = snw0.hM(8, parcel0);
                        Bundle bundle1 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
                        parcel1.recycle();
                        return bundle1;
                    }
                    catch(DeadObjectException deadObjectException0) {
                        String s2 = rcj.a(deadObjectException0);
                        return rdk.l(rcn.g, s2);
                    }
                    catch(Exception exception0) {
                        String s3 = rcj.a(exception0);
                        return rdk.l(rcn.e, s3);
                    }
                }, 5000L, null, this.e);
            }
            else {
                future0 = this.e(() -> {
                    snw snw0;
                    try {
                        synchronized(this.a) {
                            snw0 = this.q;
                        }
                        if(snw0 == null) {
                            return rdk.k(rcn.g, 0x77);
                        }
                        Parcel parcel0 = snw0.jo();
                        parcel0.writeInt(3);
                        parcel0.writeString("com.google.android.gms");
                        parcel0.writeString(s2);
                        parcel0.writeString(s3);
                        parcel0.writeString(null);
                        Parcel parcel1 = snw0.hM(3, parcel0);
                        Bundle bundle0 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
                        parcel1.recycle();
                        return bundle0;
                    }
                    catch(DeadObjectException deadObjectException0) {
                        String s2 = rcj.a(deadObjectException0);
                        return rdk.l(rcn.g, s2);
                    }
                    catch(Exception exception0) {
                        String s3 = rcj.a(exception0);
                        return rdk.l(rcn.e, s3);
                    }
                }, 5000L, null, this.e);
            }
            try {
                if(future0 == null) {
                    this.C(25, rcn.b, v);
                    this.p(rcn.b);
                    return rcn.b;
                }
                bundle1 = (Bundle)future0.get(5000L, TimeUnit.MILLISECONDS);
                int v15 = rdk.a(bundle1, "BillingClient");
                String s18 = rdk.f(bundle1, "BillingClient");
                if(v15 != 0) {
                    rdk.h("BillingClient", "Unable to buy item, Error response code: " + v15);
                    rcm1 = rcn.a(v15, s18);
                    if(bundle1 != null) {
                        try {
                            Object object5 = bundle1.get("LOG_REASON");
                            if(object5 == null) {
                                goto label_337;
                            }
                            else if((object5 instanceof Integer)) {
                                v16 = hgyb.a(((Integer)object5).intValue());
                            }
                            else {
                                rdk.h("BillingClient", "Unexpected type for bundle log reason: " + object5.getClass().getName());
                                goto label_337;
                            }
                            goto label_340;
                        }
                        catch(Throwable throwable0) {
                            rdk.h("BillingClient", "Failed to get log reason from bundle: " + throwable0.getMessage());
                        }
                    }
                label_337:
                    v16 = 1;
                label_340:
                    if(v16 == 1) {
                        v16 = 23;
                    }
                    if(bundle1 == null) {
                        goto label_356;
                    }
                    else {
                        try {
                            v17 = v;
                            s19 = bundle1.getString("ADDITIONAL_LOG_DETAILS");
                            v18 = v16;
                        }
                        catch(Throwable throwable1) {
                            rdk.h("BillingClient", "Failed to get additional log details from bundle: " + throwable1.getMessage());
                            goto label_356;
                        }
                    }
                    goto label_359;
                }
                goto label_362;
            }
            catch(TimeoutException | CancellationException exception1) {
                v17 = v;
                goto label_370;
            }
            catch(Exception exception0) {
                v17 = v;
                goto label_376;
            }
        label_356:
            v17 = v;
            v18 = v16;
            s19 = null;
            try {
            label_359:
                this.A(v18, rcm1, s19, v17);
                this.p(rcm1);
                return rcm1;
            label_362:
                v17 = v;
                Intent intent1 = new Intent(activity0, ProxyBillingActivity.class);
                intent1.putExtra("BUY_INTENT", ((PendingIntent)bundle1.getParcelable("BUY_INTENT")));
                intent1.putExtra("billingClientTransactionId", v17);
                intent1.putExtra("wasServiceAutoReconnected", false);
                activity0.startActivity(intent1);
                return rcn.f;
            }
            catch(TimeoutException | CancellationException exception1) {
            label_370:
                rdk.i("BillingClient", "Time out while launching billing flow. Try to reconnect", exception1);
                String s20 = rcj.a(exception1);
                this.A(4, rcn.h, s20, v17);
                this.p(rcn.h);
                return rcn.h;
            }
            catch(Exception exception0) {
            }
        label_376:
            rdk.i("BillingClient", "Exception while launching billing flow. Try to reconnect", exception0);
            String s21 = rcj.a(exception0);
            this.A(5, rcn.g, s21, v17);
            this.p(rcn.g);
            return rcn.g;
        }
        this.B(12, rcn.m, v);
        return rcn.m;
    }

    public final ExecutorService d() {
        synchronized(this) {
            if(this.z == null) {
                rbt rbt0 = new rbt(this);
                this.z = Executors.newFixedThreadPool(rdk.a, rbt0);
            }
        }
        return this.z;
    }

    public final Future e(Callable callable0, long v, Runnable runnable0, Handler handler0) {
        Future future0;
        ExecutorService executorService0 = this.d();
        try {
            future0 = executorService0.submit(callable0);
        }
        catch(Exception exception0) {
            rdk.i("BillingClient", "Async task throws exception!", exception0);
            return null;
        }
        handler0.postDelayed(new rbs(future0, runnable0), ((long)(((double)v) * 0.95)));
        return future0;
    }

    public void f() {
        this.r(12);
        synchronized(this.a) {
            try {
                if(this.f != null) {
                    rbm rbm0 = this.f;
                    rbm0.d.b(rbm0.a);
                    rbm0.e.b(rbm0.a);
                }
            }
            catch(Throwable throwable0) {
                rdk.i("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", throwable0);
            }
        }
        try {
            this.l();
        }
        catch(Throwable throwable1) {
            rdk.i("BillingClient", "There was an exception while unbinding from the service while ending connection!", throwable1);
        }
        try {
            this.w();
        }
        catch(Throwable throwable2) {
            rdk.i("BillingClient", "There was an exception while shutting down the executor service while ending connection!", throwable2);
        }
        finally {
            this.v(3);
            this.y = null;
        }
    }

    public final void g(hgxx hgxx0) {
        try {
            rck rck0 = this.h;
            int v = this.j;
            try {
                hgyh hgyh0 = ((rcp)rck0).b;
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyh0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hgyh0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgyh hgyh1 = (hgyh)hftp0.b_message;
                hgyh1.b |= 8;
                hgyh1.e = v;
                ((rcp)rck0).b = (hgyh)hftp0.N_build();
                ((rcp)rck0).a(hgxx0);
            }
            catch(Throwable throwable1) {
                rdk.i("BillingLogger", "Unable to log.", throwable1);
            }
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
    }

    public final void h(hgxz hgxz0) {
        try {
            rck rck0 = this.h;
            int v = this.j;
            try {
                hgyh hgyh0 = ((rcp)rck0).b;
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyh0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hgyh0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgyh hgyh1 = (hgyh)hftp0.b_message;
                hgyh1.b |= 8;
                hgyh1.e = v;
                ((rcp)rck0).b = (hgyh)hftp0.N_build();
                ((rcp)rck0).c(hgxz0);
            }
            catch(Throwable throwable1) {
                rdk.i("BillingLogger", "Unable to log.", throwable1);
            }
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
    }

    public final void i(int v) {
        this.j = v;
        boolean z = true;
        this.x = v >= 21;
        this.w = v >= 17;
        this.k = v >= 16;
        this.v = v >= 15;
        this.u = v >= 14;
        this.t = v >= 9;
        if(v < 6) {
            z = false;
        }
        this.s = z;
    }

    public final void j(int v) {
        rbm rbm0;
        if(v == 0) {
            synchronized(this.a) {
                if(this.b == 3) {
                    return;
                }
                this.v(2);
                rbm0 = this.f == null ? null : this.f;
            }
            if(rbm0 != null) {
                boolean z = this.x;
                IntentFilter intentFilter0 = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                IntentFilter intentFilter1 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                intentFilter1.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                rbm0.f = z;
                Context context0 = rbm0.a;
                rbm0.e.a(context0, intentFilter1);
                if(rbm0.f) {
                    rbm0.d.c(context0, intentFilter0);
                    return;
                }
                rbm0.d.a(context0, intentFilter0);
            }
            return;
        }
        this.v(0);
    }

    public void k(rby rby0) {
        rcm rcm1;
        rcm rcm0;
        Object object0 = this.a;
        __monitor_enter(object0);
        try {
            if(this.x()) {
                goto label_66;
            }
            else {
                switch(this.b) {
                    case 1: {
                        goto label_56;
                    }
                    case 3: {
                        goto label_60;
                    }
                    default: {
                        this.v(1);
                        this.y = rby0;
                        this.l();
                        this.r = new rbx(this, rby0);
                        gfug gfug0 = this.r.a;
                        gfug0.e();
                        gfug0.f();
                        goto label_11;
                    }
                }
            }
            goto label_72;
        }
        catch(Throwable throwable0) {
            goto label_69;
        }
    label_11:
        __monitor_exit(object0);
        Intent intent0 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent0.setPackage("com.android.vending");
        List list0 = this.g.getPackageManager().queryIntentServices(intent0, 0);
        int v = 41;
        if(list0 != null && !list0.isEmpty()) {
            ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(0);
            if(resolveInfo0.serviceInfo == null) {
                rdk.h("BillingClient", "The device doesn\'t have valid Play Store.");
                v = 40;
                goto label_52;
            }
            else {
                String s = resolveInfo0.serviceInfo.packageName;
                String s1 = resolveInfo0.serviceInfo.name;
                if(Objects.equals(s, "com.android.vending") && s1 != null) {
                    ComponentName componentName0 = new ComponentName(s, s1);
                    Intent intent1 = new Intent(intent0);
                    intent1.setComponent(componentName0);
                    intent1.putExtra("playBillingLibraryVersion", this.c);
                    Object object1 = this.a;
                    __monitor_enter(object1);
                    int v1 = FIN.finallyOpen$NT();
                    switch(this.b) {
                        case 1: {
                            FIN.finallyExec$NT(v1);
                            if(this.g.bindService(intent1, this.r, 1)) {
                                rcm0 = null;
                            }
                            else {
                                rdk.h("BillingClient", "Connection to Billing service is blocked.");
                                v = 39;
                                goto label_52;
                            }
                            break;
                        }
                        case 2: {
                            rcm0 = this.y();
                            FIN.finallyExec$NT(v1);
                            break;
                        }
                        default: {
                            rdk.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                            this.s(0x75, rcn.g);
                            FIN.finallyCodeBegin$NT(v1);
                            try {
                                rcm0 = rcn.g;
                            }
                            catch(Throwable throwable0) {
                                goto label_69;
                            }
                        }
                    }
                }
                else {
                    rdk.h("BillingClient", "The device doesn\'t have valid Play Store.");
                    v = 40;
                    goto label_52;
                }
            }
        }
        else {
        label_52:
            this.v(0);
            this.s(v, rcn.a);
            rcm0 = rcn.a;
            goto label_72;
            try {
            label_56:
                rdk.h("BillingClient", "Client is already in the process of connecting to billing service.");
                rcm1 = rcn.c;
                this.s(37, rcm1);
                goto label_63;
            label_60:
                rdk.h("BillingClient", "Client was already closed and can\'t be reused. Please create another instance.");
                rcm1 = rcn.g;
                this.s(38, rcm1);
            }
            catch(Throwable throwable0) {
                goto label_69;
            }
        label_63:
            __monitor_exit(object0);
            try {
                rcm0 = rcm1;
                goto label_72;
            label_66:
                rcm0 = this.y();
            }
            catch(Throwable throwable0) {
            label_69:
                __monitor_exit(object0);
                throw throwable0;
            }
            __monitor_exit(object0);
        }
    label_72:
        if(rcm0 != null) {
            rby0.b(rcm0);
        }
    }

    public final void l() {
        Object object0 = this.a;
        __monitor_enter(object0);
        try {
            if(this.r != null) {
                this.g.unbindService(this.r);
                this.q = null;
                this.r = null;
            }
        }
        catch(Throwable throwable0) {
            try {
                rdk.i("BillingClient", "There was an exception while unbinding service!", throwable0);
                this.q = null;
                this.r = null;
                goto label_18;
            }
            catch(Throwable throwable1) {
                try {
                    this.q = null;
                    this.r = null;
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                }
            }
            __monitor_exit(object0);
            throw throwable2;
        }
    label_18:
        __monitor_exit(object0);
    }

    public final boolean m(long v) {
        try {
            int v1 = ((rcm)gmbu.i(rcn.f).get(v, TimeUnit.MILLISECONDS)).a;
            if(v1 != 0) {
                rdk.h("BillingClient", "Reconnection failed with result: " + v1);
                return this.x();
            }
        }
        catch(Exception exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            rdk.i("BillingClient", "Error during reconnection attempt: ", exception0);
            return this.x();
        }
        return this.x();
    }

    public final boolean n() {
        boolean z = true;
        synchronized(this.a) {
            if(this.b != 1) {
                z = false;
            }
        }
        return z;
    }

    public static void o(rbo rbo0) {
        rbo0.v(0);
    }

    public final void p(rcm rcm0) {
        if(Thread.interrupted()) {
            return;
        }
        rbr rbr0 = new rbr(this, rcm0);
        this.e.post(rbr0);
    }

    public final void r(int v) {
        try {
            this.h(rcj.e(v));
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
    }

    public final void s(int v, rcm rcm0) {
        try {
            hgxx hgxx0 = rcj.b(v, 6, rcm0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hgxx0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hgxx0));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgyr.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((hgyr)hftv0).b |= 8;
            ((hgyr)hftv0).e = false;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgyr hgyr0 = (hgyr)hftp1.b_message;
            hgyr0.b |= 16;
            hgyr0.f = 0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgxx hgxx1 = (hgxx)hftp0.b_message;
            hgyr hgyr1 = (hgyr)hftp1.N_build();
            hgyr1.getClass();
            hgxx1.d = hgyr1;
            hgxx1.c = 6;
            this.g(((hgxx)hftp0.N_build()));
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
    }

    private static String t() {
        try {
            return (String)Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private final void u(Context context0) {
        gmcd gmcd0;
        try {
            fpim fpim0 = fpim.b(context0);
            gmcd0 = fpim0 == null ? gmbx.a : fpim0.f().e(iaeu.a(context0), 1, new String[]{"PLAY_BILLING_LIBRARY"});
        }
        catch(RuntimeException runtimeException0) {
            gmcd0 = gmbu.h(runtimeException0);
        }
        gmbu.t(gmcd0, new rbu(this), this.d());
    }

    private final void v(int v) {
        synchronized(this.a) {
            if(this.b == 3) {
                return;
            }
            this.b = v;
        }
    }

    private final void w() {
        synchronized(this) {
            ExecutorService executorService0 = this.z;
            if(executorService0 != null) {
                executorService0.shutdownNow();
                this.z = null;
            }
        }
    }

    private final boolean x() {
        boolean z = false;
        synchronized(this.a) {
            if(this.b == 2 && this.q != null && this.r != null) {
                z = true;
            }
        }
        return z;
    }

    private final rcm y() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgxz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgxz)hftp0.b_message).e = 5;
        ((hgxz)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgyr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hgyr)hftv0).b |= 2;
        ((hgyr)hftv0).c = true;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hgyr)hftv1).b |= 8;
        ((hgyr)hftv1).e = false;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        hgyr hgyr0 = (hgyr)hftp1.b_message;
        hgyr0.b |= 16;
        hgyr0.f = 0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgxz hgxz0 = (hgxz)hftp0.b_message;
        hgyr hgyr1 = (hgyr)hftp1.N_build();
        hgyr1.getClass();
        hgxz0.d = hgyr1;
        hgxz0.c = 3;
        this.h(((hgxz)hftp0.N_build()));
        return rcn.f;
    }

    private final void z(hgxx hgxx0, long v) {
        hgyh hgyh2;
        try {
            rck rck0 = this.h;
            int v1 = this.j;
            try {
                hgyh hgyh0 = ((rcp)rck0).b;
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyh0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hgyh0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgyh hgyh1 = (hgyh)hftp0.b_message;
                hgyh1.b |= 8;
                hgyh1.e = v1;
                ((rcp)rck0).b = (hgyh)hftp0.N_build();
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hgxx0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)hgxx0));
                hgyn hgyn0 = hgxx0.c == 7 ? ((hgyn)hgxx0.d) : hgyn.a;
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyn0).jf(5, null);
                hftp2.X(((ProtoLiteMessage)hgyn0));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hgyn hgyn1 = (hgyn)hftp2.b_message;
                hgyn1.b |= 2;
                hgyn1.e = false;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hgxx hgxx1 = (hgxx)hftp1.b_message;
                hgyn hgyn2 = (hgyn)hftp2.N_build();
                hgyn2.getClass();
                hgxx1.d = hgyn2;
                hgxx1.c = 7;
                hgxx hgxx2 = (hgxx)hftp1.N_build();
                if(v == 0L) {
                    hgyh2 = ((rcp)rck0).b;
                }
                else {
                    hgyh hgyh3 = ((rcp)rck0).b;
                    ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyh3).jf(5, null);
                    hftp3.X(((ProtoLiteMessage)hgyh3));
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hgyh hgyh4 = (hgyh)hftp3.b_message;
                    hgyh4.b |= 0x20;
                    hgyh4.g = v;
                    hgyh2 = (hgyh)hftp3.N_build();
                }
                ((rcp)rck0).f(hgxx2, hgyh2);
            }
            catch(Throwable throwable1) {
                rdk.i("BillingLogger", "Unable to log.", throwable1);
            }
        }
        catch(Throwable throwable0) {
            rdk.i("BillingClient", "Unable to log.", throwable0);
        }
    }
}

