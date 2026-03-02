import java.util.ArrayList;

public final class gbbs {
    static gbbr a(hdrl hdrl0, gbbr gbbr0, byi byi0, gbpb gbpb0) {
        if(hdrl0.g == 0xE11D56F) {
            gbbr gbbr1 = (gbbr)byi0.d(hdrl0.c);
            long v = hdrl0.c;
            gavr.b(gbbr1, "BE_PPU_01", null, new gayx(v), String.format("The referenced node %s does not exist in current page.", v));
            gbbr gbbr2 = gbbr1.a;
            if(gbbr2 != null) {
                ArrayList arrayList0 = gbbr2.b;
                if(arrayList0 != null) {
                    arrayList0.remove(gbbr1);
                    gbbr1.a = null;
                }
                gbbr2.c();
            }
            if(gbbr0 == null) {
                return gbbr1;
            }
            gbbr0.a(gbbr1);
            gbbr0.c();
            return gbbr1;
        }
        gbbr gbbr3 = new gbbr(hdrl0);
        byi0.h(hdrl0.c, gbbr3);
        if(gbbr0 != null) {
            gbbr0.a(gbbr3);
        }
        gbbr3.b();
        for(Object object0: gbpb.a(hdrl0)) {
            gbbs.a(((hdrl)object0), gbbr3, byi0, gbpb0);
        }
        return gbbr3;
    }

    public static hcnu b(gbpa gbpa0, hcnu hcnu0, hcos hcos0, boolean z) {
        if(hcos0 == null) {
            return hcnu0;
        }
        hcos hcos1 = hcnu0.c == null ? hcos.a : hcnu0.c;
        if(z) {
            hfta hfta0 = gbpa0.a.b(((MessageLite)hcos.a), hcos1.f);
            if(hfta0 != null) {
                hcos1.f(hfta0);
                Object object0 = hcos1.s.k(hfta0.d);
                Object object1 = object0 == null ? hfta0.b : hfta0.d(object0);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcos0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hcos0));
                int v = hfta0.a();
                if(!((hftr)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((hftr)hftp0))).ensureMutable();
                }
                hcos hcos2 = (hcos)((hftr)hftp0).b_message;
                hcos2.b |= 16;
                hcos2.f = v;
                ((hftr)hftp0).n(hfta0, object1);
                hcos0 = (hcos)((ProtoLiteBuilder)(((hftr)hftp0))).N_build();
            }
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hcnu0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)hcnu0));
        if(!((hftr)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hftr)hftp1))).ensureMutable();
        }
        hcnu hcnu1 = (hcnu)((hftr)hftp1).b_message;
        hcos0.getClass();
        hcnu1.c = hcos0;
        hcnu1.b |= 1;
        return (hcnu)((ProtoLiteBuilder)(((hftr)hftp1))).N_build();
    }

    static hdrl c(gbbr gbbr0, gbpb gbpb0) {
        hdrl hdrl0 = gbbr0.c;
        if(gbbr0.d && gbbr0.b != null) {
            byi byi0 = new byi();
            for(Object object0: gbbr0.b) {
                hdrl hdrl1 = gbbs.c(((gbbr)object0), gbpb0);
                byi0.h(hdrl1.c, hdrl1);
            }
            return gbpb.b(gbbr0.c, byi0);
        }
        return hdrl0;
    }

    public static hdrl d(hdut hdut0, hdrl hdrl0, gbpb gbpb0) {
        byi byi0 = new byi();
        gbbr gbbr0 = gbbs.a(hdrl0, null, byi0, gbpb0);
        for(Object object0: hdut0.c) {
            hdrl hdrl1 = (hdrl)object0;
            gbbr gbbr1 = (gbbr)byi0.d(hdrl1.c);
            if(gbbr1 != null) {
                gbbr1.c = hdrl1;
                gbbr gbbr2 = gbbr1.a;
                if(gbbr2 != null) {
                    gbbr2.c();
                }
                gbbr1.b();
                for(Object object1: gbpb.a(hdrl1)) {
                    gbbs.a(((hdrl)object1), gbbr1, byi0, gbpb0);
                }
            }
        }
        return gbbs.c(gbbr0, gbpb0);
    }
}

