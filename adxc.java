import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.List;

public final class adxc implements gftc {
    @Override  // gftc
    public final boolean a(Object object0) {
        List list0 = ((PublicKeyCredentialDescriptor)object0).c;
        if(list0 != null && !list0.isEmpty()) {
            ggfp ggfp0 = ggfp.G(list0);
            return ggfp0.size() == 1 && ggfp0.contains(Transport.e);
        }
        return false;
    }
}

