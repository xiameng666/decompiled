public final class bptu implements glzn {
    public final bptx a;

    public bptu(bptx bptx0) {
        this.a = bptx0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gftb.r(((fcew)object0).b() <= 1, "Unexpected number of provisioning state data items per wearable device.");
        if(((fcew)object0).b() == 0) {
            return gmbu.i(frac.a);
        }
        byte[] arr_b = ((fceu)((fcew)object0).c(0)).c();
        gftb.check(arr_b);
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)frac.a), arr_b, 0, arr_b.length, this.a.e);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return gmbu.i(((frac)hftv0));
    }
}

