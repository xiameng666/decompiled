import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public final class ifpp implements Serializable {
    public int a;
    public transient int b;
    private transient ifqc c;
    private final int d;
    private final List e;
    private int f;
    private ifqp g;
    private List h;
    private Map i;
    private Stack j;
    private Map k;
    private boolean l;
    private static final long serialVersionUID = 1L;

    public ifpp(ifpp ifpp0) {
        this.c = new ifqc(ifpp0.c.a);
        this.d = ifpp0.d;
        this.f = ifpp0.f;
        this.g = ifpp0.g;
        ArrayList arrayList0 = new ArrayList();
        this.h = arrayList0;
        arrayList0.addAll(ifpp0.h);
        this.i = new TreeMap();
        for(Object object0: ifpp0.i.keySet()) {
            this.i.put(((Integer)object0), ((LinkedList)((LinkedList)ifpp0.i.get(((Integer)object0))).clone()));
        }
        Stack stack0 = new Stack();
        this.j = stack0;
        stack0.addAll(ifpp0.j);
        this.e = new ArrayList();
        for(Object object1: ifpp0.e) {
            ifpr ifpr0 = ((ifpr)object1).b();
            this.e.add(ifpr0);
        }
        this.k = new TreeMap(ifpp0.k);
        this.a = ifpp0.a;
        this.b = ifpp0.b;
        this.l = ifpp0.l;
    }

    public ifpp(ifpp ifpp0, idqg idqg0) {
        this.c = new ifqc(new ifqe(idqg0));
        this.d = ifpp0.d;
        this.f = ifpp0.f;
        this.g = ifpp0.g;
        ArrayList arrayList0 = new ArrayList();
        this.h = arrayList0;
        arrayList0.addAll(ifpp0.h);
        this.i = new TreeMap();
        for(Object object0: ifpp0.i.keySet()) {
            this.i.put(((Integer)object0), ((LinkedList)((LinkedList)ifpp0.i.get(((Integer)object0))).clone()));
        }
        Stack stack0 = new Stack();
        this.j = stack0;
        stack0.addAll(ifpp0.j);
        this.e = new ArrayList();
        for(Object object1: ifpp0.e) {
            ifpr ifpr0 = ((ifpr)object1).b();
            this.e.add(ifpr0);
        }
        this.k = new TreeMap(ifpp0.k);
        int v = ifpp0.a;
        this.a = v;
        this.b = ifpp0.b;
        this.l = ifpp0.l;
        if(this.h == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if(this.i == null) {
            throw new IllegalStateException("retain == null");
        }
        if(this.j == null) {
            throw new IllegalStateException("stack == null");
        }
        if(ifqy.f(this.d, ((long)v))) {
            return;
        }
        throw new IllegalStateException("index in BDS state out of bounds");
    }

    public ifpp(ifpp ifpp0, byte[] arr_b, byte[] arr_b1, ifqb ifqb0) {
        this.c = new ifqc(ifpp0.c.a);
        this.d = ifpp0.d;
        this.f = ifpp0.f;
        this.g = ifpp0.g;
        ArrayList arrayList0 = new ArrayList();
        this.h = arrayList0;
        arrayList0.addAll(ifpp0.h);
        this.i = new TreeMap();
        for(Object object0: ifpp0.i.keySet()) {
            this.i.put(((Integer)object0), ((LinkedList)((LinkedList)ifpp0.i.get(((Integer)object0))).clone()));
        }
        Stack stack0 = new Stack();
        this.j = stack0;
        stack0.addAll(ifpp0.j);
        this.e = new ArrayList();
        for(Object object1: ifpp0.e) {
            ifpr ifpr0 = ((ifpr)object1).b();
            this.e.add(ifpr0);
        }
        this.k = new TreeMap(ifpp0.k);
        this.a = ifpp0.a;
        this.b = ifpp0.b;
        this.l = false;
        this.b(arr_b, arr_b1, ifqb0);
    }

    private ifpp(ifqc ifqc0, int v, int v1, int v2) {
        this.c = ifqc0;
        this.d = v;
        this.b = v2;
        this.f = v1;
        if(v1 <= v && v1 >= 2) {
            int v3 = v - v1;
            if(v3 % 2 == 0) {
                this.h = new ArrayList();
                this.i = new TreeMap();
                this.j = new Stack();
                this.e = new ArrayList();
                for(int v4 = 0; v4 < v3; ++v4) {
                    ifpr ifpr0 = new ifpr(v4);
                    this.e.add(ifpr0);
                }
                this.k = new TreeMap();
                this.a = 0;
                this.l = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public ifpp(ifqs ifqs0, int v, int v1) {
        this(ifqs0.a(), ifqs0.c, ifqs0.d, v1);
        this.b = v;
        this.a = v1;
        this.l = true;
    }

    public ifpp(ifqs ifqs0, byte[] arr_b, byte[] arr_b1, ifqb ifqb0) {
        this(ifqs0.a(), ifqs0.c, ifqs0.d, (1 << ifqs0.c) - 1);
        this.a(arr_b, arr_b1, ifqb0);
    }

    public ifpp(ifqs ifqs0, byte[] arr_b, byte[] arr_b1, ifqb ifqb0, int v) {
        this(ifqs0.a(), ifqs0.c, ifqs0.d, (1 << ifqs0.c) - 1);
        this.a(arr_b, arr_b1, ifqb0);
        while(this.a < v) {
            this.b(arr_b, arr_b1, ifqb0);
            this.l = false;
        }
    }

    private final void a(byte[] arr_b, byte[] arr_b1, ifqb ifqb0) {
        ifpy ifpy0 = new ifpy();
        ifpy0.e = ifqb0.d;
        ifpy0.f = ifqb0.e;
        ifpz ifpz0 = new ifpz(ifpy0);
        ifpv ifpv0 = new ifpv();
        ifpv0.e = ifqb0.d;
        ifpv0.f = ifqb0.e;
        ifpw ifpw0 = new ifpw(ifpv0);
        for(int v = 0; true; ++v) {
            int v1 = this.d;
            if(v >= 1 << v1) {
                break;
            }
            ifqa ifqa0 = new ifqa();
            ifqa0.e = ifqb0.d;
            ifqa0.f = ifqb0.e;
            ifqa0.a = v;
            ifqa0.b = ifqb0.b;
            ifqa0.c = ifqb0.c;
            ifqa0.g = ifqb0.f;
            ifqb0 = new ifqb(ifqa0);
            this.c.b(this.c.c(arr_b1, ifqb0), arr_b);
            ifqf ifqf0 = this.c.a(ifqb0);
            ifpy ifpy1 = new ifpy();
            ifpy1.e = ifpz0.d;
            ifpy1.f = ifpz0.e;
            ifpy1.a = v;
            ifpy1.b = ifpz0.b;
            ifpy1.c = ifpz0.c;
            ifpy1.g = ifpz0.f;
            ifpz0 = new ifpz(ifpy1);
            ifqp ifqp0 = ifqq.a(this.c, ifqf0, ifpz0);
            ifpv ifpv1 = new ifpv();
            ifpv1.e = ifpw0.d;
            ifpv1.f = ifpw0.e;
            ifpv1.b = v;
            ifpv1.g = ifpw0.f;
            ifpw0 = new ifpw(ifpv1);
            while(!this.j.isEmpty()) {
                int v2 = ((ifqp)this.j.peek()).a;
                int v3 = ifqp0.a;
                if(v2 != v3) {
                    break;
                }
                int v4 = v / (1 << v3);
                if(v4 == 1) {
                    this.h.add(ifqp0);
                    v4 = 1;
                }
                if(v4 == 3) {
                    if(v3 < v1 - this.f) {
                        ifpr ifpr0 = (ifpr)this.e.get(v3);
                        ifpr0.a = ifqp0;
                        ifpr0.c = v3;
                        if(v3 == ifpr0.b) {
                            ifpr0.f = true;
                        }
                    }
                    v4 = 3;
                }
                if(v4 >= 3 && (v4 & 1) == 1 && v3 >= v1 - this.f && v3 <= v1 - 2) {
                    Integer integer0 = v3;
                    if(this.i.get(integer0) == null) {
                        LinkedList linkedList0 = new LinkedList();
                        linkedList0.add(ifqp0);
                        this.i.put(integer0, linkedList0);
                    }
                    else {
                        ((LinkedList)this.i.get(integer0)).add(ifqp0);
                    }
                }
                ifpv ifpv2 = new ifpv();
                ifpv2.e = ifpw0.d;
                ifpv2.f = ifpw0.e;
                ifpv2.a = ifpw0.a;
                ifpv2.b = (ifpw0.b - 1) / 2;
                ifpv2.g = ifpw0.f;
                ifpw ifpw1 = new ifpw(ifpv2);
                ifqp ifqp1 = ifqq.b(this.c, ((ifqp)this.j.pop()), ifqp0, ifpw1);
                byte[] arr_b2 = ifqp1.a();
                ifqp ifqp2 = new ifqp(ifqp1.a + 1, arr_b2);
                ifpv ifpv3 = new ifpv();
                ifpv3.e = ifpw1.d;
                ifpv3.f = ifpw1.e;
                ifpv3.a = ifpw1.a + 1;
                ifpv3.b = ifpw1.b;
                ifpv3.g = ifpw1.f;
                ifpw0 = new ifpw(ifpv3);
                ifqp0 = ifqp2;
            }
            this.j.push(ifqp0);
        }
        this.g = (ifqp)this.j.pop();
    }

    private final void b(byte[] arr_b, byte[] arr_b1, ifqb ifqb0) {
        int v11;
        ifqb ifqb1 = ifqb0;
        if(this.l) {
            throw new IllegalStateException("index already used");
        }
        int v = this.a;
        if(v > this.b - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int v1 = this.d;
        int v2 = 0;
        int v3;
        for(v3 = 0; true; ++v3) {
            if(v3 >= v1) {
                v3 = 0;
                break;
            }
            if((v >> v3 & 1) == 0) {
                break;
            }
        }
        if((this.a >> v3 + 1 & 1) == 0 && v3 < v1 - 1) {
            this.k.put(Integer.valueOf(v3), ((ifqp)this.h.get(v3)));
        }
        ifpy ifpy0 = new ifpy();
        int v4 = ifqb1.d;
        ifpy0.e = v4;
        long v5 = ifqb1.e;
        ifpy0.f = v5;
        ifpz ifpz0 = new ifpz(ifpy0);
        ifpv ifpv0 = new ifpv();
        ifpv0.e = v4;
        ifpv0.f = v5;
        ifpw ifpw0 = new ifpw(ifpv0);
        if(v3 == 0) {
            ifqa ifqa0 = new ifqa();
            ifqa0.e = v4;
            ifqa0.f = v5;
            ifqa0.a = this.a;
            ifqa0.b = ifqb1.b;
            ifqa0.c = ifqb1.c;
            ifqa0.g = ifqb1.f;
            ifqb1 = new ifqb(ifqa0);
            this.c.b(this.c.c(arr_b1, ifqb1), arr_b);
            ifqf ifqf0 = this.c.a(ifqb1);
            ifpy ifpy1 = new ifpy();
            ifpy1.e = ifpz0.d;
            ifpy1.f = ifpz0.e;
            ifpy1.a = this.a;
            ifpy1.b = ifpz0.b;
            ifpy1.c = ifpz0.c;
            ifpy1.g = ifpz0.f;
            ifpz ifpz1 = new ifpz(ifpy1);
            ifqp ifqp0 = ifqq.a(this.c, ifqf0, ifpz1);
            this.h.set(0, ifqp0);
        }
        else {
            ifpv ifpv1 = new ifpv();
            ifpv1.e = ifpw0.d;
            ifpv1.f = ifpw0.e;
            ifpv1.a = v3 - 1;
            ifpv1.b = this.a >> v3;
            ifpv1.g = ifpw0.f;
            ifpw ifpw1 = new ifpw(ifpv1);
            this.c.b(this.c.c(arr_b1, ifqb1), arr_b);
            Integer integer0 = (int)(v3 - 1);
            ifqp ifqp1 = ifqq.b(this.c, ((ifqp)this.h.get(v3 - 1)), ((ifqp)this.k.get(integer0)), ifpw1);
            byte[] arr_b2 = ifqp1.a();
            ifqp ifqp2 = new ifqp(ifqp1.a + 1, arr_b2);
            this.h.set(v3, ifqp2);
            this.k.remove(integer0);
            for(int v6 = 0; v6 < v3; ++v6) {
                if(v6 < v1 - this.f) {
                    this.h.set(v6, ((ifpr)this.e.get(v6)).a);
                }
                else {
                    this.h.set(v6, ((ifqp)((LinkedList)this.i.get(Integer.valueOf(v6))).removeFirst()));
                }
            }
            int v7 = Math.min(v3, v1 - this.f);
            for(int v8 = 0; v8 < v7; ++v8) {
                int v9 = this.a + 1 + (1 << v8) * 3;
                if(v9 < 1 << v1) {
                    ifpr ifpr0 = (ifpr)this.e.get(v8);
                    ifpr0.a = null;
                    ifpr0.c = ifpr0.b;
                    ifpr0.d = v9;
                    ifpr0.e = true;
                    ifpr0.f = false;
                }
            }
        }
        while(v2 < v1 - this.f >> 1) {
            ifpr ifpr1 = null;
            for(Object object0: this.e) {
                ifpr ifpr2 = (ifpr)object0;
                if(!ifpr2.f && ifpr2.e && (ifpr1 == null || ifpr2.a() < ifpr1.a() || ifpr2.a() == ifpr1.a() && ifpr2.d < ifpr1.d)) {
                    ifpr1 = ifpr2;
                }
            }
            if(ifpr1 == null) {
                v11 = v1;
            }
            else {
                Stack stack0 = this.j;
                ifqc ifqc0 = this.c;
                if(ifpr1.f || !ifpr1.e) {
                    throw new IllegalStateException("finished or not initialized");
                }
                ifqa ifqa1 = new ifqa();
                ifqa1.e = ifqb1.d;
                ifqa1.f = ifqb1.e;
                int v10 = ifpr1.d;
                ifqa1.a = v10;
                ifqa1.b = ifqb1.b;
                ifqa1.c = ifqb1.c;
                ifqa1.g = ifqb1.f;
                ifqb ifqb2 = new ifqb(ifqa1);
                ifpy ifpy2 = new ifpy();
                ifpy2.e = ifqb2.d;
                v11 = v1;
                ifpy2.f = ifqb2.e;
                ifpy2.a = v10;
                ifpz ifpz2 = new ifpz(ifpy2);
                ifpv ifpv2 = new ifpv();
                ifpv2.e = ifqb2.d;
                ifpv2.f = ifqb2.e;
                ifpv2.b = v10;
                ifpw ifpw2 = new ifpw(ifpv2);
                ifqc0.b(ifqc0.c(arr_b1, ifqb2), arr_b);
                ifqp ifqp3;
                for(ifqp3 = ifqq.a(ifqc0, ifqc0.a(ifqb2), ifpz2); !stack0.isEmpty() && ((ifqp)stack0.peek()).a == ifqp3.a && ((ifqp)stack0.peek()).a != ifpr1.b; ifqp3 = ifqp5) {
                    ifpv ifpv3 = new ifpv();
                    ifpv3.e = ifpw2.d;
                    ifpv3.f = ifpw2.e;
                    ifpv3.a = ifpw2.a;
                    ifpv3.b = (ifpw2.b - 1) / 2;
                    ifpv3.g = ifpw2.f;
                    ifpw ifpw3 = new ifpw(ifpv3);
                    ifqp ifqp4 = ifqq.b(ifqc0, ((ifqp)stack0.pop()), ifqp3, ifpw3);
                    byte[] arr_b3 = ifqp4.a();
                    ifqp ifqp5 = new ifqp(ifqp4.a + 1, arr_b3);
                    ifpv ifpv4 = new ifpv();
                    ifpv4.e = ifpw3.d;
                    ifpv4.f = ifpw3.e;
                    ifpv4.a = ifpw3.a + 1;
                    ifpv4.b = ifpw3.b;
                    ifpv4.g = ifpw3.f;
                    ifpw2 = new ifpw(ifpv4);
                }
                ifqp ifqp6 = ifpr1.a;
                if(ifqp6 == null) {
                    ifpr1.a = ifqp3;
                }
                else if(ifqp6.a == ifqp3.a) {
                    ifpv ifpv5 = new ifpv();
                    ifpv5.e = ifpw2.d;
                    ifpv5.f = ifpw2.e;
                    ifpv5.a = ifpw2.a;
                    ifpv5.b = (ifpw2.b - 1) / 2;
                    ifpv5.g = ifpw2.f;
                    ifpw ifpw4 = new ifpw(ifpv5);
                    ifqp ifqp7 = ifqq.b(ifqc0, ifqp6, ifqp3, ifpw4);
                    ifqp ifqp8 = new ifqp(ifpr1.a.a + 1, ifqp7.a());
                    ifpr1.a = ifqp8;
                    ifpv ifpv6 = new ifpv();
                    ifpv6.e = ifpw4.d;
                    ifpv6.f = ifpw4.e;
                    ifpv6.a = ifpw4.a + 1;
                    ifpv6.b = ifpw4.b;
                    ifpv6.g = ifpw4.f;
                    ifqp3 = ifqp8;
                }
                else {
                    stack0.push(ifqp3);
                }
                if(ifpr1.a.a == ifpr1.b) {
                    ifpr1.f = true;
                }
                else {
                    ifpr1.c = ifqp3.a;
                    ++ifpr1.d;
                }
            }
            ++v2;
            v1 = v11;
        }
        ++this.a;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        int v = objectInputStream0.available() == 0 ? (1 << this.d) - 1 : objectInputStream0.readInt();
        this.b = v;
        if(v <= (1 << this.d) - 1 && this.a <= v + 1 && objectInputStream0.available() == 0) {
            return;
        }
        throw new IOException("inconsistent BDS data detected");
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeInt(this.b);
    }
}

