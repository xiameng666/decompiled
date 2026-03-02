import android.content.Intent;

public final class dvbc implements ibth {
    public final dvbe a;
    public final gtxg b;

    public dvbc(dvbe dvbe0, gtxg gtxg0) {
        this.a = dvbe0;
        this.b = gtxg0;
    }

    @Override  // ibth
    public final Object a() {
        Intent intent0 = dvbe.D(this.b);
        this.a.startActivity(intent0);
        return ibom.a;
    }
}

