final class ehar {
    public final boolean a;
    public final egpn b;

    public ehar() {
        throw null;
    }

    public ehar(boolean z, egpn egpn0) {
        this.a = z;
        if(egpn0 == null) {
            throw new NullPointerException("Null getSyncColumnMetaData");
        }
        this.b = egpn0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehar) && this.a == ((ehar)object0).a && ((ProtoLiteMessage)this.b).equals(((ehar)object0).b);
    }

    @Override
    public final int hashCode() {
        egpn egpn0 = this.b;
        if(((ProtoLiteMessage)egpn0).isImmutable()) {
            int v = ((ProtoLiteMessage)egpn0).s();
            return this.a ? 0x16638EA4 ^ v : 0x16FC2542 ^ v;
        }
        int v1 = egpn0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)egpn0).s();
            egpn0.memoizedHashCode = v1;
        }
        return this.a ? 0x16638EA4 ^ v1 : 0x16FC2542 ^ v1;
    }

    @Override
    public final String toString() {
        return "RawContactSyncColumnInfo{hasColumnSyncInfo=" + this.a + ", getSyncColumnMetaData=" + this.b.toString() + "}";
    }
}

