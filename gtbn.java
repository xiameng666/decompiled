public final class gtbn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtbn a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        gtbn gtbn0 = new gtbn();
        gtbn.a = gtbn0;
        ProtoLiteMessage.L(gtbn.class, ((ProtoLiteMessage)gtbn0));
    }

    private gtbn() {
        this.b = hfvv.a;
        this.c = hfvv.a;
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
                    return new hfvw(((MessageLite)gtbn.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"b", gszo.class, "c", gtbm.class});
                }
                case 3: {
                    return new gtbn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtbn.a));
                }
                case 5: {
                    return gtbn.a;
                }
                case 6: {
                    Object object1 = gtbn.d;
                    if(object1 == null) {
                        Class class0 = gtbn.class;
                        synchronized(class0) {
                            hfvs0 = gtbn.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtbn.a));
                                gtbn.d = hfvs0;
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

