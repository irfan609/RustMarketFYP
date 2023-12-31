// Generated by view binder compiler. Do not edit!
package com.example.rustmarketfyp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class CartItemsLayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView cartProductName;

  @NonNull
  public final TextView cartProductPrice;

  @NonNull
  public final TextView cartProductQuantity;

  private CartItemsLayoutBinding(@NonNull CardView rootView, @NonNull TextView cartProductName,
      @NonNull TextView cartProductPrice, @NonNull TextView cartProductQuantity) {
    this.rootView = rootView;
    this.cartProductName = cartProductName;
    this.cartProductPrice = cartProductPrice;
    this.cartProductQuantity = cartProductQuantity;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CartItemsLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CartItemsLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cart_items_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CartItemsLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cart_product_name;
      TextView cartProductName = ViewBindings.findChildViewById(rootView, id);
      if (cartProductName == null) {
        break missingId;
      }

      id = R.id.cart_product_price;
      TextView cartProductPrice = ViewBindings.findChildViewById(rootView, id);
      if (cartProductPrice == null) {
        break missingId;
      }

      id = R.id.cart_product_quantity;
      TextView cartProductQuantity = ViewBindings.findChildViewById(rootView, id);
      if (cartProductQuantity == null) {
        break missingId;
      }

      return new CartItemsLayoutBinding((CardView) rootView, cartProductName, cartProductPrice,
          cartProductQuantity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
