public final class dyun implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        dyfa dyfa0 = dyez.a(((ProtoLiteMessage)dyey.a).v_newBuilder());
        dyna dyna0 = dyna.b(((dyoh)object0).d);
        if(dyna0 == null) {
            dyna0 = dyna.k;
        }
        ibuq.e(dyna0, "getServiceProvider(...)");
        dyfa0.c(dyna0);
        String s = ((dyoh)object0).b;
        ibuq.e(s, "getCid(...)");
        dyfa0.b(s);
        return dyfa0.a();
    }
}

