public final class fdrq {
    public final String a;
    final fdpl b;
    final long c;
    final boolean d;

    public fdrq(String s, fdpl fdpl0, long v, boolean z) {
        batl.s(s);
        this.a = s;
        batl.s(fdpl0);
        this.b = fdpl0;
        batl.d(v >= 0L, "Negative channelId: %s", new Object[]{v});
        this.c = v;
        this.d = z;
    }

    public static fdrq a(fdpl fdpl0, String s) {
        fesr fesr0;
        byte[] arr_b;
        batl.s(fdpl0);
        if(!s.startsWith("chl-")) {
            throw new fdrp();
        }
        try {
            arr_b = bbmu.d(s.substring(4));
        }
        catch(RuntimeException unused_ex) {
            throw new fdrp();
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fesr.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            fesr0 = (fesr)hftv0;
            int v = fesr0.b;
        }
        catch(hfur unused_ex) {
            throw new fdrp();
        }
        if((v & 1) == 0) {
            throw new fdrp();
        }
        if((v & 2) == 0) {
            throw new fdrp();
        }
        if((4 & v) == 0) {
            throw new fdrp();
        }
        if(fesr0.f < 0L) {
            throw new fdrp();
        }
        fdpl fdpl1 = fdpl.a(fesr0.d, fesr0.e);
        if(fdpl0.equals(fdpl1)) {
            return new fdrq(fesr0.c, fdpl1, fesr0.f, fesr0.g);
        }
        throw new fdrp();
    }

    public final String b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fesr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fesr)hftv0).b |= 1;
        ((fesr)hftv0).c = this.a;
        fdpl fdpl0 = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        fdpl0.b.getClass();
        ((fesr)hftv1).b |= 2;
        ((fesr)hftv1).d = fdpl0.b;
        String s = fdpl0.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        s.getClass();
        ((fesr)hftv2).b |= 4;
        ((fesr)hftv2).e = s;
        long v = this.c;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((fesr)hftv3).b |= 8;
        ((fesr)hftv3).f = v;
        boolean z = this.d;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesr fesr0 = (fesr)hftp0.b_message;
        fesr0.b |= 16;
        fesr0.g = z;
        return "chl-" + bbmu.a(((fesr)hftp0.N_build()).toBytesArray());
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fdrq) ? this.c == ((fdrq)object0).c && this.d == ((fdrq)object0).d && this.b.equals(((fdrq)object0).b) && this.a.equals(((fdrq)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return (((this.a.hashCode() + 0x20F) * 0x1F + this.b.hashCode()) * 0x1F + ((int)(this.c ^ this.c >>> 0x20))) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "ChannelToken[nodeId=\'" + this.a + "\', appKey=" + this.b.toString() + ", channelId=" + this.c + ", thisNodeWasOpener=" + this.d + "]";
    }
}

