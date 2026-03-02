import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.ExecutionException;

public final class ajdc implements evpo {
    public final ajde a;

    public ajdc(ajde ajde0) {
        this.a = ajde0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            if(evql0.j() != null && ((Configurations)evql0.j()).a != null) {
                String s = ((Configurations)evql0.j()).a;
                return this.a.b.e(s);
            }
            return evrg.c(new ExecutionException(new IllegalStateException("registerSync result was null")));
        }
        if(((evqu)evql0).d) {
            return evrg.b();
        }
        return evql0.i() == null ? evrg.c(new ExecutionException(new IllegalStateException("Task was not successful, but exception is null"))) : evrg.c(evql0.i());
    }
}

