import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class eiqc extends wby implements eiqd {
    final evqp a;

    public eiqc() {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
    }

    public eiqc(einq einq0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(einq0);
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
    }

    @Override  // eiqd
    public final void a(Status status0, byte[] arr_b) {
        fplr fplr0;
        if(status0.e()) {
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fplr.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                fplr0 = (fplr)hftv0;
            }
            catch(hfur hfur0) {
                this.a.a(hfur0);
                return;
            }
            azzf.b(status0, fplr0, this.a);
            return;
        }
        azzf.b(status0, null, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            byte[] arr_b = parcel0.createByteArray();
            eiqc.gr(parcel0);
            this.a(status0, arr_b);
            return true;
        }
        return false;
    }
}

