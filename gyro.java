public final class gyro extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyro a;
    private static volatile Parser b;

    static {
        gyro gyro0 = new gyro();
        gyro.a = gyro0;
        ProtoLiteMessage.L(gyro.class, ((ProtoLiteMessage)gyro0));
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
                    return new hfvw(((MessageLite)gyro.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyro();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyro.a));
                }
                case 5: {
                    return gyro.a;
                }
                case 6: {
                    Object object1 = gyro.b;
                    if(object1 == null) {
                        Class class0 = gyro.class;
                        synchronized(class0) {
                            hfvs0 = gyro.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyro.a));
                                gyro.b = hfvs0;
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

