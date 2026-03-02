final class eiuc {
    public final goak a;
    public final ggeo b;
    public final ggeo c;
    public final ggeo d;

    public eiuc() {
        throw null;
    }

    public eiuc(goak goak0, ggeo ggeo0, ggeo ggeo1, ggeo ggeo2) {
        if(goak0 == null) {
            throw new NullPointerException("Null request");
        }
        this.a = goak0;
        if(ggeo0 == null) {
            throw new NullPointerException("Null packagesToApps");
        }
        this.b = ggeo0;
        this.c = ggeo1;
        this.d = ggeo2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof eiuc) && ((ProtoLiteMessage)this.a).equals(((eiuc)object0).a) && this.b.equals(((eiuc)object0).b) && ggkm.o(this.c, ((eiuc)object0).c) && ggkm.o(this.d, ((eiuc)object0).d);
    }

    @Override
    public final int hashCode() {
        goak goak0 = this.a;
        if(((ProtoLiteMessage)goak0).isImmutable()) {
            int v = ((ProtoLiteMessage)goak0).s();
            return this.d.hashCode() ^ (((v ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
        }
        int v1 = goak0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)goak0).s();
            goak0.memoizedHashCode = v1;
        }
        return this.d.hashCode() ^ (((v1 ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "SyncState{request=" + this.a.toString() + ", packagesToApps=" + this.b.toString() + ", packageAndAccountToExperimentState=" + this.c + ", configPackageToRequestState=" + this.d + "}";
    }
}

