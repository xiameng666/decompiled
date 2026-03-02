import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import com.google.android.gms.home.stub.HubAdvertisingChimeraService;
import java.net.ServerSocket;

public final class bwil implements NsdManager.RegistrationListener {
    final HubAdvertisingChimeraService a;

    public bwil(HubAdvertisingChimeraService hubAdvertisingChimeraService0) {
        this.a = hubAdvertisingChimeraService0;
        super();
    }

    public final void a(int v) {
        HubAdvertisingChimeraService hubAdvertisingChimeraService0 = this.a;
        ServerSocket serverSocket0 = hubAdvertisingChimeraService0.e;
        if(serverSocket0 != null) {
            serverSocket0.close();
        }
        synchronized(hubAdvertisingChimeraService0.b) {
            hubAdvertisingChimeraService0.e = null;
            hubAdvertisingChimeraService0.c = false;
        }
        ibts ibts0 = this.a.f;
        if(ibts0 != null) {
            ibts0.a(Integer.valueOf(v));
        }
    }

    @Override  // android.net.nsd.NsdManager$RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo0, int v) {
        ibuq.f(nsdServiceInfo0, "serviceInfo");
        ((ggtj)HubAdvertisingChimeraService.a.h()).z("Hub advertisements failed to start (%d)", v);
        this.a(v);
        this.a.a();
    }

    @Override  // android.net.nsd.NsdManager$RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo0) {
        ibuq.f(nsdServiceInfo0, "serviceInfo");
        nsdServiceInfo0.getServiceName();
        ((ggtj)HubAdvertisingChimeraService.a.h()).x("Hub advertisements RUNNING");
    }

    @Override  // android.net.nsd.NsdManager$RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo0) {
        ibuq.f(nsdServiceInfo0, "serviceInfo");
        nsdServiceInfo0.getServiceName();
        ((ggtj)HubAdvertisingChimeraService.a.h()).x("Hub advertisements STOPPED");
        this.a(0);
    }

    @Override  // android.net.nsd.NsdManager$RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo0, int v) {
        ibuq.f(nsdServiceInfo0, "serviceInfo");
        nsdServiceInfo0.getServiceName();
        ((ggtj)HubAdvertisingChimeraService.a.j()).z("Failed to stop Hub advertisements (%d)", v);
    }
}

