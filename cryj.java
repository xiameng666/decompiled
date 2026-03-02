import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest.Builder;
import com.google.android.gms.mobiledataplan.service.background.BackgroundCellularNetworkMonitor.1;
import java.util.logging.Level;

public final class cryj {
    public static final bboh a;

    static {
        cryj.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public static void a(Context context0) {
        if(!hvje.h()) {
            return;
        }
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        if(connectivityManager0 == null) {
            ((ggtj)cryj.a.j()).x("ConnectivityManager is null.");
            return;
        }
        Level level0 = cslm.h();
        cryj.a.g(level0).B("%s: register", "CellularMonitor");
        crxn crxn0 = crxn.c();
        gizg gizg0 = crxn0.D(20, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyl giyl0 = (giyl)hftp1.b_message;
        int v = 3;
        giyl0.c = hfyp.b(3);
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
        crxn0.d(((gizg)hftp0.N_build()), hhct.bI);
        BackgroundCellularNetworkMonitor.1 backgroundCellularNetworkMonitor$10 = new BackgroundCellularNetworkMonitor.1(context0);
        NetworkRequest.Builder networkRequest$Builder0 = new NetworkRequest.Builder();
        networkRequest$Builder0.addTransportType(0).addTransportType(1).addCapability(12);
        connectivityManager0.requestNetwork(networkRequest$Builder0.build(), backgroundCellularNetworkMonitor$10);
    }

    public static boolean b() {
        return hvje.h() && hvje.l();
    }
}

