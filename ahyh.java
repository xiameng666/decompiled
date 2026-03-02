import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ahyh extends wby implements ahyi {
    public ahyh() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ahyo ahyo0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                    ahyo0 = (iInterface0 instanceof ahyo) ? ((ahyo)iInterface0) : new ahym(iBinder0);
                }
                ahyh.gr(parcel0);
                this.e(ahyo0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                    ahyo0 = (iInterface1 instanceof ahyo) ? ((ahyo)iInterface1) : new ahym(iBinder1);
                }
                ahyh.gr(parcel0);
                this.f(s, ahyo0);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ahyo0 = (iInterface2 instanceof azxs) ? ((azxs)iInterface2) : new azxq(iBinder2);
                }
                ahyh.gr(parcel0);
                this.c(((azxs)ahyo0));
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
                    ahyo0 = (iInterface3 instanceof ahxz) ? ((ahxz)iInterface3) : new ahxx(iBinder3);
                }
                ahyh.gr(parcel0);
                this.a(((ahxz)ahyo0));
                break;
            }
            case 5: {
                String s1 = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
                    ahyo0 = (iInterface4 instanceof ahyf) ? ((ahyf)iInterface4) : new ahyd(iBinder4);
                }
                ahyh.gr(parcel0);
                this.b(s1, ((ahyf)ahyo0));
                break;
            }
            case 6: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ahyo0 = (iInterface5 instanceof azxs) ? ((azxs)iInterface5) : new azxq(iBinder5);
                }
                ahyh.gr(parcel0);
                this.d(((azxs)ahyo0));
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

