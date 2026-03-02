import android.os.Bundle;
import java.util.List;

public final class fcqu implements gfsi {
    public final List a;
    public final int b;

    public fcqu(int v, List list0) {
        this.b = v;
        this.a = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        baun baun0 = fcqe.a;
        baun0.h("convertDocumentsResponseToSetupOptions: %d groups", new Object[]{((feuo)object0).b.size()});
        ggdy ggdy0 = new ggdy();
        for(Object object1: ((feuo)object0).b) {
            baun0.j("convertDocumentsResponseToSetupOptions: adding group %s", new Object[]{((feul)object1).a});
            for(Object object2: ((feul)object1).c) {
                baun0.j("convertDocumentsResponseToSetupOptions: adding document %s", new Object[]{((feum)object2).b});
                ggdy0.i(((feum)object2).s);
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        int v = ((ggna)gged0).c;
        baun0.h("convertDocumentsResponseToSetupOptions: %d documents", new Object[]{v});
        if(this.b == 1) {
            List list0 = this.a;
            ggdy ggdy1 = new ggdy();
            baun0.h("Marking %d apps high priority", new Object[]{list0.size()});
            for(int v1 = 0; v1 < v; ++v1) {
                Bundle bundle0 = (Bundle)gged0.get(v1);
                Bundle bundle1 = new Bundle(bundle0);
                String s = bundle0.getString("package_name");
                if(list0.contains(s)) {
                    baun0.j("Package %s is high priority", new Object[]{s});
                    bundle1.putBoolean("install_before_setup_complete", true);
                    bundle1.putInt("network_type", 1);
                }
                else {
                    baun0.j("setHighPriorityAppsToInstallDuringSetup: package %s is NOT high priority", new Object[]{s});
                    bundle1.putBoolean("install_before_setup_complete", false);
                    bundle1.putInt("network_type", 0);
                }
                ggdy1.i(bundle1);
            }
            gged0 = ggdy1.h();
        }
        return fcqe.a(gged0);
    }
}

