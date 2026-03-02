import android.location.Location;
import j..util.Collection.-EL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.function.Supplier;

public final class bgrd implements bgrl {
    private final Supplier a;

    public bgrd(Supplier supplier0) {
        this.a = supplier0;
    }

    @Override  // bgrl
    public final void a(hguc hguc0, ProtoLiteBuilder hftp0) {
        int v;
        baqc.b(this.a);
        Location location0 = (Location)this.a.get();
        if(location0 == null) {
            throw new bgrk(10);
        }
        if((hguc0.b & 4) == 0) {
            throw new bgrk(13);
        }
        if(!hsbn.a.e().s()) {
            if((hguc0.g == null ? hgtx.a : hguc0.g).e.size() == 0) {
                hgtx hgtx0 = hguc0.g;
                if(((hgtx0 == null ? hgtx.a : hgtx0).b & 1) == 0) {
                    throw new bgrk(14);
                }
                if(hgtx0 == null) {
                    hgtx0 = hgtx.a;
                }
                hguh hguh0 = hgtx0.c == null ? hguh.a : hgtx0.c;
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: hguh0.b) {
                    arrayList0.add(Long.valueOf(ggym.ab(((String)object0)).c));
                }
                ggyq ggyq0 = new ggyq();
                ggyq0.l(arrayList0);
                ghae ghae1 = ggzv.i(location0.getLatitude(), location0.getLongitude()).k();
                if(!ggyq0.g(ghae1)) {
                    throw bgrd.b(ggyq0, ghae1);
                }
            }
            else {
                try {
                    ghas ghas0 = ghas.d((hguc0.g == null ? hgtx.a : hguc0.g).e.newInput());
                    ghae ghae0 = ggzv.i(location0.getLatitude(), location0.getLongitude()).k();
                    if(!ghas0.e(ghae0)) {
                        throw bgrd.b(ghas0, ghae0);
                    }
                }
                catch(IOException unused_ex) {
                    throw new bgrk(14);
                }
            }
        }
        if(((hguc0.g == null ? hgtx.a : hguc0.g).b & 2) == 0) {
            v = 3;
        }
        else {
            hgtx hgtx1 = hguc0.g == null ? hgtx.a : hguc0.g;
            hgty hgty0 = hgtx1.d == null ? hgty.a : hgtx1.d;
            if(hgty0.b.isEmpty()) {
                throw new bgrk(7);
            }
            for(Object object1: hgty0.b) {
                hgtz hgtz0 = (hgtz)object1;
                if(hgui.a(hgtz0.b) == 2) {
                    throw new bgrk(7);
                }
                if(!Collection.-EL.stream(hgtz0.d).anyMatch(new bgrb(location0)) && !Collection.-EL.stream(hgtz0.c).anyMatch(new bgrc(location0))) {
                    continue;
                }
                v = hgui.a(hgtz0.b);
                if(v == 0) {
                    v = 1;
                }
                goto label_46;
            }
            throw new bgrk(8);
        }
    label_46:
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgug hgug0 = (hgug)hftp0.b_message;
        if(v == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        hgug0.f = v - 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjij.a).v_newBuilder();
        double f = location0.getLatitude();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hjij)hftp1.b_message).b = f;
        double f1 = location0.getLongitude();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hjij)hftp1.b_message).c = f1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgug hgug1 = (hgug)hftp0.b_message;
        hjij hjij0 = (hjij)hftp1.N_build();
        hjij0.getClass();
        hgug1.e = hjij0;
        hgug1.b |= 2;
    }

    private static final bgrk b(ghbk ghbk0, ghae ghae0) {
        int v4;
        ghbm ghbm0 = new ghbm();
        int v = 8;
        ghbm0.b = Math.max(0, Math.min(30, 8));
        ghbm0.a = Math.max(0, Math.min(30, 8));
        ghbm0.c = 0x7FFFFFFF;
        ghbq ghbq0 = new ghbq(ghbm0);
        ggyq ggyq0 = new ggyq();
        ghbl ghbl0 = new ghbl(ghbq0, ghbk0);
        PriorityQueue priorityQueue0 = ghbl0.d;
        gftb.q(priorityQueue0.isEmpty() && ghbl0.c.isEmpty());
        ghbq ghbq1 = ghbl0.e;
        int v1 = ghbq1.e;
        if(v1 >= 4) {
            ggyh ggyh0 = ghbl0.a.f();
            double f = ggyh0.b().c;
            int v2 = glwy.g(new int[]{ghbj.b.a(f + f), ghbq1.c, 29});
            if(v2 > 0) {
                ArrayList arrayList0 = new ArrayList(4);
                ggym.B(ggyh0.a).M(v2, arrayList0);
                for(int v3 = 0; v3 < arrayList0.size(); ++v3) {
                    ghbl0.b(ghbl0.a(new ggyi(((ggym)arrayList0.get(v3)))));
                }
            }
            else {
                v4 = 0;
                goto label_28;
            }
        }
        else {
            v4 = 0;
        label_28:
            while(v4 < 6) {
                ghbl0.b(ghbl0.a(((ggyi)ghbq.a.get(v4))));
                ++v4;
            }
        }
        while(!priorityQueue0.isEmpty()) {
            ghbn ghbn0 = ((ghbp)priorityQueue0.poll()).b;
            if(ghbn0.a.b >= ghbq1.b && ghbn0.c != 1 && ghbl0.c.size() + priorityQueue0.size() + ghbn0.c > v1) {
                ghbn0.b = true;
                ghbl0.b(ghbn0);
            }
            else {
                for(int v5 = 0; v5 < ghbn0.c; ++v5) {
                    ghbl0.b(ghbn0.d[v5]);
                }
            }
        }
        ggyq0.d(ghbl0.c);
        ggyq0.n();
        if(!ggyq0.g(ghae0)) {
            v = 9;
        }
        return new bgrk(v);
    }
}

