import com.google.android.gms.mdocstore.GetMdocInfoListRequest;
import com.google.android.gms.mdocstore.MobileDocumentRequest;

public final class cqyj implements azys {
    public final craf a;
    public final MobileDocumentRequest b;

    public cqyj(craf craf0, MobileDocumentRequest mobileDocumentRequest0) {
        this.a = craf0;
        this.b = mobileDocumentRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqxv cqxv0 = (cqxv)((crag)object0).H();
        GetMdocInfoListRequest getMdocInfoListRequest0 = new GetMdocInfoListRequest();
        getMdocInfoListRequest0.a = this.a.b;
        getMdocInfoListRequest0.b = this.b;
        cqxv0.b(getMdocInfoListRequest0, new crad(((evqp)object1), new cqzh()));
    }
}

