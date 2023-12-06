// Generated by view binder compiler. Do not edit!
package com.example.rustmarketfyp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.rustmarketfyp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySellerAddNewProductBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button addNewProduct;

  @NonNull
  public final EditText productCondition;

  @NonNull
  public final EditText productDescription;

  @NonNull
  public final Spinner productLocation;

  @NonNull
  public final EditText productName;

  @NonNull
  public final EditText productPrice;

  @NonNull
  public final ImageView selectProductImage;

  private ActivitySellerAddNewProductBinding(@NonNull RelativeLayout rootView,
      @NonNull Button addNewProduct, @NonNull EditText productCondition,
      @NonNull EditText productDescription, @NonNull Spinner productLocation,
      @NonNull EditText productName, @NonNull EditText productPrice,
      @NonNull ImageView selectProductImage) {
    this.rootView = rootView;
    this.addNewProduct = addNewProduct;
    this.productCondition = productCondition;
    this.productDescription = productDescription;
    this.productLocation = productLocation;
    this.productName = productName;
    this.productPrice = productPrice;
    this.selectProductImage = selectProductImage;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySellerAddNewProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySellerAddNewProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_seller_add_new_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySellerAddNewProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_new_product;
      Button addNewProduct = ViewBindings.findChildViewById(rootView, id);
      if (addNewProduct == null) {
        break missingId;
      }

      id = R.id.product_condition;
      EditText productCondition = ViewBindings.findChildViewById(rootView, id);
      if (productCondition == null) {
        break missingId;
      }

      id = R.id.product_description;
      EditText productDescription = ViewBindings.findChildViewById(rootView, id);
      if (productDescription == null) {
        break missingId;
      }

      id = R.id.product_location;
      Spinner productLocation = ViewBindings.findChildViewById(rootView, id);
      if (productLocation == null) {
        break missingId;
      }

      id = R.id.product_name;
      EditText productName = ViewBindings.findChildViewById(rootView, id);
      if (productName == null) {
        break missingId;
      }

      id = R.id.product_price;
      EditText productPrice = ViewBindings.findChildViewById(rootView, id);
      if (productPrice == null) {
        break missingId;
      }

      id = R.id.select_product_image;
      ImageView selectProductImage = ViewBindings.findChildViewById(rootView, id);
      if (selectProductImage == null) {
        break missingId;
      }

      return new ActivitySellerAddNewProductBinding((RelativeLayout) rootView, addNewProduct,
          productCondition, productDescription, productLocation, productName, productPrice,
          selectProductImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}