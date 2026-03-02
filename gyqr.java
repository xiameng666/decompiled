public final class gyqr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqr a;
    private static volatile Parser b;

    static {
        gyqr gyqr0 = new gyqr();
        gyqr.a = gyqr0;
        ProtoLiteMessage.L(gyqr.class, ((ProtoLiteMessage)gyqr0));
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
                    return new hfvw(((MessageLite)gyqr.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyqr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqr.a));
                }
                case 5: {
                    return gyqr.a;
                }
                case 6: {
                    Object object1 = gyqr.b;
                    if(object1 == null) {
                        Class class0 = gyqr.class;
                        synchronized(class0) {
                            hfvs0 = gyqr.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqr.a));
                                gyqr.b = hfvs0;
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

