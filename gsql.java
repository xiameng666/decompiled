public final class gsql extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsql a;
    public hfuo b;
    public hfuo c;
    public long d;
    private static volatile Parser e;

    static {
        gsql gsql0 = new gsql();
        gsql.a = gsql0;
        ProtoLiteMessage.L(gsql.class, ((ProtoLiteMessage)gsql0));
    }

    private gsql() {
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
                    return new hfvw(((MessageLite)gsql.a), "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001B\u0002\u001B\u0003\u0002", new Object[]{"b", gsqj.class, "c", gsqj.class, "d"});
                }
                case 3: {
                    return new gsql();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsql.a));
                }
                case 5: {
                    return gsql.a;
                }
                case 6: {
                    Object object1 = gsql.e;
                    if(object1 == null) {
                        Class class0 = gsql.class;
                        synchronized(class0) {
                            hfvs0 = gsql.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsql.a));
                                gsql.e = hfvs0;
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

