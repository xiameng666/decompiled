import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class eiwv extends wby implements IInterface, cjug {
    private final cjts a;
    private final String b;
    private final String c;
    private final gfuv d;
    private final eiwr e;

    public eiwv() {
        super("com.google.android.gms.play.integrity.api.internal.IIntegrityApiDisplayListenerService");
    }

    @AssistedInject
    public eiwv(cjts cjts0, gfuv gfuv0, @Assisted eiwr eiwr0, @Assisted("callingPackage") String s, @Assisted("attributionTag") String s1) {
        super("com.google.android.gms.play.integrity.api.internal.IIntegrityApiDisplayListenerService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
        this.d = gfuv0;
        this.e = eiwr0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        eiwu eiwu0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                eiwu0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.play.integrity.api.internal.IIntegrityApiDisplayListenerCallbacks");
                eiwu0 = (iInterface0 instanceof eiwu) ? ((eiwu)iInterface0) : new eiwu(iBinder0);
            }
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            eiwv.gr(parcel0);
            gfug gfug0 = gfug.c(this.d);
            azuf azuf0 = azug.b(apiMetadata0);
            azuf0.e(bbdp.em);
            azuf0.g(bbdq.aG);
            azuf0.d(this.b);
            azuf0.c(this.c);
            azug azug0 = azuf0.a();
            eiww eiww0 = new eiww(this.e, gfug0, eiwu0, azug0);
            this.a.b(eiww0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

