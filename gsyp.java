public final class gsyp extends ibfx {
    public gsyp(iakr iakr0, iakq iakq0) {
        ibuq.f(iakr0, "channel");
        ibuq.f(iakq0, "callOptions");
        super(iakr0, iakq0);
    }

    public final Object a(hfkn hfkn0, iaof_metadata iaof0, ibrl ibrl0) {
        gsym gsym0;
        if((ibrl0 instanceof gsym)) {
            gsym0 = (gsym)ibrl0;
            int v = gsym0.c;
            if((v & 0x80000000) == 0) {
                gsym0 = new gsym(this, ibrl0);
            }
            else {
                gsym0.c = v - 0x80000000;
            }
        }
        else {
            gsym0 = new gsym(this, ibrl0);
        }
        Object object0 = gsym0.a;
        Object object1 = ibrx.a;
        switch(gsym0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gsyl.b;
                if(iaoj0 == null) {
                    synchronized(gsyl.class) {
                        iaoj0 = gsyl.b;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.ppn.phosphor.v1.IPBlindingService", "AuthAndSign");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)hfkn.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)hfko.a));
                            iaoj0 = iaog0.build();
                            gsyl.b = iaoj0;
                        }
                    }
                }
                gsym0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, hfkn0, this.b, iaof0, gsym0);
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

    public final Object b(hfkp hfkp0, iaof_metadata iaof0, ibrl ibrl0) {
        gsyn gsyn0;
        if((ibrl0 instanceof gsyn)) {
            gsyn0 = (gsyn)ibrl0;
            int v = gsyn0.c;
            if((v & 0x80000000) == 0) {
                gsyn0 = new gsyn(this, ibrl0);
            }
            else {
                gsyn0.c = v - 0x80000000;
            }
        }
        else {
            gsyn0 = new gsyn(this, ibrl0);
        }
        Object object0 = gsyn0.a;
        Object object1 = ibrx.a;
        switch(gsyn0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gsyl.a;
                if(iaoj0 == null) {
                    synchronized(gsyl.class) {
                        iaoj0 = gsyl.a;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.ppn.phosphor.v1.IPBlindingService", "GetInitialData");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)hfkp.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)hfkq.a));
                            iaoj0 = iaog0.build();
                            gsyl.a = iaoj0;
                        }
                    }
                }
                gsyn0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, hfkp0, this.b, iaof0, gsyn0);
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

    public final Object c(hfkr hfkr0, iaof_metadata iaof0, ibrl ibrl0) {
        gsyo gsyo0;
        if((ibrl0 instanceof gsyo)) {
            gsyo0 = (gsyo)ibrl0;
            int v = gsyo0.c;
            if((v & 0x80000000) == 0) {
                gsyo0 = new gsyo(this, ibrl0);
            }
            else {
                gsyo0.c = v - 0x80000000;
            }
        }
        else {
            gsyo0 = new gsyo(this, ibrl0);
        }
        Object object0 = gsyo0.a;
        Object object1 = ibrx.a;
        switch(gsyo0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gsyl.c;
                if(iaoj0 == null) {
                    synchronized(gsyl.class) {
                        iaoj0 = gsyl.c;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.ppn.phosphor.v1.IPBlindingService", "GetProxyConfig");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)hfkr.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)hfks.a));
                            iaoj0 = iaog0.build();
                            gsyl.c = iaoj0;
                        }
                    }
                }
                gsyo0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, hfkr0, this.b, iaof0, gsyo0);
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

    @Override  // ibjo
    public final ibjo d(iakr iakr0, iakq iakq0) {
        ibuq.f(iakr0, "channel");
        return new gsyp(iakr0, iakq0);
    }
}

