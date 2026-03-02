public final class cptr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final cptr a;
    public hfuo b;
    private static volatile Parser c;

    static {
        cptr cptr0 = new cptr();
        cptr.a = cptr0;
        ProtoLiteMessage.L(cptr.class, ((ProtoLiteMessage)cptr0));
    }

    private cptr() {
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
                    return new hfvw(((MessageLite)cptr.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", cptx.class});
                }
                case 3: {
                    return new cptr();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return cptr.a;
                }
                case 6: {
                    Object object1 = cptr.c;
                    if(object1 == null) {
                        Class class0 = cptr.class;
                        synchronized(class0) {
                            hfvs0 = cptr.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)cptr.a));
                                cptr.c = hfvs0;
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

