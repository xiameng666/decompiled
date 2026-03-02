public final class blut implements lqj {
    public final bluv a;

    public blut(bluv bluv0) {
        this.a = bluv0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        gmcu gmcu0;
        bluv bluv0 = this.a;
        boolean z = true;
        switch(((blux)object0).a) {
            case 0: {
                bluv0.ah = ((blux)object0).b;
                blul blul0 = bluv0.a;
                bluu bluu0 = bluu.e;
                synchronized(blul0.g) {
                    gmcu0 = blul0.f;
                    if(gmcu0 == null) {
                        z = false;
                    }
                    gftb.r(z, "There is not wating next step future to set.");
                    blul0.f = null;
                }
                gmcu0.q(gfsx.l(bluu0));
                return;
            }
            case 16: {
                bluv0.c = new bluw(1, null, 0);
                bluv0.a.a();
                bluv0.y();
                return;
            }
            default: {
                bluv0.c = new bluw(2, null, 0);
                bluv0.a.a();
                bluv0.y();
            }
        }
    }
}

