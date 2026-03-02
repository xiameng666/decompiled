import j..util.Objects;

final class calk implements gfsi {
    final capc a;

    public calk(call call0, capc capc0) {
        this.a = capc0;
        Objects.requireNonNull(call0);
        super();
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Long long0 = null;
        if(((Boolean)object0) == null) {
            return new calm(Boolean.valueOf(false), null);
        }
        if(huhz.m()) {
            return this.a == null || !this.a.d().booleanValue() ? new calm(((Boolean)object0), null) : new calm(((Boolean)object0), this.a.g);
        }
        capc capc0 = this.a;
        if(capc0 != null && capc0.a().booleanValue()) {
            long0 = capc0.a;
        }
        return new calm(((Boolean)object0), long0);
    }
}

