public final class dpin implements bboe {
    public final gtih a;

    public dpin(gtih gtih0) {
        this.a = gtih0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dpft dpft0 = (dpft)((ProtoLiteBuilder)object0).b_message;
        this.a.getClass();
        dpft0.k = this.a;
        dpft0.b |= 0x40;
        return (ProtoLiteBuilder)object0;
    }
}

