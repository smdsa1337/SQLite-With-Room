package com.smdsa.sqlitewithroom.sql;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'\u00a8\u0006\n"}, d2 = {"Lcom/smdsa/sqlitewithroom/sql/UserDao;", "", "addUser", "", "user", "Lcom/smdsa/sqlitewithroom/sql/User;", "delete", "readAllData", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public abstract interface UserDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addUser(@org.jetbrains.annotations.NotNull()
    com.smdsa.sqlitewithroom.sql.User user);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user_table ORDER BY id ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.smdsa.sqlitewithroom.sql.User>> readAllData();
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.smdsa.sqlitewithroom.sql.User user);
}