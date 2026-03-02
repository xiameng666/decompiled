import android.widget.Toast;

public final class bdfw implements ibts {
    public final bdho a;

    public bdfw(bdho bdho0) {
        this.a = bdho0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibom ibom0 = (ibom)object0;
        Toast.makeText(this.a.requireContext(), 0x7F1508E3, 1).show();  // string:common_something_went_wrong "Something went wrong"
        return ibom.a;
    }
}

