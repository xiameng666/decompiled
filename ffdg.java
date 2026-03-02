public final class ffdg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffdg a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        ffdg ffdg0 = new ffdg();
        ffdg.a = ffdg0;
        ProtoLiteMessage.L(ffdg.class, ((ProtoLiteMessage)ffdg0));
        ffdg.c = ProtoLiteMessage.Q(((MessageLite)gild.a), ffdg0, ((MessageLite)ffdg0), 100004, hfxe.k);
    }

    private ffdg() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)ffdg.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", ffdd.class});
                }
                case 3: {
                    return new ffdg();
                }
                case 4: {
                    return new ffdc();
                }
                case 5: {
                    return ffdg.a;
                }
                case 6: {
                    Object object1 = ffdg.d;
                    if(object1 == null) {
                        Class class0 = ffdg.class;
                        synchronized(class0) {
                            hfvs0 = ffdg.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffdg.a));
                                ffdg.d = hfvs0;
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

