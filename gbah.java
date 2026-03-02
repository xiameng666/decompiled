import android.util.Log;

public final class gbah implements ibts {
    public static final gbah a;

    static {
        gbah.a = new gbah();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Throwable)object0), "throwable");
        if(!(((Throwable)object0) instanceof IllegalStateException)) {
            throw (Throwable)object0;
        }
        Log.e("TTRExceptionStrategy", "Caught and silenced exception", ((Throwable)object0));
        return ibom.a;
    }
}

