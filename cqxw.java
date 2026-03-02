import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mdocstore.MdocStoreApiError;
import com.google.android.gms.mdocstore.types.CryptoSchemeId;
import com.google.android.gms.mdocstore.types.EncryptedData;
import com.google.android.gms.mdocstore.types.ProtoParcelable;
import com.google.android.gms.mdocstore.types.SignedPublicKey;
import com.google.android.gms.mdocstore.types.X509CertificateChain;
import java.util.ArrayList;
import java.util.List;

public class cqxw extends wby implements IInterface {
    public cqxw() {
        super("com.google.android.gms.mdocstore.internal.IMdocStoreServiceCallbacks");
    }

    public void a(byte[] arr_b) {
        throw new UnsupportedOperationException();
    }

    public void c(List list0) {
        throw new UnsupportedOperationException();
    }

    public void d(List list0) {
        throw new UnsupportedOperationException();
    }

    public void e(SignedPublicKey signedPublicKey0) {
        throw new UnsupportedOperationException();
    }

    public void f(CryptoSchemeId cryptoSchemeId0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        cqya cqya0;
        switch(v) {
            case 2: {
                String s = parcel0.readString();
                cqxw.gr(parcel0);
                this.i(s);
                return true;
            }
            case 3: {
                X509CertificateChain x509CertificateChain0 = (X509CertificateChain)wbz.a(parcel0, X509CertificateChain.CREATOR);
                cqxw.gr(parcel0);
                this.k(x509CertificateChain0);
                return true;
            }
            case 4: {
                byte[] arr_b = parcel0.createByteArray();
                cqxw.gr(parcel0);
                this.a(arr_b);
                return true;
            }
            case 5: {
                this.j();
                return true;
            }
            case 6: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    cqya0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.mdocstore.internal.IWritableMdocToken");
                    cqya0 = (iInterface0 instanceof cqya) ? ((cqya)iInterface0) : new cqya(iBinder0);
                }
                X509CertificateChain x509CertificateChain1 = (X509CertificateChain)wbz.a(parcel0, X509CertificateChain.CREATOR);
                cqxw.gr(parcel0);
                this.l(cqya0, x509CertificateChain1);
                return true;
            }
            case 7: {
                MdocStoreApiError mdocStoreApiError0 = (MdocStoreApiError)wbz.a(parcel0, MdocStoreApiError.CREATOR);
                cqxw.gr(parcel0);
                this.g(mdocStoreApiError0);
                return true;
            }
            case 8: {
                CryptoSchemeId cryptoSchemeId0 = (CryptoSchemeId)wbz.a(parcel0, CryptoSchemeId.CREATOR);
                cqxw.gr(parcel0);
                this.f(cryptoSchemeId0);
                return true;
            }
            case 9: {
                SignedPublicKey signedPublicKey0 = (SignedPublicKey)wbz.a(parcel0, SignedPublicKey.CREATOR);
                cqxw.gr(parcel0);
                this.e(signedPublicKey0);
                return true;
            }
            case 10: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(EncryptedData.CREATOR);
                cqxw.gr(parcel0);
                this.d(arrayList0);
                return true;
            }
            case 11: {
                ArrayList arrayList1 = wbz.b(parcel0);
                cqxw.gr(parcel0);
                this.c(arrayList1);
                return true;
            }
            case 12: {
                ProtoParcelable protoParcelable0 = (ProtoParcelable)wbz.a(parcel0, ProtoParcelable.CREATOR);
                cqxw.gr(parcel0);
                this.h(protoParcelable0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public void g(MdocStoreApiError mdocStoreApiError0) {
        throw null;
    }

    public void h(ProtoParcelable protoParcelable0) {
        throw new UnsupportedOperationException();
    }

    public void i(String s) {
        throw new UnsupportedOperationException();
    }

    public void j() {
        throw new UnsupportedOperationException();
    }

    public void k(X509CertificateChain x509CertificateChain0) {
        throw new UnsupportedOperationException();
    }

    public void l(cqya cqya0, X509CertificateChain x509CertificateChain0) {
        throw new UnsupportedOperationException();
    }
}

