import android.transition.Transition;

final class cy extends cl {
    public final Object b;
    public final boolean c;
    public final Object d;

    public cy(gw gw0, boolean z, boolean z1) {
        ibuq.f(gw0, "operation");
        Object object1;
        Object object0;
        super(gw0);
        gv gv0 = gv.b;
        boolean z2 = false;
        boolean z3 = true;
        if(gw0.a != gv0) {
            if(z) {
                object0 = gw0.c.getReturnTransition();
                z2 = true;
            }
            else {
                object0 = gw0.c.getExitTransition();
            }
        }
        else if(z) {
            object0 = gw0.c.getReenterTransition();
            z2 = true;
        }
        else {
            object0 = gw0.c.getEnterTransition();
        }
        this.b = object0;
        if(gw0.a == gv0) {
            z3 = z2 ? gw0.c.getAllowReturnTransitionOverlap() : gw0.c.getAllowEnterTransitionOverlap();
        }
        this.c = z3;
        if(!z1) {
            object1 = null;
        }
        else if(z2) {
            object1 = gw0.c.getSharedElementReturnTransition();
        }
        else {
            object1 = gw0.c.getSharedElementEnterTransition();
        }
        this.d = object1;
    }

    public final gi a() {
        Object object0 = this.d;
        Object object1 = this.b;
        gi gi0 = this.d(object1);
        gi gi1 = this.d(object0);
        if(gi0 != null && gi1 != null && gi0 != gi1) {
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.c + " returned Transition " + object1 + " which uses a different Transition  type than its shared element transition " + object0);
        }
        return gi0 == null ? gi1 : gi0;
    }

    public final boolean c() {
        return this.d != null;
    }

    private final gi d(Object object0) {
        if(object0 == null) {
            return null;
        }
        gi gi0 = ga.a;
        if(!(object0 instanceof Transition)) {
            gi gi1 = ga.b;
            if(gi1 != null && gi1.m(object0)) {
                return gi1;
            }
            throw new IllegalArgumentException("Transition " + object0 + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
        }
        return gi0;
    }
}

