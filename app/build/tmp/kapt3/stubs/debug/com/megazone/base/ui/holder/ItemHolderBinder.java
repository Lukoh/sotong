package com.megazone.base.ui.holder;

import java.lang.System;

/**
 * A ItemHolderBinder describes an item view and metadata about its place within the RecyclerView.
 *
 *
 * All ViewHolder extended [BaseViewHolder] implementations should subclass ItemHolderBinder
 * and implements bindItemHolder method to to display the item at the specified position.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J+\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&\u00a8\u0006\r"}, d2 = {"Lcom/megazone/base/ui/holder/ItemHolderBinder;", "T", "", "bindItemHolder", "", "holder", "Lcom/megazone/base/ui/holder/BaseViewHolder;", "item", "position", "", "(Lcom/megazone/base/ui/holder/BaseViewHolder;Ljava/lang/Object;I)V", "onItemClear", "onItemSelected", "app_debug"})
public abstract interface ItemHolderBinder<T extends java.lang.Object> {
    
    /**
     * Called by RecyclerView to display the item at the specified position. This method
     * should update the contents of the item's view to reflect the item at the given position.
     *
     * @param holder A BaseViewHolder describes an item view and metadata about its place within
     * the RecyclerView
     * @param item The ItemHolder which should be updated to represent the contents of the
     * item at the given position in the data set
     * @param position The ItemHolder given position in the data set
     */
    public abstract void bindItemHolder(@org.jetbrains.annotations.NotNull()
    com.megazone.base.ui.holder.BaseViewHolder<T> holder, T item, int position);
    
    /**
     * Called when the [ItemTouchHelper] first registers an item as being moved or swiped.
     * Implementations should update the item view to indicate it's active state.
     */
    public abstract void onItemSelected();
    
    /**
     * Called when the [ItemTouchHelper] has completed the move or swipe, and the active item
     * state should be cleared.
     */
    public abstract void onItemClear();
}