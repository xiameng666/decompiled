import java.lang.ref.WeakReference;

final class buh extends bhl {
    private final WeakReference a;

    public buh(bui bui0) {
        this.a = new WeakReference(bui0);
    }

    @Override  // bhl
    public final void b(int v, bhv bhv0) {
        bui bui0 = (bui)this.a.get();
        if(bui0 != null) {
            for(Object object0: bui0.a) {
                bmb bmb0 = ((ben)object0).m;
                for(Object object1: bmb0.f()) {
                    ((bhl)object1).b(v, new buj(bhv0, bmb0.g.j, -1L));
                }
            }
        }
    }
}

