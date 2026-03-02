public final class araq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final araq a;
    public hfuo b;
    private static volatile Parser c;

    static {
        araq araq0 = new araq();
        araq.a = araq0;
        ProtoLiteMessage.L(araq.class, ((ProtoLiteMessage)araq0));
    }

    private araq() {
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
                    return new hfvw(((MessageLite)araq.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", arap.class});
                }
                case 3: {
                    return new araq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)araq.a));
                }
                case 5: {
                    return araq.a;
                }
                case 6: {
                    Object object1 = araq.c;
                    if(object1 == null) {
                        Class class0 = araq.class;
                        synchronized(class0) {
                            hfvs0 = araq.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)araq.a));
                                araq.c = hfvs0;
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

