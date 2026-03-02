import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import j..util.DesugarCollections;
import java.util.List;
import java.util.Set;

public final class gayy {
    public static final gdqb a(String s) {
        gaxl.a();
        return gdsp.c(s);
    }

    public static final void b(gaym gaym0, gkxq gkxq0, gkxf gkxf0) {
        ibuq.f(gaym0, "<this>");
        ibuq.f(gkxq0, "apiRequestData");
        ibuq.f(gkxf0, "result");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
        gkwx gkwx0 = gkwx.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkxt)hftv0).g = gkwx0.G;
        ((gkxt)hftv0).b |= 4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        gkxq0.getClass();
        ((gkxt)hftv1).d = gkxq0;
        ((gkxt)hftv1).c = 5;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkxt)hftp0.b_message).m = gkxf0.g;
        ((gkxt)hftp0.b_message).b |= 0x40;
        gaym0.f(hftp0);
    }

    public static final void c(gaym gaym0, gkxq gkxq0) {
        ibuq.f(gaym0, "<this>");
        ibuq.f(gkxq0, "apiRequestData");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
        gkwx gkwx0 = gkwx.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkxt)hftv0).g = gkwx0.G;
        ((gkxt)hftv0).b |= 4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkxt gkxt0 = (gkxt)hftp0.b_message;
        gkxq0.getClass();
        gkxt0.d = gkxq0;
        gkxt0.c = 5;
        gaym0.f(hftp0);
    }

    public static final void d(gaym gaym0, gkyh gkyh0) {
        ibuq.f(gkyh0, "redirectEndData");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
        gkwx gkwx0 = gkwx.E;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkxt)hftv0).g = gkwx0.G;
        ((gkxt)hftv0).b |= 4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkxt gkxt0 = (gkxt)hftp0.b_message;
        gkyh0.getClass();
        gkxt0.d = gkyh0;
        gkxt0.c = 34;
        gaym0.f(hftp0);
    }

    public static final void e(gaym gaym0, gkyi gkyi0) {
        ibuq.f(gkyi0, "redirectStartData");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
        gkwx gkwx0 = gkwx.D;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkxt)hftv0).g = gkwx0.G;
        ((gkxt)hftv0).b |= 4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkxt gkxt0 = (gkxt)hftp0.b_message;
        gkyi0.getClass();
        gkxt0.d = gkyi0;
        gkxt0.c = 33;
        gaym0.f(hftp0);
    }

    public static final void f(gaym gaym0, boolean z, gkxf gkxf0) {
        ibuq.f(gaym0, "<this>");
        ibuq.f(gkxf0, "result");
        if(z) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkxt.a).v_newBuilder();
            gkwx gkwx0 = gkwx.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gkxt)hftv0).g = gkwx0.G;
            ((gkxt)hftv0).b |= 4;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gkxt)hftp0.b_message).m = gkxf0.g;
            ((gkxt)hftp0.b_message).b |= 0x40;
            gaym0.f(hftp0);
        }
    }

    public static final void g(Context context0, WidgetConfig widgetConfig0, gaym gaym0, Long long0) {
        gkxh gkxh0;
        ibuq.f(context0, "context");
        ibuq.f(widgetConfig0, "config");
        ibuq.f(gaym0, "eventLogger");
        ibuq.f(context0, "context");
        ibuq.f(widgetConfig0, "widgetConfig");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkym.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        long v = widgetConfig0.j;
        if(Long.compare(v, 0L) != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkym gkym0 = (gkym)hftp0.b_message;
            gkym0.b |= 1;
            gkym0.c = v;
        }
        int v1 = widgetConfig0.s;
        if(v1 != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkym gkym1 = (gkym)hftp0.b_message;
            gkym1.b |= 2;
            gkym1.d = v1;
        }
        String s = widgetConfig0.l;
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkym gkym2 = (gkym)hftp0.b_message;
            s.getClass();
            gkym2.b |= 8;
            gkym2.f = s;
        }
        int v2 = widgetConfig0.t;
        if(v2 != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkym gkym3 = (gkym)hftp0.b_message;
            gkym3.b |= 4;
            gkym3.e = v2;
        }
        int v3 = widgetConfig0.d;
        if(v3 != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkym gkym4 = (gkym)hftp0.b_message;
            gkym4.b |= 16;
            gkym4.g = v3;
        }
        try {
            PackageInfo packageInfo0 = bbsr.b(context0).e(widgetConfig0.l, 0x80);
            String s1 = packageInfo0 == null ? null : packageInfo0.versionName;
            if(!TextUtils.isEmpty(s1) && s1 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkym gkym5 = (gkym)hftp0.b_message;
                gkym5.b |= 0x20;
                gkym5.h = s1;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        String s2 = widgetConfig0.u;
        if(!TextUtils.isEmpty(s2)) {
            ibuq.c(s2);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkym gkym6 = (gkym)hftp0.b_message;
            s2.getClass();
            gkym6.b |= 0x40;
            gkym6.i = s2;
        }
        gaxl.a();
        if(hzmb.a.b().k()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkxs.a).v_newBuilder();
            ibuq.f(hftp1, "builder");
            gkwr gkwr0 = gcuu.a(context0, widgetConfig0.k) ? gkwr.c : gkwr.b;
            ibuq.f(gkwr0, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gkxs)hftp1.b_message).d = gkwr0.d;
            ((gkxs)hftp1.b_message).b |= 2;
            gkwp gkwp0 = gcuu.b(context0) ? gkwp.c : gkwp.b;
            ibuq.f(gkwp0, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gkxs)hftp1.b_message).c = gkwp0.d;
            ((gkxs)hftp1.b_message).b |= 1;
            ProtoLiteMessage hftv0 = hftp1.N_build();
            ibuq.e(hftv0, "build(...)");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            int v4 = 3;
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gkxs)hftv0).getClass();
            ((gkym)hftv1).k = (gkxs)hftv0;
            ((gkym)hftv1).b |= 0x200;
            int v5 = widgetConfig0.c;
            switch(v5) {
                case 0: {
                    v4 = 8;
                    break;
                }
                case 1: {
                    v4 = 14;
                    break;
                }
                case 3: {
                    v4 = 9;
                    break;
                }
                case 4: {
                    v4 = 11;
                    break;
                }
                case 5: {
                    v4 = 13;
                    break;
                }
                default: {
                    if(v5 != 6) {
                        v4 = 7;
                        if(v5 != 7) {
                            switch(v5) {
                                case 10: {
                                    v4 = 18;
                                    break;
                                }
                                case 11: {
                                    v4 = 17;
                                    break;
                                }
                                default: {
                                    v4 = 1;
                                }
                            }
                        }
                    }
                }
            }
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gkym)hftp0.b_message).j = v4 - 1;
            ((gkym)hftp0.b_message).b |= 0x80;
        }
        if(gcvm.a(widgetConfig0.A)) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkyl.a).v_newBuilder();
            ibuq.f(hftp2, "builder");
            switch(widgetConfig0.B) {
                case 0: {
                    gkxh0 = gkxh.e;
                    break;
                }
                case 1: {
                    gkxh0 = gkxh.c;
                    break;
                }
                case 2: {
                    gkxh0 = gkxh.d;
                    break;
                }
                default: {
                    gkxh0 = gkxh.a;
                }
            }
            ibuq.f(gkxh0, "value");
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gkyl)hftp2.b_message).c = gkxh0.f;
            ((gkyl)hftp2.b_message).b |= 1;
            String s3 = widgetConfig0.A;
            ibuq.e(s3, "getSessionResumptionId(...)");
            ibuq.f(s3, "value");
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gkyl gkyl0 = (gkyl)hftp2.b_message;
            s3.getClass();
            gkyl0.b |= 2;
            gkyl0.d = s3;
            ProtoLiteMessage hftv2 = hftp2.N_build();
            ibuq.e(hftv2, "build(...)");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkym gkym7 = (gkym)hftp0.b_message;
            ((gkyl)hftv2).getClass();
            gkym7.l = (gkyl)hftv2;
            gkym7.b |= 0x400;
        }
        if(!TextUtils.isEmpty(widgetConfig0.D)) {
            String s4 = widgetConfig0.D;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkym gkym8 = (gkym)hftp0.b_message;
            s4.getClass();
            gkym8.b |= 0x800;
            gkym8.m = s4;
        }
        ProtoLiteMessage hftv3 = hftp0.N_build();
        ibuq.e(hftv3, "build(...)");
        gkyx gkyx0 = gkyw.a(((ProtoLiteMessage)gkxt.a).v_newBuilder());
        gkyx0.b(gkwx.b);
        if(!ibuq.m(((gkym)hftv3), gkym.a)) {
            ibuq.f(((gkym)hftv3), "value");
            ProtoLiteBuilder hftp3 = gkyx0.a;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gkxt gkxt0 = (gkxt)hftp3.b_message;
            ((gkym)hftv3).getClass();
            gkxt0.d = (gkym)hftv3;
            gkxt0.c = 11;
        }
        if(long0 != null) {
            ProtoLiteBuilder hftp4 = gkyx0.a;
            long v6 = (long)long0;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gkxt gkxt1 = (gkxt)hftp4.b_message;
            gkxt1.b |= 2;
            gkxt1.f = v6;
        }
        gkxt gkxt2 = gkyx0.a();
        ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)gkxt2).jf(5, null);
        hftp5.X(((ProtoLiteMessage)gkxt2));
        ibuq.e(hftp5, "toBuilder(...)");
        gaym0.f(hftp5);
    }

    public static final void h(gaym gaym0, hbye hbye0) {
        ibuq.f(gaym0, "eventLogger");
        ibuq.f(hbye0, "code");
        gkyx gkyx0 = gkyw.a(((ProtoLiteMessage)gkxt.a).v_newBuilder());
        gkyx0.b(gkwx.C);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkyn.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        List list0 = DesugarCollections.unmodifiableList(((gkyn)hftp0.b_message).b);
        ibuq.e(list0, "getTestCodeList(...)");
        new hfxu(list0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkyn gkyn0 = (gkyn)hftp0.b_message;
        hfuf hfuf0 = gkyn0.b;
        if(!hfuf0.c()) {
            gkyn0.b = ProtoLiteMessage.C(hfuf0);
        }
        gkyn0.b.i(hbye0.pi);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gkyn)hftv0), "value");
        ProtoLiteBuilder hftp1 = gkyx0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkxt gkxt0 = (gkxt)hftp1.b_message;
        ((gkyn)hftv0).getClass();
        gkxt0.d = (gkyn)hftv0;
        gkxt0.c = 0x20;
        gkxt gkxt1 = gkyx0.a();
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gkxt1).jf(5, null);
        hftp2.X(((ProtoLiteMessage)gkxt1));
        ibuq.e(hftp2, "toBuilder(...)");
        gaym0.f(hftp2);
    }

    public static final void i(gaym gaym0, String s, Set set0, ibts ibts0) {
        ibuq.f(gaym0, "<this>");
        ibuq.f(s, "errorId");
        ibuq.f(set0, "errorTypes");
        ibuq.f(ibts0, "addMoreInfo");
        gkyx gkyx0 = gkyw.a(((ProtoLiteMessage)gkxt.a).v_newBuilder());
        gkyx0.b(gkwx.w);
        gkzu gkzu0 = gkzt.a(((ProtoLiteMessage)gkyq.b).v_newBuilder());
        gkzu0.b(s);
        gkzu0.d();
        gkzu0.c(set0);
        gkyx0.d(gkzu0.a());
        gkxt gkxt0 = gkyx0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkxt0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkxt0));
        ibuq.e(hftp0, "toBuilder(...)");
        ibts0.a(hftp0);
        gaym0.g(hftp0);
    }

    public static final gaym j(gaxc gaxc0, WidgetConfig widgetConfig0) {
        ibuq.f(widgetConfig0, "config");
        return gaxc0.a(widgetConfig0);
    }
}

