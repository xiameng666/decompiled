package com.google.android.gms.stats.eastworld;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable.Creator;
import android.util.Pair;
import bauc;
import com.google.android.gms.appusage.AppUsageResult;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import escx;
import ggtj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class EastworldChimeraService.AppUsageOrderedBroadcastReceiver extends TracingBroadcastReceiver {
    public EastworldChimeraService.AppUsageOrderedBroadcastReceiver() {
        super("stats");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        ArrayList arrayList1;
        long v = intent0.getLongExtra("appUsage_startTime", -1L);
        long v1 = intent0.getLongExtra("appUsage_endTime", -1L);
        if(Long.compare(v, 0L) >= 0 && v1 >= 0L) {
            List list0 = escx.b(v, v1, intent0.getStringArrayListExtra("appUsage_packageNames"));
            Bundle bundle0 = this.getResultExtras(true);
            Parcelable.Creator parcelable$Creator0 = AppUsageResult.CREATOR;
            ArrayList arrayList0 = (ArrayList)bundle0.getSerializable("appUageResult");
            if(arrayList0 == null) {
                arrayList1 = null;
            }
            else {
                ArrayList arrayList2 = new ArrayList(arrayList0.size());
                int v3 = arrayList0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    arrayList2.add(bauc.a(((byte[])arrayList0.get(v4)), parcelable$Creator0));
                }
                arrayList1 = arrayList2;
            }
            if(arrayList1 == null) {
                bauc.o(new ArrayList(list0), bundle0);
            }
            else {
                arrayList1.addAll(list0);
                HashMap hashMap0 = new HashMap();
                int v5 = arrayList1.size();
                for(int v2 = 0; v2 < v5; ++v2) {
                    AppUsageResult appUsageResult0 = (AppUsageResult)arrayList1.get(v2);
                    Pair pair0 = Pair.create(appUsageResult0.a, Integer.valueOf(appUsageResult0.b));
                    hashMap0.put(pair0, Long.valueOf((hashMap0.containsKey(pair0) ? ((long)(((Long)hashMap0.get(pair0)))) : 0L) + appUsageResult0.c));
                }
                ArrayList arrayList3 = new ArrayList();
                for(Object object0: hashMap0.keySet()) {
                    long v6 = (long)(((Long)hashMap0.get(((Pair)object0))));
                    arrayList3.add(new AppUsageResult(((String)((Pair)object0).first), ((int)(((Integer)((Pair)object0).second))), v6));
                }
                bauc.o(arrayList3, bundle0);
            }
            this.setResultExtras(bundle0);
            return;
        }
        ((ggtj)((ggtj)EastworldChimeraService.a.i()).ar(15502)).K("Didn\'t get correct time range parameters from app usage broadcast, startTime:%d endTime:%d", v, v1);
    }
}

