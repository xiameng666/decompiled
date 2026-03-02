import android.os.PersistableBundle;
import java.util.ArrayList;

public final class ruh implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        ArrayList arrayList0 = new ArrayList();
        int v1 = persistableBundle0.getInt("numOfChildren", 0);
        for(int v = 0; v < v1; ++v) {
            Object object0 = sdn.a(persistableBundle0, "childMetadata_" + v, rui.a);
            ibuq.c(object0);
            arrayList0.add(object0);
        }
        return new rui(((sei)sdn.a(persistableBundle0, "header", sei.a)), ((sei)sdn.a(persistableBundle0, "description", sei.a)), ((seg)sdn.a(persistableBundle0, "icon", seg.a)), arrayList0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

