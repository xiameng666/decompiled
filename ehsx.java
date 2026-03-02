import j..util.Optional;
import java.util.ArrayDeque;
import java.util.List;

public final class ehsx {
    public final Optional a;
    public final Optional b;
    public final boolean c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public final ArrayDeque g;
    public ehsw h;

    public ehsx(Optional optional0, Optional optional1, boolean z) {
        this.d = 0x7FFFFFFFFFFFFFFFL;
        this.e = 0x7FFFFFFFFFFFFFFFL;
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
        this.h = ehsw.a().a();
        this.a = optional0;
        this.b = optional1;
        this.c = z;
    }

    public static float a(List list0) {
        float f = ehsx.b(list0);
        float f1 = 0.0f;
        for(Object object0: list0) {
            f1 = (float)(((double)f1) + Math.pow(((float)(((Float)object0))) - f, 2.0));
        }
        return ((float)Math.sqrt(f1 / ((float)(list0.size() - 1)))) / f;
    }

    public static float b(List list0) {
        int v = list0.size();
        float f = 0.0f;
        for(Object object0: list0) {
            f += (float)(((Float)object0));
        }
        return f / ((float)v);
    }
}

