public final class dpii implements bboe {
    public final String a;

    public dpii(String s) {
        this.a = s;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        String s = this.a;
        s.getClass();
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        ((dpeb)((dpdv)object0).b_message).b().remove(s);
        return (dpdv)object0;
    }
}

