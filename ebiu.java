import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Optional;

public final class ebiu implements evqf {
    public final ebiw a;
    public final String b;

    public ebiu(ebiw ebiw0, String s) {
        this.a = ebiw0;
        this.b = s;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Status status0;
        ebiw ebiw0 = this.a;
        if(((Status)object0).e()) {
            status0 = Status.b;
            ebwm.c(ebiw0.e, ebiw.g);
        }
        else {
            ebwm.b(ebiw0.e, ebiw.g, 8, Optional.empty());
            ((ggtj)((ggtj)((ggtj)ebiw.a.i()).s(new RuntimeException(((Status)object0).j))).ar(0x2FE4)).B("Failed to unset default for token Id: %s", this.b);
            status0 = Status.d;
        }
        try {
            ebiw0.b.x(status0);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

