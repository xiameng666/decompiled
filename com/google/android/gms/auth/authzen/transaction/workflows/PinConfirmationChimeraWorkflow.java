package com.google.android.gms.auth.authzen.transaction.workflows;

import aikl;
import ailj;
import ailk;
import ailp;
import ailt;
import ailx;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import hfuf;
import hhpv;
import hhqj;
import hhqm;
import hhqw;
import hhqx;
import java.util.ArrayList;
import java.util.Collections;

@GmsCoreVeId(0x3ED2A)
public class PinConfirmationChimeraWorkflow extends aikl {
    public static final int y;

    @Override  // aikl
    public final boolean n(ailt ailt0, int v) {
        if(!super.n(ailt0, v)) {
            String s = ailt0.z();
            if(ailp.a.equals(s)) {
                if(v == 0) {
                    this.q(2, false);
                    hhqw hhqw0 = this.m.e == null ? hhqw.b : this.m.e;
                    if(((hhqm)(hhqw0.m == null ? hhpv.a : hhqw0.m).c.get(0)).f && this.w == 46) {
                        this.q(604, false);
                        this.s(hhqj.b, 2);
                        this.f(this.j.getString(ailx.g));
                        return true;
                    }
                    hhqw hhqw1 = this.m.e == null ? hhqw.b : this.m.e;
                    hfuf hfuf0 = ((hhqm)(hhqw1.m == null ? hhpv.a : hhqw1.m).c.get(0)).e;
                    Bundle bundle0 = this.j;
                    int v1 = (int)(((Integer)hfuf0.get(0)));
                    ailk.ai.h("Pins received: " + hfuf0, new Object[0]);
                    ailk ailk0 = new ailk();
                    bundle0.putString(ailk.d, Integer.toString(v1));
                    String s1 = ailk.ag;
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: hfuf0) {
                        arrayList0.add(Integer.toString(((Integer)object0).intValue()));
                    }
                    Collections.shuffle(arrayList0);
                    bundle0.putStringArrayList(s1, arrayList0);
                    ailk0.setArguments(bundle0);
                    this.l(ailt0, ailk0);
                    return true;
                }
                this.c(ailt0);
                return true;
            }
            if(ailk.a.equals(s)) {
                if(v == 0) {
                    this.s(hhqj.b, 2);
                    this.f(this.j.getString(ailx.g));
                    return true;
                }
                if(v == 1) {
                    this.s(hhqj.h, 202);
                    Bundle bundle1 = (Bundle)this.j.clone();
                    String s2 = this.j.getString(ailx.c);
                    bundle1.putString(ailj.b, s2);
                    String s3 = this.j.getString(ailx.d);
                    bundle1.putString(ailj.c, s3);
                    String s4 = this.j.getString(ailx.e);
                    bundle1.putString(ailj.ag, s4);
                    String s5 = this.j.getString(ailx.f);
                    bundle1.putString(ailj.d, s5);
                    this.l(ailt0, ailj.y(bundle1));
                    return true;
                }
                this.s(hhqj.e, 3);
                this.i(this.j.getString(ailx.h));
                this.setResult(-1);
                this.finish();
                return true;
            }
            if(!"ailj".equals(s)) {
                throw new RuntimeException("Fragment not supported in account recovery workflow: " + s);
            }
            this.setResult(-1);
            this.finish();
            return true;
        }
        return true;
    }

    public static Intent t(hhqx hhqx0, String s, byte[] arr_b) {
        Intent intent0 = PinConfirmationChimeraWorkflow.a(hhqx0, s, arr_b);
        intent0.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.workflows.PinConfirmationWorkflow");
        return intent0;
    }
}

