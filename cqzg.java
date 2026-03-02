import android.os.Parcel;
import com.google.android.gms.mdocstore.StoreEmptyMdocRequest;

public final class cqzg implements azys {
    public final craf a;
    public final crap b;

    public cqzg(craf craf0, crap crap0) {
        this.a = craf0;
        this.b = crap0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        StoreEmptyMdocRequest storeEmptyMdocRequest0 = new StoreEmptyMdocRequest();
        storeEmptyMdocRequest0.a = this.a.b;
        storeEmptyMdocRequest0.b = this.b.a;
        crae crae0 = new crae(((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, storeEmptyMdocRequest0);
        wbz.h(parcel0, this.b.c);
        wbz.h(parcel0, crae0);
        cqxv0.jq(20, parcel0);
    }
}

