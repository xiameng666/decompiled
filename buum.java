import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import j..util.DesugarCollections;
import java.util.Map.Entry;
import java.util.Map;

public final class buum implements fnkt {
    private static final String a;
    private final fnfm b;
    private final gfsx c;

    static {
        buum.a = fnkt.class.getSimpleName();
    }

    public buum(fnfm fnfm0, gfsx gfsx0) {
        this.b = fnfm0;
        this.c = gfsx0;
    }

    @Override  // fnkt
    public final void a(View view0, Object object0) {
        Object object2;
        if(object0 == null) {
            return;
        }
        fnfm fnfm0 = this.b;
        if(!fnfm0.j(object0)) {
            Log.i(buum.a, "showMyAccount called with non-Gaia account");
            return;
        }
        String s = fnfm0.d(object0);
        grxu grxu0 = (grxu)((ProtoLiteMessage)grxw.a).v_newBuilder();
        if(!grxu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grxu0).ensureMutable();
        }
        grxw grxw0 = (grxw)grxu0.b_message;
        grxw0.b |= 1;
        grxw0.c = 1;
        grxw grxw1 = (grxw)((ProtoLiteBuilder)grxu0).N_build();
        buvl buvl0 = new buvl();
        gfsx gfsx0 = this.c.b(buvl0);
        ibuq.f(s, "accountId");
        ibuq.f(grxw1, "resourceKey");
        ibuq.f(gsac.a, "themeChoice");
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P");
        intent0.setPackage("com.google.android.gms").putExtra("extra.screenId", grxw1.c).putExtra("extra.utmSource", "OG").putExtra("extra.accountName", s).putExtra("extra.themeChoice", gsac.a.d);
        Map map0 = DesugarCollections.unmodifiableMap(grxw1.d);
        ibuq.e(map0, "getResourceParamsMap(...)");
        for(Object object1: map0.entrySet()) {
            String s1 = (String)((Map.Entry)object1).getKey();
            String s2 = (String)((Map.Entry)object1).getValue();
            ibuq.c(s1);
            intent0.putExtra("extra.screen." + s1, s2);
        }
        if(hoju.n() && Build.VERSION.SDK_INT >= 0x20) {
            intent0.addFlags(0x10000000);
        }
        String s3 = (String)gfsx0.g();
        if(s3 != null) {
            intent0.putExtra("extra.utmMedium", s3);
        }
        Context context0 = view0.getContext();
        gftb.z(context0, "context cannot be null");
        for(int v = 0; true; ++v) {
            object2 = null;
            if(v >= 1000) {
                break;
            }
            Class class0 = Activity.class;
            if(class0.isInstance(context0)) {
                object2 = class0.cast(context0);
                break;
            }
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
        }
        gftb.check(((Activity)object2));
        ((Activity)object2).startActivityForResult(intent0, 0xC884);
    }
}

