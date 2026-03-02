import android.os.Parcel;

public abstract class alii extends wby implements alij {
    public alii() {
        super("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                int v1 = parcel0.readInt();
                int v2 = parcel0.readInt();
                int v3 = parcel0.readInt();
                alii.gr(parcel0);
                this.a(s, v1, v2, v3);
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                byte[] arr_b = parcel0.createByteArray();
                alii.gr(parcel0);
                this.c(s1, s2, arr_b);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

