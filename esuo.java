import java.util.LinkedList;

public final class esuo {
    int a;
    LinkedList b;
    essp c;

    public esuo() {
        this.b = new LinkedList();
    }

    public final byte[] a(int v) {
        return this.b.isEmpty() || v <= 0 || v - 1 >= this.b.size() ? null : ((byte[])this.b.get(v - 1));
    }

    public final void b(essp essp0) {
        this.c = essp0;
        this.b = (LinkedList)essp0.e();
    }

    final void c() {
        byte[] arr_b = this.a(1);
        arr_b[0] = (byte)(arr_b[0] & 0xF0);
        if(arr_b.length != 0 && arr_b.length == this.a + 1 && this.b.size() > 0) {
            this.b.add(0, arr_b);
        }
    }
}

