public final class gibq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gibq a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gibq gibq0 = new gibq();
        gibq.a = gibq0;
        ProtoLiteMessage.L(gibq.class, ((ProtoLiteMessage)gibq0));
    }

    private gibq() {
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
                    return new hfvw(((MessageLite)gibq.a), "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", gibp.class, gibn.class});
                }
                case 3: {
                    return new gibq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gibq.a));
                }
                case 5: {
                    return gibq.a;
                }
                case 6: {
                    Object object1 = gibq.d;
                    if(object1 == null) {
                        Class class0 = gibq.class;
                        synchronized(class0) {
                            hfvs0 = gibq.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gibq.a));
                                gibq.d = hfvs0;
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

