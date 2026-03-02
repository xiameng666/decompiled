import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

public final class dxdl {
    public final Context a;
    public final dxdt b;
    public hawd c;
    public final bboh d;

    public dxdl(Context context0, dxdt dxdt0) {
        this.a = context0;
        this.b = dxdt0;
        this.d = bboh.b(new ibuk(dxdl.class).c(), bbcu.cZ);
    }

    public final Object a(Bitmap bitmap0, ibrl ibrl0) {
        Object object2;
        dxdk dxdk0;
        if((ibrl0 instanceof dxdk)) {
            dxdk0 = (dxdk)ibrl0;
            int v = dxdk0.c;
            if((v & 0x80000000) == 0) {
                dxdk0 = new dxdk(this, ibrl0);
            }
            else {
                dxdk0.c = v - 0x80000000;
            }
        }
        else {
            dxdk0 = new dxdk(this, ibrl0);
        }
        Object object0 = dxdk0.a;
        Object object1 = ibrx.a;
        switch(dxdk0.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = dxdj.a(bitmap0);
                dxdk0.c = 1;
                object2 = fsdk.a(evql0, dxdk0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(ibnw.b(object2)) {
            gged_interceptors gged0 = ggna.a;
            if((object2 instanceof ibnv)) {
                object2 = gged0;
            }
            ((ggtj)this.d.h()).B("Extractor barcodes found: %s", ((List)object2).toString());
            ibuq.c(((List)object2));
            ArrayList arrayList0 = new ArrayList(ibpo.q(((List)object2), 10));
            for(Object object3: ((List)object2)) {
                arrayList0.add(dxdi.b.apply(((hbsn)object3)));
            }
            return ggdx.d(arrayList0);
        }
        a.ae(this.d.j(), "Failed to extract barcodes, sending over empty set", ibnw.a(object2));
        ibuq.c(ggnj.a);
        return ggnj.a;
    }
}

