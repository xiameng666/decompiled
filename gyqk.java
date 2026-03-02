public final class gyqk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqk a;
    private static volatile Parser b;

    static {
        gyqk gyqk0 = new gyqk();
        gyqk.a = gyqk0;
        ProtoLiteMessage.L(gyqk.class, ((ProtoLiteMessage)gyqk0));
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
                    return new hfvw(((MessageLite)gyqk.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyqk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqk.a));
                }
                case 5: {
                    return gyqk.a;
                }
                case 6: {
                    Object object1 = gyqk.b;
                    if(object1 == null) {
                        Class class0 = gyqk.class;
                        synchronized(class0) {
                            hfvs0 = gyqk.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqk.a));
                                gyqk.b = hfvs0;
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

