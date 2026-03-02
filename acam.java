import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.apperrors.SetFilterParameters;

public final class acam extends wby implements IInterface, cjug {
    private final cjts a;
    private final abzp b;

    public acam() {
        super("com.google.android.gms.apperrors.internal.IAppErrorService");
    }

    public acam(cjts cjts0, abzp abzp0) {
        super("com.google.android.gms.apperrors.internal.IAppErrorService");
        this.a = cjts0;
        this.b = abzp0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            SetFilterParameters setFilterParameters0 = (SetFilterParameters)wbz.a(parcel0, SetFilterParameters.CREATOR);
            acam.gr(parcel0);
            acan acan0 = new acan(this.b, setFilterParameters0);
            this.a.b(acan0);
            return true;
        }
        return false;
    }
}

