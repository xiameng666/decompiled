public final class ctek extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ctek a;
    public hfvh b;
    private static volatile Parser c;
    private hfvh d;

    static {
        ctek ctek0 = new ctek();
        ctek.a = ctek0;
        ProtoLiteMessage.L(ctek.class, ((ProtoLiteMessage)ctek0));
    }

    private ctek() {
        this.b = hfvh.a;
        this.d = hfvh.a;
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
                    return new hfvw(((MessageLite)ctek.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", ctei.a, "d", ctej.a});
                }
                case 3: {
                    return new ctek();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return ctek.a;
                }
                case 6: {
                    Object object1 = ctek.c;
                    if(object1 == null) {
                        Class class0 = ctek.class;
                        synchronized(class0) {
                            hfvs0 = ctek.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ctek.a));
                                ctek.c = hfvs0;
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

