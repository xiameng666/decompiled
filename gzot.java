public final class gzot extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzot a;
    public hfuo b;
    public static final hfta c;
    public static final hfta d;
    public static final hfta e;
    public static final hfta f;
    private static volatile Parser g;

    static {
        gzot gzot0 = new gzot();
        gzot.a = gzot0;
        ProtoLiteMessage.L(gzot.class, ((ProtoLiteMessage)gzot0));
        gzot.c = ProtoLiteMessage.Q(((MessageLite)hgum.a), gzot0, ((MessageLite)gzot0), 0x1527D62F, hfxe.k);
        gzot.d = ProtoLiteMessage.Q(((MessageLite)gzos.a), gzot0, ((MessageLite)gzot0), 0x1527D62F, hfxe.k);
        gzot.e = ProtoLiteMessage.Q(((MessageLite)gzor.a), gzot0, ((MessageLite)gzot0), 0x1527D62F, hfxe.k);
        gzot.f = ProtoLiteMessage.Q(((MessageLite)gzoq.a), gzot0, ((MessageLite)gzot0), 0x1527D62F, hfxe.k);
    }

    private gzot() {
        this.b = hfvv.a;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)1;
                }
                case 2: {
                    return new hfvw(((MessageLite)gzot.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hgul.class});
                }
                case 3: {
                    return new gzot();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzot.a));
                }
                case 5: {
                    return gzot.a;
                }
                case 6: {
                    Object object1 = gzot.g;
                    if(object1 == null) {
                        Class class0 = gzot.class;
                        synchronized(class0) {
                            hfvs0 = gzot.g;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzot.a));
                                gzot.g = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    throw null;
                }
            }
        }
        throw null;
    }
}

