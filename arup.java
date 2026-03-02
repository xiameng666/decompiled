import android.content.Intent;
import android.os.RemoteException;
import j..util.Objects;
import java.util.concurrent.Callable;

public final class arup implements Callable {
    final arut a;
    private final arvr b;

    public arup(arut arut0, arvr arvr0) {
        Objects.requireNonNull(arut0);
        this.a = arut0;
        super();
        this.b = arvr0;
    }

    @Override
    public final Object call() {
        byte[] arr_b;
        azox azox0;
        aqql aqql0 = arut.a;
        aqql0.d("Starting service connection", new Object[0]);
        arut arut0 = this.a;
        if(arut0.e == null) {
            try {
                Intent intent0 = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.backup.action.ACTION_CONNECT_TO_MANAGER_SERVICE");
                bbic bbic0 = bbic.a();
                azox0 = arut0.b;
                if(bbic0.d(arut0.d, intent0, azox0, 1)) {
                    goto label_15;
                }
                else {
                    aqql0.f("Connection failed to manager service", new Object[0]);
                    goto label_13;
                }
                goto label_16;
            }
            catch(SecurityException unused_ex) {
                arut.a.f("Manager service is not accessible", new Object[0]);
            }
        label_13:
            arvo arvo0 = null;
            goto label_16;
        label_15:
            arvo0 = arut.a(azox0);
        label_16:
            arut0.e = arvo0;
            if(this.a.e == null) {
                arut.a.f("Failed to bind to manager service", new Object[0]);
                this.a.b();
                return gfqx.a;
            }
            arut.a.d("Connected to manager service", new Object[0]);
        }
        else {
            aqql0.d("Already connected to manager service", new Object[0]);
        }
        try {
            arvo arvo1 = this.a.e;
            gftb.check(arvo1);
            arr_b = arvo1.c(this.b);
        }
        catch(RemoteException unused_ex) {
            arut.a.f("Remote exception while calling #attach on manager service", new Object[0]);
            arr_b = null;
        }
        if(arr_b == null) {
            arut.a.f("Null data received from service", new Object[0]);
            return gfqx.a;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)artk.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return gfsx.l(((artk)hftv0));
        }
        catch(hfur unused_ex) {
            arut.a.f("InvalidProtocolBufferException while trying to parse the returned proto", new Object[0]);
            return gfsx.l(null);
        }
    }
}

