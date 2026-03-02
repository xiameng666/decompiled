public final class atli implements Runnable {
    public final wpq a;
    public final atmb b;
    public final atmd c;
    public final wpm d;

    public atli(wpq wpq0, atmb atmb0, atmd atmd0, wpm wpm0) {
        this.a = wpq0;
        this.b = atmb0;
        this.c = atmd0;
        this.d = wpm0;
    }

    @Override
    public final void run() {
        boolean z1;
        wpq wpq0 = this.a;
        if(!wpq0.b.isEmpty()) {
            atmb atmb0 = this.b;
            if(wpq0.b.size() != 1) {
                atll.a.m("Expected 1 event but got %d", new Object[]{wpq0.b.size()});
                atmb0.a(gifh.i, "Got multiple events in one impulse request");
            }
            wpm wpm0 = this.d;
            atmd atmd0 = this.c;
            atll.b(atmd0, atmb0);
            wpp wpp0 = (wpp)wpq0.b.get(0);
            int v = wpp0.b;
            int v1 = 2;
            if((v & 4) != 0) {
                baun baun0 = atll.a;
                baun0.j("Received drop box entry, package name: %s", new Object[]{(wpp0.d == null ? ar.a : wpp0.d).b});
                ar ar0 = wpp0.d;
                String s = (ar0 == null ? ar.a : ar0).b;
                if(ar0 == null) {
                    ar0 = ar.a;
                }
                long v2 = ar0.c;
                if(atmd0.g(s)) {
                    boolean z = atmd0.f(s);
                    int v3 = atmd0.h(s);
                    if(v3 != 2) {
                        z1 = false;
                        v1 = v3;
                    }
                    else if(v2 - atmd0.a(s) <= hqlt.c()) {
                        z1 = true;
                    }
                    else {
                        z1 = false;
                    }
                    if(v1 != 1 && !z1) {
                        baun0.j("Ignore crash as it\'s above data cleanup threshold from first app open event.", new Object[0]);
                        atmd0.i(s, 5);
                        atmb0.d(s, gifh.i, Boolean.valueOf(z), "unregistered: crash after time threshold");
                    }
                    else if(z) {
                        atmd0.i(s, 4);
                        baun0.j("Package %s status changed to DATA_RESET", new Object[]{s});
                        baun0.h("Calling Pixel Impulse service to clear user data", new Object[0]);
                        atmb0.d(s, gifh.m, Boolean.valueOf(true), "app state on crash - " + atlm.a(v1));
                        long v4 = hqlt.a.o().b();
                        ibuq.f(s, "packageName");
                        wpo wpo0 = new wpo(wpm0, s, z1, v4, null);
                        gmbu.t(icpu.e(wpm0.d, wpo0), new atlk(atmb0, s), atll.b);
                    }
                    else {
                        atmb0.d(s, gifh.o, Boolean.valueOf(false), "app state on crash - " + atlm.a(v1));
                        atmd0.i(s, 5);
                    }
                }
                else {
                    atmb0.b(s, gifh.i, "Can not find app info in db on app crash");
                }
            }
            else if((v & 2) == 0) {
                atll.a.f("Received unexpected event type from Pixel Impulse", new Object[0]);
            }
            else {
                baun baun1 = atll.a;
                baun1.j("Received uid importance entry, package name: %s, importance: %d", new Object[]{(wpp0.c == null ? d.a : wpp0.c).c, ((int)(wpp0.c == null ? d.a : wpp0.c).b)});
                d d0 = wpp0.c;
                if((d0 == null ? d.a : d0).b == 100) {
                    String s1 = (d0 == null ? d.a : d0).c;
                    if(d0 == null) {
                        d0 = d.a;
                    }
                    long v5 = d0.d;
                    if(atmd0.g(s1)) {
                        int v6 = atmd0.h(s1);
                        boolean z2 = atmd0.f(s1);
                        if(v6 == 1) {
                            atmd0.d(s1, v5);
                            atmb0.c(s1, gifh.k, z2);
                            baun1.j("Package %s status changed from RESTORED to FIRST_OPEN ", new Object[]{s1});
                        }
                        else if(v6 != 2) {
                            baun1.j("Received unexpected app open event", new Object[0]);
                            atmd0.i(s1, 5);
                            gifh gifh0 = gifh.i;
                            Boolean boolean0 = Boolean.valueOf(z2);
                            String s2 = atlm.a(v6);
                            if(v6 == 0) {
                                throw null;
                            }
                            atmb0.d(s1, gifh0, boolean0, "unregistered: received unexpected app open event, app was in state " + s2);
                            atll.d(atmd0.c(), wpm0);
                            return;
                        }
                        else if(v5 - atmd0.a(s1) > hqlt.c()) {
                            atmd0.i(s1, 3);
                            baun1.j("Package %s status changed from FIRST_OPENED to CHECK_PASSED ", new Object[]{s1});
                            atmb0.c(s1, gifh.l, z2);
                        }
                        else {
                            baun1.j("Still in first open session.", new Object[0]);
                        }
                    }
                    else {
                        atmb0.b(s1, gifh.i, "Can not find app info in db on app open");
                    }
                }
                else {
                    baun1.j("Ignored this uid importance event as it happends on the background.", new Object[0]);
                }
            }
            atll.d(atmd0.c(), wpm0);
            return;
        }
        atll.a.f("No events received", new Object[0]);
    }
}

