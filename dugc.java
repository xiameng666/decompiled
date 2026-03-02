import android.content.Context;
import android.util.Pair;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.pay.pass.common.template.detail.DetailListTemplate;
import com.google.android.gms.pay.pass.idcard.model.MdocDetailsModel;
import com.google.android.gms.pay.pass.idcard.view.components.MsoDropDown;
import com.google.android.libraries.tapandpay.ui.rowsecondary.expand.RowSecondaryExpand;
import java.util.Locale;

public final class dugc implements lqj {
    public final dugg a;

    public dugc(dugg dugg0) {
        this.a = dugg0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        hfwn hfwn0;
        String s11;
        long v4;
        int v3;
        String s9;
        gucs gucs2;
        gucs gucs1;
        gumi gumi1;
        gucs gucs0;
        int v1;
        dugg dugg0 = this.a;
        Context context0 = dugg0.getContext();
        if(context0 != null) {
            String s = dugg0.aq.a;
            int v = ((gtxx)object0).c;
            switch(v) {
                case 0: {
                    v1 = 4;
                    break;
                }
                case 1: {
                    v1 = 1;
                    break;
                }
                case 2: {
                    v1 = 2;
                    break;
                }
                case 3: {
                    v1 = 3;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
            if(v1 == 0) {
                throw null;
            }
            switch(v1 - 1) {
                case 0: {
                    gtxy gtxy0 = v == 1 ? ((gtxy)((gtxx)object0).d) : gtxy.a;
                    String s1 = context0.getString(0x7F151EEA, new Object[]{"ID pass"});  // string:pay_id_pass_info_label "%1$s info"
                    String s2 = dtsz.k(context0, gtxf.c);
                    gufz gufz0 = dtsz.g();
                    if(hwev.c()) {
                        gucs0 = (gucs)((ProtoLiteMessage)guct.a).v_newBuilder();
                    }
                    else {
                        guct guct0 = dtsz.f(s1, s2, new gufz[]{gufz0});
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)guct0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)guct0));
                        gucs0 = (gucs)hftp0;
                    }
                    gucr gucr0 = gucr.a;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gucr0).v_newBuilder();
                    gugy gugy0 = gugy.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gucr gucr1 = (gucr)hftp1.b_message;
                    gugy0.getClass();
                    gucr1.d = gugy0;
                    gucr1.c = 18;
                    gucs0.l(hftp1);
                    gucs0.k(dtsz.d(16));
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gucr0).v_newBuilder();
                    guhj guhj0 = (guhj)((ProtoLiteMessage)guhl.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gunu.a).v_newBuilder();
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gunw.a).v_newBuilder();
                    String s3 = context0.getString(0x7F151EEC, new Object[]{dtzb.c(context0, "Passport")});  // string:pay_id_pass_source_message "Pass info was collected from your %1$s"
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gunw gunw0 = (gunw)hftp4.b_message;
                    s3.getClass();
                    gunw0.d = s3;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gunu gunu0 = (gunu)hftp3.b_message;
                    gunw gunw1 = (gunw)hftp4.N_build();
                    gunw1.getClass();
                    gunu0.c = gunw1;
                    gunu0.b |= 1;
                    if(!guhj0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)guhj0).ensureMutable();
                    }
                    guhl guhl0 = (guhl)guhj0.b_message;
                    gunu gunu1 = (gunu)hftp3.N_build();
                    gunu1.getClass();
                    guhl0.c = gunu1;
                    guhl0.b |= 1;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gucr gucr2 = (gucr)hftp2.b_message;
                    guhl guhl1 = (guhl)((ProtoLiteBuilder)guhj0).N_build();
                    guhl1.getClass();
                    gucr2.f = guhl1;
                    gucr2.b |= 2;
                    gucs0.l(hftp2);
                    gucs0.k(dtsz.d(16));
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gucr0).v_newBuilder();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gucr gucr3 = (gucr)hftp5.b_message;
                    gugy0.getClass();
                    gucr3.d = gugy0;
                    gucr3.c = 18;
                    gucs0.l(hftp5);
                    gucs0.k(dtsz.d(0x20));
                    gucs0.k(dtsz.o("Basic info"));
                    ggdy ggdy0 = new ggdy();
                    ggdy ggdy1 = new ggdy();
                    ggdy1.i(new Pair("Passport number", gtxy0.b));
                    ggdy1.i(new Pair("Date of expiry", dtsz.i(gtxy0.c)));
                    ggdy1.i(new Pair("Given name", gtxy0.d));
                    ggdy1.i(new Pair("Family name", gtxy0.e));
                    ggdy1.i(new Pair("Birth date", dtsz.i(gtxy0.f)));
                    ggdy1.i(new Pair("Nationality", gtxy0.g));
                    dtsz.m(ggdy1, ggdy0);
                    ggdy ggdy2 = new ggdy();
                    ByteString hfsf0 = gtxy0.h;
                    if(!hfsf0.isEmpty()) {
                        ggdy2.i(dtsz.e(hfsf0));
                    }
                    if(!ggdy2.h().isEmpty()) {
                        ggdy2.i(dtsz.c());
                        ggdy0.i(dtsz.o("Portrait"));
                        ggdy0.i(dtsz.b(((gucr[])ggdy2.h().toArray(new gucr[0]))));
                    }
                    gucs0.a(ggdy0.h());
                    gucs0.k(dtsz.d(0x20));
                    gucs0.k(dtsz.o("Additional info"));
                    ggdy ggdy3 = new ggdy();
                    ggdy3.i(new Pair("Sex", dtsz.j(context0, gtxy0.i)));
                    ggdy3.i(new Pair(context0.getString(0x7F151EBC, new Object[]{"ID pass"}), dtsz.i(gtxy0.k)));  // string:pay_id_card_creation_date "%1$s issue date"
                    ggdy3.i(new Pair("Issuing authority", gtxy0.l));
                    ggdy ggdy4 = new ggdy();
                    dtsz.m(ggdy3, ggdy4);
                    gucs0.a(ggdy4.h());
                    guct guct1 = (guct)((ProtoLiteBuilder)gucs0).N_build();
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gumi.a).v_newBuilder();
                    gucu gucu0 = (gucu)((ProtoLiteMessage)gucv.a).v_newBuilder();
                    gupj gupj0 = dtsz.h(context0);
                    if(!gucu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gucu0).ensureMutable();
                    }
                    gucv gucv0 = (gucv)gucu0.b_message;
                    gupj0.getClass();
                    gucv0.e = gupj0;
                    gucv0.b |= 1;
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gucn.a).v_newBuilder();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gucn gucn0 = (gucn)hftp7.b_message;
                    guct1.getClass();
                    gucn0.c = guct1;
                    gucn0.b = 2;
                    gucu0.l(hftp7);
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    gumi gumi0 = (gumi)hftp6.b_message;
                    gucv gucv1 = (gucv)((ProtoLiteBuilder)gucu0).N_build();
                    gucv1.getClass();
                    gumi0.j = gucv1;
                    gumi0.b |= 0x80;
                    gumi1 = (gumi)hftp6.N_build();
                    break;
                }
                case 1: {
                    gtxz gtxz0 = v == 2 ? ((gtxz)((gtxx)object0).d) : gtxz.a;
                    String s4 = context0.getString(0x7F151EEA, new Object[]{"Riker"});  // string:pay_id_pass_info_label "%1$s info"
                    String s5 = dtsz.k(context0, gtxf.d);
                    gufz gufz1 = dtsz.g();
                    if(hwev.c()) {
                        gucs1 = (gucs)((ProtoLiteMessage)guct.a).v_newBuilder();
                    }
                    else {
                        guct guct2 = dtsz.f(s4, s5, new gufz[]{gufz1});
                        ProtoLiteBuilder hftp8 = (ProtoLiteBuilder)((ProtoLiteMessage)guct2).jf(5, null);
                        hftp8.X(((ProtoLiteMessage)guct2));
                        gucs1 = (gucs)hftp8;
                    }
                    gucs1.k(dtsz.o("Basic info"));
                    ggdy ggdy5 = new ggdy();
                    ggdy5.i(new Pair("Full Name", gtxz0.b));
                    ggdy5.i(new Pair("Address", gtxz0.c));
                    ggdy5.i(new Pair("Gender", dtsz.j(context0, gtxz0.d)));
                    ggdy5.i(new Pair("Birth date", dtsz.i(gtxz0.f)));
                    ggdy ggdy6 = new ggdy();
                    dtsz.m(ggdy5, ggdy6);
                    ggdy6.i(dtsz.e(gtxz0.e));
                    gucs1.a(ggdy6.h());
                    guct guct3 = (guct)((ProtoLiteBuilder)gucs1).N_build();
                    ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gumi.a).v_newBuilder();
                    gucu gucu1 = (gucu)((ProtoLiteMessage)gucv.a).v_newBuilder();
                    gupj gupj1 = dtsz.h(context0);
                    if(!gucu1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gucu1).ensureMutable();
                    }
                    gucv gucv2 = (gucv)gucu1.b_message;
                    gupj1.getClass();
                    gucv2.e = gupj1;
                    gucv2.b |= 1;
                    ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gucn.a).v_newBuilder();
                    if(!hftp10.b_message.isImmutable()) {
                        hftp10.ensureMutable();
                    }
                    gucn gucn1 = (gucn)hftp10.b_message;
                    guct3.getClass();
                    gucn1.c = guct3;
                    gucn1.b = 2;
                    gucu1.l(hftp10);
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    gumi gumi2 = (gumi)hftp9.b_message;
                    gucv gucv3 = (gucv)((ProtoLiteBuilder)gucu1).N_build();
                    gucv3.getClass();
                    gumi2.j = gucv3;
                    gumi2.b |= 0x80;
                    gumi1 = (gumi)hftp9.N_build();
                    break;
                }
                case 2: {
                    gtwb gtwb0 = v == 3 ? ((gtwb)((gtxx)object0).d) : gtwb.a;
                    String s6 = dtsz.k(context0, gtxf.b);
                    ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)gufz.a).v_newBuilder();
                    if(!hftp11.b_message.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    ((gufz)hftp11.b_message).c = "mdocEducationalLink";
                    ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)gtzc.a).v_newBuilder();
                    hjos hjos0 = (hjos)((ProtoLiteMessage)hjot.a).v_newBuilder();
                    ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)hjor.a).v_newBuilder();
                    hfsw hfsw0 = hfsw.a;
                    if(!hftp13.b_message.isImmutable()) {
                        hftp13.ensureMutable();
                    }
                    hjor hjor0 = (hjor)hftp13.b_message;
                    hfsw0.getClass();
                    hjor0.c = hfsw0;
                    hjor0.b = 30;
                    hjos0.a(hftp13);
                    if(!hftp12.b_message.isImmutable()) {
                        hftp12.ensureMutable();
                    }
                    gtzc gtzc0 = (gtzc)hftp12.b_message;
                    hjot hjot0 = (hjot)((ProtoLiteBuilder)hjos0).N_build();
                    hjot0.getClass();
                    gtzc0.d = hjot0;
                    gtzc0.c = 10;
                    if(!hftp11.b_message.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    gufz gufz2 = (gufz)hftp11.b_message;
                    gtzc gtzc1 = (gtzc)hftp12.N_build();
                    gtzc1.getClass();
                    gufz2.d = gtzc1;
                    gufz2.b |= 1;
                    gufz gufz3 = (gufz)hftp11.N_build();
                    if(hwev.c()) {
                        gucs2 = (gucs)((ProtoLiteMessage)guct.a).v_newBuilder();
                    }
                    else {
                        guct guct4 = dtsz.f("Digital ID info", s6, new gufz[]{gufz3});
                        ProtoLiteBuilder hftp14 = (ProtoLiteBuilder)((ProtoLiteMessage)guct4).jf(5, null);
                        hftp14.X(((ProtoLiteMessage)guct4));
                        gucs2 = (gucs)hftp14;
                    }
                    gucs2.k(dtsz.o("Basic info"));
                    ggdy ggdy7 = new ggdy();
                    ggdy7.i(new Pair("License number", gtwb0.e));
                    ggdy7.i(new Pair("Date of expiry", dtsz.i(gtwb0.d)));
                    ggdy7.i(new Pair("Given name", gtwb0.m));
                    ggdy7.i(new Pair("Family name", gtwb0.l));
                    ggdy7.i(new Pair("Birth date", dtsz.i(gtwb0.r)));
                    ggdy7.i(new Pair("Address", gtwb0.f));
                    ggdy7.i(new Pair("City of residence", gtwb0.v));
                    ggdy7.i(new Pair("State of residence", gtwb0.w));
                    ggdy7.i(new Pair("Postal code", gtwb0.x));
                    ggdy ggdy8 = new ggdy();
                    dtsz.m(ggdy7, ggdy8);
                    ggdy ggdy9 = new ggdy();
                    ByteString hfsf1 = gtwb0.p;
                    ByteString hfsf2 = gtwb0.s;
                    if(hfsf1.isEmpty() && hfsf2.isEmpty()) {
                        ((ggtj)dtsz.a.h()).x("mDL portraitByteString and signatureByteString are empty. Skipping row.");
                    }
                    else {
                        if(hfsf1.isEmpty()) {
                            ggdy9.i(dtsz.c());
                            ((ggtj)dtsz.a.h()).x("mDL portraitByteString is empty.");
                        }
                        else {
                            ggdy9.i(dtsz.e(hfsf1));
                        }
                        if(hfsf2.isEmpty()) {
                            ggdy9.i(dtsz.c());
                            ((ggtj)dtsz.a.h()).x("mDL signatureByteString is empty.");
                        }
                        else {
                            ggdy9.i(dtsz.e(hfsf2));
                        }
                    }
                    if(!ggdy9.h().isEmpty()) {
                        ggdy9.i(dtsz.c());
                        ggdy8.i(dtsz.b(((gucr[])ggdy9.h().toArray(new gucr[0]))));
                    }
                    gucs2.a(ggdy8.h());
                    switch(gtwb0.N.size()) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            gucs2.k(dtsz.o("Driving privileges"));
                            gucs2.a(dtsz.a(context0, ((gtvw)gtwb0.N.get(0))));
                            break;
                        }
                        default: {
                            for(int v2 = 0; v2 < gtwb0.N.size(); ++v2) {
                                gucs2.k(dtsz.o(context0.getString(0x7F151D2C, new Object[]{((int)(v2 + 1))})));  // string:pay_drivers_license_details_pass_driving_privileges_number "Driving privilege 
                                                                                                                 // #%1$s"
                                gucs2.a(dtsz.a(context0, ((gtvw)gtwb0.N.get(v2))));
                            }
                        }
                    }
                    gucs2.k(dtsz.d(0x20));
                    gucs2.k(dtsz.o("Additional info"));
                    ggdy ggdy10 = new ggdy();
                    ggdy10.i(new Pair("Date of issue", dtsz.i(gtwb0.c)));
                    ggdy10.i(new Pair("Issuing authority", gtwb0.q));
                    ggdy10.i(new Pair("Issuing country", gtwb0.z));
                    ggdy10.i(new Pair("Country of residence", gtwb0.y));
                    ggdy10.i(new Pair("UN distinguishing sign", gtwb0.B));
                    ggdy10.i(new Pair("Sex", dtsz.j(context0, gtwb0.g)));
                    ggdy10.i(new Pair("Hair color", gtwb0.j));
                    ggdy10.i(new Pair("Eye color", gtwb0.k));
                    String s7 = gtwb0.h;
                    String s8 = "";
                    if(gfta.c(s7)) {
                    label_293:
                        s9 = "";
                    }
                    else if(!Locale.getDefault().equals(Locale.US)) {
                        s9 = context0.getString(0x7F151D47, new Object[]{s7});  // string:pay_drivers_license_height_cm "%1$s CM"
                    }
                    else {
                        try {
                            double f = (double)Integer.parseInt(s7);
                            ghnj ghnj0 = new ghnj(ghnf.a, f);
                            v3 = (int)ghnj0.a();
                            v4 = Math.round(ghnj0.b() % 12.0);
                            if(v4 >= 12L) {
                                goto label_289;
                            }
                            goto label_291;
                        }
                        catch(NumberFormatException unused_ex) {
                            goto label_293;
                        }
                    label_289:
                        ++v3;
                        v4 += -12L;
                    label_291:
                        s9 = context0.getString(0x7F151D48, new Object[]{String.valueOf(v3), String.valueOf(v4)});  // string:pay_drivers_license_height_feet_inches "%1$s\'%2$s\""
                    }
                    ggdy10.i(new Pair("Height", s9));
                    String s10 = gtwb0.J;
                    if(gfta.c(s10)) {
                        s11 = "";
                    }
                    else if(s10.equals("1")) {
                        s11 = "True";
                    }
                    else {
                        s11 = "";
                    }
                    ggdy10.i(new Pair("Organ donor", s11));
                    String s12 = gtwb0.t;
                    if(!gfta.c(s12)) {
                        switch(s12) {
                            case "F": {
                                s8 = "True";
                                break;
                            }
                            case "N": {
                                s8 = "False";
                            }
                        }
                    }
                    ggdy10.i(new Pair("Real ID status", s8));
                    ggdy ggdy11 = new ggdy();
                    dtsz.m(ggdy10, ggdy11);
                    gucs2.a(ggdy11.h());
                    ProtoLiteBuilder hftp15 = ((ProtoLiteMessage)gumi.a).v_newBuilder();
                    gubi gubi0 = dtoh.a;
                    if(!hftp15.b_message.isImmutable()) {
                        hftp15.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp15.b_message;
                    gubi0.getClass();
                    ((gumi)hftv0).c = gubi0;
                    ((gumi)hftv0).b |= 1;
                    gubi gubi1 = dtoh.b;
                    if(!hftv0.isImmutable()) {
                        hftp15.ensureMutable();
                    }
                    gumi gumi3 = (gumi)hftp15.b_message;
                    gubi1.getClass();
                    gumi3.d = gubi1;
                    gumi3.b |= 2;
                    gucu gucu2 = (gucu)((ProtoLiteMessage)gucv.a).v_newBuilder();
                    gupj gupj2 = dtsz.h(context0);
                    if(!gucu2.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gucu2).ensureMutable();
                    }
                    gucv gucv4 = (gucv)gucu2.b_message;
                    gupj2.getClass();
                    gucv4.e = gupj2;
                    gucv4.b |= 1;
                    ProtoLiteBuilder hftp16 = ((ProtoLiteMessage)gucn.a).v_newBuilder();
                    guct guct5 = (guct)((ProtoLiteBuilder)gucs2).N_build();
                    if(!hftp16.b_message.isImmutable()) {
                        hftp16.ensureMutable();
                    }
                    gucn gucn2 = (gucn)hftp16.b_message;
                    guct5.getClass();
                    gucn2.c = guct5;
                    gucn2.b = 2;
                    gucu2.l(hftp16);
                    if(!hftp15.b_message.isImmutable()) {
                        hftp15.ensureMutable();
                    }
                    gumi gumi4 = (gumi)hftp15.b_message;
                    gucv gucv5 = (gucv)((ProtoLiteBuilder)gucu2).N_build();
                    gucv5.getClass();
                    gumi4.j = gucv5;
                    gumi4.b |= 0x80;
                    gumi1 = (gumi)hftp15.N_build();
                    break;
                }
                default: {
                    throw new IllegalArgumentException("No set data type in MobileDocumentInfo");
                }
            }
            MdocDetailsModel mdocDetailsModel0 = new MdocDetailsModel(s, ((gtxx)object0), gumi1);
            gubi gubi2 = fsce.a(context0) ? mdocDetailsModel0.c() : mdocDetailsModel0.b();
            if(!dugg.A()) {
                gupj gupj3 = mdocDetailsModel0.f().e == null ? gupj.a : mdocDetailsModel0.f().e;
                dugg0.as.P(dugg0, gupj3, dugg0.d, dugg0.ah, dugg0.ag);
                dugg0.at.k(new dufv(dugg0));
            }
            dugg0.at.l(gged_interceptors.i(mdocDetailsModel0.f().c), gubi2, dugg0.b, dugg0.d, dugg0.c, dugg0.ag);
            if((((gtxx)object0).b & 1) != 0) {
                if(hwev.c()) {
                    gtyc gtyc0 = ((gtxx)object0).e;
                    if(gtyc0 == null) {
                        gtyc0 = gtyc.a;
                    }
                    NestedScrollView nestedScrollView0 = (NestedScrollView)dugg0.ar.findViewById(0x7F0B022A);  // id:ContentScrollView
                    MsoDropDown msoDropDown0 = (MsoDropDown)dugg0.ar.findViewById(0x7F0B05BB);  // id:MsoDropDown
                    msoDropDown0.b(new dujy(false, gtyc0, new dufu(nestedScrollView0)));
                    msoDropDown0.setVisibility(0);
                    return;
                }
                dugg0.au = (DetailListTemplate)dugg0.ar.findViewById(0x7F0B01BF);  // id:CertDetails
                dugg0.au.af(dugg0, gfqx.a);
                gtyc gtyc1 = ((gtxx)object0).e;
                if(gtyc1 == null) {
                    gtyc1 = gtyc.a;
                }
                Context context1 = dugg0.requireContext();
                gucs gucs3 = (gucs)((ProtoLiteMessage)guct.a).v_newBuilder();
                gucs3.k(dtsz.n("Certificate signed date", dtsz.l(context1, (gtyc1.c == null ? hfwn.a : gtyc1.c))));
                gucs3.k(dtsz.n("Certificate valid from", dtsz.l(context1, (gtyc1.d == null ? hfwn.a : gtyc1.d))));
                gucs3.k(dtsz.n("Certificate valid until", dtsz.l(context1, (gtyc1.e == null ? hfwn.a : gtyc1.e))));
                if((gtyc1.b & 8) == 0) {
                    hfwn0 = gtyc1.e;
                    if(hfwn0 == null) {
                        hfwn0 = hfwn.a;
                    }
                }
                else {
                    hfwn0 = gtyc1.f;
                    if(hfwn0 == null) {
                        hfwn0 = hfwn.a;
                    }
                }
                gucs3.k(dtsz.n("Certificate expected update", dtsz.l(context1, hfwn0)));
                guct guct6 = (guct)((ProtoLiteBuilder)gucs3).N_build();
                dugg0.au.ah(guct6, gubi2, dugg0.b, dugg0.d, dugg0.c, dugg0.ag);
                RowSecondaryExpand rowSecondaryExpand0 = (RowSecondaryExpand)dugg0.ar.findViewById(0x7F0B01C0);  // id:CertHeader
                rowSecondaryExpand0.setVisibility(0);
                rowSecondaryExpand0.setOnClickListener(new dufw(dugg0));
            }
        }
    }
}

