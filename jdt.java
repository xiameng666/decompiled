public final class jdt {
    public final byk a;
    public final jiz b;
    public final bzk c;
    private final Object d;

    public jdt() {
        this.d = null;
        this.a = new byk(16);
        this.c = new bzk(null);
        this.b = new jiz();
    }

    public static void a(jdt jdt0, jdy jdy0, Object object0) {
        jdr jdr0 = new jdr(jdy0);
        synchronized(jdt0.b) {
            if(object0 == null) {
                jdq jdq0 = new jdq(null);
                jdt0.c.k(jdr0, jdq0);
            }
            else {
                jdq jdq1 = new jdq(object0);
                jdt0.a.e(jdr0, jdq1);
            }
        }
    }

    public final Object b(jdy jdy0, ibts ibts0, ibrl ibrl0) {
        jdr jdr1;
        jds jds0;
        if((ibrl0 instanceof jds)) {
            jds0 = (jds)ibrl0;
            int v = jds0.c;
            if((v & 0x80000000) == 0) {
                jds0 = new jds(this, ibrl0);
            }
            else {
                jds0.c = v - 0x80000000;
            }
        }
        else {
            jds0 = new jds(this, ibrl0);
        }
        Object object0 = jds0.a;
        Object object1 = ibrx.a;
        switch(jds0.c) {
            case 0: {
                ibnx.b(object0);
                jdr jdr0 = new jdr(jdy0);
                synchronized(this.b) {
                    jdq jdq0 = (jdq)this.a.d(jdr0);
                    if(jdq0 == null) {
                        jdq0 = (jdq)this.c.a(jdr0);
                    }
                    if(jdq0 != null) {
                        return jdq0.a;
                    }
                }
                jds0.d = jdr0;
                jds0.c = 1;
                Object object2 = ibts0.a(jds0);
                if(object2 != object1) {
                    object0 = object2;
                    jdr1 = jdr0;
                    break;
                }
                return object1;
            }
            case 1: {
                jdr1 = jds0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        synchronized(this.b) {
            if(object0 == null) {
                jdq jdq1 = new jdq(null);
                this.c.k(jdr1, jdq1);
            }
            else {
                jdq jdq2 = new jdq(object0);
                this.a.e(jdr1, jdq2);
            }
        }
        return object0;
    }
}

