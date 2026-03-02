package com.google.android.gms.auth.uiflows.addaccount;

import adhx;
import ajcc;
import ajcd;
import ajcg;
import alwv;
import alxt;
import amcx;
import amez;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bagv;
import bbnp;
import bbod;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.setupcompat.logging.SetupMetric;
import hoxb;
import hpht;

@GmsCoreVeId(257089)
public class ErrorChimeraActivity extends amez implements ajcc {
    private ajcd h;

    @Override  // ajcc
    public final void b() {
        this.gN(-1, null);
    }

    @Override  // amdx
    protected final String gQ() {
        return "ErrorActivity";
    }

    public static int k(boolean z) {
        if(z) {
            return 0;
        }
        return bbod.c(hpht.b()) ? 0 : 4;
    }

    private final CharSequence l() {
        return (CharSequence)this.x().a(amcx.f);
    }

    @Override  // ajcc, xnz
    public final void onBackPressed() {
        super.onBackPressed();
        this.gN(0, null);
    }

    @Override  // amez
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(adhx.a.a(this)) {
            if(((Boolean)this.x().b(amcx.h, Boolean.valueOf(false))).booleanValue()) {
                this.gN(0, new Intent().putExtra("ERROR_OCCURRED", true));
                return;
            }
            this.setTheme(0x7F160F92);  // style:TvMinuteMaidOpaque
            this.setContentView(LayoutInflater.from(this).inflate(0x7F0E013D, null));  // layout:auth_tv_glif_error_activity
            ((TextView)this.findViewById(0x7F0B22B8)).setText(((CharSequence)this.x().a(amcx.e)));  // id:title
            ((TextView)this.findViewById(0x7F0B18F0)).setText(this.l());  // id:message
            TextView textView0 = (TextView)this.findViewById(0x7F0B0D7D);  // id:button
            textView0.setText(0x7F150281);  // string:auth_device_management_go_back "Go Back"
            textView0.setOnClickListener(new alxt(this));
            return;
        }
        String s = this.y().a;
        int v = s == null || !bagv.i(s) ? 0 : 1;
        this.h = v != 0 && (hoxb.e() || bbnp.m(this)) ? ((ajcd)LayoutInflater.from(this).inflate((bbod.c(hoxb.b()) ? 0x7F0E011E : 0x7F0E011D), null, false)) : ((ajcd)LayoutInflater.from(this).inflate((1 == v ? 0x7F0E011C : 0x7F0E011B), null, false));  // layout:auth_generic_suw_non_loading_glif
        bagv.e(((ViewGroup)this.h));
        this.s = (ajcg)this.h;
        String s1 = (String)this.x().a(amcx.e);
        this.h.b(s1);
        this.h.e(this.l());
        Integer integer0 = (Integer)this.x().a(amcx.g);
        if(integer0 != null) {
            this.h.a(((int)integer0) == 0);
        }
        this.h.d(this);
        String s2 = this.x == null ? "AuthErrors" : String.format("Auth%sErrors", this.x.b());
        Intent intent0 = this.getIntent();
        SetupMetric[] arr_setupMetric = {SetupMetric.a(s2, this.y)};
        alwv.a(intent0, alwv.c, arr_setupMetric);
        this.setContentView(((View)this.h));
    }
}

