import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class bnce extends azts implements bnbv {
    private static final azta_api a;
    private static final azss b;

    static {
        azss azss0 = new azss();
        bnce.b = azss0;
        bnce.a = new azta_api("Fido.FIDO_TARGET_DIRECT_TRANSFER_API", new bncf(), azss0);
    }

    public bnce(Context context0) {
        super(context0, bnce.a, azsx.s, aztr_settings.a);
    }

    @Override  // bnbv
    public final evql b(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, ParcelFileDescriptor parcelFileDescriptor0, ParcelFileDescriptor parcelFileDescriptor1) {
        azzc azzc0 = new azzc();
        azzc0.a = new bncd(this, publicKeyCredentialRequestOptions0, parcelFileDescriptor0, parcelFileDescriptor1);
        azzc0.c = new Feature[]{blfo.j};
        azzc0.d = 5422;
        return this.iG(azzc0.a());
    }
}

