public final class gyah extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyah a;
    private static volatile Parser b;

    static {
        gyah gyah0 = new gyah();
        gyah.a = gyah0;
        ProtoLiteMessage.L(gyah.class, ((ProtoLiteMessage)gyah0));
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
                    return new hfvw(((MessageLite)gyah.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new gyah();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyah.a));
                }
                case 5: {
                    return gyah.a;
                }
                case 6: {
                    Object object1 = gyah.b;
                    if(object1 == null) {
                        Class class0 = gyah.class;
                        synchronized(class0) {
                            hfvs0 = gyah.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyah.a));
                                gyah.b = hfvs0;
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

