public final class hoia extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hoia a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hoia hoia0 = new hoia();
        hoia.a = hoia0;
        ProtoLiteMessage.L(hoia.class, ((ProtoLiteMessage)hoia0));
    }

    private hoia() {
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
                    return new hfvw(((MessageLite)hoia.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hoib.class});
                }
                case 3: {
                    return new hoia();
                }
                case 4: {
                    return new hohz();
                }
                case 5: {
                    return hoia.a;
                }
                case 6: {
                    Object object1 = hoia.c;
                    if(object1 == null) {
                        Class class0 = hoia.class;
                        synchronized(class0) {
                            hfvs0 = hoia.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hoia.a));
                                hoia.c = hfvs0;
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

