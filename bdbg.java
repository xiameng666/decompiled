import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class bdbg extends tk {
    public gqlt a;
    public final bdbc e;
    public final bdbc f;
    public final bdbc g;
    public final bfqt h;
    private final du i;
    private final betj j;

    public bdbg(du du0, bdbc bdbc0, bdbc bdbc1, bdbc bdbc2, bfqt bfqt0) {
        this.i = du0;
        this.e = bdbc0;
        this.f = bdbc1;
        this.g = bdbc2;
        this.h = bfqt0;
        this.j = (betj)new lso(((xob)du0.getContext())).a(betj.class);
    }

    @Override  // tk
    public final int b() {
        return this.a == null ? 0 : ((ggna)this.a.c).c;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new bdbf(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0887, viewGroup0, false));  // layout:pwm_picker_credential_group
    }

    // Detected as a lambda impl.
    public final void f(gqmd gqmd0, int v) {
        if(((xob)this.i.getContext()).getIntent().getBooleanExtra("pwm.DataFieldNames.startForTwoFields", false)) {
            this.n(3, gqmd0);
            return;
        }
        this.n(v, gqmd0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        gftb.check(this.a);
        gqmd gqmd0 = (gqmd)this.a.c.get(v);
        boolean z = false;
        if(((xob)this.i.getContext()).getIntent().getBooleanExtra("pwm.DataFieldNames.startForTwoFields", false) && this.b() == 1) {
            this.n(3, gqmd0);
            return;
        }
        if(this.b() == 1) {
            z = true;
        }
        ((bdbf)uq0).D(gqmd0, v == 0, z, this.a.b.c);
        bdaw bdaw0 = new bdaw(this, gqmd0);
        ((bdbf)uq0).t.setOnClickListener(bdaw0);
        bdax bdax0 = new bdax(this, gqmd0);
        ((bdbf)uq0).y.setOnClickListener(bdax0);
        bday bday0 = (/* MISSING LAMBDA PARAMETER */) -> {
            if(((xob)this.i.getContext()).getIntent().getBooleanExtra("pwm.DataFieldNames.startForTwoFields", false)) {
                this.n(3, gqmd0);
                return;
            }
            this.n(2, gqmd0);
        };
        ((bdbf)uq0).u.setOnClickListener(bday0);
        bdaz bdaz0 = new bdaz(this, gqmd0);
        ((bdbf)uq0).z.setOnClickListener(bdaz0);
        bdba bdba0 = new bdba(this, ((bdbf)uq0));
        ((bdbf)uq0).A.setOnClickListener(bdba0);
        bdbb bdbb0 = new bdbb(this, gqmd0);
        ((bdbf)uq0).x.setOnClickListener(bdbb0);
        if(v == 0) {
            this.j.a(gqsm.OP);
        }
    }

    private final void n(int v, gqmd gqmd0) {
        Intent intent0 = new Intent();
        switch(v - 1) {
            case 0: {
                intent0.putExtra("pwm.DataFieldNames.pickerUsername", gqmd0.k());
                this.j.a(gqsm.OQ);
                break;
            }
            case 1: {
                if(((bedg)gqmd0.j()).b.i()) {
                    intent0.putExtra("pwm.DataFieldNames.pickerPassword", ((grdf)((bedg)gqmd0.j()).b.d()).a);
                    this.j.a(gqsm.OR);
                }
                break;
            }
            default: {
                intent0.putExtra("pwm.DataFieldNames.pickerUsername", gqmd0.k());
                if(((bedg)gqmd0.j()).b.i()) {
                    intent0.putExtra("pwm.DataFieldNames.pickerPassword", ((grdf)((bedg)gqmd0.j()).b.d()).a);
                }
                this.j.a(gqsm.OS);
            }
        }
        this.j.a.b.a.a(bbdg.ak);
        ArrayList arrayList0 = new ArrayList();
        ggqj ggqj0 = gqmd0.d().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            arrayList0.add(((hhyf)object0).c);
        }
        intent0.putExtra("pwm.DataFieldNames.pickerCredentialDomains", arrayList0);
        xob xob0 = (xob)this.i.getContext();
        xob0.setResult(-1, intent0);
        xob0.finish();
    }
}

