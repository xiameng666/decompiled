import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.pay.pass.common.template.detail.DetailTemplate;
import com.google.android.gms.pay.pass.idcard.model.MdocDetailsModel;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import com.google.android.libraries.tapandpay.ui.walletchip.WalletChipView;
import com.google.android.material.chip.Chip;

public final class dvba implements evqf {
    public final dvbe a;
    public final gtxg b;

    public dvba(dvbe dvbe0, gtxg gtxg0) {
        this.a = dvbe0;
        this.b = gtxg0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        gfsx gfsx0;
        Integer integer3;
        int v9;
        int v8;
        ViewGroup viewGroup3;
        Integer integer4;
        guct guct2;
        gujx gujx1;
        dvbe dvbe0 = this.a;
        if(!dvbe0.aw()) {
            gtxg gtxg0 = this.b;
            if(hwev.c()) {
                Context context0 = dvbe0.getContext();
                if(context0 != null) {
                    ComposeViewHeader composeViewHeader0 = (ComposeViewHeader)dvbe0.as.findViewById(0x7F0B0995);  // id:ViewHeader
                    String s = dttg.i(context0, ((hjzq)object0), dvbe0.am);
                    String s1 = dttg.h(context0, dvbe0.am);
                    fufu fufu0 = new fufu(new fufh(new fryu(dttg.g(context0, dvbe0.am)), null, fufg.a), null);
                    hkar hkar0 = ((hjzq)object0).c;
                    if(hkar0 == null) {
                        hkar0 = hkar.a;
                    }
                    hkao hkao0 = hkar0.c == null ? hkao.a : hkar0.c;
                    hkaq hkaq0 = hkao0.c == null ? hkaq.a : hkao0.c;
                    fryj fryj0 = new fryj((hkaq0.c == 4 ? ((String)hkaq0.d) : ""), null, new fryg(), null);
                    dvbc dvbc0 = new dvbc(dvbe0, gtxg0);
                    fujl fujl0 = new fujl(fryj0);
                    fujt fujt0 = new fujt(new fryu(dvbe0.y(gtxg0, ((hjzq)object0))), new fujm(fujl0), dvbc0);
                    composeViewHeader0.b(new fuhn(new fryu(s), null, new fryu(s1), fufu0, fujt0, false));
                }
            }
            else {
                dvbe0.au.setText(dvbe0.y(gtxg0, ((hjzq)object0)));
                dvbe0.au.h(false);
                dvbe0.au.setOnClickListener(new dvaz(dvbe0, gtxg0));
            }
            gtxo gtxo0 = dvbe0.am;
            Context context1 = dvbe0.getContext();
            if(context1 != null && !dvbe0.aw()) {
                String s2 = dvbe0.ao.a;
                gtxx gtxx0 = gtxx.a;
                gftb.check(dvbe0.al);
                gftb.check(((hjzq)object0));
                gucu gucu0 = (gucu)((ProtoLiteMessage)gucv.a).v_newBuilder();
                gupj gupj0 = dttg.e(context1, new gupg[0]);
                if(!gucu0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gucu0).ensureMutable();
                }
                gucv gucv0 = (gucv)gucu0.b_message;
                gupj0.getClass();
                gucv0.e = gupj0;
                gucv0.b |= 1;
                if(gtxo0.c == 4) {
                    gucs gucs0 = (gucs)((ProtoLiteMessage)guct.a).v_newBuilder();
                    gucs0.k(dttg.d("Shared info", gujx.e));
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gucn.a).v_newBuilder();
                    dttg.k(context1, gucs0, (gtxo0.c == 4 ? ((gtxr)gtxo0.d) : gtxr.a), "This info was stored:", "This info was not stored:");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gucn gucn0 = (gucn)hftp0.b_message;
                    guct guct0 = (guct)((ProtoLiteBuilder)gucs0).N_build();
                    guct0.getClass();
                    gucn0.c = guct0;
                    gucn0.b = 2;
                    gucu0.l(hftp0);
                }
                String s3 = dttg.i(context1, ((hjzq)object0), gtxo0);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gucn.a).v_newBuilder();
                guct guct1 = guct.a;
                gucs gucs1 = (gucs)((ProtoLiteMessage)guct1).v_newBuilder();
                gujx gujx0 = gujx.e;
                gucs1.k(dttg.d(s3, gujx0));
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gucr.a).v_newBuilder();
                gudf gudf0 = (gudf)((ProtoLiteMessage)gudg.a).v_newBuilder();
                gucn gucn1 = gucn.a;
                if(gtxn.a(gtxo0.c).ordinal() == 1) {
                    gtxr gtxr0 = gtxo0.c == 4 ? ((gtxr)gtxo0.d) : gtxr.a;
                    gtxu gtxu0 = gtxr0.c == null ? gtxu.a : gtxr0.c;
                    if((gtxu0.b & 1) == 0) {
                        gujx1 = gujx0;
                        guct2 = guct1;
                    }
                    else {
                        gujx1 = gujx0;
                        guct2 = guct1;
                        gudf0.k(((gude)dttg.l(gufa.be, "Website").N_build()));
                    }
                    if((gtxu0.b & 2) != 0) {
                        ProtoLiteBuilder hftp3 = dttg.l(gufa.aG, "Privacy policy");
                        if(!gudf0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gudf0).ensureMutable();
                        }
                        gudg gudg0 = (gudg)gudf0.b_message;
                        gude gude0 = (gude)hftp3.N_build();
                        gude0.getClass();
                        gudg0.b();
                        gudg0.c.add(gude0);
                    }
                }
                else {
                    gujx1 = gujx0;
                    guct2 = guct1;
                }
                gudg gudg1 = (gudg)((ProtoLiteBuilder)gudf0).N_build();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gucr gucr0 = (gucr)hftp2.b_message;
                gudg1.getClass();
                gucr0.d = gudg1;
                gucr0.c = 37;
                gucs1.l(hftp2);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gucn gucn2 = (gucn)hftp1.b_message;
                guct guct3 = (guct)((ProtoLiteBuilder)gucs1).N_build();
                guct3.getClass();
                gucn2.c = guct3;
                gucn2.b = 2;
                gucu0.a(((gucn)hftp1.N_build()));
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gumi.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gumi gumi0 = (gumi)hftp4.b_message;
                gucv gucv1 = (gucv)((ProtoLiteBuilder)gucu0).N_build();
                gucv1.getClass();
                gumi0.j = gucv1;
                gumi0.b |= 0x80;
                MdocDetailsModel mdocDetailsModel0 = new MdocDetailsModel(s2, gtxx0, ((gumi)hftp4.N_build()));
                gubi gubi0 = fsce.a(context1) ? mdocDetailsModel0.c() : mdocDetailsModel0.b();
                gucv gucv2 = mdocDetailsModel0.f();
                if(!hwev.c()) {
                    dvbe0.ap.P(dvbe0, (gucv2.e == null ? gupj.a : gucv2.e), dvbe0.d, dvbe0.ah, dvbe0.ag);
                    DetailTemplate detailTemplate0 = dvbe0.aq;
                    gucr gucr1 = dttg.d(dttg.i(context1, ((hjzq)object0), gtxo0), gujx.b);
                    gucr gucr2 = dttg.d(dttg.h(context1, gtxo0), gujx1);
                    gucr gucr3 = dttg.d(dttg.g(context1, gtxo0), gujx.l);
                    gucs gucs2 = (gucs)((ProtoLiteMessage)guct2).v_newBuilder();
                    gucs2.k(gucr1);
                    gucs2.k(gucr2);
                    gucs2.k(gucr3);
                    guct guct4 = (guct)((ProtoLiteBuilder)gucs2).N_build();
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gucn1).v_newBuilder();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    gucn gucn3 = (gucn)hftp5.b_message;
                    guct4.getClass();
                    gucn3.c = guct4;
                    gucn3.b = 2;
                    detailTemplate0.l(gged_interceptors.l(((gucn)hftp5.N_build())), gubi0, dvbe0.b, dvbe0.d, dvbe0.c, dvbe0.ag);
                }
                if(gtxo0.c == 4) {
                    dvbe0.ar.l(gged_interceptors.i(gucv2.c), gubi0, dvbe0.b, dvbe0.d, dvbe0.c, dvbe0.ag);
                    View view0 = dvbe0.ar.findViewById(0x7F0B029F);  // id:DetailItemTemplatesContainerMain
                    if(view0 != null) {
                        dvbe0.A(view0);
                        DisplayMetrics displayMetrics0 = dvbe0.requireContext().getResources().getDisplayMetrics();
                        int v = (int)TypedValue.applyDimension(1, 2.0f, displayMetrics0);
                        int v1 = (int)TypedValue.applyDimension(1, 4.0f, displayMetrics0);
                        int v2 = (int)TypedValue.applyDimension(1, 6.0f, displayMetrics0);
                        int v3 = (int)TypedValue.applyDimension(1, 10.0f, displayMetrics0);
                        int v4 = view0.getLayoutDirection();
                        ViewGroup viewGroup0 = (ViewGroup)view0.findViewById(0x7F0B02F7);  // id:DetailListItemTemplatesContainer
                        int v5 = viewGroup0.getChildCount() - 1;
                        int v6 = 0;
                        int v7 = 0;
                        while(v7 <= v5) {
                            ViewGroup viewGroup1 = (ViewGroup)viewGroup0.getChildAt(v7);
                            ViewGroup viewGroup2 = dvbe.E(viewGroup1);
                            if(viewGroup2 == null) {
                                viewGroup3 = viewGroup0;
                                v8 = v3;
                                v9 = v;
                                if(viewGroup1.findViewById(0x7F0B02C6) != null) {  // id:DetailListItemLargeMessageContent
                                    if(v6 == 1) {
                                        dvbe.F(viewGroup1, null, null, null, Integer.valueOf(v9));
                                    }
                                    else if(v6 > 1) {
                                        if(v6 == 2) {
                                            integer4 = v9;
                                            v6 = 2;
                                        }
                                        else {
                                            integer4 = null;
                                        }
                                        dvbe.F(viewGroup1, null, integer4, null, Integer.valueOf(v8));
                                    }
                                    ++v6;
                                }
                            }
                            else if(viewGroup2.getChildCount() == 1) {
                                dvbe.F(viewGroup2.getChildAt(0), null, Integer.valueOf(v2), null, null);
                                viewGroup3 = viewGroup0;
                                v8 = v3;
                                v9 = v;
                            }
                            else {
                                Integer integer0 = v7 >= v5 || dvbe.E(viewGroup0.getChildAt(v7 + 1)) == null ? null : v2;
                                boolean z = v4 != 0;
                                viewGroup3 = viewGroup0;
                                View view1 = viewGroup2.getChildAt(0);
                                Integer integer1 = z ? v1 : null;
                                v8 = v3;
                                Integer integer2 = v2;
                                if(z) {
                                    v9 = v;
                                    integer3 = null;
                                }
                                else {
                                    v9 = v;
                                    integer3 = v1;
                                }
                                dvbe.F(view1, integer1, integer2, integer3, integer0);
                                dvbe.F(viewGroup2.getChildAt(1), (z ? null : v1), integer2, (z ? v1 : null), integer0);
                            }
                            ++v7;
                            viewGroup0 = viewGroup3;
                            v3 = v8;
                            v = v9;
                        }
                    }
                }
                else {
                    dvbe0.ar.setVisibility(8);
                }
                switch(gtxn.a(gtxo0.c).ordinal()) {
                    case 0: {
                        hjzs hjzs0 = ((hjzq)object0).d;
                        if(hjzs0 == null) {
                            hjzs0 = hjzs.a;
                        }
                        if((hjzs0.b & 1) != 0) {
                            goto label_202;
                        }
                        break;
                    }
                    case 1: {
                        gtxr gtxr1 = gtxo0.c == 4 ? ((gtxr)gtxo0.d) : gtxr.a;
                        gtxu gtxu1 = gtxr1.c == null ? gtxu.a : gtxr1.c;
                        if(!gtxu1.f.isEmpty() || !gtxu1.g.isEmpty()) {
                        label_202:
                            ((TextView)dvbe0.at.findViewById(0x7F0B0113)).setText(dttg.i(dvbe0.requireContext(), ((hjzq)object0), gtxo0));  // id:BottomSheetTitle
                            switch(gtxn.a(gtxo0.c).ordinal()) {
                                case 0: {
                                    if(hwev.c()) {
                                        hjzs hjzs1 = ((hjzq)object0).d;
                                        if(hjzs1 == null) {
                                            hjzs1 = hjzs.a;
                                        }
                                        gfsx0 = gfsx.l(gfta.a(hjzs1.c));
                                    }
                                    else {
                                        hjzs hjzs2 = ((hjzq)object0).d;
                                        if(hjzs2 == null) {
                                            hjzs2 = hjzs.a;
                                        }
                                        if((hjzs2.b & 1) == 0) {
                                            gfsx0 = gfqx.a;
                                        }
                                        else {
                                            hjzs hjzs3 = ((hjzq)object0).d;
                                            if(hjzs3 == null) {
                                                hjzs3 = hjzs.a;
                                            }
                                            gfsx0 = gfsx.m(hjzs3.c);
                                        }
                                    }
                                    break;
                                }
                                case 1: {
                                    if(hwev.c()) {
                                        gtxr gtxr2 = gtxo0.c == 4 ? ((gtxr)gtxo0.d) : gtxr.a;
                                        gfsx0 = gfsx.l(gfta.a((gtxr2.c == null ? gtxu.a : gtxr2.c).f));
                                    }
                                    else {
                                        gtxr gtxr3 = gtxo0.c == 4 ? ((gtxr)gtxo0.d) : gtxr.a;
                                        if(((gtxr3.c == null ? gtxu.a : gtxr3.c).b & 1) == 0) {
                                            gfsx0 = gfqx.a;
                                        }
                                        else {
                                            gtxr gtxr4 = gtxo0.c == 4 ? ((gtxr)gtxo0.d) : gtxr.a;
                                            gfsx0 = gfsx.m((gtxr4.c == null ? gtxu.a : gtxr4.c).f);
                                        }
                                    }
                                    break;
                                }
                                default: {
                                    gfsx0 = gfqx.a;
                                }
                            }
                            if(hwev.c()) {
                                WalletChipView walletChipView0 = (WalletChipView)dvbe0.at.findViewById(0x7F0B04B0);  // id:InferredActionVisitWebsite
                                if(gfsx0.i()) {
                                    dvbe0.B(walletChipView0, 0x7F152265, 0x7F080C05, ((String)gfsx0.d()));  // string:pay_transactions_inferred_action_website "Website"
                                }
                                else {
                                    walletChipView0.setVisibility(8);
                                }
                            }
                            else {
                                Chip chip0 = (Chip)dvbe0.at.findViewById(0x7F0B04B0);  // id:InferredActionVisitWebsite
                                if(gfsx0.i()) {
                                    chip0.setOnClickListener(new dvay(dvbe0, gfsx0));
                                }
                                else {
                                    chip0.setVisibility(8);
                                }
                            }
                            if(hwev.c()) {
                                WalletChipView walletChipView1 = (WalletChipView)dvbe0.at.findViewById(0x7F0B04AE);  // id:InferredActionPrivacyPolicy
                                if(gtxo0.c == 4) {
                                    gtxu gtxu2 = ((gtxr)gtxo0.d).c;
                                    if(gtxu2 == null) {
                                        gtxu2 = gtxu.a;
                                    }
                                    if((gtxu2.b & 2) == 0) {
                                        walletChipView1.setVisibility(8);
                                    }
                                    else {
                                        gtxr gtxr5 = gtxo0.c == 4 ? ((gtxr)gtxo0.d) : gtxr.a;
                                        dvbe0.B(walletChipView1, 0x7F1508C2, 0x7F080BDE, (gtxr5.c == null ? gtxu.a : gtxr5.c).g);  // string:common_privacy_policy "Privacy policy"
                                    }
                                }
                                else {
                                    walletChipView1.setVisibility(8);
                                }
                            }
                            else {
                                Chip chip1 = (Chip)dvbe0.at.findViewById(0x7F0B04AE);  // id:InferredActionPrivacyPolicy
                                gtxr gtxr6 = gtxo0.c == 4 ? ((gtxr)gtxo0.d) : gtxr.a;
                                if(((gtxr6.c == null ? gtxu.a : gtxr6.c).b & 2) == 0) {
                                    chip1.setVisibility(8);
                                }
                                else {
                                    chip1.setOnClickListener(new dvax(dvbe0, gtxo0));
                                }
                            }
                            dvbe0.at.setVisibility(0);
                            return;
                        }
                    }
                }
                dvbe0.at.setVisibility(8);
            }
        }
    }
}

