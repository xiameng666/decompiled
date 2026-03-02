import android.content.Intent;

public final class epxb implements evqf {
    public final epxd a;

    public epxb(epxd epxd0) {
        this.a = epxd0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        epxd.a.h("Successfully stored %d bytes to blockstore.", new Object[]{((Integer)object0)});
        epxd epxd0 = this.a;
        eqme eqme0 = epxd0.c;
        if(eqme0 != null) {
            int v = (int)(((Integer)object0));
            ProtoLiteBuilder hftp0 = eqme0.j;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjoa gjoa0 = (gjoa)hftp0.b_message;
            gjoa0.b |= 2;
            gjoa0.d = v;
            ProtoLiteBuilder hftp1 = eqme0.i;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjob gjob0 = (gjob)hftp1.b_message;
            gjoa gjoa1 = (gjoa)hftp0.N_build();
            gjoa1.getClass();
            gjob0.d = gjoa1;
            gjob0.b |= 2;
        }
        eray eray0 = epxd0.d;
        if(eray0 != null) {
            eray0.s(0, ((Integer)object0).intValue());
            for(Object object1: hyis.j().b) {
                Intent intent0 = new Intent("com.google.android.gms.smartdevice.quickstart.BLOCK_STORE_READY");
                intent0.setFlags(0x10000000);
                intent0.setPackage(((String)object1));
                epxd0.b.sendBroadcast(intent0);
            }
        }
    }
}

