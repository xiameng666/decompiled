public final class gyqs extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqs a;
    private static volatile Parser b;

    static {
        gyqs gyqs0 = new gyqs();
        gyqs.a = gyqs0;
        ProtoLiteMessage.L(gyqs.class, ((ProtoLiteMessage)gyqs0));
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
                    return new hfvw(((MessageLite)gyqs.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyqs();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqs.a));
                }
                case 5: {
                    return gyqs.a;
                }
                case 6: {
                    Object object1 = gyqs.b;
                    if(object1 == null) {
                        Class class0 = gyqs.class;
                        synchronized(class0) {
                            hfvs0 = gyqs.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqs.a));
                                gyqs.b = hfvs0;
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

