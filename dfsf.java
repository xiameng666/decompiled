import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public final class dfsf extends ibsl implements ibtw {
    Object a;
    final dfsg b;

    public dfsf(dfsg dfsg0, ibrl ibrl0) {
        this.b = dfsg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfsf)this.c(((dfry)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dfsf(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dfry dfry0 = (dfry)this.a;
        Object[] arr_object = {dfry0.a()};
        Context context0 = this.b.a;
        Toast.makeText(context0, context0.getString(dfry0.a, arr_object), 1).show();
        if((dfry0 instanceof dfrw)) {
            Intent intent0 = new Intent("android.settings.WIFI_SETTINGS");
            intent0.addFlags(0x10000000);
            intent0.addFlags(0x8000);
            context0.startActivity(intent0);
        }
        return ibom.a;
    }
}

