import android.opengl.EGLSurface;

public final class bts {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public bts() {
        throw null;
    }

    public bts(EGLSurface eGLSurface0, int v, int v1) {
        if(eGLSurface0 == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.a = eGLSurface0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bts) && this.a.equals(((bts)object0).a) && this.b == ((bts)object0).b && this.c == ((bts)object0).c;
    }

    @Override
    public final int hashCode() {
        return this.c ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003;
    }

    @Override
    public final String toString() {
        return "OutputSurface{eglSurface=" + this.a + ", width=" + this.b + ", height=" + this.c + "}";
    }
}

