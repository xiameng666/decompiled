import java.io.IOException;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import jeb.synthetic.FIN;

public final class gpsk implements Runnable {
    public final gpsm a;

    public gpsk(gpsm gpsm0) {
        this.a = gpsm0;
    }

    @Override
    public final void run() {
        Queue queue1;
        boolean z;
        int v2;
        Queue queue0;
        ArrayList arrayList0 = new ArrayList();
        new ArrayList();
        gpsm gpsm0 = this.a;
        while(!gpsm0.k) {
            try {
                arrayList0.clear();
                __monitor_enter(gpsm0.a);
                try {
                    arrayList0.addAll(gpsm0.a);
                    gpsm0.a.clear();
                }
                finally {
                    __monitor_exit(gpsm0.a);
                }
                gpsi gpsi0 = gpsm0.m;
                if(gpsi0 == null) {
                label_41:
                    queue0 = gpsm0.a;
                    __monitor_enter(queue0);
                    v2 = FIN.finallyOpen$NT();
                    z = false;
                    queue1 = gpsm0.b;
                    __monitor_enter(queue1);
                }
                else {
                    Iterator iterator0 = arrayList0.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_19;
                        }
                        Object object0 = iterator0.next();
                        DatagramPacket datagramPacket0 = (DatagramPacket)object0;
                        if(gpsm0.k) {
                        label_19:
                            arrayList0.clear();
                            goto label_41;
                        }
                        try {
                            gpqn.d(gpsm0.q, String.format("Sending a %s mDNS packet...", "multicast"));
                            for(Object object1: gpsi0.c.b()) {
                                gpsi0.d.setNetworkInterface(((gpss)object1).a);
                                gpsi0.d.send(datagramPacket0);
                            }
                            Object object2 = gpsm0.f;
                            __monitor_enter(object2);
                            int v1 = FIN.finallyOpen$NT();
                            if(gpsi0 == gpsm0.m && gpsm0.g.get()) {
                                FIN.finallyCodeBegin$NT(v1);
                                goto label_41;
                            }
                            else {
                                FIN.finallyExec$NT(v1);
                                continue;
                            }
                            break;
                        }
                        catch(IOException iOException0) {
                            gpqn.b(gpsm0.q, String.format("Failed to send a %s mDNS packet.", "multicast"), iOException0);
                        }
                    }
                }
                if(queue0.isEmpty() && queue1.isEmpty()) {
                    z = true;
                }
                __monitor_exit(queue1);
                FIN.finallyCodeBegin$NT(v2);
                __monitor_exit(queue0);
                FIN.finallyCodeEnd$NT(v2);
                if(!z) {
                    continue;
                }
                Thread.sleep(20000L);
                continue;
            }
            catch(InterruptedException unused_ex) {
                continue;
            }
            catch(Throwable throwable0) {
            }
            gpqn.d(gpsm0.q, "Send thread stopped.");
            try {
                gpsi gpsi1 = gpsm0.m;
                if(gpsi1 != null) {
                    gpsi1.c();
                }
            }
            catch(Exception exception0) {
                gpqn.b(gpsm0.q, "Failed to leave the group.", exception0);
            }
            gpsi gpsi2 = gpsm0.m;
            if(gpsi2 != null) {
                try {
                    gpsi2.b();
                }
                catch(RuntimeException runtimeException0) {
                    gpqn.b(gpsm0.q, "Failed to close the mdns socket.", runtimeException0);
                }
            }
            throw throwable0;
        }
        gpqn.d(gpsm0.q, "Send thread stopped.");
        try {
            gpsi gpsi3 = gpsm0.m;
            if(gpsi3 != null) {
                gpsi3.c();
            }
        }
        catch(Exception exception1) {
            gpqn.b(gpsm0.q, "Failed to leave the group.", exception1);
        }
        try {
            gpsi gpsi4 = gpsm0.m;
            if(gpsi4 != null) {
                gpsi4.b();
            }
        }
        catch(RuntimeException runtimeException1) {
            gpqn.b(gpsm0.q, "Failed to close the mdns socket.", runtimeException1);
        }
    }
}

