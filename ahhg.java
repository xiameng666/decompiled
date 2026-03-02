import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.yolo.CredentialsChimeraService;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahhg implements gmbg {
    final ahhi a;
    final agfy b;

    public ahhg(aggd aggd0, ahhi ahhi0, agfy agfy0) {
        this.a = ahhi0;
        this.b = agfy0;
        Objects.requireNonNull(aggd0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        try {
            bxma bxma0 = bxma.i(throwable0);
            if(bxma0.a == 8) {
                ((ggtj)((ggtj)((ggtj)CredentialsChimeraService.a.i()).s(bxma0)).ar(813)).x("Internal error.");
            }
            Status status0 = aeno.a(bxma0);
            this.b.a(status0);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        try {
            this.a.a(object0);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

