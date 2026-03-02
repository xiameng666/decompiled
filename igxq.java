import java.util.List;

public final class igxq extends igyc {
    public final int a;
    public final boolean b;
    public final gjce c;
    public static final int d;

    public igxq() {
        this(null);
    }

    public igxq(int v, boolean z, gjce gjce0) {
        this.a = v;
        this.b = z;
        this.c = gjce0;
    }

    public igxq(byte[] arr_b) {
        this(0, false, null);
    }

    @Override  // igyc
    public final List a() {
        return ibpo.g(new fsry[]{new fssj(((int)this.a)), new fssa(Boolean.valueOf(this.b)), (this.c == null ? null : fssm.e(((MessageLite)this.c)))});
    }

    @Override  // igyc
    public final igyc c(List list0) {
        ibuq.f(list0, "args");
        boolean z = false;
        fsvb fsvb0 = (fsvb)list0.get(0);
        int v = fsvb0.b == 2 ? ((int)(((Integer)fsvb0.c))) : 0;
        fsvb fsvb1 = (fsvb)list0.get(1);
        if(fsvb1.b == 1) {
            z = ((Boolean)fsvb1.c).booleanValue();
        }
        return new igxq(v, z, ((gjce)fssm.h(((fsvb)list0.get(2)), new igxp())));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof igxq)) {
            return false;
        }
        if(this.a != ((igxq)object0).a) {
            return false;
        }
        return this.b == ((igxq)object0).b ? ibuq.m(this.c, ((igxq)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        gjce gjce0 = this.c;
        if(gjce0 == null) {
            return this.b ? (this.a * 0x1F + 0x4CF) * 0x1F : (this.a * 0x1F + 0x4D5) * 0x1F;
        }
        if(((ProtoLiteMessage)gjce0).isImmutable()) {
            int v = ((ProtoLiteMessage)gjce0).s();
            return this.b ? (this.a * 0x1F + 0x4CF) * 0x1F + v : (this.a * 0x1F + 0x4D5) * 0x1F + v;
        }
        int v1 = gjce0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)gjce0).s();
            gjce0.memoizedHashCode = v1;
        }
        return this.b ? (this.a * 0x1F + 0x4CF) * 0x1F + v1 : (this.a * 0x1F + 0x4D5) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "LogSemanticEvent(semanticId=" + this.a + ", pseudonymous=" + this.b + ", metadata=" + this.c + ")";
    }
}

