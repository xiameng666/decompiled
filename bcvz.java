import android.os.Parcel;
import com.google.android.gms.contextmanager.ContextData;

public abstract class bcvz extends wby implements bcwa {
    public bcvz() {
        super("com.google.android.gms.contextmanager.internal.IContextListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            ContextData contextData0 = (ContextData)wbz.a(parcel0, ContextData.CREATOR);
            bcvz.gr(parcel0);
            this.a(contextData0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

