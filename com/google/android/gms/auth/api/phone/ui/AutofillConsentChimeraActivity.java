package com.google.android.gms.auth.api.phone.ui;

import aiaw;
import aibh;
import aibi;
import aibj;
import aibk;
import aibl;
import aicl;
import aicr;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import bbcu;
import bbmq;
import bboh;
import bbsr;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fyfv;
import ggtj;
import hsas;
import xni;

@GmsCoreVeId(0x3EC7F)
public final class AutofillConsentChimeraActivity extends xni {
    public aicr j;
    public Context k;
    public String l;
    public aiaw m;
    fyfv n;
    public static final int o;
    private static final bboh p;

    static {
        AutofillConsentChimeraActivity.p = bboh.b("AutofillConsentChimeraActivity", bbcu.cD);
    }

    private final String a(String s) {
        if("com.google.android.gms".equals(s)) {
            return hsas.g() ? "Google Password Manager" : "Autofill with Google";
        }
        try {
            String s1 = bbsr.b(this.k).g(s).toString();
            if(!TextUtils.isEmpty(s1)) {
                return s1;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return s;
    }

    private final boolean g(String s) {
        if(TextUtils.isEmpty(s)) {
            ((ggtj)AutofillConsentChimeraActivity.p.h()).x("Not from startActivityForResult(). This calling is invalid.");
            return false;
        }
        if(!aicl.e(this.k, s)) {
            ((ggtj)AutofillConsentChimeraActivity.p.h()).x("Caller is not current autofill service. This calling is invalid.");
            return false;
        }
        return true;
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        SpannableString spannableString1;
        super.onCreate(bundle0);
        this.k = this.getApplicationContext();
        this.j = new aicr();
        String s = bbmq.p(this);
        if(!this.g(s)) {
            this.j.k(this.k, aicr.o(s, 10));
            this.finish();
            return;
        }
        this.l = s;
        this.j.k(this.k, aicr.o(s, 0));
        this.m = new aiaw(this.k);
        fyfv fyfv0 = new fyfv(this, 0x7F160294);  // style:BottomSheetDialogTheme
        this.n = fyfv0;
        fyfv0.setCanceledOnTouchOutside(false);
        fyfv fyfv1 = this.n;
        String s1 = this.l;
        View view0 = this.getLayoutInflater().inflate(0x7F0E09F8, null);  // layout:sms_user_consent_fragment
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0F9E);  // id:consent_description
        if(hsas.g()) {
            textView0.setText("Do things faster by autofilling one-time codes");
        }
        else {
            String s2 = this.a(s1);
            String s3 = this.getString(0x7F152EF2, new Object[]{s2});  // string:sms_code_autofill_consent_title_for_twice_showup "Allow %s to show verification 
                                                                       // codes?"
            SpannableString spannableString0 = new SpannableString(s3);
            int v = s3.indexOf(s2);
            spannableString0.setSpan(new StyleSpan(1), v, s2.length() + v, 33);
            textView0.setText(spannableString0);
        }
        TextView textView1 = (TextView)view0.findViewById(0x7F0B18B6);  // id:matched_sms
        textView1.setMovementMethod(LinkMovementMethod.getInstance());
        int v1 = textView1.getCurrentTextColor();
        if(hsas.g()) {
            String s4 = this.getString(0x7F152867, new Object[]{this.a(s1), "Android autofill settings"});  // string:reworded_sms_code_autofill_consent_message "Apps and sites can use one-time 
                                                                                                            // codes to improve your security. %1$s can get these codes from your text messages. 
                                                                                                            // Change your mind anytime in %2$s."
            spannableString1 = new SpannableString(s4);
            int v2 = s4.indexOf("Android autofill settings");
            spannableString1.setSpan(new aibk(this, v1), v2, 25 + v2, 33);
        }
        else {
            String s5 = this.getString(0x7F152EEF, new Object[]{"Settings > Google"});  // string:sms_code_autofill_consent_message_for_twice_showup "Codes in text messages 
                                                                                        // will appear as Autofill suggestions. You can change this anytime in %s."
            spannableString1 = new SpannableString(s5);
            int v3 = s5.indexOf("Settings > Google");
            spannableString1.setSpan(new aibl(this), v3, 17 + v3, 33);
        }
        textView1.setText(spannableString1);
        Button button0 = (Button)view0.findViewById(0x7F0B19D5);  // id:negative_button
        button0.setOnClickListener(new aibi(this));
        if(this.m.b() <= 0) {
            button0.setText("Not now");
        }
        else {
            button0.setText("Never");
        }
        ((Button)view0.findViewById(0x7F0B1CE5)).setOnClickListener(new aibj(this));  // id:positive_button
        fyfv1.setContentView(view0);
        this.n.setOnCancelListener(new aibh(this));
        Window window0 = this.n.getWindow();
        if(window0 != null) {
            window0.setSoftInputMode(3);
        }
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

