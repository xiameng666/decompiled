public final class ffah extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffah a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        ffah ffah0 = new ffah();
        ffah.a = ffah0;
        ProtoLiteMessage.L(ffah.class, ((ProtoLiteMessage)ffah0));
    }

    private ffah() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)ffah.a), "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", ffad.class, ffae.class, ffaf.class});
                }
                case 3: {
                    return new ffah();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ffah.a));
                }
                case 5: {
                    return ffah.a;
                }
                case 6: {
                    Object object1 = ffah.d;
                    if(object1 == null) {
                        Class class0 = ffah.class;
                        synchronized(class0) {
                            hfvs0 = ffah.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffah.a));
                                ffah.d = hfvs0;
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

