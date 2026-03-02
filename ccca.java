final class ccca extends cccc {
    private final fnaf a;

    public ccca(fnaf fnaf0) {
        this.a = fnaf0;
    }

    @Override  // cccc
    public final fnaf a() {
        return this.a;
    }

    @Override  // cccq
    public final int b() {
        return 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof cccq) && ((cccq)object0).b() == 1) {
            fnaf fnaf0 = ((cccq)object0).a();
            return ((ProtoLiteMessage)this.a).equals(fnaf0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        fnaf fnaf0 = this.a;
        if(((ProtoLiteMessage)fnaf0).isImmutable()) {
            return ((ProtoLiteMessage)fnaf0).s();
        }
        int v = fnaf0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)fnaf0).s();
            fnaf0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "TrainingTaskKey{federatedTrainingOptions=" + this.a + "}";
    }
}

