public final class ayvx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ayvx a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ayvx ayvx0 = new ayvx();
        ayvx.a = ayvx0;
        ProtoLiteMessage.L(ayvx.class, ((ProtoLiteMessage)ayvx0));
    }

    private ayvx() {
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
                    return new hfvw(((MessageLite)ayvx.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ayvw.a});
                }
                case 3: {
                    return new ayvx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ayvx.a));
                }
                case 5: {
                    return ayvx.a;
                }
                case 6: {
                    Object object1 = ayvx.c;
                    if(object1 == null) {
                        Class class0 = ayvx.class;
                        synchronized(class0) {
                            hfvs0 = ayvx.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ayvx.a));
                                ayvx.c = hfvs0;
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

