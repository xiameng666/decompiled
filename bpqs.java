public final class bpqs implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        gtbr gtbr0;
        bppe bppe0 = bppf.a();
        fquv fquv0 = new fquv(null);
        gsyz gsyz0 = ((fqva)object0).a;
        fquv0.c(gsyz0);
        fquv0.f(((fqva)object0).c);
        fqew fqew0 = fqex.a();
        fqew0.d(((fqva)object0).b);
        fqew0.b(((fqva)object0).g);
        fqew0.f(((fqva)object0).l);
        fqew0.e(((fqva)object0).h);
        fqew0.c(((fqva)object0).k);
        fquv0.b(fqew0.a());
        bppe0.b(fquv0.a());
        fqvt fqvt0 = new fqvt();
        fqvt0.b(gsyz0);
        gfsx gfsx0 = ((fqva)object0).f;
        if(gfsx0.i()) {
            gtbq gtbq0 = (gtbq)((ProtoLiteMessage)gtbr.a).v_newBuilder();
            gged_interceptors gged0 = gged_interceptors.m(((fqva)object0).e.b, ((gtbr)gfsx0.d()).b);
            ggmo ggmo0 = ggmo.g(hfym.a);
            gtbq0.a(gggq.g(gged0, new gfze(new fquy(), ggmo0)));
            gtbr0 = (gtbr)((ProtoLiteBuilder)gtbq0).N_build();
        }
        else {
            gtbr0 = ((fqva)object0).e;
        }
        fqvt0.c(gtbr0);
        bppe0.d(fqvt0.a());
        bppe0.a = gfsx.m(new bppd(gsyz0, ((fqva)object0).i));
        return bppe0.a();
    }
}

