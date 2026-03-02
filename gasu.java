import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Map;

public final class gasu implements ibth {
    public final gasv a;
    public final hdul b;
    public final hdut c;

    public gasu(gasv gasv0, hdul hdul0, hdut hdut0) {
        this.a = gasv0;
        this.b = hdul0;
        this.c = hdut0;
    }

    @Override  // ibth
    public final Object a() {
        hdul hdul0 = this.b;
        hdut hdut0 = this.c;
        gavs.c(hdul0.d.size() - hdut0.e.size() + hdut0.d.size() >= 0, "BE_PC_04", this.a.a.a.g, "New additional node list should not have negative size.");
        hduk hduk0 = (hduk)((ProtoLiteMessage)hdul.a).v_newBuilder();
        gbpb gbpb0 = this.a.a.a.j;
        hdrl hdrl0 = gbbs.d(hdut0, (hdul0.c == null ? hdrl.a : hdul0.c), gbpb0);
        if(!hduk0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hduk0).ensureMutable();
        }
        hdul hdul1 = (hdul)hduk0.b_message;
        hdrl0.getClass();
        hdul1.c = hdrl0;
        hdul1.b |= 1;
        hfuo hfuo0 = hdul0.d;
        ArrayList arrayList0 = new ArrayList(hfuo0.size() - hdut0.e.size() + hdut0.d.size());
        for(Object object0: hfuo0) {
            hdrl hdrl1 = (hdrl)object0;
            if(!hdut0.e.contains(Long.valueOf(hdrl1.c))) {
                arrayList0.add(gbbs.d(hdut0, hdrl1, gbpb0));
            }
        }
        arrayList0.addAll(hdut0.d);
        if(!hduk0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hduk0).ensureMutable();
        }
        hdul hdul2 = (hdul)hduk0.b_message;
        hfuo hfuo1 = hdul2.d;
        if(!hfuo1.c()) {
            hdul2.d = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(arrayList0, hdul2.d);
        hduk0.k(hdul0.h);
        hduk0.k(hdut0.l);
        hfuo hfuo2 = hdut0.m;
        hfuo hfuo3 = hdul0.i;
        bxf bxf0 = new bxf(hfuo2.size());
        for(Object object1: hfuo2) {
            bxf0.add(Integer.valueOf(((hdzs)object1).c));
        }
        ArrayList arrayList1 = new ArrayList(hfuo2.size() + hfuo3.size());
        arrayList1.addAll(hfuo2);
        for(Object object2: hfuo3) {
            hdzs hdzs0 = (hdzs)object2;
            if(!bxf0.contains(Integer.valueOf(hdzs0.c))) {
                arrayList1.add(hdzs0);
            }
        }
        if(!hduk0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hduk0).ensureMutable();
        }
        hdul hdul3 = (hdul)hduk0.b_message;
        hfuo hfuo4 = hdul3.i;
        if(!hfuo4.c()) {
            hdul3.i = ProtoLiteMessage.E(hfuo4);
        }
        hfrj.E(arrayList1, hdul3.i);
        hdus hdus0 = hdut0.j == null ? hdus.a : hdut0.j;
        hdus hdus1 = hdul0.f == null ? hdus.a : hdul0.f;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hdus1).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hdus1));
        Map map0 = DesugarCollections.unmodifiableMap(hdus0.b);
        if(!((hdup)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hdup)hftp0))).ensureMutable();
        }
        ((hdus)((hdup)hftp0).b_message).b().putAll(map0);
        Map map1 = DesugarCollections.unmodifiableMap(hdus0.c);
        if(!((hdup)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hdup)hftp0))).ensureMutable();
        }
        hdus hdus2 = (hdus)((hdup)hftp0).b_message;
        hfvh hfvh0 = hdus2.c;
        if(!hfvh0.b) {
            hdus2.c = hfvh0.a();
        }
        hdus2.c.putAll(map1);
        hdus hdus3 = (hdus)((ProtoLiteBuilder)(((hdup)hftp0))).N_build();
        if(!hduk0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hduk0).ensureMutable();
        }
        hdul hdul4 = (hdul)hduk0.b_message;
        hdus3.getClass();
        hdul4.f = hdus3;
        hdul4.b |= 2;
        String s = (hdut0.b & 2) == 0 ? hdul0.g : hdut0.k;
        if(!hduk0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hduk0).ensureMutable();
        }
        hdul hdul5 = (hdul)hduk0.b_message;
        s.getClass();
        hdul5.b |= 4;
        hdul5.g = s;
        return (hdul)((ProtoLiteBuilder)hduk0).N_build();
    }
}

