import java.util.Arrays;

public final class bctr implements bcws {
    public final hevj a;

    public bctr(hevj hevj0) {
        batl.s(hevj0);
        this.a = hevj0;
    }

    public final int a() {
        int v = hevi.a(this.a.c);
        return v == 0 ? 3 : v;
    }

    @Override  // bcws
    public final long b() {
        return this.a.e;
    }

    @Override  // bcws
    public final long c() {
        return this.a.d;
    }

    public static bctr d(long v) {
        return new bctr(bctr.g(v));
    }

    public static bctr e(long v, long v1) {
        return new bctr(bctr.i(3, v, v1));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bctr) ? this.a() == ((bctr)object0).a() && this.c() == ((bctr)object0).c() && this.b() == ((bctr)object0).b() : false;
    }

    public static bctr f(long v) {
        return new bctr(bctr.i(2, v, 0x7FFFFFFFFFFFFFFFL));
    }

    static hevj g(long v) {
        return bctr.i(1, v, v);
    }

    public final boolean h() {
        return hevi.a(this.a.c) == 2;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a(), this.c(), this.b()});
    }

    private static hevj i(int v, long v1, long v2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hevj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hevj)hftv0).c = v;
        ((hevj)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hevj)hftv1).b |= 2;
        ((hevj)hftv1).d = v1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hevj hevj0 = (hevj)hftp0.b_message;
        hevj0.b |= 4;
        hevj0.e = v2;
        return (hevj)hftp0.N_build();
    }

    @Override
    public final String toString() {
        switch(this.a()) {
            case 1: {
                return Integer.toString(this.a()) + "(" + this.c() + ")";
            }
            case 2: {
                return Integer.toString(this.a()) + "(" + this.c() + ")";
            }
            default: {
                return Integer.toString(this.a()) + "(" + this.c() + ", " + this.b() + ")";
            }
        }
    }
}

