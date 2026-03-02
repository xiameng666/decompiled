public final class arkn {
    private gged_interceptors a;

    public final gged_interceptors a() {
        gged_interceptors gged1;
        synchronized(this) {
            gged_interceptors gged0 = this.a;
            if(gged0 == null) {
                return ggna.a;
            }
            gged1 = gged_interceptors.i(gged0);
        }
        return gged1;
    }

    public final void b(gged_interceptors gged0) {
        synchronized(this) {
            ggdy ggdy0 = new ggdy();
            int v1 = gged0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                arjt arjt0 = (arjt)gged0.get(v2);
                String s = arjt0.a;
                ggdy0.i(new arkm(s, arjt0.b.a, arjt0.b.b));
                gged_interceptors gged1 = arjt0.c;
                int v3 = gged1.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    arju arju0 = (arju)gged1.get(v4);
                    ggdy0.i(new arkm(s, arju0.a, arju0.b));
                }
            }
            this.a = ggdy0.h();
        }
    }
}

