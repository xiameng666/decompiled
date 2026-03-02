package com.google.android.gms.mobiledataplan.service.background;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import crxn;
import cryj;
import cryq;
import cslm;
import giyd;
import giyl;
import gizg;
import hfyp;
import hhct;
import hvje;
import java.util.logging.Level;

public class BackgroundCellularNetworkMonitor.1 extends NetworkCallbackWrapper {
    final Context a;

    public BackgroundCellularNetworkMonitor.1(Context context0) {
        this.a = context0;
        super("mobiledataplan", "BackgroundCellularNetworkMonitorNetworkCallback");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network0) {
        Level level0 = cslm.h();
        cryj.a.g(level0).R("%s: available: %s", "CellularMonitor", network0);
        if(cryj.b()) {
            crxn crxn0 = crxn.c();
            gizg gizg0 = crxn0.D(20, "GTAF_Server", "MDP_PeriodicService");
            int v = 5;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gizg0));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giyl giyl0 = (giyl)hftp1.b_message;
            giyl0.c = hfyp.b(6);
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyd.a).v_newBuilder();
            if(!hvje.h()) {
                v = 4;
            }
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((giyd)hftp2.b_message).b = v - 2;
            giyd giyd0 = (giyd)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giyl giyl1 = (giyl)hftp1.b_message;
            giyd0.getClass();
            giyl1.g = giyd0;
            giyl1.b |= 4;
            giyl giyl2 = (giyl)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp0.b_message;
            giyl2.getClass();
            gizg1.v = giyl2;
            gizg1.b |= 0x800;
            crxn0.d(((gizg)hftp0.N_build()), hhct.bK);
            cryq.a().b();
        }
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network0) {
        Level level0 = cslm.h();
        cryj.a.g(level0).R("%s: lost: %s", "CellularMonitor", network0);
        if(cryj.b()) {
            crxn crxn0 = crxn.c();
            gizg gizg0 = crxn0.D(20, "GTAF_Server", "MDP_PeriodicService");
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gizg0));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyd.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((giyd)hftp2.b_message).b = 4;
            giyd giyd0 = (giyd)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giyl giyl0 = (giyl)hftp1.b_message;
            giyd0.getClass();
            giyl0.g = giyd0;
            giyl0.b |= 4;
            giyl giyl1 = (giyl)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp0.b_message;
            giyl1.getClass();
            gizg1.v = giyl1;
            gizg1.b |= 0x800;
            crxn0.d(((gizg)hftp0.N_build()), hhct.bJ);
            cryq.a().b();
        }
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void d() {
        Level level0 = cslm.h();
        cryj.a.g(level0).B("%s: unavailable: re-register.", "CellularMonitor");
        if(hvje.h()) {
            cryj.a(this.a);
        }
    }
}

