public final class ainh implements gfsi {
    public final aink a;
    public final long b;

    public ainh(aink aink0, long v) {
        this.a = aink0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v1;
        ByteString hfsf0 = ((ajae)object0).a;
        aink aink0 = this.a;
        if(hfsf0 == null) {
            ((ggtj)aink.a.i()).B("Could not query full Blockstore data, returning 0 bytes for %s", aink0.d);
            hfsf0 = ByteString.copyFrom(aink.b);
        }
        aiqy aiqy0 = aink0.g;
        String s = aink0.d;
        int v = ((ajae)object0).c - 1;
        if(((ajae)object0).c == 0) {
            throw null;
        }
        if(v == 1) {
            v1 = 2;
        }
        else {
            switch(v) {
                case 2: {
                    v1 = 4;
                    break;
                }
                case 4: {
                    v1 = 3;
                    break;
                }
                default: {
                    v1 = 1;
                }
            }
        }
        aiqy0.m(s, v1, hfsf0.size(), this.b, ((ajae)object0).b);
        return hfsf0.toByteArray();
    }
}

