abstract class dxdc implements gfsi {
    public void a(hbsn hbsn0, ProtoLiteBuilder hftp0) {
        throw null;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = this.e();
        this.b(((hbsn)object0), hftp0);
        if(((hbsn)object0).d() != null) {
            this.c(((hbsn)object0), hftp0);
        }
        if(((hbsn)object0).c() != null) {
            this.a(((hbsn)object0), hftp0);
        }
        this.d(((hbsn)object0), hftp0);
        return (hfir)hftp0.N_build();
    }

    public abstract void b(hbsn arg1, ProtoLiteBuilder arg2);

    public abstract void c(hbsn arg1, ProtoLiteBuilder arg2);

    public abstract void d(hbsn arg1, ProtoLiteBuilder arg2);

    public ProtoLiteBuilder e() {
        throw null;
    }
}

