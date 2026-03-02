public final class bvsc {
    public final boolean a;
    public final gged_interceptors b;

    public bvsc() {
        throw null;
    }

    public bvsc(boolean z, gged_interceptors gged0) {
        this.a = z;
        if(gged0 == null) {
            throw new NullPointerException("Null failures");
        }
        this.b = gged0;
    }

    static bvsc a(String s) {
        return bvsc.b(s, new ggdy());
    }

    static bvsc b(String s, ggdy ggdy0) {
        if(!bbqr.d(s)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqym.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((gqym)hftv0).b |= 1;
            ((gqym)hftv0).c = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqym gqym0 = (gqym)hftp0.b_message;
            gqym0.b |= 2;
            gqym0.d = false;
            ggdy0.i(((gqym)hftp0.N_build()));
        }
        return new bvsc(false, ggdy0.h());
    }

    static bvsc c() {
        return new bvsc(true, ggna.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bvsc) && this.a == ((bvsc)object0).a && ggia.i(this.b, ((bvsc)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.a ? this.b.hashCode() ^ 0x16638EA4 : this.b.hashCode() ^ 0x16FC2542;
    }

    @Override
    public final String toString() {
        return "EvaluationResult{result=" + this.a + ", failures=" + this.b + "}";
    }
}

