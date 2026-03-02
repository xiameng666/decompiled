public final class bnpz implements gfsi {
    public final String a;

    public bnpz(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqxk fqxk0 = (fqxk)((ProtoLiteMessage)fqxl.a).v_newBuilder();
        gsyz gsyz0 = ((fquw)object0).a;
        if(!fqxk0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqxk0).ensureMutable();
        }
        fqxl fqxl0 = (fqxl)fqxk0.b_message;
        gsyz0.getClass();
        fqxl0.c = gsyz0;
        fqxl0.b |= 1;
        fqxk0.k(this.a);
        gfsx gfsx0 = ((fquw)object0).b;
        if(gfsx0.i()) {
            fqzw fqzw0 = ((fqwq)gfsx0.d()).b();
            if(!fqxk0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fqxk0).ensureMutable();
            }
            fqxl fqxl1 = (fqxl)fqxk0.b_message;
            fqzw0.getClass();
            fqxl1.d = fqzw0;
            fqxl1.b |= 2;
        }
        gfsx gfsx1 = ((fquw)object0).c;
        if(gfsx1.i()) {
            fqex fqex0 = (fqex)gfsx1.d();
            int v = fqex0.a;
            if(!fqxk0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fqxk0).ensureMutable();
            }
            fqxl fqxl2 = (fqxl)fqxk0.b_message;
            fqxl2.b |= 8;
            fqxl2.f = v;
            long v1 = fqex0.b;
            if(!fqxk0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fqxk0).ensureMutable();
            }
            fqxl fqxl3 = (fqxl)fqxk0.b_message;
            fqxl3.b |= 16;
            fqxl3.g = v1;
            int v2 = fqex0.e;
            if(!fqxk0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fqxk0).ensureMutable();
            }
            fqxl fqxl4 = (fqxl)fqxk0.b_message;
            fqxl4.h = gtac.a(v2);
            fqxl4.b |= 0x20;
            gszr gszr0 = fqex0.c;
            if(!fqxk0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fqxk0).ensureMutable();
            }
            fqxl fqxl5 = (fqxl)fqxk0.b_message;
            fqxl5.i = gszr0.a();
            fqxl5.b |= 0x40;
            gfsx gfsx2 = fqex0.d;
            if(gfsx2.i()) {
                Object object1 = gfsx2.d();
                if(!fqxk0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fqxk0).ensureMutable();
                }
                fqxl fqxl6 = (fqxl)fqxk0.b_message;
                fqxl6.m = (gtai)object1;
                fqxl6.b |= 0x200;
            }
            gfsx gfsx3 = ((fquw)object0).d;
            if(gfsx3.i()) {
                String s = (String)gfsx3.d();
                if(!fqxk0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fqxk0).ensureMutable();
                }
                fqxl fqxl7 = (fqxl)fqxk0.b_message;
                fqxl7.b |= 0x400;
                fqxl7.n = s;
            }
            gfsx gfsx4 = ((fquw)object0).e;
            if(gfsx4.i()) {
                Object object2 = gfsx4.d();
                if(!fqxk0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fqxk0).ensureMutable();
                }
                fqxl fqxl8 = (fqxl)fqxk0.b_message;
                fqxl8.o = ((gszv)object2).a();
                fqxl8.b |= 0x800;
            }
            gfsx gfsx5 = ((fquw)object0).f;
            if(gfsx5.i()) {
                fqxk0.m(((Iterable)gfsx5.d()));
            }
        }
        return (fqxl)((ProtoLiteBuilder)fqxk0).N_build();
    }
}

