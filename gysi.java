public final class gysi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gysi a;
    private static volatile Parser b;

    static {
        gysi gysi0 = new gysi();
        gysi.a = gysi0;
        ProtoLiteMessage.L(gysi.class, ((ProtoLiteMessage)gysi0));
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
                    return new hfvw(((MessageLite)gysi.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gysi();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gysi.a));
                }
                case 5: {
                    return gysi.a;
                }
                case 6: {
                    Object object1 = gysi.b;
                    if(object1 == null) {
                        Class class0 = gysi.class;
                        synchronized(class0) {
                            hfvs0 = gysi.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gysi.a));
                                gysi.b = hfvs0;
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

