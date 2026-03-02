import android.os.Parcel;

public abstract class czfy extends wby implements czfz {
    public czfy() {
        super("com.google.android.gms.nearby.internal.connection.IResultListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            int v1 = parcel0.readInt();
            czfy.gr(parcel0);
            this.a(v1);
            return true;
        }
        return false;
    }
}

