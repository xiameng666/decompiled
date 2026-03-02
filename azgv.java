import android.content.Context;

public final class azgv {
    public final azgt a;

    public azgv(Context context0, bbng bbng0, long v, gful_cronetEngineProvider gful0) {
        azgq azgq0;
        if(v == 1L) {
            azgq0 = new azgq(context0, bbng0, gful0);
        }
        else if(v == 2L) {
            azgq0 = new azgr(context0, bbng0, gful0);
        }
        else if(v == 3L) {
            azgq0 = new azgs(context0, bbng0, gful0);
        }
        else {
            azgq0 = new azgu(context0, bbng0, gful0);
        }
        this.a = azgq0;
    }
}

