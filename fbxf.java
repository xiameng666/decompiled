import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

public final class fbxf {
    static gfqb a(String s, long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfqb.a).v_newBuilder();
        if(v != 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfqb gfqb0 = (gfqb)hftp0.b_message;
            gfqb0.b |= 1;
            gfqb0.c = v;
        }
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfqb gfqb1 = (gfqb)hftp0.b_message;
            s.getClass();
            gfqb1.b |= 2;
            gfqb1.d = s;
        }
        return (gfqb)hftp0.N_build();
    }

    static gfqj b(TimeInterval timeInterval0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfqj.a).v_newBuilder();
        gfpu gfpu0 = gfpu.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gfpu0).v_newBuilder();
        long v = timeInterval0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gfpu gfpu1 = (gfpu)hftp1.b_message;
        gfpu1.b |= 1;
        gfpu1.c = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfqj gfqj0 = (gfqj)hftp0.b_message;
        gfpu gfpu2 = (gfpu)hftp1.N_build();
        gfpu2.getClass();
        gfqj0.c = gfpu2;
        gfqj0.b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gfpu0).v_newBuilder();
        long v1 = timeInterval0.b;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gfpu gfpu3 = (gfpu)hftp2.b_message;
        gfpu3.b |= 1;
        gfpu3.c = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfqj gfqj1 = (gfqj)hftp0.b_message;
        gfpu gfpu4 = (gfpu)hftp2.N_build();
        gfpu4.getClass();
        gfqj1.d = gfpu4;
        gfqj1.b |= 2;
        return (gfqj)hftp0.N_build();
    }

    static gfqn c(CommonWalletObject commonWalletObject0) {
        gfqh gfqh1;
        gfqe gfqe0;
        gfps gfps2;
        int v1;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfqn.a).v_newBuilder();
        if(!TextUtils.isEmpty(commonWalletObject0.a)) {
            String s = commonWalletObject0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfqn gfqn0 = (gfqn)hftp0.b_message;
            s.getClass();
            gfqn0.b |= 1;
            gfqn0.c = s;
        }
        if(!TextUtils.isEmpty(commonWalletObject0.b)) {
            String s1 = commonWalletObject0.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfqn gfqn1 = (gfqn)hftp0.b_message;
            s1.getClass();
            gfqn1.b |= 2;
            gfqn1.d = s1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gfqn)hftv0).b |= 4;
        ((gfqn)hftv0).e = 1L;
        int v = gfqm.a(commonWalletObject0.i);
        switch(v) {
            case 0: {
                throw null;
            }
            case 1: {
                break;
            }
            default: {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gfqn)hftp0.b_message).f = v - 1;
                ((gfqn)hftp0.b_message).b |= 8;
            }
        }
        if(TextUtils.isEmpty(commonWalletObject0.g)) {
            gfps2 = null;
        }
        else {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gfps.a).v_newBuilder();
            if(TextUtils.isEmpty(commonWalletObject0.f)) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gfps)hftp1.b_message).c = 19;
            }
            else {
                String s2 = commonWalletObject0.f;
                if("aztec".equals(s2)) {
                    v1 = 3;
                }
                else if("code39".equals(s2)) {
                    v1 = 4;
                }
                else if("code128".equals(s2)) {
                    v1 = 6;
                }
                else if("codabar".equals(s2)) {
                    v1 = 7;
                }
                else if("dataMatrix".equals(s2)) {
                    v1 = 8;
                }
                else if("ean8".equals(s2)) {
                    v1 = 9;
                }
                else if("ean13".equals(s2)) {
                    v1 = 10;
                }
                else if("itf14".equals(s2)) {
                    v1 = 11;
                }
                else if("pdf417".equals(s2)) {
                    v1 = 12;
                }
                else if("qrCode".equals(s2)) {
                    v1 = 15;
                }
                else {
                    v1 = "upcA".equals(s2) ? 16 : 20;
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gfps)hftp1.b_message).c = v1 - 1;
            }
            ((gfps)hftp1.b_message).b |= 1;
            String s3 = commonWalletObject0.g;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gfps gfps0 = (gfps)hftp1.b_message;
            s3.getClass();
            gfps0.b |= 4;
            gfps0.d = s3;
            if(!TextUtils.isEmpty(commonWalletObject0.e)) {
                String s4 = commonWalletObject0.e;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gfps gfps1 = (gfps)hftp1.b_message;
                s4.getClass();
                gfps1.b |= 8;
                gfps1.e = s4;
            }
            gfps2 = (gfps)hftp1.N_build();
        }
        if(gfps2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gfqn)hftp0.b_message).g = gfps2;
            ((gfqn)hftp0.b_message).b |= 16;
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = commonWalletObject0.j;
        int v2 = arrayList1.size();
        for(int v4 = 0; v4 < v2; ++v4) {
            WalletObjectMessage walletObjectMessage0 = (WalletObjectMessage)arrayList1.get(v4);
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gfqp.a).v_newBuilder();
            if(!TextUtils.isEmpty(walletObjectMessage0.a)) {
                String s5 = walletObjectMessage0.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gfqp gfqp0 = (gfqp)hftp2.b_message;
                s5.getClass();
                gfqp0.b |= 1;
                gfqp0.c = s5;
            }
            if(!TextUtils.isEmpty(walletObjectMessage0.b)) {
                String s6 = walletObjectMessage0.b;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gfqp gfqp1 = (gfqp)hftp2.b_message;
                s6.getClass();
                gfqp1.b |= 4;
                gfqp1.d = s6;
            }
            TimeInterval timeInterval0 = walletObjectMessage0.c;
            if(timeInterval0 != null) {
                gfqj gfqj0 = fbxf.b(timeInterval0);
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gfqp gfqp2 = (gfqp)hftp2.b_message;
                gfqj0.getClass();
                gfqp2.e = gfqj0;
                gfqp2.b |= 16;
            }
            arrayList0.add(((gfqp)hftp2.N_build()));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfqn gfqn2 = (gfqn)hftp0.b_message;
        hfuo hfuo0 = gfqn2.h;
        if(!hfuo0.c()) {
            gfqn2.h = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList0, gfqn2.h);
        TimeInterval timeInterval1 = commonWalletObject0.k;
        if(timeInterval1 != null) {
            gfqj gfqj1 = fbxf.b(timeInterval1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfqn gfqn3 = (gfqn)hftp0.b_message;
            gfqj1.getClass();
            gfqn3.i = gfqj1;
            gfqn3.b |= 0x20;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = commonWalletObject0.l;
        int v5 = arrayList3.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            LatLng latLng0 = (LatLng)arrayList3.get(v6);
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gfpv.a).v_newBuilder();
            double f = latLng0.a;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp3.b_message;
            ((gfpv)hftv1).b |= 1;
            ((gfpv)hftv1).c = f;
            double f1 = latLng0.b;
            if(!hftv1.isImmutable()) {
                hftp3.ensureMutable();
            }
            gfpv gfpv0 = (gfpv)hftp3.b_message;
            gfpv0.b |= 2;
            gfpv0.d = f1;
            arrayList2.add(((gfpv)hftp3.N_build()));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfqn gfqn4 = (gfqn)hftp0.b_message;
        hfuo hfuo1 = gfqn4.j;
        if(!hfuo1.c()) {
            gfqn4.j = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(arrayList2, gfqn4.j);
        ArrayList arrayList4 = commonWalletObject0.o;
        if(arrayList4.isEmpty() && !commonWalletObject0.p) {
            gfqe0 = null;
        }
        else {
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gfqe.a).v_newBuilder();
            int v7 = arrayList4.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                LabelValueRow labelValueRow0 = (LabelValueRow)arrayList4.get(v8);
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gfqg.a).v_newBuilder();
                ArrayList arrayList5 = labelValueRow0.c;
                int v9 = arrayList5.size();
                for(int v10 = 0; v10 < v9; ++v10) {
                    LabelValue labelValue0 = (LabelValue)arrayList5.get(v10);
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gfqf.a).v_newBuilder();
                    if(!TextUtils.isEmpty(labelValue0.a)) {
                        String s7 = labelValue0.a;
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        gfqf gfqf0 = (gfqf)hftp6.b_message;
                        s7.getClass();
                        gfqf0.b |= 1;
                        gfqf0.c = s7;
                    }
                    if(!TextUtils.isEmpty(labelValue0.b)) {
                        String s8 = labelValue0.b;
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        gfqf gfqf1 = (gfqf)hftp6.b_message;
                        s8.getClass();
                        gfqf1.b |= 4;
                        gfqf1.d = s8;
                    }
                    gfqf gfqf2 = (gfqf)hftp6.N_build();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gfqg gfqg0 = (gfqg)hftp5.b_message;
                    gfqf2.getClass();
                    hfuo hfuo2 = gfqg0.b;
                    if(!hfuo2.c()) {
                        gfqg0.b = ProtoLiteMessage.E(hfuo2);
                    }
                    gfqg0.b.add(gfqf2);
                }
                gfqg gfqg1 = (gfqg)hftp5.N_build();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gfqe gfqe1 = (gfqe)hftp4.b_message;
                gfqg1.getClass();
                hfuo hfuo3 = gfqe1.c;
                if(!hfuo3.c()) {
                    gfqe1.c = ProtoLiteMessage.E(hfuo3);
                }
                gfqe1.c.add(gfqg1);
            }
            boolean z = commonWalletObject0.p;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gfqe gfqe2 = (gfqe)hftp4.b_message;
            gfqe2.b |= 1;
            gfqe2.d = z;
            gfqe0 = (gfqe)hftp4.N_build();
        }
        if(gfqe0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gfqn)hftp0.b_message).k = gfqe0;
            ((gfqn)hftp0.b_message).b |= 0x4000;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = commonWalletObject0.q;
        int v11 = arrayList7.size();
        for(int v12 = 0; v12 < v11; ++v12) {
            UriData uriData0 = (UriData)arrayList7.get(v12);
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gfqd.a).v_newBuilder();
            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)gfpw.a).v_newBuilder();
            ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gfpx.a).v_newBuilder();
            if(!TextUtils.isEmpty(uriData0.a)) {
                String s9 = uriData0.a;
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                gfpx gfpx0 = (gfpx)hftp9.b_message;
                s9.getClass();
                gfpx0.b |= 1;
                gfpx0.c = s9;
            }
            if(!TextUtils.isEmpty(uriData0.b)) {
                String s10 = uriData0.b;
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                gfpx gfpx1 = (gfpx)hftp9.b_message;
                s10.getClass();
                gfpx1.b |= 2;
                gfpx1.d = s10;
            }
            gfpx gfpx2 = (gfpx)hftp9.N_build();
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            gfpw gfpw0 = (gfpw)hftp8.b_message;
            gfpx2.getClass();
            gfpw0.c = gfpx2;
            gfpw0.b |= 1;
            gfpw gfpw1 = (gfpw)hftp8.N_build();
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            gfqd gfqd0 = (gfqd)hftp7.b_message;
            gfpw1.getClass();
            gfqd0.c = gfpw1;
            gfqd0.b |= 1;
            arrayList6.add(((gfqd)hftp7.N_build()));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfqn gfqn5 = (gfqn)hftp0.b_message;
        hfuo hfuo4 = gfqn5.l;
        if(!hfuo4.c()) {
            gfqn5.l = ProtoLiteMessage.E(hfuo4);
        }
        hfrj.E(arrayList6, gfqn5.l);
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = commonWalletObject0.r;
        int v13 = arrayList9.size();
        for(int v14 = 0; v14 < v13; ++v14) {
            TextModuleData textModuleData0 = (TextModuleData)arrayList9.get(v14);
            ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gfqi.a).v_newBuilder();
            if(!TextUtils.isEmpty(textModuleData0.a)) {
                String s11 = textModuleData0.a;
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                gfqi gfqi0 = (gfqi)hftp10.b_message;
                s11.getClass();
                gfqi0.b |= 1;
                gfqi0.c = s11;
            }
            if(!TextUtils.isEmpty(textModuleData0.b)) {
                String s12 = textModuleData0.b;
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                gfqi gfqi1 = (gfqi)hftp10.b_message;
                s12.getClass();
                gfqi1.b |= 2;
                gfqi1.d = s12;
            }
            arrayList8.add(((gfqi)hftp10.N_build()));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfqn gfqn6 = (gfqn)hftp0.b_message;
        hfuo hfuo5 = gfqn6.m;
        if(!hfuo5.c()) {
            gfqn6.m = ProtoLiteMessage.E(hfuo5);
        }
        hfrj.E(arrayList8, gfqn6.m);
        ArrayList arrayList10 = commonWalletObject0.s;
        if(arrayList10.isEmpty()) {
            gfqh1 = null;
        }
        else {
            ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)gfqh.a).v_newBuilder();
            int v15 = arrayList10.size();
            for(int v3 = 0; v3 < v15; ++v3) {
                UriData uriData1 = (UriData)arrayList10.get(v3);
                ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)gfqk.a).v_newBuilder();
                if(!TextUtils.isEmpty(uriData1.a)) {
                    String s13 = uriData1.a;
                    if(!hftp12.b_message.isImmutable()) {
                        hftp12.ensureMutable();
                    }
                    gfqk gfqk0 = (gfqk)hftp12.b_message;
                    s13.getClass();
                    gfqk0.b |= 1;
                    gfqk0.c = s13;
                }
                if(!TextUtils.isEmpty(uriData1.b)) {
                    String s14 = uriData1.b;
                    if(!hftp12.b_message.isImmutable()) {
                        hftp12.ensureMutable();
                    }
                    gfqk gfqk1 = (gfqk)hftp12.b_message;
                    s14.getClass();
                    gfqk1.b |= 2;
                    gfqk1.d = s14;
                }
                gfqk gfqk2 = (gfqk)hftp12.N_build();
                if(!hftp11.b_message.isImmutable()) {
                    hftp11.ensureMutable();
                }
                gfqh gfqh0 = (gfqh)hftp11.b_message;
                gfqk2.getClass();
                hfuo hfuo6 = gfqh0.b;
                if(!hfuo6.c()) {
                    gfqh0.b = ProtoLiteMessage.E(hfuo6);
                }
                gfqh0.b.add(gfqk2);
            }
            gfqh1 = (gfqh)hftp11.N_build();
        }
        if(gfqh1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gfqn)hftp0.b_message).n = gfqh1;
            ((gfqn)hftp0.b_message).b |= 0x8000;
        }
        return (gfqn)hftp0.N_build();
    }
}

