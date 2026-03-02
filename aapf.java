public final class aapf implements zgz {
    public final aapz a;

    public aapf(aapz aapz0) {
        this.a = aapz0;
    }

    @Override  // zgz
    public final Object a(Object object0, Object object1) {
        boolean z = true;
        if(!((gfsx)object1).i() || !((zhq)((gfsx)object1).d()).a) {
            aapz aapz0 = this.a;
            if(aapz0.j) {
                z = ((zhq)object0).a;
                if(!z) {
                    aapz0.j = false;
                    return Boolean.valueOf(z);
                }
            }
            else if(!((zhq)object0).a || !((zhq)object0).b) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}

