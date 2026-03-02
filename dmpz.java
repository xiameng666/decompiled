public final class dmpz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dmpz a;
    public hfvh b;
    private static volatile Parser c;

    static {
        dmpz dmpz0 = new dmpz();
        dmpz.a = dmpz0;
        ProtoLiteMessage.L(dmpz.class, ((ProtoLiteMessage)dmpz0));
    }

    private dmpz() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)dmpz.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dmpy.a});
                }
                case 3: {
                    return new dmpz();
                }
                case 4: {
                    return new dmpv();
                }
                case 5: {
                    return dmpz.a;
                }
                case 6: {
                    Object object1 = dmpz.c;
                    if(object1 == null) {
                        Class class0 = dmpz.class;
                        synchronized(class0) {
                            hfvs0 = dmpz.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dmpz.a));
                                dmpz.c = hfvs0;
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

