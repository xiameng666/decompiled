package com.google.android.gms.wallet.ui.redirect;

import ByteString;
import MessageLite;
import Parser;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import fayi;
import fbfr;
import fbgn;
import fccx;
import fcdg;
import gciq;
import gczd;
import gdfi;
import gdfk;
import gewg;
import gfcw;
import gfcx;
import gfdq;
import java.util.ArrayList;

public class PopupRedirectChimeraActivity extends gdfi implements fayi, gczd {
    private Account k;
    private BuyFlowConfig l;

    @Override  // gdfi
    public final void T(int v, Bundle bundle0) {
        switch(v) {
            case 5: {
                Intent intent0 = new Intent();
                intent0.putExtra("errorDetails", bundle0);
                this.setResult(1, intent0);
                this.finish();
                return;
            }
            case 1: 
            case 4: 
            case 7: {
                return;
            }
            case 8: {
                if(this.j.la()) {
                    Intent intent1 = new Intent();
                    gdfk gdfk0 = this.j;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfcx.a).v_newBuilder();
                    gewg gewg0 = ((gfcw)gdfk0.aA).c;
                    if(gewg0 == null) {
                        gewg0 = gewg.a;
                    }
                    if((gewg0.b & 1) != 0) {
                        gewg gewg1 = ((gfcw)gdfk0.aA).c;
                        if(gewg1 == null) {
                            gewg1 = gewg.a;
                        }
                        String s = gewg1.c;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gfcx gfcx0 = (gfcx)hftp0.b_message;
                        s.getClass();
                        gfcx0.b |= 1;
                        gfcx0.e = s;
                    }
                    gewg gewg2 = ((gfcw)gdfk0.aA).c;
                    if(((gewg2 == null ? gewg.a : gewg2).b & 4) != 0) {
                        if(gewg2 == null) {
                            gewg2 = gewg.a;
                        }
                        ByteString hfsf0 = gewg2.e;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gfcx gfcx1 = (gfcx)hftp0.b_message;
                        hfsf0.getClass();
                        gfcx1.b |= 2;
                        gfcx1.f = hfsf0;
                    }
                    if(gdfk0.am()) {
                        String s1 = gdfk0.ai;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gfcx gfcx2 = (gfcx)hftp0.b_message;
                        s1.getClass();
                        gfcx2.c = 3;
                        gfcx2.d = s1;
                    }
                    else {
                        if(gdfk0.an()) {
                            String s2 = gdfk0.ah;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gfcx gfcx3 = (gfcx)hftp0.b_message;
                            s2.getClass();
                            gfcx3.c = 4;
                            gfcx3.d = s2;
                            goto label_69;
                        }
                        if(gdfk0.ae()) {
                            String s3 = gdfk0.ak;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gfcx gfcx4 = (gfcx)hftp0.b_message;
                            s3.getClass();
                            gfcx4.b |= 0x20;
                            gfcx4.j = s3;
                            goto label_69;
                        }
                        if(!gdfk0.al) {
                            throw new IllegalStateException("Unknown RedirectFormValue state.");
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gfcx gfcx5 = (gfcx)hftp0.b_message;
                        gfcx5.b |= 16;
                        gfcx5.i = true;
                    }
                label_69:
                    if(gdfk0.aj != null && gdfk0.aj.b()) {
                        String s4 = gdfk0.aj.a();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gfcx gfcx6 = (gfcx)hftp0.b_message;
                        s4.getClass();
                        gfcx6.b |= 4;
                        gfcx6.g = s4;
                    }
                    gciq.k(intent1, "formValue", ((MessageLite)(((gfcx)hftp0.N_build()))));
                    this.setResult(-1, intent1);
                    this.finish();
                    return;
                }
                return;
            }
            case 10: {
                this.setResult(2);
                this.finish();
                return;
            }
            case 23: {
                Intent intent2 = new Intent();
                intent2.putExtra("webViewComponentCallbackData", bundle0);
                this.setResult(-1, intent2);
                this.finish();
                return;
            }
            case 24: {
                Intent intent3 = new Intent();
                intent3.putExtra("webViewComponentErrorDetails", bundle0);
                this.setResult(100, intent3);
                this.finish();
                return;
            }
            default: {
                throw new IllegalArgumentException("Unsupported formEvent: " + v);
            }
        }
    }

    public static Intent a(Context context0, gfcw gfcw0, ArrayList arrayList0, String s, int v, byte[] arr_b, LogContext logContext0, BuyFlowConfig buyFlowConfig0, Account account0) {
        Intent intent0 = new Intent();
        intent0.setClassName("com.google.android.gms", gdfi.class.getName());
        Bundle bundle0 = new Bundle();
        gciq.j(bundle0, "formProto", ((MessageLite)gfcw0));
        gciq.l(bundle0, "successfullyValidatedApps", arrayList0);
        bundle0.putParcelable("parentLogContext", logContext0);
        intent0.putExtra("parcelableBundle", bundle0);
        intent0.putExtra("title", s);
        intent0.putExtra("activityThemeResId", v);
        intent0.putExtra("formThemeResId", 0x7F161034);  // style:WalletEmptyStyle
        intent0.putExtra("logToken", arr_b);
        intent0.setClassName(context0, "com.google.android.gms.wallet.ui.redirect.PopupRedirectProxyActivity");
        Bundle bundle1 = intent0.getBundleExtra("parcelableBundle");
        bundle1.putParcelable("buyFlowConfig", buyFlowConfig0);
        intent0.putExtra("parcelableBundle", bundle1);
        intent0.putExtra("account", account0);
        return intent0;
    }

    @Override  // gczd
    public final int g() {
        BuyFlowConfig buyFlowConfig0 = this.q();
        return buyFlowConfig0 == null ? 0 : buyFlowConfig0.b.a;
    }

    @Override  // xni
    public final void hG(Toolbar toolbar0) {
        super.hG(toolbar0);
        if(fbgn.R(this.q())) {
            this.hL().o(true);
            fbfr.e(toolbar0, this, this.q());
            return;
        }
        if(toolbar0 != null && toolbar0.e() != null) {
            TypedArray typedArray0 = this.obtainStyledAttributes(new int[]{0x7F040359});  // attr:colorWalletActionBarForeground
            int v = typedArray0.getColor(0, 0);
            typedArray0.recycle();
            if(v != 0 && toolbar0.e() != null) {
                toolbar0.e().setTint(v);
            }
        }
    }

    @Override  // gdfi
    protected final void l() {
        fbgn.D(this, this.q(), fbgn.k, true);
    }

    @Override  // gdfi
    protected final gdfk n(gfcw gfcw0, ArrayList arrayList0, int v, LogContext logContext0) {
        BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)this.getIntent().getBundleExtra("parcelableBundle").getParcelable("buyFlowConfig");
        gfdq gfdq0 = (gfdq)gciq.b(this.getIntent(), "webViewComponent", ((Parser)((ProtoLiteMessage)gfdq.a).jf(7, null)));
        if(gfdq0 == null) {
            gdfk gdfk0 = new fccx();
            Bundle bundle0 = fccx.W(gfcw0, arrayList0, v, logContext0, buyFlowConfig0.b.e);
            bundle0.putParcelable("buyFlowConfig", buyFlowConfig0);
            gdfk0.setArguments(bundle0);
            return gdfk0;
        }
        gdfk gdfk1 = new fcdg();
        gdfk1.setArguments(fcdg.W((gfdq0.b == null ? gfcw.a : gfdq0.b), null, v, logContext0, buyFlowConfig0.b.e));
        return gdfk1;
    }

    @Override  // gamd
    public final Account oc() {
        if(this.k == null) {
            this.k = (Account)this.getIntent().getParcelableExtra("account");
        }
        return this.k;
    }

    @Override  // fayi
    public final BuyFlowConfig q() {
        if(this.l == null) {
            this.l = (BuyFlowConfig)this.getIntent().getBundleExtra("parcelableBundle").getParcelable("buyFlowConfig");
        }
        return this.l;
    }
}

