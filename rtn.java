import android.content.Context;

public abstract class rtn extends rve {
    public final Context g() {
        Context context0 = this.b == null ? null : ((Context)this.b.get());
        if(context0 != null) {
            return context0;
        }
        throw new IllegalStateException("Context accessed before it was initialised.");
    }

    protected abstract Object i(Object arg1, ibrl arg2);

    @Override  // rve
    protected final Object j(Context context0, Object object0, ibrl ibrl0) {
        return this.i(object0, ibrl0);
    }
}

