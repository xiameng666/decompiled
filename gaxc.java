import android.content.Context;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gaxc {
    public final Context a;

    public gaxc(Context context0) {
        this.a = context0;
    }

    public final gaym a(WidgetConfig widgetConfig0) {
        ibuq.f(widgetConfig0, "widgetConfig");
        ayud ayud0 = gaxg.a(widgetConfig0.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbbh.a).v_newBuilder();
        int v = widgetConfig0.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbbh fbbh0 = (fbbh)hftp0.b_message;
        fbbh0.b |= 2;
        fbbh0.d = v;
        String s = widgetConfig0.c();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((fbbh)hftv0).b |= 1;
        ((fbbh)hftv0).c = s;
        long v1 = widgetConfig0.q;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fbbh fbbh1 = (fbbh)hftp0.b_message;
        fbbh1.b |= 4;
        fbbh1.e = v1;
        fbbh fbbh2 = (fbbh)hftp0.N_build();
        fbap fbap0 = new fbap(this.a, fbbh2);
        ibuq.f(this.a, "appContext");
        ibuq.f(ayud0, "clearcutLogger");
        ibuq.f(widgetConfig0, "config");
        long v2 = widgetConfig0.q;
        Long long0 = widgetConfig0.r;
        String s1 = widgetConfig0.c();
        ibuq.e(s1, "getAccountName(...)");
        return new gaye(this.a, ayud0, fbap0, v2, long0, s1, widgetConfig0.m);
    }
}

