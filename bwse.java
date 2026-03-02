import com.google.android.gms.icing.nativeindex.NativeIndex;

abstract class bwse implements bwsi {
    private final int a;

    public bwse(int v) {
        this.a = v;
    }

    @Override  // bwsi
    public final int a() {
        return this.a;
    }

    @Override  // bwsi
    public final void b(bwmx bwmx0, bwud bwud0) {
        NativeIndex nativeIndex0 = bwmx0.m;
        bwuc bwuc0 = bwmx0.l;
        bwuj bwuj0 = bwmx0.i;
        if(nativeIndex0 != null && bwuc0 != null && bwuj0 != null) {
            this.c(bwmx0, bwud0, nativeIndex0, bwuc0, bwuj0);
            return;
        }
        bwne.u("Internal error. NativeIndex:%s ClientRegistry:%s CorpusMap:%s", new Object[]{String.valueOf(nativeIndex0), String.valueOf(bwuc0), String.valueOf(bwuj0)});
        throw new gopm("Internal error.");
    }

    protected abstract void c(bwmx arg1, bwud arg2, NativeIndex arg3, bwuc arg4, bwuj arg5);

    @Override  // bwsi
    public void d(bwqt bwqt0, bwud bwud0, bwmx bwmx0) {
        throw null;
    }

    @Override  // bwsi
    public void e(bwmx bwmx0) {
    }
}

