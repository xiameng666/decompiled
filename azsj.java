import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

public final class azsj extends tk {
    public final bxji a;
    public List e;
    private final int f;
    private final int g;
    private fngs h;

    public azsj(bxji bxji0, int v, int v1) {
        this.a = bxji0;
        this.f = v;
        this.g = v1;
    }

    @Override  // tk
    public final int b() {
        return this.e == null ? 0 : this.e.size();
    }

    @Override  // tk
    public final int dx(int v) {
        List list0 = this.e;
        batl.s(list0);
        return ((bxiy)list0.get(v)).a;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        Context context0 = viewGroup0.getContext();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        azsd azsd0 = new azsd();
        this.h = new fngs(context0, bblp0, azsd0, azsd0);
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 1: {
                return new azsg(layoutInflater0.inflate(0x7F0E01F3, viewGroup0, false));  // layout:common_account_account_picker_header_row
            }
            case 2: {
                return new azse(layoutInflater0.inflate(0x7F0E01F6, viewGroup0, false));  // layout:common_account_add_account_chip_view
            }
            case 3: {
                return new azsh(layoutInflater0.inflate(this.f, viewGroup0, false));
            }
            case 4: {
                return new azsi(layoutInflater0.inflate(this.g, viewGroup0, false), this.h);
            }
            default: {
                return new azsc(layoutInflater0.inflate(0x7F0E01FB, viewGroup0, false), this.h);  // layout:common_account_chip_account_with_disc_row
            }
        }
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        if(this.e != null && v < this.e.size()) {
            bxiy bxiy0 = (bxiy)this.e.get(v);
            switch(bxiy0.a) {
                case 0: {
                    ((azsc)uq0).t.setText(bxiy0.d);
                    if(hyex.e()) {
                        if(bxiy0.f) {
                            ((azsc)uq0).u.setText(bxiy0.c);
                            ((azsc)uq0).u.setVisibility(0);
                        }
                        else {
                            ((azsc)uq0).u.setVisibility(8);
                        }
                        ((azsc)uq0).v.l(bxiy0);
                        azsb azsb0 = new azsb(this, bxiy0);
                        ((azsc)uq0).w.setOnClickListener(azsb0);
                        return;
                    }
                    ((azsc)uq0).u.setText(bxiy0.c);
                    return;
                }
                case 1: {
                    ((azsg)uq0).t.setText(bxiy0.c);
                    return;
                }
                case 2: {
                    azrz azrz0 = new azrz(this, bxiy0);
                    ((azse)uq0).t.setOnClickListener(azrz0);
                    return;
                }
                case 3: {
                    azsa azsa0 = new azsa(this, bxiy0);
                    ((azsh)uq0).t.setOnClickListener(azsa0);
                    return;
                }
                default: {
                    if(!hyex.e()) {
                        ((azsi)uq0).u.setText(bxiy0.c);
                    }
                    else if(bxiy0.f) {
                        ((azsi)uq0).u.setText(bxiy0.c);
                        ((azsi)uq0).u.setVisibility(0);
                    }
                    else {
                        ((azsi)uq0).u.setVisibility(8);
                    }
                    ((azsi)uq0).t.setText(bxiy0.d);
                    ((azsi)uq0).v.l(bxiy0);
                    ((azsi)uq0).w.setClickable(false);
                }
            }
        }
    }
}

