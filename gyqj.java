public final class gyqj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqj a;
    private static volatile Parser b;

    static {
        gyqj gyqj0 = new gyqj();
        gyqj.a = gyqj0;
        ProtoLiteMessage.L(gyqj.class, ((ProtoLiteMessage)gyqj0));
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
                    return new hfvw(((MessageLite)gyqj.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyqj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqj.a));
                }
                case 5: {
                    return gyqj.a;
                }
                case 6: {
                    Object object1 = gyqj.b;
                    if(object1 == null) {
                        Class class0 = gyqj.class;
                        synchronized(class0) {
                            hfvs0 = gyqj.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqj.a));
                                gyqj.b = hfvs0;
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

