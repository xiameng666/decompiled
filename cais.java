import android.content.Intent;
import android.net.Uri;

final class cais extends ibuo implements ibth {
    public cais(Object object0) {
        super(0, object0, caiy.class, "onVisitResourcesClick", "onVisitResourcesClick()V", 0);
    }

    @Override  // ibth
    public final Object a() {
        caiy caiy0 = (caiy)this.e;
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(huht.d()));
        intent0.addFlags(0x10000000);
        caiy0.a.startActivity(intent0);
        return ibom.a;
    }
}

