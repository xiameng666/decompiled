public final class ayvv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ayvv a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ayvv ayvv0 = new ayvv();
        ayvv.a = ayvv0;
        ProtoLiteMessage.L(ayvv.class, ((ProtoLiteMessage)ayvv0));
    }

    private ayvv() {
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
                    return new hfvw(((MessageLite)ayvv.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ayvt.a});
                }
                case 3: {
                    return new ayvv();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return ayvv.a;
                }
                case 6: {
                    Object object1 = ayvv.c;
                    if(object1 == null) {
                        Class class0 = ayvv.class;
                        synchronized(class0) {
                            hfvs0 = ayvv.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ayvv.a));
                                ayvv.c = hfvs0;
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

