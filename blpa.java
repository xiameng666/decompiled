import android.util.Pair;
import com.google.android.gms.fido.credentialstore.PasskeyList;
import java.util.ArrayList;

public final class blpa implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        PasskeyList passkeyList0 = (PasskeyList)evql0.j();
        ArrayList arrayList0 = new ArrayList();
        byte[][] arr2_b = passkeyList0.a;
        arrayList0.ensureCapacity(arr2_b.length);
        for(int v = 0; v < arr2_b.length; ++v) {
            byte[] arr_b = arr2_b[v];
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hery.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            arrayList0.add(((hery)hftv0));
        }
        return new Pair(arrayList0, passkeyList0.b);
    }
}

