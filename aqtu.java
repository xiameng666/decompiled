import android.content.Context;

public final class aqtu implements aqty {
    public final aqvf a;
    public aqtw b;
    public aqtv c;
    public ibjp d;
    private final gful_cronetEngineProvider e;

    public aqtu(Context context0) {
        aqvf aqvf0 = aqvf.b(context0, 3);
        aqts aqts0 = new aqts(context0);
        super();
        this.d = null;
        this.a = aqvf0;
        this.e = gfus.a(((gful_cronetEngineProvider)aqts0));
    }

    @Override  // aqty
    public final void a(aqtw aqtw0, aqtv aqtv0, aqvd aqvd0) {
        this.b = aqtw0;
        this.c = aqtv0;
        ((fpty)this.e.mr()).a(fpua.a, new aqtt(this, new Long[]{((long)0L)}, new Boolean[]{Boolean.valueOf(false)}, aqvd0));
    }

    @Override  // aqty
    public final void b(aqvd aqvd0) {
        this.b = null;
        this.c = null;
        ibjp ibjp0 = this.d;
        if(ibjp0 != null) {
            ibjp0.d("Canceling Photos status stream", null);
        }
    }
}

