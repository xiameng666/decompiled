import android.os.Parcel;
import com.google.android.gms.mdocstore.GetMdocOperatingStatusListRequest;

public final class cqyt implements azys {
    public final craf a;

    public cqyt(craf craf0) {
        this.a = craf0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        GetMdocOperatingStatusListRequest getMdocOperatingStatusListRequest0 = new GetMdocOperatingStatusListRequest();
        getMdocOperatingStatusListRequest0.a = this.a.b;
        crad crad0 = new crad(((evqp)object1), new cqyi());
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, getMdocOperatingStatusListRequest0);
        wbz.h(parcel0, crad0);
        cqxv0.jq(27, parcel0);
    }
}

