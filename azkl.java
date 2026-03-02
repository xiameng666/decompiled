public final class azkl {
    public final long a;
    public final azis b;

    public azkl() {
        throw null;
    }

    public azkl(long v, azis azis0) {
        this.a = v;
        if(azis0 == null) {
            throw new NullPointerException("Null unencryptedObservationBatch");
        }
        this.b = azis0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azkl) && this.a == ((azkl)object0).a && ((ProtoLiteMessage)this.b).equals(((azkl)object0).b);
    }

    @Override
    public final int hashCode() {
        azis azis0 = this.b;
        if(((ProtoLiteMessage)azis0).isImmutable()) {
            int v = ((ProtoLiteMessage)azis0).s();
            return (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ v;
        }
        int v1 = azis0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)azis0).s();
            azis0.memoizedHashCode = v1;
        }
        return (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "ObservationStoreEntity{id=" + this.a + ", unencryptedObservationBatch=" + this.b.toString() + "}";
    }
}

