import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public final class gbfv {
    public int a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final lqi e;
    public final lqi f;
    public final gbpa g;
    public final gatj h;
    public final gavf i;

    public gbfv(gbpa gbpa0, gatj gatj0, gavf gavf0) {
        this.g = gbpa0;
        this.h = gatj0;
        this.i = gavf0;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new lqi();
        this.f = new lqi();
    }

    public final hcnu a(Map map0, long v, String s) {
        Object object0 = map0.get(Long.valueOf(v));
        gavr.d(object0, s, this.h.g, new gayw(v), null, 16);
        return (hcnu)object0;
    }

    public final hcnu b(hcnu hcnu0) {
        hcnu hcnu3;
        this.d(gbfv.e(hcnu0));
        gaym gaym0 = this.h.g;
        ibuq.e(gaym0, "getEventLogger(...)");
        ibuq.f(hcnu0, "data");
        ibuq.f(gaym0, "logger");
        if(((hcnu0.c == null ? hcos.a : hcnu0.c).b & 0x80) == 0) {
            hcnu3 = hcnu0;
        }
        else {
            Map map0 = this.c;
            ByteString hfsf0 = (hcnu0.c == null ? hcos.a : hcnu0.c).k;
            Object object0 = map0.get(hfsf0);
            if(object0 == null) {
                ByteString hfsf1 = (hcnu0.c == null ? hcos.a : hcnu0.c).k;
                ibuq.e(hfsf1, "getLazyDataToken(...)");
                object0 = new gbgd(hfsf1, fbnf.a);
                map0.put(hfsf0, object0);
            }
            if(((gbgd)object0).b == fbnf.c) {
                hcnu hcnu1 = ((gbgd)object0).d;
                if(hcnu1 == null) {
                    ((gbgd)object0).c.add(Long.valueOf((hcnu0.c == null ? hcos.a : hcnu0.c).c));
                    hcnu3 = hcnu0;
                }
                else {
                    hcos hcos0 = hcnu0.c;
                    hcos hcos1 = hcos0 == null ? hcos.a : hcos0;
                    switch((hcou.a(hcos1.m) == 0 ? 1 : hcou.a(hcos1.m)) - 1) {
                        case 0: {
                            gavr.e("BE_LLC_01", gaym0, new gbgb(hcnu0), "Attempting to lazyLoad " + (hcnu0.c == null ? hcos.a : hcnu0.c).c + " with unknown lazyLoadMethod", null, 16);
                            throw new ibnm();
                        }
                        case 1: {
                            if(hcos0 == null) {
                                hcos0 = hcos.a;
                            }
                            long v = hcos0.c;
                            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hcnu1).jf(5, null);
                            hftp2.X(((ProtoLiteMessage)hcnu1));
                            hcos hcos6 = hcnu1.c == null ? hcos.a : hcnu1.c;
                            ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)hcos6).jf(5, null);
                            hftp3.X(((ProtoLiteMessage)hcos6));
                            if(!((hftr)hftp3).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((hftr)hftp3))).ensureMutable();
                            }
                            hcos hcos7 = (hcos)((hftr)hftp3).b_message;
                            hcos7.b |= 1;
                            hcos7.c = v;
                            if(!((hftr)hftp2).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((hftr)hftp2))).ensureMutable();
                            }
                            hcnu hcnu4 = (hcnu)((hftr)hftp2).b_message;
                            hcos hcos8 = (hcos)((ProtoLiteBuilder)(((hftr)hftp3))).N_build();
                            hcos8.getClass();
                            hcnu4.c = hcos8;
                            hcnu4.b |= 1;
                            ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)(((hftr)hftp2))).N_build();
                            ibuq.e(hftv1, "build(...)");
                            hcnu3 = (hcnu)hftv1;
                            break;
                        }
                        default: {
                            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcnu0).jf(5, null);
                            hftp0.X(((ProtoLiteMessage)hcnu0));
                            hcos hcos2 = hcnu0.c == null ? hcos.a : hcnu0.c;
                            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hcos2).jf(5, null);
                            hftp1.X(((ProtoLiteMessage)hcos2));
                            if(!((hftr)hftp1).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((hftr)hftp1))).ensureMutable();
                            }
                            hcos hcos3 = (hcos)((hftr)hftp1).b_message;
                            hcos3.b &= 0xFFFFFF7F;
                            hcos3.k = hcos.a.k;
                            if(!((hftr)hftp1).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((hftr)hftp1))).ensureMutable();
                            }
                            hcos hcos4 = (hcos)((hftr)hftp1).b_message;
                            hcos4.b &= 0xFFFFFDFF;
                            hcos4.m = 0;
                            if(!((hftr)hftp0).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((hftr)hftp0))).ensureMutable();
                            }
                            hcnu hcnu2 = (hcnu)((hftr)hftp0).b_message;
                            hcos hcos5 = (hcos)((ProtoLiteBuilder)(((hftr)hftp1))).N_build();
                            hcos5.getClass();
                            hcnu2.c = hcos5;
                            hcnu2.b |= 1;
                            ((ProtoLiteBuilder)(((hftr)hftp0))).X(((ProtoLiteMessage)hcnu1));
                            ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)(((hftr)hftp0))).N_build();
                            ibuq.e(hftv0, "build(...)");
                            hcnu3 = (hcnu)hftv0;
                        }
                    }
                }
            }
            else {
                ((gbgd)object0).c.add(Long.valueOf((hcnu0.c == null ? hcos.a : hcnu0.c).c));
                hcnu3 = hcnu0;
            }
        }
        Long long0 = gbfv.e(hcnu0);
        this.b.put(long0, hcnu3);
        return hcnu3;
    }

    public final void c() {
        Collection collection0 = this.c.values();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            gbgd gbgd0 = (gbgd)object0;
            ArrayList arrayList1 = new ArrayList(ibpo.q(gbgd0.c, 10));
            for(Object object1: gbgd0.c) {
                arrayList1.add(new ibns(((Number)object1).longValue(), gbgd0.b));
            }
            ibpo.D(arrayList0, arrayList1);
        }
        Map map0 = ibpz.p(arrayList0);
        this.e.l(map0);
    }

    public final void d(long v) {
        hcnu hcnu0 = (hcnu)this.b.remove(Long.valueOf(v));
        if(hcnu0 != null) {
            gbgd gbgd0 = (gbgd)this.c.get((hcnu0.c == null ? hcos.a : hcnu0.c).k);
            if(gbgd0 != null) {
                gbgd0.c.remove(Long.valueOf((hcnu0.c == null ? hcos.a : hcnu0.c).c));
            }
        }
    }

    public static final long e(hcnu hcnu0) {
        ibuq.f(hcnu0, "<this>");
        return (hcnu0.c == null ? hcos.a : hcnu0.c).c;
    }
}

