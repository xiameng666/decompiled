package com.google.android.gms.magictether.host;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.app.Notification;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.SoftApConfiguration;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import cjok;
import clht;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import cpbr;
import cpbs;
import cpcg;
import cpcj;
import cpck;
import cpda;
import cpdg;
import cpdh;
import cpdl;
import cpfr;
import cpfs;
import cpga;
import cpgt;
import cphn;
import cpho;
import cpht;
import gfta;
import ggtj;
import hvbk;
import hvbr;
import kaj;

public class ConnectTetheringResponder.TetheringResultReceiver extends ResultReceiver {
    public boolean a;
    private final Context b;
    private final cpcj c;
    private final cpgt d;
    private final cpfs e;
    private final cphn f;
    private final cpho g;

    public ConnectTetheringResponder.TetheringResultReceiver(Context context0, cpcj cpcj0, cpgt cpgt0, cpfs cpfs0, cphn cphn0) {
        super(new clht());
        this.a = false;
        this.b = context0;
        this.c = cpcj0;
        this.d = cpgt0;
        this.e = cpfs0;
        this.f = cphn0;
        this.g = new cpho(cphn0);
    }

    private static final void a() {
        try {
            Context context0 = AppContextProvider.a();
            Intent intent0 = new Intent().setClassName(context0, "com.google.android.gms.magictether.host.ProvisioningFailedDialogActivity").setFlags(0x10000000);
            intent0.putExtra("dialog_content_title", "Couldn\'t provide Wi-Fi connection");
            intent0.putExtra("dialog_content_message", "Your carrier may have disabled tethering.");
            cjok.a(context0, 0, intent0, 0xA000000).send();
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            a.ae(cpck.a.j(), "Failed to show \"provisioning failed\" dialog.", pendingIntent$CanceledException0);
        }
    }

    @Override  // android.os.ResultReceiver
    protected final void onReceiveResult(int v, Bundle bundle0) {
        String s5;
        if(v == 0) {
            new cpbs(this.b, null).e("com.google.android.gms.magictether.HAS_FINISHED_FIRST_TIME_SETUP", true);
            v = 0;
        }
        if(this.a) {
            new cpdg(this.b).c();
            this.g.a();
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cpfr.a).v_newBuilder();
        cpfs cpfs0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cpfr cpfr0 = (cpfr)hftp0.b_message;
        cpfs0.getClass();
        cpfr0.f = cpfs0;
        cpfr0.b |= 8;
        if(cpbr.c(hvbr.k())) {
            Context context0 = AppContextProvider.a();
            cpga cpga0 = cpdh.a(context0, new cphn(context0), ((TelephonyManager)context0.getSystemService("phone")), ((WifiManager)context0.getApplicationContext().getSystemService("wifi")));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cpfr cpfr1 = (cpfr)hftp0.b_message;
            cpga0.getClass();
            cpfr1.g = cpga0;
            cpfr1.b |= 16;
        }
        Context context1 = AppContextProvider.a();
        if(v == 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((cpfr)hftp0.b_message).c = 1;
            ((cpfr)hftp0.b_message).b |= 1;
            if(cpbr.c(hvbk.j())) {
                SoftApConfiguration softApConfiguration0 = ((WifiManager)this.b.getApplicationContext().getSystemService("wifi")).getSoftApConfiguration();
                String s = softApConfiguration0.getSsid();
                String s1 = softApConfiguration0.getPassphrase();
                if(s == null || s1 == null && !hvbr.r()) {
                    goto label_47;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((cpfr)hftv0).b |= 2;
                ((cpfr)hftv0).d = s;
                if(s1 != null) {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    cpfr cpfr2 = (cpfr)hftp0.b_message;
                    cpfr2.b |= 4;
                    cpfr2.e = s1;
                    goto label_79;
                label_47:
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((cpfr)hftp0.b_message).c = 9;
                    ((cpfr)hftp0.b_message).b |= 1;
                    cpfr cpfr3 = (cpfr)hftp0.N_build();
                    this.c.a(cpfr3);
                    return;
                }
            }
            else {
                WifiConfiguration wifiConfiguration0 = this.f.b();
                if(cpbr.c(hvbk.j()) && (wifiConfiguration0 == null || TextUtils.isEmpty(wifiConfiguration0.preSharedKey) && !wifiConfiguration0.allowedKeyManagement.get(0))) {
                    ((ggtj)cpck.a.i()).x("getWifiApConfiguration returned null or no password for PSK network.");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((cpfr)hftp0.b_message).c = 10;
                    ((cpfr)hftp0.b_message).b |= 1;
                    cpfr cpfr4 = (cpfr)hftp0.N_build();
                    this.c.a(cpfr4);
                    return;
                }
                String s2 = wifiConfiguration0.SSID;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                cpfr cpfr5 = (cpfr)hftp0.b_message;
                s2.getClass();
                cpfr5.b |= 2;
                cpfr5.d = s2;
                if(wifiConfiguration0.preSharedKey != null) {
                    String s3 = wifiConfiguration0.preSharedKey;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    cpfr cpfr6 = (cpfr)hftp0.b_message;
                    s3.getClass();
                    cpfr6.b |= 4;
                    cpfr6.e = s3;
                }
            }
        label_79:
            if(cpbr.c(hvbr.k())) {
                cpcg.e(this.d);
                cpda.b();
            }
            else {
                cpcg.d(this.d.a());
                cpht.d().g(ApDisablingIntentOperation.a(AppContextProvider.a()));
            }
            cpdl.a(true, context1);
        }
        else {
            if(v == 1) {
                cpdl.a(false, context1);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((cpfr)hftp0.b_message).c = 2;
            }
            else if(v == 2) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((cpfr)hftp0.b_message).c = 6;
            }
            else if(v == 3) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((cpfr)hftp0.b_message).c = 7;
            }
            else {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((cpfr)hftp0.b_message).c = 0;
            }
            ((cpfr)hftp0.b_message).b |= 1;
            if(hvbr.a.f().Q()) {
                cpht cpht0 = cpht.d();
                String s4 = cpfs0.d;
                if(gfta.c(s4)) {
                    s5 = "Your carrier plan may not allow this connection";
                }
                else {
                    Object[] arr_object = {kaj.a().c(s4)};
                    s5 = cpht0.b.getString(0x7F1517E7, arr_object);  // string:magictether_host_hotspot_error_message_carrier_block "Your %s plan may not 
                                                                     // allow this connection"
                }
                Notification notification0 = cpht0.c(cpht0.a(), "Hotspot is not available", s5).a();
                cpht0.m(cpht0.c, notification0, 9);
            }
            else {
                ConnectTetheringResponder.TetheringResultReceiver.a();
            }
            this.g.a();
        }
        cpfr cpfr7 = (cpfr)hftp0.N_build();
        this.c.a(cpfr7);
    }
}

