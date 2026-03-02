public final class bwwf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bwwf a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        bwwf bwwf0 = new bwwf();
        bwwf.a = bwwf0;
        ProtoLiteMessage.L(bwwf.class, ((ProtoLiteMessage)bwwf0));
        bwwf.b = ProtoLiteMessage.Q(((MessageLite)gobv.a), bwwf0, ((MessageLite)bwwf0), 482079101, hfxe.k);
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
                    return new hfvw(((MessageLite)bwwf.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new bwwf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)bwwf.a));
                }
                case 5: {
                    return bwwf.a;
                }
                case 6: {
                    Object object1 = bwwf.c;
                    if(object1 == null) {
                        Class class0 = bwwf.class;
                        synchronized(class0) {
                            hfvs0 = bwwf.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bwwf.a));
                                bwwf.c = hfvs0;
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

