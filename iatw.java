import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Logger;

public abstract class iatw implements ibfo {
    public static final Logger t;

    static {
        iatw.t = Logger.getLogger(iatw.class.getName());
    }

    @Override  // ibfo
    public final void d() {
        if(!this.v().i) {
            ibca ibca0 = this.v();
            if(ibca0.b != null && ibca0.b.a() > 0) {
                ibca0.b(false, true);
            }
        }
    }

    @Override  // ibfo
    public final void f() {
        iatv iatv0 = this.q();
        iatv0.m.a = iatv0;
        iatv0.j = iatv0.m;
    }

    @Override  // ibfo
    public final void g(int v) {
        iatv iatv0 = this.q();
        iatv0.e(new iatu(iatv0, v));
    }

    @Override  // ibfo
    public final void h(ialh ialh0) {
        ibca ibca0 = this.v();
        gftb.z(ialh0, "compressor");
        ibca0.d = ialh0;
    }

    @Override  // ibfo
    public final void n(InputStream inputStream0) {
        int v3;
        int v1;
        try {
            if(!this.v().i) {
                ibca ibca0 = this.v();
                if(ibca0.i) {
                    throw new IllegalStateException("Framer already closed");
                }
                try {
                    ++ibca0.j;
                    ++ibca0.k;
                    ibca0.l = 0L;
                    ialh ialh0 = ibca0.d;
                    v1 = inputStream0.available();
                    if(v1 != 0 && ialh0 != ialf.a) {
                        ibbx ibbx0 = new ibbx(ibca0);
                        OutputStream outputStream0 = ibca0.d.b(ibbx0);
                        try {
                            v3 = ibca.a(inputStream0, outputStream0);
                        }
                        finally {
                            outputStream0.close();
                        }
                        if(ibca0.a >= 0 && v3 > ibca0.a) {
                            throw new iapn(iapk.k.f(String.format(Locale.US, "message too large %d > %d", v3, ((int)ibca0.a))));
                        }
                        ibca0.c(ibbx0, true);
                    }
                    else if(v1 == -1) {
                        ibbx ibbx1 = new ibbx(ibca0);
                        v3 = ibca.a(inputStream0, ibbx1);
                        ibca0.c(ibbx1, false);
                    }
                    else {
                        ibca0.l = (long)v1;
                        if(ibca0.a >= 0 && v1 > ibca0.a) {
                            throw new iapn(iapk.k.f(String.format(Locale.US, "message too large %d > %d", v1, ((int)ibca0.a))));
                        }
                        ibca0.f.clear();
                        ibca0.f.put(0).putInt(v1);
                        ibca0.c = v1 + 5;
                        ibca0.d(ibca0.f.array(), 0, ibca0.f.position());
                        v3 = ibca.a(inputStream0, ibca0.e);
                    }
                }
                catch(IOException iOException0) {
                    throw new iapn(iapk.p.f("Failed to frame message").e(iOException0));
                }
                catch(iapn iapn0) {
                    throw iapn0;
                }
                catch(RuntimeException runtimeException0) {
                    throw new iapn(iapk.p.f("Failed to frame message").e(runtimeException0));
                }
                if(v1 != -1 && v3 != v1) {
                    throw new iapn(iapk.p.f(String.format("Message length inaccurate %s != %s", v3, v1)));
                }
                ibca0.h.c(ibca0.l);
            }
        }
        finally {
            iayh.h(inputStream0);
        }
    }

    @Override  // ibfo
    public boolean o() {
        throw null;
    }

    protected abstract iatv q();

    protected abstract ibca v();

    public final void w(int v) {
        iatv iatv0 = this.q();
        synchronized(iatv0.k) {
            iatv0.n += v;
        }
    }
}

