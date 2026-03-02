public final class gyct extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyct a;
    public hfuf b;
    private static volatile Parser c;

    static {
        gyct gyct0 = new gyct();
        gyct.a = gyct0;
        ProtoLiteMessage.L(gyct.class, ((ProtoLiteMessage)gyct0));
    }

    private gyct() {
        this.b = hfty.a;
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
                    return new hfvw(((MessageLite)gyct.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\'", new Object[]{"b"});
                }
                case 3: {
                    return new gyct();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyct.a));
                }
                case 5: {
                    return gyct.a;
                }
                case 6: {
                    Object object1 = gyct.c;
                    if(object1 == null) {
                        Class class0 = gyct.class;
                        synchronized(class0) {
                            hfvs0 = gyct.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyct.a));
                                gyct.c = hfvs0;
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

