import com.google.android.gms.romanesco.protomodel.SourceStats;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class ejyx {
    public final String a;
    public Long b;
    public final String c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Map i;
    public final ArrayList j;
    public final ArrayList k;
    public aqfl l;
    private final Map m;
    private final Map n;

    public ejyx(String s, String s1) {
        this.a = s;
        this.c = s1;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.i = new HashMap();
        this.m = new HashMap();
        this.n = new HashMap();
    }

    public final void a(SourceStats sourceStats0) {
        if(!this.i.isEmpty()) {
            String s = sourceStats0.c();
            efoy efoy0 = (efoy)this.i.get(s);
            if(efoy.c.equals(efoy0)) {
                this.e += (int)sourceStats0.a();
            }
            else if(efoy.e.equals(efoy0)) {
                String s1 = sourceStats0.c();
                this.k.add(s1);
                this.g += (int)sourceStats0.a();
            }
            else {
                String s2 = sourceStats0.c();
                this.j.add(s2);
                this.f += (int)sourceStats0.a();
            }
            Map map0 = this.m;
            if(map0.containsKey(efoy0)) {
                map0.put(efoy0, Integer.valueOf(((int)(((Integer)map0.get(efoy0)))) + ((int)sourceStats0.a())));
                Integer integer0 = (int)(((int)(((Integer)this.n.get(efoy0)))) + ((int)sourceStats0.b()));
                this.n.put(efoy0, integer0);
            }
            else {
                map0.put(efoy0, sourceStats0.a());
                Integer integer1 = sourceStats0.b();
                this.n.put(efoy0, integer1);
            }
        }
        else if("com.google".equals(sourceStats0.c())) {
            this.e += (int)sourceStats0.a();
        }
        else {
            String s3 = sourceStats0.c();
            if(s3 != null && s3.matches(".*sim.*|.*SIM.*")) {
                String s4 = sourceStats0.c();
                this.k.add(s4);
                this.g += (int)sourceStats0.a();
            }
            else {
                String s5 = sourceStats0.c();
                this.j.add(s5);
                this.f += (int)sourceStats0.a();
            }
        }
        this.h += (int)sourceStats0.b();
    }
}

