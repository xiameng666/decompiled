public final class aamq implements fhrs {
    public final aatb a;

    public aamq() {
        throw null;
    }

    public aamq(aatb aatb0) {
        this.a = aatb0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof aamq) ? ((ProtoLiteMessage)this.a).equals(((aamq)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        aatb aatb0 = this.a;
        if(((ProtoLiteMessage)aatb0).isImmutable()) {
            return ((ProtoLiteMessage)aatb0).s() ^ 1000003;
        }
        int v = aatb0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)aatb0).s();
            aatb0.memoizedHashCode = v;
        }
        return v ^ 1000003;
    }

    @Override
    public final String toString() {
        return "FinishActivityAction{activeUser=" + this.a.toString() + "}";
    }
}

