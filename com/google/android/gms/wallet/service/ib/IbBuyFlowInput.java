package com.google.android.gms.wallet.service.ib;

import ByteString;
import Parser;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import batl;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import fbhm;
import fbkm;
import fbqu;
import fbru;
import fbrw;
import gcid;
import gciq;
import gerr;
import gers;
import geru;
import gesc;
import gesk;
import gesm;
import gesn;
import gexw;
import gfdh;
import gfdj;
import gfdl;
import gfdm;
import hbzv;
import hbzw;
import hcaf;
import hcai;
import hcam;
import hcbr;
import hcdn;
import hcdp;
import hcdq;
import hfuo;
import hfvv;
import hfzd;
import hfzg;
import hzmx;
import hzoz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

public class IbBuyFlowInput implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public Bundle a;
    public gerr b;
    public byte[] c;
    public byte[] d;
    public final ProtoLiteBuilder e;

    static {
        IbBuyFlowInput.CREATOR = new fbqu();
    }

    private IbBuyFlowInput(gers gers0, ProtoLiteBuilder hftp0, byte[] arr_b, byte[] arr_b1) {
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gers0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gers0));
        this.b = (gerr)hftp1;
        this.c = arr_b;
        this.d = arr_b1;
        if((((gers)((gerr)hftp1).b_message).c & 0x20) == 0) {
            gesc gesc0 = gesc.a;
            if(!((gerr)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gerr)hftp1))).ensureMutable();
            }
            gers gers1 = (gers)((gerr)hftp1).b_message;
            gesc0.getClass();
            gers1.j = gesc0;
            gers1.c |= 0x20;
        }
        this.e = hftp0;
        if((((hcdq)hftp0.b_message).b & 0x400) != 0) {
            return;
        }
        gfdh gfdh0 = (gfdh)((ProtoLiteMessage)gfdm.a).v_newBuilder();
        if(!gfdh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gfdh0).ensureMutable();
        }
        gfdm gfdm0 = (gfdm)gfdh0.b_message;
        gfdm0.b |= 1;
        gfdm0.c = false;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdq hcdq0 = (hcdq)hftp0.b_message;
        gfdm gfdm1 = (gfdm)((ProtoLiteBuilder)gfdh0).N_build();
        gfdm1.getClass();
        hcdq0.m = gfdm1;
        hcdq0.b |= 0x400;
    }

    public final void A(boolean z) {
        gerr gerr0 = this.b;
        if(!gerr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gerr0).ensureMutable();
        }
        ((gers)gerr0.b_message).c |= 8;
        ((gers)gerr0.b_message).g = z;
    }

    public final void B(boolean z) {
        gerr gerr0 = this.b;
        gesc gesc0 = ((gers)gerr0.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gesc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gesc0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gesc gesc1 = (gesc)hftp0.b_message;
        gesc1.b |= 0x200;
        gesc1.l = z;
        if(!gerr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gerr0).ensureMutable();
        }
        gers gers0 = (gers)gerr0.b_message;
        gesc gesc2 = (gesc)hftp0.N_build();
        gesc2.getClass();
        gers0.j = gesc2;
        gers0.c |= 0x20;
        ProtoLiteBuilder hftp1 = this.e;
        ProtoLiteMessage hftv0 = hftp1.b_message;
        if(((hcdq)hftv0).n) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            hcdq hcdq0 = (hcdq)hftp1.b_message;
            hcdq0.b |= 0x40;
            hcdq0.i = false;
            return;
        }
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hcdq hcdq1 = (hcdq)hftp1.b_message;
        hcdq1.b |= 0x40;
        hcdq1.i = z;
    }

    public final void C(boolean z) {
        gerr gerr0 = this.b;
        gesc gesc0 = ((gers)gerr0.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gesc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gesc0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gesc gesc1 = (gesc)hftp0.b_message;
        gesc1.b |= 0x20;
        gesc1.h = z;
        if(!gerr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gerr0).ensureMutable();
        }
        gers gers0 = (gers)gerr0.b_message;
        gesc gesc2 = (gesc)hftp0.N_build();
        gesc2.getClass();
        gers0.j = gesc2;
        gers0.c |= 0x20;
    }

    public final void D(Bundle bundle0) {
        if(bundle0 != null) {
            this.a = bundle0;
        }
    }

    public final boolean E() {
        return ((hcdq)this.e.b_message).j;
    }

    public final boolean F() {
        gfdm gfdm0 = ((hcdq)this.e.b_message).m;
        if(gfdm0 == null) {
            gfdm0 = gfdm.a;
        }
        return !gfdm0.c;
    }

    public final boolean G() {
        gesc gesc0 = ((gers)this.b.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        return gesc0.h;
    }

    public final byte[] H() {
        if(hzoz.g()) {
            return this.c == null || this.c.length <= 0 ? null : this.c;
        }
        return null;
    }

    public final byte[] I() {
        if(this.H() == null && this.J() == null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcdn.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = this.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcdn hcdn0 = (hcdn)hftp0.b_message;
            hcdq hcdq0 = (hcdq)hftp1.N_build();
            hcdq0.getClass();
            hcdn0.c = hcdq0;
            hcdn0.b |= 1;
            hcdn hcdn1 = (hcdn)hftp0.N_build();
            gers gers0 = (gers)((ProtoLiteBuilder)this.b).N_build();
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gers0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)gers0));
            ByteString hfsf0 = hcdn1.getDefaultInstanceForType();
            if(!((gerr)hftp2).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gerr)hftp2))).ensureMutable();
            }
            ((gers)((gerr)hftp2).b_message).c |= 2;
            ((gers)((gerr)hftp2).b_message).e = hfsf0;
            return ((gers)((ProtoLiteBuilder)(((gerr)hftp2))).N_build()).toBytesArray();
        }
        return null;
    }

    public final byte[] J() {
        if(this.H() != null) {
            return null;
        }
        return this.d == null || this.d.length <= 0 ? null : this.d;
    }

    public final byte[] K() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfzd.a).v_newBuilder();
        gerr gerr0 = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfzd hfzd0 = (hfzd)hftp0.b_message;
        gers gers0 = (gers)((ProtoLiteBuilder)gerr0).N_build();
        gers0.getClass();
        hfzd0.d = gers0;
        hfzd0.b |= 2;
        ProtoLiteBuilder hftp1 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfzd hfzd1 = (hfzd)hftp0.b_message;
        hcdq hcdq0 = (hcdq)hftp1.N_build();
        hcdq0.getClass();
        hfzd1.c = hcdq0;
        hfzd1.b |= 1;
        byte[] arr_b = this.c;
        if(arr_b != null && arr_b.length > 0) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfzd hfzd2 = (hfzd)hftp0.b_message;
            hfzd2.b |= 4;
            hfzd2.e = hfsf0;
            return ((hfzd)hftp0.N_build()).toBytesArray();
        }
        byte[] arr_b1 = this.d;
        if(arr_b1 != null && arr_b1.length > 0) {
            ByteString hfsf1 = ByteString.copyFrom(arr_b1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfzd hfzd3 = (hfzd)hftp0.b_message;
            hfzd3.b |= 8;
            hfzd3.f = hfsf1;
        }
        return ((hfzd)hftp0.N_build()).toBytesArray();
    }

    public final void L() {
        ProtoLiteBuilder hftp0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdq hcdq0 = (hcdq)hftp0.b_message;
        hcdq0.b |= 0x1000;
        hcdq0.o = true;
    }

    public final void M() {
        ProtoLiteBuilder hftp0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdq hcdq0 = (hcdq)hftp0.b_message;
        hcdq0.b |= 0x800;
        hcdq0.n = true;
        this.P(this.N());
        gesc gesc0 = ((gers)this.b.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        this.t(gesc0.k);
        gesc gesc1 = ((gers)this.b.b_message).j;
        if(gesc1 == null) {
            gesc1 = gesc.a;
        }
        this.B(gesc1.l);
    }

    public final int N() {
        gesc gesc0 = ((gers)this.b.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        int v = geru.a(gesc0.j);
        return v == 0 ? 1 : v;
    }

    public final int O() {
        gesc gesc0 = ((gers)this.b.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        if((gesc0.b & 8) != 0) {
            gesc gesc1 = ((gers)this.b.b_message).j;
            if(gesc1 == null) {
                gesc1 = gesc.a;
            }
            int v = gesm.a((gesc1.f == null ? gesn.a : gesc1.f).c);
            return v == 0 ? 1 : v;
        }
        return 1;
    }

    public final void P(int v) {
        gerr gerr0 = this.b;
        gesc gesc0 = ((gers)gerr0.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gesc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gesc0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gesc)hftp0.b_message).j = v - 1;
        ((gesc)hftp0.b_message).b |= 0x80;
        if(!gerr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gerr0).ensureMutable();
        }
        gers gers0 = (gers)gerr0.b_message;
        gesc gesc1 = (gesc)hftp0.N_build();
        gesc1.getClass();
        gers0.j = gesc1;
        gers0.c |= 0x20;
        ProtoLiteBuilder hftp1 = this.e;
        ProtoLiteMessage hftv0 = hftp1.b_message;
        if(((hcdq)hftv0).n) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hcdq)hftp1.b_message).f = 0;
            ((hcdq)hftp1.b_message).b |= 8;
            return;
        }
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hcdq)hftp1.b_message).f = v - 1;
        ((hcdq)hftp1.b_message).b |= 8;
    }

    public static gexw[] Q(boolean z, boolean z1, List list0, int v) {
        ArrayList arrayList0 = new ArrayList();
        if(!z) {
            arrayList0.add(gexw.c);
        }
        if(!z1) {
            arrayList0.add(gexw.b);
        }
        if(v == 3) {
            arrayList0.add(gexw.m);
        }
        if(list0 == null || list0.isEmpty()) {
            list0 = fbkm.a;
        }
        for(Object object0: fbru.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!list0.contains(map$Entry0.getKey())) {
                arrayList0.add(gexw.b(((Integer)map$Entry0.getValue()).intValue()));
            }
        }
        return (gexw[])arrayList0.toArray(new gexw[arrayList0.size()]);
    }

    public static final hcam R(JSONObject jSONObject0, fbrw fbrw0) {
        hcaf hcaf0 = (hcaf)((ProtoLiteMessage)hcam.a).v_newBuilder();
        fbru fbru0 = fbru.q();
        Iterable iterable0 = null;
        if(jSONObject0 != null && fbru.e(jSONObject0, fbrw0) >= 2) {
            ArrayList arrayList0 = new ArrayList();
            JSONObject jSONObject1 = (JSONObject)fbru.am(jSONObject0, "transactionInfo", JSONObject.class, 1074, fbrw0);
            String s = (String)fbru.am(jSONObject1, "totalPriceStatus", String.class, 1090, fbrw0);
            if(jSONObject1 != null && s != null && (s.equals("ESTIMATED") || s.equals("FINAL"))) {
                String s1 = fbru.ar(jSONObject1, "transactionInfo", fbrw0);
                if(s1 != null) {
                    String s2 = (String)fbru.an(jSONObject1, "totalPrice", null, String.class, 1089, fbrw0);
                    fbru0.l(s2, "transactionInfo.totalPrice", fbrw0);
                    if(fbrw0.a.isEmpty()) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcai.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((hcai)hftv0).b |= 4;
                        ((hcai)hftv0).e = s1;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        s2.getClass();
                        ((hcai)hftv1).b |= 2;
                        ((hcai)hftv1).d = s2;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hcai)hftp0.b_message).f = 5;
                        ((hcai)hftp0.b_message).b |= 8;
                        arrayList0.add(((hcai)hftp0.N_build()));
                        iterable0 = arrayList0;
                    }
                }
            }
        }
        if(iterable0 != null) {
            hcaf0.a(iterable0);
        }
        return (hcam)((ProtoLiteBuilder)hcaf0).N_build();
    }

    public final int a(String s) {
        int v;
        gfdm gfdm0 = ((hcdq)this.e.b_message).m;
        if(gfdm0 == null) {
            gfdm0 = gfdm.a;
        }
        Iterator iterator0 = gfdm0.d.iterator();
    alab1:
        while(true) {
            v = 1;
            while(true) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                gfdl gfdl0 = (gfdl)object0;
                if(s.equals(gfdl0.c)) {
                    int v1 = gfdj.a(gfdl0.d);
                    if(v1 == 0) {
                        break;
                    }
                    v = v1;
                }
            }
        }
        return gcid.b(v);
    }

    public final IbBuyFlowInput b() {
        gers gers0 = (gers)((ProtoLiteBuilder)this.b).N_build();
        hcdq hcdq0 = (hcdq)this.e.N_build();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcdq0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcdq0));
        IbBuyFlowInput ibBuyFlowInput0 = new IbBuyFlowInput(gers0, hftp0, this.c, this.d);
        ibBuyFlowInput0.D(this.a);
        return ibBuyFlowInput0;
    }

    public static IbBuyFlowInput c(ByteString hfsf0) {
        return IbBuyFlowInput.d(hfsf0.toByteArray());
    }

    public static IbBuyFlowInput d(byte[] arr_b) {
        hfzd hfzd0 = (hfzd)gciq.c(arr_b, ((Parser)((ProtoLiteMessage)hfzd.a).jf(7, null)));
        gers gers0 = hfzd0.d == null ? gers.b : hfzd0.d;
        hcdq hcdq0 = hfzd0.c == null ? hcdq.a : hfzd0.c;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcdq0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hcdq0));
        return new IbBuyFlowInput(gers0, hftp0, hfzd0.e.toByteArray(), hfzd0.f.toByteArray());
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static IbBuyFlowInput e() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcdq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hcdq)hftv0).b |= 0x4000;
        ((hcdq)hftv0).p = true;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hcdq)hftv1).b |= 0x20;
        ((hcdq)hftv1).h = false;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hcdq)hftv2).b |= 0x80;
        ((hcdq)hftv2).j = false;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hcdq)hftv3).b |= 16;
        ((hcdq)hftv3).g = false;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((hcdq)hftv4).b |= 0x800;
        ((hcdq)hftv4).n = false;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdq hcdq0 = (hcdq)hftp0.b_message;
        hcdq0.b |= 0x40;
        hcdq0.i = false;
        return new IbBuyFlowInput(gers.b, hftp0, null, null);
    }

    public final gerr f(JSONObject jSONObject0, String s, fbrw fbrw0) {
        hbzw hbzw0 = IbBuyFlowInput.i(jSONObject0, fbrw0);
        if(hbzw0 == null) {
            gerr gerr1 = this.b;
            if(!gerr1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gerr1).ensureMutable();
            }
            ((gers)gerr1.b_message).h = null;
            ((gers)gerr1.b_message).c &= -17;
        }
        else {
            gerr gerr0 = this.b;
            if(!gerr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gerr0).ensureMutable();
            }
            ((gers)gerr0.b_message).h = hbzw0;
            ((gers)gerr0.b_message).c |= 16;
        }
        gerr gerr2 = this.b;
        gesc gesc0 = ((gers)gerr2.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gesc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gesc0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gesc gesc1 = (gesc)hftp0.b_message;
        s.getClass();
        gesc1.b |= 0x800;
        gesc1.o = s;
        if(!gerr2.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gerr2).ensureMutable();
        }
        gers gers0 = (gers)gerr2.b_message;
        gesc gesc2 = (gesc)hftp0.N_build();
        gesc2.getClass();
        gers0.j = gesc2;
        gers0.c |= 0x20;
        if(hzmx.c()) {
            gerr gerr3 = this.b;
            hcam hcam0 = IbBuyFlowInput.R(jSONObject0, fbrw0);
            if(!gerr3.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gerr3).ensureMutable();
            }
            gers gers1 = (gers)gerr3.b_message;
            hcam0.getClass();
            gers1.l = hcam0;
            gers1.c |= 0x80;
        }
        return this.b;
    }

    public static gesn g(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters0) {
        if(paymentMethodTokenizationParameters0 == null) {
            return null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gesn.a).v_newBuilder();
        int v = paymentMethodTokenizationParameters0.a;
        switch(v) {
            case 1: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gesn)hftp0.b_message).c = 1;
                ((gesn)hftp0.b_message).b |= 1;
                break;
            }
            case 2: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gesn)hftp0.b_message).c = 2;
                ((gesn)hftp0.b_message).b |= 1;
                break;
            }
            default: {
                if(v == 3) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gesn)hftp0.b_message).c = 3;
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gesn)hftp0.b_message).c = 0;
                }
                ((gesn)hftp0.b_message).b |= 1;
            }
        }
        Bundle bundle0 = paymentMethodTokenizationParameters0.a();
        int v2 = bundle0.size();
        ArrayList arrayList0 = new ArrayList(bundle0.keySet());
        Collections.sort(arrayList0);
        for(int v1 = 0; v1 < v2; ++v1) {
            String s = (String)arrayList0.get(v1);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gesk.a).v_newBuilder();
            String s1 = fbhm.a(s);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gesk gesk0 = (gesk)hftp1.b_message;
            gesk0.b |= 1;
            gesk0.c = s1;
            String s2 = fbhm.a(bundle0.getString(s));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gesk gesk1 = (gesk)hftp1.b_message;
            gesk1.b |= 2;
            gesk1.d = s2;
            gesk gesk2 = (gesk)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gesn gesn0 = (gesn)hftp0.b_message;
            gesk2.getClass();
            hfuo hfuo0 = gesn0.d;
            if(!hfuo0.c()) {
                gesn0.d = ProtoLiteMessage.E(hfuo0);
            }
            gesn0.d.add(gesk2);
        }
        return (gesn)hftp0.N_build();
    }

    public static hbzw h(List list0) {
        if(list0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hbzw.a).v_newBuilder();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hbzv.a).v_newBuilder();
                String s = (String)list0.get(v1);
                if(s != null) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hbzv hbzv0 = (hbzv)hftp1.b_message;
                    hbzv0.b |= 1;
                    hbzv0.c = s;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hbzw hbzw0 = (hbzw)hftp0.b_message;
                hbzv hbzv1 = (hbzv)hftp1.N_build();
                hbzv1.getClass();
                hbzw0.b();
                hbzw0.b.add(hbzv1);
            }
            return (hbzw)hftp0.N_build();
        }
        return null;
    }

    public static hbzw i(JSONObject jSONObject0, fbrw fbrw0) {
        return fbru.e(jSONObject0, fbrw0) == 1 ? fbru.v(((JSONArray)fbru.am(((JSONObject)fbru.am(jSONObject0, "shippingAddressRequirements", JSONObject.class, 1097, fbrw0)), "allowedCountryCodes", JSONArray.class, 0x43F, fbrw0))) : fbru.v(((JSONArray)fbru.am(((JSONObject)fbru.am(jSONObject0, "shippingAddressParameters", JSONObject.class, 1086, fbrw0)), "allowedCountryCodes", JSONArray.class, 0x43F, fbrw0)));
    }

    public final hcbr j() {
        gesc gesc0 = ((gers)this.b.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        if((gesc0.b & 16) != 0) {
            gesc gesc1 = ((gers)this.b.b_message).j;
            if(gesc1 == null) {
                gesc1 = gesc.a;
            }
            return gesc1.g == null ? hcbr.a : gesc1.g;
        }
        return null;
    }

    public final hcdn k() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcdn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdn hcdn0 = (hcdn)hftp0.b_message;
        hcdq hcdq0 = (hcdq)this.e.N_build();
        hcdq0.getClass();
        hcdn0.c = hcdq0;
        hcdn0.b |= 1;
        return (hcdn)hftp0.N_build();
    }

    public final String l() {
        switch(this.N() - 1) {
            case 3: {
                return "changeMaskedWallet";
            }
            case 4: {
                return "loadFullWallet";
            }
            case 5: {
                return "loadWebPaymentData";
            }
            case 6: {
                return "loadPaymentData";
            }
            default: {
                return "loadMaskedWallet";
            }
        }
    }

    public final String m() {
        gesc gesc0 = ((gers)this.b.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        return gesc0.c;
    }

    public final String n() {
        return ((hcdq)this.e.b_message).d;
    }

    public final String o() {
        return ((hcdq)this.e.b_message).k;
    }

    public final String p(String s) {
        gesc gesc0 = ((gers)this.b.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        if((gesc0.b & 8) != 0) {
            for(Object object0: (gesc0.f == null ? gesn.a : gesc0.f).d) {
                gesk gesk0 = (gesk)object0;
                if(s.equals(gesk0.c)) {
                    return gesk0.d;
                }
            }
        }
        return null;
    }

    public final void q(GetActiveCardsForAccountResponse getActiveCardsForAccountResponse0) {
        if(getActiveCardsForAccountResponse0 != null) {
            ProtoLiteBuilder hftp0 = this.e;
            gfdm gfdm0 = ((hcdq)hftp0.b_message).m;
            if(gfdm0 == null) {
                gfdm0 = gfdm.a;
            }
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gfdm0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gfdm0));
            if(!((gfdh)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gfdh)hftp1))).ensureMutable();
            }
            ((gfdm)((gfdh)hftp1).b_message).d = hfvv.a;
            ((gfdh)hftp1).a(fbru.H(getActiveCardsForAccountResponse0.a));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcdq hcdq0 = (hcdq)hftp0.b_message;
            gfdm gfdm1 = (gfdm)((ProtoLiteBuilder)(((gfdh)hftp1))).N_build();
            gfdm1.getClass();
            hcdq0.m = gfdm1;
            hcdq0.b |= 0x400;
            return;
        }
        ProtoLiteBuilder hftp2 = this.e;
        gfdm gfdm2 = ((hcdq)hftp2.b_message).m;
        if(gfdm2 == null) {
            gfdm2 = gfdm.a;
        }
        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gfdm2).jf(5, null);
        hftp3.X(((ProtoLiteMessage)gfdm2));
        if(!((gfdh)hftp3).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gfdh)hftp3))).ensureMutable();
        }
        ((gfdm)((gfdh)hftp3).b_message).d = hfvv.a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hcdq hcdq1 = (hcdq)hftp2.b_message;
        gfdm gfdm3 = (gfdm)((ProtoLiteBuilder)(((gfdh)hftp3))).N_build();
        gfdm3.getClass();
        hcdq1.m = gfdm3;
        hcdq1.b |= 0x400;
    }

    public final void r(hfzg hfzg0) {
        ProtoLiteBuilder hftp0 = this.e;
        String s = hfzg0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdq hcdq0 = (hcdq)hftp0.b_message;
        s.getClass();
        hcdq0.b |= 0x100;
        hcdq0.k = s;
        ByteString hfsf0 = hfzg0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfsf0.getClass();
        ((hcdq)hftv0).b |= 0x200;
        ((hcdq)hftv0).l = hfsf0;
        boolean z = hfzg0.f;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdq hcdq1 = (hcdq)hftp0.b_message;
        hcdq1.b |= 0x80;
        hcdq1.j = z;
    }

    public final void s(hcdp hcdp0) {
        ProtoLiteBuilder hftp0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdq hcdq0 = (hcdq)hftp0.b_message;
        hcdp0.getClass();
        hcdq0.c = hcdp0;
        hcdq0.b |= 1;
    }

    public final void t(boolean z) {
        gerr gerr0 = this.b;
        gesc gesc0 = ((gers)gerr0.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gesc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gesc0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gesc gesc1 = (gesc)hftp0.b_message;
        gesc1.b |= 0x100;
        gesc1.k = z;
        if(!gerr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gerr0).ensureMutable();
        }
        gers gers0 = (gers)gerr0.b_message;
        gesc gesc2 = (gesc)hftp0.N_build();
        gesc2.getClass();
        gers0.j = gesc2;
        gers0.c |= 0x20;
        ProtoLiteBuilder hftp1 = this.e;
        ProtoLiteMessage hftv0 = hftp1.b_message;
        if(((hcdq)hftv0).n) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            hcdq hcdq0 = (hcdq)hftp1.b_message;
            hcdq0.b |= 0x20;
            hcdq0.h = false;
            return;
        }
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hcdq hcdq1 = (hcdq)hftp1.b_message;
        hcdq1.b |= 0x20;
        hcdq1.h = z;
    }

    public final void u(String s) {
        gerr gerr0 = this.b;
        gesc gesc0 = ((gers)gerr0.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gesc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gesc0));
        batl.s(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gesc gesc1 = (gesc)hftp0.b_message;
        gesc1.b |= 1;
        gesc1.c = s;
        if(!gerr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gerr0).ensureMutable();
        }
        gers gers0 = (gers)gerr0.b_message;
        gesc gesc2 = (gesc)hftp0.N_build();
        gesc2.getClass();
        gers0.j = gesc2;
        gers0.c |= 0x20;
    }

    public final void v(boolean z) {
        ProtoLiteBuilder hftp0 = this.e;
        gfdm gfdm0 = ((hcdq)hftp0.b_message).m;
        if(gfdm0 == null) {
            gfdm0 = gfdm.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gfdm0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gfdm0));
        if(!((gfdh)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gfdh)hftp1))).ensureMutable();
        }
        gfdm gfdm1 = (gfdm)((gfdh)hftp1).b_message;
        gfdm1.b |= 1;
        gfdm1.c = ((int)z) ^ 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdq hcdq0 = (hcdq)hftp0.b_message;
        gfdm gfdm2 = (gfdm)((ProtoLiteBuilder)(((gfdh)hftp1))).N_build();
        gfdm2.getClass();
        hcdq0.m = gfdm2;
        hcdq0.b |= 0x400;
    }

    public final void w(boolean z) {
        ProtoLiteBuilder hftp0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcdq hcdq0 = (hcdq)hftp0.b_message;
        hcdq0.b |= 16;
        hcdq0.g = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeByteArray(this.K());
        parcel0.writeBundle(this.a);
    }

    public final void x(hcbr hcbr0) {
        if(hcbr0 != null) {
            gerr gerr0 = this.b;
            gesc gesc0 = ((gers)gerr0.b_message).j;
            if(gesc0 == null) {
                gesc0 = gesc.a;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gesc0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gesc0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gesc)hftp0.b_message).g = hcbr0;
            ((gesc)hftp0.b_message).b |= 16;
            if(!gerr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gerr0).ensureMutable();
            }
            gers gers0 = (gers)gerr0.b_message;
            gesc gesc1 = (gesc)hftp0.N_build();
            gesc1.getClass();
            gers0.j = gesc1;
            gers0.c |= 0x20;
        }
    }

    public final void y(int v) {
        gerr gerr0 = this.b;
        gesc gesc0 = ((gers)gerr0.b_message).j;
        if(gesc0 == null) {
            gesc0 = gesc.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gesc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gesc0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gesc gesc1 = (gesc)hftp0.b_message;
        gesc1.b |= 0x40;
        gesc1.i = v;
        if(!gerr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gerr0).ensureMutable();
        }
        gers gers0 = (gers)gerr0.b_message;
        gesc gesc2 = (gesc)hftp0.N_build();
        gesc2.getClass();
        gers0.j = gesc2;
        gers0.c |= 0x20;
    }

    public final void z(PaymentDataRequest paymentDataRequest0) {
        gesn gesn0 = IbBuyFlowInput.g(paymentDataRequest0.g);
        if(gesn0 != null) {
            gerr gerr0 = this.b;
            gesc gesc0 = ((gers)gerr0.b_message).j;
            if(gesc0 == null) {
                gesc0 = gesc.a;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gesc0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gesc0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gesc)hftp0.b_message).f = gesn0;
            ((gesc)hftp0.b_message).b |= 8;
            if(!gerr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gerr0).ensureMutable();
            }
            gers gers0 = (gers)gerr0.b_message;
            gesc gesc1 = (gesc)hftp0.N_build();
            gesc1.getClass();
            gers0.j = gesc1;
            gers0.c |= 0x20;
            return;
        }
        gerr gerr1 = this.b;
        gesc gesc2 = ((gers)gerr1.b_message).j;
        if(gesc2 == null) {
            gesc2 = gesc.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gesc2).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gesc2));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gesc)hftp1.b_message).f = null;
        ((gesc)hftp1.b_message).b &= -9;
        if(!gerr1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gerr1).ensureMutable();
        }
        gers gers1 = (gers)gerr1.b_message;
        gesc gesc3 = (gesc)hftp1.N_build();
        gesc3.getClass();
        gers1.j = gesc3;
        gers1.c |= 0x20;
    }
}

