package com.google.android.gms.tapandpay.tokenization;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import batl;
import bauc;
import bbcu;
import bboh;
import bbqr;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import com.google.android.libraries.tapandpay.ui.rowprimary.RowPrimary;
import esgh;
import eupp;
import evek;
import evjq;
import fryu;
import ftzm;
import ftzv;
import fubb;
import fule;
import gfta;
import ggtj;
import gtgg;
import gtgi;
import gtjr;
import gtmn;
import hypg;
import java.util.logging.Level;

public class VerificationMethodView extends LinearLayout implements Checkable {
    public gtgg a;
    public String b;
    public CardInfo c;
    public AccountInfo d;
    public Intent e;
    public String f;
    public int g;
    public Boolean h;
    public TextView i;
    public TextView j;
    public RadioButton k;
    public TextView l;
    public RowPrimary m;
    public String n;
    public fule o;
    public static final int p;
    private static final bboh q;
    private static final SparseIntArray r;
    private static final SparseIntArray s;
    private static final SparseIntArray t;
    private String u;
    private final String v;

    static {
        VerificationMethodView.q = bboh.b("TapAndPay", bbcu.aM);
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        sparseIntArray0.put(1, 0x7F1532C4);  // string:tp_sms_method_label "Text message"
        sparseIntArray0.put(2, 0x7F150824);  // string:common_email "Email"
        sparseIntArray0.put(3, 0x7F153260);  // string:tp_place_call_method_label "Call your bank"
        sparseIntArray0.put(4, 0x7F15326D);  // string:tp_receive_call_method_label "Get a phone call"
        sparseIntArray0.put(5, 0x7F153401);  // string:tp_web_url_method_label "Sign in to bank website"
        sparseIntArray0.put(6, 0x7F153173);  // string:tp_app_method_label "Sign in to the bank app"
        sparseIntArray0.put(7, 0x7F153210);  // string:tp_issuer_statement_method_label "Temporary charge:<b> %1$s </b>"
        VerificationMethodView.r = sparseIntArray0;
        SparseIntArray sparseIntArray1 = new SparseIntArray();
        sparseIntArray1.put(3, 0x7F153261);  // string:tp_place_call_method_label_paypal "Call Paypal"
        VerificationMethodView.s = sparseIntArray1;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1, 0x7F1533D5);  // string:tp_wallet_sms_method_label "Text me a code"
        sparseIntArray2.put(2, 0x7F1533B0);  // string:tp_wallet_email_method_label "Send me an email"
        sparseIntArray2.put(7, 0x7F1533C8);  // string:tp_wallet_issuer_statement_method_label "Send a code to your bank statement"
        VerificationMethodView.t = sparseIntArray2;
    }

    public VerificationMethodView(Context context0) {
        super(context0);
        this.g = -1;
        this.n = "";
        this.u = "";
        this.v = "";
        this.o = fule.c;
    }

    public VerificationMethodView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = -1;
        this.n = "";
        this.u = "";
        this.v = "";
        this.o = fule.c;
    }

    public VerificationMethodView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.g = -1;
        this.n = "";
        this.u = "";
        this.v = "";
        this.o = fule.c;
    }

    public static Intent a(gtgg gtgg0, String s, Context context0) {
        if((gtmn.b(gtgg0.e) == null ? gtmn.j : gtmn.b(gtgg0.e)) != gtmn.h) {
            return null;
        }
        Intent intent0 = new Intent((gtgg0.b == 5 ? ((gtgi)gtgg0.c) : gtgi.a).c).setPackage((gtgg0.b == 5 ? ((gtgi)gtgg0.c) : gtgi.a).d).addCategory("android.intent.category.DEFAULT");
        bboh bboh0 = VerificationMethodView.q;
        bboh0.g(esgh.a()).R("Creating issuer app intent with package %s and action %s", (gtgg0.b == 5 ? ((gtgi)gtgg0.c) : gtgi.a).d, (gtgg0.b == 5 ? ((gtgi)gtgg0.c) : gtgi.a).c);
        if(!bbqr.d((gtgg0.b == 5 ? ((gtgi)gtgg0.c) : gtgi.a).e)) {
            intent0.putExtra("android.intent.extra.TEXT", (gtgg0.b == 5 ? ((gtgi)gtgg0.c) : gtgi.a).e);
            intent0.putExtra("extra_wallet_id", s);
        }
        if(context0.getPackageManager().resolveActivity(intent0, 0) == null) {
            ((ggtj)bboh0.j()).R("Failed to create issuer app intent with package %s and action %s", (gtgg0.b == 5 ? ((gtgi)gtgg0.c) : gtgi.a).d, (gtgg0.b == 5 ? ((gtgi)gtgg0.c) : gtgi.a).c);
            return null;
        }
        return intent0;
    }

    public final void b(View.OnClickListener view$OnClickListener0) {
        RowPrimary rowPrimary0 = this.m;
        batl.s(rowPrimary0);
        rowPrimary0.setOnClickListener(view$OnClickListener0);
    }

    public final boolean c() {
        String s;
        int v = this.a.e;
        boolean z = (gtmn.b(v) == null ? gtmn.j : gtmn.b(v)) == gtmn.f && this.a.b == 8;
        switch((gtmn.b(v) == null ? gtmn.j : gtmn.b(v)).ordinal()) {
            case 1: {
                this.u = this.getResources().getString(0x7F1532C3, new Object[]{this.a.f});  // string:tp_sms_message_rates_label_wallet "%1$s (Standard rates may apply)"
                break;
            }
            case 3: {
                Intent intent0 = new Intent("android.intent.action.DIAL", Uri.parse(this.a.g)).addCategory("android.intent.category.DEFAULT");
                if(this.getContext().getPackageManager().resolveActivity(intent0, 0) == null) {
                    this.f = "Your device isn\'t set up to make calls";
                }
                else {
                    this.e = intent0;
                }
                this.u = this.a.f;
                break;
            }
            case 2: 
            case 4: {
                this.u = this.a.f;
                break;
            }
            case 5: {
                if(z) {
                    Intent intent1 = new Intent().setClassName(this.getContext(), "com.google.android.gms.tapandpay.tokenization.AddNewCardThroughBrowserActivity").putExtra("extra_url", (this.a.b == 8 ? ((gtjr)this.a.c) : gtjr.a).c);
                    this.e = intent1;
                    bauc.l(this.d, intent1, "extra_account_info");
                    this.g = 303;
                }
                else {
                    this.u = this.a.f;
                    this.e = new Intent("android.intent.action.VIEW", Uri.parse(this.a.g));
                }
                break;
            }
            case 7: {
                IssuerInfo issuerInfo0 = this.c == null ? null : this.c.l;
                if(issuerInfo0 == null) {
                    s = "bank";
                }
                else {
                    s = issuerInfo0.a;
                    if(TextUtils.isEmpty(s)) {
                        s = "bank";
                    }
                }
                Intent intent2 = VerificationMethodView.a(this.a, this.b, this.getContext());
                if(intent2 == null) {
                    Level level1 = esgh.a();
                    VerificationMethodView.q.g(level1).x("Issuer app intent doesn\'t exist. Intents to PlayStore");
                    this.h = Boolean.valueOf(false);
                    this.e = evek.a(this.getContext(), (this.a.b == 5 ? ((gtgi)this.a.c) : gtgi.a).d, (this.a.b == 5 ? ((gtgi)this.a.c) : gtgi.a).g, true);
                    this.u = this.getResources().getString(0x7F153174, new Object[]{s});  // string:tp_app_method_value_app_absent "This will take you to get the %1$s app"
                    this.g = 302;
                }
                else {
                    Level level0 = esgh.a();
                    VerificationMethodView.q.g(level0).x("Issuer app intent exists.");
                    this.h = Boolean.valueOf(true);
                    this.u = this.getResources().getString(0x7F153175, new Object[]{s});  // string:tp_app_method_value_app_present "This will open your %1$s app"
                    this.e = intent2;
                    this.g = 301;
                }
                break;
            }
            case 8: {
                this.u = "Check the description of a temporary charge on your statement";
                break;
            }
            default: {
                return false;
            }
        }
        int v1 = (gtmn.b(this.a.e) == null ? gtmn.j : gtmn.b(this.a.e)).a();
        int v2 = VerificationMethodView.r.get(v1);
        CardInfo cardInfo0 = this.c;
        batl.s(cardInfo0);
        if(evjq.o(cardInfo0)) {
            SparseIntArray sparseIntArray0 = VerificationMethodView.s;
            if(sparseIntArray0.get(v1) != 0) {
                v2 = sparseIntArray0.get(v1);
            }
        }
        SparseIntArray sparseIntArray1 = VerificationMethodView.t;
        if(sparseIntArray1.get(v1) != 0) {
            v2 = sparseIntArray1.get(v1);
        }
        if(v2 == 0) {
            return false;
        }
        if(z) {
            this.n = "Verify Online with Bank";
            if(!hypg.c()) {
                this.i.setText(0x7F153139);  // string:tp_3ds_method_label "Verify Online with Bank"
            }
        }
        else {
            this.n = this.getResources().getString(v2);
            if(!hypg.c()) {
                this.i.setText(this.getResources().getString(v2));
            }
        }
        if(hypg.c()) {
            this.d(this.n, this.u, null, false);
        }
        else {
            this.j.setText(this.u);
        }
        if(this.l != null) {
            String s1 = this.v;
            if(!TextUtils.isEmpty(s1)) {
                if(hypg.c()) {
                    this.d(this.n, this.u, s1, false);
                    return true;
                }
                this.l.setText(s1);
                this.l.setVisibility(0);
                return true;
            }
            this.l.setVisibility(8);
        }
        return true;
    }

    private final void d(String s, String s1, String s2, boolean z) {
        fryu fryu0 = new fryu(s);
        fryu fryu1 = null;
        fryu fryu2 = gfta.c(s1) ? null : new fryu(s1);
        if(!gfta.c(s2)) {
            fryu1 = new fryu(s2);
        }
        fubb fubb0 = new fubb(z);
        fule fule0 = this.o;
        eupp eupp0 = new eupp();
        ftzv ftzv0 = new ftzv(fryu0, fryu2, fryu1, fubb0, null, z, ftzm.a, fule0, true, eupp0, 0, null);
        RowPrimary rowPrimary0 = this.m;
        batl.s(rowPrimary0);
        rowPrimary0.g(ftzv0);
    }

    @Override  // android.widget.Checkable
    public final boolean isChecked() {
        return hypg.c() ? this.m.h.f : this.k.isChecked();
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setCheckable(true);
        accessibilityNodeInfo0.setChecked(this.isChecked());
    }

    @Override  // android.widget.Checkable
    public final void setChecked(boolean z) {
        if(hypg.c()) {
            this.d(this.n, this.u, this.v, z);
            return;
        }
        ((RadioButton)this.findViewById(0x7F0B06FA)).setChecked(z);  // id:RadioButton
    }

    @Override  // android.widget.Checkable
    public final void toggle() {
        if(hypg.c()) {
            return;
        }
        this.k.toggle();
    }
}

