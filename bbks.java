public final class bbks {
    public static gdpv a(Object object0, gdpv gdpv0) {
        if(gdpv0 == object0) {
            return gdpv0;
        }
        if((object0 instanceof bbkq)) {
            bbks.e(gdpv0);
            gdqu gdqu0 = bsag.f();
            gdqg gdqg0 = bsag.d(((bbkq)object0).a, false, false);
            gftb.check(gdsq.a);
            gdqg gdqg1 = gdqg.e(((gdqg)gdqu0.b.get()), gdqg0);
            gdpv gdpv1 = gdqu0.a.a(((bbkq)object0).b, gdqg1, gdqu0.d, "com/google/android/gms/common/threads/AutoPropagation$LazyTrace", "enterTraceFrom", 0xC1);
            if(((bbkq)object0).c) {
                brzd brzd0 = bsag.h();
                if((brzd0 instanceof brzd)) {
                    brzd0.c = true;
                }
            }
            return gdpv1;
        }
        gdsp.b(((gdpv)object0), gdsq.a);
        return (gdpv)object0;
    }

    public static gdpv b() {
        return gdsp.a(gdsq.a);
    }

    public static Object c(String s) {
        brvu brvu0 = bsag.c();
        if(brvu0 != null) {
            brzd brzd0 = bsag.h();
            return (brzd0 instanceof brzd) ? new bbkq(brvu0, s, brzd0.c) : new bbkq(brvu0, s, false);
        }
        return null;
    }

    public static void d(Throwable throwable0) {
        try {
            throwable0.addSuppressed(gdsj.a());
        }
        catch(Throwable throwable1) {
            if(throwable0 != throwable1) {
                try {
                    throwable0.addSuppressed(throwable1);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    static void e(gdpv gdpv0) {
        if(gdpv0 != null) {
            gdsp.b(null, gdsq.a);
        }
    }
}

