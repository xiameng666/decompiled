public final class bptg implements gfsi {
    public final bptx a;
    public final gsyz b;

    public bptg(bptx bptx0, gsyz gsyz0) {
        this.a = bptx0;
        this.b = gsyz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        bptx bptx0 = this.a;
        gsyz gsyz0 = this.b;
        fcew fcew0 = (fcew)object0;
        for(int v = 0; v < fcew0.b(); ++v) {
            try {
                byte[] arr_b = ((fceu)fcew0.c(v)).c();
                gftb.check(arr_b);
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)frac.a), arr_b, 0, arr_b.length, bptx0.e);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gsyz gsyz1 = ((frac)hftv0).e;
                if(gsyz1 == null) {
                    gsyz1 = gsyz.a;
                }
                if(((ProtoLiteMessage)gsyz1).equals(gsyz0)) {
                    String s = ((fceu)fcew0.c(v)).a().getAuthority();
                    gftb.check(s);
                    return gfsx.m(s);
                }
            }
            catch(NullPointerException | hfur exception0) {
                a.ae(bptx.a.j(), "Failed to parse WearableProvisioningState, skipping.", exception0);
            }
        }
        return gfqx.a;
    }
}

