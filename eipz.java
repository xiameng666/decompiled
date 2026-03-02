import android.os.Parcel;
import j..util.Objects;

public final class eipz extends wby implements eiqa {
    final azyf a;

    public eipz() {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }

    public eipz(einq einq0, azyf azyf0) {
        this.a = azyf0;
        Objects.requireNonNull(einq0);
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }

    @Override  // eiqa
    public final void a(byte[] arr_b) {
        einp einp0 = new einp(this, arr_b);
        this.a.b(einp0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            byte[] arr_b = parcel0.createByteArray();
            eipz.gr(parcel0);
            this.a(arr_b);
            return true;
        }
        return false;
    }
}

