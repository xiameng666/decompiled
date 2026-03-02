import android.accounts.Account;
import com.google.android.gms.fido.credentialstore.KeyMetadata;

public final class blhw implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z = ((blpi)object0).b().i();
        bmhu bmhu0 = new bmhu();
        byte[] arr_b = null;
        bmhu0.a = z ? ((KeyMetadata)((blpi)object0).b().d()).b : null;
        bmhu0.b = z ? ((KeyMetadata)((blpi)object0).b().d()).c : null;
        if(z) {
            arr_b = ((KeyMetadata)((blpi)object0).b().d()).a;
        }
        bmhu0.c(arr_b);
        bmhu0.b(((blpi)object0).r());
        bmhu0.g = ((blpi)object0).n();
        bmhu0.h = ((blpi)object0).p();
        bmhu0.i = ((blpi)object0).m();
        bmhu0.e = ((blpi)object0).a();
        bmhu0.d = (Account)((blpi)object0).e().g();
        return bmhu0.a();
    }
}

