public final class grfq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grfq a;
    public hfuo b;
    private static volatile Parser c;

    static {
        grfq grfq0 = new grfq();
        grfq.a = grfq0;
        ProtoLiteMessage.L(grfq.class, ((ProtoLiteMessage)grfq0));
    }

    private grfq() {
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
                    return new hfvw(((MessageLite)grfq.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", grem.class});
                }
                case 3: {
                    return new grfq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grfq.a));
                }
                case 5: {
                    return grfq.a;
                }
                case 6: {
                    Object object1 = grfq.c;
                    if(object1 == null) {
                        Class class0 = grfq.class;
                        synchronized(class0) {
                            hfvs0 = grfq.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grfq.a));
                                grfq.c = hfvs0;
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

