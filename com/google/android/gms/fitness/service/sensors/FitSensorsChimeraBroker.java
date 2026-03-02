package com.google.android.gms.fitness.service.sensors;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import brjg;
import brjm;
import brjo;
import brlu;
import brlw;
import cjup;

public class FitSensorsChimeraBroker extends brjo {
    public FitSensorsChimeraBroker() {
        super("com.google.android.gms.fitness.service.sensors.FitSensorsBroker");
    }

    @Override  // brji
    public final brjg b(String s) {
        return new brlw(this, s, this.d, this.f);
    }

    @Override  // brji
    protected final cjup c(Context context0, brjm brjm0) {
        return new cjup(context0, 55, FitSensorsChimeraBroker.d(), 3, brjm0);
    }

    @Override  // brji
    protected final boolean h(Intent intent0) {
        return "com.google.android.gms.fitness.SensorsApi".equals(intent0.getAction());
    }

    @Override  // brjo
    public final boolean handleMessage(Message message0) {
        if(message0.what != 100) {
            return super.handleMessage(message0);
        }
        for(Object object0: this.a.values()) {
            brlw brlw0 = (brlw)object0;
            brlu brlu0 = brlw0.k;
            int v = brlu0.beginBroadcast();
            while(v > 0) {
                --v;
                brlw0.o(brlw0.n(v));
            }
            brlu0.finishBroadcast();
            brlu0.kill();
        }
        return true;
    }

    @Override  // brjo
    public final void onDestroy() {
        this.d.sendEmptyMessage(100);
        super.onDestroy();
    }
}

