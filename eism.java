import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Iterator;

public final class eism implements gful_cronetEngineProvider {
    public final Context a;
    public final ggfp b;

    public eism(Context context0, ggfp ggfp0) {
        this.a = context0;
        this.b = ggfp0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        String s;
        Context context0 = this.a;
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/service/operations/RegistrationCommon", "getDeclarativeRegistrationInfoMap", 460, "Read Bulk Resources")) {
            ggek ggek0 = new ggek();
            Iterator iterator0 = this.b.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return ggek0.g();
                }
                Object object0 = iterator0.next();
                s = (String)object0;
                try {
                    ggqk ggqk0 = new fprr(context0.getPackageManager()).a(context0.getPackageManager().getPackageInfo(s, 0x80)).E();
                label_15:
                    if(!ggqk0.hasNext()) {
                        continue;
                    }
                    Object object1 = ggqk0.next();
                    gocn gocn0 = (gocn)object1;
                    String s1 = gocn0.g;
                    String s2 = "";
                    if(gocn0.e == 7) {
                        s2 = (String)gocn0.f;
                    }
                    ggek0.i(new eiso(s1, s2), gocn0);
                    goto label_15;
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                }
                break;
            }
            throw new eipa(29500, s + " not found!.", packageManager$NameNotFoundException0);
        }
    }
}

