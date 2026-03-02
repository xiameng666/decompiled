import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest;

public final class etaa extends wby implements cjug, etab {
    private final String a;
    private final cjts b;
    private final String c;

    public etaa() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserService");
    }

    public etaa(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserService");
        this.b = cjts0;
        this.a = s;
        this.c = s1;
    }

    @Override  // etab
    public final void a(etae etae0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.c);
        azuf0.e(bbdp.eY);
        azuf0.g(bbdq.az);
        azuf0.d(this.a);
        azuf0.c(this.c);
        azug azug0 = azuf0.a();
        etww etww0 = new etww(this.a, etae0, azug0);
        this.b.b(etww0);
    }

    @Override  // etab
    public final void b(etae etae0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.c);
        azuf0.e(bbdp.eY);
        azuf0.g(bbdq.az);
        azuf0.d(this.a);
        azuf0.c(this.c);
        azug azug0 = azuf0.a();
        etxy etxy0 = new etxy(this.a, etae0, azug0);
        this.b.b(etxy0);
    }

    @Override  // etab
    public final void c(GetLinkingTokenRequest getLinkingTokenRequest0, etae etae0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.c);
        azuf0.e(bbdp.eY);
        azuf0.g(bbdq.az);
        azuf0.d(this.a);
        azuf0.c(this.c);
        azug azug0 = azuf0.a();
        etys etys0 = new etys(getLinkingTokenRequest0, this.a, etae0, azug0);
        this.b.b(etys0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        etae etae0 = null;
        switch(v) {
            case 1: {
                GetLinkingTokenRequest getLinkingTokenRequest0 = (GetLinkingTokenRequest)wbz.a(parcel0, GetLinkingTokenRequest.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserServiceCallbacks");
                    etae0 = (iInterface0 instanceof etae) ? ((etae)iInterface0) : new etac(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                etaa.gr(parcel0);
                this.c(getLinkingTokenRequest0, etae0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserServiceCallbacks");
                    etae0 = (iInterface1 instanceof etae) ? ((etae)iInterface1) : new etac(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                etaa.gr(parcel0);
                this.b(etae0, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserServiceCallbacks");
                    etae0 = (iInterface2 instanceof etae) ? ((etae)iInterface2) : new etac(iBinder2);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                etaa.gr(parcel0);
                this.a(etae0, apiMetadata2);
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

