public final class cteq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final cteq a;
    public hfvh b;
    public long c;
    public static final hfuj d;
    private static volatile Parser e;

    static {
        cteq.d = new hfuj(cteb.e, cteb.d);
        cteq cteq0 = new cteq();
        cteq.a = cteq0;
        ProtoLiteMessage.L(cteq.class, ((ProtoLiteMessage)cteq0));
    }

    private cteq() {
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
                    return new hfvw(((MessageLite)cteq.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002\u0002", new Object[]{"b", ctep.a, "c"});
                }
                case 3: {
                    return new cteq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)cteq.a));
                }
                case 5: {
                    return cteq.a;
                }
                case 6: {
                    Object object1 = cteq.e;
                    if(object1 == null) {
                        Class class0 = cteq.class;
                        synchronized(class0) {
                            hfvs0 = cteq.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)cteq.a));
                                cteq.e = hfvs0;
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

