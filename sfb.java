public final class sfb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final sfb a;
    public hfuo b;
    private static volatile Parser c;

    static {
        sfb sfb0 = new sfb();
        sfb.a = sfb0;
        ProtoLiteMessage.L(sfb.class, ((ProtoLiteMessage)sfb0));
    }

    private sfb() {
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
                    return new hfvw(((MessageLite)sfb.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", sfa.class});
                }
                case 3: {
                    return new sfb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)sfb.a));
                }
                case 5: {
                    return sfb.a;
                }
                case 6: {
                    Object object1 = sfb.c;
                    if(object1 == null) {
                        Class class0 = sfb.class;
                        synchronized(class0) {
                            hfvs0 = sfb.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)sfb.a));
                                sfb.c = hfvs0;
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

