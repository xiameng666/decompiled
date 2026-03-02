package com.google.android.gms.mdm.services;

import android.app.admin.DevicePolicyManager;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.BatteryManager;
import cqia;
import cqig;
import cqjo;
import cqjp;
import cqjq;
import cqjx;
import cqnf;
import cqqa;
import cqqg;
import cqqh;
import cqqq;
import cqqr;
import fhcd;
import gmap;
import gmbu;
import gmbx;
import gmcd;
import hltp;
import hltq;
import hltu;
import hltz;
import hxvn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import juo;

public class LocateChimeraService extends cqjq {
    public static final int h;

    public LocateChimeraService() {
        super(cqia.a());
    }

    @Override  // cqjq
    protected final gmcd a(hltz hltz0, Location location0) {
        hltp hltp0;
        DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)this.getSystemService("device_policy");
        Collection collection0 = cqqr.a().a.values();
        boolean z = hltz0 == hltz.j || hltz0 == hltz.f;
        if(collection0 != null) {
            ArrayList arrayList0 = new ArrayList(collection0.size());
            for(Object object0: collection0) {
                cqig cqig0 = this.e;
                hltz[] arr_hltz = {hltz0};
                hltq hltq0 = null;
                if(((cqqq)object0).b && !z) {
                    BatteryManager batteryManager0 = (BatteryManager)this.getSystemService("batterymanager");
                    hltp0 = cqqh.a(this);
                }
                else {
                    hltp0 = null;
                }
                if(((cqqq)object0).c && !z) {
                    hltq0 = cqqg.b(this);
                }
                hltu hltu0 = cqqa.b(devicePolicyManager0);
                boolean z1 = cqqg.a(this);
                arrayList0.add(cqig0.a(arr_hltz, location0, hltp0, hltq0, ((cqqq)object0).a, hltu0, z1));
            }
            return gmbu.a(arrayList0).b(new cqjx(), gmap.a);
        }
        return gmbx.a;
    }

    @Override  // cqjq
    protected final void c(Intent intent0) {
        hltz hltz0;
        String s = intent0.getStringExtra("echo_server_token");
        intent0.getBooleanExtra("includeBatteryStatus", false);
        Boolean boolean0 = Boolean.valueOf(intent0.getBooleanExtra("includeConnectivityStatus", false));
        long v = intent0.getLongExtra("timeout", 60000L);
        this.f = s;
        boolean0.getClass();
        int v1 = new cqnf(this).a();
        switch(v1) {
            case -3: {
                hltz0 = hltz.e;
                break;
            }
            case -2: {
                hltz0 = hltz.d;
                break;
            }
            case -1: {
                hltz0 = hltz.f;
                break;
            }
            case -4: 
            case 1: {
                hltz0 = null;
                break;
            }
            default: {
                throw new IllegalStateException("Unhandled FindMyDeviceState value: " + v1);
            }
        }
        if(hltz0 != null) {
            super.d(hltz0);
            return;
        }
        this.b = new Semaphore(0);
        this.d = false;
        if(fhcd.g(this)) {
            this.a(hltz.a, null);
            LocationManager locationManager0 = (LocationManager)this.getSystemService("location");
            String s1 = locationManager0.isProviderEnabled("fused") || locationManager0.isProviderEnabled("gps") ? "fused" : null;
            if(s1 != null) {
                locationManager0.getCurrentLocation(s1, null, this.getMainExecutor(), new cqjo(this));
            }
        }
        else {
            this.g.d().z(new cqjp(this));
        }
        try {
            this.b.tryAcquire(v, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            this.e();
            return;
        }
        if(!this.d) {
            super.d(hltz.g);
        }
        else if(hxvn.a.b().a()) {
            this.b("Device located", "Find Hub located this device", "mdm.notification_location", false);
        }
        this.e();
    }

    @Override  // cqjq
    protected final void f(juo juo0) {
        juo0.y = true;
    }
}

