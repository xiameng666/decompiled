import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.io.IOException;
import jeb.synthetic.FIN;

final class bljs implements evpz {
    final bljt a;

    public bljs(bljt bljt0) {
        Objects.requireNonNull(bljt0);
        this.a = bljt0;
        super();
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        try {
            if(evql0.n()) {
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)evql0.j();
                int v = FIN.finallyOpen$NT();
                ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
                this.a.b.a(Status.b, parcelFileDescriptor0, apiMetadata0);
                try {
                    FIN.finallyCodeBegin$NT(v);
                }
                catch(IOException unused_ex) {
                }
                return;
            }
            Exception exception0 = evql0.i();
            ((ggtj)((ggtj)((ggtj)bljt.a.i()).s(exception0)).ar(3092)).x("GetPasskeys failed");
            Status status0 = bxma.i(exception0).a();
            this.a.b.a(status0, null, ApiMetadata.b);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

