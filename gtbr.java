public final class gtbr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtbr a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gtbr gtbr0 = new gtbr();
        gtbr.a = gtbr0;
        ProtoLiteMessage.L(gtbr.class, ((ProtoLiteMessage)gtbr0));
    }

    private gtbr() {
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
                    return new hfvw(((MessageLite)gtbr.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gtbs.class});
                }
                case 3: {
                    return new gtbr();
                }
                case 4: {
                    return new gtbq();
                }
                case 5: {
                    return gtbr.a;
                }
                case 6: {
                    Object object1 = gtbr.c;
                    if(object1 == null) {
                        Class class0 = gtbr.class;
                        synchronized(class0) {
                            hfvs0 = gtbr.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtbr.a));
                                gtbr.c = hfvs0;
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

