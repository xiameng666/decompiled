public final class ctxz implements ibts {
    public final ctye a;

    public ctxz(ctye ctye0) {
        this.a = ctye0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        byte[] arr_b = (byte[])object0;
        ibuq.f(arr_b, "bytes");
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)cuau.a), arr_b, 0, arr_b.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        cuau cuau0 = (cuau)hftv0;
        ibuq.e(cuau0, "parseFrom(...)");
        ibuq.f(cuau0, "request");
        return new ctyd(this.a.b);
    }
}

