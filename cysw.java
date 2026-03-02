import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.nearby.fastpair.service.WearableDataListenerChimeraService;
import com.google.location.nearby.common.fastpair.ProtoWrapper;
import java.util.Iterator;
import java.util.List;

public final class cysw implements Runnable {
    public final WearableDataListenerChimeraService a;
    public final String b;
    public final cyxk c;
    public final boolean d;
    public final gmcg e;
    public final evqp f;

    public cysw(WearableDataListenerChimeraService wearableDataListenerChimeraService0, String s, cyxk cyxk0, boolean z, gmcg gmcg0, evqp evqp0) {
        this.a = wearableDataListenerChimeraService0;
        this.b = s;
        this.c = cyxk0;
        this.d = z;
        this.e = gmcg0;
        this.f = evqp0;
    }

    @Override
    public final void run() {
        Object object1;
        long v4;
        Object object0;
        ggdy ggdy2;
        ggdy ggdy1;
        ggdy ggdy0;
        bsaq bsaq0;
        List list0;
        long v2;
        cyxl cyxl0;
        WearableDataListenerChimeraService wearableDataListenerChimeraService0 = this.a;
        ((ggtj)wearableDataListenerChimeraService0.m.d().ar(0x1FFF)).B("WDLS onSwitchConnectionRequest: %s", this.b);
        long v = SystemClock.elapsedRealtime();
        ggtj ggtj0 = (ggtj)wearableDataListenerChimeraService0.m.d().ar(8170);
        cyxk cyxk0 = this.c;
        boolean z = this.d;
        ggtj0.Y("WDLS handleSwitchRequest: request type = %s, fromNode = %s, toNode = %s, isPreCallingSwitch = %s", (cygy.b(cyxk0.f) == null ? cygy.a : cygy.b(cyxk0.f)).name(), cyxk0.c, cyxk0.d, Boolean.valueOf(z));
        long v1 = SystemClock.elapsedRealtime();
        if(!z && (cygy.b(cyxk0.f) == null ? cygy.a : cygy.b(cyxk0.f)).equals(cygy.d)) {
            cyxl0 = wearableDataListenerChimeraService0.A(null);
            if(cyxl0 != null) {
                if(hvpp.aV()) {
                    ((ggtj)wearableDataListenerChimeraService0.m.d().ar(0x1FF0)).A("TrianglePerf: handleSwitchRequest, handled by pre calling response %sms", SystemClock.elapsedRealtime() - v1);
                }
                v2 = v;
                goto label_154;
            }
            goto label_15;
        }
        else {
        label_15:
            cyxl cyxl1 = cyxl.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cyxl1).v_newBuilder();
            String s = cyxk0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((cyxl)hftv0).b |= 1;
            ((cyxl)hftv0).c = s;
            String s1 = cyxk0.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s1.getClass();
            ((cyxl)hftv1).b |= 2;
            ((cyxl)hftv1).d = s1;
            cygy cygy0 = cygy.b(cyxk0.f) == null ? cygy.a : cygy.b(cyxk0.f);
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((cyxl)hftp0.b_message).f = cygy0.e;
            ((cyxl)hftp0.b_message).b |= 8;
            cyxd cyxd0 = cyxk0.e == null ? cyxd.a : cyxk0.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cyxl cyxl2 = (cyxl)hftp0.b_message;
            cyxd0.getClass();
            cyxl2.e = cyxd0;
            cyxl2.b |= 4;
            long v3 = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((cyxl)hftv2).b |= 0x40;
            ((cyxl)hftv2).i = v3;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((cyxl)hftp0.b_message).g = 0;
            ((cyxl)hftp0.b_message).b |= 16;
            cyxl cyxl3 = (cyxl)hftp0.N_build();
            gxvi gxvi0 = wearableDataListenerChimeraService0.l();
            try {
                try {
                    if(gxvi0 == null) {
                        goto label_132;
                    }
                    else {
                        list0 = ggna.a;
                        if((cygy.b(cyxk0.f) == null ? cygy.a : cygy.b(cyxk0.f)).equals(cygy.d)) {
                            cyxs cyxs0 = wearableDataListenerChimeraService0.h();
                            if(cyxs0 == null) {
                                goto label_94;
                            }
                            else {
                                bsaq0 = cumz.e(wearableDataListenerChimeraService0, "TriangleNodeUtils");
                                if(bsaq0 == null) {
                                    goto label_90;
                                }
                                else {
                                    ggdy0 = new ggdy();
                                    ggdy1 = new ggdy();
                                    ggdy2 = new ggdy();
                                    Iterator iterator0 = cyxs0.h.iterator();
                                    while(true) {
                                    label_66:
                                        if(!iterator0.hasNext()) {
                                            goto label_78;
                                        }
                                        object0 = iterator0.next();
                                        v2 = v;
                                        goto label_69;
                                    }
                                }
                            }
                            goto label_97;
                        }
                        else {
                            goto label_104;
                        }
                    }
                    goto label_154;
                }
                catch(RemoteException remoteException0) {
                    goto label_135;
                }
                catch(hfur hfur0) {
                    goto label_141;
                }
                try {
                label_69:
                    Integer integer0 = (int)4360;
                    if(((cyxd)object0).g.contains(integer0)) {
                        ggdy1.i(((cyxd)object0).c);
                    }
                    else if(((cyxd)object0).f.contains(integer0)) {
                        ggdy2.i(((cyxd)object0).c);
                    }
                    v = v2;
                    v1 = v1;
                    goto label_66;
                label_78:
                    v2 = v;
                    v4 = v1;
                    ggdy1.k(ggdy2.h());
                    gged_interceptors gged0 = ggdy1.h();
                    int v5 = ((ggna)gged0).c;
                    for(int v6 = 0; v6 < v5; ++v6) {
                        ggdy0.i(bsaq0.g(((String)gged0.get(v6))));
                    }
                    list0 = ggdy0.h();
                    goto label_97;
                }
                catch(RemoteException remoteException0) {
                    goto label_136;
                }
                catch(hfur hfur0) {
                    goto label_142;
                }
                try {
                label_90:
                    ((ggtj)cyjh.a.g().ar(8270)).x("TriangleNodeUtils: can\'t get bluetooth adapter");
                    v2 = v;
                    v4 = v1;
                    goto label_97;
                }
                catch(RemoteException remoteException0) {
                    goto label_135;
                }
                catch(hfur hfur0) {
                    goto label_141;
                }
                try {
                label_94:
                    v2 = v;
                    v4 = v1;
                    list0 = wearableDataListenerChimeraService0.m().h(1);
                }
                catch(RemoteException remoteException0) {
                    goto label_136;
                }
                catch(hfur hfur0) {
                    goto label_142;
                }
            }
            catch(Throwable throwable0) {
                goto label_147;
            }
        label_97:
            if(!list0.isEmpty()) {
                goto label_106;
            label_129:
                if(!wearableDataListenerChimeraService0.y()) {
                    wearableDataListenerChimeraService0.n().c(wearableDataListenerChimeraService0);
                    goto label_154;
                    try {
                    label_132:
                        ((ggtj)wearableDataListenerChimeraService0.m.g().ar(0x1FEF)).x("WDLS handleSwitchRequest: failed to bind deviceStatusService.");
                    }
                    catch(RemoteException remoteException0) {
                    label_135:
                        v2 = v;
                        try {
                        label_136:
                            ((ggtj)((ggtj)wearableDataListenerChimeraService0.m.g().s(remoteException0)).ar(0x1FEC)).x("WDLS handleSwitchRequest: failed to get response from discovery service.");
                        }
                        catch(Throwable throwable0) {
                            goto label_147;
                        }
                        if(!wearableDataListenerChimeraService0.y()) {
                            wearableDataListenerChimeraService0.n().c(wearableDataListenerChimeraService0);
                        }
                        goto label_153;
                    }
                    catch(hfur hfur0) {
                    label_141:
                        v2 = v;
                        try {
                        label_142:
                            ((ggtj)((ggtj)wearableDataListenerChimeraService0.m.g().s(hfur0)).ar(0x1FED)).x("WDLS handleSwitchRequest: failed to parse the response result.");
                        }
                        catch(Throwable throwable0) {
                            goto label_147;
                        }
                        if(!wearableDataListenerChimeraService0.y()) {
                            wearableDataListenerChimeraService0.n().c(wearableDataListenerChimeraService0);
                        }
                        goto label_153;
                    }
                    catch(Throwable throwable0) {
                    label_147:
                        if(!wearableDataListenerChimeraService0.y()) {
                            wearableDataListenerChimeraService0.n().c(wearableDataListenerChimeraService0);
                        }
                        throw throwable0;
                    }
                    if(!wearableDataListenerChimeraService0.y()) {
                        wearableDataListenerChimeraService0.n().c(wearableDataListenerChimeraService0);
                    }
                    v2 = v;
                label_153:
                    cyxl0 = cyxl3;
                }
            }
            else if(!wearableDataListenerChimeraService0.y()) {
                wearableDataListenerChimeraService0.n().c(wearableDataListenerChimeraService0);
                cyxl0 = cyxl3;
            }
            else {
                cyxl0 = cyxl3;
                goto label_154;
                try {
                    try {
                    label_104:
                        v2 = v;
                        v4 = v1;
                    }
                    catch(RemoteException remoteException0) {
                        goto label_135;
                    }
                    catch(hfur hfur0) {
                        goto label_141;
                    }
                    try {
                    label_106:
                        cyxl0 = (cyxl)gxvi0.i(new ProtoWrapper(((MessageLite)cyxk0)), list0, z).a(((Parser)((ProtoLiteMessage)cyxl1).jf(7, null)));
                        if(z) {
                            wearableDataListenerChimeraService0.g = cyxl0;
                        }
                        long v7 = SystemClock.elapsedRealtime();
                        Bundle bundle0 = new Bundle();
                        bundle0.putParcelable("com.google.android.gms.nearby.fastpair.service.EXTRA_SWITCH_CONNECTION_RESPONSE", new ProtoWrapper(((MessageLite)cyxl0)));
                        cysr.c(wearableDataListenerChimeraService0, "com.google.android.gms.nearby.fastpair.service.ACTION_SET_SWITCH_RESULT", bundle0);
                        long v8 = SystemClock.elapsedRealtime();
                        if(hvpp.aV()) {
                            ((ggtj)wearableDataListenerChimeraService0.m.d().ar(0x1FEE)).K("TrianglePerf: handleSwitchRequest, responseFuture.get %sms, setSwitchResult %sms", v7 - v4, v8 - v7);
                        }
                        ggtj ggtj1 = (ggtj)wearableDataListenerChimeraService0.m.d().ar(0x1FEB);
                        String s2 = cyha.a((cyha.b(cyxl0.g) == 0 ? 1 : cyha.b(cyxl0.g)));
                        if((cyxl0.b & 0x20) == 0) {
                            object1 = null;
                        }
                        else {
                            int v9 = cygw.b(cyxl0.h);
                            object1 = cygw.a((v9 == 0 ? 1 : v9));
                        }
                        ggtj1.R("WDLS handleSwitchRequest: return response with result code=%s, reject reason=%s", s2, object1);
                        goto label_129;
                    }
                    catch(RemoteException remoteException0) {
                        goto label_136;
                    }
                    catch(hfur hfur0) {
                        goto label_142;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_147;
                }
            }
        }
    label_154:
        long v10 = SystemClock.elapsedRealtime();
        if(!(cygy.b(cyxk0.f) == null ? cygy.a : cygy.b(cyxk0.f)).equals(cygy.d)) {
            gmcg gmcg0 = this.e;
            if(!gmcg0.isShutdown()) {
                gmcg0.execute(new cytd(wearableDataListenerChimeraService0, cyxl0));
            }
        }
        byte[] arr_b = cyxl0.toBytesArray();
        this.f.c(arr_b);
        if(hvpp.aV()) {
            ((ggtj)wearableDataListenerChimeraService0.m.d().ar(0x2000)).A("TrianglePerf, onSwitchConnectionRequest, handleSwitchRequest: %sms", v10 - v2);
        }
    }
}

