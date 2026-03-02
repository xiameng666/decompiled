package com.google.android.gms.tapandpay.settings;

import MessageLite;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import bbcu;
import bboh;
import cjtb;
import cjtd;
import cmcx;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import etsq;
import eucu;
import frce;
import frie;
import frif;
import frjp;
import frli;
import fthd;
import fthe;
import ibpo;
import ibqg;
import ibuq;
import java.util.ArrayList;
import java.util.Set;

@GmsCoreVeId(0x3FE1D)
public final class TapAndPayEnvironmentSettingsChimeraActivity extends etsq {
    public final bboh j;
    private Spinner k;

    public TapAndPayEnvironmentSettingsChimeraActivity() {
        this.j = bboh.b("TapAndPay", bbcu.aM);
    }

    @Override  // etsq
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0E0B87);  // layout:tp_activity_tapandpay_environment_setting
        this.setTitle(0x7F153362);  // string:tp_tapandpay_environment_setting_title "TapAndPay Environment"
        this.findViewById(0x7F0B03AD);  // id:EnvironmentSwitcherContainer
        this.k = (Spinner)this.findViewById(0x7F0B0894);  // id:TapandpayEnvironmentSpinner
        fthd[] arr_fthd = new fthd[3];
        fthd fthd0 = fthd.a;
        int v = 0;
        arr_fthd[0] = fthd0;
        arr_fthd[1] = fthd.b;
        arr_fthd[2] = fthd.c;
        Set set0 = ibqg.c(arr_fthd);
        ArrayList arrayList0 = new ArrayList(ibpo.q(set0, 10));
        for(Object object0: set0) {
            fthd fthd1 = (fthd)object0;
            arrayList0.add((fthd1 == fthd0 ? "Use default setting" : fthd1.name()));
        }
        Spinner spinner0 = this.k;
        Spinner spinner1 = null;
        if(spinner0 == null) {
            ibuq.j("environmentSwitcherSpinner");
            spinner0 = null;
        }
        spinner0.setAdapter(new ArrayAdapter(this, 0x7F0E032F, arrayList0));  // layout:environment_switcher_item
        frce frce0 = new frce(this);
        frce0.e("tapandpay_environment.pb");
        frce0.d("tapandpay");
        Uri uri0 = frce0.a();
        frjp frjp0 = new frjp(cjtd.a);
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)fthe.a));
        frie0.h(frjp0);
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        fthd fthd2 = fthd.b(((fthe)cmcx.a(frli0).get()).b);
        if(fthd2 == null) {
            fthd2 = fthd.h;
        }
        ibuq.e(fthd2, "getEnvironment(...)");
        if(set0.contains(fthd2)) {
            v = fthd2.a();
        }
        Spinner spinner2 = this.k;
        if(spinner2 == null) {
            ibuq.j("environmentSwitcherSpinner");
            spinner2 = null;
        }
        spinner2.setSelection(v);
        Spinner spinner3 = this.k;
        if(spinner3 == null) {
            ibuq.j("environmentSwitcherSpinner");
        }
        else {
            spinner1 = spinner3;
        }
        spinner1.setOnItemSelectedListener(new eucu(this, this));
    }
}

