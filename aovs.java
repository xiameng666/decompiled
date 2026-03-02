import android.view.autofill.AutofillId;
import java.util.function.IntFunction;

public final class aovs implements IntFunction {
    @Override
    public final Object apply(int v) {
        return new AutofillId[v];
    }
}

