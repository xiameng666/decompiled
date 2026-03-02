public final class abzl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final abzl a;
    public hfuo b;
    private static volatile Parser c;

    static {
        abzl abzl0 = new abzl();
        abzl.a = abzl0;
        ProtoLiteMessage.L(abzl.class, ((ProtoLiteMessage)abzl0));
    }

    private abzl() {
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
                    return new hfvw(((MessageLite)abzl.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", abzk.class});
                }
                case 3: {
                    return new abzl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)abzl.a));
                }
                case 5: {
                    return abzl.a;
                }
                case 6: {
                    Object object1 = abzl.c;
                    if(object1 == null) {
                        Class class0 = abzl.class;
                        synchronized(class0) {
                            hfvs0 = abzl.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)abzl.a));
                                abzl.c = hfvs0;
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

