import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

public abstract class ajck extends ajcj {
    @Override  // ajcj
    protected final Reference c(Object object0) {
        return new SoftReference(object0);
    }
}

