import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public final class egvg implements lqj {
    public final egvi a;
    public final TextView b;
    public final RecyclerView c;
    public final egwf d;
    public final egvh e;
    public final View f;

    public egvg(egvi egvi0, TextView textView0, RecyclerView recyclerView0, egwf egwf0, egvh egvh0, View view0) {
        this.a = egvi0;
        this.b = textView0;
        this.c = recyclerView0;
        this.d = egwf0;
        this.e = egvh0;
        this.f = view0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        String s;
        int v = ((egvl)object0).b;
        int v1 = 0;
        int v2 = 3;
        TextView textView0 = this.b;
        textView0.setVisibility((v == 3 ? 0 : 8));
        egvi egvi0 = this.a;
        if(v == 3) {
            s = "Something went wrong";
        }
        else {
            v2 = v;
            s = null;
        }
        textView0.setText(s);
        this.c.setVisibility((v2 == 4 ? 0 : 8));
        egvm egvm0 = egvi0.b;
        int v3 = ((egvl)object0).a.size();
        ((TextView)this.d.a).setText(egvm0.b.getQuantityString(0x7F13004D, v3, new Object[]{v3}));  // plurals:people_contacts_sync_sim_contact_count_description
        this.e.a = ((egvl)object0).a;
        this.e.q();
        if(egvi0.b.e != 1 || v2 != 4) {
            v1 = 8;
        }
        this.f.setVisibility(v1);
    }
}

