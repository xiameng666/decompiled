final class aiod {
    public final gfsx a;
    public final wvj b;

    public aiod() {
        throw null;
    }

    public aiod(gfsx gfsx0, wvj wvj0) {
        this.a = gfsx0;
        this.b = wvj0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aiod) && this.a.equals(((aiod)object0).a) && ((ProtoLiteMessage)this.b).equals(((aiod)object0).b);
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        wvj wvj0 = this.b;
        if(((ProtoLiteMessage)wvj0).isImmutable()) {
            return ((ProtoLiteMessage)wvj0).s() ^ v * 1000003;
        }
        int v1 = wvj0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)wvj0).s();
            wvj0.memoizedHashCode = v1;
        }
        return v1 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "RetrieveBytesResult{readResult=" + this.a + ", accessEvaluationPerSnapshotDetails=" + this.b + "}";
    }
}

