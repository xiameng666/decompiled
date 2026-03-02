import android.os.Parcel;

public final class hbvz implements azys {
    public final String a;

    public hbvz(String s) {
        this.a = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        hbun hbun0 = (hbun)((hbwc)object0).H();
        Parcel parcel0 = hbun0.jo();
        parcel0.writeString(this.a);
        hbun0.jp(1, parcel0);
        ((evqp)object1).b(null);
    }
}

