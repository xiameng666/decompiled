import j..util.Objects;

public final class flrf implements kar {
    public final ProtoLiteBuilder a;

    public flrf(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmdm.a).v_newBuilder();
        gfsx gfsx0 = ((fmhx)object0).d();
        Objects.requireNonNull(hftp0);
        flbl.b(gfsx0, new flrr(hftp0));
        gfsx gfsx1 = ((fmhx)object0).f();
        Objects.requireNonNull(hftp0);
        flbl.b(gfsx1, new flrs(hftp0));
        gfsx gfsx2 = ((fmhx)object0).e();
        Objects.requireNonNull(hftp0);
        flbl.b(gfsx2, new flrt(hftp0));
        gfsx gfsx3 = ((fmhx)object0).b();
        Objects.requireNonNull(hftp0);
        flbl.b(gfsx3, new flru(hftp0));
        gfsx gfsx4 = ((fmhx)object0).c();
        Objects.requireNonNull(hftp0);
        flbl.b(gfsx4, new flrv(hftp0));
        gfsx gfsx5 = ((fmhx)object0).a();
        Objects.requireNonNull(hftp0);
        flbl.b(gfsx5, new flrw(hftp0));
        flbl.b(((fmhx)object0).g(), new flrx(hftp0));
        gfsx gfsx6 = ((fmhx)object0).h();
        Objects.requireNonNull(hftp0);
        flbl.b(gfsx6, new flry(hftp0));
        gmdm gmdm0 = (gmdm)hftp0.N_build();
        ProtoLiteBuilder hftp1 = this.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmdi gmdi0 = (gmdi)hftp1.b_message;
        gmdm0.getClass();
        gmdi0.o = gmdm0;
        gmdi0.b |= 8;
    }
}

