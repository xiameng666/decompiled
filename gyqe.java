public final class gyqe extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqe a;
    private static volatile Parser b;

    static {
        gyqe gyqe0 = new gyqe();
        gyqe.a = gyqe0;
        ProtoLiteMessage.L(gyqe.class, ((ProtoLiteMessage)gyqe0));
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
                    return new hfvw(((MessageLite)gyqe.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyqe();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqe.a));
                }
                case 5: {
                    return gyqe.a;
                }
                case 6: {
                    Object object1 = gyqe.b;
                    if(object1 == null) {
                        Class class0 = gyqe.class;
                        synchronized(class0) {
                            hfvs0 = gyqe.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqe.a));
                                gyqe.b = hfvs0;
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

