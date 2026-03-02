public final class gphg {
    public final ggfp a;

    public gphg() {
        throw null;
    }

    public gphg(ggfp ggfp0) {
        this.a = ggfp0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof gphg) ? this.a.equals(((gphg)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "GrpcServiceConfig{grpcMethodConfigs=" + this.a + "}";
    }
}

