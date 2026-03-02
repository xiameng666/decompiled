public final class bwow extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bwow a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        bwow bwow0 = new bwow();
        bwow.a = bwow0;
        ProtoLiteMessage.L(bwow.class, ((ProtoLiteMessage)bwow0));
    }

    private bwow() {
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
                    return new hfvw(((MessageLite)bwow.a), "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", bwot.class, bwou.class, bwov.class});
                }
                case 3: {
                    return new bwow();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)bwow.a));
                }
                case 5: {
                    return bwow.a;
                }
                case 6: {
                    Object object1 = bwow.d;
                    if(object1 == null) {
                        Class class0 = bwow.class;
                        synchronized(class0) {
                            hfvs0 = bwow.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bwow.a));
                                bwow.d = hfvs0;
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

