public final class hkor extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkor a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hkor hkor0 = new hkor();
        hkor.a = hkor0;
        ProtoLiteMessage.L(hkor.class, ((ProtoLiteMessage)hkor0));
    }

    private hkor() {
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
                    return new hfvw(((MessageLite)hkor.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hkol.class});
                }
                case 3: {
                    return new hkor();
                }
                case 4: {
                    return new hkoq();
                }
                case 5: {
                    return hkor.a;
                }
                case 6: {
                    Object object1 = hkor.c;
                    if(object1 == null) {
                        Class class0 = hkor.class;
                        synchronized(class0) {
                            hfvs0 = hkor.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkor.a));
                                hkor.c = hfvs0;
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

