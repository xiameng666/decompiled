package com.google.android.gms.gass;

import android.content.Intent;
import bsis;
import com.google.android.chimera.IntentOperation;
import hrwa;
import htdw;
import htei;
import hteo;

public class PeriodicTasksManager.GassFlagsUpdateIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null && "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent0.getAction())) {
            if(hrwa.c()) {
                bsis.f(this.getBaseContext());
            }
            else if(!bsis.d.equals(Long.valueOf(htdw.c())) || bsis.e != htdw.f() || !bsis.f.equals(Long.valueOf(htdw.b()))) {
                bsis.e(this.getBaseContext());
            }
            if(hrwa.k()) {
                bsis.b(this.getBaseContext());
                bsis.c(this.getBaseContext());
            }
            else {
                if(!bsis.g.equals(Long.valueOf(htei.c())) || bsis.h != htei.g() || !bsis.i.equals(Long.valueOf(htei.b()))) {
                    bsis.a(this.getBaseContext());
                }
                if(!bsis.j.equals(Long.valueOf(hteo.c())) || bsis.k != hteo.h() || !bsis.m.equals(Long.valueOf(hteo.b())) || bsis.l != hteo.g()) {
                    bsis.d(this.getBaseContext());
                }
            }
        }
    }
}

