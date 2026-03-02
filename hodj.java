public final class hodj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hodj a;
    public int b;
    private static volatile Parser c;

    static {
        hodj hodj0 = new hodj();
        hodj.a = hodj0;
        ProtoLiteMessage.L(hodj.class, ((ProtoLiteMessage)hodj0));
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
                    return new hfvw(((MessageLite)hodj.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new hodj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hodj.a));
                }
                case 5: {
                    return hodj.a;
                }
                case 6: {
                    Object object1 = hodj.c;
                    if(object1 == null) {
                        Class class0 = hodj.class;
                        synchronized(class0) {
                            hfvs0 = hodj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hodj.a));
                                hodj.c = hfvs0;
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

