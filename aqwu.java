public final class aqwu implements gfsi {
    public final boolean a;

    public aqwu(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((atdh)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((atdh)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        atdh atdh0 = (atdh)hftp0.b_message;
        atdh0.b |= 1;
        atdh0.c = this.a;
        return (atdh)hftp0.N_build();
    }
}

