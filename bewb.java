import android.net.Uri;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class bewb extends ibsl implements ibtw {
    final bewc a;
    final Uri b;

    public bewb(bewc bewc0, Uri uri0, ibrl ibrl0) {
        this.a = bewc0;
        this.b = uri0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bewb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bewb(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ibuq.f(this.b, "fileUri");
        InputStreamReader inputStreamReader0 = new InputStreamReader(new FileInputStream(fqbf.b(((bfbb)this.a.b).b, this.b, "r").getFileDescriptor()));
        try {
            Character character0 = Character.valueOf('\"');
            ghjw ghjw0 = new ghjw(inputStreamReader0);
            character0.getClass();
            gfrn gfrn0 = new gfrn('\"');
            String s = glxq.a(ghjw0, gfrn0);
            if(s != null) {
                List list0 = glxp.a(s, character0, 0);
                int v = list0.size();
                int v1 = bewa.a(list0) + 1;
                int v2 = list0.size();
                int v3 = 0;
                Integer integer0 = null;
                Integer integer1 = null;
                Integer integer2 = null;
                Integer integer3 = null;
                while(v3 < v2) {
                    String s1 = ((String)list0.get(v3)).toLowerCase(Locale.ROOT);
                    ibuq.e(s1, "toLowerCase(...)");
                    if(bewd.a.contains(s1)) {
                        integer1 = v3;
                    }
                    else if(bewd.b.contains(s1)) {
                        integer3 = v3;
                    }
                    else if(bewd.c.contains(s1)) {
                        integer2 = v3;
                    }
                    else if(bewd.d.contains(s1)) {
                        integer0 = v3;
                    }
                    ++v3;
                    list0 = list0;
                }
                if(integer1 == null || integer2 == null) {
                    throw new bfal();
                }
                bevz bevz0 = new bevz(((int)integer1), integer3, ((int)integer2), integer0);
                int v4 = list0.size();
                int v5 = 0;
                String s2;
                while((s2 = glxq.a(ghjw0, gfrn0)) != null) {
                    List list1 = glxp.a(s2, character0, v4);
                    ++v5;
                    int v6 = v1 + 1;
                    v1 += bewa.a(list1) + 1;
                    if(v5 > 3000) {
                        throw new bfba();
                    }
                    if(list1.size() < v) {
                        arrayList1.add(new bewi(ibpo.aK(list1, null, null, null, null, 0x3F), v6));
                    }
                    else {
                        arrayList0.add(new bewk(((String)list1.get(bevz0.a)), (bevz0.b == null ? null : ((String)list1.get(bevz0.b.intValue()))), ((String)list1.get(bevz0.c)), (bevz0.d == null ? null : ((String)list1.get(bevz0.d.intValue())))));
                    }
                    v4 = list1.size();
                }
            }
        }
        catch(Throwable throwable0) {
            ibsx.a(inputStreamReader0, throwable0);
            throw throwable0;
        }
        ibsx.a(inputStreamReader0, null);
        return new bewl(ibpo.ar(arrayList0), ibpo.ar(arrayList1));
    }
}

