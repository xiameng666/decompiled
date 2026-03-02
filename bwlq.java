public final class bwlq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bwlq a;
    public int b;
    public Object c;
    public long d;
    public int e;
    private static volatile Parser f;

    static {
        bwlq bwlq0 = new bwlq();
        bwlq.a = bwlq0;
        ProtoLiteMessage.L(bwlq.class, ((ProtoLiteMessage)bwlq0));
    }

    private bwlq() {
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
                    return new hfvw(((MessageLite)bwlq.a), "\u0004\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007\u0002\b\u0004", new Object[]{"c", "b", bwlu.class, bwlu.class, bwls.class, bwlr.class, bwlt.class, bwlu.class, "d", "e"});
                }
                case 3: {
                    return new bwlq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)bwlq.a));
                }
                case 5: {
                    return bwlq.a;
                }
                case 6: {
                    Object object1 = bwlq.f;
                    if(object1 == null) {
                        Class class0 = bwlq.class;
                        synchronized(class0) {
                            hfvs0 = bwlq.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bwlq.a));
                                bwlq.f = hfvs0;
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

