public final class dxwi implements ibts {
    public final boolean a;

    public dxwi(boolean z) {
        this.a = z;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ProtoLiteBuilder)object0), "$this$update");
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dxwo dxwo0 = (dxwo)((ProtoLiteBuilder)object0).b_message;
        dxwo0.b |= 1;
        dxwo0.d = this.a;
        return ibom.a;
    }
}

