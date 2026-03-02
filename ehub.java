import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubClientCallback;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppMessage;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import j..time.Duration;
import j..util.Collection.-EL;
import j..util.Comparator.-CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import jeb.synthetic.FIN;

public final class ehub extends ContextHubClientCallback {
    public final Executor a;
    public CountDownLatch b;
    public ContextHubClient c;
    boolean d;
    ehud e;
    private static ehub f;

    private ehub() {
        this.d = false;
        this.a = new bblp(1, 10);
    }

    public static ehub a() {
        synchronized(ehub.class) {
            if(ehub.f == null) {
                ehub.f = new ehub();
            }
        }
        return ehub.f;
    }

    public final void b() {
        synchronized(this) {
            if(this.d) {
                this.d = false;
                ContextHubClient contextHubClient0 = this.c;
                if(contextHubClient0 != null) {
                    contextHubClient0.close();
                    this.c = null;
                }
            }
        }
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d(gxbf gxbf0) {
        boolean z;
        synchronized(this) {
            if(!this.d) {
                ((ggtj)eicd.a.i()).B("[%s] must call init() first before updating filters.", "ChreCommunication");
                return false;
            }
            z = this.e(NanoAppMessage.createMessageToNanoApp(0x476F6F676C001031L, 6, gxbf0.toBytesArray()));
            if(!z) {
                ((ggtj)eicd.a.i()).P("[%s] Failed to send extended config request %s, NanoApp not started.", "ChreCommunication", gxbf0.e);
            }
        }
        return z;
    }

    public final boolean e(NanoAppMessage nanoAppMessage0) {
        String s;
        synchronized(this) {
            ContextHubClient contextHubClient0 = this.c;
            if(contextHubClient0 == null) {
                ((ggtj)eicd.a.j()).B("[%s] Error sending message to nanoapp, contextHubClient is null", "ChreCommunication");
                return false;
            }
            int v1 = contextHubClient0.sendMessageToNanoApp(nanoAppMessage0);
            if(v1 != 0) {
                ggtj ggtj0 = (ggtj)eicd.a.j();
                switch(v1) {
                    case 0: {
                        s = "RESULT_SUCCESS";
                        break;
                    }
                    case 1: {
                        s = "RESULT_FAILED_UNKNOWN";
                        break;
                    }
                    case 2: {
                        s = "RESULT_FAILED_BAD_PARAMS";
                        break;
                    }
                    case 3: {
                        s = "RESULT_FAILED_UNINITIALIZED";
                        break;
                    }
                    case 4: {
                        s = "RESULT_FAILED_BUSY";
                        break;
                    }
                    case 5: {
                        s = "RESULT_FAILED_AT_HUB";
                        break;
                    }
                    case 6: {
                        s = "RESULT_FAILED_TIMEOUT";
                        break;
                    }
                    case 7: {
                        s = "RESULT_FAILED_SERVICE_INTERNAL_FAILURE";
                        break;
                    }
                    case 8: {
                        s = "RESULT_FAILED_HAL_UNAVAILABLE";
                        break;
                    }
                    default: {
                        s = String.format(Locale.getDefault(), "UNKNOWN_RESULT value=%d", v1);
                    }
                }
                ggtj0.R("[%s] Error sending message to nanoapp: %s", "ChreCommunication", s);
                return false;
            }
        }
        return true;
    }

    final void f(int v) {
        switch(v - 1) {
            case 0: {
                ehud ehud1 = this.e;
                if(ehud1 != null) {
                    ehud1.c(1);
                }
                return;
            }
            case 1: {
                ehud ehud2 = this.e;
                if(ehud2 != null) {
                    ehud2.c(2);
                }
                this.b();
                return;
            }
            default: {
                this.b();
                ehud ehud0 = this.e;
                if(ehud0 != null) {
                    ehud0.c(3);
                }
            }
        }
    }

    public final void g(ehud ehud0) {
        Throwable throwable2;
        ehub ehub0;
        ContextHubTransaction contextHubTransaction0;
        ContextHubInfo contextHubInfo0;
        ArrayList arrayList0;
        ContextHubManager contextHubManager0;
        __monitor_enter(this);
        try {
            this.e = ehud0;
            contextHubManager0 = (ContextHubManager)AppContextProvider.a().getSystemService(ContextHubManager.class);
            if(contextHubManager0 == null) {
                goto label_4;
            }
            goto label_8;
        }
        catch(Throwable throwable0) {
            ehub0 = this;
            throwable2 = throwable0;
            goto label_38;
        }
        try {
        label_4:
            ((ggtj)eicd.a.j()).B("[%s] ContexHub not available on this device", "ChreCommunication");
            this.f(2);
        }
        catch(Throwable throwable1) {
            goto label_36;
        }
        __monitor_exit(this);
        return;
    label_8:
        if(this.d) {
            try {
                if(this.c()) {
                    this.f(1);
                    goto label_11;
                }
                goto label_13;
            }
            catch(Throwable throwable1) {
                goto label_36;
            }
        label_11:
            __monitor_exit(this);
            return;
        }
        try {
        label_13:
            this.d = true;
            List list0 = contextHubManager0.getContextHubs();
            arrayList0 = new ArrayList(list0);
            if(!arrayList0.isEmpty()) {
                Iterator iterator0 = list0.iterator();
                while(true) {
                label_18:
                    if(!iterator0.hasNext()) {
                        goto label_30;
                    }
                    Object object0 = iterator0.next();
                    contextHubInfo0 = (ContextHubInfo)object0;
                    contextHubTransaction0 = contextHubManager0.queryNanoApps(contextHubInfo0);
                    ehub0 = this;
                    goto label_27;
                }
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
            ehub0 = this;
            throwable2 = throwable0;
            goto label_38;
        }
        try {
        label_27:
            contextHubTransaction0.setOnCompleteListener(new ehua(ehub0, contextHubInfo0, arrayList0, ((long)0x476F6F676C001031L), contextHubManager0), ehub0.a);
            this = ehub0;
            goto label_18;
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            goto label_38;
        }
    label_30:
        __monitor_exit(this);
        return;
        try {
        label_32:
            ((ggtj)eicd.a.j()).B("[%s] No contexthubs available on this device", "ChreCommunication");
            this.f(2);
        }
        catch(Throwable throwable1) {
        label_36:
            throwable2 = throwable1;
            ehub0 = this;
            while(true) {
                try {
                label_38:
                    __monitor_exit(ehub0);
                    throw throwable2;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            throwable2 = throwable0;
            goto label_38;
        }
        __monitor_exit(this);
    }

    public final void onHubReset(ContextHubClient contextHubClient0) {
        synchronized(this) {
            if(!this.d) {
                return;
            }
            this.f(3);
        }
    }

    public final void onMessageFromNanoApp(ContextHubClient contextHubClient0, NanoAppMessage nanoAppMessage0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(nanoAppMessage0.getMessageType()) {
            case 7: {
                try {
                    ehud ehud0 = this.e;
                    if(ehud0 != null) {
                        byte[] arr_b = nanoAppMessage0.getMessageBody();
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gxbg.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        int v2 = ((gxbg)hftv0).b;
                        switch(v2) {
                            case 1: {
                                if(((gxbg)hftv0).c != 0) {
                                    ((ggtj)eicd.a.j()).B("[%s] received tracker filter config response with FAILURE", "ChreScanner");
                                    FIN.finallyExec$NT(v);
                                    return;
                                }
                                break;
                            }
                            case 2: {
                                if(((gxbg)hftv0).c != 0) {
                                    ((ggtj)eicd.a.j()).B("[%s] received flush tracker reports response with FAILURE", "ChreScanner");
                                    FIN.finallyExec$NT(v);
                                    return;
                                }
                                bboh bboh0 = eicd.a;
                                ((ggtj)bboh0.h()).B("[%s] Completed flushing CHRE reports", "ChreScanner");
                                ehuc ehuc0 = ehud0.c;
                                eica.b(((eifs)ehuc0).u, "BLS-FL");
                                if(((eifs)ehuc0).i == null) {
                                    ((ggtj)bboh0.j()).x("ChreScanner is null. Cannot process CHRE reports.");
                                    FIN.finallyExec$NT(v);
                                    return;
                                }
                                if(!hrtd.W()) {
                                    ((ggtj)bboh0.j()).x("CHRE offload is disabled. Cannot process CHRE reports.");
                                    ((eifs)ehuc0).n();
                                    FIN.finallyExec$NT(v);
                                    return;
                                }
                                List list0 = ((eifs)ehuc0).t;
                                if(!list0.isEmpty()) {
                                    goto label_45;
                                }
                                if(((eifs)ehuc0).k) {
                                    ((eifs)ehuc0).n();
                                    FIN.finallyExec$NT(v);
                                    return;
                                label_45:
                                    gged_interceptors gged0 = (gged_interceptors)Collection.-EL.stream(list0).map(new eifo(((eifs)ehuc0))).flatMap(new eifp()).sorted(Comparator.-CC.comparing(new eifq())).collect(ggaf.a);
                                    HashSet hashSet0 = new HashSet();
                                    int v3 = gged0.size();
                                    for(int v1 = 0; v1 < v3; ++v1) {
                                        eigo eigo0 = (eigo)gged0.get(v1);
                                        hashSet0.add(eigo0.b.c);
                                        Duration.ofMillis(eigo0.c.f - eigo0.b.f).toMinutes();
                                        ((eifs)ehuc0).b.b(eigo0.b, eigo0.c, eigo0.a);
                                    }
                                    list0.clear();
                                    ((eifs)ehuc0).b.a(gwgu.b);
                                    if(((eifs)ehuc0).k) {
                                        ((eifs)ehuc0).n();
                                    }
                                    eicb eicb0 = ((eifs)ehuc0).h;
                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwnl.a).v_newBuilder();
                                    int v4 = hashSet0.size();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    gwnl gwnl0 = (gwnl)hftp0.b_message;
                                    gwnl0.b |= 1;
                                    gwnl0.c = v4;
                                    long v5 = 0L;
                                    if(((eifs)ehuc0).p > 0L) {
                                        eifs eifs0 = (eifs)ehuc0;
                                        v5 = System.currentTimeMillis() - ((eifs)ehuc0).p;
                                    }
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    gwnl gwnl1 = (gwnl)hftp0.b_message;
                                    gwnl1.b |= 2;
                                    gwnl1.d = v5;
                                    gwnl gwnl2 = (gwnl)hftp0.N_build();
                                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    gwik gwik0 = (gwik)hftp1.b_message;
                                    gwnl2.getClass();
                                    gwik0.aa = gwnl2;
                                    gwik0.c |= 0x20000;
                                    eicb0.o(((gwik)hftp1.N_build()), 51);
                                    eifs eifs1 = (eifs)ehuc0;
                                    ((eifs)ehuc0).p = System.currentTimeMillis();
                                    goto label_87;
                                }
                                break;
                            }
                            default: {
                                ((ggtj)eicd.a.j()).P("[%s] received unknown request id: %s", "ChreScanner", v2);
                                FIN.finallyExec$NT(v);
                                return;
                            }
                        }
                    }
                    break;
                }
                catch(hfur hfur0) {
                    goto label_122;
                }
            label_87:
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            case 8: {
                try {
                    ehud ehud1 = this.e;
                    if(ehud1 != null) {
                        byte[] arr_b1 = nanoAppMessage0.getMessageBody();
                        hftc hftc1 = hftc.a();
                        ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gxbk.a), arr_b1, 0, arr_b1.length, hftc1);
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        gxax gxax0 = ((gxbk)hftv1).b;
                        if(gxax0 == null) {
                            gxax0 = gxax.a;
                        }
                        String s = ehuf.a(gxax0);
                        ((ggtj)eicd.a.h()).X("[%s] Received tracker report for mac \'%s\' with %s records", "ChreScanner", (s == null ? "ERROR" : eice.c(s)), Integer.valueOf(((gxbk)hftv1).c.size()));
                        ehuc ehuc1 = ehud1.c;
                        if(hrtd.W()) {
                            ((eifs)ehuc1).t.add(((gxbk)hftv1));
                            FIN.finallyExec$NT(v);
                            return;
                        }
                    }
                    break;
                }
                catch(hfur hfur1) {
                    ((ggtj)((ggtj)eicd.a.i()).s(hfur1)).R("[%s] Failed to decode tracker report: %s", "ChreCommunication", hfur1.getMessage());
                    FIN.finallyExec$NT(v);
                    return;
                }
            }
            case 9: {
                ehud ehud2 = this.e;
                if(ehud2 != null) {
                    bboh bboh1 = eicd.a;
                    ((ggtj)bboh1.h()).B("[%s] received report storage full event", "ChreScanner");
                    if(!ehud2.d(4)) {
                        ((ggtj)bboh1.i()).B("[%s] Failed to flush CHRE reports", "ChreScanner");
                        FIN.finallyExec$NT(v);
                        return;
                    }
                }
                break;
            }
            default: {
                ((ggtj)eicd.a.i()).P("[%s] received unknown message type %d from NanoApp.", "ChreCommunication", nanoAppMessage0.getMessageType());
                FIN.finallyExec$NT(v);
                return;
            }
        }
        try {
            FIN.finallyExec$NT(v);
        }
        catch(hfur hfur0) {
        label_122:
            ((ggtj)((ggtj)eicd.a.i()).s(hfur0)).R("[%s] Failed to decode extended config response: %s", "ChreCommunication", hfur0.getMessage());
            FIN.finallyExec$NT(v);
        }
    }

    public final void onNanoAppLoaded(ContextHubClient contextHubClient0, long v) {
        synchronized(this) {
            if(this.d && v == 0x476F6F676C001031L) {
                this.f(3);
            }
        }
    }
}

