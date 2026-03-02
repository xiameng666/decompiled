import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import j..util.Objects;
import java.util.ArrayList;

final class rbl extends BroadcastReceiver {
    final rbm a;
    private boolean b;
    private final boolean c;

    public rbl(rbm rbm0, boolean z) {
        Objects.requireNonNull(rbm0);
        this.a = rbm0;
        super();
        this.c = z;
    }

    public final void a(Context context0, IntentFilter intentFilter0) {
        synchronized(this) {
            if(this.b) {
                return;
            }
            if(Build.VERSION.SDK_INT >= 33) {
                context0.registerReceiver(this, intentFilter0, (this.c ? 2 : 4));
            }
            else {
                context0.registerReceiver(this, intentFilter0);
            }
            this.b = true;
        }
    }

    public final void b(Context context0) {
        synchronized(this) {
            if(this.b) {
                context0.unregisterReceiver(this);
                this.b = false;
                return;
            }
            rdk.h("BillingBroadcastManager", "Receiver is not registered.");
        }
    }

    public final void c(Context context0, IntentFilter intentFilter0) {
        rbl rbl0;
        synchronized(this) {
        }
        if(this.b) {
            return;
        }
        try {
            if(Build.VERSION.SDK_INT >= 33) {
                rbl0 = this;
                context0.registerReceiver(rbl0, intentFilter0, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, (this.c ? 2 : 4));
            }
            else {
                rbl0 = this;
                context0.registerReceiver(rbl0, intentFilter0, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
            }
        }
        rbl0.b = true;
    }

    private final void d(Bundle bundle0, rcm rcm0, int v, hgyf hgyf0, long v1, boolean z) {
        try {
            if(bundle0.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                byte[] arr_b = bundle0.getByteArray("FAILURE_LOGGING_PAYLOAD");
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hgxx.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                this.a.c.b(((hgxx)hftv0), v1, z);
                return;
            }
            hgxx hgxx0 = rcj.c(23, v, rcm0, hgyf0);
            this.a.c.b(hgxx0, v1, z);
        }
        catch(Throwable unused_ex) {
            rdk.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        rbl rbl0;
        rcm rcm1;
        int v2;
        int v;
        hgyf hgyf0;
        switch(intent0.getAction()) {
            case "com.android.vending.billing.ALTERNATIVE_BILLING": {
                hgyf0 = hgyf.d;
                break;
            }
            case "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED": {
                hgyf0 = hgyf.c;
                break;
            }
            case "com.android.vending.billing.PURCHASES_UPDATED": {
                hgyf0 = hgyf.b;
                break;
            }
            default: {
                hgyf0 = hgyf.a;
            }
        }
        hgyf hgyf1 = hgyf.c;
        if(hgyf0.equals(hgyf1) || hgyf0.equals(hgyf.d)) {
            v = 2;
        }
        else if(hgyf0.equals(hgyf.b)) {
            v = 0x20;
        }
        else {
            v = 1;
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            rdk.h("BillingBroadcastManager", "Bundle is null.");
            rcm rcm0 = rcn.e;
            hgxx hgxx0 = rcj.c(11, v, rcm0, hgyf0);
            this.a.c.a(hgxx0);
            rdd rdd0 = this.a.b;
            if(rdd0 == null) {
                return;
            }
            rdd0.c(rcm0);
            return;
        }
        if(v == 2) {
            int v1 = rdk.a(intent0.getExtras(), "BillingBroadcastManager");
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 == null) {
                rdk.h("BillingBroadcastManager", "Unexpected null bundle received!");
                v2 = 0;
            }
            else {
                Object object0 = bundle1.get("SUB_RESPONSE_CODE");
                if(object0 == null) {
                    v2 = 0;
                }
                else if((object0 instanceof Integer)) {
                    v2 = (int)(((Integer)object0));
                }
                else {
                    rdk.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: " + object0.getClass().getName());
                    v2 = 0;
                }
            }
            rcm1 = rcl.a(v1, v2, rdk.f(intent0.getExtras(), "BillingBroadcastManager"));
        }
        else {
            rcm1 = rdk.c(intent0, "BillingBroadcastManager");
        }
        long v3 = bundle0.getLong("billingClientTransactionId", 0L);
        boolean z = bundle0.getBoolean("wasServiceAutoReconnected", false);
        if(!hgyf0.equals(hgyf.b) && !hgyf0.equals(hgyf1)) {
            if(hgyf0.equals(hgyf.d)) {
                if(rcm1.a != 0) {
                    this.d(bundle0, rcm1, v, hgyf0, v3, z);
                    this.a.b.c(rcm1);
                    return;
                }
                rdk.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                hgxx hgxx1 = rcj.c(77, v, rcn.e, hgyf0);
                this.a.c.b(hgxx1, v3, z);
                this.a.b.c(rcn.e);
            }
            return;
        }
        if(bundle0.getBoolean("IS_FIRST_PARTY_PURCHASE", false)) {
            rdk.h("BillingBroadcastManager", "Received 1P purchase and no valid 1P listener registered.");
            hgxx hgxx2 = rcj.c(0x7B, v, rcn.e, hgyf0);
            this.a.c.b(hgxx2, v3, z);
            return;
        }
        rbm rbm0 = this.a;
        if(rbm0.b != null) {
            if(rde.b(rbm0.a)) {
                ArrayList arrayList0 = bundle0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList arrayList1 = bundle0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if(arrayList0 != null && arrayList1 != null) {
                    for(int v4 = 0; v4 < arrayList0.size() && v4 < arrayList1.size(); ++v4) {
                        rdj rdj0 = rdk.e(((String)arrayList0.get(v4)), ((String)arrayList1.get(v4)));
                        Purchase purchase0 = rdj0.a;
                        if(purchase0 != null) {
                            arrayList2.add(purchase0);
                        }
                        arrayList3.add(rdj0.b);
                    }
                }
                else {
                    rdj rdj1 = rdk.e(bundle0.getString("INAPP_PURCHASE_DATA"), bundle0.getString("INAPP_DATA_SIGNATURE"));
                    arrayList3.add(rdj1.b);
                    Purchase purchase1 = rdj1.a;
                    if(purchase1 == null) {
                        arrayList2 = null;
                    }
                    else {
                        arrayList2.add(purchase1);
                    }
                }
                try {
                    if(rcm1.a == 0) {
                        if(arrayList2 == null || arrayList2.isEmpty()) {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgym.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((hgym)hftp0.b_message).c = (arrayList2 == null ? 8 : 7) - 1;
                            ((hgym)hftp0.b_message).b |= 1;
                            arrayList3.add(((hgym)hftp0.N_build()));
                        }
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgyn.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hgyn hgyn0 = (hgyn)hftp1.b_message;
                        hfuo hfuo0 = hgyn0.c;
                        if(!hfuo0.c()) {
                            hgyn0.c = ProtoLiteMessage.E(hfuo0);
                        }
                        hfrj.E(arrayList3, hgyn0.c);
                        for(Object object1: arrayList3) {
                            if(hgyl.a(((hgym)object1).c) == 2) {
                                continue;
                            }
                            else {
                                StringBuilder stringBuilder0 = new StringBuilder("Bundle: ");
                                for(Object object2: bundle0.keySet()) {
                                    stringBuilder0.append(((String)object2));
                                    stringBuilder0.append(":");
                                    stringBuilder0.append(bundle0.get(((String)object2)));
                                    stringBuilder0.append(" ");
                                }
                                String s = rdk.g(stringBuilder0.toString(), 200);
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                hgyn hgyn1 = (hgyn)hftp1.b_message;
                                s.getClass();
                                hgyn1.b |= 1;
                                hgyn1.d = s;
                            }
                            break;
                        }
                        rck rck0 = rbm0.c;
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgxz.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp2.b_message;
                        ((hgxz)hftv0).e = v - 1;
                        ((hgxz)hftv0).b |= 1;
                        if(!hftv0.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        hgxz hgxz0 = (hgxz)hftp2.b_message;
                        hgyn hgyn2 = (hgyn)hftp1.N_build();
                        hgyn2.getClass();
                        hgxz0.d = hgyn2;
                        hgxz0.c = 4;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((hgxz)hftp2.b_message).f = hgyf0.e;
                        ((hgxz)hftp2.b_message).b |= 2;
                        rck0.d(((hgxz)hftp2.N_build()), v3, z);
                        rbl0 = this;
                    }
                    else {
                        goto label_149;
                    }
                    goto label_153;
                }
                catch(Throwable unused_ex) {
                    rbl0 = this;
                    rdk.h("BillingBroadcastManager", "Failed logging purchase extraction results.");
                    rbl0.a.b.c(rcm1);
                    return;
                }
                try {
                label_149:
                    rbl0 = this;
                    rbl0.d(bundle0, rcm1, v, hgyf0, v3, z);
                }
                catch(Throwable unused_ex) {
                    rdk.h("BillingBroadcastManager", "Failed logging purchase extraction results.");
                }
            label_153:
                rbl0.a.b.c(rcm1);
                return;
            }
            ArrayList arrayList4 = bundle0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList arrayList5 = bundle0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            ArrayList arrayList6 = new ArrayList();
            if(arrayList4 != null && arrayList5 != null) {
                for(int v5 = 0; v5 < arrayList4.size() && v5 < arrayList5.size(); ++v5) {
                    Purchase purchase2 = rdk.d(((String)arrayList4.get(v5)), ((String)arrayList5.get(v5)));
                    if(purchase2 != null) {
                        arrayList6.add(purchase2);
                    }
                }
            }
            else {
                Purchase purchase3 = rdk.d(bundle0.getString("INAPP_PURCHASE_DATA"), bundle0.getString("INAPP_DATA_SIGNATURE"));
                if(purchase3 != null) {
                    arrayList6.add(purchase3);
                }
            }
            if(rcm1.a == 0) {
                hgxz hgxz1 = rcj.f(v, hgyf0);
                this.a.c.d(hgxz1, v3, z);
            }
            else {
                this.d(bundle0, rcm1, v, hgyf0, v3, z);
            }
            this.a.b.c(rcm1);
            return;
        }
        rdk.h("BillingBroadcastManager", "Received 3P purchase in 1P client and no valid 3P listener registered.");
        hgxx hgxx3 = rcj.c(0x7C, v, rcn.e, hgyf0);
        this.a.c.b(hgxx3, v3, z);
    }
}

