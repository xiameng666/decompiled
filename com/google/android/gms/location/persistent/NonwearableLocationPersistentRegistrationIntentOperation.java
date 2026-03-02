package com.google.android.gms.location.persistent;

import android.content.Intent;
import cnuz;
import com.google.android.chimera.IntentOperation;

public class NonwearableLocationPersistentRegistrationIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!"com.google.android.gms.location.persistent.REGISTER".equals(intent0.getAction())) {
            return;
        }
        LocationPersistentChimeraService.a("LOWD", new cnuz());
    }
}

