import android.accounts.Account;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class cbwg {
    public final ccmg a;
    private final gqif b;
    private final gfsx c;
    private final cbxa d;

    private cbwg(gqif gqif0, gfsx gfsx0) {
        this.b = gqif0;
        this.c = gfsx0;
        this.d = new cbxa();
        this.a = null;
    }

    @Deprecated
    public static cbwg a(String s, String s1) {
        return cbwg.b(s, s1, gfqx.a);
    }

    public static cbwg b(String s, String s1, gfsx gfsx0) {
        gfsx gfsx2;
        gqif gqif1;
        String s2;
        gqif gqif0;
        gged_interceptors gged0;
        cbyn cbyn0 = cbyn.a();
        gfsx gfsx1 = cbxc.b();
        if(gfsx1.i()) {
            ggdy ggdy0 = new ggdy();
            Account[] arr_account = (Account[])gfsx1.d();
            int v2 = 1;
            for(int v1 = 0; v1 < arr_account.length; ++v1) {
                Account account0 = arr_account[v1];
                gqhg gqhg0 = cbyn0.d(account0);
                ggdy0.i(new cbym(account0.name, cbyn.e(gqhg0)));
                v2 &= gqhg0.f;
            }
            if(v2 == 0) {
                cbyn.i();
            }
            gged0 = ggdy0.h();
        }
        else {
            gged0 = ggna.a;
        }
        if(s == null) {
            cbym cbym0 = (cbym)gggq.o(gged0, new cbym(null, gqif.a));
            s2 = cbym0.a;
            gqif0 = cbwg.d(cbym0.b);
        }
        else {
            gqif0 = cbwg.d(cbyn.a().f(s));
            s2 = s;
        }
        if(huli.a.e().y() && s2 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: gqif0.c) {
                gqhr gqhr0 = (gqhr)object0;
                if(huli.d().b.contains(gqhr0.c)) {
                    arrayList0.add(gqhr0);
                }
            }
            if(gfsx0.i()) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfjs.a).v_newBuilder();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfkb.b).v_newBuilder();
                hfka hfka0 = hfka.f;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hfkb hfkb0 = (hfkb)hftp2.b_message;
                hfkb0.d = hfka0.a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hfjs hfjs0 = (hfjs)hftp1.b_message;
                hfkb hfkb1 = (hfkb)hftp2.N_build();
                hfkb1.getClass();
                hfjs0.b();
                hfjs0.b.add(hfkb1);
                hfjs hfjs1 = (hfjs)hftp1.N_build();
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfjv.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hfjv hfjv0 = (hfjv)hftp3.b_message;
                hfjs1.getClass();
                hfjv0.c = hfjs1;
                hfjv0.b = 4;
                hfjv hfjv1 = (hfjv)hftp3.N_build();
                hfnn hfnn0 = (hfnn)((ProtoLiteMessage)hfno.a).v_newBuilder();
                hfnn0.a(((Integer)gfsx0.d()).intValue());
                if(!hfnn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfnn0).ensureMutable();
                }
                hfno hfno0 = (hfno)hfnn0.b_message;
                hfjv1.getClass();
                hfno0.c = hfjv1;
                hfno0.b |= 1;
                if(!hfnn0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfnn0).ensureMutable();
                }
                ((hfno)hfnn0.b_message).e = 1;
                ((hfno)hfnn0.b_message).b |= 2;
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hfnl.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hfnl hfnl0 = (hfnl)hftp4.b_message;
                hfno hfno1 = (hfno)((ProtoLiteBuilder)hfnn0).N_build();
                hfno1.getClass();
                hfnl0.c = hfno1;
                hfnl0.b |= 1;
                hfnl hfnl1 = (hfnl)hftp4.N_build();
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hfnp.a).v_newBuilder();
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hfng.a).v_newBuilder();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                hfng hfng0 = (hfng)hftp6.b_message;
                hfng0.b |= 2;
                hfng0.c = s2;
                hfng hfng1 = (hfng)hftp6.N_build();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                hfnp hfnp0 = (hfnp)hftp5.b_message;
                hfng1.getClass();
                hfnp0.c = hfng1;
                hfnp0.b |= 1;
                hfnp hfnp1 = (hfnp)hftp5.N_build();
                hftr hftr0 = (hftr)((ProtoLiteMessage)hfni.a).v_newBuilder();
                hftr0.do(hfmf.a);
                hfni hfni0 = (hfni)((ProtoLiteBuilder)hftr0).N_build();
                hfna hfna0 = cjwk.a;
                for(Object object1: gqif0.c) {
                    gqhr gqhr1 = (gqhr)object1;
                    if(huli.d().b.contains(gqhr1.c)) {
                        continue;
                        try {
                        label_113:
                            if(!((hfnm)hfna0.a((gqhr1.j == null ? hfnh.a : gqhr1.j), hfnp1, hfnl1, hfni0).get()).c) {
                                continue;
                            }
                            arrayList0.add(gqhr1);
                        }
                        catch(Exception exception0) {
                            if(!(exception0 instanceof InterruptedException)) {
                                continue;
                            }
                            Thread.currentThread().interrupt();
                        }
                        continue;
                    }
                    else {
                        goto label_113;
                    }
                    break;
                }
                ProtoLiteBuilder hftp7 = (ProtoLiteBuilder)((ProtoLiteMessage)gqif0).jf(5, null);
                hftp7.X(((ProtoLiteMessage)gqif0));
                if(!((gqia)hftp7).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gqia)hftp7))).ensureMutable();
                }
                ((gqif)((gqia)hftp7).b_message).c = hfvv.a;
                ((gqia)hftp7).a(arrayList0);
                gqif1 = (gqif)((ProtoLiteBuilder)(((gqia)hftp7))).N_build();
            }
            else {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gqif0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gqif0));
                if(!((gqia)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gqia)hftp0))).ensureMutable();
                }
                ((gqif)((gqia)hftp0).b_message).c = hfvv.a;
                ((gqia)hftp0).a(arrayList0);
                gqif1 = (gqif)((ProtoLiteBuilder)(((gqia)hftp0))).N_build();
            }
            gqif0 = gqif1;
        }
        ggdy ggdy1 = new ggdy();
        int v3 = ((ggna)gged0).c;
        for(int v = 0; v < v3; ++v) {
            ggdy1.i(cbwg.d(((cbym)gged0.get(v)).b));
        }
        if(!huln.e()) {
            gfsx2 = gfqx.a;
        }
        else if(huln.f()) {
            gfsx2 = cbyf.a().f(s1);
        }
        else if(s2 == null) {
            gfsx2 = gfqx.a;
        }
        else {
            cbyf cbyf0 = cbyf.a();
            gfsx gfsx3 = cbxc.a(s2);
            if(!gfsx3.i()) {
                throw new cjuh(5, "Account is not available: " + s2);
            }
            gfsx2 = cbyf0.e(((Account)gfsx3.d()), s1);
        }
        if(huln.e()) {
            if(huln.f()) {
                cbyf cbyf1 = cbyf.a();
                Set set0 = cjpd.d(cbyf1.b()).keySet();
                ggdy ggdy2 = new ggdy();
                for(Object object2: set0) {
                    gqhv gqhv0 = ((gqhe)cbyf1.s(((String)object2)).b_message).c;
                    if(gqhv0 == null) {
                        gqhv0 = gqhv.a;
                    }
                    if(gqhv0.b.size() > 0) {
                        ggdy2.i(gqhv0);
                    }
                }
                ggdy2.h();
            }
            else if(s2 != null) {
                cbyf cbyf2 = cbyf.a();
                gfsx gfsx4 = cbxc.a(s2);
                if(!gfsx4.i()) {
                    throw new cjuh(5, "Account is not available: " + s2);
                }
                cbyf2.t(((Account)gfsx4.d()));
                ggdy1.h();
                return new cbwg(gqif0, gfsx2);
            }
        }
        ggdy1.h();
        return new cbwg(gqif0, gfsx2);
    }

    public final List c(LanguagePreferenceParams languagePreferenceParams0) {
        gqhl gqhl0;
        float f6;
        ProtoLiteBuilder hftp0;
        gqif gqif0 = this.b;
        gqie gqie0 = gqif0.e == null ? gqie.a : gqif0.e;
        gqie gqie1 = gqie.a;
        if(((ProtoLiteMessage)gqie0).equals(gqie1)) {
            hftp0 = ((ProtoLiteMessage)gqie1).v_newBuilder();
            huli huli0 = huli.a;
            float f = (float)huli0.e().b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqie)hftp0.b_message).b = f;
            float f1 = (float)huli0.e().c();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqie)hftp0.b_message).c = f1;
        }
        else {
            hftp0 = ((ProtoLiteMessage)gqie1).w(((ProtoLiteMessage)gqie0));
        }
        if(DesugarCollections.unmodifiableList(((gqie)hftp0.b_message).d).isEmpty()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqhz.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gqhz gqhz0 = (gqhz)hftp1.b_message;
            gqhz0.b = gqhy.a(4);
            float f2 = (float)huli.a.e().d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gqhz)hftp1.b_message).c = f2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqie gqie2 = (gqie)hftp0.b_message;
            gqhz gqhz1 = (gqhz)hftp1.N_build();
            gqhz1.getClass();
            hfuo hfuo0 = gqie2.d;
            if(!hfuo0.c()) {
                gqie2.d = ProtoLiteMessage.E(hfuo0);
            }
            gqie2.d.add(gqhz1);
        }
        gqie gqie3 = (gqie)hftp0.N_build();
        ArrayList arrayList0 = new ArrayList();
        gfsx gfsx0 = this.c;
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            hfuo hfuo1 = gqie3.d;
            ggeo ggeo0 = ggeo.k(DesugarCollections.unmodifiableMap(gqie3.f));
            gqhn gqhn0 = (gqhn)((ProtoLiteMessage)gqhr.a).v_newBuilder();
            String s = huln.a.c().g();
            String s1 = String.valueOf(((gqhv)object0).c);
            if(!gqhn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gqhn0).ensureMutable();
            }
            ((gqhr)gqhn0.b_message).c = s + s1;
            gqhn0.a(hfuo1);
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: ((gqhv)object0).b) {
                Locale locale0 = gqgo.c(((String)object1), false);
                if(!gggq.v(arrayList1, new gqgt(locale0))) {
                    arrayList1.add(locale0);
                }
            }
            int[] arr_v = gqgv.b(arrayList1.size());
            for(int v = 0; v < arrayList1.size(); ++v) {
                Locale locale1 = (Locale)arrayList1.get(v);
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqhq.a).v_newBuilder();
                String s2 = gqgo.a(locale1, false);
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp2.b_message;
                s2.getClass();
                ((gqhq)hftv0).b = s2;
                int v1 = arr_v[v];
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((gqhq)hftp2.b_message).c = v1;
                gqhn0.k(hftp2);
            }
            gqgv.a(gqhn0, ggeo0);
            arrayList0.add(((gqhr)((ProtoLiteBuilder)gqhn0).N_build()));
        }
        String s3 = huli.f();
        gqhu gqhu0 = (gqhu)((ProtoLiteMessage)gqhv.a).v_newBuilder();
        if(!gqhu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gqhu0).ensureMutable();
        }
        ((gqhv)gqhu0.b_message).c = s3;
        gged_interceptors gged0 = cbxc.c();
        int v2 = gged0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            String s4 = gqgo.b(((Locale)gged0.get(v3)), true);
            if(!gqhu0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gqhu0).ensureMutable();
            }
            gqhv gqhv0 = (gqhv)gqhu0.b_message;
            gqhv0.b();
            gqhv0.b.add(s4);
        }
        gqhv gqhv1 = (gqhv)((ProtoLiteBuilder)gqhu0).N_build();
        hfuo hfuo2 = gqie3.d;
        ggeo ggeo1 = ggeo.k(DesugarCollections.unmodifiableMap(gqie3.f));
        gqhn gqhn1 = (gqhn)((ProtoLiteMessage)gqhr.a).v_newBuilder();
        String s5 = huli.f();
        if(!gqhn1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gqhn1).ensureMutable();
        }
        ((gqhr)gqhn1.b_message).c = s5;
        gqhn1.a(hfuo2);
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: gqhv1.b) {
            Locale locale2 = gqgo.c(((String)object2), false);
            if(locale2 != null && !gggq.v(arrayList2, new gqgu(locale2))) {
                arrayList2.add(locale2);
            }
        }
        int[] arr_v1 = gqgv.b(arrayList2.size());
        for(int v4 = 0; v4 < arrayList2.size(); ++v4) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqhq.a).v_newBuilder();
            String s6 = gqgo.a(((Locale)arrayList2.get(v4)), false);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp3.b_message;
            s6.getClass();
            ((gqhq)hftv1).b = s6;
            int v5 = arr_v1[v4];
            if(!hftv1.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gqhq)hftp3.b_message).c = v5;
            gqhn1.k(hftp3);
        }
        gqgv.a(gqhn1, ggeo1);
        arrayList0.add(((gqhr)((ProtoLiteBuilder)gqhn1).N_build()));
        arrayList0.addAll(gqif0.c);
        gqht gqht0 = gqht.a;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gqht0).v_newBuilder();
        float f3 = languagePreferenceParams0.a;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp4.b_message;
        ((gqht)hftv2).b |= 1;
        ((gqht)hftv2).c = f3;
        int v6 = languagePreferenceParams0.b;
        if(!hftv2.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp4.b_message;
        ((gqht)hftv3).b |= 2;
        ((gqht)hftv3).d = v6;
        int v7 = languagePreferenceParams0.c;
        if(!hftv3.isImmutable()) {
            hftp4.ensureMutable();
        }
        gqht gqht1 = (gqht)hftp4.b_message;
        gqht1.b |= 4;
        gqht1.e = v7;
        Integer integer0 = languagePreferenceParams0.d;
        if(integer0 != null) {
            int v8 = (int)integer0;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gqht gqht2 = (gqht)hftp4.b_message;
            gqht2.b |= 8;
            gqht2.f = v8;
        }
        gqht gqht3 = (gqht)hftp4.N_build();
        String s7 = gqif0.d;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gqht0).v_newBuilder();
        if((gqht3.b & 1) == 0) {
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gqht gqht5 = (gqht)hftp5.b_message;
            gqht5.b |= 1;
            gqht5.c = -1.0f;
        }
        else {
            float f4 = gqht3.c;
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gqht gqht4 = (gqht)hftp5.b_message;
            gqht4.b |= 1;
            gqht4.c = f4;
        }
        if((gqht3.b & 2) == 0) {
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gqht gqht7 = (gqht)hftp5.b_message;
            gqht7.d = gqhm.a(3);
            gqht7.b |= 2;
        }
        else {
            int v9 = gqhm.b(gqht3.d) == 0 ? 1 : gqhm.b(gqht3.d);
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gqht gqht6 = (gqht)hftp5.b_message;
            gqht6.d = gqhm.a(v9);
            gqht6.b |= 2;
        }
        if((gqht3.b & 4) == 0) {
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gqht gqht9 = (gqht)hftp5.b_message;
            gqht9.e = gqhy.a(4);
            gqht9.b |= 4;
        }
        else {
            int v10 = gqhy.b(gqht3.e) == 0 ? 1 : gqhy.b(gqht3.e);
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gqht gqht8 = (gqht)hftp5.b_message;
            gqht8.e = gqhy.a(v10);
            gqht8.b |= 4;
        }
        if((gqht3.b & 8) != 0) {
            int v11 = gqht3.f;
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            gqht gqht10 = (gqht)hftp5.b_message;
            gqht10.b |= 8;
            gqht10.f = v11;
        }
        gqht gqht11 = (gqht)hftp5.N_build();
        ArrayList arrayList3 = new ArrayList();
        gqhb gqhb0 = new gqhb();
        int v12 = gqhy.b(gqht11.e) == 0 ? 1 : gqhy.b(gqht11.e);
        Integer integer1 = (gqht11.b & 8) == 0 ? null : ((int)gqht11.f);
        ggee ggee0 = new ggee();
        double f5 = 0.0;
        Iterator iterator2 = arrayList0.iterator();
        while(iterator2.hasNext()) {
            Object object3 = iterator2.next();
            gqhr gqhr0 = (gqhr)object3;
            if(v12 == 2) {
                f6 = 0.0f;
            }
            else {
                gfsx gfsx1 = gggq.c(gqhr0.d, new gqgw(v12));
                if(!gfsx1.i()) {
                    continue;
                }
                f6 = ((gqhz)gfsx1.d()).c;
            }
            if(integer1 == null || gqhr0.i) {
                gqhl0 = gqhr0.h == null ? gqhl.a : gqhr0.h;
            }
            else if(DesugarCollections.unmodifiableMap(gqhr0.g).containsKey(integer1)) {
                gqhl0 = (gqhl)DesugarCollections.unmodifiableMap(gqhr0.g).get(integer1);
            }
            else {
                String s8 = gqhr0.c;
                ((ggtj)cbxd.a.i()).R("Invalid value %d set for confidenceFunctionsVersion for context profile source %s. Using default confidence functions instead.", integer1, s8);
                gqhl gqhl1 = gqhr0.h;
                gqhl0 = gqhl1 == null ? gqhl.a : gqhl1;
            }
            gqgz gqgz0 = new gqgz(s7, new HashMap(ggkm.n(DesugarCollections.unmodifiableMap(gqhl0.c), new gqgx())), new HashMap(ggkm.n(DesugarCollections.unmodifiableMap(gqhl0.d), new gqgy())), ((gqhl0.b & 1) == 0 ? gqgp.b() : gqgp.c((gqhl0.e == null ? gqhi.a : gqhl0.e))));
            int v13 = 0;
            Iterator iterator3 = gqhr0.e.iterator();
            while(iterator3.hasNext()) {
                Object object4 = iterator3.next();
                gqhq gqhq0 = (gqhq)object4;
                Locale locale3 = gqgo.c(gqhq0.b, false);
                if(locale3 == null) {
                    iterator3 = iterator3;
                    s7 = s7;
                }
                else {
                    int v14 = gqhq0.c;
                    ggee0.b(locale3, new gqha(gqhr0.c, v14, f6, ((gqgp)gqgz0.apply(locale3))));
                    iterator3 = iterator3;
                    s7 = s7;
                    v12 = v12;
                    v13 += v14;
                }
            }
            f5 += (double)(((float)v13) * f6);
            iterator2 = iterator2;
            s7 = s7;
            v12 = v12;
        }
        gqhb0.a = f5;
        gqhb0.b = ggee0.a();
        ggqj ggqj0 = gqhb0.b.r().om();
        while(ggqj0.hasNext()) {
            Object object5 = ggqj0.next();
            gged_interceptors gged1 = gqhb0.b.b(((Locale)object5));
            int v15 = gged1.size();
            float f7 = 0.0f;
            double f8 = 0.0;
            for(int v16 = 0; v16 < v15; ++v16) {
                gqha gqha0 = (gqha)gged1.get(v16);
                f8 += (double)(((float)gqha0.a) * gqha0.b);
                f7 = Math.max(f7, gqha0.c.a(gqha0.a));
            }
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gqhs.a).v_newBuilder();
            String s9 = gqgo.b(((Locale)object5), false);
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp6.b_message;
            ((gqhs)hftv4).b = s9;
            double f9 = f8 / gqhb0.a;
            if(!hftv4.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp6.b_message;
            ((gqhs)hftv5).c = (float)f9;
            if(!hftv5.isImmutable()) {
                hftp6.ensureMutable();
            }
            ((gqhs)hftp6.b_message).d = f7;
            arrayList3.add(((gqhs)hftp6.N_build()));
        }
        List list0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(Object object6: arrayList3) {
            gqhs gqhs0 = (gqhs)object6;
            String s10 = gqgo.c(gqhs0.b, false).getLanguage();
            if(!hashSet0.contains(s10)) {
                Collection collection0 = ggam.a(arrayList3, new gqgg(gqhs0, s10));
                if(!collection0.isEmpty()) {
                    String s11 = gqhs0.b;
                    float f10 = gqhs0.c;
                    float f11 = gqhs0.d;
                    for(Object object7: collection0) {
                        gqhs gqhs1 = (gqhs)object7;
                        f10 += gqhs1.c;
                        float f12 = gqhs1.d;
                        if((f11 < f12)) {
                            s11 = gqhs1.b;
                            f11 = f12;
                        }
                    }
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gqhs.a).v_newBuilder();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp7.b_message;
                    s11.getClass();
                    ((gqhs)hftv6).b = s11;
                    if(!hftv6.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ProtoLiteMessage hftv7 = hftp7.b_message;
                    ((gqhs)hftv7).c = f10;
                    if(!hftv7.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ((gqhs)hftp7.b_message).d = f11;
                    gqhs0 = (gqhs)hftp7.N_build();
                }
                list0.add(gqhs0);
                hashSet0.add(s10);
            }
        }
        float f13 = gqht11.c;
        int v17 = gqhm.b(gqht11.d);
        if(f13 < 0.0f) {
            f13 = (v17 == 0 ? 1 : v17) - 2 == 2 ? gqie3.b : gqie3.c;
        }
        gggq.y(list0, new gqgh(f13));
        Collections.sort(list0, new gqgi());
        return list0;
    }

    private static final gqif d(gqif gqif0) {
        if(huli.a.e().C()) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gqif0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gqif0));
            if(!((gqia)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gqia)hftp0))).ensureMutable();
            }
            ((gqif)((gqia)hftp0).b_message).c = hfvv.a;
            for(Object object0: gqif0.c) {
                gqhr gqhr0 = (gqhr)object0;
                if(huli.d().b.contains(gqhr0.c)) {
                    if(!((gqia)hftp0).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((gqia)hftp0))).ensureMutable();
                    }
                    gqif gqif1 = (gqif)((gqia)hftp0).b_message;
                    gqhr0.getClass();
                    gqif1.b();
                    gqif1.c.add(gqhr0);
                }
            }
            return (gqif)((ProtoLiteBuilder)(((gqia)hftp0))).N_build();
        }
        return gqif0;
    }
}

