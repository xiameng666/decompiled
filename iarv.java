import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public final class iarv implements Callable {
    public final iasc a;

    public iarv(iasc iasc0) {
        this.a = iasc0;
    }

    @Override
    public final Object call() {
        iasc iasc0 = this.a;
        PackageManager packageManager0 = iasc0.d.getPackageManager();
        Intent intent0 = iasc0.b;
        List list0 = packageManager0.queryIntentServices(intent0, 0x10000000);
        if(list0 == null || list0.isEmpty()) {
            throw new iapl(iapk.o.f("Service not found for intent " + intent0));
        }
        Intent intent1 = new Intent();
        intent1.setAction(intent0.getAction());
        intent1.setData(intent0.getData());
        Set set0 = intent0.getCategories();
        if(set0 != null) {
            for(Object object0: set0) {
                intent1.addCategory(((String)object0));
            }
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: list0) {
            intent1.setComponent(new ComponentName(((ResolveInfo)object1).serviceInfo.packageName, ((ResolveInfo)object1).serviceInfo.name));
            Intent intent2 = intent1.cloneFilter();
            gftb.r(intent2 != null, "Required property \'bindIntent\' unset");
            arrayList0.add(new ialw(new iaql(intent2, iasc0.c), iasc.a));
        }
        iaor iaor0 = new iaor();
        iaor0.a = new iapm(null, arrayList0);
        iaor0.c = iasc0.g.a(ggnf.a);
        return iaor0.a();
    }
}

