import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.google.android.gms.home.stub.HubAdvertisingChimeraService;
import com.google.android.gms.home.stub.HubInfo;
import java.net.ServerSocket;
import jeb.synthetic.FIN;

public final class bwik implements ibts {
    public final HubAdvertisingChimeraService a;
    public final HubInfo b;

    public bwik(HubAdvertisingChimeraService hubAdvertisingChimeraService0, HubInfo hubInfo0) {
        this.a = hubAdvertisingChimeraService0;
        this.b = hubInfo0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v = (int)(((Integer)object0));
        HubAdvertisingChimeraService hubAdvertisingChimeraService0 = this.a;
        hubAdvertisingChimeraService0.f = null;
        switch(v) {
            case 0: {
                ((ggtj)HubAdvertisingChimeraService.a.h()).x("Prior advertisements cancelled - ready to restart advertisements");
                break;
            }
            case 2: {
                ((ggtj)HubAdvertisingChimeraService.a.h()).x("Ready to start Hub advertisements");
                break;
            }
            default: {
                ((ggtj)HubAdvertisingChimeraService.a.j()).z("Internal error cancelling prior advertisements (%d)", v);
                hubAdvertisingChimeraService0.a();
                return ibom.a;
            }
        }
        int v1 = 1;
        Object object1 = hubAdvertisingChimeraService0.b;
        __monitor_enter(object1);
        int v2 = FIN.finallyOpen$NT();
        if(hubAdvertisingChimeraService0.c) {
            ((ggtj)HubAdvertisingChimeraService.a.h()).x("Ignored attempt to start Hub advertisements when already advertising");
            FIN.finallyExec$NT(v2);
        }
        else {
            hubAdvertisingChimeraService0.c = true;
            if(hubAdvertisingChimeraService0.e == null) {
                hubAdvertisingChimeraService0.e = new ServerSocket(0);
            }
            FIN.finallyCodeBegin$NT(v2);
            ServerSocket serverSocket0 = hubAdvertisingChimeraService0.e;
            if(serverSocket0 != null && serverSocket0.getLocalPort() != 0) {
                HubInfo hubInfo0 = this.b;
                NsdServiceInfo nsdServiceInfo0 = new NsdServiceInfo();
                nsdServiceInfo0.setServiceName(hubAdvertisingChimeraService0.g);
                nsdServiceInfo0.setServiceType("_ghp._tcp");
                nsdServiceInfo0.setAttribute("rs", String.valueOf(bwio.a(hubInfo0.c)));
                nsdServiceInfo0.setAttribute("p", hubInfo0.d);
                nsdServiceInfo0.setAttribute("fn", hubInfo0.e);
                String s = hubInfo0.b;
                if(s != null) {
                    nsdServiceInfo0.setAttribute("pid", s);
                }
                String s1 = hubInfo0.a;
                if(s1 != null) {
                    nsdServiceInfo0.setAttribute("id", s1);
                }
                nsdServiceInfo0.setPort(serverSocket0.getLocalPort());
                ((ggtj)HubAdvertisingChimeraService.a.h()).B("Attempting to start advertisements for %s", nsdServiceInfo0);
                NsdManager nsdManager0 = hubAdvertisingChimeraService0.d;
                if(nsdManager0 != null) {
                    nsdManager0.registerService(nsdServiceInfo0, 1, hubAdvertisingChimeraService0.h);
                }
                v1 = 0;
            }
            else {
                ((ggtj)HubAdvertisingChimeraService.a.j()).x("Could not obtain advertising socket");
                __monitor_enter(hubAdvertisingChimeraService0.b);
                hubAdvertisingChimeraService0.c = false;
                __monitor_exit(hubAdvertisingChimeraService0.b);
                v1 = -1;
            }
        }
        if(v1 != 0) {
            ((ggtj)HubAdvertisingChimeraService.a.j()).z("Hub advertisements failed to start (%d)", v1);
            hubAdvertisingChimeraService0.a();
            return ibom.a;
        }
        return ibom.a;
    }
}

