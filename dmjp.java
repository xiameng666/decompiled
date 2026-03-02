public final class dmjp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dmjp a;
    public hfuo b;
    private static volatile Parser c;

    static {
        dmjp dmjp0 = new dmjp();
        dmjp.a = dmjp0;
        ProtoLiteMessage.L(dmjp.class, ((ProtoLiteMessage)dmjp0));
    }

    private dmjp() {
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
                    return new hfvw(((MessageLite)dmjp.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", dmjo.class});
                }
                case 3: {
                    return new dmjp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)dmjp.a));
                }
                case 5: {
                    return dmjp.a;
                }
                case 6: {
                    Object object1 = dmjp.c;
                    if(object1 == null) {
                        Class class0 = dmjp.class;
                        synchronized(class0) {
                            hfvs0 = dmjp.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dmjp.a));
                                dmjp.c = hfvs0;
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

