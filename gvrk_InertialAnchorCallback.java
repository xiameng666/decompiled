import com.google.location.bluemoon.inertialanchor.Pose;

public interface gvrk_InertialAnchorCallback {
    void j_onFilterReInit(long arg1);

    void l_onPoseUpdate(Pose arg1);
}

