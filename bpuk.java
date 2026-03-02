public final class bpuk implements glzn {
    public final bpuo a;

    public bpuk(bpuo bpuo0) {
        this.a = bpuo0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ByteString hfsf0 = bpss.a(this.a.g.e, ((bnql)object0).c.a);
        ((ggtj)bptx.a.h()).x("Sending a request to set the EIK.");
        byte[] arr_b = hfsf0.toByteArray();
        return gdta.g(fhra.b(((bptx)this.a.b).c.i(this.a.f, "/findmydevice/set-eik", arr_b))).h(new bptl(), gmap.a);
    }
}

