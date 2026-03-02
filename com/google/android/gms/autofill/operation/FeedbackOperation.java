package com.google.android.gms.autofill.operation;

import android.content.Intent;
import anmo;
import ansn;
import aoel;
import aoem;
import aqbt;
import azts;
import bbcu;
import bboh;
import bkyf;
import com.google.android.chimera.IntentOperation;
import gmap;
import gmbu;

public final class FeedbackOperation extends IntentOperation {
    public static final bboh a;

    static {
        FeedbackOperation.a = bboh.b("FeedbackOperation", bbcu.cD);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        azts azts0 = (azts)((ansn)anmo.a(this)).O.get();
        bkyf bkyf0 = new bkyf();
        bkyf0.d = "com.google.android.gms.autofill.USER_INITIATED_FEEDBACK_REPORT";
        bkyf0.e(new aoem(this), true);
        if(intent0.getStringExtra("account_name_in_use") != null) {
            bkyf0.b = intent0.getStringExtra("account_name_in_use");
        }
        gmbu.t(aqbt.a(azts0.ab(bkyf0.a())), new aoel(this), gmap.a);
    }
}

