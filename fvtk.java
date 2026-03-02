public final class fvtk {
    public Boolean a;
    public boolean b;
    private fvtm c;
    private long d;
    private final fwze e;

    public fvtk(fwze fwze0) {
        this.e = fwze0;
    }

    public final int a() {
        synchronized(this) {
        }
        return this.b ? 1 : 0;
    }

    public final void b() {
        glzd.f(new fvul(this.e, "cst").a(((Parser)((ProtoLiteMessage)gwvn.a).jf(7, null)), ((MessageLite)gwvn.a)), new fvti(this), this.e.mJ().a);
    }

    public final void c(long v, fvtm fvtm0) {
        synchronized(this) {
            if(fvtm0 != null && fvtm0.i()) {
                if(this.a != null && !this.a.booleanValue() && ((int)(Math.abs(v - this.d) / 1000L)) > 3 && (this.c != null && !fvtm0.j(this.c) && !this.b)) {
                    this.b = true;
                    fwze fwze0 = this.e;
                    if(fwze0.mK().n()) {
                        fvul fvul0 = new fvul(fwze0, "cst");
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwvn.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gwvn gwvn0 = (gwvn)hftp0.b_message;
                        gwvn0.b |= 1;
                        gwvn0.c = true;
                        gmbu.t(fvul0.b(((MessageLite)(((gwvn)hftp0.N_build())))), new fvtj(this), fwze0.mJ().a);
                    }
                }
                this.c = fvtm0;
            }
        }
    }

    public final void d(boolean z, long v) {
        synchronized(this) {
            this.d = v;
            this.a = Boolean.valueOf(z);
        }
    }

    public final boolean e() {
        boolean z = true;
        synchronized(this) {
            if(this.a() != 1) {
                Boolean boolean0 = this.a;
                if(boolean0 == null) {
                    z = false;
                }
                else if(!boolean0.booleanValue()) {
                    return false;
                }
            }
        }
        return z;
    }
}

