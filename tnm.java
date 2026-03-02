import java.io.Serializable;

public final class tnm implements Serializable {
    public byte[] a;
    public byte[] b;

    public tnm() {
        this.a = new byte[2];
        this.b = new byte[16];
    }
}

