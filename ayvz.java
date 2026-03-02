public final class ayvz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ayvz a;
    private static volatile Parser b;
    private hfvh c;

    static {
        ayvz ayvz0 = new ayvz();
        ayvz.a = ayvz0;
        ProtoLiteMessage.L(ayvz.class, ((ProtoLiteMessage)ayvz0));
    }

    private ayvz() {
        this.c = hfvh.a;
    }

    public final hfvh b() {
        hfvh hfvh0 = this.c;
        if(!hfvh0.b) {
            this.c = hfvh0.a();
        }
        return this.c;
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
                    return new hfvw(((MessageLite)ayvz.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", ayvy.a});
                }
                case 3: {
                    return new ayvz();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return ayvz.a;
                }
                case 6: {
                    Object object1 = ayvz.b;
                    if(object1 == null) {
                        Class class0 = ayvz.class;
                        synchronized(class0) {
                            hfvs0 = ayvz.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ayvz.a));
                                ayvz.b = hfvs0;
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

