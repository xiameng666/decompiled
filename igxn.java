import java.util.List;

public final class igxn extends igyc {
    public final fsvb a;

    public igxn() {
        this(null);
    }

    public igxn(fsvb fsvb0) {
        ibuq.f(fsvb0, "walletPage");
        super();
        this.a = fsvb0;
    }

    public igxn(byte[] arr_b) {
        this(fssm.a);
    }

    @Override  // igyc
    public final List a() {
        return ibpo.b(fssm.d(this.a));
    }

    @Override  // igyc
    public final igyc c(List list0) {
        ibuq.f(list0, "args");
        return new igxn(((fsvb)list0.get(0)));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igxn) ? ibuq.m(this.a, ((igxn)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        fsvb fsvb0 = this.a;
        if(((ProtoLiteMessage)fsvb0).isImmutable()) {
            return ((ProtoLiteMessage)fsvb0).s();
        }
        int v = fsvb0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)fsvb0).s();
            fsvb0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "FetchProposal(walletPage=" + this.a + ")";
    }
}

