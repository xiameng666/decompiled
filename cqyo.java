import android.os.Parcel;
import com.google.android.gms.mdocstore.CreatePendingMdocRequest;

public final class cqyo implements azys {
    public final craf a;
    public final cram b;

    public cqyo(craf craf0, cram cram0) {
        this.a = craf0;
        this.b = cram0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        CreatePendingMdocRequest createPendingMdocRequest0 = new CreatePendingMdocRequest();
        createPendingMdocRequest0.a = this.a.b;
        createPendingMdocRequest0.b = this.b.j;
        createPendingMdocRequest0.d = (String[])this.b.l.toArray(new String[this.b.l.size()]);
        createPendingMdocRequest0.c = this.b.k;
        createPendingMdocRequest0.e = this.b.m;
        cqzq cqzq0 = new cqzq(this.a, ((evqp)object1));
        Parcel parcel0 = cqxv0.jo();
        wbz.f(parcel0, createPendingMdocRequest0);
        wbz.h(parcel0, cqzq0);
        cqxv0.jq(2, parcel0);
    }
}

