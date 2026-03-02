package com.google.android.gms.tapandpay.tokenization;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import batl;
import bbcu;
import bboh;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.material.textfield.TextInputLayout;
import dagger.internal.Preconditions;
import domu;
import domv;
import dydw;
import etmv;
import etsq;
import eukb;
import eult;
import eulu;
import eveh;
import fhvo;
import fhwk;
import fhwp;
import fipx;
import fshb;
import fuok;
import fuop;
import hypg;
import hypp;
import im;

@GmsCoreVeId(0x3FE13)
public class NameResolutionChimeraActivity extends etsq implements fshb {
    public TextInputLayout j;
    public fhwk k;
    private Button l;

    static {
        bboh.b("TapAndPay", bbcu.aM);
    }

    @Override  // xni
    public final boolean hR() {
        this.finish();
        return false;
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // etsq
    protected final void onCreate(Bundle bundle0) {
        if(!hypg.c() || !hypp.f()) {
            eveh.a(this);
        }
        super.onCreate(bundle0);
        if(hypg.c()) {
            this.setContentView(0x7F0E0BA1);  // layout:tp_name_resolution_exp
            fuok fuok0 = this.J;
            View view0 = this.findViewById(0x7F0B0080);  // id:AppBar
            batl.s(view0);
            fuop.d(fuok0, view0);
            this.hG(((Toolbar)this.findViewById(0x7F0B08D8)));  // id:Toolbar
            this.findViewById(0x7F0B0080).setBackgroundDrawable(new ColorDrawable(fipx.a(this, 0x7F040339)));  // id:AppBar
            eveh.b(this);
        }
        else {
            this.setTheme(0x7F160F5A);  // style:TpActivityTheme
            this.setContentView(0x7F0E0BA0);  // layout:tp_name_resolution
        }
        im im0 = this.hL();
        batl.s(im0);
        im0.A(0x7F15321D);  // string:tp_name_resolution_title "Check cardholder name"
        im0.p(12);
        im0.u(0x7F1507F2);  // string:common_cancel "Cancel"
        AccountInfo accountInfo0 = (AccountInfo)dydw.b(this.getIntent(), "extra_account_info", AccountInfo.CREATOR);
        if(accountInfo0 != null) {
            String s = accountInfo0.b;
            if(!TextUtils.isEmpty(s)) {
                domv domv0 = domu.a(AppContextProvider.a());
                Preconditions.b(domv0);
                new eukb(domv0).inject(this);
                fhwk fhwk0 = this.k;
                Activity activity0 = this.getContainerActivity();
                fhvo fhvo0 = this.k.a.a(92626);
                fhvo0.e(fhwp.b(s));
                fhwk0.i(activity0, fhvo0);
                etmv etmv0 = new etmv(this, accountInfo0);
                TextInputLayout textInputLayout0 = (TextInputLayout)this.findViewById(0x7F0B0E10);  // id:card_holder_name_input
                this.j = textInputLayout0;
                textInputLayout0.H("Name doesn\'t match the card");
                this.j.I(true);
                EditText editText0 = this.j.f;
                batl.s(editText0);
                editText0.addTextChangedListener(new eulu(this));
                Button button0 = (Button)this.findViewById(0x7F0B0FF2);  // id:continue_button
                this.l = button0;
                button0.setOnClickListener(new eult(this, etmv0));
                return;
            }
        }
        this.setResult(0);
        this.finish();
    }
}

