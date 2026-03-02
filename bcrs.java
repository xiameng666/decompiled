import jeb.synthetic.FIN;

public final class bcrs implements Runnable {
    public final bcrv a;
    public final String b;

    public bcrs(bcrv bcrv0, String s) {
        this.a = bcrv0;
        this.b = s;
    }

    @Override
    public final void run() {
        int v1;
        hobr hobr0;
        int v;
        Object object0;
        hofs hofs1;
        bcrv bcrv0;
        try {
            bcrv0 = this.a;
            hofs hofs0 = bcrv0.b();
            hobo hobo0 = bcrv.k(this.b, 2);
            hofs1 = bcrv0.b.j(bcrv0.c, hofs0, hobo0);
            object0 = bcrv0.e;
            __monitor_enter(object0);
            v = FIN.finallyOpen$NT();
            bcrg.e();
            if(bcrg.c(hofs1)) {
                hoer hoer0 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
                hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
                hobr0 = hobj0.c == 8 ? ((hobr)hobj0.d) : hobr.a;
                v1 = 1;
                __monitor_enter(object0);
                goto label_20;
            }
            else {
                bcrg.e();
                if(bcrg.d(hofs1)) {
                    bcrv.a.d("Received verified verification.", new Object[0]);
                }
                else {
                    bcrv.a.d("Received verification with none or unknown state.", new Object[0]);
                }
            }
            goto label_53;
        }
        catch(bcrc bcrc0) {
            goto label_59;
        }
        try {
        label_20:
            boolean z = hobr0 != null && (hobq.b(hobr0.c) != 2 && hobr0.d.size() == hobr0.e.size() && hobr0.b.size() > 0 && (hobr0.d.size() == 0 || hobr0.d.size() > 0 && hobq.b(hobr0.c) == 3 && ((hobk)hobr0.d.get(hobr0.d.size() - 1)).b.equals(bcrv0.c()) || hobq.b(hobr0.c) == 4));
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        try {
            __monitor_exit(object0);
            if(z) {
                goto label_27;
            label_25:
                __monitor_exit(object0);
                throw throwable0;
            label_27:
                int v2 = hobr0.c;
                if(hobq.b(v2) == 3 || hobq.b(v2) == 4) {
                    baun baun0 = bcrv.a;
                    int v3 = hobq.b(v2);
                    if(v3 != 0) {
                        v1 = v3;
                    }
                    baun0.d("Received pending verification with state: %d.", new Object[]{hobq.a(v1)});
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hofs1).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)hofs1));
                    bcrv0.f = (hofq)hftp0;
                    if(hobq.b(hobr0.c) == 3) {
                        hocd hocd0 = (hocd)hobr0.b.get(0);
                        hoer hoer1 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
                        hobj hobj1 = hoer1.c == null ? hobj.a : hoer1.c;
                        hobr hobr1 = hobj1.c == 8 ? ((hobr)hobj1.d) : hobr.a;
                        bcrv0.j(hocd0, (hobr1.f > 0L ? hobr1.f : hrfs.a.e().h()));
                    }
                    else {
                        bcrv0.d.c(bcrv0.h);
                    }
                    FIN.finallyExec$NT(v);
                    return;
                }
            }
            hoer hoer2 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
            if((hoer2.c == null ? hobj.a : hoer2.c).c == 8) {
                bcrv.a.d("Received bad pending flash call verification.", new Object[0]);
                bcrv0.g = gmfx.aw;
            }
            else {
                bcrv.a.d("Received follow up verification.", new Object[0]);
            }
        label_53:
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            bcrv0.i(hofs1);
        }
        catch(bcrc bcrc0) {
        label_59:
            bcrv.a.g("Rpc exception.", bcrc0, new Object[0]);
            synchronized(bcrv0.e) {
                bcrv0.g = gmfx.az;
            }
            bcrv0.h();
        }
    }
}

