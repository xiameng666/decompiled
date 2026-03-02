public final class bgga {
    public static gged_interceptors a(gged_interceptors gged0) {
        ggdy ggdy0 = new ggdy();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gqlt gqlt0 = (gqlt)gged0.get(v1);
            gged_interceptors gged1 = gqlt0.c;
            int v2 = ((ggna)gged1).c;
            for(int v3 = 0; v3 < v2; ++v3) {
                gqmd gqmd0 = (gqmd)gged1.get(v3);
                grdf grdf0 = (grdf)((bedg)gqmd0.j()).b.f(new grdf(""));
                if(gqmd0.i().equals(gqmg.b) && !grdf0.a()) {
                    ggdy0.i(new bedh(gqmd0, gqlt0.b));
                }
            }
        }
        return ggdy0.h();
    }

    public static ggfd b(gged_interceptors gged0) {
        ggez ggez0 = new ggez();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gqlt gqlt0 = (gqlt)gged0.get(v1);
            gged_interceptors gged1 = gqlt0.c;
            int v2 = ((ggna)gged1).c;
            for(int v3 = 0; v3 < v2; ++v3) {
                gqmd gqmd0 = (gqmd)gged1.get(v3);
                String s = gqmd0.k();
                if(!s.isEmpty()) {
                    s = grcj.a(s);
                }
                grdf grdf0 = (grdf)((bedg)gqmd0.j()).b.f(new grdf(""));
                if(gqmd0.i().equals(gqmg.b) && !s.isEmpty() && !grdf0.a()) {
                    ggez0.j(new bggb(s, grdf0), new bedh(gqmd0, gqlt0.b));
                }
            }
        }
        return ggez0.e();
    }
}

