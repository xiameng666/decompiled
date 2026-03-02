public final class hkte extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkte a;
    public hfuo b;
    public hfuf c;
    public hfuf d;
    private static volatile Parser e;

    static {
        hkte hkte0 = new hkte();
        hkte.a = hkte0;
        ProtoLiteMessage.L(hkte.class, ((ProtoLiteMessage)hkte0));
    }

    private hkte() {
        this.b = hfvv.a;
        this.c = hfty.a;
        this.d = hfty.a;
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
                    return new hfvw(((MessageLite)hkte.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001C\u0002\'\u0003\'", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new hkte();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return hkte.a;
                }
                case 6: {
                    Object object1 = hkte.e;
                    if(object1 == null) {
                        Class class0 = hkte.class;
                        synchronized(class0) {
                            hfvs0 = hkte.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkte.a));
                                hkte.e = hfvs0;
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

