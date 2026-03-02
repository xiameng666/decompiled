package com.google.android.gms.auth.aang.impl.deviceaccount;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import adcc;
import adce;
import adci;
import adga;
import adri;
import aktc;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import bblp;
import bboh;
import cljp;
import clkn;
import clko;
import com.google.android.chimera.BroadcastReceiver;
import ggtj;
import ghri;
import ghrp;
import gmap;
import gmbu;
import hoyp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;

public class DeviceAccountDeletionChimeraReceiver extends BroadcastReceiver {
    public static final int b;
    private static final bboh c;

    static {
        DeviceAccountDeletionChimeraReceiver.c = adga.a("DeviceAccountDeletionChimeraReceiver");
    }

    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        Map map0;
        if(!adci.g()) {
            Process.myUserHandle().getIdentifier();
            return;
        }
        String s = intent0.getAction();
        if(s == null) {
            ((ggtj)DeviceAccountDeletionChimeraReceiver.c.j()).x("Action is null.");
            return;
        }
        switch(s) {
            case "android.intent.action.MASTER_CLEAR_NOTIFICATION": {
                aktc aktc0 = new aktc(context0);
                BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
                try {
                    adci adci0 = (adci)adci.a.b();
                    try {
                        map0 = adci0.d();
                    }
                    catch(IOException iOException1) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghrp.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((ghrp)hftp0.b_message).c = 5;
                        ((ghrp)hftp0.b_message).b |= 1;
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghri.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        ((ghri)hftv0).c = 3;
                        ((ghri)hftv0).b |= 1;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((ghri)hftp1.b_message).d = 1;
                        ((ghri)hftp1.b_message).b |= 2;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ghrp ghrp0 = (ghrp)hftp0.b_message;
                        ghri ghri0 = (ghri)hftp1.N_build();
                        ghri0.getClass();
                        ghrp0.h = ghri0;
                        ghrp0.b |= 0x20;
                        adga.B(hftp0, iOException1);
                        throw iOException1;
                    }
                    ((ggtj)adci.b.h()).z("Deleting %d device accounts", map0.size());
                    bblp bblp0 = new bblp(0x7FFFFFFF, 9);
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: map0.entrySet()) {
                        int v = (int)(((Integer)((Map.Entry)object0).getKey()));
                        arrayList0.add(bblp0.e(new adce(adci0, aktc0, ((adri)((Map.Entry)object0).getValue()), v)));
                    }
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghrp.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((ghrp)hftp2.b_message).c = 5;
                    ((ghrp)hftp2.b_message).b |= 1;
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ghri.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp3.b_message;
                    ((ghri)hftv1).c = 3;
                    ((ghri)hftv1).b |= 1;
                    if(!hftv1.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((ghri)hftp3.b_message).d = 2;
                    ((ghri)hftp3.b_message).b |= 2;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ghrp ghrp1 = (ghrp)hftp2.b_message;
                    ghri ghri1 = (ghri)hftp3.N_build();
                    ghri1.getClass();
                    ghrp1.h = ghri1;
                    ghrp1.b |= 0x20;
                    adga.h(((ghrp)hftp2.N_build()));
                    gmbu.a(arrayList0).a(new adcc(aktc0, broadcastReceiver$PendingResult0), gmap.a);
                }
                catch(IOException iOException0) {
                    a.ae(DeviceAccountDeletionChimeraReceiver.c.j(), "Failed to get device account deletion data.", iOException0);
                }
                return;
            }
            case "android.intent.action.USER_REMOVED": {
                DeviceAccountDeletionTaskService.g(context0, DeviceAccountDeletionTaskService.d(intent0.getExtras()));
                return;
            }
            case "com.google.android.gms.auth.ACTION_DELETE_DEVICE_ACCOUNT": {
                if(!hoyp.e()) {
                    ((ggtj)DeviceAccountDeletionChimeraReceiver.c.h()).x("Received ACTION_DELETE_DEVICE_ACCOUNT but feature not enabled");
                    return;
                }
                DeviceAccountDeletionTaskService.g(context0, DeviceAccountDeletionTaskService.d(intent0.getExtras()));
                return;
            }
            case "com.google.android.gms.auth.STORE_DEVICE_ACCOUNT_DELETION_DATA": {
                Bundle bundle0 = intent0.getExtras();
                clkn clkn0 = new clkn();
                clkn0.t(DeviceAccountDeletionTaskService.e("TASK_STORE_DEVICE_ACCOUNT_DELETION_DATA", DeviceAccountDeletionTaskService.d(bundle0)));
                clkn0.e(hoyp.c(), hoyp.b());
                clkn0.p = true;
                clkn0.u = bundle0;
                clkn0.v(2);
                clkn0.w(DeviceAccountDeletionTaskService.class.getName());
                clko clko0 = clkn0.a();
                cljp.a(context0).f(clko0);
                return;
            }
            default: {
                ((ggtj)DeviceAccountDeletionChimeraReceiver.c.j()).B("Unknown action=%s", s);
            }
        }
    }
}

