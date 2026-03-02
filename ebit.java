import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Optional;
import java.util.concurrent.ExecutionException;

public final class ebit implements evqc {
    public final ebiw a;
    public final String b;

    public ebit(ebiw ebiw0, String s) {
        this.a = ebiw0;
        this.b = s;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Status status0;
        Optional optional0 = ebza.f(exception0);
        Throwable throwable0 = exception0.getCause();
        String s = this.b;
        if(!(throwable0 instanceof ExecutionException) || !(throwable0.getCause() instanceof aztb)) {
            status0 = Status.d;
        }
        else if(((aztb)throwable0.getCause()).a.i == 15012) {
            status0 = new Status(37505);
        }
        else {
            aztb aztb0 = (aztb)throwable0.getCause();
            status0 = aztb0 == null ? Status.d : aztb0.a;
        }
        ebwm.b(this.a.e, ebiw.f, ebwm.a(status0), optional0);
        try {
            this.a.b.x(status0);
            ((ggtj)((ggtj)((ggtj)ebiw.a.i()).s(exception0)).ar(0x2FE2)).B("Failed to set default for token Id: %s", s);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

