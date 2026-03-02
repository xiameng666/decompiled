import android.os.Parcel;
import com.google.android.gms.mdocstore.ProcessNfcTapRequest;

public final class cqyv implements azys {
    public final craf a;
    public final byte[] b;
    public final cqxx c;

    public cqyv(craf craf0, byte[] arr_b, cqxx cqxx0) {
        this.a = craf0;
        this.b = arr_b;
        this.c = cqxx0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        ProcessNfcTapRequest processNfcTapRequest0 = new ProcessNfcTapRequest();
        processNfcTapRequest0.a = this.a.b;
        processNfcTapRequest0.c = this.b;
        crae crae0 = new crae(((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, processNfcTapRequest0);
        wbz.h(parcel0, this.c);
        wbz.h(parcel0, crae0);
        cqxv0.jq(19, parcel0);
    }
}

