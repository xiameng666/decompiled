package com.google.android.gms.gass;

import android.content.Intent;
import avzf;
import bbmq;
import bsis;
import hrwa;

public class PeriodicTasksManager.GassModuleInitIntentOperation extends avzf {
    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        bbmq.G(this, "com.google.android.gms.gass.GassService", true);
        intent0.getAction();
        if(hrwa.k()) {
            bsis.b(this.getBaseContext());
            bsis.c(this.getBaseContext());
        }
        else {
            if(!bsis.b) {
                bsis.a(this.getBaseContext());
                bsis.b = true;
            }
            if(!bsis.c) {
                bsis.d(this.getBaseContext());
                bsis.c = true;
            }
        }
        if(!hrwa.c()) {
            if(!bsis.a) {
                bsis.e(this.getBaseContext());
                bsis.a = true;
            }
            return;
        }
        bsis.f(this.getBaseContext());
    }
}

