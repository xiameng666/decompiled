import android.content.Context;
import com.google.android.gms.chimera.modules.auth.blockstore.AppContextProvider;
import java.io.IOException;
import java.security.GeneralSecurityException;

public final class ajac implements aizv {
    public static volatile ajac a;
    private final Context b;

    static {
        aiqz.b("LocalEncryptor");
    }

    public ajac() {
        this.b = AppContextProvider.a();
    }

    @Override  // aizv
    public final byte[] a(byte[] arr_b) {
        if(arr_b != null && arr_b.length != 0) {
            try {
                return this.d(this.c().a()).a(arr_b, null);
            }
            catch(RuntimeException | IOException | GeneralSecurityException exception0) {
                throw new aizu("Unable to decrypt data!", exception0);
            }
        }
        return arr_b;
    }

    @Override  // aizv
    public final byte[] b(byte[] arr_b) {
        if(arr_b != null && arr_b.length != 0) {
            try {
                return this.d(this.c().a()).b(arr_b, null);
            }
            catch(IOException | GeneralSecurityException exception0) {
                throw new aizu("Unable to encrypt data!", exception0);
            }
        }
        return arr_b;
    }

    final gmyy c() {
        gmyy gmyy0;
        synchronized(this) {
            gmnr.a();
            gmyx gmyx0 = new gmyx();
            gmyx0.c(this.b, "_android_auth_blockstore_local_storage_keyset_", "blockstore_keys");
            gmyx0.d = gmpj.a();
            if(hprv.a.f().r()) {
                gmyx0.b("android-keystore://blockstore");
            }
            gmyy0 = gmyx0.a();
        }
        return gmyy0;
    }

    private final gmmg d(gmnb gmnb0) {
        gmmg gmmg0;
        synchronized(this) {
            gmmg0 = (gmmg)gmnb0.o(gmnz.a(), gmmg.class);
        }
        return gmmg0;
    }
}

