import j..util.Objects;

public final class dpgr implements gfsi {
    public final long a;

    public dpgr(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        dpef dpef0 = (dpef)Objects.requireNonNull(((dpef)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dpef0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dpef0));
        if(!((dpec)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpec)hftp0))).ensureMutable();
        }
        ((dpef)((dpec)hftp0).b_message).b().remove(Long.valueOf(this.a));
        return (dpef)((ProtoLiteBuilder)(((dpec)hftp0))).N_build();
    }
}

