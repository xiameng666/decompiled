public final class ghok extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ghok a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        ghok ghok0 = new ghok();
        ghok.a = ghok0;
        ProtoLiteMessage.L(ghok.class, ((ProtoLiteMessage)ghok0));
    }

    private ghok() {
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
                    return new hfvw(((MessageLite)ghok.a), "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"b", ghoi.class, "c", ghur.class});
                }
                case 3: {
                    return new ghok();
                }
                case 4: {
                    return new ghoj();
                }
                case 5: {
                    return ghok.a;
                }
                case 6: {
                    Object object1 = ghok.d;
                    if(object1 == null) {
                        Class class0 = ghok.class;
                        synchronized(class0) {
                            hfvs0 = ghok.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ghok.a));
                                ghok.d = hfvs0;
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

