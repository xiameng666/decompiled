final class cccb extends cccc {
    private final fnah a;

    public cccb(fnah fnah0) {
        this.a = fnah0;
    }

    @Override  // cccq
    public final int b() {
        return 2;
    }

    @Override  // cccc
    public final fnah c() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof cccq) && ((cccq)object0).b() == 2) {
            fnah fnah0 = ((cccq)object0).c();
            return ((ProtoLiteMessage)this.a).equals(fnah0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        fnah fnah0 = this.a;
        if(((ProtoLiteMessage)fnah0).isImmutable()) {
            return ((ProtoLiteMessage)fnah0).s();
        }
        int v = fnah0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)fnah0).s();
            fnah0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "TrainingTaskKey{personalizedTrainingOptions=" + this.a + "}";
    }
}

