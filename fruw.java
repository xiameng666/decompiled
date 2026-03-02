import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;

public interface fruw {
    void dismissAllowingStateLoss();

    Activity getActivity();

    Bundle getArguments();

    Dialog getDialog();

    boolean getShowsDialog();
}

