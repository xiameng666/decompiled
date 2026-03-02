import java.util.Map.Entry;

public final class dfvw implements Runnable {
    public final dfzz a;

    public dfvw(dfzz dfzz0) {
        this.a = dfzz0;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        dfzz0.av();
        dfzz0.w.n();
        if(hvrc.a.b().ao()) {
            dfzz0.aE();
            ggeo ggeo0 = ggeo.k(dfzz0.a);
            dfzz0.a.clear();
            ggqj ggqj0 = ggeo0.v().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                dfzz0.aJ(((String)((Map.Entry)object0).getKey()), ((byte[])((Map.Entry)object0).getValue()));
            }
        }
    }
}

