public final class aldt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aldt a;
    public int b;
    public int c;
    private static volatile Parser d;

    static {
        aldt aldt0 = new aldt();
        aldt.a = aldt0;
        ProtoLiteMessage.L(aldt.class, ((ProtoLiteMessage)aldt0));
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
                    return new hfvw(((MessageLite)aldt.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"b", "c"});
                }
                case 3: {
                    return new aldt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)aldt.a));
                }
                case 5: {
                    return aldt.a;
                }
                case 6: {
                    Object object1 = aldt.d;
                    if(object1 == null) {
                        Class class0 = aldt.class;
                        synchronized(class0) {
                            hfvs0 = aldt.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aldt.a));
                                aldt.d = hfvs0;
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

