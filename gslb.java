public final class gslb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gslb a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gslb gslb0 = new gslb();
        gslb.a = gslb0;
        ProtoLiteMessage.L(gslb.class, ((ProtoLiteMessage)gslb0));
    }

    private gslb() {
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
                    return new hfvw(((MessageLite)gslb.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gsme.class});
                }
                case 3: {
                    return new gslb();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return gslb.a;
                }
                case 6: {
                    Object object1 = gslb.c;
                    if(object1 == null) {
                        Class class0 = gslb.class;
                        synchronized(class0) {
                            hfvs0 = gslb.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gslb.a));
                                gslb.c = hfvs0;
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

