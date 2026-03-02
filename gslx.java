public final class gslx extends ibfx {
    public gslx(iakr iakr0, iakq iakq0) {
        ibuq.f(iakr0, "channel");
        ibuq.f(iakq0, "callOptions");
        super(iakr0, iakq0);
    }

    public final Object a(gsks gsks0, iaof_metadata iaof0, ibrl ibrl0) {
        gslt gslt0;
        if((ibrl0 instanceof gslt)) {
            gslt0 = (gslt)ibrl0;
            int v = gslt0.c;
            if((v & 0x80000000) == 0) {
                gslt0 = new gslt(this, ibrl0);
            }
            else {
                gslt0.c = v - 0x80000000;
            }
        }
        else {
            gslt0 = new gslt(this, ibrl0);
        }
        Object object0 = gslt0.a;
        Object object1 = ibrx.a;
        switch(gslt0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gsls.a;
                if(iaoj0 == null) {
                    synchronized(gsls.class) {
                        iaoj0 = gsls.a;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.locationsharing.orchestrator.LocationSharingOrchestratorService", "CreateShare");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gsks.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gskt.a));
                            iaoj0 = iaog0.build();
                            gsls.a = iaoj0;
                        }
                    }
                }
                gslt0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gsks0, this.b, iaof0, gslt0);
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

    public final Object b(gsky gsky0, iaof_metadata iaof0, ibrl ibrl0) {
        gslu gslu0;
        if((ibrl0 instanceof gslu)) {
            gslu0 = (gslu)ibrl0;
            int v = gslu0.c;
            if((v & 0x80000000) == 0) {
                gslu0 = new gslu(this, ibrl0);
            }
            else {
                gslu0.c = v - 0x80000000;
            }
        }
        else {
            gslu0 = new gslu(this, ibrl0);
        }
        Object object0 = gslu0.a;
        Object object1 = ibrx.a;
        switch(gslu0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gsls.d;
                if(iaoj0 == null) {
                    synchronized(gsls.class) {
                        iaoj0 = gsls.d;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.locationsharing.orchestrator.LocationSharingOrchestratorService", "EndShare");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gsky.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gskz.a));
                            iaoj0 = iaog0.build();
                            gsls.d = iaoj0;
                        }
                    }
                }
                gslu0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gsky0, this.b, iaof0, gslu0);
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

    public final Object c(gslj gslj0, iaof_metadata iaof0, ibrl ibrl0) {
        gslv gslv0;
        if((ibrl0 instanceof gslv)) {
            gslv0 = (gslv)ibrl0;
            int v = gslv0.c;
            if((v & 0x80000000) == 0) {
                gslv0 = new gslv(this, ibrl0);
            }
            else {
                gslv0.c = v - 0x80000000;
            }
        }
        else {
            gslv0 = new gslv(this, ibrl0);
        }
        Object object0 = gslv0.a;
        Object object1 = ibrx.a;
        switch(gslv0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gsls.b;
                if(iaoj0 == null) {
                    synchronized(gsls.class) {
                        iaoj0 = gsls.b;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.locationsharing.orchestrator.LocationSharingOrchestratorService", "ListShares");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gslj.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gslm.a));
                            iaoj0 = iaog0.build();
                            gsls.b = iaoj0;
                        }
                    }
                }
                gslv0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gslj0, this.b, iaof0, gslv0);
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
        return new gslx(iakr0, iakq0);
    }

    public final Object e(gsmj gsmj0, iaof_metadata iaof0, ibrl ibrl0) {
        gslw gslw0;
        if((ibrl0 instanceof gslw)) {
            gslw0 = (gslw)ibrl0;
            int v = gslw0.c;
            if((v & 0x80000000) == 0) {
                gslw0 = new gslw(this, ibrl0);
            }
            else {
                gslw0.c = v - 0x80000000;
            }
        }
        else {
            gslw0 = new gslw(this, ibrl0);
        }
        Object object0 = gslw0.a;
        Object object1 = ibrx.a;
        switch(gslw0.c) {
            case 0: {
                ibnx.b(object0);
                iakr iakr0 = this.a;
                gRPCMethodDescriptor iaoj0 = gsls.c;
                if(iaoj0 == null) {
                    synchronized(gsls.class) {
                        iaoj0 = gsls.c;
                        if(iaoj0 == null) {
                            gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                            iaog0.methodType = gRPCMethodType.a;
                            iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.locationsharing.orchestrator.LocationSharingOrchestratorService", "UpdateShare");
                            iaog0.setSampledToLocalTracing();
                            iaog0.requestMarshaller = new ibjh(((MessageLite)gsmj.a));
                            iaog0.responseMarshaller = new ibjh(((MessageLite)gsmk.a));
                            iaoj0 = iaog0.build();
                            gsls.c = iaoj0;
                        }
                    }
                }
                gslw0.c = 1;
                object0 = ibge.a(iakr0, iaoj0, gsmj0, this.b, iaof0, gslw0);
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
}

