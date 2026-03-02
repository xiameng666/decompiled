import java.io.Serializable;

public final class tql implements Serializable {
    public byte[] a;
    public byte[] b;

    public tql() {
        this.a = new byte[2];
        this.b = new byte[16];
    }
}

