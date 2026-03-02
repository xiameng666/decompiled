public final class hlul extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlul a;
    public int b;
    private static volatile Parser c;

    static {
        hlul hlul0 = new hlul();
        hlul.a = hlul0;
        ProtoLiteMessage.L(hlul.class, ((ProtoLiteMessage)hlul0));
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
                    return new hfvw(((MessageLite)hlul.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
                }
                case 3: {
                    return new hlul();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlul.a));
                }
                case 5: {
                    return hlul.a;
                }
                case 6: {
                    Object object1 = hlul.c;
                    if(object1 == null) {
                        Class class0 = hlul.class;
                        synchronized(class0) {
                            hfvs0 = hlul.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlul.a));
                                hlul.c = hfvs0;
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

