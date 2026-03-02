import java.util.List;

public final class bnwd {
    public gfsx a;
    private gged_interceptors b;

    public bnwd() {
        throw null;
    }

    public bnwd(byte[] arr_b) {
        this.a = gfqx.a;
    }

    public final bnwe a() {
        gged_interceptors gged0 = this.b;
        if(gged0 == null) {
            throw new IllegalStateException("Missing required properties: domainKeys");
        }
        bnwe bnwe0 = new bnwe(gged0, this.a);
        gfsx gfsx0 = bnwe0.b;
        boolean z = true;
        if(gfsx0.i()) {
            switch(((int)(((Integer)gfsx0.d())))) {
                case 46500: 
                case 46502: {
                    break;
                }
                default: {
                    z = false;
                }
            }
        }
        gftb.checkTrue(z);
        return bnwe0;
    }

    public final void b(List list0) {
        this.b = gged_interceptors.i(list0);
    }
}

