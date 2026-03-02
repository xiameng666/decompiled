public final class igrm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final igrm a;
    public hfvh b;
    private static volatile Parser c;

    static {
        igrm igrm0 = new igrm();
        igrm.a = igrm0;
        ProtoLiteMessage.L(igrm.class, ((ProtoLiteMessage)igrm0));
    }

    private igrm() {
        this.b = hfvh.a;
    }

    public final hfvh b() {
        hfvh hfvh0 = this.b;
        if(!hfvh0.b) {
            this.b = hfvh0.a();
        }
        return this.b;
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
                    return new hfvw(((MessageLite)igrm.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", igrl.a});
                }
                case 3: {
                    return new igrm();
                }
                case 4: {
                    return new igrk();
                }
                case 5: {
                    return igrm.a;
                }
                case 6: {
                    Object object1 = igrm.c;
                    if(object1 == null) {
                        Class class0 = igrm.class;
                        synchronized(class0) {
                            hfvs0 = igrm.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)igrm.a));
                                igrm.c = hfvs0;
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

