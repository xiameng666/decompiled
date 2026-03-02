public final class ebvi implements ibts {
    public final dylc a;
    public final ebvm b;
    public final dyin c;

    public ebvi(dylc dylc0, ebvm ebvm0, dyin dyin0) {
        this.a = dylc0;
        this.b = ebvm0;
        this.c = dyin0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dyra dyra0 = null;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.a).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.a));
        dyle dyle0 = dyld.a(hftp0);
        dyng dyng0 = dyle0.b();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)dyng0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)dyng0));
        dyni dyni0 = dynh.a(hftp1);
        dyir dyir0 = dyni0.a();
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)dyir0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)dyir0));
        dyit dyit0 = dyis.a(hftp2);
        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)this.c).jf(5, null);
        hftp3.X(((ProtoLiteMessage)this.c));
        dyip dyip0 = dyio.a(hftp3);
        if(((hkjq)object0).b.size() == 4) {
            Object object1 = ((hkjq)object0).b.get(0);
            ibuq.e(object1, "get(...)");
            dyip0.f(((String)object1));
            Object object2 = ((hkjq)object0).b.get(1);
            ibuq.e(object2, "get(...)");
            dyip0.h(((String)object2));
            Object object3 = ((hkjq)object0).b.get(2);
            ibuq.e(object3, "get(...)");
            dyip0.b(((String)object3));
            Object object4 = ((hkjq)object0).b.get(3);
            ibuq.e(object4, "get(...)");
            dyip0.e(((String)object4));
        }
        else {
            ((ggtj)ebvm.a.j()).x("Failed to get required FIFE URLs, not updating!");
        }
        ebvm ebvm0 = this.b;
        dyit0.c(dyip0.a());
        dyni0.c(dyit0.b());
        dyle0.f(dyni0.b());
        dylc dylc0 = dyle0.a();
        dyra dyra1 = ebvm0.f;
        if(dyra1 == null) {
            ibuq.j("octopusCardManager");
        }
        else {
            dyra0 = dyra1;
        }
        if(dyra0.q(dylc0, new ebvl(new hfuh((ebvm0.b.b == 16 ? ((dyhu)ebvm0.b.c) : dyhu.b).e, dyhu.a)))) {
            ebvm0.b();
            return ibom.a;
        }
        ((ggtj)ebvm.a.j()).x("Failed to update Octopus card data for card art FIFE URL");
        ebvm0.a();
        return ibom.a;
    }
}

