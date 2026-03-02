import android.accounts.Account;
import com.google.android.gms.fido.credentialstore.KeyData;
import com.google.android.gms.fido.credentialstore.KeyMetadata;
import java.util.ArrayList;

public final class blkl implements gfsi {
    public final Account a;

    public blkl(Account account0) {
        this.a = account0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean[] arr_z = blkq.c(((gged_interceptors)object0));
        Object object1 = new ArrayList();
        ((ArrayList)object1).ensureCapacity(((gged_interceptors)object0).size());
        for(int v = 0; v < ((gged_interceptors)object0).size(); ++v) {
            hery hery0 = (hery)((gged_interceptors)object0).get(v);
            boolean z = arr_z[v];
            KeyMetadata keyMetadata0 = new KeyMetadata(hery0.h.toByteArray(), hery0.k, hery0.l, z, null);
            byte[] arr_b = hery0.f.toByteArray();
            byte[] arr_b1 = null;
            byte[] arr_b2 = hery0.c == 9 ? ((ByteString)hery0.d).toByteArray() : null;
            if(hery0.c == 12) {
                arr_b1 = ((ByteString)hery0.d).toByteArray();
            }
            boolean z1 = hery0.m;
            long v1 = ((bxos)bxos.a.b()).b(hery0.n);
            ((ArrayList)object1).add(KeyData.b(arr_b, null, arr_b2, arr_b1, keyMetadata0, this.a, z1, v1));
        }
        return object1;
    }
}

