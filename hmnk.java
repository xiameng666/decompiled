import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class hmnk {
    public int a;
    public int b;
    public byte[] c;
    public byte[] d;
    public List e;
    public byte f;
    public byte g;
    public int h;
    public byte i;
    public byte j;
    public byte k;
    public byte[] l;
    public byte m;
    public byte[] n;
    public final List o;

    public hmnk(int v, byte b, byte b1) {
        this.e = new LinkedList();
        this.f = 15;
        this.g = (byte)0xE0;
        this.i = 0;
        this.j = 1;
        this.k = 0;
        this.m = 0;
        this.n = new byte[6];
        this.o = new ArrayList();
        this.a = v;
        this.f = b;
        this.g = b1;
    }

    public final hmnk a() {
        hmnk hmnk0 = new hmnk(this.a, this.f, this.g);
        if(this.h() != null && this.h().length > 0) {
            hmnk0.c = (byte[])this.h().clone();
        }
        byte[] arr_b = this.d;
        if(arr_b != null && arr_b.length > 0) {
            hmnk0.d = (byte[])arr_b.clone();
        }
        List list0 = this.o;
        if(list0.contains("keySettingsThree")) {
            hmnk0.c(this.i);
        }
        if(list0.contains("aksVersion")) {
            hmnk0.b(this.k);
        }
        if(list0.contains("rollKey")) {
            hmnk0.f(this.j);
        }
        if(list0.contains("smConfig")) {
            hmnk0.g(this.l);
        }
        if(list0.contains("pdCap1.2")) {
            hmnk0.d(this.m);
        }
        if(list0.contains("pdCap2")) {
            hmnk0.e(this.n);
        }
        hmnk0.h = 0;
        hmnk0.b = this.b;
        LinkedList linkedList0 = new LinkedList();
        for(Object object0: this.e) {
            linkedList0.add(((hmoe)object0).a());
        }
        hmnk0.e = linkedList0;
        return hmnk0;
    }

    public final void b(byte b) {
        this.k = b;
        this.o.add("aksVersion");
    }

    public final void c(byte b) {
        this.i = b;
        this.o.add("keySettingsThree");
    }

    public final void d(byte b) {
        this.m = b;
        this.o.add("pdCap1.2");
    }

    public final void e(byte[] arr_b) {
        this.n = arr_b;
        this.o.add("pdCap2");
    }

    public final void f(byte b) {
        this.j = b;
        this.o.add("rollKey");
    }

    public final void g(byte[] arr_b) {
        this.l = arr_b;
        this.o.add("smConfig");
    }

    public final byte[] h() {
        return this.c == null ? null : ((byte[])this.c.clone());
    }
}

