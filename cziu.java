import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import com.google.android.gms.nearby.presence.PresenceDevice;

public final class cziu implements azys {
    public final czjg a;

    public cziu(czjg czjg0) {
        this.a = czjg0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        boolean z = true;
        czjp czjp0 = new czjp(((evqp)object1));
        RejectConnectionRequestParams rejectConnectionRequestParams0 = new RejectConnectionRequestParams();
        cuwd cuwd0 = this.a.a;
        rejectConnectionRequestParams0.b = cuwd0.e();
        rejectConnectionRequestParams0.a = new czbc(czjp0);
        int v = cuwd0.a();
        rejectConnectionRequestParams0.c = v;
        if(cuwd0.a() == 2) {
            rejectConnectionRequestParams0.c = cuwd0.a();
            rejectConnectionRequestParams0.d = (PresenceDevice)cuwd0;
        }
        else {
            switch(cuwd0.a()) {
                case 1: {
                    v = cuwd0.a();
                    rejectConnectionRequestParams0.c = v;
                    rejectConnectionRequestParams0.e = (ConnectionsDevice)cuwd0;
                    break;
                }
                case 3: {
                    v = cuwd0.a();
                    rejectConnectionRequestParams0.c = v;
                    rejectConnectionRequestParams0.f = (DctDevice)cuwd0;
                }
            }
            if(v == 0) {
                z = false;
            }
            batl.b(z);
        }
        ((czft)((czbf)object0).H()).m(rejectConnectionRequestParams0);
    }
}

