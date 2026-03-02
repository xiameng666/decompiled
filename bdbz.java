import java.util.concurrent.CancellationException;

public final class bdbz implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            return evrg.d(Boolean.valueOf(true));
        }
        if(((evqu)evql0).d) {
            return evrg.c(new CancellationException());
        }
        return bdcd.g(evql0.i()) ? evrg.d(Boolean.valueOf(false)) : evrg.c(evql0.i());
    }
}

