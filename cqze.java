import android.os.Parcel;
import com.google.android.gms.mdocstore.StopPresentationRequest;

public final class cqze implements azys {
    public final craf a;

    public cqze(craf craf0) {
        this.a = craf0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        StopPresentationRequest stopPresentationRequest0 = new StopPresentationRequest();
        stopPresentationRequest0.a = this.a.b;
        crae crae0 = new crae(((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, stopPresentationRequest0);
        wbz.h(parcel0, crae0);
        cqxv0.jq(17, parcel0);
    }
}

