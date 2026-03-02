public final class hfcw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfcw a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hfcw hfcw0 = new hfcw();
        hfcw.a = hfcw0;
        ProtoLiteMessage.L(hfcw.class, ((ProtoLiteMessage)hfcw0));
        hfcw.c = ProtoLiteMessage.Q(((MessageLite)hesv.a), hfcw0, ((MessageLite)hfcw0), 0x539AC94, hfxe.k);
    }

    private hfcw() {
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
                    return new hfvw(((MessageLite)hfcw.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hfcu.class});
                }
                case 3: {
                    return new hfcw();
                }
                case 4: {
                    return new hfcv();
                }
                case 5: {
                    return hfcw.a;
                }
                case 6: {
                    Object object1 = hfcw.d;
                    if(object1 == null) {
                        Class class0 = hfcw.class;
                        synchronized(class0) {
                            hfvs0 = hfcw.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfcw.a));
                                hfcw.d = hfvs0;
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

