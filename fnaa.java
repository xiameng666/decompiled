import java.util.logging.Level;

public abstract class fnaa {
    public final String a;

    protected fnaa(String s) {
        this.a = s;
    }

    public abstract void c(Level arg1, String arg2, Throwable arg3, String arg4, Object[] arg5);

    public abstract void d();

    public final void e(String s) {
        this.c(Level.SEVERE, this.a, null, s, new Object[0]);
    }

    public final void f(Throwable throwable0, String s) {
        this.c(Level.SEVERE, this.a, throwable0, s, new Object[0]);
    }

    public final void g(String s, Object[] arr_object) {
        this.c(Level.INFO, this.a, null, s, arr_object);
    }

    public final void h(Throwable throwable0, String s) {
        this.c(Level.INFO, this.a, throwable0, s, new Object[0]);
    }

    public final void i(String s) {
        this.c(Level.WARNING, this.a, null, s, new Object[0]);
    }

    public final void j(Throwable throwable0, String s) {
        this.c(Level.WARNING, this.a, throwable0, s, new Object[0]);
    }
}

