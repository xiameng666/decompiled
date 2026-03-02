public final class donj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final donj a;
    public hfvh b;
    private static volatile Parser c;

    static {
        donj donj0 = new donj();
        donj.a = donj0;
        ProtoLiteMessage.L(donj.class, ((ProtoLiteMessage)donj0));
    }

    private donj() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)donj.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", doni.a});
                }
                case 3: {
                    return new donj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)donj.a));
                }
                case 5: {
                    return donj.a;
                }
                case 6: {
                    Object object1 = donj.c;
                    if(object1 == null) {
                        Class class0 = donj.class;
                        synchronized(class0) {
                            hfvs0 = donj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)donj.a));
                                donj.c = hfvs0;
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

