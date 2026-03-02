package com.google.android.gms.tapandpay.tokenization;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import batl;
import bbcu;
import bboh;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dydw;
import esgb;
import etgl;
import etmv;
import etsq;
import eulv;
import eulw;
import eulx;
import eveh;
import fshb;
import ggtj;
import gjsj;
import gjvx;
import gjzl;
import hypg;
import hypp;
import hytx;
import im;
import java.util.ArrayList;

@GmsCoreVeId(0x3FE1A)
public class SelectOtherPaymentMethodChimeraActivity extends etsq implements fshb {
    public String j;
    eulx k;
    etmv l;
    public etgl m;
    int n;
    private static final bboh o;

    static {
        SelectOtherPaymentMethodChimeraActivity.o = bboh.b("TapAndPay", bbcu.aM);
    }

    public SelectOtherPaymentMethodChimeraActivity() {
        this.n = 1;
    }

    public final void a(int v) {
        etmv etmv0 = this.l;
        int v1 = this.n;
        ProtoLiteBuilder hftp0 = etmv0.al(gjsj.af);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjvx.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gjvx)hftv0).c = v - 1;
        ((gjvx)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjvx gjvx0 = (gjvx)hftp1.b_message;
        if(v1 == 0) {
            throw null;
        }
        gjvx0.d = v1 - 1;
        gjvx0.b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjzl gjzl0 = (gjzl)hftp0.b_message;
        gjvx gjvx1 = (gjvx)hftp1.N_build();
        gjvx1.getClass();
        gjzl0.x = gjvx1;
        gjzl0.b |= 0x800000;
        etmv0.l(((gjzl)hftp0.N_build()));
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1100 && v1 == -1) {
            Intent intent1 = intent0 == null ? new Intent() : new Intent(intent0);
            intent1.putExtra("other_payment_option_type_extra", 2);
            this.setResult(-1, intent1);
            this.finish();
        }
    }

    @Override  // etsq
    protected final void onCreate(Bundle bundle0) {
        if(!hypg.c() || !hypp.f()) {
            eveh.a(this);
        }
        super.onCreate(bundle0);
        if(hypg.c()) {
            this.setTheme(0x7F160F5A);  // style:TpActivityTheme
        }
        im im0 = this.hL();
        batl.s(im0);
        im0.A(0x7F153242);  // string:tp_other_payment_methods_title "Other payment methods"
        im0.p(12);
        im0.u(0x7F1507EB);  // string:common_back "Back"
        AccountInfo accountInfo0 = (AccountInfo)dydw.b(this.getIntent(), "extra_account_info", AccountInfo.CREATOR);
        if(accountInfo0 == null) {
            ((ggtj)SelectOtherPaymentMethodChimeraActivity.o.i()).x("Activity started without account info, finishing");
            this.finish();
            return;
        }
        this.j = this.getIntent().getStringExtra("extra_calling_package");
        if(this.l == null) {
            this.l = new etmv(this.getApplicationContext(), accountInfo0);
        }
        if(this.m == null) {
            this.m = new etgl(this);
        }
        this.setContentView(0x7F0E0BAC);  // layout:tp_select_other_payment_method_activity
        this.k = new eulx(this, new ArrayList());
        ((ListView)this.findViewById(0x7F0B066E)).setAdapter(this.k);  // id:PaymentMethodList
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // etsq
    protected final void onStart() {
        super.onStart();
        String s = esgb.b() ? "The easy way to shop with PayPal in stores and apps" : "The easy way to shop with PayPal in apps";
        this.k.clear();
        if(hytx.c()) {
            this.k.add(new eulw("PayPal", s, this.getResources().getDrawable(0x7F080FD7), new eulv(this)));
        }
        this.k.notifyDataSetChanged();
        this.n = hytx.c() ? 2 : 3;
        this.a(2);
    }
}

