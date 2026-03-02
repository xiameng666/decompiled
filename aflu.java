import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.List;

public final class aflu implements gftc {
    @Override  // gftc
    public final boolean a(Object object0) {
        List list0 = ((PublicKeyCredentialDescriptor)object0).c;
        return bbnh.k(list0) || list0.contains(Transport.f) || list0.contains(Transport.g);
    }
}

