public final class ebwa implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((dyix)object0));
        dyny dyny0 = dynx.a(((ProtoLiteMessage)dynw.a).v_newBuilder());
        int v = ((dyix)object0).b;
        if((v & 1) != 0 && (v & 2) != 0) {
            dymi dymi0 = dymh.a(((ProtoLiteMessage)dymg.a).v_newBuilder());
            String s = ((dyix)object0).d;
            ibuq.e(s, "getCurrency(...)");
            dymi0.b(s);
            String s1 = ((dyix)object0).c;
            ibuq.e(s1, "getAmount(...)");
            dymi0.c(fsgr.b(s1));
            dyny0.b(dymi0.a());
        }
        hfwn hfwn0 = hfyn.j(((dyix)object0).e);
        ibuq.e(hfwn0, "fromSeconds(...)");
        dyny0.e(hfwn0);
        dyny0.d(((dyix)object0).k);
        dyny0.f(dynv.E);
        dynl dynl0 = dynk.a(((ProtoLiteMessage)dynj.a).v_newBuilder());
        dyjg dyjg0 = dyjf.a(((ProtoLiteMessage)dyje.a).v_newBuilder());
        String s2 = ((dyix)object0).h;
        ibuq.e(s2, "getTxnType(...)");
        dyjg0.d(fsgr.h(s2));
        dynm dynm0 = dynm.a;
        dyno dyno0 = dynn.a(((ProtoLiteMessage)dynm0).v_newBuilder());
        dyiw dyiw0 = ((dyix)object0).i;
        if(dyiw0 == null) {
            dyiw0 = dyiw.a;
        }
        String s3 = dyiw0.c;
        ibuq.e(s3, "getEn(...)");
        dyno0.b(s3);
        dyiw dyiw1 = ((dyix)object0).i;
        if(dyiw1 == null) {
            dyiw1 = dyiw.a;
        }
        String s4 = dyiw1.d;
        ibuq.e(s4, "getSc(...)");
        if(s4.length() > 0) {
            dyiw dyiw2 = ((dyix)object0).i;
            if(dyiw2 == null) {
                dyiw2 = dyiw.a;
            }
            String s5 = dyiw2.d;
            ibuq.e(s5, "getSc(...)");
            dyno0.c(s5);
        }
        dyiw dyiw3 = ((dyix)object0).i;
        if(dyiw3 == null) {
            dyiw3 = dyiw.a;
        }
        String s6 = dyiw3.e;
        ibuq.e(s6, "getTc(...)");
        if(s6.length() > 0) {
            dyiw dyiw4 = ((dyix)object0).i;
            if(dyiw4 == null) {
                dyiw4 = dyiw.a;
            }
            String s7 = dyiw4.e;
            ibuq.e(s7, "getTc(...)");
            dyno0.d(s7);
        }
        dyjg0.c(dyno0.a());
        if((((dyix)object0).b & 8) != 0) {
            dyno dyno1 = dynn.a(((ProtoLiteMessage)dynm0).v_newBuilder());
            dyiw dyiw5 = ((dyix)object0).j;
            if(((dyiw5 == null ? dyiw.a : dyiw5).b & 1) != 0) {
                if(dyiw5 == null) {
                    dyiw5 = dyiw.a;
                }
                String s8 = dyiw5.c;
                ibuq.e(s8, "getEn(...)");
                dyno1.b(s8);
            }
            dyiw dyiw6 = ((dyix)object0).j;
            if(((dyiw6 == null ? dyiw.a : dyiw6).b & 2) != 0) {
                if(dyiw6 == null) {
                    dyiw6 = dyiw.a;
                }
                String s9 = dyiw6.d;
                ibuq.e(s9, "getSc(...)");
                dyno1.c(s9);
            }
            dyiw dyiw7 = ((dyix)object0).j;
            if(((dyiw7 == null ? dyiw.a : dyiw7).b & 4) != 0) {
                if(dyiw7 == null) {
                    dyiw7 = dyiw.a;
                }
                String s10 = dyiw7.e;
                ibuq.e(s10, "getTc(...)");
                dyno1.d(s10);
            }
            dyjg0.b(dyno1.a());
        }
        dynl0.b(dyjg0.a());
        dyny0.c(dynl0.a());
        return dyny0.a();
    }
}

