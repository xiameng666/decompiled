package com.google.android.gms.cast_mirroring;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import avjr;
import avjs;
import avkm;
import avko;
import avkq;
import avkr;
import avkz;
import com.android.media.remotedisplay.RemoteDisplay;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

class CastSystemMirroringChimeraService.ProjectionReceiver extends TracingBroadcastReceiver {
    final CastSystemMirroringChimeraService a;

    public CastSystemMirroringChimeraService.ProjectionReceiver(CastSystemMirroringChimeraService castSystemMirroringChimeraService0) {
        Objects.requireNonNull(castSystemMirroringChimeraService0);
        this.a = castSystemMirroringChimeraService0;
        super("Projection receiver");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.cast.media.PROJECT")) {
            if(intent0.getIntExtra("com.google.android.gms.media.USER_CONSENT_REQUEST_RESULT", 0) == -1) {
                Intent intent1 = (Intent)intent0.getParcelableExtra("extra_projection_intent");
                if(intent1 != null) {
                    this.a.a.e(intent1);
                    avkr avkr0 = this.a.a;
                    avkr0.p = false;
                    avkr0.c.m("User consent requested successfully!");
                    if(((Boolean)avkr0.h.mr()).booleanValue()) {
                        avjr avjr0 = new avjr(avkr0);
                        avkr0.j.ifPresent(avjr0);
                    }
                    avkq avkq0 = avkr0.r;
                    if(avkq0 != null) {
                        avkr0.c(avkq0.a);
                        return;
                    }
                    avko avko0 = avkr0.s;
                    if(avko0 != null) {
                        avjs avjs0 = new avjs(avkr0, avko0);
                        avkr0.f.execute(avjs0);
                    }
                }
            }
            else {
                avkr avkr1 = this.a.a;
                avkr1.c.g("Failed to get user consent to start mirroring.", new Object[0]);
                if(((Boolean)avkr1.h.mr()).booleanValue()) {
                    avkm avkm0 = new avkm(avkr1);
                    avkr1.j.ifPresent(avkm0);
                }
                avkr1.p = false;
                avkq avkq1 = avkr1.r;
                if(avkq1 == null) {
                    avko avko1 = avkr1.s;
                    if(avko1 != null) {
                        avkz avkz0 = avko1.c;
                        if(avkz0 != null) {
                            try {
                                avkz0.c(2209, ApiMetadata.b);
                            }
                            catch(RemoteException unused_ex) {
                            }
                        }
                    }
                }
                else {
                    int v = avkr1.getDiscoveryMode();
                    RemoteDisplay remoteDisplay0 = avkq1.a;
                    if(v == 0) {
                        avkr1.removeDisplay(remoteDisplay0);
                    }
                    else {
                        RemoteDisplay remoteDisplay1 = avkr1.findRemoteDisplay(remoteDisplay0.getId());
                        if(remoteDisplay1 != null) {
                            remoteDisplay1.setStatus(2);
                            avkr1.updateDisplay(remoteDisplay1);
                        }
                    }
                    avkr1.r = null;
                }
                avkr1.s = null;
                avkr1.f();
            }
        }
    }
}

