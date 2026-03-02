import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.common.Feature;
import java.util.Arrays;

public final class bdah implements DialogInterface.OnClickListener {
    public final bdak a;
    public final gqmd b;

    public bdah(bdak bdak0, gqmd gqmd0) {
        this.a = bdak0;
        this.b = gqmd0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        lqd lqd0;
        gqmd gqmd0 = this.b;
        bedg bedg0 = (bedg)gqmd0.j();
        bdak bdak0 = this.a;
        beln beln0 = bdak0.c;
        if(gqmq.a(bedg0)) {
            begp begp0 = beln0.b;
            hery hery0 = bedg0.f;
            ibuq.f(hery0, "credentials");
            if(begp0.c) {
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("no account configured");
                lqd0 = new lqi(new bedv(bedu.c, null, illegalArgumentException0));
            }
            else {
                String s = hery0.g;
                byte[] arr_b = hery0.f.toByteArray();
                batl.r(s, "rpId cannot be empty");
                batl.t(arr_b, "credentialId cannot be null");
                batl.c(arr_b.length > 0, "credentialId cannot be empty");
                String s1 = Arrays.toString(arr_b);
                blpe.a.d("deleteCredential with rpId " + s + " and ID " + s1, new Object[0]);
                azzc azzc0 = new azzc();
                azzc0.a = new bmdr(((bmdz)begp0.b.c), begp0.d, s, arr_b);
                azzc0.c = new Feature[]{blfo.b};
                azzc0.d = 5434;
                azzd azzd0 = azzc0.a();
                lqd0 = begp0.a("delete", ((azts)begp0.b.c).iG(azzd0));
            }
        }
        else {
            lqd0 = beln0.a.b(gqmd0);
        }
        bdag bdag0 = new bdag(bdak0);
        lqd0.g(bdak0.d, bdag0);
    }
}

