import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Build;
import android.view.Display;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

final class furq extends ibsl implements ibtw {
    final furs a;
    final Map b;
    final View c;
    final ibvd d;

    public furq(furs furs0, Map map0, View view0, ibvd ibvd0, ibrl ibrl0) {
        this.a = furs0;
        this.b = map0;
        this.c = view0;
        this.d = ibvd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((furq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new furq(this.a, this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        for(Object object1: this.a.c) {
            furt furt0 = (furt)object1;
        }
        Map map0 = this.b;
        String s = Build.VERSION.RELEASE;
        ibuq.e(s, "RELEASE");
        map0.put("os_version", s);
        String s1 = Build.VERSION.INCREMENTAL;
        ibuq.e(s1, "INCREMENTAL");
        map0.put("os_version_incremental", s1);
        map0.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        String s2 = Build.DEVICE;
        ibuq.e(s2, "DEVICE");
        map0.put("device", s2);
        String s3 = Build.MODEL;
        ibuq.e(s3, "MODEL");
        map0.put("model", s3);
        String s4 = Build.PRODUCT;
        ibuq.e(s4, "PRODUCT");
        map0.put("product", s4);
        View view0 = this.c;
        Display display0 = view0.getDisplay();
        if(display0 != null) {
            Point point0 = new Point();
            display0.getSize(point0);
            map0.put("display_width", String.valueOf(point0.x));
            map0.put("display_height", String.valueOf(point0.y));
            String s5 = (String)map0.put("rotation", String.valueOf(display0.getRotation()));
        }
        map0.put("package", "com.google.android.gms");
        try {
            String s6 = view0.getContext().getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
            if(s6 != null) {
                String s7 = (String)map0.put("app_version", s6);
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.a.a(this.c, linkedHashMap0);
        ibvd ibvd0 = this.d;
        ibvd0.a = this.a.b(this.c, 0, 0, linkedHashMap0);
        for(Object object2: this.a.c) {
            furt furt1 = (furt)object2;
            furw furw0 = (furw)ibvd0.a;
            ibuq.f(furw0, "root");
            ibvd0.a = furw0;
        }
        return ibom.a;
    }
}

