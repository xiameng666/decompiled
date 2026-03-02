import android.content.Intent;
import android.net.Uri;

public final class eabj implements ibth {
    public final eabn a;

    public eabj(eabn eabn0) {
        this.a = eabn0;
    }

    @Override  // ibth
    public final Object a() {
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(hwsd.I()));
        this.a.startActivity(intent0);
        return ibom.a;
    }
}

