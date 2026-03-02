import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.Arrays;

public final class bnag implements gftc {
    public final byte[] a;

    public bnag(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return Arrays.equals(((PublicKeyCredentialDescriptor)object0).e(), this.a);
    }
}

