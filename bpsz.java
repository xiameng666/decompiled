public final class bpsz implements glzn {
    public final bptb a;

    public bpsz(bptb bptb0) {
        this.a = bptb0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((gfsx)object0).i()) {
            return gmbu.h(new cjuh(13, "node_id for device is not known"));
        }
        String s = (String)((gfsx)object0).d();
        return gdta.g(fhra.b(((bptx)this.a.a).c.h(s, "/findmydevice/start-finder-advertising", null))).h(new bpth(), gmap.a);
    }
}

