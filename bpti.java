public final class bpti implements glzn {
    public final bptx a;

    public bpti(bptx bptx0) {
        this.a = bptx0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        byte[] arr_b = (byte[])object0;
        gftb.check(arr_b);
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fqyc.a), arr_b, 0, arr_b.length, this.a.e);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return gmbu.i(((fqyc)hftv0));
    }
}

