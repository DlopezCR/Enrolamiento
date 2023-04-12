// Generated by view binder compiler. Do not edit!
package com.latinid.mercedes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.latinid.mercedes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLivenessViewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final FrameLayout livenessComponentImp;

  @NonNull
  public final TextView tvFeedback;

  private FragmentLivenessViewBinding(@NonNull LinearLayout rootView,
      @NonNull FrameLayout livenessComponentImp, @NonNull TextView tvFeedback) {
    this.rootView = rootView;
    this.livenessComponentImp = livenessComponentImp;
    this.tvFeedback = tvFeedback;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLivenessViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLivenessViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_liveness_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLivenessViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.liveness_component_imp;
      FrameLayout livenessComponentImp = ViewBindings.findChildViewById(rootView, id);
      if (livenessComponentImp == null) {
        break missingId;
      }

      id = R.id.tv_feedback;
      TextView tvFeedback = ViewBindings.findChildViewById(rootView, id);
      if (tvFeedback == null) {
        break missingId;
      }

      return new FragmentLivenessViewBinding((LinearLayout) rootView, livenessComponentImp,
          tvFeedback);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
