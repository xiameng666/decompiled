public final class hfcg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfcg a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hfcg hfcg0 = new hfcg();
        hfcg.a = hfcg0;
        ProtoLiteMessage.L(hfcg.class, ((ProtoLiteMessage)hfcg0));
    }

    private hfcg() {
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
                    return new hfvw(((MessageLite)hfcg.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hfcf.class});
                }
                case 3: {
                    return new hfcg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfcg.a));
                }
                case 5: {
                    return hfcg.a;
                }
                case 6: {
                    Object object1 = hfcg.c;
                    if(object1 == null) {
                        Class class0 = hfcg.class;
                        synchronized(class0) {
                            hfvs0 = hfcg.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfcg.a));
                                hfcg.c = hfvs0;
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

