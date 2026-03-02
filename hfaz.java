public final class hfaz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfaz a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hfaz hfaz0 = new hfaz();
        hfaz.a = hfaz0;
        ProtoLiteMessage.L(hfaz.class, ((ProtoLiteMessage)hfaz0));
        hfaz.c = ProtoLiteMessage.Q(((MessageLite)hesv.a), hfaz0, ((MessageLite)hfaz0), 77815057, hfxe.k);
    }

    private hfaz() {
        this.b = hfvv.a;
    }

    public final void b() {
        hfuo hfuo0 = this.b;
        if(!hfuo0.c()) {
            this.b = ProtoLiteMessage.E(hfuo0);
        }
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
                    return new hfvw(((MessageLite)hfaz.a), "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", hfax.class});
                }
                case 3: {
                    return new hfaz();
                }
                case 4: {
                    return new hfay();
                }
                case 5: {
                    return hfaz.a;
                }
                case 6: {
                    Object object1 = hfaz.d;
                    if(object1 == null) {
                        Class class0 = hfaz.class;
                        synchronized(class0) {
                            hfvs0 = hfaz.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfaz.a));
                                hfaz.d = hfvs0;
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

