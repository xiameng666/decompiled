public final class hodw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hodw a;
    public int b;
    public int c;
    private static volatile Parser d;

    static {
        hodw hodw0 = new hodw();
        hodw.a = hodw0;
        ProtoLiteMessage.L(hodw.class, ((ProtoLiteMessage)hodw0));
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
                    return new hfvw(((MessageLite)hodw.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hodw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hodw.a));
                }
                case 5: {
                    return hodw.a;
                }
                case 6: {
                    Object object1 = hodw.d;
                    if(object1 == null) {
                        Class class0 = hodw.class;
                        synchronized(class0) {
                            hfvs0 = hodw.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hodw.a));
                                hodw.d = hfvs0;
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

