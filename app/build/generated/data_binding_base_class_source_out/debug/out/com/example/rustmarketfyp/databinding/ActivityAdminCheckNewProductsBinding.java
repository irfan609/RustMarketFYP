// Generated by view binder compiler. Do not edit!
package com.example.rustmarketfyp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.rustmarketfyp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminCheckNewProductsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView adminProductsChecklist;

  @NonNull
  public final RelativeLayout r3;

  private ActivityAdminCheckNewProductsBinding(@NonNull RelativeLayout rootView,
      @NonNull RecyclerView adminProductsChecklist, @NonNull RelativeLayout r3) {
    this.rootView = rootView;
    this.adminProductsChecklist = adminProductsChecklist;
    this.r3 = r3;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminCheckNewProductsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminCheckNewProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_admin_check_new_products, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminCheckNewProductsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.admin_products_checklist;
      RecyclerView adminProductsChecklist = ViewBindings.findChildViewById(rootView, id);
      if (adminProductsChecklist == null) {
        break missingId;
      }

      id = R.id.r3;
      RelativeLayout r3 = ViewBindings.findChildViewById(rootView, id);
      if (r3 == null) {
        break missingId;
      }

      return new ActivityAdminCheckNewProductsBinding((RelativeLayout) rootView,
          adminProductsChecklist, r3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
