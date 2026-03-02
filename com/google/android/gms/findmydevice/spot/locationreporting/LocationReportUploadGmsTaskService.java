package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import bbcu;
import bboh;
import boxr;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;

public final class LocationReportUploadGmsTaskService extends GmsTaskBoundService {
    static {
        bboh.b("LocationReportUplGmsSvc", bbcu.eD);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        Intent intent0 = boxr.d(this);
        if(intent0 != null) {
            intent0.putExtra("scheduled_by", "BATCH_UPLOAD_TRIGGERED_BY_GMS_TASK");
            this.getApplicationContext().startService(intent0);
        }
        return 0;
    }
}

