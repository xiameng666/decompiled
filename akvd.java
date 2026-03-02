import j..util.Objects;
import java.util.List;
import java.util.concurrent.Executor;

final class akvd extends akzt {
    final akvf a;

    public akvd(akvf akvf0, Executor executor0) {
        Objects.requireNonNull(akvf0);
        this.a = akvf0;
        super(executor0);
    }

    public final void a(akzu akzu0) {
        akvf akvf0 = this.a;
        List list0 = akvf0.i;
        if(list0.contains(akzu0.c())) {
            String s = akzu0.c();
            akvf0.d.add(s);
        }
        akvf0.c(akzu0.c());
        list0.remove(akzu0.c());
        akvf0.e.remove(akzu0);
        akvf0.e();
    }

    @Override  // akzt
    public final void b(akzu akzu0, int v, int v1) {
        akvc akvc0 = new akvc(this, v1, akzu0);
        this.a.j.post(akvc0);
    }

    @Override  // akzt
    public final void c(akzu akzu0, String s, byte[] arr_b) {
    }
}

