package com.google.android.gms.smartdevice.common;

import android.content.Context;
import android.content.Intent;
import avzf;
import baun;
import bayn;
import bbib;
import bbmq;
import cjpd;
import com.google.android.gms.smartdevice.logging.CleanBufferedLogsService;
import com.google.android.gms.smartdevice.notification.SerializableNotification;
import equa;
import erqc;
import gged_interceptors;
import ggna;
import hygo;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Map;

public class ModuleInitializer extends avzf {
    private static final gged_interceptors a;
    private static final baun b;

    static {
        ModuleInitializer.a = gged_interceptors.n("com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity", "com.google.android.gms.smartdevice.setup.ui.AccountChallengeActivity", "com.google.android.gms.smartdevice.d2d.ui.ForwardingActivity");
        ModuleInitializer.b = new erqc(new String[]{"ModuleInitializer"});
    }

    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
        gged_interceptors gged0 = ModuleInitializer.a;
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            bbmq.G(this, ((String)gged0.get(v1)), true);
        }
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        LinkedList linkedList1;
        baun baun0 = ModuleInitializer.b;
        baun0.j("ModuleInitializer got intent %s with flag %d", new Object[]{intent0, v});
        Context context0 = this.getBaseContext();
        bayn bayn0 = bayn.f(context0);
        bayn0.getClass();
        bbib bbib0 = new bbib(context0);
        Map map0 = cjpd.d(equa.a());
        if(!map0.isEmpty()) {
            baun baun1 = equa.a;
            baun1.j("Found %s notifications.", new Object[]{map0.size()});
            LinkedList linkedList0 = new LinkedList();
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String[] arr_s = ((String)map$Entry0.getKey()).split(":", 2);
                int v1 = (int)Integer.valueOf(arr_s[0]);
                String s = arr_s[1];
                SerializableNotification serializableNotification0 = SerializableNotification.b(((String)map$Entry0.getValue()));
                long v2 = System.currentTimeMillis();
                long v3 = v2 - serializableNotification0.a;
                if(serializableNotification0.h) {
                    linkedList1 = linkedList0;
                    if(v3 <= serializableNotification0.c + serializableNotification0.b) {
                        goto label_31;
                    }
                    else {
                        baun1.h("Not showing expired notification with tag: " + s, new Object[0]);
                        linkedList0 = linkedList1;
                        linkedList0.add(((String)map$Entry0.getKey()));
                        continue;
                    }
                    goto label_25;
                }
                else {
                label_25:
                    linkedList1 = linkedList0;
                    if(v3 > serializableNotification0.c) {
                        baun1.h("Not showing expired notification with tag: " + s, new Object[0]);
                        linkedList0 = linkedList1;
                        linkedList0.add(((String)map$Entry0.getKey()));
                        continue;
                    }
                }
            label_31:
                linkedList0 = linkedList1;
                serializableNotification0.a = v2;
                long v4 = serializableNotification0.c;
                if(v4 > 0L) {
                    v4 -= v3;
                    serializableNotification0.c = v4;
                }
                long v5 = serializableNotification0.b;
                if(v5 > 0L) {
                    if(v4 < 0L) {
                        serializableNotification0.b = v5 + v4;
                        serializableNotification0.c = 0L;
                    }
                    else {
                        serializableNotification0.b = v5 - v3;
                    }
                }
                equa.c(s, v1, serializableNotification0, bayn0, bbib0);
                baun1 = baun1;
            }
            for(Object object1: linkedList0) {
                String[] arr_s1 = ((String)object1).split(":", 2);
                int v6 = (int)Integer.valueOf(arr_s1[0]);
                equa.d(arr_s1[1], v6, bayn0);
            }
        }
        if(hygo.c()) {
            baun0.d("Module init - scheduling buffered logs cleanup task", new Object[0]);
            CleanBufferedLogsService.e(this);
        }
    }
}

