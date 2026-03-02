import com.google.android.gms.auth.folsom.SharedKey;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;

public final class afvf implements bxto {
    @Override  // bxto
    public final Object a(Object object0) {
        if(((List)object0).isEmpty()) {
            throw bxma.f(0xC3F2, "No SharedKey available.");
        }
        ggdy ggdy0 = new ggdy();
        for(Object object1: ((List)object0)) {
            byte[] arr_b = ((SharedKey)object1).b;
            int v = arr_b.length;
            if(v != 0x20) {
                throw bxma.h(0xC3F2, "SharedKey.keyMaterial has an invalid length of %s.", new Object[]{v});
            }
            ByteString hfsf0 = ByteString.copyFrom(hhur.k(new SecretKeySpec(arr_b, "AES"), afoa.b.toByteArray(), afoa.a.toByteArray()));
            ByteString hfsf1 = ByteString.copyFrom(arr_b);
            ggdy0.i(new afoa(((SharedKey)object1).a, hfsf1, hfsf0));
            continue;
        }
        return ggdy0.h();
    }
}

