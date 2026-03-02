public final class aalx implements zgz {
    public final aamn a;

    public aalx(aamn aamn0) {
        this.a = aamn0;
    }

    @Override  // zgz
    public final Object a(Object object0, Object object1) {
        boolean z = true;
        if(!((gfsx)object1).i() || !((zhq)((gfsx)object1).d()).a) {
            aamn aamn0 = this.a;
            if(aamn0.n) {
                z = ((zhq)object0).a;
                if(z) {
                    aamn0.n = false;
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

