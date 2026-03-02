public final class gyvs extends ibfx {
    public gyvs(iakr iakr0) {
        this(iakr0, iakq.a);
    }

    public gyvs(iakr iakr0, iakq iakq0) {
        ibuq.f(iakr0, "channel");
        ibuq.f(iakq0, "callOptions");
        super(iakr0, iakq0);
    }

    public final Object a(gyvk gyvk0, iaof_metadata iaof0, ibrl ibrl0) {
        gyvq gyvq0;
        if((ibrl0 instanceof gyvq)) {
            gyvq0 = (gyvq)ibrl0;
            int v = gyvq0.c;
            if((v & 0x80000000) == 0) {
                gyvq0 = new gyvq(this, ibrl0);
            }
            else {
                gyvq0.c = v - 0x80000000;
            }
        }
        else {
            gyvq0 = new gyvq(this, ibrl0);
        }
        Object object0 = gyvq0.a;
        Object object1 = ibrx.a;
        switch(gyvq0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gyvp.a;
                if(iaoj0 == null) {
                    synchronized(gyvp.class) {
                        iaoj0 = gyvp.a;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("location.nearby.presence.v1.NearbyPresenceService", "ListMyDevices");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gyvk.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gyvl.a));
                            iaoj0 = iaog0.build();
                            gyvp.a = iaoj0;
                        }
                    }
                }
                gyvq0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gyvk0, this.b, iaof0, gyvq0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "unaryRpc(...)");
        return object0;
    }

    public final Object b(gyvv gyvv0, iaof_metadata iaof0, ibrl ibrl0) {
        gyvr gyvr0;
        if((ibrl0 instanceof gyvr)) {
            gyvr0 = (gyvr)ibrl0;
            int v = gyvr0.c;
            if((v & 0x80000000) == 0) {
                gyvr0 = new gyvr(this, ibrl0);
            }
            else {
                gyvr0.c = v - 0x80000000;
            }
        }
        else {
            gyvr0 = new gyvr(this, ibrl0);
        }
        Object object0 = gyvr0.a;
        Object object1 = ibrx.a;
        switch(gyvr0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gyvp.b;
                if(iaoj0 == null) {
                    synchronized(gyvp.class) {
                        iaoj0 = gyvp.b;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("location.nearby.presence.v1.NearbyPresenceService", "NotifyMyDevices");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gyvv.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gyvy.a));
                            iaoj0 = iaog0.build();
                            gyvp.b = iaoj0;
                        }
                    }
                }
                gyvr0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gyvv0, this.b, iaof0, gyvr0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "unaryRpc(...)");
        return object0;
    }

    public static Object c(gyvs gyvs0, gyvv gyvv0, ibrl ibrl0) {
        return gyvs0.b(gyvv0, new iaof_metadata(), ibrl0);
    }

    @Override  // ibjo
    public final ibjo d(iakr iakr0, iakq iakq0) {
        ibuq.f(iakr0, "channel");
        return new gyvs(iakr0, iakq0);
    }
}

