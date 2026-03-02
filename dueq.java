public final class dueq implements lqj {
    public final duew a;

    public dueq(duew duew0) {
        this.a = duew0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        duew duew0 = this.a;
        duew0.aI = ((dtyx)object0).a;
        duew0.aJ = ((dtyx)object0).b;
        duew0.aK = ((dtyx)object0).c;
        if(duew0.aI != null && !((ProtoLiteMessage)duew0.aI).equals(duew0.aH)) {
            duew0.aH = duew0.aI;
            duew0.at.j(9, duew0.aH);
        }
        duew0.ai.u.g(duew0.getViewLifecycleOwner(), new dudg(duew0));
        duew0.I(duew0.aK, duew0.aI, duew0.aJ);
    }
}

