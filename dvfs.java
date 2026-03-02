import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.pay.Animation;
import com.google.android.gms.pay.TransitCard;
import com.google.android.gms.pay.TransitCardDialog;

public final class dvfs {
    public final tyb a;
    private final Context b;
    private final dmqh c;

    public dvfs(Context context0, tyb tyb0) {
        this.b = context0;
        this.a = tyb0;
        this.c = new dmqh();
    }

    public final PendingIntent a(Intent intent0, int v) {
        jwd jwd0 = new jwd(this.b);
        if(intent0 == null) {
            dmqm dmqm0 = new dmqm();
            dmqm0.h(19);
            dmqm0.i(true);
            Intent intent1 = dmqm0.c();
            intent1.setFlags(0x10008000);
            jwd0.c(intent1);
        }
        else {
            jwd0.c(intent0);
        }
        if(bbqa.d()) {
            PendingIntent pendingIntent0 = jwd0.a(v, 0x4000000);
            gftb.check(pendingIntent0);
            return pendingIntent0;
        }
        PendingIntent pendingIntent1 = jwd0.a(v, 0x2000000);
        gftb.check(pendingIntent1);
        return pendingIntent1;
    }

    public final Intent b(guqe guqe0) {
        int v = guqe0.c;
        int v1 = 2;
        if(v != 0) {
            switch(v) {
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
        }
        if(v1 != 4) {
            return dvfs.c(guqe0.b);
        }
        this.c.b(guqe0.b);
        return this.c.a();
    }

    public static Intent c(String s) {
        return new Intent("android.intent.action.VIEW").setData(Uri.parse(s));
    }

    public final Bitmap d(txx txx0) {
        float f = this.b.getResources().getDisplayMetrics().density;
        return (Bitmap)txx0.b(new uoy().B(((int)(101.0f * f)), ((int)(f * 64.0f)))).l().get();
    }

    public final Bitmap e(String s) {
        return this.d(this.a.b().h(s));
    }

    public final void f(dlke dlke0, guqk guqk0) {
        int v1;
        gunu gunu0 = guqk0.c == null ? gunu.a : guqk0.c;
        TransitCard transitCard0 = dlke0.a;
        transitCard0.e = dspl.d((gunu0.c == null ? gunw.a : gunu0.c));
        transitCard0.f = dspl.d((gunu0.d == null ? gunw.a : gunu0.d));
        String s = guqk0.b;
        if(!gfta.c(s)) {
            transitCard0.d = (Bitmap)this.a.b().h(s).l().get();
        }
        if(!(guqk0.d == null ? guql.a : guqk0.d).c.isEmpty()) {
            guql guql0 = guqk0.d == null ? guql.a : guqk0.d;
            gunu gunu1 = guql0.b == null ? gunu.a : guql0.b;
            TransitCardDialog transitCardDialog0 = new TransitCardDialog();
            transitCardDialog0.a = dspl.d((gunu1.c == null ? gunw.a : gunu1.c));
            transitCardDialog0.b = dspl.d((gunu1.d == null ? gunw.a : gunu1.d));
            transitCardDialog0.c = guql0.c;
            String s1 = guql0.g;
            if(!gfta.c(s1)) {
                transitCardDialog0.g = (Bitmap)this.a.b().h(s1).l().get();
            }
            ggdy ggdy0 = new ggdy();
            for(Object object0: guql0.h) {
                String s2 = (String)object0;
                if(!gfta.c(s2)) {
                    ggdy0.i(((Bitmap)this.a.b().h(s2).l().get()));
                }
            }
            int v = 0;
            transitCardDialog0.h = (Bitmap[])ggdy0.h().toArray(new Bitmap[0]);
            String s3 = (guql0.d == null ? guqe.a : guql0.d).b;
            transitCardDialog0.d = gfta.c(s3) ? this.a(null, 0) : this.a(dvfs.c(s3), s3.hashCode());
            String s4 = guql0.e;
            String s5 = (guql0.f == null ? guqe.a : guql0.f).b;
            if(!gfta.c(s4) && !gfta.c(s5)) {
                Intent intent0 = dvfs.c(s5);
                transitCardDialog0.e = s4;
                transitCardDialog0.f = this.a(intent0, s5.hashCode());
            }
            guqd guqd0 = guql0.i == null ? guqd.a : guql0.i;
            String s6 = guqd0.c;
            if(!gfta.c(s6)) {
                Animation animation0 = new Animation();
                animation0.b = s6;
                switch(guqd0.b) {
                    case 0: {
                        v1 = 2;
                        break;
                    }
                    case 1: {
                        v1 = 3;
                        break;
                    }
                    default: {
                        v1 = 0;
                    }
                }
                if(v1 == 3) {
                    v = 1;
                }
                animation0.a = v;
                animation0.c = guqd0.d;
                animation0.d = guqd0.e;
                transitCardDialog0.i = animation0;
            }
            transitCard0.h = transitCardDialog0;
        }
    }
}

