import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Optional;

public final class ebiv implements evqc {
    public final ebiw a;
    public final String b;

    public ebiv(ebiw ebiw0, String s) {
        this.a = ebiw0;
        this.b = s;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Optional optional0 = ebza.f(exception0);
        try {
            this.a.b.x(Status.d);
            ebwm.b(this.a.e, ebiw.g, 8, optional0);
            ((ggtj)((ggtj)((ggtj)ebiw.a.i()).s(exception0)).ar(0x2FE6)).B("Failed to unset default for token Id: %s", this.b);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

