public final class gyqc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqc a;
    private static volatile Parser b;

    static {
        gyqc gyqc0 = new gyqc();
        gyqc.a = gyqc0;
        ProtoLiteMessage.L(gyqc.class, ((ProtoLiteMessage)gyqc0));
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
                    return new hfvw(((MessageLite)gyqc.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyqc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqc.a));
                }
                case 5: {
                    return gyqc.a;
                }
                case 6: {
                    Object object1 = gyqc.b;
                    if(object1 == null) {
                        Class class0 = gyqc.class;
                        synchronized(class0) {
                            hfvs0 = gyqc.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqc.a));
                                gyqc.b = hfvs0;
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

