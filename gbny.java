import android.content.res.Resources.Theme;
import android.content.res.Resources;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class gbny implements gbon {
    public static final gbny a;

    static {
        gbny.a = new gbny();
    }

    @Override  // gbon
    public final hdul a(byte[] arr_b, Resources resources0, Resources.Theme resources$Theme0) {
        hdrl hdrl14;
        hdrl hdrl11;
        Resources resources1;
        fbcb fbcb3;
        String s3;
        hdrl hdrl8;
        ArrayList arrayList3;
        String s2;
        fbcb fbcb2;
        ArrayList arrayList2;
        boolean z4;
        gboa gboa1;
        boolean z3;
        String s1;
        gbod gbod1;
        boolean z2;
        boolean z1;
        Object object2;
        ibuq.f(resources0, "resources");
        gbot gbot0 = new gbot();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fbch.a), arr_b, 0, arr_b.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((fbch)hftv0), "parseFrom(...)");
        ibuq.f(((fbch)hftv0), "<this>");
        ibuq.f(resources0, "resources");
        ArrayList arrayList0 = new ArrayList();
        int v = ((fbch)hftv0).c;
        if(v == 3) {
            for(Object object0: new hfuh(((fbce)((fbch)hftv0).d).c, fbce.a)) {
                fbcg fbcg0 = (fbcg)object0;
                if(fbcg0 == fbcg.b) {
                    arrayList0.add(gbok.a(resources0));
                    continue;
                }
                fbcg fbcg1 = fbcg.c;
                if(fbcg0 == fbcg1) {
                    fbby fbby0 = fbbx.a(((ProtoLiteMessage)fbcb.a).v_newBuilder());
                    ibuq.e("Tap to add a card", "getString(...)");
                    fbby0.e("Tap to add a card");
                    ghim ghim0 = gawi.b(new ghim[]{gawi.c("Hold your card close to the back of your device until it vibrates."), gbok.c(resources0)});
                    ibuq.e(ghim0, "concatSafeHtmlProto(...)");
                    fbby0.d(ghim0);
                    ibuq.e("Tap card to phone", "getString(...)");
                    fbby0.c("Tap card to phone");
                    ibuq.e("Enter details manually", "getString(...)");
                    fbby0.b("Enter details manually");
                    fbby0.f(fbcg1);
                    arrayList0.add(fbby0.a());
                    continue;
                }
                String s = String.format(Locale.US, "Unknown screenType: %d.", Arrays.copyOf(new Object[]{fbcg0}, 1));
                ibuq.e(s, "format(...)");
                throw new IllegalArgumentException(s);
            }
        }
        else if(v == 2) {
            hfuo hfuo0 = ((fbcc)((fbch)hftv0).d).b;
            ibuq.e(hfuo0, "getValueList(...)");
            arrayList0.addAll(hfuo0);
        }
        else {
            arrayList0.add(gbok.a(resources0));
        }
        gbod gbod0 = new gbod();
        gboa gboa0 = new gboa();
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            fbcg fbcg2 = fbcg.b(((fbcb)object1).f);
            if(fbcg2 == null) {
                fbcg2 = fbcg.a;
            }
            if(fbcg2 != fbcg.b) {
                continue;
            }
            goto label_53;
        }
        object1 = null;
    label_53:
        fbcb fbcb0 = (fbcb)object1;
        Iterator iterator2 = arrayList0.iterator();
        while(true) {
            object2 = null;
            if(!iterator2.hasNext()) {
                break;
            }
            object2 = iterator2.next();
            fbcg fbcg3 = fbcg.b(((fbcb)object2).f);
            if(fbcg3 == null) {
                fbcg3 = fbcg.a;
            }
            if(fbcg3 == fbcg.c) {
                break;
            }
        }
        fbcb fbcb1 = (fbcb)object2;
        boolean z = fbcb1 != null;
        if(fbcb0 == null) {
            arrayList2 = arrayList0;
            z3 = false;
            gboa1 = gboa0;
            arrayList3 = arrayList1;
            hdrl8 = null;
        }
        else {
            fbcg fbcg4 = fbcg.b(((fbcb)arrayList0.get(0)).f);
            if(fbcg4 == null) {
                fbcg4 = fbcg.a;
            }
            fbcg fbcg5 = fbcg.b;
            if(fbcg4 == fbcg5) {
                z1 = z;
                z2 = true;
            }
            else {
                z1 = z;
                z2 = false;
            }
            if(fbcb1 == null) {
                gbod1 = gbod0;
                fbcb1 = null;
                s1 = null;
            }
            else {
                gbod1 = gbod0;
                s1 = fbcb1.g;
            }
            ibuq.f(fbcb0, "recognitionScreen");
            ibuq.f(resources0, "resources");
            z3 = fbcb0 != null;
            gbod1.b(gbot0, resources0, fbcb0, z2, z1, s1);
            gbod1.c(gbot0, resources0, z1);
            hdrf hdrf0 = hdrf.b;
            hdpz hdpz0 = hdpy.a(((ProtoLiteMessage)hdrf0).v_newBuilder());
            hdqh hdqh0 = hdqh.a;
            hdpr hdpr0 = hdpq.a(((ProtoLiteMessage)hdqh0).v_newBuilder());
            hdpr0.e(gboy.c(gboy.a(resources0, 0x7F070289)));  // dimen:bc25_ocr_margin
            hdpz0.e(hdpr0.a());
            hdrf hdrf1 = hdpz0.a();
            hdsp hdsp0 = hdso.a(((ProtoLiteMessage)hdtf.a).v_newBuilder());
            hdsp0.c(gboy.c(gboy.a(resources0, 0x7F07026E)));  // dimen:bc25_border_corner_radius
            hdtf hdtf0 = hdsp0.a();
            gbob gbob0 = gbod1.a;
            if(gbob0 == null) {
                ibuq.j("ocrDataBundle");
                gbob0 = null;
            }
            hdrl hdrl0 = gboj.a(gbob0.k, hdrf1, hdtf0, null, gbot0);
            hdrl hdrl1 = gbod1.a(resources0, gbot0, null);
            hdrk hdrk0 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
            hdrk0.f(gbot0.e());
            hfta hfta0 = hdhl.f;
            hdrk0.d(hfta0.a());
            ibuq.e(hfta0, "containerNodeExtension");
            hdhi hdhi0 = (hdhi)((ProtoLiteMessage)hdhl.a).v_newBuilder();
            hdhl hdhl0 = hdhl.a;
            hdhh hdhh0 = hdhg.a(hdhi0);
            hdhh0.e();
            hdrl hdrl2 = hdrl.a;
            gboc gboc0 = gbod1.b;
            if(gboc0 == null) {
                ibuq.j("ocrNodeBundle");
                gboc0 = null;
            }
            hdhh0.d(gboc0.b);
            hdhh0.e();
            gboc gboc1 = gbod1.b;
            if(gboc1 == null) {
                ibuq.j("ocrNodeBundle");
                gboc1 = null;
            }
            hdhh0.d(gboc1.c);
            hdhh0.e();
            gboc gboc2 = gbod1.b;
            if(gboc2 == null) {
                ibuq.j("ocrNodeBundle");
                gboc2 = null;
            }
            hdhh0.c(gboc2.d);
            hdhh0.e();
            hdhh0.d(hdrl0);
            hdhk hdhk0 = hdhk.c;
            hdhh0.b(hdhk0);
            hdrk0.c(hfta0, hdhh0.a());
            hdrn hdrn0 = hdrm.a(((hftr)((ProtoLiteMessage)hdrw.a).v_newBuilder()));
            hdrn0.d();
            hdrv hdrv0 = hdrv.b;
            hdru hdru0 = (hdru)((ProtoLiteMessage)hdrv0).v_newBuilder();
            hdrw hdrw0 = hdrw.a;
            hdpk hdpk0 = hdpj.a(hdru0);
            hdrz hdrz0 = hdrz.a;
            gboa1 = gboa0;
            hdrs hdrs0 = hdrr.a(((ProtoLiteMessage)hdrz0).v_newBuilder());
            hdpz hdpz1 = hdpy.a(((ProtoLiteMessage)hdrf0).v_newBuilder());
            hdqk hdqk0 = hdqk.a;
            hdpt hdpt0 = hdps.a(((ProtoLiteMessage)hdqk0).v_newBuilder());
            hdqm hdqm0 = hdqm.d;
            hdpt0.c(hdqm0);
            hdqo hdqo0 = hdqo.c;
            hdpt0.d(hdqo0);
            hdpt0.b(hdqj.c);
            hdpz1.b(hdpt0.a());
            hdpr hdpr1 = hdpq.a(((ProtoLiteMessage)hdqh0).v_newBuilder());
            hdpr1.e(gboy.c(gboy.a(resources0, 0x7F070D0F)));  // dimen:ocr_default_spacing
            hdpr1.d(gboy.c(gboy.a(resources0, 0x7F070D18)));  // dimen:ocr_medium_spacing
            hdpr1.c(gboy.c(gboy.a(resources0, 0x7F070D18)));  // dimen:ocr_medium_spacing
            hdpz1.g(hdpr1.a());
            hdpv hdpv0 = hdpu.a(((ProtoLiteMessage)hdqp.a).v_newBuilder());
            hdpv0.c();
            hdpz1.c(hdpv0.a());
            hdrs0.c(hdpz1.a());
            hdpk0.b(hdrs0.a());
            hdrn0.b(hdpk0.a());
            hdrk0.e(hdrn0.a());
            hdrl hdrl3 = hdrk0.a();
            List list0 = ibpo.i(new hdrl[]{hdrl1});
            if(z1) {
                gboc gboc3 = gbod1.b;
                if(gboc3 == null) {
                    ibuq.j("ocrNodeBundle");
                    gboc3 = null;
                }
                hdrl hdrl4 = gboc3.e;
                if(hdrl4 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                list0.add(hdrl4);
                z4 = true;
            }
            else {
                z4 = false;
            }
            gboc gboc4 = gbod1.b;
            if(gboc4 == null) {
                ibuq.j("ocrNodeBundle");
                gboc4 = null;
            }
            list0.add(gboc4.f);
            hdrk hdrk1 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl2).v_newBuilder()));
            hdrk1.f(gbot0.e());
            hdrk1.d(hfta0.a());
            ibuq.e(hfta0, "containerNodeExtension");
            hdhh hdhh1 = hdhg.a(((hdhi)((ProtoLiteMessage)hdhl0).v_newBuilder()));
            hdhh1.e();
            hdhh1.c(list0);
            hdhh1.b(hdhk0);
            hdrk1.c(hfta0, hdhh1.a());
            hdrn hdrn1 = hdrm.a(((hftr)((ProtoLiteMessage)hdrw0).v_newBuilder()));
            hdrn1.d();
            hdpk hdpk1 = hdpj.a(((hdru)((ProtoLiteMessage)hdrv0).v_newBuilder()));
            hdrs hdrs1 = hdrr.a(((ProtoLiteMessage)hdrz0).v_newBuilder());
            hdpz hdpz2 = hdpy.a(((ProtoLiteMessage)hdrf0).v_newBuilder());
            hdpt hdpt1 = hdps.a(((ProtoLiteMessage)hdqk0).v_newBuilder());
            hdpt1.c(hdqm0);
            hdpt1.d(hdqo.d);
            hdpz2.b(hdpt1.a());
            hdpr hdpr2 = hdpq.a(((ProtoLiteMessage)hdqh0).v_newBuilder());
            hdpr2.e(gboy.c(gboy.a(resources0, 0x7F070D0F)));  // dimen:ocr_default_spacing
            hdpr2.d(gboy.c(gboy.a(resources0, 0x7F070D18)));  // dimen:ocr_medium_spacing
            hdpr2.c(gboy.c(gboy.a(resources0, 0x7F070D18)));  // dimen:ocr_medium_spacing
            hdpr2.b(gboy.c(gboy.a(resources0, 0x7F070D0F)));  // dimen:ocr_default_spacing
            hdpz2.g(hdpr2.a());
            hdrs1.c(hdpz2.a());
            hdpk1.b(hdrs1.a());
            hdrn1.b(hdpk1.a());
            hdrk1.e(hdrn1.a());
            hdrl hdrl5 = hdrk1.a();
            hdrk hdrk2 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl2).v_newBuilder()));
            hdrk2.f(gbot0.e());
            hdrk2.d(hfta0.a());
            ibuq.e(hfta0, "containerNodeExtension");
            hdhh hdhh2 = hdhg.a(((hdhi)((ProtoLiteMessage)hdhl0).v_newBuilder()));
            hdhh2.e();
            gboc gboc5 = gbod1.b;
            if(gboc5 == null) {
                ibuq.j("ocrNodeBundle");
                gboc5 = null;
            }
            hdhh2.d(gboc5.a);
            hdhh2.e();
            hdhh2.d(hdrl3);
            hdhh2.e();
            hdhh2.d(hdrl5);
            hdhh2.b(hdhk0);
            hdrk2.c(hfta0, hdhh2.a());
            hdrn hdrn2 = hdrm.a(((hftr)((ProtoLiteMessage)hdrw0).v_newBuilder()));
            hdrn2.d();
            hdpk hdpk2 = hdpj.a(((hdru)((ProtoLiteMessage)hdrv0).v_newBuilder()));
            hdrs hdrs2 = hdrr.a(((ProtoLiteMessage)hdrz0).v_newBuilder());
            hdpz hdpz3 = hdpy.a(((ProtoLiteMessage)hdrf0).v_newBuilder());
            hdsf hdsf0 = hdse.a(((ProtoLiteMessage)hdsi.a).v_newBuilder());
            hdsf0.b(hdsh.c);
            hdpz3.d(hdsf0.a());
            hdpt hdpt2 = hdps.a(((ProtoLiteMessage)hdqk0).v_newBuilder());
            hdpt2.c(hdqm0);
            hdpt2.d(hdqo0);
            hdpz3.b(hdpt2.a());
            hdrs2.c(hdpz3.a());
            hdpk2.b(hdrs2.a());
            hdrn2.b(hdpk2.a());
            hdrk2.e(hdrn2.a());
            hdrl hdrl6 = hdrk2.a();
            arrayList2 = arrayList0;
            fbcg fbcg6 = fbcg.b(((fbcb)arrayList2.get(0)).f);
            if(fbcg6 == null) {
                fbcg6 = fbcg.a;
            }
            if(fbcb1 == null) {
                fbcb2 = null;
                s2 = null;
            }
            else {
                fbcb2 = fbcb1;
                s2 = fbcb2.g;
            }
            fbcb0 = fbcb0;
            gbot0 = gbot0;
            hdrl hdrl7 = gbny.c(gbod1.d(fbcb0, resources0, gbot0, fbcg6 == fbcg5, z4, s2), hdrl6);
            gbob gbob1 = gbod1.a;
            if(gbob1 == null) {
                ibuq.j("ocrDataBundle");
                gbob1 = null;
            }
            ibqm ibqm0 = new ibqm(null);
            ibqm0.add(gbob1.a);
            ibqm0.add(gbob1.b);
            ibqm0.add(gbob1.c);
            ibqm0.add(gbob1.d);
            ibqm0.add(gbob1.e);
            ibqm0.add(gbob1.f);
            ibqm0.add(gbob1.g);
            ibqm0.add(gbob1.h);
            ibqm0.add(gbob1.i);
            ibqm0.add(gbob1.j);
            ibqm0.add(gbob1.k);
            ibqm0.add(gbob1.l);
            if(z4) {
                hcnu hcnu0 = gbob1.m;
                if(hcnu0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ibqm0.add(hcnu0);
                hcnu hcnu1 = gbob1.n;
                if(hcnu1 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ibqm0.add(hcnu1);
            }
            ibqm0.add(gbob1.o);
            ibqm0.add(gbob1.p);
            ibqm0.add(gbob1.q);
            arrayList3 = arrayList1;
            arrayList3.addAll(ibpo.a(ibqm0));
            fbcb1 = fbcb2;
            hdrl8 = hdrl7;
            z = z4;
        }
        if(z) {
            fbcg fbcg7 = fbcg.b(((fbcb)arrayList2.get(0)).f);
            if(fbcg7 == null) {
                fbcg7 = fbcg.a;
            }
            fbcg fbcg8 = fbcg.c;
            if(fbcb0 == null) {
                s3 = null;
                fbcb3 = null;
            }
            else {
                s3 = fbcb0.g;
                fbcb3 = fbcb0;
            }
            hdrl hdrl9 = gboa1.b(fbcb1, resources0, gbot0, fbcg7 == fbcg8, z3, s3);
            fbcg fbcg9 = fbcg.b(((fbcb)arrayList2.get(0)).f);
            if(fbcg9 == null) {
                fbcg9 = fbcg.a;
            }
            resources1 = resources0;
            hdrl hdrl10 = gbny.c(gboa1.a(fbcb1, resources1, gbot0, fbcg9 == fbcg8, z3, (fbcb3 == null ? null : fbcb3.g)), hdrl9);
            ibqm ibqm1 = new ibqm(null);
            gbnz gbnz0 = gboa1.a;
            if(gbnz0 == null) {
                ibuq.j("nfcDataNodeBundle");
                gbnz0 = null;
            }
            ibqm1.add(gbnz0.a);
            gbnz gbnz1 = gboa1.a;
            if(gbnz1 == null) {
                ibuq.j("nfcDataNodeBundle");
                gbnz1 = null;
            }
            ibqm1.add(gbnz1.b);
            gbnz gbnz2 = gboa1.a;
            if(gbnz2 == null) {
                ibuq.j("nfcDataNodeBundle");
                gbnz2 = null;
            }
            ibqm1.add(gbnz2.c);
            gbnz gbnz3 = gboa1.a;
            if(gbnz3 == null) {
                ibuq.j("nfcDataNodeBundle");
                gbnz3 = null;
            }
            ibqm1.add(gbnz3.d);
            gbnz gbnz4 = gboa1.a;
            if(gbnz4 == null) {
                ibuq.j("nfcDataNodeBundle");
                gbnz4 = null;
            }
            ibqm1.add(gbnz4.e);
            gbnz gbnz5 = gboa1.a;
            if(gbnz5 == null) {
                ibuq.j("nfcDataNodeBundle");
                gbnz5 = null;
            }
            ibqm1.add(gbnz5.f);
            gbnz gbnz6 = gboa1.a;
            if(gbnz6 == null) {
                ibuq.j("nfcDataNodeBundle");
                gbnz6 = null;
            }
            ibqm1.add(gbnz6.g);
            if(z3) {
                gbnz gbnz7 = gboa1.a;
                if(gbnz7 == null) {
                    ibuq.j("nfcDataNodeBundle");
                    gbnz7 = null;
                }
                hcnu hcnu2 = gbnz7.h;
                if(hcnu2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ibqm1.add(hcnu2);
                gbnz gbnz8 = gboa1.a;
                if(gbnz8 == null) {
                    ibuq.j("nfcDataNodeBundle");
                    gbnz8 = null;
                }
                hcnu hcnu3 = gbnz8.i;
                if(hcnu3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ibqm1.add(hcnu3);
                gbnz gbnz9 = gboa1.a;
                if(gbnz9 == null) {
                    ibuq.j("nfcDataNodeBundle");
                    gbnz9 = null;
                }
                hcnu hcnu4 = gbnz9.j;
                if(hcnu4 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ibqm1.add(hcnu4);
            }
            gbnz gbnz10 = gboa1.a;
            if(gbnz10 == null) {
                ibuq.j("nfcDataNodeBundle");
                gbnz10 = null;
            }
            ibqm1.add(gbnz10.k);
            gbnz gbnz11 = gboa1.a;
            if(gbnz11 == null) {
                ibuq.j("nfcDataNodeBundle");
                gbnz11 = null;
            }
            ibqm1.add(gbnz11.l);
            gbnz gbnz12 = gboa1.a;
            if(gbnz12 == null) {
                ibuq.j("nfcDataNodeBundle");
                gbnz12 = null;
            }
            ibqm1.add(gbnz12.m);
            arrayList3.addAll(ibpo.a(ibqm1));
            hdrl11 = hdrl10;
        }
        else {
            resources1 = resources0;
            hdrl11 = null;
        }
        if(hdrl8 != null && hdrl11 != null) {
            hduc hduc0 = hdub.a(((hftr)((ProtoLiteMessage)hdud.a).v_newBuilder()));
            hduc0.b(1);
            hdud hdud0 = hduc0.a();
            hduc hduc1 = hdub.a(((hftr)((ProtoLiteMessage)hdud.a).v_newBuilder()));
            hduc1.b(2);
            hdud hdud1 = hduc1.a();
            hcnt hcnt0 = hcns.a(((hftr)((ProtoLiteMessage)hcnu.a).v_newBuilder()));
            hcon hcon0 = hcom.a(((hftr)((ProtoLiteMessage)hcos.a).v_newBuilder()));
            hcon0.b(gbot0.c());
            hfta hfta1 = hdtz.d;
            ibuq.e(hfta1, "oneOfDataValueExtension");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hdtz.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            fbcg fbcg10 = fbcg.b(((fbcb)arrayList2.get(0)).f);
            if(fbcg10 == null) {
                fbcg10 = fbcg.a;
            }
            int v1 = fbcg10 == fbcg.b ? 1 : 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hdtz hdtz0 = (hdtz)hftp0.b_message;
            hdtz0.b |= 1;
            hdtz0.c = v1;
            ProtoLiteMessage hftv1 = hftp0.N_build();
            ibuq.e(hftv1, "build(...)");
            hcon0.c(hfta1, ((hdtz)hftv1));
            hcnt0.c(hcon0.a());
            hcnt0.e(hdtt.c.a());
            ibuq.e(hdtt.c, "oneOfDataExtension");
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hdtt.a).v_newBuilder();
            ibuq.f(hftp1, "builder");
            hdts.b(hftp1);
            hdts.a(hdud0, hftp1);
            hdts.b(hftp1);
            hdts.a(hdud1, hftp1);
            ProtoLiteMessage hftv2 = hftp1.N_build();
            ibuq.e(hftv2, "build(...)");
            hcnt0.d(hdtt.c, ((hdtt)hftv2));
            hcnt0.i();
            hcnt0.f(gbox.a(gbot0, 17L, 2));
            hcnt0.i();
            hcnt0.f(gbox.a(gbot0, 5L, 1));
            hcnt0.j();
            hftr hftr0 = gbov.h(new long[]{12L});
            gbox.d(hftr0, 1);
            ProtoLiteMessage hftv3 = ((ProtoLiteBuilder)hftr0).N_build();
            ibuq.e(hftv3, "build(...)");
            hcnt0.g(((hcrz)hftv3));
            hcnt0.j();
            hftr hftr1 = gbov.h(new long[]{11L});
            gbox.d(hftr1, 2);
            ProtoLiteMessage hftv4 = ((ProtoLiteBuilder)hftr1).N_build();
            ibuq.e(hftv4, "build(...)");
            hcnt0.g(((hcrz)hftv4));
            hcnu hcnu5 = hcnt0.a();
            hdrl hdrl12 = gbox.b(gbot0, 1, hdrl8, hcnu5);
            hdrl hdrl13 = gbox.b(gbot0, 2, hdrl11, hcnu5);
            hdrk hdrk3 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
            hdrk3.f(gbot0.e());
            hdrk3.d(hdhl.f.a());
            ibuq.e(hdhl.f, "containerNodeExtension");
            hdhh hdhh3 = hdhg.a(((hdhi)((ProtoLiteMessage)hdhl.a).v_newBuilder()));
            hdhh3.e();
            hdhh3.d(hdrl12);
            hdhh3.e();
            hdhh3.d(hdrl13);
            hdhh3.b(hdhk.c);
            hdhl hdhl1 = hdhh3.a();
            hdrk3.c(hdhl.f, hdhl1);
            hdrn hdrn3 = hdrm.a(((hftr)((ProtoLiteMessage)hdrw.a).v_newBuilder()));
            hdrn3.d();
            hdpk hdpk3 = hdpj.a(((hdru)((ProtoLiteMessage)hdrv.b).v_newBuilder()));
            hdrs hdrs3 = hdrr.a(((ProtoLiteMessage)hdrz.a).v_newBuilder());
            hdpz hdpz4 = hdpy.a(((ProtoLiteMessage)hdrf.b).v_newBuilder());
            hdsf hdsf1 = hdse.a(((ProtoLiteMessage)hdsi.a).v_newBuilder());
            hdsf1.b(hdsh.c);
            hdpz4.d(hdsf1.a());
            hdrs3.c(hdpz4.a());
            hdpk3.b(hdrs3.a());
            hdrn3.b(hdpk3.a());
            hdrk3.e(hdrn3.a());
            hdrl14 = hdrk3.a();
            arrayList3.add(hcnu5);
        }
        else {
            hdrl14 = null;
        }
        ibuq.f(resources1, "resources");
        hcnt hcnt1 = hcns.a(((hftr)((ProtoLiteMessage)hcnu.a).v_newBuilder()));
        hcon hcon1 = hcom.a(((hftr)((ProtoLiteMessage)hcos.a).v_newBuilder()));
        hcon1.b(gbot0.c());
        hcnt1.c(hcon1.a());
        hcnt1.e(hdcz.c.a());
        ibuq.e(hdcz.c, "infrastructureDataExtension");
        ibuq.e(hdcz.a, "getDefaultInstance(...)");
        hcnt1.d(hdcz.c, hdcz.a);
        hcnt1.k();
        hftr hftr2 = gbov.i(gbot0, new long[]{5L, 17L});
        gbow.c(hftr2, hddb.b);
        ProtoLiteMessage hftv5 = ((ProtoLiteBuilder)hftr2).N_build();
        ibuq.e(hftv5, "build(...)");
        hcnt1.h(((hcsi)hftv5));
        hcnt1.j();
        hftr hftr3 = gbov.h(new long[]{2L});
        hdct hdct0 = hdcs.a(((hddk)((ProtoLiteMessage)hddl.a).v_newBuilder()));
        hdct0.c();
        hdct0.b(-100L);
        hddl hddl0 = hdct0.a();
        gbow.b(hftr3, hddn.b, hddl0, null, 28);
        ProtoLiteMessage hftv6 = ((ProtoLiteBuilder)hftr3).N_build();
        ibuq.e(hftv6, "build(...)");
        hcnt1.g(((hcrz)hftv6));
        hcnt1.j();
        hftr hftr4 = gbov.h(new long[]{13L});
        hdct hdct1 = hdcs.a(((hddk)((ProtoLiteMessage)hddl.a).v_newBuilder()));
        hdct1.c();
        hdct1.b(-101L);
        hddl hddl1 = hdct1.a();
        gbow.b(hftr4, hddn.b, hddl1, null, 28);
        ProtoLiteMessage hftv7 = ((ProtoLiteBuilder)hftr4).N_build();
        ibuq.e(hftv7, "build(...)");
        hcnt1.g(((hcrz)hftv7));
        hcnt1.j();
        hftr hftr5 = gbov.h(new long[]{1L});
        hcjr hcjr0 = hcjq.a(((hftr)((ProtoLiteMessage)hcjo.a).v_newBuilder()));
        fbcj fbcj0 = fbci.a(((ProtoLiteMessage)fbck.a).v_newBuilder());
        fbcj0.b(10007);
        fbcj0.c(fbcg.b);
        hcjr0.b(fbcj0.a().getDefaultInstanceForType());
        hcjo hcjo0 = hcjr0.a();
        gbow.b(hftr5, hddn.c, null, hcjo0, 22);
        ProtoLiteMessage hftv8 = ((ProtoLiteBuilder)hftr5).N_build();
        ibuq.e(hftv8, "build(...)");
        hcnt1.g(((hcrz)hftv8));
        hcnt1.j();
        hftr hftr6 = gbov.h(new long[]{16L});
        hcjr hcjr1 = hcjq.a(((hftr)((ProtoLiteMessage)hcjo.a).v_newBuilder()));
        fbcj fbcj1 = fbci.a(((ProtoLiteMessage)fbck.a).v_newBuilder());
        fbcj1.b(10007);
        fbcj1.c(fbcg.c);
        hcjr1.b(fbcj1.a().getDefaultInstanceForType());
        hcjo hcjo1 = hcjr1.a();
        gbow.b(hftr6, hddn.c, null, hcjo1, 22);
        ProtoLiteMessage hftv9 = ((ProtoLiteBuilder)hftr6).N_build();
        ibuq.e(hftv9, "build(...)");
        hcnt1.g(((hcrz)hftv9));
        hcnt1.j();
        hftr hftr7 = gbov.h(new long[]{5L});
        hcjr hcjr2 = hcjq.a(((hftr)((ProtoLiteMessage)hcjo.a).v_newBuilder()));
        fbcj fbcj2 = fbci.a(((ProtoLiteMessage)fbck.a).v_newBuilder());
        fbcj2.b(0);
        fbcj2.c(fbcg.b);
        hcjr2.b(fbcj2.a().getDefaultInstanceForType());
        hcjo hcjo2 = hcjr2.a();
        gbow.b(hftr7, hddn.c, null, hcjo2, 22);
        ProtoLiteMessage hftv10 = ((ProtoLiteBuilder)hftr7).N_build();
        ibuq.e(hftv10, "build(...)");
        hcnt1.g(((hcrz)hftv10));
        hcnt1.j();
        hftr hftr8 = gbov.h(new long[]{17L});
        hcjr hcjr3 = hcjq.a(((hftr)((ProtoLiteMessage)hcjo.a).v_newBuilder()));
        fbcj fbcj3 = fbci.a(((ProtoLiteMessage)fbck.a).v_newBuilder());
        fbcj3.b(0);
        fbcj3.c(fbcg.c);
        hcjr3.b(fbcj3.a().getDefaultInstanceForType());
        hcjo hcjo3 = hcjr3.a();
        gbow.b(hftr8, hddn.c, null, hcjo3, 22);
        ProtoLiteMessage hftv11 = ((ProtoLiteBuilder)hftr8).N_build();
        ibuq.e(hftv11, "build(...)");
        hcnt1.g(((hcrz)hftv11));
        hcnt1.j();
        hftr hftr9 = gbov.h(new long[]{3L, 4L});
        hcjr hcjr4 = hcjq.a(((hftr)((ProtoLiteMessage)hcjo.a).v_newBuilder()));
        fbcj fbcj4 = fbci.a(((ProtoLiteMessage)fbck.a).v_newBuilder());
        fbcj4.b(10003);
        fbcj4.c(fbcg.b);
        hcjr4.b(fbcj4.a().getDefaultInstanceForType());
        hcjo hcjo4 = hcjr4.a();
        gbow.b(hftr9, hddn.d, null, hcjo4, 22);
        ProtoLiteMessage hftv12 = ((ProtoLiteBuilder)hftr9).N_build();
        ibuq.e(hftv12, "build(...)");
        hcnt1.g(((hcrz)hftv12));
        hcnt1.j();
        ibuq.e("Credit card number recognized.", "getString(...)");
        hcnt1.g(gbow.a("Credit card number recognized.", new long[]{2L}));
        hcnt1.j();
        ibuq.e("Credit card number not recognized.", "getString(...)");
        hcnt1.g(gbow.a("Credit card number not recognized.", new long[]{3L, 4L}));
        hcnu hcnu6 = hcnt1.a();
        if(hdrl14 != null) {
            hdrl8 = hdrl14;
        }
        else if(hdrl8 == null) {
            hdrl8 = hdrl11;
        }
        hduj hduj0 = hdui.a(((hduk)((ProtoLiteMessage)hdul.a).v_newBuilder()));
        hdrk hdrk4 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
        hdrk4.f(gbot0.e());
        hfta hfta2 = hctd.d;
        hdrk4.d(hfta2.a());
        ibuq.e(hfta2, "fullSheetNodeExtension");
        hctc hctc0 = hctb.a(((ProtoLiteMessage)hctd.a).v_newBuilder());
        if(hdrl8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        hctc0.b(hdrl8);
        hdrk4.c(hfta2, hctc0.a());
        hdrn hdrn4 = hdrm.a(((hftr)((ProtoLiteMessage)hdrw.a).v_newBuilder()));
        hdrn4.d();
        hdpk hdpk4 = hdpj.a(((hdru)((ProtoLiteMessage)hdrv.b).v_newBuilder()));
        hdrs hdrs4 = hdrr.a(((ProtoLiteMessage)hdrz.a).v_newBuilder());
        hdsp hdsp1 = hdso.a(((ProtoLiteMessage)hdtf.a).v_newBuilder());
        hdsp1.b(29);
        hdrs4.d(hdsp1.a());
        hdpk4.b(hdrs4.a());
        hdrn4.b(hdpk4.a());
        hdrk4.e(hdrn4.a());
        hduj0.b(hdrk4.a());
        hduj0.f();
        hduj0.d(arrayList3);
        hduj0.f();
        hduj0.e(hcnu6);
        hdun hdun0 = hdum.a(((hdup)((ProtoLiteMessage)hdus.a).v_newBuilder()));
        hdun0.c();
        hdrn hdrn5 = hdrm.a(((hftr)((ProtoLiteMessage)hdrw.a).v_newBuilder()));
        hdrn5.d();
        hdpk hdpk5 = hdpj.a(((hdru)((ProtoLiteMessage)hdrv.b).v_newBuilder()));
        hdrs hdrs5 = hdrr.a(((ProtoLiteMessage)hdrz.a).v_newBuilder());
        hdpz hdpz5 = hdpy.a(((ProtoLiteMessage)hdrf.b).v_newBuilder());
        hdsf hdsf2 = hdse.a(((ProtoLiteMessage)hdsi.a).v_newBuilder());
        hdsf2.b(hdsh.d);
        hdpz5.d(hdsf2.a());
        hdsf hdsf3 = hdse.a(((ProtoLiteMessage)hdsi.a).v_newBuilder());
        hdsf3.b(hdsh.c);
        hdpz5.i(hdsf3.a());
        hdrs5.c(hdpz5.a());
        hdsp hdsp2 = hdso.a(((ProtoLiteMessage)hdtf.a).v_newBuilder());
        hdpx hdpx0 = hdpw.a(((ProtoLiteMessage)hdtc.a).v_newBuilder());
        hdpx0.f(hdsz.b);
        hdsp2.f(hdpx0.a());
        hdrs5.d(hdsp2.a());
        hdpk5.b(hdrs5.a());
        hdrn5.b(hdpk5.a());
        hdun0.b(hdrn5.a());
        hduj0.c(hdun0.a());
        return hduj0.a();
    }

    @Override  // gbon
    public final byte[] b(gboe gboe0, hddo hddo0) {
        return gbom.a(gboe0, hddo0);
    }

    private static final hdrl c(hdrl hdrl0, hdrl hdrl1) {
        fbba fbba0 = fbba.a;
        fbax fbax0 = fbaw.a(((ProtoLiteMessage)fbba0).v_newBuilder());
        ProtoLiteBuilder hftp0 = fbax0.a;
        List list0 = DesugarCollections.unmodifiableList(((fbba)hftp0.b_message).c);
        ibuq.e(list0, "getDeviceStateConditionList(...)");
        new hfxu(list0);
        hdpm hdpm0 = hdpl.a(((ProtoLiteMessage)hdpp.a).v_newBuilder());
        hdpm0.b(hdpo.b);
        hdpp hdpp0 = hdpm0.a();
        ibuq.f(hdpp0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbba fbba1 = (fbba)hftp0.b_message;
        hdpp0.getClass();
        fbba1.b();
        fbba1.c.add(hdpp0);
        fbax0.b(hdrl0.c);
        fbba fbba2 = fbax0.a();
        fbax fbax1 = fbaw.a(((ProtoLiteMessage)fbba0).v_newBuilder());
        fbax1.b(hdrl1.c);
        fbba fbba3 = fbax1.a();
        hdrk hdrk0 = hdrj.a(((hftr)((ProtoLiteMessage)hdrl.a).v_newBuilder()));
        hdrk0.d(fbbb.d.a());
        ibuq.e(fbbb.d, "deviceStateConditionalNodeExtension");
        fbaz fbaz0 = (fbaz)((ProtoLiteMessage)fbbb.a).v_newBuilder();
        ibuq.f(fbaz0, "builder");
        fbay.d(fbaz0);
        fbay.b(fbba2, fbaz0);
        fbay.d(fbaz0);
        fbay.b(fbba3, fbaz0);
        fbay.c(fbaz0);
        fbay.a(hdrl0, fbaz0);
        fbay.c(fbaz0);
        fbay.a(hdrl1, fbaz0);
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)fbaz0).N_build();
        ibuq.e(hftv0, "build(...)");
        hdrk0.c(fbbb.d, ((fbbb)hftv0));
        return hdrk0.a();
    }
}

