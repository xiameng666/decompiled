package com.google.android.gms.tapandpay.tokenization;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import bbcu;
import bboh;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dydw;
import etmv;
import etsq;
import eveh;
import fshb;
import gfqz;
import gggq;
import ggtj;
import gjri;
import gjrk;
import gjsj;
import gjzl;
import gtjf;
import hypg;
import hypp;

@GmsCoreVeId(0x3FE0D)
public class AddNewCardThroughBrowserChimeraActivity extends etsq implements fshb {
    public static final boolean j;
    etmv k;
    private static final bboh l;
    private boolean m;
    private AccountInfo n;
    private String o;
    private int p;
    private int q;
    private int r;

    static {
        AddNewCardThroughBrowserChimeraActivity.l = bboh.b("TapAndPay", bbcu.aM);
        AddNewCardThroughBrowserChimeraActivity.j = true;
    }

    public AddNewCardThroughBrowserChimeraActivity() {
        this.m = false;
        this.q = 1;
        this.o = "";
    }

    private final etmv a() {
        etmv etmv0 = this.k;
        return etmv0 == null ? new etmv(this, this.n) : etmv0;
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // etsq
    protected final void onCreate(Bundle bundle0) {
        int v2;
        if(!hypg.c() || !hypp.f()) {
            eveh.a(this);
        }
        super.onCreate(bundle0);
        this.p = this.getIntent().getIntExtra("EXTRA_TOKENIZATION_ENTRY_POINT", 0);
        String s = "";
        if(bundle0 != null) {
            this.o = bundle0.getString("state_browser_package_name", "");
        }
        AccountInfo accountInfo0 = (AccountInfo)dydw.b(this.getIntent(), "extra_account_info", AccountInfo.CREATOR);
        if(accountInfo0 != null && !TextUtils.isEmpty(accountInfo0.b)) {
            this.n = accountInfo0;
            int v = gjri.a(this.getIntent().getIntExtra("extra_payment_method_type", 0));
            if(v == 0) {
                v = 1;
            }
            this.q = v;
            int v1 = 2;
            switch(this.getIntent().getIntExtra("tokenizable_type", 0)) {
                case 0: {
                    v2 = 2;
                    break;
                }
                case 1: {
                    v2 = 3;
                    break;
                }
                case 2: {
                    v2 = 4;
                    break;
                }
                case 3: {
                    v2 = 5;
                    break;
                }
                case 4: {
                    v2 = 6;
                    break;
                }
                case 5: {
                    v2 = 7;
                    break;
                }
                case 6: {
                    v2 = 8;
                    break;
                }
                default: {
                    v2 = 0;
                }
            }
            if(v2 != 0) {
                v1 = v2;
            }
            this.r = v1;
            this.k = this.a();
            if(bundle0 == null) {
                if(AddNewCardThroughBrowserChimeraActivity.j) {
                    ComponentName componentName0 = this.getCallingActivity();
                    if(componentName0 == null) {
                        this.setResult(0);
                        this.finish();
                        return;
                    }
                    if(!componentName0.getPackageName().equals("com.google.android.gms")) {
                        componentName0.getPackageName();
                        this.setResult(0);
                        this.finish();
                        return;
                    }
                }
                String s1 = this.getIntent().getStringExtra("extra_url");
                if(TextUtils.isEmpty(s1)) {
                    this.setResult(0);
                    this.finish();
                    return;
                }
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                ResolveInfo resolveInfo0 = this.getPackageManager().resolveActivity(intent0, 0);
                if(resolveInfo0 != null) {
                    if(resolveInfo0.activityInfo != null) {
                        s = resolveInfo0.activityInfo.packageName;
                    }
                    this.o = s;
                    this.startActivity(intent0);
                    etmv etmv0 = this.a();
                    String s2 = this.o;
                    int v3 = this.q;
                    int v4 = this.r;
                    ProtoLiteBuilder hftp0 = etmv0.an(gjsj.U, null, this.p);
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjrk.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    s2.getClass();
                    ((gjrk)hftv0).b |= 1;
                    ((gjrk)hftv0).c = s2;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gjrk.b(((gjrk)hftp1.b_message));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gjrk gjrk0 = (gjrk)hftp1.b_message;
                    if(v3 == 0) {
                        throw null;
                    }
                    gjrk0.f = v3 - 1;
                    gjrk0.b |= 16;
                    int v5 = etmv.Q(gtjf.a(v4));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gjrk)hftp1.b_message).g = v5 - 1;
                    ((gjrk)hftp1.b_message).b |= 0x20;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjzl gjzl0 = (gjzl)hftp0.b_message;
                    gjrk gjrk1 = (gjrk)hftp1.N_build();
                    gjrk1.getClass();
                    gjzl0.v = gjrk1;
                    gjzl0.b |= 0x80000;
                    etmv0.l(((gjzl)hftp0.N_build()));
                    return;
                }
                this.setResult(0);
                this.finish();
                return;
            }
            this.m = true;
            return;
        }
        ((ggtj)AddNewCardThroughBrowserChimeraActivity.l.j()).x("Missing accountInfo, finishing");
        this.setResult(0);
        this.finish();
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        Intent intent1 = new Intent();
        Uri uri0 = intent0.getData();
        intent1.setData(uri0);
        if(uri0 != null && uri0.getPathSegments() != null && !uri0.getPathSegments().isEmpty()) {
            String s = (String)gggq.p(uri0.getPathSegments());
            if(gfqz.e("success", s)) {
                this.a().ab(this.o, this.q, this.r, 4, uri0.toString());
                this.setResult(-1, intent1);
                this.finish();
                return;
            }
            if(gfqz.e("declined", s)) {
                this.a().ab(this.o, this.q, this.r, 5, uri0.toString());
                this.setResult(3, intent1);
                this.finish();
                return;
            }
            if(gfqz.e("failure", s)) {
                this.a().ab(this.o, this.q, this.r, 3, uri0.toString());
                this.setResult(1, intent1);
                this.finish();
                return;
            }
            if(!TextUtils.isEmpty(s) && gfqz.e("continue_sca_tokenization", s)) {
                String s1 = uri0.getQueryParameter("stepupresponse");
                if("approved".equals(s1)) {
                    this.setResult(-1, intent1);
                }
                else if("declined".equals(s1)) {
                    this.setResult(3, intent1);
                }
                else {
                    this.setResult(1, intent1);
                }
                this.finish();
                return;
            }
            this.a().ab(this.o, this.q, this.r, 1, uri0.toString());
            this.setResult(0);
            this.finish();
            return;
        }
        this.a().ab(this.o, this.q, this.r, 1, (uri0 == null ? "" : uri0.toString()));
        this.setResult(0);
        this.finish();
    }

    @Override  // etsq
    protected final void onPause() {
        super.onPause();
        this.m = true;
    }

    @Override  // etsq
    protected final void onResume() {
        super.onResume();
        if(this.m) {
            this.a().ab(this.o, this.q, this.r, 2, "");
            this.setResult(2);
            this.finish();
        }
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putString("state_browser_package_name", this.o);
    }
}

