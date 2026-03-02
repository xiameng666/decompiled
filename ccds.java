import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

public final class ccds extends wby implements IInterface {
    private final Context a;
    private final cbyw b;

    public ccds() {
        super("com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory");
    }

    public ccds(Context context0, cbyw cbyw0) {
        super("com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory");
        this.a = context0;
        this.b = cbyw0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bjgw bjgw0;
        if(v == 2) {
            byte[] arr_b = parcel0.createByteArray();
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                bjgw0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bjgw0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
            }
            int v1 = parcel0.readInt();
            int v2 = parcel0.readInt();
            double f = parcel0.readDouble();
            ccds.gr(parcel0);
            ccdr ccdr0 = new ccdr(arr_b, ((ExecutorService)ObjectWrapper.a(bjgw0)), clbv.a(this.a), v1, v2, f, this.b.A());
            parcel1.writeNoException();
            wbz.h(parcel1, ccdr0);
            return true;
        }
        return false;
    }
}

