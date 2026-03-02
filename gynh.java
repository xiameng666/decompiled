public final class gynh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gynh a;
    private static volatile Parser b;

    static {
        gynh gynh0 = new gynh();
        gynh.a = gynh0;
        ProtoLiteMessage.L(gynh.class, ((ProtoLiteMessage)gynh0));
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
                    return new hfvw(((MessageLite)gynh.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gynh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gynh.a));
                }
                case 5: {
                    return gynh.a;
                }
                case 6: {
                    Object object1 = gynh.b;
                    if(object1 == null) {
                        Class class0 = gynh.class;
                        synchronized(class0) {
                            hfvs0 = gynh.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gynh.a));
                                gynh.b = hfvs0;
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

