import j..util.Optional;

public final class azmg implements azmc, azmd {
    private final long a;
    private final boolean b;

    public azmg() {
        this.a = 0L;
        this.b = false;
    }

    public azmg(long v) {
        this.a = v;
        this.b = true;
    }

    @Override  // azmc
    public final azii a() {
        gftb.r(this.b, "Log time aggregation requires this class be constructed with a value");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)azii.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        azii azii0 = (azii)hftp0.b_message;
        azii0.b = 1;
        azii0.c = (long)this.a;
        return (azii)hftp0.N_build();
    }

    @Override  // azmc
    public final Optional b(azii azii0) {
        gftb.r(this.b, "Log time aggregation requires this class be constructed with a value");
        long v = this.a;
        long v1 = 0L;
        if(v != 0L) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)azii0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)azii0));
            if(azii0.b == 1) {
                v1 = (long)(((Long)azii0.c));
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            azii azii1 = (azii)hftp0.b_message;
            azii1.b = 1;
            azii1.c = (long)(v1 + v);
            return Optional.of(((azii)hftp0.N_build()));
        }
        return Optional.empty();
    }

    @Override  // azmd
    public final azii c(azii azii0, azii azii1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)azii.a).v_newBuilder();
        long v = 0L;
        long v1 = azii0.b == 1 ? ((long)(((Long)azii0.c))) : 0L;
        if(azii1.b == 1) {
            v = (long)(((Long)azii1.c));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        azii azii2 = (azii)hftp0.b_message;
        azii2.b = 1;
        azii2.c = (long)(v1 + v);
        return (azii)hftp0.N_build();
    }
}

