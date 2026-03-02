package com.google.android.chimera.container.intentoperation;

import a;
import android.content.Intent;
import android.provider.Settings.Global;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import fhcd;
import hrmu;
import java.util.Iterator;
import java.util.List;
import wxp;
import xje;
import xjf;

public class SleepingIntentOperation extends IntentOperation {
    final List a(Intent intent0) {
        int v = fhcd.h(this) ^ 1;
        xje xje0 = new xje();
        xje0.a(Integer.valueOf(0x80000000), Integer.valueOf(0));
        return IntentOperation.getStartIntentsForBroadcast(this, intent0, false, ((boolean)v), true, new xjf(xje0));
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        if(xjf.a.contains(s) && xjf.a(intent0) != null) {
            wxp.b();
            hrmu hrmu0 = hrmu.a;
            long v = hrmu0.i().i();
            if(v < 0L) {
                v = 0L;
            }
            try {
                try {
                    wxp.b();
                    Settings.Global.getInt(wxp.a().getContentResolver(), "device_provisioned", 0);
                    if(hrmu0.i().n()) {
                        Thread.sleep(v);
                    }
                    goto label_30;
                }
                catch(InterruptedException unused_ex) {
                }
                Log.w("SleepingOp", a.D(v, "Failed to wait ", " millis for tier"));
                Thread.currentThread().interrupt();
            }
            catch(Throwable throwable0) {
                goto label_22;
            }
            List list0 = this.a(intent0);
            if(list0 != null) {
                for(Object object0: list0) {
                    this.startService(((Intent)object0));
                    continue;
                label_22:
                    List list1 = this.a(intent0);
                    if(list1 != null) {
                        for(Object object1: list1) {
                            this.startService(((Intent)object1));
                        }
                    }
                    throw throwable0;
                label_30:
                    List list2 = this.a(intent0);
                    if(list2 == null) {
                        break;
                    }
                    Iterator iterator2 = list2.iterator();
                    while(true) {
                        if(!iterator2.hasNext()) {
                            break;
                        }
                        Object object2 = iterator2.next();
                        this.startService(((Intent)object2));
                    }
                    break;
                }
            }
        }
    }
}

