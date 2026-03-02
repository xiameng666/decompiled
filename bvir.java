import android.content.Intent;
import android.os.Build.VERSION;

final class bvir extends ibsl implements ibtw {
    Object a;
    int b;
    final bvkk c;
    final cmdi d;

    public bvir(bvkk bvkk0, cmdi cmdi0, ibrl ibrl0) {
        this.c = bvkk0;
        this.d = cmdi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvir)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvir(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            goto label_12;
        }
        ibnx.b(object0);
        cmdi cmdi0 = this.d;
        this.a = cmdi0;
        this.b = 1;
        object0 = this.c.b(this);
        if(object0 != object1) {
            object2 = cmdi0;
        label_12:
            ibuq.f(object2, "launcher");
            Intent intent0 = new Intent();
            intent0.setPackage("com.google.android.gms");
            intent0.setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P");
            intent0.putExtra("extra.screenId", 1);
            if(Build.VERSION.SDK_INT >= 0x20) {
                intent0.addFlags(0x10000000);
            }
            if(((String)object0) != null) {
                intent0.putExtra("extra.accountName", ((String)object0));
            }
            cmdh.a(((cmdi)object2), intent0);
            return ibom.a;
        }
        return object1;
    }
}

