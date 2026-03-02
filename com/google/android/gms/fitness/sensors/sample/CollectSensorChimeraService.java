package com.google.android.gms.fitness.sensors.sample;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import babq;
import bbll;
import bbng;
import bbnk;
import bboh;
import bqsa;
import brea;
import brec;
import brgc;
import brib;
import bric;
import brid;
import brif;
import brig;
import brij;
import brim;
import brin;
import brio;
import briq;
import brir;
import brrv;
import esaa;
import gfqx;
import gfsx;
import gfuy;
import gged_interceptors;
import gggq;
import ggna;
import ggtj;
import glyi;
import glzd;
import gmap;
import gmbt;
import gmbu;
import gmcd;
import gmcu;
import htaf;
import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CollectSensorChimeraService extends babq {
    public static final bboh b;
    public final bbng c;
    public final ScheduledExecutorService d;
    private brir e;
    private brin f;

    static {
        CollectSensorChimeraService.b = brrv.a();
    }

    public CollectSensorChimeraService() {
        bbll bbll0 = new bbll(1, 10);
        this(bbnk.a, bbll0);
    }

    public CollectSensorChimeraService(bbng bbng0, ScheduledExecutorService scheduledExecutorService0) {
        super("CollectSensorChimeraService", "FITNESS");
        this.c = bbng0;
        this.d = scheduledExecutorService0;
    }

    @Override  // bbld
    protected final void b(Intent intent0) {
        brim brim0;
        gmcd gmcd0;
        Object object0;
        gfsx gfsx0;
        brij brij0;
        int v = intent0.getIntExtra("delay_trigger_seq_no", -1);
        if(v != -1) {
            brin brin0 = this.f;
            synchronized(brin.a) {
                brim0 = (brim)brin.b.remove(Integer.valueOf(v));
            }
            if(brim0 == null) {
                return;
            }
            brin0.c.submit(brim0.a).isDone();
            return;
        }
        intent0.getIntExtra("request_id", -1);
        brir brir0 = this.e;
        brio brio0 = brio.j(intent0.getLongExtra("adapter_id", -1L));
        Sensor sensor0 = null;
        if(brio0 == null) {
            brij0 = null;
        }
        else {
            int v2 = intent0.getIntExtra("request_id", -1);
            brec brec0 = brio0.a(v2);
            if(brec0 == null) {
                brij0 = null;
            }
            else {
                int v3 = intent0.getIntExtra("max_sample_secs", 20);
                brij0 = new brij(brio0, brec0, v2, intent0.getIntExtra("max_sample_points", 10), v3, intent0.getBooleanExtra("allow_in_doze", false));
            }
        }
        if(brij0 != null) {
            brea brea0 = brij0.a.a;
            if((brea0 instanceof brgc)) {
                Sensor sensor1 = ((brgc)brea0).a(brij0.b.a);
                if(sensor1 != null) {
                    gged_interceptors gged0 = brir0.a;
                    int v4 = ((ggna)gged0).c;
                    int v5 = 0;
                    while(v5 < v4) {
                        briq briq0 = (briq)gged0.get(v5);
                        ++v5;
                        if(!briq0.c(sensor1)) {
                            continue;
                        }
                        gfsx0 = gfsx.m(briq0.a(brij0));
                        goto label_48;
                    }
                }
            }
        }
        gfsx0 = gfqx.a;
    label_48:
        if(gfsx0.i()) {
            object0 = gfsx0.d();
        }
        else {
            long v6 = intent0.getLongExtra("adapter_id", -1L);
            brio brio1 = brio.j(v6);
            if(brio1 == null) {
                ((ggtj)CollectSensorChimeraService.b.j()).A("CollectSensorChimeraService did not find adapter %d", v6);
                object0 = gmbu.i(Boolean.valueOf(false));
            }
            else {
                gfuy.e(brio1);
                int v7 = intent0.getIntExtra("request_id", -1);
                brec brec1 = brio1.a(v7);
                if(brec1 == null) {
                    ((ggtj)CollectSensorChimeraService.b.j()).z("CollectSensorChimeraService did not find request %d", v7);
                    object0 = gmbu.i(Boolean.valueOf(false));
                }
                else {
                    gfuy.e(brec1);
                    SensorManager sensorManager0 = (SensorManager)this.getSystemService("sensor");
                    if(htaf.c()) {
                        sensor0 = (Sensor)gggq.o(sensorManager0.getSensorList(34), null);
                    }
                    if(!intent0.getBooleanExtra("disable_off_body", true)) {
                        gmcd0 = gmbu.i(Boolean.valueOf(true));
                    }
                    else if(bqsa.c(this)) {
                        gmcd0 = gmbu.i(Boolean.valueOf(false));
                    }
                    else if(sensor0 == null) {
                        gmcd0 = bqsa.b(this) ? gmbu.i(Boolean.valueOf(false)) : gmbu.i(Boolean.valueOf(true));
                    }
                    else {
                        gmcu gmcu0 = new gmcu();
                        if(sensorManager0.registerListener(new CollectSensorChimeraService.1(this, this, sensorManager0, gmcu0), sensor0, 0)) {
                            gmcd0 = gmbt.h(gmcu0).i(10L, TimeUnit.SECONDS, this.d);
                        }
                        else {
                            ((ggtj)CollectSensorChimeraService.b.j()).x("Failed to register LLOB listener.");
                            gmcd0 = bqsa.b(this) ? gmbu.i(Boolean.valueOf(false)) : gmbu.i(Boolean.valueOf(true));
                        }
                    }
                    bric bric0 = new bric();
                    object0 = glzd.g(glyi.f(gmcd0, Exception.class, bric0, gmap.a), new brid(this, intent0, brio1, v7, brec1, sensor0), gmap.a);
                }
            }
            if(!((gmcd)object0).isDone()) {
                int v8 = intent0.getIntExtra("max_sample_secs", 20);
                this.a.c(TimeUnit.SECONDS.toMillis(((long)(v8 + v8 + 10))));
                esaa esaa0 = this.a;
                Objects.requireNonNull(esaa0);
                ((gmcd)object0).hB(new brig(esaa0), gmap.a);
            }
        }
        ((gmcd)object0).hB(new brif(), gmap.a);
    }

    @Override  // babq
    public final void onCreate() {
        super.onCreate();
        brin brin0 = new brin(this.d);
        this.f = brin0;
        brin0.d = new brib(this);
        this.e = new brir(this, this.f, this.d);
    }
}

