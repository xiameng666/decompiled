public final class gpuy {
    private static final double[] a;
    private static final boolean[] b;
    private motionState c;
    private motionState d;
    private long e;
    private long f;
    private final fhtx g;
    private final fhtt h;
    private final fhtt i;
    private final fhtt j;
    private final fhtt k;

    static {
        gpuy.a = new double[]{0.3, 0.3, 0.4};
        gpuy.b = new boolean[]{true, true, false};
    }

    public gpuy() {
        this.c = motionState.UNKNOWN;
        this.d = motionState.UNKNOWN;
        this.e = 0L;
        this.f = 0L;
        fhtv fhtv0 = new fhtv();
        fhtv0.a(0, 0, 0.6);
        Integer integer0 = (int)1;
        fhtv0.a(0, 1, 0.39);
        fhtv0.a(0, 2, 0.01);
        fhtv0.a(1, 0, 0.3);
        fhtv0.a(1, 1, 0.6);
        fhtv0.a(1, 2, 0.1);
        fhtv0.a(2, 0, 0.39);
        fhtv0.a(2, 1, 0.01);
        fhtv0.a(2, 2, 0.6);
        this.g = new fhtx(gpuy.a, fhtv0);
        fhtu fhtu0 = new fhtu();
        fhtu0.a(0, 2, 0.925);
        fhtu0.a(0, 3, 0.065);
        fhtu0.a(0, 0, 0.95);
        fhtu0.a(0, 1, 0.01);
        fhtu0.a(1, 2, 0.925);
        fhtu0.a(1, 3, 0.065);
        fhtu0.a(1, 0, 0.1);
        fhtu0.a(1, 1, 0.95);
        fhtu0.a(2, 2, 0.037);
        fhtu0.a(2, 3, 0.955);
        fhtu0.a(2, 0, 0.1);
        int v = 0;
        while(v < 4) {
            for(int v1 = 0; v1 < 3; ++v1) {
                if(v1 != 2 && fhtu0.a[v][v1] == 2) {
                    throw new IllegalArgumentException(String.format("Can\'t link state %s because state %s already links to it", ((int)2), v1));
                }
            }
            byte[] arr_b = fhtu0.a[v];
            if(arr_b[1] != 1) {
                throw new IllegalArgumentException(String.format("Can\'t link to a state that already has a link: state=%s", integer0));
            }
            if(v != 1 && arr_b[2] != 2) {
                throw new IllegalArgumentException(String.format("Can\'t link more than one observation on state %s, obs1=%s, obs2=%s", integer0, integer0, v));
            }
            ++v;
            continue;
        }
        fhtu0.a[1][2] = 1;
        this.h = fhtu0.b(2);
        this.i = fhtu0.b(3);
        this.j = fhtu0.b(1);
        this.k = fhtu0.b(0);
    }

    public final fuxg a() {
        long v = this.e;
        long v1 = this.f;
        switch(this.d.ordinal()) {
            case 1: {
                return new fuxg(gged_interceptors.l(new fuxi(fuxh.d, 100)), v, v1, 0);
            }
            case 2: {
                return new fuxg(gged_interceptors.l(new fuxi(fuxh.c, 100)), v, v1, 0);
            }
            case 3: {
                return new fuxg(gged_interceptors.l(new fuxi(fuxh.b, 100)), v, v1, 0);
            }
            case 4: {
                return new fuxg(gged_interceptors.l(new fuxi(fuxh.a, 100)), v, v1, 0);
            }
            default: {
                return new fuxg(gged_interceptors.l(new fuxi(fuxh.e, 100)), v, v1, 0);
            }
        }
    }

    public final void b() {
        this.g.a();
        this.c = motionState.UNKNOWN;
    }

    public final void c(gptu_Position gptu0) {
        if(gptu0.t()) {
            if((gptu0.speedMps >= 5.0f)) {
                this.g.b(this.k);
                return;
            }
            this.g.b(this.j);
        }
    }

    public final void d(fuxg fuxg0) {
        motionState gpuu2;
        motionState gpuu0 = gptx.a(fuxg0);
        motionState gpuu1 = motionState.ON_BICYCLE;
        if(gpuu0.equals(gpuu1) || gpuu0.equals(motionState.IN_VEHICLE)) {
            this.g.b(this.h);
        }
        else if(gpuu0.equals(motionState.ON_FOOT)) {
            this.g.b(this.i);
        }
        fhtw fhtw0 = this.g.c;
        int v = this.g.f;
        fhtw0.c = v;
        fhtx fhtx0 = fhtw0.d;
        int v1 = fhtx0.d;
        fhtw0.a = v1;
        fhtw0.e = fhtx0.g;
        int v2 = fhtx0.e;
        fhtw0.b = v2 + 1;
        boolean[] arr_z = gpuy.b;
        fhtw0.b = v2;
        if(v2 > 0) {
            int v3 = v1 - 1;
            fhtw0.a = v3;
            if(v3 < 0) {
                v3 = v2 - 1;
                fhtw0.a = v3;
            }
            fhtw0.c = fhtx0.a[v][v3];
            fhtw0.e = (fhtt)fhtx0.b.get(v3);
        }
        if(arr_z[v]) {
            gpuu2 = this.c;
            if(gpuu2 == motionState.UNKNOWN) {
                gpuu2 = gpuu0;
            }
        }
        else {
            gpuu2 = gpuu0;
        }
        if(gpuu0.equals(motionState.IN_VEHICLE) || gpuu0.equals(gpuu1)) {
            this.c = gpuu0;
        }
        this.d = gpuu2;
        this.e = fuxg0.b;
        this.f = fuxg0.c;
    }
}

