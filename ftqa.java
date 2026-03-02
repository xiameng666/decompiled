public final class ftqa {
    public static final Object a(frli frli0, ibrl ibrl0) {
        ftpz ftpz0;
        if((ibrl0 instanceof ftpz)) {
            ftpz0 = (ftpz)ibrl0;
            int v = ftpz0.b;
            if((v & 0x80000000) == 0) {
                ftpz0 = new ftpz(ibrl0);
            }
            else {
                ftpz0.b = v - 0x80000000;
            }
        }
        else {
            ftpz0 = new ftpz(ibrl0);
        }
        Object object0 = ftpz0.a;
        Object object1 = ibrx.a;
        switch(ftpz0.b) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = frli0.a();
                ibuq.e(gmcd0, "getData(...)");
                ftpz0.b = 1;
                object0 = icpu.c(gmcd0, ftpz0);
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
        ibuq.e(object0, "await(...)");
        return object0;
    }

    public static final Object b(frli frli0, ibts ibts0, ibrl ibrl0) {
        Object object0 = icpu.c(frli0.b(new ftpy(new ftpx(ibts0)), gmap.a), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

