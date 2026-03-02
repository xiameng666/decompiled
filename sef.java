import android.graphics.Bitmap;
import android.os.PersistableBundle;

public final class sef implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        if(persistableBundle0.containsKey("value")) {
            sdb sdb0 = (sdb)sdn.a(persistableBundle0, "value", sdb.a);
            if(sdb0 != null) {
                Bitmap bitmap0 = sdb0.b;
                if(bitmap0 != null) {
                    return new seg(bitmap0);
                }
            }
            throw new IllegalStateException("Missing bitmap resource value");
        }
        String s = persistableBundle0.getString("packageName");
        if(s != null) {
            return new seg(s, persistableBundle0.getInt("resourceId"));
        }
        throw new IllegalStateException("Missing bitmap package name");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

