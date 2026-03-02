public final class ctvi {
    public final ctvt a;
    public final cuaq b;

    public ctvi(ctvt ctvt0, cuaq cuaq0) {
        ibuq.f(cuaq0, "message");
        super();
        this.a = ctvt0;
        this.b = cuaq0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ctvi)) {
            return false;
        }
        return ibuq.m(this.a, ((ctvi)object0).a) ? ibuq.m(this.b, ((ctvi)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        cuaq cuaq0 = this.b;
        if(((ProtoLiteMessage)cuaq0).isImmutable()) {
            return v + ((ProtoLiteMessage)cuaq0).s();
        }
        int v1 = cuaq0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)cuaq0).s();
            cuaq0.memoizedHashCode = v1;
        }
        return v + v1;
    }

    @Override
    public final String toString() {
        return "IncomingNotificationSyncMessage(device=" + this.a + ", message=" + this.b + ")";
    }
}

