// Generated by view binder compiler. Do not edit!
package com.example.rustmarketfyp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.rustmarketfyp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SellerItemViewBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView productSellerDescription;

  @NonNull
  public final ImageView productSellerImage;

  @NonNull
  public final TextView productSellerPrice;

  @NonNull
  public final TextView sellerProductName;

  @NonNull
  public final TextView sellerProductState;

  private SellerItemViewBinding(@NonNull CardView rootView,
      @NonNull TextView productSellerDescription, @NonNull ImageView productSellerImage,
      @NonNull TextView productSellerPrice, @NonNull TextView sellerProductName,
      @NonNull TextView sellerProductState) {
    this.rootView = rootView;
    this.productSellerDescription = productSellerDescription;
    this.productSellerImage = productSellerImage;
    this.productSellerPrice = productSellerPrice;
    this.sellerProductName = sellerProductName;
    this.sellerProductState = sellerProductState;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static SellerItemViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SellerItemViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.seller_item_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SellerItemViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.product_seller_description;
      TextView productSellerDescription = ViewBindings.findChildViewById(rootView, id);
      if (productSellerDescription == null) {
        break missingId;
      }

      id = R.id.product_seller_image;
      ImageView productSellerImage = ViewBindings.findChildViewById(rootView, id);
      if (productSellerImage == null) {
        break missingId;
      }

      id = R.id.product_seller_price;
      TextView productSellerPrice = ViewBindings.findChildViewById(rootView, id);
      if (productSellerPrice == null) {
        break missingId;
      }

      id = R.id.seller_product_name;
      TextView sellerProductName = ViewBindings.findChildViewById(rootView, id);
      if (sellerProductName == null) {
        break missingId;
      }

      id = R.id.seller_product_state;
      TextView sellerProductState = ViewBindings.findChildViewById(rootView, id);
      if (sellerProductState == null) {
        break missingId;
      }

      return new SellerItemViewBinding((CardView) rootView, productSellerDescription,
          productSellerImage, productSellerPrice, sellerProductName, sellerProductState);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
