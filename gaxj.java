import com.google.android.gms.mdocstore.types.EncryptedData;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import com.google.android.gms.mdocstore.types.UnencryptedData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class gaxj {
    public final cqxc a;

    public gaxj(cqxc cqxc0) {
        this.a = cqxc0;
    }

    public final byte[] a(fbbd fbbd0, byte[] arr_b) {
        ArrayList arrayList1;
        ibuq.f(arr_b, "unencryptedByteArray");
        List list0 = ibpo.b(arr_b);
        ibuq.f(list0, "unencryptedByteArrayList");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(UnencryptedData.a(((byte[])object0), fbbd0.f));
        }
        ProvisioningId provisioningId0 = new ProvisioningId(fbbd0.e);
        byte[] arr_b1 = fbbd0.d.toByteArray();
        evql evql0 = this.a.o(provisioningId0, arr_b1).g(new gaxi(this, arrayList0));
        try {
            Object object1 = evrg.n(evql0);
            ibuq.e(object1, "await(...)");
            arrayList1 = new ArrayList(ibpo.q(((Iterable)object1), 10));
            for(Object object2: ((Iterable)object1)) {
                arrayList1.add(((EncryptedData)object2).b());
            }
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            arrayList1 = null;
        }
        return arrayList1 == null ? null : ((byte[])ibpo.T(arrayList1));
    }
}

