public final class gyqq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqq a;
    private static volatile Parser b;

    static {
        gyqq gyqq0 = new gyqq();
        gyqq.a = gyqq0;
        ProtoLiteMessage.L(gyqq.class, ((ProtoLiteMessage)gyqq0));
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
                    return new hfvw(((MessageLite)gyqq.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyqq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqq.a));
                }
                case 5: {
                    return gyqq.a;
                }
                case 6: {
                    Object object1 = gyqq.b;
                    if(object1 == null) {
                        Class class0 = gyqq.class;
                        synchronized(class0) {
                            hfvs0 = gyqq.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqq.a));
                                gyqq.b = hfvs0;
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

