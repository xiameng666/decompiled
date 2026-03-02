import android.content.Intent;
import android.os.Bundle;
import java.util.Set;

public final class ehpu {
    public static final int a;
    private static final ehps b;
    private static final Set c;

    static {
        ehpu.b = new ehpt();
        ehpu.c = ibqg.c(new String[]{"android.intent.action.MANAGE_PERMISSION_USAGE", "android.intent.action.VIEW_APP_FEATURES", "com.google.android.gms.permissions.ACTION_MANAGE_SERVICE"});
    }

    public static final void a(Intent intent0, cmec cmec0) {
        cmfo cmfo0;
        ibuq.f(intent0, "intent");
        ibuq.f(cmec0, "gmsCoreMetrics");
        cmeb cmeb0 = cmec0.c(0x26088);
        cmgm cmgm0 = cmgl.a(((ProtoLiteMessage)cmfs.a).v_newBuilder());
        cmgk cmgk0 = cmgj.a(((ProtoLiteMessage)cmfp.a).v_newBuilder());
        if(ibuq.m(intent0.getAction(), "com.google.android.gms.permissions.ACTION_MANAGE_SERVICE")) {
            cmfo0 = cmfo.e;
        }
        else if(ibuq.m(intent0.getAction(), "android.intent.action.VIEW_APP_FEATURES")) {
            cmfo0 = cmfo.b;
        }
        else if(ibuq.m(intent0.getAction(), "android.intent.action.MANAGE_PERMISSION_USAGE")) {
            cmfo0 = intent0.getLongExtra("android.intent.extra.START_TIME", -1L) == -1L ? cmfo.d : cmfo.c;
        }
        else {
            cmfo0 = cmfo.a;
        }
        ibuq.f(cmfo0, "value");
        ProtoLiteBuilder hftp0 = cmgk0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((cmfp)hftp0.b_message).e = cmfo0.f;
        ((cmfp)hftp0.b_message).b |= 4;
        gljk gljk0 = (gljk)bazo.a().get(intent0.getStringExtra("android.intent.extra.PERMISSION_GROUP_NAME"));
        if(gljk0 == null) {
            gljk0 = gljk.a;
        }
        ibuq.f(gljk0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((cmfp)hftp0.b_message).g = gljk0.t;
        ((cmfp)hftp0.b_message).b |= 16;
        hgiq hgiq0 = ehpu.c(intent0);
        ibuq.f(hgiq0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cmfp cmfp0 = (cmfp)hftp0.b_message;
        cmfp0.f = hgiq0.a();
        cmfp0.b |= 8;
        cmgm0.c(cmgk0.a());
        cmeb0.d(cmgm0.a());
        cmeb0.f();
    }

    public static final Bundle b(Intent intent0) {
        ibuq.f(intent0, "intent");
        int v = ehpu.c(intent0).a();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("UserServiceId", v);
        return bundle0;
    }

    private static final hgiq c(Intent intent0) {
        String s = intent0.getAction();
        gftb.g(ibpo.aB(ehpu.c, s), "Found invalid intent action for All services : " + intent0.getAction(), new Object[0]);
        if(ibuq.m(intent0.getAction(), "com.google.android.gms.permissions.ACTION_MANAGE_SERVICE")) {
            hgiq hgiq0 = hgiq.b(intent0.getIntExtra("com.google.android.gms.permissions.EXTRA_SERVICE_ID_INT", -1));
            return hgiq0 == null ? hgiq.a : hgiq0;
        }
        String[] arr_s = intent0.getStringArrayExtra("android.intent.extra.ATTRIBUTION_TAGS");
        hgiq hgiq1 = ehpu.b.a(arr_s);
        return hgiq1 == null ? hgiq.a : hgiq1;
    }
}

