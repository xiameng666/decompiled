package com.google.android.gms.nearby.sharing.suw2;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import acp;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import cchj;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.GlifLayout;
import dcpn;
import dcvy;
import dcvz;
import dcwp;
import dixo;
import dixp;
import dixq;
import dixr;
import dixs;
import dixt;
import dixx;
import dixy;
import dixz;
import diya;
import diyb;
import diyc;
import diyd;
import diye;
import diyp;
import diyt;
import diyu;
import diyy;
import dizg;
import djbm;
import evql;
import fndb;
import gaec;
import gaff;
import gafg;
import gafh;
import gagb;
import gahy;
import gaif;
import gaim;
import gaip;
import gais;
import gaiw;
import gjmb;
import gzat;
import gzax;
import hvrc;
import ibnn;
import ibno;
import ibnp;
import ibns;
import ibnv;
import ibnw;
import ibnx;
import ibpg;
import ibpo;
import ibpz;
import ibrl;
import ibrx;
import ibuk;
import ibuq;
import icbb;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import lpt;
import lsd;
import qle;
import qpq;
import xob;
import xoc;

public final class ContactsConsentFragment extends diyu {
    public acp a;
    public static final int b;
    private static final Map c;
    private final ibnn d;

    static {
        ContactsConsentFragment.c = ibpz.i(new ibns[]{new ibns(".grey600", ((int)0x7F060894)), new ibns(".grey700", ((int)0x7F060895)), new ibns(".grey800", ((int)0x7F060896)), new ibns(".black", ((int)0x7F060893)), new ibns(".white", ((int)0x7F060897))});  // color:lottie_dark_grey600
    }

    public ContactsConsentFragment() {
        diyb diyb0 = new diyb(new diya(this));
        ibnn ibnn0 = ibno.a(ibnp.c, diyb0);
        ibuk ibuk0 = new ibuk(diyp.class);
        diyc diyc0 = new diyc(ibnn0);
        diyd diyd0 = new diyd(ibnn0);
        this.d = new lsd(ibuk0, diyc0, new diye(this, ibnn0), diyd0);
    }

    public final void A(int v, gzax gzax0) {
        xob xob0 = xoc.b(this);
        if(gzax0 != gzax.a) {
            Intent intent0 = xob0.getIntent();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjmb.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ibuq.f(gzax0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjmb)hftp0.b_message).c = gzax0.g;
            ((gjmb)hftp0.b_message).b |= 1;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            intent0.putExtra("intent_extra_quick_share_metrics_event", ((gjmb)hftv0).toBytesArray());
        }
        if(!gagb.b(xob0.getIntent())) {
            dcvz.a.c().p("No setup wizard manager found.", new Object[0]);
            xob0.setResult(v, xob0.getIntent());
            xob0.finish();
            return;
        }
        if(ibuq.m(xob0.getIntent().getAction(), "com.google.android.gms.nearby.sharing.SETUP_WRAPPED")) {
            dcvz.a.b().h("Setup activity is wrapped, finishing with result code: %d", Integer.valueOf(v));
            xob0.setResult(v, xob0.getIntent());
            xob0.finish();
            return;
        }
        Intent intent1 = xob0.getIntent();
        Intent intent2 = new Intent("com.android.wizard.NEXT");
        gagb.a(intent1, intent2);
        intent2.putExtra("com.android.setupwizard.ResultCode", v);
        intent2.putExtra("theme", intent1.getStringExtra("theme"));
        List list0 = xob0.getPackageManager().queryIntentActivities(intent2, 0x100000);
        ibuq.e(list0, "queryIntentActivities(...)");
        if(ibpo.T(list0) == null) {
            throw new IllegalStateException("No wizard manager in system image found.");
        }
        dcvz.a.b().p("Setup activity is not wrapped, launching next activity.", new Object[0]);
        acp acp0 = this.a;
        if(acp0 == null) {
            ibuq.j("setupWizardLauncher");
            acp0 = null;
        }
        acp0.b(intent2);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        dcpn dcpn0 = dcpn.f(this.requireContext());
        this.getLifecycle().c(new dcvy(this, gzat.g, dcpn0));
        dixt dixt0 = new dixt();
        this.a = this.registerForActivityResult(fndb.d, dixt0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        return gaec.t(layoutInflater0.getContext()) ? layoutInflater0.inflate(0x7F0E09AA, viewGroup0, false) : layoutInflater0.inflate(0x7F0E09A9, viewGroup0, false);  // layout:sharing_suw2_consent_fragment_v2_bc25
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        TextView textView0 = (TextView)view0.findViewById(0x7F0B1697);  // id:how_it_works
        ibuq.c(textView0);
        diyy.a(textView0, 20.0f);
        TextView textView1 = (TextView)view0.findViewById(0x7F0B0FCD);  // id:contacts_upload_title
        ibuq.c(textView1);
        diyy.a(textView1, 24.0f);
        TextView textView2 = (TextView)view0.findViewById(0x7F0B0FCC);  // id:contacts_upload_description
        ibuq.c(textView2);
        diyy.a(textView2, 20.0f);
        if(hvrc.a.b().Q()) {
            GlifLayout glifLayout0 = (GlifLayout)view0.findViewById(0x7F0B160D);  // id:glif_layout
            ibuq.c(glifLayout0);
            ibuq.f(glifLayout0, "<this>");
            gahy gahy0 = (gahy)glifLayout0.t(gahy.class);
            if(gahy0 != null) {
                gahy0.a().setMaxLines(10);
            }
        }
        if(!gaec.t(view0.getContext())) {
            LottieAnimationView lottieAnimationView0 = (LottieAnimationView)view0.findViewById(0x7F0B0BA3);  // id:animation
            ibuq.c(lottieAnimationView0);
            for(Object object0: ContactsConsentFragment.c.entrySet()) {
                String s = (String)((Map.Entry)object0).getKey();
                int v = ((Number)((Map.Entry)object0).getValue()).intValue();
                int v1 = lottieAnimationView0.getContext().getColor(v);
                qpq qpq0 = new qpq(new String[]{"**", s, "**"});
                dixp dixp0 = new dixp(v1);
                lottieAnimationView0.d(qpq0, qle.K, dixp0);
            }
            lottieAnimationView0.setOnClickListener(new dixs(lottieAnimationView0));
        }
        if(gaec.t(view0.getContext())) {
            SpannableString spannableString0 = new SpannableString(this.getString(0x7F152D8B));  // string:sharing_suw2_learn_more_link "Learn more about contacts settings"
            spannableString0.setSpan(new dixx(this), 0, spannableString0.length(), 33);
            TextView textView3 = (TextView)view0.findViewById(0x7F0B17CB);  // id:learn_more_link
            textView3.setText(spannableString0);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else {
            ((Button)view0.findViewById(0x7F0B17CB)).setOnClickListener(new dixo(this));  // id:learn_more_link
        }
        GlifLayout glifLayout1 = (GlifLayout)view0.findViewById(0x7F0B160D);  // id:glif_layout
        ibuq.c(glifLayout1);
        ibuq.f(glifLayout1, "<this>");
        gaff gaff0 = (gaff)glifLayout1.t(gaff.class);
        if(gaff0 != null) {
            gafg gafg0 = new gafg(view0.getContext());
            gafg0.b(0x7F1508A3);  // string:common_no_thanks "No thanks"
            gafg0.b = new dixq(this);
            gafg0.c = 7;
            gafg0.d = 0x7F1608FF;  // style:SudGlifButton.Secondary
            gaff0.d(gafg0.a());
            gafg gafg1 = new gafg(view0.getContext());
            gafg1.b(0x7F152D7F);  // string:sharing_suw2_agree "I agree"
            gafg1.c = 5;
            gafg1.d = 0x7F1608FE;  // style:SudGlifButton.Primary
            gaff0.c(gafg1.a());
            ibuq.f(glifLayout1, "<this>");
            gaiw gaiw0 = (gaiw)glifLayout1.t(gaiw.class);
            if(gaiw0 != null) {
                Context context0 = view0.getContext();
                gafh gafh0 = gaff0.k;
                gafh gafh1 = gaff0.l;
                dixr dixr0 = new dixr(this);
                CharSequence charSequence0 = context0.getText(0x7F15088C);  // string:common_more "More"
                TemplateLayout templateLayout0 = gaiw0.d;
                Context context1 = templateLayout0.getContext();
                if(gaec.t(context1)) {
                    gaiw0.e(context1, dixr0);
                }
                else {
                    CharSequence charSequence1 = gafh0.b;
                    ScrollView scrollView0 = ((GlifLayout)templateLayout0).B();
                    if(scrollView0 != null) {
                        gaim gaim0 = new gaim(gaiw0, scrollView0, gafh0, charSequence1, gafh1);
                        gafh0 = gafh0;
                        scrollView0.post(gaim0);
                    }
                    gafh0.f = new gaip(gaiw0, dixr0);
                    gaiw0.e = new gais(gaiw0, gafh0, charSequence0, charSequence1, gafh1);
                    gaiw0.b();
                }
            }
        }
        Account[] arr_account = cchj.b(view0.getContext()).p("com.google");
        ibuq.c(arr_account);
        Account account0 = (Account)ibpg.E(arr_account);
        if(account0 == null) {
            dcvz.a.c().p("device must have at least one Google account.", new Object[0]);
            this.A(5, gzax.a);
            return;
        }
        diyp diyp0 = this.y();
        diyp0.a("SharingClient#setAccount(account)", diyp0.a.x(account0));
        dcpn.f(view0.getContext()).h(view0.getContext(), account0);
        GlifLayout glifLayout2 = (GlifLayout)view0.findViewById(0x7F0B160D);  // id:glif_layout
        if(glifLayout2 == null) {
            return;
        }
        gaif gaif0 = diyt.a(glifLayout2);
        if(gaif0 != null) {
            gaif0.g(account0.name);
        }
        icbb.b(lpt.a(this), null, null, new dixy(this, account0, glifLayout2, null), 3);
    }

    public final diyp y() {
        return (diyp)this.d.a();
    }

    public final Object z(Account account0, ibrl ibrl0) {
        Object object3;
        Object object2;
        dixz dixz0;
        if((ibrl0 instanceof dixz)) {
            dixz0 = (dixz)ibrl0;
            int v = dixz0.d;
            if((v & 0x80000000) == 0) {
                dixz0 = new dixz(this, ibrl0);
            }
            else {
                dixz0.d = v - 0x80000000;
            }
        }
        else {
            dixz0 = new dixz(this, ibrl0);
        }
        Object object0 = dixz0.b;
        Object object1 = ibrx.a;
        switch(dixz0.d) {
            case 0: {
                ibnx.b(object0);
                object2 = this.getContext();
                if(object2 == null) {
                    return null;
                }
                evql evql0 = dizg.c(((Context)object2), account0);
                dixz0.a = object2;
                dixz0.d = 1;
                object3 = dcwp.c(evql0, dixz0);
                if(object3 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                object2 = dixz0.a;
                ibnx.b(object0);
                object3 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((object3 instanceof ibnv)) {
            object3 = null;
        }
        return ((Bitmap)object3) == null ? null : djbm.f(((Context)object2), ((Bitmap)object3), 24.0f);
    }
}

