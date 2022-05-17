package com.smdsa.sqlitewithroom.sql

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser(user: User)

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData() : LiveData<List<User>>

    @Delete
    fun delete(user: User)

}