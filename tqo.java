import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class tqo extends tgn {
    public static final String k = "tqo";
    public tqy l;
    public byte[] m;

    static {
    }

    private tqo() {
        super(null, null, null, null, null);
    }

    public tqo(tgi tgi0, tqn tqn0, tfx tfx0, tgl tgl0) {
        super(tgi0, tqn0, tfx0, tgl0, new tgl());
    }

    @Override  // tgn
    protected final byte[] c(tgy tgy0) {
        if(tgy0.k()[0] == 0xFFFFFF81) {
            tjk.f("getDataToSign: {}", new Object[]{((byte)(byte)0x81)});
            try {
                tiz.a(this.i, (byte)0x81, new byte[][]{tit.a, til.a, tim.a, tin.a, tip.a, tiq.a, tir.a, tis.a});
                tjk.f("Checking for the mandatory transient application data", new Object[0]);
                tiz.a(this.j, (byte)0x81, new byte[][]{tgp.a, tgr.a, tqr.a});
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                this.i.f().h(byteArrayOutputStream0);
                this.i.g().h(byteArrayOutputStream0);
                this.i.h().h(byteArrayOutputStream0);
                this.i.i().h(byteArrayOutputStream0);
                this.i.j().h(byteArrayOutputStream0);
                this.i.k().h(byteArrayOutputStream0);
                this.i.l().h(byteArrayOutputStream0);
                this.i.m().h(byteArrayOutputStream0);
                this.j.u().h(byteArrayOutputStream0);
                this.j.q().h(byteArrayOutputStream0);
                tjk.f("The transient application data is : {}", new Object[]{this.j});
                byteArrayOutputStream0.write(this.j.x().k());
                byteArrayOutputStream0.write(0x80);
                while(byteArrayOutputStream0.size() % 8 != 0) {
                    byteArrayOutputStream0.write(0);
                }
                return byteArrayOutputStream0.toByteArray();
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
        }
        tjk.f("Getting data to sign for CVN {}", new Object[]{tgy0});
        switch(tgy0.k()[0]) {
            case 10: {
                tjk.f("getDataToSign: {}", new Object[]{((byte)10)});
                try {
                    tiz.a(this.i, 10, new byte[][]{tit.a, til.a, tim.a, tin.a, tip.a, tiq.a, tir.a, tis.a});
                    tjk.f("Checking for the mandatory transient application data", new Object[0]);
                    tiz.a(this.j, 10, new byte[][]{tgp.a, tgr.a});
                    tqr tqr0 = ((tqm)this.b.a()).h();
                    ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                    byteArrayOutputStream1.write(this.i.f().k());
                    byteArrayOutputStream1.write(this.i.g().k());
                    byteArrayOutputStream1.write(this.i.h().k());
                    byteArrayOutputStream1.write(this.i.i().k());
                    byteArrayOutputStream1.write(this.i.j().k());
                    byteArrayOutputStream1.write(this.i.k().k());
                    byteArrayOutputStream1.write(this.i.l().k());
                    byteArrayOutputStream1.write(this.i.m().k());
                    byteArrayOutputStream1.write(tqr0.k());
                    byteArrayOutputStream1.write(this.j.q().k());
                    tjk.f("The transient application data is : {}", new Object[]{this.j});
                    byte[] arr_b = this.j.x().k();
                    byte[] arr_b1 = new byte[4];
                    System.arraycopy(arr_b, 3, arr_b1, 0, 4);
                    byteArrayOutputStream1.write(new tqx(arr_b1).k());
                    while(byteArrayOutputStream1.size() % 8 != 0) {
                        byteArrayOutputStream1.write(0);
                    }
                    return byteArrayOutputStream1.toByteArray();
                }
                catch(IOException iOException1) {
                    throw new RuntimeException(iOException1);
                }
            }
            case 17: {
                tjk.f("getDataToSign: {}", new Object[]{((byte)17)});
                try {
                    tiz.a(this.i, 17, new byte[][]{tit.a, til.a});
                    tjk.f("Checking for the mandatory transient application data", new Object[0]);
                    tiz.a(this.j, 17, new byte[][]{tgp.a, tgr.a});
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    byteArrayOutputStream2.write(this.i.f().k());
                    byteArrayOutputStream2.write(this.i.m().k());
                    byteArrayOutputStream2.write(this.j.q().k());
                    byteArrayOutputStream2.write(((int)this.j.x().k()[4]));
                    while(byteArrayOutputStream2.size() % 8 != 0) {
                        byteArrayOutputStream2.write(0);
                    }
                    return byteArrayOutputStream2.toByteArray();
                }
                catch(IOException iOException2) {
                    throw new RuntimeException(iOException2);
                }
            }
            case 18: {
                tjk.f("getDataToSign: {}", new Object[]{((byte)18)});
                try {
                    tiz.a(this.i, 18, new byte[][]{tit.a, til.a, tim.a, tin.a, tip.a, tiq.a, tir.a, tis.a});
                    tiz.a(this.j, 18, new byte[][]{tgp.a, tgr.a});
                    tge tge0 = this.b.a();
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    byteArrayOutputStream3.write(this.i.f().k());
                    byteArrayOutputStream3.write(this.i.g().k());
                    byteArrayOutputStream3.write(this.i.h().k());
                    byteArrayOutputStream3.write(this.i.i().k());
                    byteArrayOutputStream3.write(this.i.j().k());
                    byteArrayOutputStream3.write(this.i.k().k());
                    byteArrayOutputStream3.write(this.i.l().k());
                    byteArrayOutputStream3.write(this.i.m().k());
                    byteArrayOutputStream3.write(((tqm)tge0).h().k());
                    byteArrayOutputStream3.write(this.j.q().k());
                    byteArrayOutputStream3.write(this.j.x().k());
                    byteArrayOutputStream3.write(0x80);
                    while(byteArrayOutputStream3.size() % 8 != 0) {
                        byteArrayOutputStream3.write(0);
                    }
                    return byteArrayOutputStream3.toByteArray();
                }
                catch(IOException iOException3) {
                    throw new RuntimeException(iOException3);
                }
            }
            case 20: {
                tjk.f("getDataToSign: {}", new Object[]{((byte)20)});
                try {
                    tiz.a(this.i, 20, new byte[][]{tit.a, til.a, tim.a, tin.a, tip.a, tiq.a, tir.a, tis.a});
                    tjk.f("Checking for the mandatory transient application data", new Object[0]);
                    tiz.a(this.j, 20, new byte[][]{tgp.a, tgr.a});
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    this.i.f().h(byteArrayOutputStream4);
                    this.i.g().h(byteArrayOutputStream4);
                    this.i.h().h(byteArrayOutputStream4);
                    this.i.i().h(byteArrayOutputStream4);
                    this.i.j().h(byteArrayOutputStream4);
                    this.i.k().h(byteArrayOutputStream4);
                    this.i.l().h(byteArrayOutputStream4);
                    this.i.m().h(byteArrayOutputStream4);
                    this.j.u().h(byteArrayOutputStream4);
                    this.j.q().h(byteArrayOutputStream4);
                    tjk.f("The transient application data is : {}", new Object[]{this.j});
                    byte[] arr_b2 = this.j.x().k();
                    byte[] arr_b3 = new byte[6];
                    System.arraycopy(arr_b2, 2, arr_b3, 0, 6);
                    byteArrayOutputStream4.write(arr_b3);
                    byteArrayOutputStream4.write(0x80);
                    while(byteArrayOutputStream4.size() % 8 != 0) {
                        byteArrayOutputStream4.write(0);
                    }
                    return byteArrayOutputStream4.toByteArray();
                }
                catch(IOException iOException4) {
                    throw new RuntimeException(iOException4);
                }
            }
            case 21: {
                tjk.f("getDataToSign: {}", new Object[]{((byte)21)});
                try {
                    tiz.a(this.i, 21, new byte[][]{til.a, tiq.a, tit.a});
                    tjk.f("Checking for the mandatory transient application data", new Object[0]);
                    tiz.a(this.j, 17, new byte[][]{tgp.a, tgr.a});
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    byteArrayOutputStream5.write(this.i.f().k());
                    byteArrayOutputStream5.write(this.i.j().k());
                    byteArrayOutputStream5.write(this.i.m().k());
                    byteArrayOutputStream5.write(this.j.q().k());
                    byteArrayOutputStream5.write(this.j.x().k());
                    byteArrayOutputStream5.write(0x80);
                    while(byteArrayOutputStream5.size() % 8 != 0) {
                        byteArrayOutputStream5.write(0);
                    }
                    return byteArrayOutputStream5.toByteArray();
                }
                catch(IOException iOException5) {
                    throw new RuntimeException(iOException5);
                }
            }
            case 22: {
                tjk.f("getDataToSign: {}", new Object[]{((byte)21)});
                try {
                    tiz.a(this.i, 21, new byte[][]{til.a, tiq.a, tit.a});
                    tjk.f("Checking for the mandatory transient application data", new Object[0]);
                    tiz.a(this.j, 17, new byte[][]{tgp.a, tgr.a});
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    byteArrayOutputStream6.write(this.i.f().k());
                    byteArrayOutputStream6.write(this.i.j().k());
                    byteArrayOutputStream6.write(this.i.m().k());
                    byteArrayOutputStream6.write(this.j.q().k());
                    byte[] arr_b4 = this.j.x().k();
                    byte[] arr_b5 = new byte[8];
                    System.arraycopy(arr_b4, 2, arr_b5, 0, 8);
                    byteArrayOutputStream6.write(arr_b5);
                    byteArrayOutputStream6.write(0x80);
                    while(byteArrayOutputStream6.size() % 8 != 0) {
                        byteArrayOutputStream6.write(0);
                    }
                    return byteArrayOutputStream6.toByteArray();
                }
                catch(IOException iOException6) {
                    throw new RuntimeException(iOException6);
                }
            }
            default: {
                throw new teq("Unsupported CVN: " + tgy0.toString(), tes.i);
            }
        }
    }

    @Override  // tgn
    public final byte[] d() {
        tjk.f("getTransactionKeyBytes", new Object[0]);
        tql tql0 = this.e();
        return tql0 == null ? null : tql0.b;
    }

    public final tqv g() {
        return ((trq)this.b.a().d(trq.a)).j();
    }

    public final tra h() {
        trq trq0 = (trq)this.b.a().d(trq.a);
        tqx tqx0 = this.j.w();
        thc thc0 = ((tqm)this.b.a()).g();
        tgy tgy0 = new tgy();
        tqv tqv0 = trq0.j();
        tqw tqw0 = this.j.v();
        tta tta0 = this.i.o();
        ttb ttb0 = this.i.p();
        tsz tsz0 = this.i.n();
        tqz tqz0 = trq0.k();
        this.j.y();
        return new tra(thc0, tgy0, tqx0, tqv0, tqw0, tta0, ttb0, tsz0, tqz0);
    }

    public final trm i() {
        tjk.f("get TUSA", new Object[0]);
        trm trm0 = this.l.B();
        if(trm0 == null) {
            tjk.f("Error 1", new Object[0]);
            return new trm(trm.d);
        }
        return trm0;
    }

    public final void j() {
        tgl tgl0 = this.j;
        tre tre0 = tgl0.y();
        tqw tqw0 = tgl0.v();
        tqx tqx0 = tgl0.w();
        if((this.a instanceof tfv) && ((tfv)this.a).a()) {
            tgg tgg0 = this.b;
            if(!((trq)tgg0.a().d(trq.a)).p()) {
                trm trm0 = this.i();
                tjk.f("reset TUSA", new Object[0]);
                trm0.f(trm.d);
                this.l.c(trm0);
                tgg0.b.a(this.l.C());
            }
            trl trl0 = this.l.A();
            tjk.f("resetting mcu", new Object[0]);
            trl0.o();
            this.l.c(trl0);
            tre0.p(true);
            tqw0.p();
        }
        tgl0.c(tre0);
        tgl0.c(tqw0);
        tgl0.c(tqx0);
    }
}

