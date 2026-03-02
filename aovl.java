import android.view.autofill.AutofillId;
import java.util.function.IntFunction;

public final class aovl implements IntFunction {
    @Override
    public final Object apply(int v) {
        return new AutofillId[v];
    }
}

