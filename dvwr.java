import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;

public final class dvwr implements View.OnClickListener {
    public final dvxj a;
    public final Context b;

    public dvwr(dvxj dvxj0, Context context0) {
        this.a = dvxj0;
        this.b = context0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dsio dsio0 = this.a.ap;
        dsik dsik0 = new dsik("share_education_dialog");
        dvwu dvwu0 = new dvwu(this.a);
        dsio0.c(this.b, dsik0, dvwu0);
    }
}

