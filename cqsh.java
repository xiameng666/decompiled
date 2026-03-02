import com.google.android.gms.mdns.MdnsSearchOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public final class cqsh {
    public boolean a;
    public boolean b;
    public int c;
    public String d;
    public long e;
    private final Set f;
    private boolean g;
    private int h;
    private boolean i;

    public cqsh() {
        this.a = true;
        this.b = false;
        this.g = false;
        this.h = 0;
        this.c = 0;
        this.i = false;
        this.e = 0L;
        this.f = new bxf();
    }

    public cqsh(MdnsSearchOptions mdnsSearchOptions0) {
        this.a = true;
        this.b = false;
        this.g = false;
        this.h = 0;
        this.c = 0;
        this.i = false;
        this.e = 0L;
        this.f = new bxf(mdnsSearchOptions0.a);
        this.a = mdnsSearchOptions0.b;
        this.b = mdnsSearchOptions0.c;
        this.g = mdnsSearchOptions0.d;
        this.h = mdnsSearchOptions0.e;
        this.c = mdnsSearchOptions0.f;
        this.d = mdnsSearchOptions0.g;
        this.i = mdnsSearchOptions0.h;
        this.e = mdnsSearchOptions0.i;
    }

    public final MdnsSearchOptions a() {
        return new MdnsSearchOptions(new ArrayList(this.f), this.a, this.b, this.g, this.h, this.c, this.d, this.i, this.e);
    }

    public final void b(Collection collection0) {
        batl.s(collection0);
        this.f.addAll(collection0);
    }

    public final void c() {
        this.h = 3;
    }

    @Deprecated
    public final void d() {
        this.c = 3;
        this.i = true;
    }
}

