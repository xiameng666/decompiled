package com.google.android.contextmanager.fence;

import a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import azts;
import cmnj;
import cnmv;
import cnnx;
import cnoc;
import cnod;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ggtj;
import hrgt;
import hrhp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import jwe;
import xra;
import xrn;
import xth;
import xuo;
import xus;
import xut;
import xvp;
import xxe;

public class PlaceFenceHelper extends TracingBroadcastReceiver {
    public final Context a;
    public final HashMap b;
    public final cnod c;
    public final boolean d;
    public final int e;
    public int f;
    public long g;

    public PlaceFenceHelper(Context context0) {
        super("contextmanager");
        this.f = 1000001;
        xxe.G();
        this.g = System.currentTimeMillis();
        this.a = context0;
        this.b = new HashMap();
        cnoc cnoc0 = new cnoc();
        cnoc0.b = "com.google.android.contextmanager.producer.module.PlacesProducer";
        this.c = new cnod(cnoc0);
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.gms.contextmanager.NEARBY_ALERTS");
        intentFilter0.addAction("android.gms.contextmanager.GEOFENCE");
        jwe.b(context0, this, intentFilter0, 2);
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, 0, new Intent("android.gms.contextmanager.GEOFENCE").setPackage("com.google.android.gms"), 0xA000000);
        new azts(xxe.e(), null, null).ad(pendingIntent0).z(new xra("[PlaceFenceHelper] resetGeofences", new Object[0]));
        this.d = hrhp.a.b().a();
        this.e = (int)hrgt.a.w().J();
    }

    public static String b(xus xus0) {
        return "ctxmgr:" + UUID.nameUUIDFromBytes(((String)xus0.b).getBytes());
    }

    public final void c() {
        HashMap hashMap0 = this.b;
        Iterator iterator0 = hashMap0.keySet().iterator();
        ArrayList arrayList0 = new ArrayList();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            xus xus0 = (xus)object0;
            xut xut0 = (xut)hashMap0.get(xus0);
            if(!xut0.b()) {
                if(xut0.c == 0) {
                    cnnx.c(xxe.e(), this.c).e(xut0.b).z(new xra("[PlaceFenceHelper] removePlaceFence", new Object[0]));
                }
                else {
                    arrayList0.add(PlaceFenceHelper.b(xus0));
                }
                iterator0.remove();
            }
        }
        if(!arrayList0.isEmpty()) {
            new azts(xxe.e(), null, null).ae(arrayList0).z(new xra("[PlaceFenceHelper] removeGeofences", new Object[0]));
        }
    }

    public static boolean d(xvp xvp0) {
        return xvp0 == null || xvp0.b == 4 ? false : !TextUtils.isEmpty(xvp0.q()) || !xvp0.t().isEmpty() || !xvp0.s().isEmpty();
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        int v;
        String s = intent0.getAction();
        if(s.equals("android.gms.contextmanager.NEARBY_ALERTS")) {
            cnmv cnmv0 = cnmv.d(intent0);
            if(cnmv0 == null) {
                a.ag(xth.a.i(), "[%s] NearbyBuffer is null!", "PlaceFenceHelper", '\u009E');
                v = -1;
            }
            else {
                cnmv0.iz();
                v = cnmv0.b;
                goto label_19;
            }
        }
        else if(s.equals("android.gms.contextmanager.GEOFENCE")) {
            cmnj cmnj0 = cmnj.a(intent0);
            if(cmnj0.e()) {
                ((ggtj)((ggtj)xth.a.i()).ar(0x9D)).z("[PlaceFenceHelper] Geofence intent error %d", cmnj0.a);
                v = -1;
            }
            else {
                v = cmnj0.b;
                goto label_19;
            }
        }
        else {
            v = -1;
        label_19:
            switch(v) {
                case 1: {
                    break;
                }
                case 2: {
                    v = 2;
                    break;
                }
                default: {
                    v = -1;
                }
            }
        }
        if(v == -1) {
            return;
        }
        String s1 = intent0.getStringExtra("extraPlaceChain");
        xus xus0 = TextUtils.isEmpty(s1) ? null : new xus(s1, 1);
        if(xus0 == null) {
            String s2 = intent0.getStringExtra("extraPlaceId");
            if(!TextUtils.isEmpty(s2)) {
                xus0 = new xus(s2, 2);
            }
        }
        if(xus0 == null) {
            int v1 = intent0.getIntExtra("extraPlaceType", -1);
            if(v1 >= 0) {
                xus0 = xus.a(v1);
            }
        }
        if(xus0 == null) {
            a.ag(xth.a.i(), "[PlaceFenceHelper] Cannot extract key from %s", intent0, '\u009C');
            return;
        }
        xxe.u().b(new xuo(this, xus0, v), new xrn("PlaceFenceHelper_onReceive", "com.google.android.gms", null));
    }
}

