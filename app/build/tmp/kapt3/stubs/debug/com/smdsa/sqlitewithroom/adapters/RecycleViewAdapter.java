package com.smdsa.sqlitewithroom.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/smdsa/sqlitewithroom/adapters/RecycleViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/smdsa/sqlitewithroom/adapters/RecycleViewAdapter$VH;", "()V", "arrayList", "", "Lcom/smdsa/sqlitewithroom/sql/User;", "mListener", "Lcom/smdsa/sqlitewithroom/adapters/RecycleViewAdapter$OnRecycleViewListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "data", "setOnRecycleViewClick", "listener", "OnRecycleViewListener", "VH", "app_debug"})
public final class RecycleViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.smdsa.sqlitewithroom.adapters.RecycleViewAdapter.VH> {
    private java.util.List<com.smdsa.sqlitewithroom.sql.User> arrayList;
    private com.smdsa.sqlitewithroom.adapters.RecycleViewAdapter.OnRecycleViewListener mListener;
    
    public RecycleViewAdapter() {
        super();
    }
    
    public final void setOnRecycleViewClick(@org.jetbrains.annotations.NotNull()
    com.smdsa.sqlitewithroom.adapters.RecycleViewAdapter.OnRecycleViewListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.smdsa.sqlitewithroom.adapters.RecycleViewAdapter.VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.smdsa.sqlitewithroom.adapters.RecycleViewAdapter.VH holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.smdsa.sqlitewithroom.sql.User> data) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/smdsa/sqlitewithroom/adapters/RecycleViewAdapter$OnRecycleViewListener;", "", "onRecycleViewClick", "", "position", "", "app_debug"})
    public static abstract interface OnRecycleViewListener {
        
        public abstract void onRecycleViewClick(int position);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/smdsa/sqlitewithroom/adapters/RecycleViewAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "listener", "Lcom/smdsa/sqlitewithroom/adapters/RecycleViewAdapter$OnRecycleViewListener;", "(Landroid/view/View;Lcom/smdsa/sqlitewithroom/adapters/RecycleViewAdapter$OnRecycleViewListener;)V", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;", "setText", "(Landroid/widget/TextView;)V", "app_debug"})
    public static final class VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView text;
        
        public VH(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.smdsa.sqlitewithroom.adapters.RecycleViewAdapter.OnRecycleViewListener listener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getText() {
            return null;
        }
        
        public final void setText(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}