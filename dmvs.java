import android.content.Intent;
import android.net.Uri;

public final class dmvs implements ibth {
    public final dmwr a;
    public final hkgs b;

    public dmvs(dmwr dmwr0, hkgs hkgs0) {
        this.a = dmwr0;
        this.b = hkgs0;
    }

    @Override  // ibth
    public final Object a() {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        String s = this.b.e;
        ibuq.e(s, "getPrivacyUrl(...)");
        Intent intent1 = intent0.setData(Uri.parse(s));
        this.a.startActivity(intent1);
        return ibom.a;
    }
}

