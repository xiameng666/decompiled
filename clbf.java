import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public abstract class clbf extends clcy {
    public clbf() {
        super(new ByteArrayOutputStream());
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        this.d(ByteBuffer.wrap(((ByteArrayOutputStream)this.i()).toByteArray()), clcq0);
    }

    public abstract void d(ByteBuffer arg1, clcq arg2);
}

