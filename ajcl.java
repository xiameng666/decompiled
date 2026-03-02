import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class ajcl extends ajcj {
    @Override  // ajcj
    protected final Reference c(Object object0) {
        return new WeakReference(object0);
    }
}

