package com.google.android.gms.auth.authzen.transaction.workflows;

import aikl;
import aill;
import ailp;
import ailt;
import ailx;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import hhqj;
import hhqx;

@GmsCoreVeId(0x3ED29)
public class DoubleConfirmationChimeraWorkflow extends aikl {
    public static final int y;

    @Override  // aikl
    public final boolean n(ailt ailt0, int v) {
        if(!super.n(ailt0, v)) {
            String s = ailt0.z();
            if(ailp.a.equals(s)) {
                if(v == 0) {
                    this.q(2, false);
                    Bundle bundle0 = this.j;
                    aill aill0 = new aill();
                    aill0.setArguments(bundle0);
                    this.l(ailt0, aill0);
                    return true;
                }
                this.s(hhqj.e, 3);
                this.c(ailt0);
                return true;
            }
            if(aill.a.equals(s)) {
                if(v == 0) {
                    this.s(hhqj.b, 2);
                    this.f(this.j.getString(ailx.g));
                    return true;
                }
                this.s(hhqj.e, 3);
                this.i(this.j.getString(ailx.h));
                this.setResult(-1);
                this.finish();
                return true;
            }
            if(!"ailj".equals(s)) {
                throw new RuntimeException("Fragment not supported in double confirm workflow: " + s);
            }
            this.setResult(-1);
            this.finish();
            return true;
        }
        return true;
    }

    public static Intent t(hhqx hhqx0, String s, byte[] arr_b) {
        Intent intent0 = DoubleConfirmationChimeraWorkflow.a(hhqx0, s, arr_b);
        intent0.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.workflows.DoubleConfirmationWorkflow");
        return intent0;
    }
}

