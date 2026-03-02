import android.content.Intent;
import android.net.Uri;

final class cafd extends ibuo implements ibth {
    public cafd(Object object0) {
        super(0, object0, cafj.class, "onVisitResourcesClick", "onVisitResourcesClick()V", 0);
    }

    @Override  // ibth
    public final Object a() {
        cafj cafj0 = (cafj)this.e;
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(huht.d()));
        intent0.addFlags(0x10000000);
        cafj0.b.startActivity(intent0);
        return ibom.a;
    }
}

