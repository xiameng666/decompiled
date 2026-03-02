package com.google.android.gms.personalsafety.ars.datacollection;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import ehrp;
import ehtm;
import ehtt;
import ehtu;
import gwoz;
import gwpa;
import hfwn;
import hfyn;
import j..util.Objects;

public class StepCounter.SensorEventListener extends TracingSensorEventListener {
    final ehtu a;

    public StepCounter.SensorEventListener(ehtu ehtu0, Context context0) {
        Objects.requireNonNull(ehtu0);
        this.a = ehtu0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent0) {
        ehtt ehtt0 = this.a.b;
        if(ehtt0 != null && sensorEvent0.sensor.getType() == 19) {
            long v = sensorEvent0.timestamp;
            int v1 = (int)sensorEvent0.values[0];
            if(((ehrp)ehtt0).l.isPresent()) {
                Object object0 = ((ehrp)ehtt0).l.get();
                hfwn hfwn0 = hfyn.i(v);
                ProtoLiteBuilder hftp0 = ((ehtm)object0).c;
                if(((gwpa)hftp0.b_message).c.size() < 2) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwoz.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((gwoz)hftv0).b |= 2;
                    ((gwoz)hftv0).d = v1;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gwoz gwoz0 = (gwoz)hftp1.b_message;
                    hfwn0.getClass();
                    gwoz0.c = hfwn0;
                    gwoz0.b |= 1;
                    gwoz gwoz1 = (gwoz)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwpa gwpa0 = (gwpa)hftp0.b_message;
                    gwoz1.getClass();
                    gwpa0.b();
                    gwpa0.c.add(gwoz1);
                    return;
                }
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwoz.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp2.b_message;
                ((gwoz)hftv1).b |= 2;
                ((gwoz)hftv1).d = v1;
                if(!hftv1.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gwoz gwoz2 = (gwoz)hftp2.b_message;
                hfwn0.getClass();
                gwoz2.c = hfwn0;
                gwoz2.b |= 1;
                gwoz gwoz3 = (gwoz)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwpa gwpa1 = (gwpa)hftp0.b_message;
                gwoz3.getClass();
                gwpa1.b();
                gwpa1.c.set(1, gwoz3);
            }
        }
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor0) {
    }
}

