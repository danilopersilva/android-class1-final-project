package com.github.cesar1287.class1dhfinalproject.modeldb

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "genre")
@Parcelize
data class GenreDb(
    @PrimaryKey
    @ColumnInfo(name = "genreId")
    val id: Int,
    val name: String,
    val xpto: String?
): Parcelable