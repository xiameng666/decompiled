import j..util.Objects;

public final class zho {
    public final grxr a;
    public final long b;
    public final boolean c;

    public zho(grxr grxr0, long v) {
        this(grxr0, v, false);
    }

    public zho(grxr grxr0, long v, boolean z) {
        this.a = grxr0;
        this.b = v;
        this.c = z;
    }

    public zho(grxw grxw0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grxr.a).v_newBuilder();
        grxc grxc0 = grxc.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        grxc0.getClass();
        ((grxr)hftv0).d = grxc0;
        ((grxr)hftv0).c = 1000;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxr grxr0 = (grxr)hftp0.b_message;
        grxw0.getClass();
        grxr0.e = grxw0;
        grxr0.b |= 1;
        this.a = (grxr)hftp0.N_build();
        this.b = 0L;
        this.c = false;
    }

    public final grul a() {
        grxr grxr0 = this.a;
        switch(grxr0.c) {
            case 3: {
                return (grul)((gryc)grxr0.d).b.get(0);
            }
            case 1000: {
                return zhp.b;
            }
            default: {
                return zhp.d;
            }
        }
    }

    public final boolean b() {
        return this.a.c == 1000;
    }

    public final boolean c() {
        if(this.b()) {
            return true;
        }
        long v = System.currentTimeMillis();
        return (this.a.f ? hojn.a.g().m() : hojn.a.g().n()) + this.b < v || v < this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof zho) ? this.b == ((zho)object0).b && this.c == ((zho)object0).c && Objects.equals(this.a, ((zho)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((long)this.b), Boolean.valueOf(this.c)});
    }
}

