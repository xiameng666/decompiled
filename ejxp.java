public final class ejxp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ejxp a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ejxp ejxp0 = new ejxp();
        ejxp.a = ejxp0;
        ProtoLiteMessage.L(ejxp.class, ((ProtoLiteMessage)ejxp0));
    }

    private ejxp() {
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
                    return new hfvw(((MessageLite)ejxp.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ejxo.a});
                }
                case 3: {
                    return new ejxp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ejxp.a));
                }
                case 5: {
                    return ejxp.a;
                }
                case 6: {
                    Object object1 = ejxp.c;
                    if(object1 == null) {
                        Class class0 = ejxp.class;
                        synchronized(class0) {
                            hfvs0 = ejxp.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ejxp.a));
                                ejxp.c = hfvs0;
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

