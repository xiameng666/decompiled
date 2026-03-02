public final class bwwe {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;

    public bwwe() {
        cdaw cdaw0 = huae.d().e;
        if(cdaw0 == null) {
            cdaw0 = cdaw.a;
        }
        this.a = bwwe.e(cdaw0.b);
        cdaw cdaw1 = huae.e().e;
        if(cdaw1 == null) {
            cdaw1 = cdaw.a;
        }
        this.b = bwwe.e(cdaw1.b);
        cdaw cdaw2 = huae.c().e;
        if(cdaw2 == null) {
            cdaw2 = cdaw.a;
        }
        this.c = bwwe.e(cdaw2.b);
        cdaw cdaw3 = huae.b().e;
        if(cdaw3 == null) {
            cdaw3 = cdaw.a;
        }
        this.d = bwwe.e(cdaw3.b);
    }

    public static cczf a(cdef cdef0) {
        switch(cdef0.ordinal()) {
            case 0xF3: {
                return cfuf.v();
            }
            case 0xF4: {
                return cfui.v();
            }
            case 0xF5: {
                return cfuc.v();
            }
            default: {
                return cftz.v();
            }
        }
    }

    public final Long b(cdef cdef0) {
        switch(cdef0.ordinal()) {
            case 0xF3: {
                return this.a;
            }
            case 0xF4: {
                return this.b;
            }
            case 0xF5: {
                return this.c;
            }
            default: {
                return this.d;
            }
        }
    }

    public final void c(cdef cdef0, String s, ProtoLiteBuilder hftp0) {
        long v = (long)this.b(cdef0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glnz0.b |= 0x80000;
        glnz0.s = v;
        glnz glnz1 = (glnz)hftp0.N_build();
        cczb cczb0 = bwwe.a(cdef0).l(glnz1);
        cczb0.f = s;
        cczb0.a();
    }

    public final void d(cdef cdef0, int v, ProtoLiteBuilder hftp0) {
        long v1 = (long)this.b(cdef0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        glnz0.b |= 0x80000;
        glnz0.s = v1;
        glnz glnz1 = (glnz)hftp0.N_build();
        cczb cczb0 = bwwe.a(cdef0).l(glnz1);
        cczb0.c = (int)(v - 2);
        cczb0.a();
    }

    private static long e(double f) {
        return f == 0.0 ? 0L : ((long)(1.0 / f));
    }
}

