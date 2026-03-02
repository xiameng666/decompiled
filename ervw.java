import android.content.Intent;
import android.net.Uri;

final class ervw extends ibuo implements ibth {
    public ervw(Object object0) {
        super(0, object0, erwq.class, "onVisitResourcesClick", "onVisitResourcesClick()V", 0);
    }

    @Override  // ibth
    public final Object a() {
        erwq erwq0 = (erwq)this.e;
        cmhh.a(erwq0.d, 0x3DBAD, null, 6);
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(hykh.a.b().c()));
        intent0.addFlags(0x10000000);
        erwq0.c.startActivity(intent0);
        return ibom.a;
    }
}

