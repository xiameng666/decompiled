import java.util.Set;

public final class gavs extends RuntimeException {
    public static final ibts a;
    public static final Set b;
    public static final Set c;

    static {
        gavs.a = new gavq();
        gavs.b = ibqg.b(gkxl.b);
        gavs.c = ibqg.b(gkxl.c);
    }

    public gavs(String s) {
        ibuq.f(s, "message");
        super(s);
    }

    public gavs(String s, Throwable throwable0) {
        ibuq.f(s, "message");
        super(s, throwable0);
    }

    public static final Object a(String s, gaym gaym0, ibth ibth0) {
        ibuq.f(gaym0, "eventLogger");
        ibts ibts0 = gavs.a;
        try {
            return ibth0.a();
        }
        catch(Throwable throwable0) {
            if(!(throwable0 instanceof gavn)) {
                if(!(throwable0 instanceof gavu)) {
                    if((throwable0 instanceof gavs)) {
                        throw throwable0;
                    }
                    gayy.i(gaym0, s, gavs.b, ibts0);
                    throw new gavs(s, throwable0);
                }
                ((gavu)throwable0).a(gaym0);
                throw ((gavu)throwable0).a;
            }
            ((gavn)throwable0).a(gaym0);
            throw new gavs(s, throwable0);
        }
    }

    public static final Object b(String s, gaym gaym0, ibts ibts0, ibth ibth0) {
        ibuq.f(gaym0, "eventLogger");
        try {
            return ibth0.a();
        }
        catch(Throwable throwable0) {
            if(!(throwable0 instanceof gavn)) {
                if(!(throwable0 instanceof gavu)) {
                    if((throwable0 instanceof gavs)) {
                        throw throwable0;
                    }
                    gayy.i(gaym0, s, gavs.b, ibts0);
                    throw new gavs(s, throwable0);
                }
                ((gavu)throwable0).a(gaym0);
                throw ((gavu)throwable0).a;
            }
            ((gavn)throwable0).a(gaym0);
            throw new gavs(s, throwable0);
        }
    }

    public static final void c(boolean z, String s, gaym gaym0, String s1) {
        ibuq.f(s1, "message");
        gavr.c(z, s, gaym0, s1);
    }

    public static final void d(String s, gaym gaym0, String s1) {
        ibuq.f(s1, "message");
        gavr.e(s, gaym0, null, s1, null, 20);
    }

    public static final void e(String s, gaym gaym0, ibts ibts0, String s1) {
        ibuq.f(s1, "message");
        gavr.e(s, gaym0, ibts0, s1, null, 16);
    }

    public static final void f(Object object0, String s, gaym gaym0, ibts ibts0) {
        ibuq.f(gaym0, "eventLogger");
        ibuq.f(gaym0, "eventLogger");
        if(object0 != null) {
            return;
        }
        ibuq.f(gaym0, "<this>");
        ibuq.f(gavs.b, "errorTypes");
        gkyx gkyx0 = gkyw.a(((ProtoLiteMessage)gkxt.a).v_newBuilder());
        gkyx0.b(gkwx.w);
        gkzu gkzu0 = gkzt.a(((ProtoLiteMessage)gkyq.b).v_newBuilder());
        gkzu0.b(s);
        gkzu0.d();
        gkzu0.c(gavs.b);
        gkyx0.d(gkzu0.a());
        gkxt gkxt0 = gkyx0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkxt0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkxt0));
        ibuq.e(hftp0, "toBuilder(...)");
        ibts0.a(hftp0);
        gaym0.g(hftp0);
        throw new gavs(gavt.a(s, null));
    }

    public static final void g(Object object0, String s, gaym gaym0) {
        gavr.d(object0, s, gaym0, null, null, 24);
    }

    public static final void h(Object object0, String s, gaym gaym0, ibts ibts0) {
        gavr.d(object0, s, gaym0, ibts0, null, 16);
    }
}

