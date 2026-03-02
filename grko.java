public final class grko extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grko a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        grko grko0 = new grko();
        grko.a = grko0;
        ProtoLiteMessage.L(grko.class, ((ProtoLiteMessage)grko0));
    }

    private grko() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)grko.a), "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002:\u0000", new Object[]{"c", "b"});
                }
                case 3: {
                    return new grko();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grko.a));
                }
                case 5: {
                    return grko.a;
                }
                case 6: {
                    Object object1 = grko.d;
                    if(object1 == null) {
                        Class class0 = grko.class;
                        synchronized(class0) {
                            hfvs0 = grko.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grko.a));
                                grko.d = hfvs0;
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

