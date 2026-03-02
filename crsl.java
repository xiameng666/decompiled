public final class crsl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final crsl a;
    public hfuo b;
    private static volatile Parser c;

    static {
        crsl crsl0 = new crsl();
        crsl.a = crsl0;
        ProtoLiteMessage.L(crsl.class, ((ProtoLiteMessage)crsl0));
    }

    private crsl() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)crsl.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", crsi.class});
                }
                case 3: {
                    return new crsl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)crsl.a));
                }
                case 5: {
                    return crsl.a;
                }
                case 6: {
                    Object object1 = crsl.c;
                    if(object1 == null) {
                        Class class0 = crsl.class;
                        synchronized(class0) {
                            hfvs0 = crsl.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)crsl.a));
                                crsl.c = hfvs0;
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

