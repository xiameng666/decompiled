public final class blkr implements evpo {
    public final blkt a;
    public final hery b;

    public blkr(blkt blkt0, hery hery0) {
        this.a = blkt0;
        this.b = hery0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        gged_interceptors gged0 = (gged_interceptors)evql0.j();
        if(gged0.isEmpty()) {
            throw new IllegalArgumentException("Failed to update passkey because it doesn\'t exist");
        }
        hery hery0 = this.b;
        hery hery1 = (hery)gged0.get(0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hery1).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hery1));
        String s = hery0.k;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hery hery2 = (hery)hftp0.b_message;
        s.getClass();
        hery2.b |= 0x20;
        hery2.k = s;
        String s1 = hery0.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hery hery3 = (hery)hftp0.b_message;
        s1.getClass();
        hery3.b |= 0x40;
        hery3.l = s1;
        long v = hery0.n;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hery hery4 = (hery)hftp0.b_message;
        hery4.b |= 0x100;
        hery4.n = v;
        if(hsvs.k()) {
            int v1 = hery0.o;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hery hery5 = (hery)hftp0.b_message;
            hery5.b |= 0x200;
            hery5.o = v1;
            int v2 = hery0.c;
            if(v2 == 9) {
                ByteString hfsf0 = (ByteString)hery0.d;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hery hery6 = (hery)hftp0.b_message;
                hfsf0.getClass();
                hery6.c = 9;
                hery6.d = hfsf0;
                return ((blir)this.a.b.d()).c(((hery)hftp0.N_build()), this.a.d);
            }
            ByteString hfsf1 = v2 == 12 ? ((ByteString)hery0.d) : ByteString.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hery hery7 = (hery)hftp0.b_message;
            hfsf1.getClass();
            hery7.c = 12;
            hery7.d = hfsf1;
        }
        return ((blir)this.a.b.d()).c(((hery)hftp0.N_build()), this.a.d);
    }
}

