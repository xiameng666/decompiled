package com.google.android.gms.icing.service;

import android.content.Intent;
import android.os.Bundle;
import bwmx;
import bwne;
import bxav;
import cllr;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import hubn;

public class IcingGcmTaskChimeraService extends GmsTaskChimeraService {
    private bxav a;
    private bwmx b;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        String s = cllr0.a;
        bwne.d("%s: Running gcm task %s", "IcingGcmTaskChimeraService", s);
        if(s.equals("IcingIndexRetrySchedule")) {
            bwne.a("Retrying indexing of failed corpora.");
            Bundle bundle0 = cllr0.b;
            if(bundle0 != null && bundle0.containsKey("delaySeconds")) {
                long v = bundle0.getLong("delaySeconds");
                if(v < 0L) {
                    bwne.s("Retrying indexing of failed corpora failed due to invalid delay.");
                    return 2;
                }
                bwmx bwmx0 = this.b;
                if(bwmx0 == null) {
                    bwne.s("Retrying indexing of failed corpora failed as indexManager is null.");
                    return 2;
                }
                bwmx0.D(v);
                return 0;
            }
            bwne.s("Retrying indexing of failed corpora failed due to missing delay_seconds.");
            return 2;
        }
        if(s.equals("UpdateIcingIntentCorpora")) {
            Bundle bundle1 = cllr0.b;
            if(bundle1 != null && bundle1.containsKey("EXTRA_LAST_RAW_CONTACT_COUNT") && bundle1.containsKey("EXTRA_ATTEMPT")) {
                int v1 = bundle1.getInt("EXTRA_LAST_RAW_CONTACT_COUNT");
                int v2 = bundle1.getInt("EXTRA_ATTEMPT");
                new UpdateIcingCorporaIntentOperation().d(v1, v2);
                return 0;
            }
            return 2;
        }
        Intent intent0 = new Intent("com.google.android.gms.icing.GCM_TASK");
        intent0.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
        intent0.putExtra("tag", s);
        this.startService(intent0);
        return 0;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onCreate() {
        super.onCreate();
        if(hubn.i()) {
            bxav bxav0 = bxav.c(this.getApplicationContext());
            this.a = bxav0;
            if(bxav0 != null) {
                this.b = bxav0.a();
            }
        }
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onDestroy() {
        bxav bxav0 = this.a;
        if(bxav0 != null) {
            bxav0.b();
        }
        super.onDestroy();
    }
}

