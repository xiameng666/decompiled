import android.widget.Toast;

public final class eqpt implements evqc {
    public final eqqd a;

    public eqpt(eqqd eqqd0) {
        this.a = eqqd0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        eqqd.a.g("Failed to enable target mode.", exception0, new Object[0]);
        if((exception0 instanceof aztb)) {
            int v = ((aztb)exception0).b();
            this.a.aj.b.add(Integer.valueOf(v));
            xnz xnz0 = (xnz)this.a.getContext();
            if(xnz0 != null && v != 10551) {
                Toast.makeText(xnz0, 0x7F1508E3, 1).show();  // string:common_something_went_wrong "Something went wrong"
                xnz0.finish();
            }
        }
    }
}

