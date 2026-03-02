import j..util.Objects;
import java.util.Map;

final class akvc implements Runnable {
    final int a;
    final akzu b;
    final akvd c;

    public akvc(akvd akvd0, int v, akzu akzu0) {
        this.a = v;
        this.b = akzu0;
        Objects.requireNonNull(akvd0);
        this.c = akvd0;
        super();
    }

    @Override
    public final void run() {
        int v = this.a;
        if(v == 2) {
            akvf akvf0 = this.c.a;
            Map map0 = akvf0.h;
            String s = this.b.c();
            alit alit0 = (alit)map0.get(s);
            if(alit0 != null) {
                akvf0.l.X(alit0);
            }
            map0.remove(s);
            return;
        }
        switch(v) {
            case 0: {
                this.c.a(this.b);
                return;
            }
            case 3: {
                akzu akzu0 = this.b;
                akvd akvd0 = this.c;
                akvf akvf1 = akvd0.a;
                String s1 = akzu0.c();
                String s2 = akzu0.c();
                if(!akvf1.g.containsKey(s2)) {
                    akvd0.a(akzu0);
                    return;
                }
                akvf1.i.add(s1);
                akvf1.e.remove(akzu0);
                akvf1.e();
            }
        }
    }
}

