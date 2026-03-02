import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ahob extends wby implements ahoc {
    final evqp a;

    public ahob() {
        super("com.google.android.gms.auth.api.fido.internal.IListWebauthnCredentialSpecificsCallback");
    }

    public ahob(ahow ahow0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahow0);
        super("com.google.android.gms.auth.api.fido.internal.IListWebauthnCredentialSpecificsCallback");
    }

    @Override  // ahoc
    public final void a(Status status0, List list0) {
        if(list0 == null) {
            azzf.b(status0, null, this.a);
            return;
        }
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            byte[] arr_b = (byte[])object0;
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hery.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ggdy0.i(((hery)hftv0));
            }
            catch(hfur unused_ex) {
                azzf.b(new Status(13, "Unable to parse WebauthnCredentialSpecifics"), null, this.a);
            }
        }
        azzf.b(status0, ggdy0.h(), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ArrayList arrayList0 = wbz.b(parcel0);
            ahob.gr(parcel0);
            this.a(status0, arrayList0);
            return true;
        }
        return false;
    }
}

