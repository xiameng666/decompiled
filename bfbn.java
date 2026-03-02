import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class bfbn extends tk {
    public gged_interceptors a;
    public gged_interceptors e;
    private final bfxv f;

    public bfbn(bfxv bfxv0) {
        this.a = ggna.a;
        this.e = ggna.a;
        this.f = bfxv0;
    }

    private final boolean G(int v) {
        return !this.a.isEmpty() && v <= this.a.size();
    }

    @Override  // tk
    public final int b() {
        int v = this.f();
        return this.e.size() + this.a.size() + v;
    }

    @Override  // tk
    public final int dx(int v) {
        if(v != 0) {
            int v1 = this.f();
            if(v != this.a.size() + v1 - 1) {
                return ((ggna)this.n(v).c).c <= 1 ? 1 : 2;
            }
        }
        return 0;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        switch(v) {
            case 0: {
                return new bfbm(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0888, viewGroup0, false));  // layout:pwm_picker_list_header_item
            }
            case 1: {
                return new bfbi(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0881, viewGroup0, false));  // layout:pwm_password_list_item
            }
            case 2: {
                return new bfbk(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0883, viewGroup0, false));  // layout:pwm_password_list_item_with_secondary_text
            }
            default: {
                throw new IllegalArgumentException("Unknown viewType " + v);
            }
        }
    }

    private final int f() {
        return (this.e.isEmpty() ^ 1) + (this.a.isEmpty() ^ 1);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        if((uq0 instanceof bfbm)) {
            if(!this.a.isEmpty() && v == 0) {
                ((bfbm)uq0).t.setText(0x7F152774);  // string:pwm_picker_suggested_passwords_header "Suggested"
                return;
            }
            ((bfbm)uq0).t.setText(0x7F152771);  // string:pwm_picker_all_passwords_header "All passwords"
            return;
        }
        if(!(uq0 instanceof bfbl)) {
            throw new ClassCastException("Unknown viewHolder type.");
        }
        ((bfbl)uq0).D(this.n(v), Boolean.valueOf(this.G(v)), this.f);
    }

    private final gqlt n(int v) {
        return this.G(v) ? ((gqlt)this.a.get(v - 1)) : ((gqlt)this.e.get(v - this.a.size() - this.f()));
    }
}

