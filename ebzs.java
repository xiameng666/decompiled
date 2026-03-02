import j..util.Optional;

public final class ebzs implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        boolean z = false;
        Object object0 = Boolean.valueOf(false);
        if(!evql0.n()) {
            return object0;
        }
        if(((Optional)evql0.j()).isEmpty()) {
            return object0;
        }
        dykv dykv0 = ((dyhj)((Optional)evql0.j()).get()).c;
        if(dykv0 == null) {
            dykv0 = dykv.a;
        }
        dylc dylc0 = dykv0.c == null ? dylc.a : dykv0.c;
        if(dyes.b(dylc0.j) == 4) {
            int v = (dylc0.i == null ? dyih.a : dylc0.i).d;
            int v1 = 2;
            if(v != 0) {
                switch(v) {
                    case 1: {
                        v1 = 3;
                        break;
                    }
                    case 2: {
                        v1 = 4;
                        break;
                    }
                    case 3: {
                        v1 = 5;
                        break;
                    }
                    default: {
                        v1 = 0;
                    }
                }
            }
            if(v1 == 4) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

