import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class bncd implements azys {
    public final bnce a;
    public final PublicKeyCredentialRequestOptions b;
    public final ParcelFileDescriptor c;
    public final ParcelFileDescriptor d;

    public bncd(bnce bnce0, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, ParcelFileDescriptor parcelFileDescriptor0, ParcelFileDescriptor parcelFileDescriptor1) {
        this.a = bnce0;
        this.b = publicKeyCredentialRequestOptions0;
        this.c = parcelFileDescriptor0;
        this.d = parcelFileDescriptor1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bncg bncg0 = (bncg)object0;
        bnby bnby0 = new bnby(this.a, ((evqp)object1));
        bncc bncc0 = (bncc)bncg0.H();
        ApiMetadata apiMetadata0 = cclr.a(bncg0.r);
        bncc0.a(bnby0, this.b, this.c, this.d, apiMetadata0);
    }
}

