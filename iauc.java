import j..util.Objects;

public final class iauc {
    public final iamx a;
    public ianf b;
    public iang c;
    final iauh d;

    public iauc(iauh iauh0, iamx iamx0) {
        Objects.requireNonNull(iauh0);
        this.d = iauh0;
        super();
        this.a = iamx0;
        iang iang0 = iauh0.a.a(iauh0.b);
        this.c = iang0;
        if(iang0 == null) {
            throw new IllegalStateException("Could not find policy \'" + iauh0.b + "\'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }
        this.b = iang0.a(iamx0);
    }
}

