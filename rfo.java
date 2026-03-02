public final class rfo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final rfo a;
    public hfuo b;
    private static volatile Parser c;

    static {
        rfo rfo0 = new rfo();
        rfo.a = rfo0;
        ProtoLiteMessage.L(rfo.class, ((ProtoLiteMessage)rfo0));
    }

    private rfo() {
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
                    return new hfvw(((MessageLite)rfo.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", rfn.class});
                }
                case 3: {
                    return new rfo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)rfo.a));
                }
                case 5: {
                    return rfo.a;
                }
                case 6: {
                    Object object1 = rfo.c;
                    if(object1 == null) {
                        Class class0 = rfo.class;
                        synchronized(class0) {
                            hfvs0 = rfo.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)rfo.a));
                                rfo.c = hfvs0;
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

