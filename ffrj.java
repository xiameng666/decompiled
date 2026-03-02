public final class ffrj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffrj a;
    public hfuo b;
    private static volatile Parser c;

    static {
        ffrj ffrj0 = new ffrj();
        ffrj.a = ffrj0;
        ProtoLiteMessage.L(ffrj.class, ((ProtoLiteMessage)ffrj0));
    }

    private ffrj() {
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
                    return new hfvw(((MessageLite)ffrj.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", ffri.class});
                }
                case 3: {
                    return new ffrj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ffrj.a));
                }
                case 5: {
                    return ffrj.a;
                }
                case 6: {
                    Object object1 = ffrj.c;
                    if(object1 == null) {
                        Class class0 = ffrj.class;
                        synchronized(class0) {
                            hfvs0 = ffrj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffrj.a));
                                ffrj.c = hfvs0;
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

