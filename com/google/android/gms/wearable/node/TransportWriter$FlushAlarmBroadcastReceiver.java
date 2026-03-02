package com.google.android.gms.wearable.node;

import android.content.Intent;
import com.google.android.gms.wearable.util.AlarmHelper.AlarmBroadcastReceiver;
import fdzb;
import j..util.Objects;

public class TransportWriter.FlushAlarmBroadcastReceiver extends AlarmHelper.AlarmBroadcastReceiver {
    final fdzb a;

    public TransportWriter.FlushAlarmBroadcastReceiver(fdzb fdzb0) {
        Objects.requireNonNull(fdzb0);
        this.a = fdzb0;
        super();
    }

    @Override  // com.google.android.gms.wearable.util.AlarmHelper$AlarmBroadcastReceiver
    public final void b(Intent intent0) {
        if(Objects.equals(intent0.getAction(), "TransportWriter::QueueFlush")) {
            fdzb.g("alarm triggering flush.");
            this.a.f();
        }
    }
}

