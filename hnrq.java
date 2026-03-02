public final class hnrq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnrq a;
    public int b;
    private static volatile Parser c;

    static {
        hnrq hnrq0 = new hnrq();
        hnrq.a = hnrq0;
        ProtoLiteMessage.L(hnrq.class, ((ProtoLiteMessage)hnrq0));
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
                    return new hfvw(((MessageLite)hnrq.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new hnrq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnrq.a));
                }
                case 5: {
                    return hnrq.a;
                }
                case 6: {
                    Object object1 = hnrq.c;
                    if(object1 == null) {
                        Class class0 = hnrq.class;
                        synchronized(class0) {
                            hfvs0 = hnrq.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnrq.a));
                                hnrq.c = hfvs0;
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

