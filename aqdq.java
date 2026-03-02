public final class aqdq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aqdq a;
    public hfvh b;
    private static volatile Parser c;

    static {
        aqdq aqdq0 = new aqdq();
        aqdq.a = aqdq0;
        ProtoLiteMessage.L(aqdq.class, ((ProtoLiteMessage)aqdq0));
    }

    private aqdq() {
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
                    return new hfvw(((MessageLite)aqdq.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", aqdp.a});
                }
                case 3: {
                    return new aqdq();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return aqdq.a;
                }
                case 6: {
                    Object object1 = aqdq.c;
                    if(object1 == null) {
                        Class class0 = aqdq.class;
                        synchronized(class0) {
                            hfvs0 = aqdq.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aqdq.a));
                                aqdq.c = hfvs0;
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

