import java.io.Serializable;

public final class igvo implements Serializable {
    public byte[] a;
    public boolean b;
    public byte[] c;

    public igvo(int v) {
        this.b = true;
        this.c = null;
        this.a = new byte[v];
    }

    public igvo(byte[] arr_b) {
        this.b = true;
        this.c = null;
        this.a = arr_b;
    }

    @Override
    public final String toString() {
        String s = this.a == null ? "No SecData,\t" : "" + String.format("SecData.Len = %d,\t", ((int)this.a.length));
        if(!this.b) {
            s = s + "not ";
        }
        return (this.c == null ? s + "dirty,\t" + "no " : s + "dirty,\t") + "accessKey present.";
    }
}

