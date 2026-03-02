import android.os.Parcel;

public abstract class aqgj extends wby implements aqgk {
    public aqgj() {
        super("com.google.android.gms.backup.IBackUpNowClientCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                int v1 = parcel0.readInt();
                aqgj.gr(parcel0);
                this.a(v1);
                return true;
            }
            case 2: {
                int v2 = parcel0.readInt();
                int v3 = parcel0.readInt();
                aqgj.gr(parcel0);
                this.c(v2, v3);
                return true;
            }
            case 3: {
                float f = parcel0.readFloat();
                aqgj.gr(parcel0);
                this.b(f);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

