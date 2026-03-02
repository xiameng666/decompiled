import com.google.android.gms.wearable.internal.NodeParcelable;

public final class dmda {
    public gfsx a;
    private final dmdc b;

    public dmda(dmdc dmdc0) {
        this.a = gfqx.a;
        this.b = dmdc0;
    }

    public final void a() {
        if(this.a.i()) {
            return;
        }
        dmdc dmdc0 = this.b;
        NodeParcelable nodeParcelable0 = dmdc0.c();
        if(nodeParcelable0 == null) {
            this.a = gfsx.m(ftoz.a);
            return;
        }
        gfsx gfsx0 = dmdc0.a();
        gfsx gfsx1 = dmdc0.b();
        if(gfsx0.i() && gfsx1.i()) {
            ftok ftok0 = (ftok)gfsx1.d();
            if(!(ftok0.b == 5 ? ((ftnc)ftok0.c) : ftnc.c).d.isEmpty()) {
                ftok ftok1 = (ftok)gfsx0.d();
                if((ftok1.b == 68 ? ((ftmz)ftok1.c) : ftmz.a).c) {
                    ftok ftok2 = (ftok)gfsx0.d();
                    if((ftok2.b == 68 ? ((ftmz)ftok2.c) : ftmz.a).b != 4) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftoz.a).v_newBuilder();
                        String s = nodeParcelable0.b;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        s.getClass();
                        ((ftoz)hftv0).b = s;
                        String s1 = nodeParcelable0.a;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ftoz ftoz0 = (ftoz)hftp0.b_message;
                        s1.getClass();
                        ftoz0.c = s1;
                        long v = ((ftok)gfsx0.d()).f;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((ftoz)hftp0.b_message).d = v;
                        String s2 = ((ftok)gfsx0.d()).e;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ftoz ftoz1 = (ftoz)hftp0.b_message;
                        s2.getClass();
                        ftoz1.e = s2;
                        this.a = gfsx.m(((ftoz)hftp0.N_build()));
                        return;
                    }
                }
            }
        }
        this.a = gfsx.m(ftoz.a);
    }

    public final boolean b() {
        this.a();
        return this.a.i() && !((ftoz)this.a.d()).c.isEmpty() && !((ftoz)this.a.d()).b.isEmpty() && !((ftoz)this.a.d()).e.isEmpty() && ((ftoz)this.a.d()).d != 0L;
    }
}

