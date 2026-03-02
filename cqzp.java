import com.google.android.gms.mdocstore.types.ProtoParcelable;
import j..util.Objects;
import java.io.IOException;

final class cqzp extends crac {
    public cqzp(craf craf0, evqp evqp0) {
        Objects.requireNonNull(craf0);
        super(evqp0);
    }

    @Override  // cqxw
    public final void h(ProtoParcelable protoParcelable0) {
        try {
            evqp evqp0 = this.b;
            byte[] arr_b = protoParcelable0.a();
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtwu.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            evqp0.b(((gtwu)hftv0));
        }
        catch(IOException iOException0) {
            this.b.a(iOException0);
        }
    }
}

