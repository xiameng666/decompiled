public final class dpef extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dpef a;
    public hfvh b;
    private static volatile Parser c;

    static {
        dpef dpef0 = new dpef();
        dpef.a = dpef0;
        ProtoLiteMessage.L(dpef.class, ((ProtoLiteMessage)dpef0));
    }

    private dpef() {
        this.b = hfvh.a;
    }

    public final hfvh b() {
        hfvh hfvh0 = this.b;
        if(!hfvh0.b) {
            this.b = hfvh0.a();
        }
        return this.b;
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
                    return new hfvw(((MessageLite)dpef.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dpee.a});
                }
                case 3: {
                    return new dpef();
                }
                case 4: {
                    return new dpec();
                }
                case 5: {
                    return dpef.a;
                }
                case 6: {
                    Object object1 = dpef.c;
                    if(object1 == null) {
                        Class class0 = dpef.class;
                        synchronized(class0) {
                            hfvs0 = dpef.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dpef.a));
                                dpef.c = hfvs0;
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

