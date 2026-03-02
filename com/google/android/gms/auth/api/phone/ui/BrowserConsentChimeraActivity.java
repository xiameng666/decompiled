package com.google.android.gms.auth.api.phone.ui;

import aiax;
import aibs;
import aibt;
import aibu;
import aicm;
import aicr;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bbmq;
import bboh;
import bbsr;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fyfv;
import ggtj;
import xni;

@GmsCoreVeId(0x3EC80)
public final class BrowserConsentChimeraActivity extends xni {
    public aicr j;
    public Context k;
    public String l;
    public aiax m;
    fyfv n;
    private static final bboh o;

    static {
        BrowserConsentChimeraActivity.o = bboh.a("BrowserConsentChimeraActivity");
    }

    public final void a() {
        this.m.c();
        this.setResult(0);
    }

    private final boolean g(String s) {
        if(TextUtils.isEmpty(s)) {
            ((ggtj)BrowserConsentChimeraActivity.o.h()).x("Not from startActivityForResult(). This calling is invalid.");
            return false;
        }
        if(!aicm.d(this.k, s)) {
            ((ggtj)BrowserConsentChimeraActivity.o.h()).x("Caller is not current default browser. This calling is invalid.");
            return false;
        }
        return true;
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.k = this.getApplicationContext();
        this.j = new aicr();
        String s = bbmq.p(this);
        if(!this.g(s)) {
            this.j.k(this.k, aicr.r(s, 10));
            this.finish();
            return;
        }
        this.l = s;
        this.j.k(this.k, aicr.r(s, 0));
        this.m = new aiax(this.k);
        fyfv fyfv0 = new fyfv(this, 0x7F160294);  // style:BottomSheetDialogTheme
        this.n = fyfv0;
        fyfv0.setCanceledOnTouchOutside(false);
        fyfv fyfv1 = this.n;
        String s1 = this.l;
        View view0 = this.getLayoutInflater().inflate(0x7F0E09F8, null);  // layout:sms_user_consent_fragment
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0F9E);  // id:consent_description
        try {
            String s2 = bbsr.b(this.k).g(s1).toString();
            if(!TextUtils.isEmpty(s2)) {
                s1 = s2;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        String s3 = this.getString(0x7F152F01, new Object[]{s1});  // string:sms_code_browser_consent_title "Allow %s to enter verification codes from 
                                                                   // text messages?"
        SpannableString spannableString0 = new SpannableString(s3);
        int v = s3.indexOf(s1);
        spannableString0.setSpan(new StyleSpan(1), v, s1.length() + v, 33);
        textView0.setText(spannableString0);
        ((TextView)view0.findViewById(0x7F0B18B6)).setText("You can change this any time in Settings > Google > Autofill > SMS verification codes");  // id:matched_sms
        ((Button)view0.findViewById(0x7F0B19D5)).setOnClickListener(new aibt(this));  // id:negative_button
        ((Button)view0.findViewById(0x7F0B1CE5)).setOnClickListener(new aibu(this));  // id:positive_button
        fyfv1.setContentView(view0);
        this.n.setOnCancelListener(new aibs(this));
        this.n.show();
    }

    @Override  // xni
    protected final void onDestroy() {
        super.onDestroy();
        if(this.n != null && this.n.isShowing()) {
            this.n.dismiss();
        }
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        if(!this.g(bbmq.p(this))) {
            this.finish();
        }
    }
}

