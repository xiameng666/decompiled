import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wallet.ib.IbChimeraActivity;
import com.google.android.gms.wallet.service.ib.IbBuyFlowInput;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ganw implements Runnable {
    public final gany a;

    public ganw(gany gany0) {
        this.a = gany0;
    }

    @Override
    public final void run() {
        int v4;
        gany gany1;
        int v16;
        gklm gklm0;
        ProtoLiteBuilder hftp8;
        String s18;
        hcam hcam4;
        Iterable iterable0;
        ArrayList arrayList5;
        int v13;
        String s7;
        Object object1;
        String s5;
        String s4;
        JSONObject jSONObject5;
        int v12;
        JSONArray jSONArray0;
        ArrayList arrayList4;
        fbrw fbrw1;
        fbyi fbyi1;
        IbChimeraActivity ibChimeraActivity2;
        gklf gklf4;
        fbyg fbyg1;
        String s3;
        ArrayList arrayList3;
        JSONObject jSONObject4;
        JSONObject jSONObject3;
        IbChimeraActivity ibChimeraActivity1;
        hcaf hcaf1;
        fbyl fbyl3;
        fbrw fbrw0;
        Bundle bundle0;
        gany gany0 = this.a;
        if(!gany0.f) {
            int v = 0;
            while(true) {
                ArrayList arrayList0 = gany0.c;
                if(v >= arrayList0.size()) {
                    break;
                }
                ArrayList arrayList1 = gany0.e;
                ganm ganm0 = (ganm)arrayList1.get(v);
                if(arrayList1.get(v) == null) {
                    int v1 = (int)(((Integer)gany0.b.get(v)));
                    gany0.a.C();
                    ganm0 = (ganm)bzu.a(gany0.a.ag, v1);
                    arrayList1.set(v, ganm0);
                    if(ganm0 != null) {
                        ganm0.e = gany0;
                    }
                }
                if(ganm0 != null && ganm0.d != 4) {
                    ++v;
                }
                else {
                    ArrayList arrayList2 = gany0.d;
                    Intent intent0 = (Intent)arrayList2.get(v);
                    if(ganm0 == null) {
                        gftb.check(intent0);
                        gano gano0 = new gano(((Intent)arrayList2.get(v)));
                        gany0.a.C();
                        int v2 = gany0.a.ai;
                        ganm ganm1 = new ganm(v2);
                        gany0.a.ai = v2 + 1;
                        ganm1.c = gano0;
                        gany0.a.ag.h(ganm1.a, ganm1);
                        gany0.b.set(v, Integer.valueOf(ganm1.a));
                        arrayList1.set(v, ganm1);
                        arrayList2.set(v, null);
                        ganm1.e = gany0;
                        ++v;
                    }
                    else {
                        int v3 = (int)(((Integer)arrayList0.remove(v)));
                        ganm ganm2 = (ganm)arrayList1.remove(v);
                        gany0.b.remove(v);
                        arrayList2.remove(v);
                        ganp ganp0 = ganm2.b;
                        ganm2.e = null;
                        bzu.b(gany0.a.ag, ganm2.a);
                        IbChimeraActivity ibChimeraActivity0 = gany0.g;
                        if(v3 == 1001) {
                            if(ganp0.b() != 0) {
                                Log.e("IbChimeraActivity", String.format(Locale.US, "Callback Action failed with a status: %d", ganp0.b()));
                                fbcz fbcz0 = ibChimeraActivity0.G;
                                hcaf hcaf0 = (hcaf)((ProtoLiteMessage)hcam.a).v_newBuilder();
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcal.a).v_newBuilder();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp0.b_message;
                                ((hcal)hftv0).d = 0;
                                ((hcal)hftv0).b |= 2;
                                if(!hftv0.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                hcal hcal0 = (hcal)hftp0.b_message;
                                hcal0.b |= 1;
                                hcal0.c = "";
                                if(!hcaf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)hcaf0).ensureMutable();
                                }
                                hcam hcam0 = (hcam)hcaf0.b_message;
                                hcal hcal1 = (hcal)hftp0.N_build();
                                hcal1.getClass();
                                hcam0.f = hcal1;
                                hcam0.b |= 2;
                                fbcz0.aH(((hcam)((ProtoLiteBuilder)hcaf0).N_build()));
                            }
                            fbyg fbyg0 = (fbyg)gawi.i(ganp0.a, "extra_callback_output", ((MessageLite)fbyg.a));
                            IbBuyFlowInput ibBuyFlowInput0 = ibChimeraActivity0.r;
                            ClassLoader classLoader0 = ibChimeraActivity0.getClass().getClassLoader();
                            int v5 = fbyg0.d;
                            fbyi fbyi0 = fbyi.c;
                            if((fbyi.b(v5) == null ? fbyi.d : fbyi.b(v5)) != fbyi0) {
                                if((fbyi.b(v5) == null ? fbyi.d : fbyi.b(v5)) == fbyi.b && fbyg0.b == 3) {
                                    fbyk fbyk0 = (fbyk)fbyg0.c;
                                    if(!fbyk0.c.isEmpty()) {
                                        bundle0 = gcih.a(fbyk0.c.toByteArray(), classLoader0);
                                        goto label_86;
                                    }
                                }
                            }
                            else if(fbyg0.b == 4) {
                                fbyl fbyl0 = (fbyl)fbyg0.c;
                                if(!fbyl0.c.isEmpty()) {
                                    bundle0 = gcih.a(fbyl0.c.toByteArray(), classLoader0);
                                    goto label_86;
                                }
                            }
                            bundle0 = null;
                        label_86:
                            ibBuyFlowInput0.D(bundle0);
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gklf.a).v_newBuilder();
                            int v6 = (fbyh.b(fbyg0.e) == null ? fbyh.g : fbyh.b(fbyg0.e)).a();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gklf gklf0 = (gklf)hftp1.b_message;
                            gklf0.b |= 1;
                            gklf0.c = v6;
                            int v7 = (fbyi.b(fbyg0.d) == null ? fbyi.d : fbyi.b(fbyg0.d)).a();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gklf gklf1 = (gklf)hftp1.b_message;
                            gklf1.b |= 2;
                            gklf1.d = v7;
                            long v8 = SystemClock.elapsedRealtime() - ibChimeraActivity0.C;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            gklf gklf2 = (gklf)hftp1.b_message;
                            gklf2.b |= 4;
                            gklf2.e = v8;
                            gklf gklf3 = (gklf)hftp1.N_build();
                            int v9 = fbyg0.e;
                            if((fbyh.b(v9) == null ? fbyh.g : fbyh.b(v9)) == fbyh.b) {
                                try {
                                    fbrw0 = new fbrw();
                                    fbyl fbyl1 = ibChimeraActivity0.B;
                                    JSONObject jSONObject0 = new JSONObject();
                                    int v10 = fbyg0.d;
                                    if((fbyi.b(v10) == null ? fbyi.d : fbyi.b(v10)) != fbyi0) {
                                        if((fbyi.b(v10) == null ? fbyi.d : fbyi.b(v10)) == fbyi.b && fbyg0.b == 3) {
                                            JSONObject jSONObject1 = new JSONObject(((fbyk)fbyg0.c).b);
                                            if(jSONObject1.has("error")) {
                                                jSONObject0.put("error", jSONObject1.get("error"));
                                            }
                                        }
                                    }
                                    else if(fbyg0.b == 4) {
                                        jSONObject0 = new JSONObject(((fbyl)fbyg0.c).b);
                                    }
                                    if(fbyl1 == null) {
                                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fbyl.a).v_newBuilder();
                                        String s1 = jSONObject0.toString();
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        fbyl fbyl4 = (fbyl)hftp3.b_message;
                                        s1.getClass();
                                        fbyl4.b = s1;
                                        fbyl3 = (fbyl)hftp3.N_build();
                                    }
                                    else {
                                        JSONObject jSONObject2 = new JSONObject(fbyl1.b);
                                        if(!jSONObject0.has("error")) {
                                            jSONObject2.remove("error");
                                        }
                                        Iterator iterator0 = jSONObject0.keys();
                                        while(iterator0.hasNext()) {
                                            Object object0 = iterator0.next();
                                            jSONObject2.put(((String)object0), jSONObject0.get(((String)object0)));
                                        }
                                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fbyl.a).v_newBuilder();
                                        String s = jSONObject2.toString();
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        fbyl fbyl2 = (fbyl)hftp2.b_message;
                                        s.getClass();
                                        fbyl2.b = s;
                                        fbyl3 = (fbyl)hftp2.N_build();
                                    }
                                    ibChimeraActivity0.B = fbyl3;
                                    fbru fbru0 = fbru.q();
                                    fbyl fbyl5 = ibChimeraActivity0.B;
                                    hcaf1 = (hcaf)((ProtoLiteMessage)hcam.a).v_newBuilder();
                                    if(fbyl5 != null) {
                                        String s2 = fbyl5.b;
                                        if(!hcaf1.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)hcaf1).ensureMutable();
                                        }
                                        hcam hcam1 = (hcam)hcaf1.b_message;
                                        s2.getClass();
                                        hcam1.b |= 4;
                                        hcam1.g = s2;
                                    }
                                }
                                catch(JSONException jSONException0) {
                                    gany1 = gany0;
                                    v4 = v;
                                    ibChimeraActivity1 = ibChimeraActivity0;
                                    goto label_476;
                                }
                                int v11 = fbyg0.d;
                                if((fbyi.b(v11) == null ? fbyi.d : fbyi.b(v11)) == fbyi0) {
                                    try {
                                        if(fbyg0.b == 4) {
                                            jSONObject3 = new JSONObject(((fbyl)fbyg0.c).b);
                                            jSONObject4 = (JSONObject)fbru.am(jSONObject3, "newTransactionInfo", JSONObject.class, 1091, fbrw0);
                                            if(jSONObject4 == null) {
                                                goto label_313;
                                            }
                                            else {
                                                arrayList3 = new ArrayList();
                                                v4 = v;
                                                goto label_178;
                                            }
                                            goto label_320;
                                        }
                                        else {
                                            goto label_410;
                                        }
                                        goto label_417;
                                    }
                                    catch(JSONException jSONException0) {
                                        try {
                                            gany1 = gany0;
                                            v4 = v;
                                            ibChimeraActivity2 = ibChimeraActivity0;
                                            ibChimeraActivity1 = ibChimeraActivity2;
                                        }
                                        catch(JSONException jSONException0) {
                                            ibChimeraActivity1 = ibChimeraActivity2;
                                            gklf3 = gklf4;
                                        }
                                        goto label_476;
                                    }
                                    try {
                                    label_178:
                                        s3 = fbru.ar(jSONObject4, "newTransactionInfo", fbrw0);
                                        if(s3 == null) {
                                            fbyg1 = fbyg0;
                                            gany1 = gany0;
                                            gklf4 = gklf3;
                                            ibChimeraActivity2 = ibChimeraActivity0;
                                            fbyi1 = fbyi0;
                                            fbrw1 = fbrw0;
                                            iterable0 = null;
                                        }
                                        else {
                                            arrayList4 = arrayList3;
                                            gany1 = gany0;
                                            goto label_189;
                                        }
                                        goto label_310;
                                    }
                                    catch(JSONException jSONException0) {
                                        gany1 = gany0;
                                        ibChimeraActivity2 = ibChimeraActivity0;
                                        ibChimeraActivity1 = ibChimeraActivity2;
                                        goto label_476;
                                    }
                                    try {
                                    label_189:
                                        fbyi1 = fbyi0;
                                        jSONArray0 = (JSONArray)fbru.am(jSONObject4, "displayItems", JSONArray.class, 1094, fbrw0);
                                        if(jSONArray0 != null) {
                                            v12 = 0;
                                            while(true) {
                                            label_193:
                                                if(v12 >= jSONArray0.length()) {
                                                    break;
                                                }
                                                jSONObject5 = jSONArray0.getJSONObject(v12);
                                                s4 = String.format(Locale.US, "%s.displayItem[%d]", "newTransactionInfo", v12);
                                                s5 = (String)fbru.an(jSONObject5, "label", s4, String.class, 1093, fbrw0);
                                                String s6 = (String)fbru.an(jSONObject5, "type", s4, String.class, 1093, fbrw0);
                                                object1 = fbru.an(jSONObject5, "price", s4, String.class, 1093, fbrw0);
                                                fbrw1 = fbrw0;
                                                ibChimeraActivity2 = ibChimeraActivity0;
                                                goto label_204;
                                            }
                                        }
                                        goto label_269;
                                    }
                                    catch(JSONException jSONException0) {
                                        try {
                                            ibChimeraActivity2 = ibChimeraActivity0;
                                            ibChimeraActivity1 = ibChimeraActivity2;
                                        }
                                        catch(JSONException jSONException0) {
                                            ibChimeraActivity1 = ibChimeraActivity2;
                                            gklf3 = gklf4;
                                        }
                                        goto label_476;
                                    }
                                    try {
                                    label_204:
                                        s7 = (String)object1;
                                        gklf4 = gklf3;
                                        if(TextUtils.isEmpty(s7)) {
                                            goto label_210;
                                        }
                                        goto label_213;
                                    }
                                    catch(JSONException jSONException0) {
                                        try {
                                            ibChimeraActivity1 = ibChimeraActivity2;
                                        }
                                        catch(JSONException jSONException0) {
                                            ibChimeraActivity1 = ibChimeraActivity2;
                                            gklf3 = gklf4;
                                        }
                                        goto label_476;
                                    }
                                    try {
                                    label_210:
                                        fbrw1.a(String.format(Locale.US, "%s.%s is required", s4, "price"), 0x402);
                                        fbyg1 = fbyg0;
                                        iterable0 = null;
                                        goto label_310;
                                    }
                                    catch(JSONException jSONException0) {
                                        ibChimeraActivity1 = ibChimeraActivity2;
                                        gklf3 = gklf4;
                                        goto label_476;
                                    }
                                    try {
                                    label_213:
                                        if(((Pattern)fbru0.d.mr()).matcher(s7).matches()) {
                                            fbyg1 = fbyg0;
                                        }
                                        else {
                                            fbyg1 = fbyg0;
                                            fbrw1.a(String.format(Locale.US, "%s.%s is in wrong format", s4, "price"), 1093);
                                        }
                                        if(s5 == null || TextUtils.isEmpty(s6) || TextUtils.isEmpty(s7)) {
                                            iterable0 = null;
                                            goto label_310;
                                        }
                                        String s8 = (String)fbru.am(jSONObject5, "status", String.class, 1093, fbrw1);
                                        if(s8 == null && !fbrw1.a.contains("status must be a String") || !s8.equals("PENDING")) {
                                            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hcai.a).v_newBuilder();
                                            if(!hftp4.b_message.isImmutable()) {
                                                hftp4.ensureMutable();
                                            }
                                            ProtoLiteMessage hftv1 = hftp4.b_message;
                                            ((hcai)hftv1).b |= 1;
                                            ((hcai)hftv1).c = s5;
                                            switch(s6) {
                                                case "DISCOUNT": {
                                                    v13 = 5;
                                                    break;
                                                }
                                                case "LINE_ITEM": {
                                                    v13 = 2;
                                                    break;
                                                }
                                                case "SUBTOTAL": {
                                                    v13 = 3;
                                                    break;
                                                }
                                                case "TAX": {
                                                    v13 = 4;
                                                    break;
                                                }
                                                case "TOTAL": {
                                                    v13 = 6;
                                                    break;
                                                }
                                                default: {
                                                    v13 = 1;
                                                }
                                            }
                                            if(!hftv1.isImmutable()) {
                                                hftp4.ensureMutable();
                                            }
                                            ProtoLiteMessage hftv2 = hftp4.b_message;
                                            ((hcai)hftv2).f = v13 - 1;
                                            ((hcai)hftv2).b |= 8;
                                            if(!hftv2.isImmutable()) {
                                                hftp4.ensureMutable();
                                            }
                                            ProtoLiteMessage hftv3 = hftp4.b_message;
                                            arrayList5 = arrayList4;
                                            ((hcai)hftv3).b |= 4;
                                            ((hcai)hftv3).e = s3;
                                            if(s7 == null) {
                                                iterable0 = null;
                                                goto label_310;
                                            }
                                            else {
                                                if(!hftv3.isImmutable()) {
                                                    hftp4.ensureMutable();
                                                }
                                                hcai hcai0 = (hcai)hftp4.b_message;
                                                hcai0.b |= 2;
                                                hcai0.d = s7;
                                                arrayList5.add(((hcai)hftp4.N_build()));
                                                goto label_259;
                                            }
                                            goto label_258;
                                        }
                                        else {
                                        label_258:
                                            arrayList5 = arrayList4;
                                        }
                                    label_259:
                                        ++v12;
                                        arrayList4 = arrayList5;
                                        fbrw0 = fbrw1;
                                        jSONArray0 = jSONArray0;
                                        ibChimeraActivity0 = ibChimeraActivity2;
                                        gklf3 = gklf4;
                                        fbyg0 = fbyg1;
                                        goto label_193;
                                    }
                                    catch(JSONException jSONException0) {
                                        ibChimeraActivity1 = ibChimeraActivity2;
                                        gklf3 = gklf4;
                                        goto label_476;
                                    }
                                    try {
                                        iterable0 = null;
                                        goto label_310;
                                    }
                                    catch(JSONException jSONException0) {
                                        gany1 = gany0;
                                        ibChimeraActivity2 = ibChimeraActivity0;
                                        ibChimeraActivity1 = ibChimeraActivity2;
                                        goto label_476;
                                    }
                                    try {
                                    label_269:
                                        fbyg1 = fbyg0;
                                        gklf4 = gklf3;
                                        ibChimeraActivity2 = ibChimeraActivity0;
                                        fbrw1 = fbrw0;
                                        iterable0 = arrayList4;
                                        String s9 = (String)fbru.am(jSONObject4, "totalPriceLabel", String.class, 1095, fbrw1);
                                        String s10 = (String)fbru.am(jSONObject4, "totalPrice", String.class, 1089, fbrw1);
                                        if(s10 != null) {
                                            if(((Pattern)fbru0.c.mr()).matcher(s10).matches()) {
                                                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hcai.a).v_newBuilder();
                                                if(s9 == null) {
                                                    s9 = "Final";
                                                }
                                                if(!hftp5.b_message.isImmutable()) {
                                                    hftp5.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv4 = hftp5.b_message;
                                                ((hcai)hftv4).b |= 1;
                                                ((hcai)hftv4).c = s9;
                                                if(!hftv4.isImmutable()) {
                                                    hftp5.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv5 = hftp5.b_message;
                                                ((hcai)hftv5).b |= 2;
                                                ((hcai)hftv5).d = s10;
                                                if(!hftv5.isImmutable()) {
                                                    hftp5.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv6 = hftp5.b_message;
                                                ((hcai)hftv6).f = 5;
                                                ((hcai)hftv6).b |= 8;
                                                if(!hftv6.isImmutable()) {
                                                    hftp5.ensureMutable();
                                                }
                                                hcai hcai1 = (hcai)hftp5.b_message;
                                                hcai1.b |= 4;
                                                hcai1.e = s3;
                                                ((List)iterable0).add(((hcai)hftp5.N_build()));
                                                goto label_310;
                                            }
                                            iterable0 = null;
                                        }
                                        goto label_310;
                                    }
                                    catch(JSONException jSONException0) {
                                        ibChimeraActivity1 = ibChimeraActivity2;
                                        gklf3 = gklf4;
                                        goto label_476;
                                    }
                                    try {
                                        iterable0 = null;
                                        goto label_310;
                                    }
                                    catch(JSONException jSONException0) {
                                        try {
                                            gany1 = gany0;
                                            ibChimeraActivity2 = ibChimeraActivity0;
                                            ibChimeraActivity1 = ibChimeraActivity2;
                                            goto label_476;
                                        label_310:
                                            if(iterable0 != null) {
                                                hcaf1.a(iterable0);
                                                goto label_320;
                                            label_313:
                                                fbyg1 = fbyg0;
                                                gany1 = gany0;
                                                gklf4 = gklf3;
                                                v4 = v;
                                                ibChimeraActivity2 = ibChimeraActivity0;
                                                fbyi1 = fbyi0;
                                                fbrw1 = fbrw0;
                                            }
                                        label_320:
                                            JSONObject jSONObject6 = (JSONObject)fbru.am(jSONObject3, "newShippingOptionParameters", JSONObject.class, 1098, fbrw1);
                                            if(jSONObject6 == null) {
                                            label_402:
                                                hcal hcal2 = fbru.w(jSONObject3, fbrw1);
                                                if(hcal2 != null) {
                                                    if(!hcaf1.b_message.isImmutable()) {
                                                        ((ProtoLiteBuilder)hcaf1).ensureMutable();
                                                    }
                                                    ((hcam)hcaf1.b_message).f = hcal2;
                                                    ((hcam)hcaf1.b_message).b |= 2;
                                                }
                                                fbyg0 = fbyg1;
                                                goto label_448;
                                            label_410:
                                                gany1 = gany0;
                                                gklf4 = gklf3;
                                                v4 = v;
                                                ibChimeraActivity2 = ibChimeraActivity0;
                                                fbyi1 = fbyi0;
                                                fbrw1 = fbrw0;
                                                hcam4 = null;
                                                goto label_449;
                                            label_417:
                                                gany1 = gany0;
                                                gklf4 = gklf3;
                                                v4 = v;
                                                ibChimeraActivity2 = ibChimeraActivity0;
                                                fbyi1 = fbyi0;
                                                fbrw1 = fbrw0;
                                                if((fbyi.b(v11) == null ? fbyi.d : fbyi.b(v11)) == fbyi.b) {
                                                    fbyg0 = fbyg0;
                                                    if(fbyg0.b == 3) {
                                                        JSONObject jSONObject9 = new JSONObject(((fbyk)fbyg0.c).b);
                                                        String s17 = (String)fbru.an(jSONObject9, "transactionState", "paymentAuthorizationResult", String.class, 1102, fbrw1);
                                                        if(s17 == null) {
                                                            hcam4 = null;
                                                            goto label_449;
                                                        }
                                                        else {
                                                            switch(s17.hashCode()) {
                                                                case 0xBB80CBE3: {
                                                                    goto label_432;
                                                                }
                                                                case 0x3F2D9E8: {
                                                                    goto label_435;
                                                                }
                                                            }
                                                            fbrw1.a("paymentAuthorizationResult.transactionState must be either ERROR or SUCCESS!", 1102);
                                                            goto label_448;
                                                        label_432:
                                                            if(!s17.equals("SUCCESS")) {
                                                                fbrw1.a("paymentAuthorizationResult.transactionState must be either ERROR or SUCCESS!", 1102);
                                                                goto label_448;
                                                            label_435:
                                                                if(s17.equals("ERROR")) {
                                                                    hcal hcal3 = fbru.w(jSONObject9, fbrw1);
                                                                    if(hcal3 != null) {
                                                                        if(!hcaf1.b_message.isImmutable()) {
                                                                            ((ProtoLiteBuilder)hcaf1).ensureMutable();
                                                                        }
                                                                        ((hcam)hcaf1.b_message).f = hcal3;
                                                                        ((hcam)hcaf1.b_message).b |= 2;
                                                                    }
                                                                }
                                                                else {
                                                                    fbrw1.a("paymentAuthorizationResult.transactionState must be either ERROR or SUCCESS!", 1102);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        hcam4 = null;
                                                        goto label_449;
                                                    }
                                                }
                                                else {
                                                    fbyg0 = fbyg0;
                                                }
                                            label_448:
                                                hcam4 = (hcam)((ProtoLiteBuilder)hcaf1).N_build();
                                            }
                                            else {
                                                fbrw fbrw2 = fbrw1;
                                                JSONArray jSONArray1 = (JSONArray)fbru.an(jSONObject6, "shippingOptions", "newShippingOptionParameters", JSONArray.class, 1100, fbrw2);
                                                if(jSONArray1 == null) {
                                                    fbrw1 = fbrw2;
                                                }
                                                else {
                                                    int v14 = 0;
                                                    while(true) {
                                                        if(v14 >= jSONArray1.length()) {
                                                            fbrw1 = fbrw2;
                                                            String s11 = (String)fbru.am(jSONObject6, "defaultSelectedOptionId", String.class, 1099, fbrw1);
                                                            if(s11 != null) {
                                                                for(Object object2: DesugarCollections.unmodifiableList(((hcam)hcaf1.b_message).d)) {
                                                                    if(!s11.equals(((hbzo)object2).c)) {
                                                                        continue;
                                                                    }
                                                                    if(!hcaf1.b_message.isImmutable()) {
                                                                        ((ProtoLiteBuilder)hcaf1).ensureMutable();
                                                                    }
                                                                    hcam hcam2 = (hcam)hcaf1.b_message;
                                                                    hcam2.b |= 1;
                                                                    hcam2.e = s11;
                                                                    goto label_402;
                                                                }
                                                                fbrw1.a(String.format(Locale.US, "Default shipping option(\"%s\") is not present in shipping options list.", s11), 1099);
                                                            }
                                                            goto label_402;
                                                        }
                                                        JSONObject jSONObject7 = jSONArray1.getJSONObject(v14);
                                                        Integer integer0 = v14;
                                                        String s12 = (String)fbru.an(jSONObject7, "id", String.format(Locale.US, "newShippingOptionParameters.shippingOption[%d]", integer0), String.class, 1100, fbrw2);
                                                        JSONObject jSONObject8 = jSONObject7;
                                                        fbrw1 = fbrw2;
                                                        String s13 = (String)fbru.an(jSONObject7, "label", String.format(Locale.US, "newShippingOptionParameters.shippingOption[%d]", integer0), String.class, 1100, fbrw2);
                                                        String s14 = (String)fbru.am(jSONObject8, "description", String.class, 1100, fbrw1);
                                                        if(s12 == null || s13 == null) {
                                                            break;
                                                        }
                                                        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hbzg.a).v_newBuilder();
                                                        if(!hftp6.b_message.isImmutable()) {
                                                            hftp6.ensureMutable();
                                                        }
                                                        ((hbzg)hftp6.b_message).c = 2;
                                                        ((hbzg)hftp6.b_message).b |= 1;
                                                        String s15 = new JSONObject().put("id", s12).toString();
                                                        if(!hftp6.b_message.isImmutable()) {
                                                            hftp6.ensureMutable();
                                                        }
                                                        hbzg hbzg0 = (hbzg)hftp6.b_message;
                                                        s15.getClass();
                                                        hbzg0.b |= 2;
                                                        hbzg0.d = s15;
                                                        hbzg hbzg1 = (hbzg)hftp6.N_build();
                                                        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hbzo.a).v_newBuilder();
                                                        if(!hftp7.b_message.isImmutable()) {
                                                            hftp7.ensureMutable();
                                                        }
                                                        ProtoLiteMessage hftv7 = hftp7.b_message;
                                                        ((hbzo)hftv7).b |= 1;
                                                        ((hbzo)hftv7).c = s12;
                                                        if(!hftv7.isImmutable()) {
                                                            hftp7.ensureMutable();
                                                        }
                                                        ProtoLiteMessage hftv8 = hftp7.b_message;
                                                        ((hbzo)hftv8).b |= 2;
                                                        ((hbzo)hftv8).d = s13;
                                                        if(!hftv8.isImmutable()) {
                                                            hftp7.ensureMutable();
                                                        }
                                                        hbzo hbzo0 = (hbzo)hftp7.b_message;
                                                        hbzg1.getClass();
                                                        hbzo0.f = hbzg1;
                                                        hbzo0.b |= 8;
                                                        if(s14 != null) {
                                                            String s16 = jSONObject8.getString("description");
                                                            if(!hftp7.b_message.isImmutable()) {
                                                                hftp7.ensureMutable();
                                                            }
                                                            hbzo hbzo1 = (hbzo)hftp7.b_message;
                                                            s16.getClass();
                                                            hbzo1.b |= 4;
                                                            hbzo1.e = s16;
                                                        }
                                                        if(!hcaf1.b_message.isImmutable()) {
                                                            ((ProtoLiteBuilder)hcaf1).ensureMutable();
                                                        }
                                                        hcam hcam3 = (hcam)hcaf1.b_message;
                                                        hbzo hbzo2 = (hbzo)hftp7.N_build();
                                                        hbzo2.getClass();
                                                        hcam3.b();
                                                        hcam3.d.add(hbzo2);
                                                        ++v14;
                                                        fbrw2 = fbrw1;
                                                        jSONArray1 = jSONArray1;
                                                    }
                                                }
                                                fbyg0 = fbyg1;
                                                hcam4 = null;
                                            }
                                        label_449:
                                            ArrayList arrayList6 = fbrw1.a;
                                            if(arrayList6.isEmpty()) {
                                                goto label_487;
                                            }
                                            else {
                                                s18 = String.format("callback output validation failed with the following error message: %s", TextUtils.join(", ", arrayList6));
                                                goto label_457;
                                            }
                                            goto label_533;
                                        }
                                        catch(JSONException jSONException0) {
                                            ibChimeraActivity1 = ibChimeraActivity2;
                                            gklf3 = gklf4;
                                            goto label_476;
                                        }
                                    }
                                }
                                else {
                                    goto label_417;
                                }
                                goto label_448;
                                try {
                                label_457:
                                    Log.e("IbChimeraActivity", s18);
                                    hftp8 = ((ProtoLiteMessage)gklm.a).v_newBuilder();
                                    if(!hftp8.b_message.isImmutable()) {
                                        hftp8.ensureMutable();
                                    }
                                    gklm0 = (gklm)hftp8.b_message;
                                    gklf4.getClass();
                                    gklf3 = gklf4;
                                }
                                catch(JSONException jSONException0) {
                                    ibChimeraActivity1 = ibChimeraActivity2;
                                    gklf3 = gklf4;
                                    goto label_476;
                                }
                                try {
                                    gklm0.s = gklf3;
                                    gklm0.b |= 0x10000;
                                    ibChimeraActivity1 = ibChimeraActivity2;
                                    ibChimeraActivity1.ar(((gklm)hftp8.N_build()));
                                    ibChimeraActivity1.av(10, fbrw1.b);
                                    goto label_533;
                                }
                                catch(JSONException jSONException0) {
                                }
                            label_476:
                                Log.e("IbChimeraActivity", String.format("Error occurred while constructing client parameters : %s", jSONException0.getMessage()));
                                ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gklm.a).v_newBuilder();
                                if(!hftp9.b_message.isImmutable()) {
                                    hftp9.ensureMutable();
                                }
                                gklm gklm1 = (gklm)hftp9.b_message;
                                gklf3.getClass();
                                gklm1.s = gklf3;
                                gklm1.b |= 0x10000;
                                ibChimeraActivity1.ar(((gklm)hftp9.N_build()));
                                ibChimeraActivity1.at(10);
                                goto label_533;
                            label_487:
                                ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gklm.a).v_newBuilder();
                                if(!hftp10.b_message.isImmutable()) {
                                    hftp10.ensureMutable();
                                }
                                gklm gklm2 = (gklm)hftp10.b_message;
                                gklf4.getClass();
                                gklm2.s = gklf4;
                                gklm2.b |= 0x10000;
                                ibChimeraActivity2.ar(((gklm)hftp10.N_build()));
                                int v15 = fbyg0.d;
                                if((fbyi.b(v15) == null ? fbyi.d : fbyi.b(v15)) == fbyi1) {
                                    ibChimeraActivity2.G.aH(hcam4);
                                }
                                else if((fbyi.b(v15) == null ? fbyi.d : fbyi.b(v15)) == fbyi.b) {
                                    fbcz fbcz1 = ibChimeraActivity2.G;
                                    if((hcam4.b & 2) == 0) {
                                        fbcz1.bQ();
                                    }
                                    else {
                                        fbcz1.ll(true);
                                        fbcz1.lB("", (hcam4.f == null ? hcal.a : hcam4.f).c);
                                    }
                                }
                            }
                            else {
                                gany1 = gany0;
                                v4 = v;
                                Log.e("IbChimeraActivity", String.format("Callback failed with status: %d; errorMessage: %s", (fbyh.b(v9) == null ? fbyh.g : fbyh.b(v9)).a(), fbyg0.f));
                                ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)gklm.a).v_newBuilder();
                                if(!hftp11.b_message.isImmutable()) {
                                    hftp11.ensureMutable();
                                }
                                gklm gklm3 = (gklm)hftp11.b_message;
                                gklf3.getClass();
                                gklm3.s = gklf3;
                                gklm3.b |= 0x10000;
                                ibChimeraActivity0.ar(((gklm)hftp11.N_build()));
                                fbcz fbcz2 = ibChimeraActivity0.G;
                                switch((fbyi.b(fbyg0.d) == null ? fbyi.d : fbyi.b(fbyg0.d)).ordinal()) {
                                    case 1: {
                                        v16 = 7;
                                        break;
                                    }
                                    case 2: {
                                        v16 = 6;
                                        break;
                                    }
                                    default: {
                                        throw new IllegalArgumentException("Unknown callback type!");
                                    }
                                }
                                String s19 = fbcz2.getString(0x7F1535C9);  // string:wallet_uic_title_possibly_recoverable_error_dialog "Request Failed"
                                String s20 = fbcz2.getString(0x7F1535CC);  // string:wallet_uic_unknown_error "We couldn\'t complete your request. Please retry 
                                                                           // or try again later."
                                if(fbcz2.aI != null) {
                                    ca ca0 = new ca(fbcz2.getFragmentManager());
                                    ca0.o(fbcz2.aI);
                                    ca0.a();
                                }
                                fbcz2.aI = gczm.z(2, s19, s20, v16);
                                fbcz2.aI.ag = fbcz2;
                                fbcz2.aI.show(fbcz2.getFragmentManager(), "PageFragment.ErrorDialog");
                            }
                        }
                        else {
                            gany1 = gany0;
                            v4 = v;
                        }
                    label_533:
                        v = v4;
                        gany0 = gany1;
                    }
                }
            }
            gany0.a.D();
        }
    }
}

