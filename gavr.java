public final class gavr {
    public static final void a(boolean z, String s, gaym gaym0, ibts ibts0, String s1) {
        ibuq.f(s1, "message");
        if(!z) {
            if(gaym0 == null) {
                throw new gavu(s, ibts0, s1, null, new gavs(gavt.a(s, s1), null));
            }
            gayy.i(gaym0, s, gavs.b, ibts0);
            throw new gavs(gavt.a(s, s1), null);
        }
    }

    public static final void b(Object object0, String s, gaym gaym0, ibts ibts0, String s1) {
        ibuq.f(ibts0, "addMoreInfo");
        if(object0 == null) {
            if(gaym0 == null) {
                throw new gavu(s, ibts0, s1, null, new gavs(gavt.a(s, s1), null));
            }
            gayy.i(gaym0, s, gavs.b, ibts0);
            throw new gavs(gavt.a(s, s1), null);
        }
    }

    public static void c(boolean z, String s, gaym gaym0, String s1) {
        gavr.a(z, s, gaym0, gavs.a, s1);
    }

    public static void d(Object object0, String s, gaym gaym0, ibts ibts0, String s1, int v) {
        if((v & 8) != 0) {
            ibts0 = gavs.a;
        }
        if((v & 16) != 0) {
            s1 = null;
        }
        gavr.b(object0, s, gaym0, ibts0, s1);
    }

    public static void e(String s, gaym gaym0, ibts ibts0, String s1, Throwable throwable0, int v) {
        if((v & 4) != 0) {
            ibts0 = gavs.a;
        }
        if((v & 16) != 0) {
            throwable0 = null;
        }
        gavr.f(s, gaym0, ibts0, s1, throwable0);
    }

    public static final void f(String s, gaym gaym0, ibts ibts0, String s1, Throwable throwable0) {
        ibuq.f(ibts0, "addMoreInfo");
        ibuq.f(s1, "message");
        if(gaym0 == null) {
            throw new gavu(s, ibts0, s1, throwable0, new gavs(gavt.a(s, s1), throwable0));
        }
        gayy.i(gaym0, s, gavs.b, ibts0);
        throw new gavs(gavt.a(s, s1), throwable0);
    }
}

