import com.google.android.gms.mdm.settings.DropdownMenuPreference;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class cqnl implements Consumer {
    public final cqnv a;

    public cqnl(cqnv cqnv0) {
        this.a = cqnv0;
    }

    @Override
    public final void accept(Object object0) {
        cqnv cqnv0 = this.a;
        DropdownMenuPreference dropdownMenuPreference0 = cqnv0.ag;
        elhr elhr0 = elhr.b(((elhs)object0).c);
        if(elhr0 == null) {
            elhr0 = elhr.l;
        }
        dropdownMenuPreference0.l(elhr0);
        cqnv0.d.l(((elhs)object0).d);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

