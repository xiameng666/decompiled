import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import j..util.Objects;

final class crbh extends crbj {
    final Object a;
    final crbs b;

    public crbh(crbs crbs0, Object object0) {
        this.a = object0;
        Objects.requireNonNull(crbs0);
        this.b = crbs0;
        super(crbs0, false);
    }

    @Override  // crbj
    public final void a() {
        crba crba0 = this.b.e;
        batl.s(crba0);
        ObjectWrapper objectWrapper0 = new ObjectWrapper(this.a);
        ObjectWrapper objectWrapper1 = new ObjectWrapper(null);
        ObjectWrapper objectWrapper2 = new ObjectWrapper(null);
        Parcel parcel0 = crba0.jo();
        parcel0.writeInt(5);
        parcel0.writeString("Error with data collection. Data lost.");
        wbz.h(parcel0, objectWrapper0);
        wbz.h(parcel0, objectWrapper1);
        wbz.h(parcel0, objectWrapper2);
        crba0.jp(33, parcel0);
    }
}

