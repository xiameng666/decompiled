public final class grha extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grha a;
    private static volatile Parser b;
    private hfvh c;

    static {
        grha grha0 = new grha();
        grha.a = grha0;
        ProtoLiteMessage.L(grha.class, ((ProtoLiteMessage)grha0));
    }

    private grha() {
        this.c = hfvh.a;
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
                    return new hfvw(((MessageLite)grha.a), "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", grgz.a});
                }
                case 3: {
                    return new grha();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grha.a));
                }
                case 5: {
                    return grha.a;
                }
                case 6: {
                    Object object1 = grha.b;
                    if(object1 == null) {
                        Class class0 = grha.class;
                        synchronized(class0) {
                            hfvs0 = grha.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grha.a));
                                grha.b = hfvs0;
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

