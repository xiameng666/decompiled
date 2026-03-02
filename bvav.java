import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;

public final class bvav implements jqv {
    public final bask a;

    public bvav(bask bask0) {
        this.a = bask0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        try {
            bvay bvay0 = new bvay(jqt0);
            GetServiceRequest getServiceRequest0 = new GetServiceRequest(349);
            getServiceRequest0.f = "com.google.android.gms";
            this.a.a(bvay0, getServiceRequest0);
            return ibom.a;
        }
        catch(RemoteException remoteException0) {
            return Boolean.valueOf(jqt0.c(remoteException0));
        }
    }
}

