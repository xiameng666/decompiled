import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;

public final class dxtq extends ArrayAdapter {
    private final gged_interceptors a;
    private final LayoutInflater b;
    private final tyb c;
    private final HashSet d;
    private final String e;
    private int f;
    private final boolean g;
    private final boolean h;

    public dxtq(Context context0, gtuw gtuw0, tyb tyb0, String s, boolean z, boolean z1) {
        super(context0, 0);
        this.f = -1;
        this.c = tyb0;
        this.b = LayoutInflater.from(context0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: gtuw0.b) {
            txx txx0 = this.c.h(((gtur)object0).e);
            txx0.o();
            dxsz dxsz0 = dxta.a();
            dxsz0.a = gfsx.m(((gtur)object0));
            dxsz0.c = gfsx.m(txx0);
            arrayList0.add(dxsz0.a());
        }
        for(Object object1: gtuw0.c) {
            dxsz dxsz1 = dxta.a();
            dxsz1.b = gfsx.m(((gtux)object1));
            dxsz1.b(0x7F080AE5);  // drawable:quantum_gm_ic_add_vd_theme_24
            arrayList0.add(dxsz1.a());
        }
        gged_interceptors gged0 = gged_interceptors.i(arrayList0);
        this.a = gged0;
        this.d = new HashSet(gged0.size());
        this.e = s;
        this.g = z;
        this.h = z1;
    }

    public final int a(long v) {
        int v2 = -1;
        for(int v1 = 0; true; ++v1) {
            gged_interceptors gged0 = this.a;
            if(v1 >= gged0.size()) {
                break;
            }
            gfsx gfsx0 = ((dxta)gged0.get(v1)).a;
            if(gfsx0.i() && dxte.e(((gtur)gfsx0.d()))) {
                if(((gtur)gfsx0.d()).g == v) {
                    return v1;
                }
                if(v2 == -1) {
                    v2 = v1;
                    continue;
                }
            }
            if(((dxta)gged0.get(v1)).b.i() && v2 == -1) {
                v2 = v1;
            }
        }
        return v2 == -1 ? 0 : v2;
    }

    public final dxta b(int v) {
        return (dxta)this.a.get(v);
    }

    final dxta c() {
        return this.f >= 0 ? this.b(this.f) : null;
    }

    public final void d(long v) {
        this.d.add(Long.valueOf(v));
        this.notifyDataSetChanged();
    }

    final void e(int v) {
        this.f = v;
        this.notifyDataSetChanged();
    }

    private final View f(int v, View view0, ViewGroup viewGroup0, boolean z) {
        if(view0 == null) {
            view0 = this.b.inflate(0x7F0E04F8, viewGroup0, false);  // layout:instrument_option_item
        }
        if(!this.g) {
            Context context0 = this.getContext();
            gftb.check(context0);
            view0.setMinimumHeight(context0.getResources().getDimensionPixelSize(0x7F070DF6));  // dimen:pay_list_item_min_height
            view0.findViewById(0x7F0B06FA).setVisibility(0);  // id:RadioButton
            ((RadioButton)view0.findViewById(0x7F0B06FA)).setChecked(this.f == v);  // id:RadioButton
        }
        dxta dxta0 = (dxta)this.a.get(v);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B04CE);  // id:InstrumentNotice
        textView0.setVisibility(8);
        String s = "";
        textView0.setText("");
        view0.setAlpha(1.0f);
        textView0.setTextAppearance(0x7F1605B8);  // style:Pay_Text_Caption.ColorError
        gfsx gfsx0 = dxta0.b;
        if(gfsx0.i()) {
            s = ((gtux)gfsx0.d()).d;
        }
        gfsx gfsx1 = dxta0.a;
        if(gfsx1.i()) {
            gtur gtur0 = (gtur)gfsx1.d();
            String s1 = gtur0.d;
            if(!dxte.e(gtur0)) {
                textView0.setVisibility(0);
                textView0.setTextAppearance(0x7F1605B5);  // style:Pay_Text_Body2.SecondaryTextColor
                Context context1 = this.getContext();
                gftb.check(context1);
                textView0.setText(context1.getString(0x7F152019, new Object[]{this.e}));  // string:pay_payment_instrument_inapplicable_message "Not supported for %1$s."
                view0.setAlpha(0.4f);
            }
            s = s1;
        }
        ((TextView)view0.findViewById(0x7F0B04CD)).setText(s);  // id:InstrumentDescription
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B04CF);  // id:InstrumentOptionLogo
        if(z && this.h) {
            imageView0.setVisibility(8);
            return view0;
        }
        dxta0.b(imageView0);
        return view0;
    }

    @Override  // android.widget.ArrayAdapter
    public final int getCount() {
        return this.a.size();
    }

    @Override  // android.widget.ArrayAdapter
    public final View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        return this.f(v, view0, viewGroup0, false);
    }

    @Override  // android.widget.ArrayAdapter
    public final Object getItem(int v) {
        return this.b(v);
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        return this.f(v, view0, viewGroup0, true);
    }

    @Override  // android.widget.BaseAdapter
    public final boolean isEnabled(int v) {
        return this.b(v).b.i() || dxte.e(((gtur)this.b(v).a.d()));
    }
}

