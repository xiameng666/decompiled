public final class gyqf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqf a;
    private static volatile Parser b;

    static {
        gyqf gyqf0 = new gyqf();
        gyqf.a = gyqf0;
        ProtoLiteMessage.L(gyqf.class, ((ProtoLiteMessage)gyqf0));
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
                    return new hfvw(((MessageLite)gyqf.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyqf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqf.a));
                }
                case 5: {
                    return gyqf.a;
                }
                case 6: {
                    Object object1 = gyqf.b;
                    if(object1 == null) {
                        Class class0 = gyqf.class;
                        synchronized(class0) {
                            hfvs0 = gyqf.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqf.a));
                                gyqf.b = hfvs0;
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

