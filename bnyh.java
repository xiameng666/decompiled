public final class bnyh implements glzn {
    public final bnyk a;

    public bnyh(bnyk bnyk0) {
        this.a = bnyk0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gtbc gtbc0 = (gtbc)object0;
        fqzt fqzt0 = (fqzt)((ProtoLiteMessage)fqzu.a).v_newBuilder();
        fqzt0.k(gtbc0.f);
        fqzt0.a(gtbc0.g);
        fqzu fqzu0 = (fqzu)((ProtoLiteBuilder)fqzt0).N_build();
        gdta gdta0 = gdta.g(this.a.b.g(fqzu0));
        bnyi bnyi0 = new bnyi();
        return gdta0.e(Throwable.class, bnyi0, gmap.a).h(new bnyj(fqzu0), gmap.a);
    }
}

