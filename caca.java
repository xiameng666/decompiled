import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class caca extends cacb {
    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        this.d.r(0x7F1508F2, new caby(this));  // string:common_try_again "Try again"
        Intent intent0 = (Intent)this.getArguments().getParcelable("browserIntent");
        boolean z = bzve.c(this.getContext(), intent0);
        this.d.q((z ? 0x7F151B14 : 0x7F1507F2), new cabz(this, z, intent0));  // string:open_in_web_button "Open in web"
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E097B, viewGroup0, false);  // layout:setup_failure_fragment
        TextView textView0 = (TextView)view0.findViewById(0x7F0B10E6);  // id:description
        String s = cabc.a("https://support.google.com/googleplay/?p=instant_apps", "Learn more");
        textView0.setText(Html.fromHtml(this.getResources().getString(0x7F152A72, new Object[]{s})));  // string:setup_failure_description "Can\'t set up Instant Apps. %1$s"
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
        return view0;
    }
}

