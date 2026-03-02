import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class bncb extends wby implements bncc, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public bncb() {
        super("com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService");
    }

    public bncb(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.fido.targetdevice.internal.ITargetDirectTransferService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // bncc
    public final void a(bnbz bnbz0, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, ParcelFileDescriptor parcelFileDescriptor0, ParcelFileDescriptor parcelFileDescriptor1, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.db);
        azug azug0 = this.c(apiMetadata0);
        blnf blnf0 = new blnf(bnbz0, this.b, publicKeyCredentialRequestOptions0, parcelFileDescriptor0, parcelFileDescriptor1, azug0);
        this.a.b(blnf0);
    }

    private final azug c(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.bv);
        azuf0.g(bbdq.aL);
        azuf0.d(this.b);
        azuf0.c(this.c);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bnbz bnbz0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks");
                    bnbz0 = (iInterface0 instanceof bnbz) ? ((bnbz)iInterface0) : new bnbx(iBinder0);
                }
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = (PublicKeyCredentialRequestOptions)wbz.a(parcel0, PublicKeyCredentialRequestOptions.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor1 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bncb.gr(parcel0);
                this.a(bnbz0, publicKeyCredentialRequestOptions0, parcelFileDescriptor0, parcelFileDescriptor1, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bnbz0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bncb.gr(parcel0);
                blne blne0 = new blne(((azxs)bnbz0), this.c(apiMetadata1));
                this.a.b(blne0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

