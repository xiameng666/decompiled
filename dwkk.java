import android.graphics.Bitmap;
import com.google.android.gms.pay.GetImagesForValuableRequest;
import com.google.android.gms.pay.GetImagesForValuableResponse;

final class dwkk extends ibsl implements ibtw {
    int a;
    final dwkl b;

    public dwkk(dwkl dwkl0, ibrl ibrl0) {
        this.b = dwkl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwkk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwkk(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            GetImagesForValuableRequest getImagesForValuableRequest0 = new GetImagesForValuableRequest();
            getImagesForValuableRequest0.b = this.b.b;
            getImagesForValuableRequest0.a = this.b.e.b;
            getImagesForValuableRequest0.c = glwy.a(hwkt.f());
            evql evql0 = this.b.i.aB(getImagesForValuableRequest0);
            this.a = 1;
            object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        dwkl dwkl0 = this.b;
        if(ibnw.b(object2)) {
            Bitmap[] arr_bitmap = ((GetImagesForValuableResponse)object2).a;
            ibuq.e(arr_bitmap, "getValuableImages(...)");
            gged_interceptors gged0 = ggdx.b(arr_bitmap);
            dwkl0.f.l(gged0);
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(dwkl.a.j(), "Unable to retrieve the image", throwable0);
        }
        return ibom.a;
    }
}

