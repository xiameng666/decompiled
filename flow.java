import java.util.HashMap;

public final class flow implements kar {
    public final HashMap a;
    public final fmgt b;

    public flow(HashMap hashMap0, fmgt fmgt0) {
        this.a = hashMap0;
        this.b = fmgt0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        String s = (String)object0;
        Object object1 = this.b.b.d();
        this.a.put("A11Y_TEXT", object1);
    }
}

