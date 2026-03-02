public final class cboc implements gpmy {
    private final MessageLite a;
    private final hfta b;

    public cboc(MessageLite hfvm0, hfta hfta0) {
        ibuq.f(hfvm0, "customMessage");
        ibuq.f(hfta0, "customExtensionLite");
        super();
        this.a = hfvm0;
        this.b = hfta0;
    }

    @Override  // gpmy
    public final hfta a() {
        ibuq.d(this.b, "null cannot be cast to non-null type com.google.protobuf.ExtensionLite<com.google.protos.proto2.bridge.MessageSet, com.google.protobuf.MessageLite>");
        return this.b;
    }

    @Override  // gpmy
    public final MessageLite b(gRPCMethodDescriptor iaoj0, iakq iakq0) {
        ibuq.f(iaoj0, "method");
        ibuq.f(iakq0, "callOptions");
        return this.a;
    }

    @Override  // gpmy
    public final void c(MessageLite hfvm0) {
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cboc)) {
            return false;
        }
        return ibuq.m(this.a, ((cboc)object0).a) ? ibuq.m(this.b, ((cboc)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        ProtoLiteMessage hftv0 = (ProtoLiteMessage)this.a;
        if(hftv0.isImmutable()) {
            return hftv0.s() * 0x1F + this.b.hashCode();
        }
        int v = hftv0.memoizedHashCode;
        if(v == 0) {
            v = hftv0.s();
            hftv0.memoizedHashCode = v;
        }
        return v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "KidsRpcMetadataProcessor(customMessage=" + this.a + ", customExtensionLite=" + this.b + ")";
    }
}

