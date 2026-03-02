public final class aime extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aime a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        aime aime0 = new aime();
        aime.a = aime0;
        ProtoLiteMessage.L(aime.class, ((ProtoLiteMessage)aime0));
    }

    private aime() {
        this.b = hfvv.a;
        this.c = hfvv.a;
    }

    public final void b() {
        hfuo hfuo0 = this.c;
        if(!hfuo0.c()) {
            this.c = ProtoLiteMessage.E(hfuo0);
        }
    }

    public final void c() {
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
                    return new hfvw(((MessageLite)aime.a), "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001B\u0003\u001B", new Object[]{"b", aimh.class, "c", aimg.class});
                }
                case 3: {
                    return new aime();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return aime.a;
                }
                case 6: {
                    Object object1 = aime.d;
                    if(object1 == null) {
                        Class class0 = aime.class;
                        synchronized(class0) {
                            hfvs0 = aime.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aime.a));
                                aime.d = hfvs0;
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

