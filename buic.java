import android.content.Context;
import com.google.android.gms.googleone.service.scheduler.StorageUpdateTaskBoundService;
import java.util.ArrayList;
import java.util.Iterator;

public final class buic extends ibsl implements ibtw {
    Object a;
    int b;
    final ArrayList c;
    final StorageUpdateTaskBoundService d;

    public buic(ArrayList arrayList0, StorageUpdateTaskBoundService storageUpdateTaskBoundService0, ibrl ibrl0) {
        this.c = arrayList0;
        this.d = storageUpdateTaskBoundService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buic)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buic(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        hith hith0;
        Object object2;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            Iterator iterator0 = this.c.iterator();
            ibuq.e(iterator0, "iterator(...)");
            object2 = iterator0;
        }
        else {
            object2 = this.a;
            ibnx.b(object0);
            hith0 = (hith)object0;
        }
        while(((Iterator)object2).hasNext()) {
            Object object3 = ((Iterator)object2).next();
            ibuq.e(object3, "next(...)");
            StorageUpdateTaskBoundService storageUpdateTaskBoundService0 = this.d;
            Context context0 = storageUpdateTaskBoundService0.getApplicationContext();
            ibuq.e(context0, "getApplicationContext(...)");
            ibuq.e(StorageUpdateTaskBoundService.a, "access$getLogger$cp(...)");
            String s = bube.a(((String)object3), context0, StorageUpdateTaskBoundService.a);
            if(s != null) {
                bubm bubm0 = storageUpdateTaskBoundService0.c;
                if(bubm0 == null) {
                    ibuq.j("storageQuotaSummaryManager");
                    bubm0 = null;
                }
                this.a = object2;
                this.b = 1;
                object0 = bubm0.a(s, this);
                if(object0 == object1) {
                    return object1;
                }
                hith0 = (hith)object0;
            }
        }
        return ibom.a;
    }
}

