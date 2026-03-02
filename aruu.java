public final class aruu implements Runnable {
    public final aruv a;
    public final String b;
    public final artm c;

    public aruu(aruv aruv0, String s, artm artm0) {
        this.a = aruv0;
        this.b = s;
        this.c = artm0;
    }

    @Override
    public final void run() {
        String s = this.b;
        artm artm0 = this.c;
        this.a.d.put(s, artm0);
        for(Object object0: this.a.c) {
            arvl arvl0 = (arvl)object0;
            gftb.check(arvl0.b);
            int v = arvl0.b.getCount();
            for(int v1 = 0; v1 < v; ++v1) {
                arvd arvd0 = (arvd)arvl0.b.getItem(v1);
                if(arvd0.a.equals(s)) {
                    arvl0.y(arvd0, artm0);
                    break;
                }
            }
            arvl0.b.notifyDataSetChanged();
        }
    }
}

