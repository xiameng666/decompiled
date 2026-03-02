import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class epji extends tk {
    public final lf a;
    public final epia e;
    private final boolean f;
    private final epko g;
    private final float h;

    public epji(Context context0, boolean z) {
        this.f = z;
        this.a = new lf(this, new epjf());
        this.e = new epia();
        this.g = (epko)new lso(((xob)context0)).b(new ibuk(epko.class));
        this.h = Resources.getSystem().getDisplayMetrics().density;
    }

    @Override  // tk
    public final int b() {
        return this.a.e.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E09BD, viewGroup0, false);  // layout:significant_places_autocomplete_item
        if(this.f) {
            LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B0C23);  // id:autocomplete_item
            int v1 = (int)(8.0f * this.h + 0.5f);
            int v2 = (int)(this.h * 12.0f + 0.5f);
            linearLayout0.setPadding(v2, v1, v2, v1);
        }
        ibuq.c(view0);
        return new epje(this, view0);
    }

    public final Object f(String s, ibrl ibrl0) {
        Object object2;
        epjg epjg0;
        if((ibrl0 instanceof epjg)) {
            epjg0 = (epjg)ibrl0;
            int v = epjg0.c;
            if((v & 0x80000000) == 0) {
                epjg0 = new epjg(this, ibrl0);
            }
            else {
                epjg0.c = v - 0x80000000;
            }
        }
        else {
            epjg0 = new epjg(this, ibrl0);
        }
        Object object0 = epjg0.a;
        Object object1 = ibrx.a;
        switch(epjg0.c) {
            case 0: {
                ibnx.b(object0);
                epjg0.c = 1;
                object2 = this.e.a(s, epjg0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(epit.a.j(), "Failed to fetch place using place id", throwable0);
            object2 = null;
        }
        if(((hatr)object2) == null) {
            return ibom.a;
        }
        epko epko0 = this.g;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)epng.a).v_newBuilder();
        String s1 = ((hatr)object2).c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng0 = (epng)hftp0.b_message;
        s1.getClass();
        epng0.b |= 1;
        epng0.c = s1;
        String s2 = ((hatr)object2).e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng1 = (epng)hftp0.b_message;
        s2.getClass();
        epng1.b |= 16;
        epng1.g = s2;
        hjim hjim0 = ((hatr)object2).d;
        if(hjim0 == null) {
            hjim0 = hjim.a;
        }
        String s3 = hjim0.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng2 = (epng)hftp0.b_message;
        s3.getClass();
        epng2.b |= 8;
        epng2.f = s3;
        hjij hjij0 = ((hatr)object2).f;
        if(hjij0 == null) {
            hjij0 = hjij.a;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng3 = (epng)hftp0.b_message;
        hjij0.getClass();
        epng3.d = hjij0;
        epng3.b |= 2;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((epng)hftv0), "item");
        epko0.a.ii(((epng)hftv0));
        return ibom.a;
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        epje epje0 = (epje)uq0;
        ibuq.f(epje0, "viewHolder");
        Object object0 = this.a.e.get(v);
        ibuq.e(object0, "get(...)");
        epng epng0 = (epng)object0;
        ibuq.f(epng0, "autocompleteResult");
        View view0 = epje0.a;
        ((TextView)view0.findViewById(0x7F0B22B8)).setText(epng0.f);  // id:title
        ((TextView)view0.findViewById(0x7F0B0B36)).setText(epng0.g);  // id:address
        view0.setOnClickListener(new epjc(epje0, epje0.t, epng0));
    }
}

