import com.google.android.gms.pay.Transaction;
import java.util.Comparator;

final class edcc implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        Transaction transaction0 = (Transaction)object0;
        Transaction transaction1 = (Transaction)object1;
        try {
            byte[] arr_b = transaction0.a;
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hknp.b), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            byte[] arr_b1 = transaction1.a;
            hftc hftc1 = hftc.a();
            ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hknp.b), arr_b1, 0, arr_b1.length, hftc1);
            ProtoLiteMessage.P_makeImmutable(hftv1);
            return edgo.a(((hknp)hftv0), ((hknp)hftv1));
        }
        catch(hfur unused_ex) {
            return 0;
        }
    }
}

